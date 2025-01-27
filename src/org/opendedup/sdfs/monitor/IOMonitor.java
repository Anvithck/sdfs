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
package org.opendedup.sdfs.monitor;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import javax.xml.parsers.ParserConfigurationException;

import com.google.gson.JsonObject;

import org.opendedup.grpc.FileInfo.IOMonitorResponse;
import org.opendedup.sdfs.Main;
import org.opendedup.sdfs.io.MetaDataDedupFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class IOMonitor implements java.io.Serializable {

	private static final long serialVersionUID = 6582549274733666474L;
	private AtomicLong virtualBytesWritten = new AtomicLong(0);
	private AtomicLong actualBytesWritten = new AtomicLong(0);
	private AtomicLong bytesRead = new AtomicLong(0);
	private AtomicLong duplicateBlocks = new AtomicLong(0);
	private AtomicLong readOperations = new AtomicLong(0);
	private AtomicLong writeOperations = new AtomicLong(0);
	private static ArrayList<IOMonitorListener> iofListeners = new ArrayList<IOMonitorListener>();
	private AtomicLong riops = new AtomicLong(-1);
	private AtomicLong wiops = new AtomicLong(-1);
	private AtomicLong iops = new AtomicLong(-1);
	private AtomicLong rbps = new AtomicLong(-1);
	private AtomicLong wbps = new AtomicLong(-1);
	private AtomicLong bps = new AtomicLong(-1);
	private int qos = -1;
	private String iopProfile = "none";
	private final MetaDataDedupFile mf;

	public IOMonitor(MetaDataDedupFile mf) {
		this.mf = mf;
	}

	public static void addIOMonListener(IOMonitorListener l) {
		iofListeners.add(l);
	}

	public static void removeIOMonListener(IOMonitorListener l) {
		iofListeners.remove(l);
	}

	public static ArrayList<IOMonitorListener> getIOMonListeners() {
		return iofListeners;
	}

	public long getVirtualBytesWritten() {
		return virtualBytesWritten.get();
	}

	public long getActualBytesWritten() {
		return actualBytesWritten.get();
	}

	public long getBytesRead() {
		return bytesRead.get();
	}

	public void addBytesRead(int len, boolean propigateEvent) {
		this.addRIO(true);
		this.bytesRead.addAndGet(len);
		if (this.bytesRead.get() < 0)
			this.bytesRead.set(0);
		Main.volume.addReadBytes(len, true);
	}

	public void addActualBytesWritten(int len, boolean propigateEvent) {
		this.actualBytesWritten.addAndGet(len);
		if (this.actualBytesWritten.get() < 0)
			this.actualBytesWritten.set(0);
		Main.volume.addActualWriteBytes(len, true);
	}

	public void addWIO(boolean propigateEvent) {
		if (this.writeOperations.get() == Long.MAX_VALUE)
			this.writeOperations.set(0);
		this.writeOperations.incrementAndGet();
	}

	public void addRIO(boolean propigateEvent) {
		if (this.readOperations.get() == Long.MAX_VALUE)
			this.readOperations.set(0);
		this.readOperations.incrementAndGet();
	}

	public void addVirtualBytesWritten(int len, boolean propigateEvent) {
		this.addWIO(true);
		this.virtualBytesWritten.addAndGet(len);
		if (this.virtualBytesWritten.get() < 0)
			this.virtualBytesWritten.set(0);
		Main.volume.addVirtualBytesWritten(len, true);
	}

	public void setVirtualBytesWritten(long len, boolean propigateEvent) {
		this.virtualBytesWritten.addAndGet(len);
		if (this.virtualBytesWritten.get() < 0)
			this.virtualBytesWritten.set(0);
	}

	public long getDuplicateBlocks() {
		return duplicateBlocks.longValue();
	}

	public void setDuplicateBlocks(long duplicateBlocks, boolean propigateEvent) {
		this.duplicateBlocks.set(duplicateBlocks);
		if (this.duplicateBlocks.get() < 0)
			this.duplicateBlocks.set(0);
	}

	public void setActualBytesWritten(long actualBytesWritten,
			boolean propigateEvent) {
		this.actualBytesWritten.set(actualBytesWritten);
		if (this.actualBytesWritten.get() < 0)
			this.actualBytesWritten.set(0);
	}

	public void setBytesRead(long bytesRead, boolean propigateEvent) {
		this.bytesRead.set(bytesRead);
		if (this.bytesRead.get() < 0)
			this.bytesRead.set(0);
	}

	public void removeDuplicateBlock(boolean propigateEvent) {
		this.duplicateBlocks.addAndGet(-1 * Main.CHUNK_LENGTH);
		Main.volume.addDuplicateBytes(-1 * Main.CHUNK_LENGTH, true);
	}

	public void clearAllCounters(boolean propigateEvent) {
		Main.volume.addReadBytes(-1 * this.bytesRead.get(), true);
		Main.volume.addDuplicateBytes(-1 * this.duplicateBlocks.get(), true);
		Main.volume.addActualWriteBytes(-1 * this.actualBytesWritten.get(),
				true);
		Main.volume.addVirtualBytesWritten(-1 * this.virtualBytesWritten.get(),
				true);
		this.bytesRead.set(0);
		this.duplicateBlocks.set(0);
		this.actualBytesWritten.set(0);
		this.virtualBytesWritten.set(0);
	}

	public void clearFileCounters(boolean propigateEvent) {
		this.bytesRead.set(0);
		this.duplicateBlocks.set(0);
		this.actualBytesWritten.set(0);
		this.virtualBytesWritten.set(0);
	}

	public void addDulicateData(int len, boolean propigateEvent) {
		this.duplicateBlocks.addAndGet(len);
		Main.volume.addDuplicateBytes(len, true);
	}

	public byte[] toByteArray() {
		byte[] ip = this.iopProfile.getBytes();
		ByteBuffer buf = ByteBuffer.wrap(new byte[8 + 8 + 8 + 8 + 4 + ip.length
				+ 4 + 4 + 4 + 4 + 8 + 8 + 8 + 4]);
		buf.putLong(this.virtualBytesWritten.get());
		buf.putLong(this.actualBytesWritten.get());
		buf.putLong(this.bytesRead.get());
		buf.putLong(this.duplicateBlocks.get());
		buf.putInt(ip.length);
		buf.put(ip);
		buf.putInt(this.riops.intValue());
		buf.putInt(this.wiops.intValue());
		buf.putInt(this.wiops.intValue());
		buf.putInt(this.iops.intValue());
		buf.putLong(this.rbps.get());
		buf.putLong(this.wbps.get());
		buf.putLong(this.bps.get());
		buf.putInt(this.qos);
		return buf.array();
	}

	public void fromByteArray(byte[] b) {
		ByteBuffer buf = ByteBuffer.wrap(b);
		this.virtualBytesWritten.set(buf.getLong());
		this.actualBytesWritten.set(buf.getLong());
		this.bytesRead.set(buf.getLong());
		this.duplicateBlocks.set(buf.getLong());
		if ((buf.position() + 1) < buf.capacity()) {
			byte[] ip = new byte[buf.getInt()];
			buf.get(ip);
			this.iopProfile = new String(ip);
			this.riops.set(buf.getInt());
			this.wiops.set(buf.getInt());
			this.iops.set(buf.getInt());
			this.rbps.set(buf.getLong());
			this.wbps.set(buf.getLong());
			this.bps.set(buf.getLong());
			this.qos = buf.getInt();
		}
	}

	public void fromGrpc(IOMonitorResponse r) {
		this.virtualBytesWritten.set(r.getVirtualBytesWritten());
		this.actualBytesWritten.set(r.getActualBytesWritten());
		this.bytesRead.set(r.getBytesRead());
		this.duplicateBlocks.set(r.getDuplicateBlocks());
		this.iopProfile = r.getIoProfile();
		this.riops.set(r.getMaxReadOps());
		this.wiops.set(r.getMaxWriteOps());
		this.iops.set(r.getMaxIops());
		this.rbps.set(r.getMaxRbps());
		this.wbps.set(r.getMaxWbps());
		this.bps.set(r.getMaxBps());
		this.qos = r.getIoQos();
	}

	public IOMonitorResponse toGRPC() {
		IOMonitorResponse.Builder b = IOMonitorResponse.newBuilder();
		b.setVirtualBytesWritten(this.virtualBytesWritten.get()).setActualBytesWritten(this.actualBytesWritten.get())
		.setBytesRead(this.bytesRead.get()).setDuplicateBlocks(this.duplicateBlocks.get()).setReadOpts(this.riops.get())
		.setWriteOpts(this.writeOperations.get()).setMaxIops(this.iops.get()).setMaxReadOps(this.riops.get()).setMaxWriteOps(this.wiops.get())
		.setMaxMbps(this.bps.get() / (1024 * 1024)).setMaxReadMbps(this.rbps.get() / (1024 * 1024)).setMaxWriteMbps(this.wbps.get() / (1024 * 1024))
		.setIoQos(this.qos).setIoProfile(this.iopProfile).setMaxMbps(this.bps.get()).setMaxRbps(this.rbps.get()).setMaxWbps(this.wbps.get());
		return b.build();
		
	}








	public Element toXML(Document doc) throws ParserConfigurationException {
		Element root = doc.createElement("io-info");
		root.setAttribute("virtual-bytes-written",
				Long.toString(this.virtualBytesWritten.get()));
		root.setAttribute("actual-bytes-written",
				Long.toString(this.actualBytesWritten.get()));
		root.setAttribute("bytes-read", Long.toString(this.bytesRead.get()));
		root.setAttribute("duplicate-blocks",
				Long.toString(this.duplicateBlocks.get()));
		root.setAttribute("readops", Long.toString(this.readOperations.get()));
		root.setAttribute("writeops",
				Long.toBinaryString(this.writeOperations.get()));
		root.setAttribute("max-readops",
				Integer.toString(this.riops.intValue()));
		root.setAttribute("max-writeops",
				Integer.toString(this.wiops.intValue()));
		root.setAttribute("max-iops", Integer.toString(this.iops.intValue()));
		root.setAttribute("max-readmbps",
				Long.toString(this.rbps.get() / (1024 * 1024)));
		root.setAttribute("max-writembps",
				Long.toString(this.wbps.get() / (1024 * 1024)));
		root.setAttribute("max-mbps",
				Long.toString(this.bps.get() / (1024 * 1024)));
		root.setAttribute("io-qos", Integer.toString(this.qos));
		root.setAttribute("io-profile", this.iopProfile);
		return root;
	}
	
	public JsonObject toJson(JsonObject root) {
		root.addProperty("io.virtual.bytes.written",
				this.virtualBytesWritten.get());
		root.addProperty("io.actual.bytes.written",
				this.actualBytesWritten.get());
		root.addProperty("io.bytes.read",this.bytesRead.get());
		root.addProperty("io.duplicate.blocks",
				this.duplicateBlocks.get());
		root.addProperty("io.readops", this.readOperations.get());
		root.addProperty("io.writeops",
				this.writeOperations.get());
		root.addProperty("io.max.readops",
				this.riops.intValue());
		root.addProperty("io.max.writeops",
				this.wiops.intValue());
		root.addProperty("io.max.iops", this.iops.intValue());
		root.addProperty("io.max.readmbps",
				this.rbps.get() / (1024 * 1024));
		root.addProperty("io.max.writembps",
				this.wbps.get() / (1024 * 1024));
		root.addProperty("io.max.mbps",
				this.bps.get() / (1024 * 1024));
		root.addProperty("io.qos", Integer.toString(this.qos));
		root.addProperty("io.profile", this.iopProfile);
		return root;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("virtual-bytes-written=\"");
		sb.append(this.virtualBytesWritten);
		sb.append("\"\n actual-bytes-written=\"");
		sb.append(this.actualBytesWritten);
		sb.append("\"\n bytes-read=\"");
		sb.append(this.bytesRead);
		sb.append("\"\n duplicate-blocks=\"");
		sb.append(this.duplicateBlocks);
		sb.append("\"\n read-ops=\"");
		sb.append(this.readOperations);
		sb.append("\"\n write-ops=\"");
		sb.append(this.writeOperations);
		return sb.toString();
	}

	public int getRiops() {
		return riops.intValue();
	}

	public void setRiops(int riops, boolean propigateEvent) {
		this.riops.set(riops);
	}

	public int getWiops() {
		return wiops.intValue();
	}

	public void setWiops(int wiops, boolean propigateEvent) {
		this.wiops.set(wiops);
	}

	public int getIops() {
		return iops.intValue();
	}

	public void setIops(int iops, boolean propigateEvent) {
		this.iops.set(iops);
	}

	public int getQos() {
		return iops.intValue();
	}

	public void setQos(int qos, boolean propigateEvent) {
		this.qos = qos;
	}

	public long getRmbps() {
		return rbps.get();
	}

	public void setRmbps(long rmbps, boolean propigateEvent) {
		this.rbps.set(rmbps);
	}

	public long getWmbps() {
		return wbps.get();
	}

	public void setWmbps(long wmbps, boolean propigateEvent) {
		this.wbps.set(wmbps);
	}

	public long getMbps() {
		return bps.get();
	}

	public void setMbps(long mbps, boolean propigateEvent) {
		this.bps.set(mbps);
	}

	public String getIopProfile() {
		return iopProfile;
	}

	public void setIopProfile(String iopProfile, boolean propigateEvent) {
		this.iopProfile = iopProfile;
	}

	public MetaDataDedupFile getMf() {
		return mf;
	}
}
