// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TypeProto_Opaque extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeProto_Opaque(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypeProto_Opaque(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TypeProto_Opaque position(long position) {
        return (TypeProto_Opaque)super.position(position);
    }
    @Override public TypeProto_Opaque getPointer(long i) {
        return new TypeProto_Opaque((Pointer)this).position(position + i);
    }

  public TypeProto_Opaque() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TypeProto_Opaque(@Const @ByRef TypeProto_Opaque from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TypeProto_Opaque from);

  public native @ByRef @Name("operator =") TypeProto_Opaque put(@Const @ByRef TypeProto_Opaque from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef TypeProto_Opaque default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TypeProto_Opaque internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(TypeProto_Opaque other);
  

  // implements Message ----------------------------------------------

  public native TypeProto_Opaque New();

  public native TypeProto_Opaque New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TypeProto_Opaque from);
  public native void MergeFrom(@Const @ByRef TypeProto_Opaque from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional string domain = 1;
  public native @Cast("bool") boolean has_domain();
  public native void clear_domain();
  @MemberGetter public static native int kDomainFieldNumber();
  public static final int kDomainFieldNumber = kDomainFieldNumber();
  public native @StdString BytePointer domain();
  public native void set_domain(@StdString BytePointer value);
  public native void set_domain(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_domain(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_domain(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_domain();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_domain();
  public native void set_allocated_domain(@StdString @Cast({"char*", "std::string*"}) BytePointer domain);

  // optional string name = 2;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);
}
