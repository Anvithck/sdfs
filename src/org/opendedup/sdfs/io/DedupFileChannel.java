/*******************************************************************************
 * Copyright (C) 2016 Sam Silverberg sam.silverberg@gmail.com	
 *
 * This file is part of OpenDedupe SDFS.
 *
 * OpenDedupe SDFS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * OpenDedupe SDFS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package org.opendedup.sdfs.io;

import java.io.IOException;

import java.nio.ByteBuffer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.opendedup.buse.sdfsdev.BlockDeviceSmallWriteEvent;
import org.opendedup.collections.DataArchivedException;
import org.opendedup.logging.SDFSLogger;
import org.opendedup.mtools.RestoreArchive;
import org.opendedup.sdfs.Main;
import org.opendedup.sdfs.notification.SDFSEvent;
import org.opendedup.util.RandomGUID;

import com.google.common.eventbus.EventBus;

/**
 * 
 * @author annesam This is class that is used as an IO interface between the
 *         user based file system, such as Fuse, and the Dedup engine. The dedup
 *         engine is comprised of the SDFS client and the chunk store service.
 *         The DedupFileChannel is loosely based off of the java FileChannel
 *         class.
 */
public class DedupFileChannel {
	// The dedup file associated with this file channel
	private SparseDedupFile df;
	// The MetaDataDedupFile associated with this file channel.

	private boolean writtenTo = false;
	private long dups;
	private long currentPosition = 0;
	// private String GUID = UUID.randomUUID().toString();
	private ReentrantLock closeLock = new ReentrantLock();
	private boolean closed = false;
	private boolean readAheadInitiated = false;
	private int flags = -1;
	EventBus eventBus = new EventBus();
	private String id = RandomGUID.getGuid();
	private static int READHEAD_TRIGGER_SIZE=30*1024*1024;

	/**
	 * Instantiates the DedupFileChannel
	 * 
	 * @param file
	 *            the MetaDataDedupFile that the filechannel will be opened for
	 * @throws IOException
	 */

	protected DedupFileChannel(SparseDedupFile file, int flags)
			throws IOException {
		df = file;
		this.flags = flags;
		SparseDedupFile sdf = (SparseDedupFile) df;
		eventBus.register(sdf.bdb);
		if (Main.checkArchiveOnOpen) {
			this.recoverArchives();
		}
		
		if (SDFSLogger.isDebug())
			SDFSLogger.getLog().debug(
					"Initializing Cache " + df.getMetaFile().getPath());
	}

