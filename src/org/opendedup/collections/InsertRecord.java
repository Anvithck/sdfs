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
package org.opendedup.collections;

import com.google.common.primitives.Longs;


public class InsertRecord {
	private boolean inserted;
	private byte[] hashlocs;

	public InsertRecord(boolean inserted, long pos) {
		this.inserted = inserted;
		this.hashlocs = Longs.toByteArray(pos);
	}

	public InsertRecord(boolean inserted, byte[] locs) {
		this.inserted = inserted;
		this.hashlocs = locs;
	}

	public boolean getInserted() {
		return this.inserted;
	}

	public void setHashLocs(byte[] hashlocs) {
		this.hashlocs = hashlocs;
	}

	public byte[] getHashLocs() {
		return this.hashlocs;
	}

	public org.opendedup.grpc.Storage.InsertRecord toProtoBuf() {
		org.opendedup.grpc.Storage.InsertRecord.Builder b = org.opendedup.grpc.Storage.InsertRecord.newBuilder();
		b.setHashloc(Longs.fromByteArray(this.hashlocs));
		b.setInserted(this.inserted);
		return b.build();
	}

}
