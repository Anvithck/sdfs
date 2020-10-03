// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VolumeService.proto

package org.opendedup.grpc;

public interface MessageQueueInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.MessageQueueInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string hostName = 1;</code>
   * @return The hostName.
   */
  java.lang.String getHostName();
  /**
   * <code>string hostName = 1;</code>
   * @return The bytes for hostName.
   */
  com.google.protobuf.ByteString
      getHostNameBytes();

  /**
   * <code>.org.opendedup.grpc.MessageQueueInfoResponse.MQType mqType = 2;</code>
   * @return The enum numeric value on the wire for mqType.
   */
  int getMqTypeValue();
  /**
   * <code>.org.opendedup.grpc.MessageQueueInfoResponse.MQType mqType = 2;</code>
   * @return The mqType.
   */
  org.opendedup.grpc.MessageQueueInfoResponse.MQType getMqType();

  /**
   * <code>int32 port = 3;</code>
   * @return The port.
   */
  int getPort();

  /**
   * <code>string topic = 4;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 4;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>string authInfo = 5;</code>
   * @return The authInfo.
   */
  java.lang.String getAuthInfo();
  /**
   * <code>string authInfo = 5;</code>
   * @return The bytes for authInfo.
   */
  com.google.protobuf.ByteString
      getAuthInfoBytes();

  /**
   * <code>string subScription = 6;</code>
   * @return The subScription.
   */
  java.lang.String getSubScription();
  /**
   * <code>string subScription = 6;</code>
   * @return The bytes for subScription.
   */
  com.google.protobuf.ByteString
      getSubScriptionBytes();

  /**
   * <code>string project = 7;</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <code>string project = 7;</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();
}
