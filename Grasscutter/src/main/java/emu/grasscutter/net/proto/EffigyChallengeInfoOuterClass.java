// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeInfo.proto

package emu.grasscutter.net.proto;

public final class EffigyChallengeInfoOuterClass {
  private EffigyChallengeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_MBHBNIPEPNJ = 5;</code>
     * @return The unk3300MBHBNIPEPNJ.
     */
    int getUnk3300MBHBNIPEPNJ();

    /**
     * <code>uint32 Unk3300_EOGAPBOFHOP = 12;</code>
     * @return The unk3300EOGAPBOFHOP.
     */
    int getUnk3300EOGAPBOFHOP();

    /**
     * <code>uint32 Unk3300_BMPCKGJAGPE = 8;</code>
     * @return The unk3300BMPCKGJAGPE.
     */
    int getUnk3300BMPCKGJAGPE();

    /**
     * <code>uint32 Unk3300_AIEEGIBMOFH = 13;</code>
     * @return The unk3300AIEEGIBMOFH.
     */
    int getUnk3300AIEEGIBMOFH();

    /**
     * <code>uint32 Unk3300_MICPCKIOEJA = 6;</code>
     * @return The unk3300MICPCKIOEJA.
     */
    int getUnk3300MICPCKIOEJA();
  }
  /**
   * Protobuf type {@code EffigyChallengeInfo}
   */
  public static final class EffigyChallengeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeInfo)
      EffigyChallengeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeInfo.newBuilder() to construct.
    private EffigyChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EffigyChallengeInfo(
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
            case 40: {

              unk3300MBHBNIPEPNJ_ = input.readUInt32();
              break;
            }
            case 48: {

              unk3300MICPCKIOEJA_ = input.readUInt32();
              break;
            }
            case 64: {

              unk3300BMPCKGJAGPE_ = input.readUInt32();
              break;
            }
            case 96: {

              unk3300EOGAPBOFHOP_ = input.readUInt32();
              break;
            }
            case 104: {

              unk3300AIEEGIBMOFH_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.internal_static_EffigyChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.internal_static_EffigyChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo.class, emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo.Builder.class);
    }

    public static final int UNK3300_MBHBNIPEPNJ_FIELD_NUMBER = 5;
    private int unk3300MBHBNIPEPNJ_;
    /**
     * <code>uint32 Unk3300_MBHBNIPEPNJ = 5;</code>
     * @return The unk3300MBHBNIPEPNJ.
     */
    @java.lang.Override
    public int getUnk3300MBHBNIPEPNJ() {
      return unk3300MBHBNIPEPNJ_;
    }

    public static final int UNK3300_EOGAPBOFHOP_FIELD_NUMBER = 12;
    private int unk3300EOGAPBOFHOP_;
    /**
     * <code>uint32 Unk3300_EOGAPBOFHOP = 12;</code>
     * @return The unk3300EOGAPBOFHOP.
     */
    @java.lang.Override
    public int getUnk3300EOGAPBOFHOP() {
      return unk3300EOGAPBOFHOP_;
    }

    public static final int UNK3300_BMPCKGJAGPE_FIELD_NUMBER = 8;
    private int unk3300BMPCKGJAGPE_;
    /**
     * <code>uint32 Unk3300_BMPCKGJAGPE = 8;</code>
     * @return The unk3300BMPCKGJAGPE.
     */
    @java.lang.Override
    public int getUnk3300BMPCKGJAGPE() {
      return unk3300BMPCKGJAGPE_;
    }

    public static final int UNK3300_AIEEGIBMOFH_FIELD_NUMBER = 13;
    private int unk3300AIEEGIBMOFH_;
    /**
     * <code>uint32 Unk3300_AIEEGIBMOFH = 13;</code>
     * @return The unk3300AIEEGIBMOFH.
     */
    @java.lang.Override
    public int getUnk3300AIEEGIBMOFH() {
      return unk3300AIEEGIBMOFH_;
    }

    public static final int UNK3300_MICPCKIOEJA_FIELD_NUMBER = 6;
    private int unk3300MICPCKIOEJA_;
    /**
     * <code>uint32 Unk3300_MICPCKIOEJA = 6;</code>
     * @return The unk3300MICPCKIOEJA.
     */
    @java.lang.Override
    public int getUnk3300MICPCKIOEJA() {
      return unk3300MICPCKIOEJA_;
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
      if (unk3300MBHBNIPEPNJ_ != 0) {
        output.writeUInt32(5, unk3300MBHBNIPEPNJ_);
      }
      if (unk3300MICPCKIOEJA_ != 0) {
        output.writeUInt32(6, unk3300MICPCKIOEJA_);
      }
      if (unk3300BMPCKGJAGPE_ != 0) {
        output.writeUInt32(8, unk3300BMPCKGJAGPE_);
      }
      if (unk3300EOGAPBOFHOP_ != 0) {
        output.writeUInt32(12, unk3300EOGAPBOFHOP_);
      }
      if (unk3300AIEEGIBMOFH_ != 0) {
        output.writeUInt32(13, unk3300AIEEGIBMOFH_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300MBHBNIPEPNJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3300MBHBNIPEPNJ_);
      }
      if (unk3300MICPCKIOEJA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3300MICPCKIOEJA_);
      }
      if (unk3300BMPCKGJAGPE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3300BMPCKGJAGPE_);
      }
      if (unk3300EOGAPBOFHOP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk3300EOGAPBOFHOP_);
      }
      if (unk3300AIEEGIBMOFH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3300AIEEGIBMOFH_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo other = (emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo) obj;

      if (getUnk3300MBHBNIPEPNJ()
          != other.getUnk3300MBHBNIPEPNJ()) return false;
      if (getUnk3300EOGAPBOFHOP()
          != other.getUnk3300EOGAPBOFHOP()) return false;
      if (getUnk3300BMPCKGJAGPE()
          != other.getUnk3300BMPCKGJAGPE()) return false;
      if (getUnk3300AIEEGIBMOFH()
          != other.getUnk3300AIEEGIBMOFH()) return false;
      if (getUnk3300MICPCKIOEJA()
          != other.getUnk3300MICPCKIOEJA()) return false;
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
      hash = (37 * hash) + UNK3300_MBHBNIPEPNJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MBHBNIPEPNJ();
      hash = (37 * hash) + UNK3300_EOGAPBOFHOP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EOGAPBOFHOP();
      hash = (37 * hash) + UNK3300_BMPCKGJAGPE_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300BMPCKGJAGPE();
      hash = (37 * hash) + UNK3300_AIEEGIBMOFH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300AIEEGIBMOFH();
      hash = (37 * hash) + UNK3300_MICPCKIOEJA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MICPCKIOEJA();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo prototype) {
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
     * Protobuf type {@code EffigyChallengeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeInfo)
        emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.internal_static_EffigyChallengeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.internal_static_EffigyChallengeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo.class, emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo.newBuilder()
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
        unk3300MBHBNIPEPNJ_ = 0;

        unk3300EOGAPBOFHOP_ = 0;

        unk3300BMPCKGJAGPE_ = 0;

        unk3300AIEEGIBMOFH_ = 0;

        unk3300MICPCKIOEJA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.internal_static_EffigyChallengeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo build() {
        emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo buildPartial() {
        emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo result = new emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo(this);
        result.unk3300MBHBNIPEPNJ_ = unk3300MBHBNIPEPNJ_;
        result.unk3300EOGAPBOFHOP_ = unk3300EOGAPBOFHOP_;
        result.unk3300BMPCKGJAGPE_ = unk3300BMPCKGJAGPE_;
        result.unk3300AIEEGIBMOFH_ = unk3300AIEEGIBMOFH_;
        result.unk3300MICPCKIOEJA_ = unk3300MICPCKIOEJA_;
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
        if (other instanceof emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo other) {
        if (other == emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo.getDefaultInstance()) return this;
        if (other.getUnk3300MBHBNIPEPNJ() != 0) {
          setUnk3300MBHBNIPEPNJ(other.getUnk3300MBHBNIPEPNJ());
        }
        if (other.getUnk3300EOGAPBOFHOP() != 0) {
          setUnk3300EOGAPBOFHOP(other.getUnk3300EOGAPBOFHOP());
        }
        if (other.getUnk3300BMPCKGJAGPE() != 0) {
          setUnk3300BMPCKGJAGPE(other.getUnk3300BMPCKGJAGPE());
        }
        if (other.getUnk3300AIEEGIBMOFH() != 0) {
          setUnk3300AIEEGIBMOFH(other.getUnk3300AIEEGIBMOFH());
        }
        if (other.getUnk3300MICPCKIOEJA() != 0) {
          setUnk3300MICPCKIOEJA(other.getUnk3300MICPCKIOEJA());
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
        emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300MBHBNIPEPNJ_ ;
      /**
       * <code>uint32 Unk3300_MBHBNIPEPNJ = 5;</code>
       * @return The unk3300MBHBNIPEPNJ.
       */
      @java.lang.Override
      public int getUnk3300MBHBNIPEPNJ() {
        return unk3300MBHBNIPEPNJ_;
      }
      /**
       * <code>uint32 Unk3300_MBHBNIPEPNJ = 5;</code>
       * @param value The unk3300MBHBNIPEPNJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MBHBNIPEPNJ(int value) {
        
        unk3300MBHBNIPEPNJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MBHBNIPEPNJ = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MBHBNIPEPNJ() {
        
        unk3300MBHBNIPEPNJ_ = 0;
        onChanged();
        return this;
      }

      private int unk3300EOGAPBOFHOP_ ;
      /**
       * <code>uint32 Unk3300_EOGAPBOFHOP = 12;</code>
       * @return The unk3300EOGAPBOFHOP.
       */
      @java.lang.Override
      public int getUnk3300EOGAPBOFHOP() {
        return unk3300EOGAPBOFHOP_;
      }
      /**
       * <code>uint32 Unk3300_EOGAPBOFHOP = 12;</code>
       * @param value The unk3300EOGAPBOFHOP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EOGAPBOFHOP(int value) {
        
        unk3300EOGAPBOFHOP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EOGAPBOFHOP = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EOGAPBOFHOP() {
        
        unk3300EOGAPBOFHOP_ = 0;
        onChanged();
        return this;
      }

      private int unk3300BMPCKGJAGPE_ ;
      /**
       * <code>uint32 Unk3300_BMPCKGJAGPE = 8;</code>
       * @return The unk3300BMPCKGJAGPE.
       */
      @java.lang.Override
      public int getUnk3300BMPCKGJAGPE() {
        return unk3300BMPCKGJAGPE_;
      }
      /**
       * <code>uint32 Unk3300_BMPCKGJAGPE = 8;</code>
       * @param value The unk3300BMPCKGJAGPE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300BMPCKGJAGPE(int value) {
        
        unk3300BMPCKGJAGPE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_BMPCKGJAGPE = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300BMPCKGJAGPE() {
        
        unk3300BMPCKGJAGPE_ = 0;
        onChanged();
        return this;
      }

      private int unk3300AIEEGIBMOFH_ ;
      /**
       * <code>uint32 Unk3300_AIEEGIBMOFH = 13;</code>
       * @return The unk3300AIEEGIBMOFH.
       */
      @java.lang.Override
      public int getUnk3300AIEEGIBMOFH() {
        return unk3300AIEEGIBMOFH_;
      }
      /**
       * <code>uint32 Unk3300_AIEEGIBMOFH = 13;</code>
       * @param value The unk3300AIEEGIBMOFH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AIEEGIBMOFH(int value) {
        
        unk3300AIEEGIBMOFH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_AIEEGIBMOFH = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300AIEEGIBMOFH() {
        
        unk3300AIEEGIBMOFH_ = 0;
        onChanged();
        return this;
      }

      private int unk3300MICPCKIOEJA_ ;
      /**
       * <code>uint32 Unk3300_MICPCKIOEJA = 6;</code>
       * @return The unk3300MICPCKIOEJA.
       */
      @java.lang.Override
      public int getUnk3300MICPCKIOEJA() {
        return unk3300MICPCKIOEJA_;
      }
      /**
       * <code>uint32 Unk3300_MICPCKIOEJA = 6;</code>
       * @param value The unk3300MICPCKIOEJA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MICPCKIOEJA(int value) {
        
        unk3300MICPCKIOEJA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MICPCKIOEJA = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MICPCKIOEJA() {
        
        unk3300MICPCKIOEJA_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeInfo)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeInfo)
    private static final emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo();
    }

    public static emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeInfo>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeInfo>() {
      @java.lang.Override
      public EffigyChallengeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EffigyChallengeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EffigyChallengeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EffigyChallengeInfoOuterClass.EffigyChallengeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031EffigyChallengeInfo.proto\"\246\001\n\023EffigyCh" +
      "allengeInfo\022\033\n\023Unk3300_MBHBNIPEPNJ\030\005 \001(\r" +
      "\022\033\n\023Unk3300_EOGAPBOFHOP\030\014 \001(\r\022\033\n\023Unk3300" +
      "_BMPCKGJAGPE\030\010 \001(\r\022\033\n\023Unk3300_AIEEGIBMOF" +
      "H\030\r \001(\r\022\033\n\023Unk3300_MICPCKIOEJA\030\006 \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeInfo_descriptor,
        new java.lang.String[] { "Unk3300MBHBNIPEPNJ", "Unk3300EOGAPBOFHOP", "Unk3300BMPCKGJAGPE", "Unk3300AIEEGIBMOFH", "Unk3300MICPCKIOEJA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
