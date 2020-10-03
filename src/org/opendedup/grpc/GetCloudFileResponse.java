// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

/**
 * Protobuf type {@code org.opendedup.grpc.GetCloudFileResponse}
 */
public  final class GetCloudFileResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.opendedup.grpc.GetCloudFileResponse)
    GetCloudFileResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCloudFileResponse.newBuilder() to construct.
  private GetCloudFileResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCloudFileResponse() {
    eventID_ = "";
    error_ = "";
    errorCode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCloudFileResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCloudFileResponse(
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

            eventID_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            error_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            errorCode_ = rawValue;
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
    return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_GetCloudFileResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_GetCloudFileResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.opendedup.grpc.GetCloudFileResponse.class, org.opendedup.grpc.GetCloudFileResponse.Builder.class);
  }

  public static final int EVENTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object eventID_;
  /**
   * <code>string eventID = 1;</code>
   * @return The eventID.
   */
  public java.lang.String getEventID() {
    java.lang.Object ref = eventID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventID_ = s;
      return s;
    }
  }
  /**
   * <code>string eventID = 1;</code>
   * @return The bytes for eventID.
   */
  public com.google.protobuf.ByteString
      getEventIDBytes() {
    java.lang.Object ref = eventID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private volatile java.lang.Object error_;
  /**
   * <code>string error = 2;</code>
   * @return The error.
   */
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   * <code>string error = 2;</code>
   * @return The bytes for error.
   */
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      error_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERRORCODE_FIELD_NUMBER = 3;
  private int errorCode_;
  /**
   * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  public int getErrorCodeValue() {
    return errorCode_;
  }
  /**
   * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
   * @return The errorCode.
   */
  public org.opendedup.grpc.errorCodes getErrorCode() {
    @SuppressWarnings("deprecation")
    org.opendedup.grpc.errorCodes result = org.opendedup.grpc.errorCodes.valueOf(errorCode_);
    return result == null ? org.opendedup.grpc.errorCodes.UNRECOGNIZED : result;
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
    if (!getEventIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eventID_);
    }
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
    }
    if (errorCode_ != org.opendedup.grpc.errorCodes.NOERR.getNumber()) {
      output.writeEnum(3, errorCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEventIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eventID_);
    }
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
    }
    if (errorCode_ != org.opendedup.grpc.errorCodes.NOERR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, errorCode_);
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
    if (!(obj instanceof org.opendedup.grpc.GetCloudFileResponse)) {
      return super.equals(obj);
    }
    org.opendedup.grpc.GetCloudFileResponse other = (org.opendedup.grpc.GetCloudFileResponse) obj;

    if (!getEventID()
        .equals(other.getEventID())) return false;
    if (!getError()
        .equals(other.getError())) return false;
    if (errorCode_ != other.errorCode_) return false;
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
    hash = (37 * hash) + EVENTID_FIELD_NUMBER;
    hash = (53 * hash) + getEventID().hashCode();
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
    hash = (53 * hash) + errorCode_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.opendedup.grpc.GetCloudFileResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.GetCloudFileResponse parseFrom(
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
  public static Builder newBuilder(org.opendedup.grpc.GetCloudFileResponse prototype) {
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
   * Protobuf type {@code org.opendedup.grpc.GetCloudFileResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.opendedup.grpc.GetCloudFileResponse)
      org.opendedup.grpc.GetCloudFileResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_GetCloudFileResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_GetCloudFileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opendedup.grpc.GetCloudFileResponse.class, org.opendedup.grpc.GetCloudFileResponse.Builder.class);
    }

    // Construct using org.opendedup.grpc.GetCloudFileResponse.newBuilder()
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
      eventID_ = "";

      error_ = "";

      errorCode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_GetCloudFileResponse_descriptor;
    }

    @java.lang.Override
    public org.opendedup.grpc.GetCloudFileResponse getDefaultInstanceForType() {
      return org.opendedup.grpc.GetCloudFileResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.opendedup.grpc.GetCloudFileResponse build() {
      org.opendedup.grpc.GetCloudFileResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.opendedup.grpc.GetCloudFileResponse buildPartial() {
      org.opendedup.grpc.GetCloudFileResponse result = new org.opendedup.grpc.GetCloudFileResponse(this);
      result.eventID_ = eventID_;
      result.error_ = error_;
      result.errorCode_ = errorCode_;
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
      if (other instanceof org.opendedup.grpc.GetCloudFileResponse) {
        return mergeFrom((org.opendedup.grpc.GetCloudFileResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.opendedup.grpc.GetCloudFileResponse other) {
      if (other == org.opendedup.grpc.GetCloudFileResponse.getDefaultInstance()) return this;
      if (!other.getEventID().isEmpty()) {
        eventID_ = other.eventID_;
        onChanged();
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (other.errorCode_ != 0) {
        setErrorCodeValue(other.getErrorCodeValue());
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
      org.opendedup.grpc.GetCloudFileResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.opendedup.grpc.GetCloudFileResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object eventID_ = "";
    /**
     * <code>string eventID = 1;</code>
     * @return The eventID.
     */
    public java.lang.String getEventID() {
      java.lang.Object ref = eventID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string eventID = 1;</code>
     * @return The bytes for eventID.
     */
    public com.google.protobuf.ByteString
        getEventIDBytes() {
      java.lang.Object ref = eventID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string eventID = 1;</code>
     * @param value The eventID to set.
     * @return This builder for chaining.
     */
    public Builder setEventID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string eventID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventID() {
      
      eventID_ = getDefaultInstance().getEventID();
      onChanged();
      return this;
    }
    /**
     * <code>string eventID = 1;</code>
     * @param value The bytes for eventID to set.
     * @return This builder for chaining.
     */
    public Builder setEventIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eventID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     * <code>string error = 2;</code>
     * @return The error.
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error = 2;</code>
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error = 2;</code>
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <code>string error = 2;</code>
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      error_ = value;
      onChanged();
      return this;
    }

    private int errorCode_ = 0;
    /**
     * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
     * @return The enum numeric value on the wire for errorCode.
     */
    public int getErrorCodeValue() {
      return errorCode_;
    }
    /**
     * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
     * @param value The enum numeric value on the wire for errorCode to set.
     * @return This builder for chaining.
     */
    public Builder setErrorCodeValue(int value) {
      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
     * @return The errorCode.
     */
    public org.opendedup.grpc.errorCodes getErrorCode() {
      @SuppressWarnings("deprecation")
      org.opendedup.grpc.errorCodes result = org.opendedup.grpc.errorCodes.valueOf(errorCode_);
      return result == null ? org.opendedup.grpc.errorCodes.UNRECOGNIZED : result;
    }
    /**
     * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
     * @param value The errorCode to set.
     * @return This builder for chaining.
     */
    public Builder setErrorCode(org.opendedup.grpc.errorCodes value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      errorCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorCode() {
      
      errorCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:org.opendedup.grpc.GetCloudFileResponse)
  }

  // @@protoc_insertion_point(class_scope:org.opendedup.grpc.GetCloudFileResponse)
  private static final org.opendedup.grpc.GetCloudFileResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.opendedup.grpc.GetCloudFileResponse();
  }

  public static org.opendedup.grpc.GetCloudFileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCloudFileResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCloudFileResponse>() {
    @java.lang.Override
    public GetCloudFileResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCloudFileResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCloudFileResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCloudFileResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.opendedup.grpc.GetCloudFileResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

