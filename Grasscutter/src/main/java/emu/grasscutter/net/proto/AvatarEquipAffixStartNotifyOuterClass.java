// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarEquipAffixStartNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarEquipAffixStartNotifyOuterClass {
  private AvatarEquipAffixStartNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarEquipAffixStartNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarEquipAffixStartNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
     * @return Whether the equipAffixInfo field is set.
     */
    boolean hasEquipAffixInfo();
    /**
     * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
     * @return The equipAffixInfo.
     */
    emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getEquipAffixInfo();
    /**
     * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
     */
    emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder getEquipAffixInfoOrBuilder();

    /**
     * <code>uint64 avatarGuid = 15;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * Protobuf type {@code AvatarEquipAffixStartNotify}
   */
  public static final class AvatarEquipAffixStartNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarEquipAffixStartNotify)
      AvatarEquipAffixStartNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarEquipAffixStartNotify.newBuilder() to construct.
    private AvatarEquipAffixStartNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarEquipAffixStartNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarEquipAffixStartNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarEquipAffixStartNotify(
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
            case 42: {
              emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder subBuilder = null;
              if (equipAffixInfo_ != null) {
                subBuilder = equipAffixInfo_.toBuilder();
              }
              equipAffixInfo_ = input.readMessage(emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(equipAffixInfo_);
                equipAffixInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

              avatarGuid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.internal_static_AvatarEquipAffixStartNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.internal_static_AvatarEquipAffixStartNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.class, emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code AvatarEquipAffixStartNotify.CIBOKBFGLBI}
     */
    public enum CIBOKBFGLBI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1602;</code>
       */
      PEPPOHPHJOJ(1, 1602),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final CIBOKBFGLBI DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1602;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1602;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static CIBOKBFGLBI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CIBOKBFGLBI forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1602: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CIBOKBFGLBI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CIBOKBFGLBI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CIBOKBFGLBI>() {
              public CIBOKBFGLBI findValueByNumber(int number) {
                return CIBOKBFGLBI.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final CIBOKBFGLBI[] VALUES = getStaticValuesArray();
      private static CIBOKBFGLBI[] getStaticValuesArray() {
        return new CIBOKBFGLBI[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static CIBOKBFGLBI valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private CIBOKBFGLBI(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AvatarEquipAffixStartNotify.CIBOKBFGLBI)
    }

    public static final int EQUIPAFFIXINFO_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo equipAffixInfo_;
    /**
     * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
     * @return Whether the equipAffixInfo field is set.
     */
    @java.lang.Override
    public boolean hasEquipAffixInfo() {
      return equipAffixInfo_ != null;
    }
    /**
     * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
     * @return The equipAffixInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getEquipAffixInfo() {
      return equipAffixInfo_ == null ? emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance() : equipAffixInfo_;
    }
    /**
     * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder getEquipAffixInfoOrBuilder() {
      return getEquipAffixInfo();
    }

    public static final int AVATARGUID_FIELD_NUMBER = 15;
    private long avatarGuid_;
    /**
     * <code>uint64 avatarGuid = 15;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (equipAffixInfo_ != null) {
        output.writeMessage(5, getEquipAffixInfo());
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(15, avatarGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (equipAffixInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getEquipAffixInfo());
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(15, avatarGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify other = (emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify) obj;

      if (hasEquipAffixInfo() != other.hasEquipAffixInfo()) return false;
      if (hasEquipAffixInfo()) {
        if (!getEquipAffixInfo()
            .equals(other.getEquipAffixInfo())) return false;
      }
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      if (hasEquipAffixInfo()) {
        hash = (37 * hash) + EQUIPAFFIXINFO_FIELD_NUMBER;
        hash = (53 * hash) + getEquipAffixInfo().hashCode();
      }
      hash = (37 * hash) + AVATARGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify prototype) {
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
     * Protobuf type {@code AvatarEquipAffixStartNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarEquipAffixStartNotify)
        emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.internal_static_AvatarEquipAffixStartNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.internal_static_AvatarEquipAffixStartNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.class, emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.newBuilder()
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
        if (equipAffixInfoBuilder_ == null) {
          equipAffixInfo_ = null;
        } else {
          equipAffixInfo_ = null;
          equipAffixInfoBuilder_ = null;
        }
        avatarGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.internal_static_AvatarEquipAffixStartNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify build() {
        emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify result = new emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify(this);
        if (equipAffixInfoBuilder_ == null) {
          result.equipAffixInfo_ = equipAffixInfo_;
        } else {
          result.equipAffixInfo_ = equipAffixInfoBuilder_.build();
        }
        result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.getDefaultInstance()) return this;
        if (other.hasEquipAffixInfo()) {
          mergeEquipAffixInfo(other.getEquipAffixInfo());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
        emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo equipAffixInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder> equipAffixInfoBuilder_;
      /**
       * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
       * @return Whether the equipAffixInfo field is set.
       */
      public boolean hasEquipAffixInfo() {
        return equipAffixInfoBuilder_ != null || equipAffixInfo_ != null;
      }
      /**
       * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
       * @return The equipAffixInfo.
       */
      public emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getEquipAffixInfo() {
        if (equipAffixInfoBuilder_ == null) {
          return equipAffixInfo_ == null ? emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance() : equipAffixInfo_;
        } else {
          return equipAffixInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
       */
      public Builder setEquipAffixInfo(emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo value) {
        if (equipAffixInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          equipAffixInfo_ = value;
          onChanged();
        } else {
          equipAffixInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
       */
      public Builder setEquipAffixInfo(
          emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder builderForValue) {
        if (equipAffixInfoBuilder_ == null) {
          equipAffixInfo_ = builderForValue.build();
          onChanged();
        } else {
          equipAffixInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
       */
      public Builder mergeEquipAffixInfo(emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo value) {
        if (equipAffixInfoBuilder_ == null) {
          if (equipAffixInfo_ != null) {
            equipAffixInfo_ =
              emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.newBuilder(equipAffixInfo_).mergeFrom(value).buildPartial();
          } else {
            equipAffixInfo_ = value;
          }
          onChanged();
        } else {
          equipAffixInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
       */
      public Builder clearEquipAffixInfo() {
        if (equipAffixInfoBuilder_ == null) {
          equipAffixInfo_ = null;
          onChanged();
        } else {
          equipAffixInfo_ = null;
          equipAffixInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
       */
      public emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder getEquipAffixInfoBuilder() {
        
        onChanged();
        return getEquipAffixInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
       */
      public emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder getEquipAffixInfoOrBuilder() {
        if (equipAffixInfoBuilder_ != null) {
          return equipAffixInfoBuilder_.getMessageOrBuilder();
        } else {
          return equipAffixInfo_ == null ?
              emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance() : equipAffixInfo_;
        }
      }
      /**
       * <code>.AvatarEquipAffixInfo equipAffixInfo = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder> 
          getEquipAffixInfoFieldBuilder() {
        if (equipAffixInfoBuilder_ == null) {
          equipAffixInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder>(
                  getEquipAffixInfo(),
                  getParentForChildren(),
                  isClean());
          equipAffixInfo_ = null;
        }
        return equipAffixInfoBuilder_;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatarGuid = 15;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatarGuid = 15;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatarGuid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AvatarEquipAffixStartNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarEquipAffixStartNotify)
    private static final emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify();
    }

    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarEquipAffixStartNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarEquipAffixStartNotify>() {
      @java.lang.Override
      public AvatarEquipAffixStartNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarEquipAffixStartNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarEquipAffixStartNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarEquipAffixStartNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarEquipAffixStartNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarEquipAffixStartNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!AvatarEquipAffixStartNotify.proto\032\032Ava" +
      "tarEquipAffixInfo.proto\"\261\001\n\033AvatarEquipA" +
      "ffixStartNotify\022-\n\016equipAffixInfo\030\005 \001(\0132" +
      "\025.AvatarEquipAffixInfo\022\022\n\navatarGuid\030\017 \001" +
      "(\004\"O\n\013CIBOKBFGLBI\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJ" +
      "OJ\020\302\014\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032" +
      "\002\020\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarEquipAffixStartNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarEquipAffixStartNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarEquipAffixStartNotify_descriptor,
        new java.lang.String[] { "EquipAffixInfo", "AvatarGuid", });
    emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
