// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

public interface GetCloudFileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.GetCloudFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string file = 1;</code>
   * @return The file.
   */
  java.lang.String getFile();
  /**
   * <code>string file = 1;</code>
   * @return The bytes for file.
   */
  com.google.protobuf.ByteString
      getFileBytes();

  /**
   * <code>string dstfile = 2;</code>
   * @return The dstfile.
   */
  java.lang.String getDstfile();
  /**
   * <code>string dstfile = 2;</code>
   * @return The bytes for dstfile.
   */
  com.google.protobuf.ByteString
      getDstfileBytes();

  /**
   * <code>bool overwrite = 3;</code>
   * @return The overwrite.
   */
  boolean getOverwrite();

  /**
   * <code>string changeid = 4;</code>
   * @return The changeid.
   */
  java.lang.String getChangeid();
  /**
   * <code>string changeid = 4;</code>
   * @return The bytes for changeid.
   */
  com.google.protobuf.ByteString
      getChangeidBytes();
}
