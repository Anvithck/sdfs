// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FileInfo.proto

package org.opendedup.grpc;

public interface WFileAttributesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.WFileAttributesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string error = 1;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 1;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>.org.opendedup.grpc.errorCodes errorCode = 2;</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   * <code>.org.opendedup.grpc.errorCodes errorCode = 2;</code>
   * @return The errorCode.
   */
  org.opendedup.grpc.errorCodes getErrorCode();
}