	private void recoverArchives() throws IOException {
		RestoreArchive ar = new RestoreArchive(df.getMetaFile());
		Thread th = new Thread(ar);
		th.start();
		while (!ar.fEvt.isDone()) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				throw new IOException(e);
			}
		}
		if (ar.fEvt.level != SDFSEvent.INFO) {
			throw new IOException("unable to restore all archived data for "
					+ df.getMetaFile().getPath());
		}
	}

	public boolean isClosed() {
		this.closeLock.lock();
		try {
			return this.closed;
		} catch (Exception e) {
			return this.closed;
		} finally {
			this.closeLock.unlock();
		}
	}

	public String getID() {
		return id;
	}

	/**
	 * Truncate or grow the file
	 * 
	 * @param siz
	 *            the size of the file channel
	 * @exception IOException
	 * @throws ReadOnlyException
	 */

	public synchronized void truncateFile(long siz) throws IOException,
			ReadOnlyException {
		if (!df.mf.canWrite())
			throw new ReadOnlyException();

		Lock l = df.getWriteLock();
		l.lock();
		try {
			if (SDFSLogger.isDebug())
				SDFSLogger.getLog().debug("Truncating File");
			if (siz < df.getMetaFile().length()) {
				df.truncate(siz);
				/*
				 * WritableCacheBuffer writeBuffer = df.getWriteBuffer(siz); int
				 * endPos = (int) (siz - writeBuffer.getFilePosition());
				 * DedupChunk nextDk = df.getHash(writeBuffer.getEndPosition() +
				 * 1, false); while (nextDk != null) {
				 * SDFSLogger.getLog().debug("Removing chunk at position " +
				 * nextDk.getFilePosition());
				 * df.removeHash(nextDk.getFilePosition()); nextDk =
				 * df.getHash(nextDk.getFilePosition() + nextDk.getLength() + 1,
				 * true); } writeBuffer.truncate(endPos); //
				 * df.writeCache(writeBuffer,true);
				 */

			}
			df.getMetaFile().setLastModified(System.currentTimeMillis());
			df.getMetaFile().setLength(siz, true);
		} finally {
			l.unlock();
		}
	}

	/**
	 * 
	 * @return the number of duplicates found while this file channel is open.
	 */
	public long getDups() {
		return dups;
	}

	/**
	 * 
	 * @return the current position the file is reading or writing from
	 */
	public long position() {
		return this.currentPosition;
	}

	/**
	 * 
	 * @param pos
	 *            sets the current position of the file
	 */
	public void position(long pos) {
		this.currentPosition = pos;
	}

	/**
	 * 
	 * @return the current size of the file
	 */
	public long size() {
		return df.getMetaFile().length();
	}
	
	public boolean isWrittenTo(){
		return this.writtenTo;
	}

	/**
	 * 
	 * @return the path of the file
	 */
	public String getPath() {
		return df.getMetaFile().getPath();
	}

	/**
	 * 
	 * @return the path of the file
	 */
	public String getName() {
		return df.getMetaFile().getPath();
	}

	/**
	 * 
	 * @return the MetaDataDedupFile associated with this DedupFileChannel
	 */
	public MetaDataDedupFile getFile() {
		return df.getMetaFile();
	}

	/**
	 * Forces data to be synced to disk
	 * 
	 * @param metaData
	 *            true will sync data
	 * @throws IOException
	 * @throws FileClosedException
	 * @throws ReadOnlyException
	 */
	public void force(boolean metaData) throws IOException,
			FileClosedException, ReadOnlyException {
		Lock l = df.getWriteLock();
		l.lock();
		try {
			df.sync(false);
			if(metaData)
				df.mf.sync();
		} catch (FileClosedException e) {
			if (Main.safeClose)
				SDFSLogger.getLog().warn(
						df.getMetaFile().getPath()
								+ " is closed but still writing");
			this.closeLock.lock();
			try {
				df.registerChannel(this);
				this.closed = false;
				this.force(metaData);
			} finally {
				this.closeLock.unlock();

			}
		} finally {
			l.unlock();
		}
		if (df.getMetaFile().getDev() != null)
			df.getMetaFile().sync();
	}
	/**
	 * writes data to the DedupFile
	 * 
	 * @param bbuf
	 *            the bytes to write
	 * @param len
	 *            the length of data to write
	 * @param pos
	 *            the position within the file to write the data to
	 * @param offset
	 *            the offset within the bbuf to start the write from
	 * @throws java.io.IOException
	 * @throws DataArchivedException
	 * @throws ReadOnlyException
	 */
	public void writeFile(ByteBuffer buf, int len, int pos, long offset,
			boolean propigate) throws java.io.IOException,
			DataArchivedException, ReadOnlyException {
		if (!df.mf.canWrite())
			throw new ReadOnlyException();
		if (SDFSLogger.isDebug()) {
			SDFSLogger.getLog().debug(
					"fc writing " + df.getMetaFile().getPath() + " spos="
							+ offset + " buffcap=" + buf.capacity() + " len="
							+ len + " bcpos=" + pos);
			if (df.getMetaFile().getPath().endsWith(".vmx")
					|| df.getMetaFile().getPath().endsWith(".vmx~")) {
				byte[] _zb = new byte[len];
				buf.get(_zb);

				SDFSLogger.getLog().debug(
						"###### In fc Text of VMX="
								+ df.getMetaFile().getPath() + "="
								+ new String(_zb, "UTF-8"));
			}
		}
		Lock l = df.getReadLock();
		l.lock();
		try {

			buf.position(pos);
			this.writtenTo = true;
			long _cp = offset;
			// ByteBuffer buf = ByteBuffer.wrap(bbuf, pos, len);
			int bytesLeft = len;
			int write = 0;
			while (bytesLeft > 0) {
				// Check to see if we need a new Write buffer
				// WritableCacheBuffer writeBuffer = df.getWriteBuffer(_cp);
				// Find out where to write to in the buffer
				DedupChunkInterface writeBuffer = null;
				long filePos = df.getChuckPosition(_cp);
				int startPos = (int) (_cp - filePos);
				if (startPos < 0)
					SDFSLogger.getLog().fatal("Error " + _cp + " " + filePos);
				// Find out how many total bytes there are left to write in
				// this
				// loop

				int _len = Main.CHUNK_LENGTH - startPos;
				if (bytesLeft < _len)
					_len = bytesLeft;
				/*
				 * if (_len == Main.CHUNK_LENGTH) newBuf = true;
				 */

				byte[] b = new byte[_len];
				try {
					buf.get(b);
				} catch (java.nio.BufferUnderflowException e) {
					buf.get(b, 0, buf.capacity() - buf.position());
					SDFSLogger.getLog().error(
							"buffer underflow getting "
									+ (buf.capacity() - buf.position())
									+ " instead of " + _len);
				}
				while (writeBuffer == null) {
					try {
						writeBuffer = df.getWriteBuffer(filePos);
						writeBuffer.write(b, startPos);

						if (_len != Main.CHUNK_LENGTH && propigate
								&& df.getMetaFile().getDev() != null) {
							eventBus.post(new BlockDeviceSmallWriteEvent(df
									.getMetaFile().getDev(),
									ByteBuffer.wrap(b), filePos + startPos,
									_len));
						}
						/*
						if (Main.volume.isClustered())
							writeBuffer.flush();
						*/
					} catch (BufferClosedException e) {
						if (SDFSLogger.isDebug())
							SDFSLogger.getLog().debug("trying to write again");
						writeBuffer = null;
					}
				}
				_cp = _cp + _len;
				bytesLeft = bytesLeft - _len;
				write = write + _len;
				this.currentPosition = _cp;
				if (_cp > df.getMetaFile().length()) {
					df.getMetaFile().setLength(_cp, false);
				}

			}
		} catch (DataArchivedException e) {
			if (Main.checkArchiveOnRead) {
				SDFSLogger
						.getLog()
						.warn("Archived data found in "
								+ df.getMetaFile().getPath()
								+ " at "
								+ pos
								+ ". Recovering data from archive. This may take up to 4 hours for " +e.getPos(),e);
				this.recoverArchives();
				this.writeFile(buf, len, pos, offset, propigate);
			} else
				throw e;
		} catch (FileClosedException e) {
			if (Main.safeClose)
				SDFSLogger.getLog().warn(
						df.getMetaFile().getPath()
								+ " is closed but still writing");
			this.closeLock.lock();
			try {
				df.registerChannel(this);
				this.closed = false;
				this.writeFile(buf, len, pos, offset, propigate);
			} finally {
				this.closeLock.unlock();
			}
		} catch (Exception e) {
			SDFSLogger.getLog().fatal(
					"error while writing to " + this.df.getMetaFile().getPath()
							+ " " + e.toString(), e);
			Main.volume.addWriteError();
			throw new IOException("error while writing to "
					+ this.df.getMetaFile().getPath() + " " + e.toString());
		} finally {
			try {
				df.getMetaFile().setLastModified(System.currentTimeMillis());
			} catch (Exception e) {
			}
			l.unlock();
		}
	}

	/**
	 * Closes the byte array
	 * 
	 * @throws IOException
	 */
	protected void close(int flags) throws IOException {
		Lock l = null;
		this.closeLock.lock();
		try {
			l = df.getReadLock();
			l.lock();
			if (Main.safeClose) {
				if (SDFSLogger.isDebug())
					SDFSLogger.getLog().debug(
							"close " + df.getMetaFile().getPath() + " flag="
									+ flags);
				if (!this.isClosed()) {

					try {
						if (this.writtenTo && Main.safeSync) {
							df.writeCache();

							df.sync(false);

						}
						if (df.getMetaFile().canWrite())
							df.getMetaFile().sync();
					} catch (Exception e) {

					} finally {
						this.closed = true;
					}
				}
			}
		} finally {
			this.closeLock.unlock();
			if (l != null)
				l.unlock();
		}
	}

	/**
	 * Closes the byte array
	 * 
	 * @throws IOException
	 */
	protected void forceClose() throws IOException {
		if (SDFSLogger.isDebug())
			SDFSLogger.getLog().debug(
					"close " + df.getMetaFile().getPath() + " flag=" + flags);
		Lock l = null;
		this.closeLock.lock();
		try {
			l = df.getReadLock();
			l.lock();
			if (!this.isClosed()) {

				try {
					if (this.writtenTo && Main.safeSync
							&& df.getMetaFile().canWrite()) {
						df.writeCache();
						df.sync(false);

					}
					if (df.getMetaFile().canWrite())
						df.getMetaFile().sync();
				} catch (Exception e) {

				} finally {
					df.unRegisterChannel(this, this.getFlags());
					this.closed = true;
				}
			}

		} finally {
			if (l != null)
				l.unlock();
			this.closeLock.unlock();
		}
	}

	/**
	 * Reads data from the DedupFile
	 * 
	 * @param bbuf
	 *            the byte array to copy the data to.
	 * @param bufPos
	 *            the position within the array to copy the data too.
	 * @param siz
	 *            the mount of data to copy to the bbuf.
	 * @param filePos
	 *            the position within the file to read the data from
	 * @return the bytes read
	 * @throws IOException
	 * @throws DataArchivedException
	 */
	public int read(ByteBuffer buf, int bufPos, int siz, long filePos)
			throws IOException, DataArchivedException {
		// this.addAio();

		if (SDFSLogger.isDebug())
			SDFSLogger.getLog().debug(
					"fc reading " + df.getMetaFile().getPath() + " spos="
							+ filePos + " buffcap=" + buf.capacity() + " len="
							+ siz + " bcpos=" + bufPos);
		Lock l = df.getReadLock();
		l.lock();
		try {
			if (filePos > READHEAD_TRIGGER_SIZE && !readAheadInitiated && Main.readAhead) {
				this.readAheadInitiated = true;
				ReadAhead.getReadAhead(df);
			}
		} catch (Exception e) {
			SDFSLogger.getLog().error(
					"unable to load readahead for " + df.mf.getPath(), e);
		}
		try {
			if (filePos >= df.getMetaFile().length() && !Main.blockDev) {
				return -1;
			}
			long currentLocation = filePos;
			buf.position(bufPos);
			int bytesLeft = siz;
			long futureFilePostion = bytesLeft + currentLocation;
			if (Main.blockDev && futureFilePostion > df.getMetaFile().length())
				df.getMetaFile().setLength(futureFilePostion, false);
			if (futureFilePostion > df.getMetaFile().length()) {
				bytesLeft = (int) (df.getMetaFile().length() - currentLocation);
			}
			int read = 0;
			while (bytesLeft > 0) {
				DedupChunkInterface readBuffer = null;
				int startPos = 0;
				byte[] _rb = null;
				try {
					while (readBuffer == null) {
						readBuffer = df.getWriteBuffer(currentLocation);
						try {
							startPos = (int) (currentLocation - readBuffer
									.getFilePosition());
							int _len = readBuffer.getLength() - startPos;
							if (bytesLeft < _len)
								_len = bytesLeft;
							_rb = readBuffer.getReadChunk(startPos, _len);
							int nl = buf.remaining();
							if (nl < _rb.length)
								buf.put(_rb, 0, nl);
							else
								buf.put(_rb);
							//SDFSLogger.getLog().info(new String(_rb));
							df.getMetaFile().getIOMonitor()
									.addBytesRead(_len, true);
							currentLocation = currentLocation + _len;
							bytesLeft = bytesLeft - _len;
							read = read + _len;
							/*
							if (Main.volume.isClustered())
								readBuffer.flush();
								*/
						} catch (BufferClosedException e) {
							if (SDFSLogger.isDebug())
								SDFSLogger.getLog().debug(
										"trying to write again");
							readBuffer = null;
						}
					}
				} catch (DataArchivedException e) {
					if (Main.checkArchiveOnRead) {
						SDFSLogger
								.getLog()
								.warn("Archived data found in "
										+ df.getMetaFile().getPath()
										+ " at "
										+ startPos
										+ ". Recovering data from archive. This may take up to 4 hours " + e.getPos(),e);
						this.recoverArchives();
						this.read(buf, bufPos, siz, filePos);
					} else
						throw e;
				} catch (FileClosedException e) {
					if (Main.safeClose)
						SDFSLogger.getLog().warn(
								df.getMetaFile().getPath()
										+ " is closed but still writing");
					this.closeLock.lock();
					try {
						df.registerChannel(this);
						this.closed = false;
						this.read(buf, bufPos, siz, filePos);
					} finally {
						this.closeLock.unlock();
					}
				} catch (Exception e) {
					SDFSLogger.getLog().fatal("Error while reading buffer ", e);

					throw new IOException("Error reading buffer");
				}
				if (currentLocation == df.getMetaFile().length()) {
					return read;
				}

				this.currentPosition = currentLocation;
			}
			return read;
		} catch (DataArchivedException e) {
			SDFSLogger.getLog().error("archive exception " + e.getPos(),e);
			throw e;
		} catch (Exception e) {
			SDFSLogger.getLog().error(
					"unable to read " + df.getMetaFile().getPath(), e);
			Main.volume.addReadError();
			throw new IOException(e);
		} finally {
			try {
				df.getMetaFile().setLastAccessed(System.currentTimeMillis());
			} catch (Exception e) {
			}
			l.unlock();
			// this.removeAio();
		}

	}

	public DedupFile getDedupFile() {
		return this.df;
	}

	/**
	 * Seek to the specified file position.
	 * 
	 * @param pos
	 *            long
	 * @param typ
	 *            int
	 * @return long
	 * @exception IOException
	 */
	public long seekFile(long pos, int typ) throws IOException {
		Lock l = df.getReadLock();
		l.lock();
		try {
			if (SDFSLogger.isDebug())
				SDFSLogger.getLog().debug(
						"seek " + df.getMetaFile().getPath() + " at " + pos
								+ " type=" + typ);
			// Check if the current file position is the required file position

			switch (typ) {

			// From start of file

			case SeekType.StartOfFile:
				if (this.position() != pos)
					this.currentPosition = pos;
				break;

			// From current position

			case SeekType.CurrentPos:
				this.currentPosition = this.currentPosition + pos;
				break;
			// From end of file
			case SeekType.EndOfFile: {
				this.currentPosition = pos;
			}
				break;
			}
			df.getMetaFile().setLastAccessed(System.currentTimeMillis());
			// Return the new file position
			return this.position();
		} finally {
			l.unlock();
		}
	}

	/**
	 * 
	 * @return the MetaDataDedupFile for this DedupFileChannel
	 * @throws IOException
	 */
	public MetaDataDedupFile openFile() throws IOException {

		return this.df.getMetaFile();
	}

	/**
	 * Tries to lock a file at a specific position
	 * 
	 * @param position
	 *            the position to lock the file at.
	 * @param size
	 *            the size of the data to be locked
	 * @param shared
	 *            if the lock is shared or not
	 * @return true if it is locked
	 * @throws IOException
	 */
	public DedupFileLock tryLock(long position, long size, boolean shared)
			throws IOException {
		if (SDFSLogger.isDebug())
			SDFSLogger.getLog().debug(
					"trylock " + df.getMetaFile().getPath() + " at " + position
							+ " size=" + size + " shared="
							+ Boolean.toString(shared));
		return df.addLock(this, position, size, shared);
	}

	/**
	 * Tries to lock a file exclusively
	 * 
	 * @return true if the file is locked
	 * @throws IOException
	 */
	public DedupFileLock tryLock() throws IOException {
		if (SDFSLogger.isDebug())
			SDFSLogger.getLog().debug("trylock " + df.getMetaFile().getPath());

		return df.addLock(this, 0, df.getMetaFile().length(), false);
	}

	/**
	 * Removes an existing lock on a file
	 * 
	 * @param lock
	 *            the lock on the file
	 */
	public void removeLock(DedupFileLock lock) {
		if (SDFSLogger.isDebug())
			SDFSLogger.getLog().debug(
					"removelock " + df.getMetaFile().getPath());
		lock.release();
		df.removeLock(lock);
	}

	public int getFlags() {
		return flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	public void trim(long start, int len) throws IOException {
		Lock l = df.getReadLock();
		l.lock();
		try {
			if (SDFSLogger.isDebug())
				SDFSLogger.getLog().debug(
						"trim " + df.getMetaFile().getPath() + " start="
								+ start + " len=" + len);
			df.trim(start, len);
		} finally {
			l.unlock();
		}
	}
}