// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CloudFileInfo.proto

package org.opendedup.grpc;

/**
 * Protobuf type {@code org.opendedup.grpc.CloudMetaData}
 */
public  final class CloudMetaData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.opendedup.grpc.CloudMetaData)
    CloudMetaDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloudMetaData.newBuilder() to construct.
  private CloudMetaData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloudMetaData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloudMetaData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CloudMetaData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {

            date_ = input.readInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attributes_ = com.google.protobuf.MapField.newMapField(
                  AttributesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            attributes__ = input.readMessage(
                AttributesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            attributes_.getMutableMap().put(
                attributes__.getKey(), attributes__.getValue());
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
    return org.opendedup.grpc.CloudFileInfo.internal_static_org_opendedup_grpc_CloudMetaData_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetAttributes();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.opendedup.grpc.CloudFileInfo.internal_static_org_opendedup_grpc_CloudMetaData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.opendedup.grpc.CloudMetaData.class, org.opendedup.grpc.CloudMetaData.Builder.class);
  }

  public static final int DATE_FIELD_NUMBER = 1;
  private long date_;
  /**
   * <code>int64 date = 1;</code>
   * @return The date.
   */
  public long getDate() {
    return date_;
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 2;
  private static final class AttributesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.opendedup.grpc.CloudFileInfo.internal_static_org_opendedup_grpc_CloudMetaData_AttributesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> attributes_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetAttributes() {
    if (attributes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AttributesDefaultEntryHolder.defaultEntry);
    }
    return attributes_;
  }

  public int getAttributesCount() {
    return internalGetAttributes().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */

  public boolean containsAttributes(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetAttributes().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getAttributes() {
    return getAttributesMap();
  }
  /**
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getAttributesMap() {
    return internalGetAttributes().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */

  public java.lang.String getAttributesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetAttributes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */

  public java.lang.String getAttributesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetAttributes().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (date_ != 0L) {
      output.writeInt64(1, date_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAttributes(),
        AttributesDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (date_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, date_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetAttributes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      attributes__ = AttributesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, attributes__);
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
    if (!(obj instanceof org.opendedup.grpc.CloudMetaData)) {
      return super.equals(obj);
    }
    org.opendedup.grpc.CloudMetaData other = (org.opendedup.grpc.CloudMetaData) obj;

    if (getDate()
        != other.getDate()) return false;
    if (!internalGetAttributes().equals(
        other.internalGetAttributes())) return false;
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
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDate());
    if (!internalGetAttributes().getMap().isEmpty()) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAttributes().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.opendedup.grpc.CloudMetaData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.CloudMetaData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.CloudMetaData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.CloudMetaData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.CloudMetaData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.CloudMetaData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.CloudMetaData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.CloudMetaData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.CloudMetaData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.CloudMetaData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.CloudMetaData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.CloudMetaData parseFrom(
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
  public static Builder newBuilder(org.opendedup.grpc.CloudMetaData prototype) {
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
   * Protobuf type {@code org.opendedup.grpc.CloudMetaData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.opendedup.grpc.CloudMetaData)
      org.opendedup.grpc.CloudMetaDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opendedup.grpc.CloudFileInfo.internal_static_org_opendedup_grpc_CloudMetaData_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetAttributes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableAttributes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opendedup.grpc.CloudFileInfo.internal_static_org_opendedup_grpc_CloudMetaData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opendedup.grpc.CloudMetaData.class, org.opendedup.grpc.CloudMetaData.Builder.class);
    }

    // Construct using org.opendedup.grpc.CloudMetaData.newBuilder()
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
      date_ = 0L;

      internalGetMutableAttributes().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.opendedup.grpc.CloudFileInfo.internal_static_org_opendedup_grpc_CloudMetaData_descriptor;
    }

    @java.lang.Override
    public org.opendedup.grpc.CloudMetaData getDefaultInstanceForType() {
      return org.opendedup.grpc.CloudMetaData.getDefaultInstance();
    }

    @java.lang.Override
    public org.opendedup.grpc.CloudMetaData build() {
      org.opendedup.grpc.CloudMetaData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.opendedup.grpc.CloudMetaData buildPartial() {
      org.opendedup.grpc.CloudMetaData result = new org.opendedup.grpc.CloudMetaData(this);
      int from_bitField0_ = bitField0_;
      result.date_ = date_;
      result.attributes_ = internalGetAttributes();
      result.attributes_.makeImmutable();
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
      if (other instanceof org.opendedup.grpc.CloudMetaData) {
        return mergeFrom((org.opendedup.grpc.CloudMetaData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.opendedup.grpc.CloudMetaData other) {
      if (other == org.opendedup.grpc.CloudMetaData.getDefaultInstance()) return this;
      if (other.getDate() != 0L) {
        setDate(other.getDate());
      }
      internalGetMutableAttributes().mergeFrom(
          other.internalGetAttributes());
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
      org.opendedup.grpc.CloudMetaData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.opendedup.grpc.CloudMetaData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long date_ ;
    /**
     * <code>int64 date = 1;</code>
     * @return The date.
     */
    public long getDate() {
      return date_;
    }
    /**
     * <code>int64 date = 1;</code>
     * @param value The date to set.
     * @return This builder for chaining.
     */
    public Builder setDate(long value) {
      
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 date = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDate() {
      
      date_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> attributes_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetAttributes() {
      if (attributes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AttributesDefaultEntryHolder.defaultEntry);
      }
      return attributes_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableAttributes() {
      onChanged();;
      if (attributes_ == null) {
        attributes_ = com.google.protobuf.MapField.newMapField(
            AttributesDefaultEntryHolder.defaultEntry);
      }
      if (!attributes_.isMutable()) {
        attributes_ = attributes_.copy();
      }
      return attributes_;
    }

    public int getAttributesCount() {
      return internalGetAttributes().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public boolean containsAttributes(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetAttributes().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAttributesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAttributes() {
      return getAttributesMap();
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getAttributesMap() {
      return internalGetAttributes().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public java.lang.String getAttributesOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAttributes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public java.lang.String getAttributesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAttributes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAttributes() {
      internalGetMutableAttributes().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public Builder removeAttributes(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableAttributes().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableAttributes() {
      return internalGetMutableAttributes().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */
    public Builder putAttributes(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableAttributes().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public Builder putAllAttributes(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableAttributes().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:org.opendedup.grpc.CloudMetaData)
  }

  // @@protoc_insertion_point(class_scope:org.opendedup.grpc.CloudMetaData)
  private static final org.opendedup.grpc.CloudMetaData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.opendedup.grpc.CloudMetaData();
  }

  public static org.opendedup.grpc.CloudMetaData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudMetaData>
      PARSER = new com.google.protobuf.AbstractParser<CloudMetaData>() {
    @java.lang.Override
    public CloudMetaData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CloudMetaData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CloudMetaData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudMetaData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.opendedup.grpc.CloudMetaData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
