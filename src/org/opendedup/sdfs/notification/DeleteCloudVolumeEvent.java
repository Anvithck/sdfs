package org.opendedup.sdfs.notification;

import java.io.IOException;

public class DeleteCloudVolumeEvent extends SDFSEvent {
    private static final long serialVersionUID = 1L;
    public long volumeid;
    
    protected DeleteCloudVolumeEvent(String target, String shortMsg, Level level,long volumeid) {
        super(DELCV, target, shortMsg, level);
        this.volumeid = volumeid;
	}
    
    @Override
    public org.opendedup.grpc.SDFSEventOuterClass.SDFSEvent toProtoBuf() throws IOException{
        org.opendedup.grpc.SDFSEventOuterClass.SDFSEvent evt = super.toProtoBuf();
        org.opendedup.grpc.SDFSEventOuterClass.SDFSEvent.Builder b= org.opendedup.grpc.SDFSEventOuterClass.SDFSEvent.newBuilder(evt);
        b.putAttributes("volumeid", Long.toString(this.volumeid));
        return b.build();
    }
}