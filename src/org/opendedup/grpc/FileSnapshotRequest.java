// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

/**
 * Protobuf type {@code org.opendedup.grpc.FileSnapshotRequest}
 */
public  final class FileSnapshotRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.opendedup.grpc.FileSnapshotRequest)
    FileSnapshotRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileSnapshotRequest.newBuilder() to construct.
  private FileSnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileSnapshotRequest() {
    src_ = "";
    dest_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileSnapshotRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FileSnapshotRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            src_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dest_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_FileSnapshotRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_FileSnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.opendedup.grpc.FileSnapshotRequest.class, org.opendedup.grpc.FileSnapshotRequest.Builder.class);
  }

  public static final int SRC_FIELD_NUMBER = 1;
  private volatile java.lang.Object src_;
  /**
   * <code>string src = 1;</code>
   * @return The src.
   */
  public java.lang.String getSrc() {
    java.lang.Object ref = src_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      src_ = s;
      return s;
    }
  }
  /**
   * <code>string src = 1;</code>
   * @return The bytes for src.
   */
  public com.google.protobuf.ByteString
      getSrcBytes() {
    java.lang.Object ref = src_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      src_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEST_FIELD_NUMBER = 2;
  private volatile java.lang.Object dest_;
  /**
   * <code>string dest = 2;</code>
   * @return The dest.
   */
  public java.lang.String getDest() {
    java.lang.Object ref = dest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dest_ = s;
      return s;
    }
  }
  /**
   * <code>string dest = 2;</code>
   * @return The bytes for dest.
   */
  public com.google.protobuf.ByteString
      getDestBytes() {
    java.lang.Object ref = dest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dest_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSrcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, src_);
    }
    if (!getDestBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dest_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSrcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, src_);
    }
    if (!getDestBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dest_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.opendedup.grpc.FileSnapshotRequest)) {
      return super.equals(obj);
    }
    org.opendedup.grpc.FileSnapshotRequest other = (org.opendedup.grpc.FileSnapshotRequest) obj;

    if (!getSrc()
        .equals(other.getSrc())) return false;
    if (!getDest()
        .equals(other.getDest())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SRC_FIELD_NUMBER;
    hash = (53 * hash) + getSrc().hashCode();
    hash = (37 * hash) + DEST_FIELD_NUMBER;
    hash = (53 * hash) + getDest().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.opendedup.grpc.FileSnapshotRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.FileSnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.opendedup.grpc.FileSnapshotRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.opendedup.grpc.FileSnapshotRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.opendedup.grpc.FileSnapshotRequest)
      org.opendedup.grpc.FileSnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_FileSnapshotRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_FileSnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opendedup.grpc.FileSnapshotRequest.class, org.opendedup.grpc.FileSnapshotRequest.Builder.class);
    }

    // Construct using org.opendedup.grpc.FileSnapshotRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      src_ = "";

      dest_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_FileSnapshotRequest_descriptor;
    }

    @java.lang.Override
    public org.opendedup.grpc.FileSnapshotRequest getDefaultInstanceForType() {
      return org.opendedup.grpc.FileSnapshotRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.opendedup.grpc.FileSnapshotRequest build() {
      org.opendedup.grpc.FileSnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.opendedup.grpc.FileSnapshotRequest buildPartial() {
      org.opendedup.grpc.FileSnapshotRequest result = new org.opendedup.grpc.FileSnapshotRequest(this);
      result.src_ = src_;
      result.dest_ = dest_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.opendedup.grpc.FileSnapshotRequest) {
        return mergeFrom((org.opendedup.grpc.FileSnapshotRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.opendedup.grpc.FileSnapshotRequest other) {
      if (other == org.opendedup.grpc.FileSnapshotRequest.getDefaultInstance()) return this;
      if (!other.getSrc().isEmpty()) {
        src_ = other.src_;
        onChanged();
      }
      if (!other.getDest().isEmpty()) {
        dest_ = other.dest_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.opendedup.grpc.FileSnapshotRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.opendedup.grpc.FileSnapshotRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object src_ = "";
    /**
     * <code>string src = 1;</code>
     * @return The src.
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        src_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string src = 1;</code>
     * @return The bytes for src.
     */
    public com.google.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string src = 1;</code>
     * @param value The src to set.
     * @return This builder for chaining.
     */
    public Builder setSrc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      src_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string src = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSrc() {
      
      src_ = getDefaultInstance().getSrc();
      onChanged();
      return this;
    }
    /**
     * <code>string src = 1;</code>
     * @param value The bytes for src to set.
     * @return This builder for chaining.
     */
    public Builder setSrcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      src_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dest_ = "";
    /**
     * <code>string dest = 2;</code>
     * @return The dest.
     */
    public java.lang.String getDest() {
      java.lang.Object ref = dest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dest = 2;</code>
     * @return The bytes for dest.
     */
    public com.google.protobuf.ByteString
        getDestBytes() {
      java.lang.Object ref = dest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dest = 2;</code>
     * @param value The dest to set.
     * @return This builder for chaining.
     */
    public Builder setDest(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dest_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dest = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDest() {
      
      dest_ = getDefaultInstance().getDest();
      onChanged();
      return this;
    }
    /**
     * <code>string dest = 2;</code>
     * @param value The bytes for dest to set.
     * @return This builder for chaining.
     */
    public Builder setDestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dest_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.opendedup.grpc.FileSnapshotRequest)
  }

  // @@protoc_insertion_point(class_scope:org.opendedup.grpc.FileSnapshotRequest)
  private static final org.opendedup.grpc.FileSnapshotRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.opendedup.grpc.FileSnapshotRequest();
  }

  public static org.opendedup.grpc.FileSnapshotRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileSnapshotRequest>
      PARSER = new com.google.protobuf.AbstractParser<FileSnapshotRequest>() {
    @java.lang.Override
    public FileSnapshotRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FileSnapshotRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileSnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileSnapshotRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.opendedup.grpc.FileSnapshotRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

