// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;
                 // below

// An UnknownFieldSet contains fields that were encountered while parsing a
// message but were not defined by its type.  Keeping track of these can be
// useful, especially in that they may be written if the message is serialized
// again without being cleared in between.  This means that software which
// simply receives messages and forwards them to other servers does not need
// to be updated every time a new field is added to the message definition.
//
// To get the UnknownFieldSet attached to any message, call
// Reflection::GetUnknownFields().
//
// This class is necessarily tied to the protocol buffer wire format, unlike
// the Reflection interface which is independent of any serialization scheme.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class UnknownFieldSet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnknownFieldSet(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UnknownFieldSet(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public UnknownFieldSet position(long position) {
        return (UnknownFieldSet)super.position(position);
    }
    @Override public UnknownFieldSet getPointer(long i) {
        return new UnknownFieldSet((Pointer)this).position(position + i);
    }

  public UnknownFieldSet() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Remove all fields.
  public native void Clear();

  // Remove all fields and deallocate internal data objects
  public native void ClearAndFreeMemory();

  // Is this set empty?
  public native @Cast("bool") boolean empty();

  // Merge the contents of some other UnknownFieldSet with this one.
  public native void MergeFrom(@Const @ByRef UnknownFieldSet other);

  // Similar to above, but this function will destroy the contents of other.
  public native void MergeFromAndDestroy(UnknownFieldSet other);

  // Merge the contents an UnknownFieldSet with the UnknownFieldSet in
  // *metadata, if there is one.  If *metadata doesn't have an UnknownFieldSet
  // then add one to it and make it be a copy of the first arg.
  public static native void MergeToInternalMetdata(
        @Const @ByRef UnknownFieldSet other,
        InternalMetadataWithArena metadata);

  // Swaps the contents of some other UnknownFieldSet with this one.
  public native void Swap(UnknownFieldSet x);

  // Computes (an estimate of) the total number of bytes currently used for
  // storing the unknown fields in memory. Does NOT include
  // sizeof(*this) in the calculation.
  public native @Cast("size_t") long SpaceUsedExcludingSelfLong();

  public native int SpaceUsedExcludingSelf();

  // Version of SpaceUsed() including sizeof(*this).
  public native @Cast("size_t") long SpaceUsedLong();

  public native int SpaceUsed();

  // Returns the number of fields present in the UnknownFieldSet.
  public native int field_count();
  // Get a field in the set, where 0 <= index < field_count().  The fields
  // appear in the order in which they were added.
  public native @Const @ByRef UnknownField field(int index);
  // Get a mutable pointer to a field in the set, where
  // 0 <= index < field_count().  The fields appear in the order in which
  // they were added.
  public native UnknownField mutable_field(int index);

  // Adding fields ---------------------------------------------------

  public native void AddVarint(int number, @Cast("google::protobuf::uint64") long value);
  public native void AddFixed32(int number, @Cast("google::protobuf::uint32") int value);
  public native void AddFixed64(int number, @Cast("google::protobuf::uint64") long value);
  public native void AddLengthDelimited(int number, @StdString BytePointer value);
  public native void AddLengthDelimited(int number, @StdString String value);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer AddLengthDelimited(int number);
  public native UnknownFieldSet AddGroup(int number);

  // Adds an unknown field from another set.
  public native void AddField(@Const @ByRef UnknownField field);

  // Delete fields with indices in the range [start .. start+num-1].
  // Caution: implementation moves all fields with indices [start+num .. ].
  public native void DeleteSubrange(int start, int num);

  // Delete all fields with a specific field number. The order of left fields
  // is preserved.
  // Caution: implementation moves all fields after the first deleted field.
  public native void DeleteByNumber(int number);

  // Parsing helpers -------------------------------------------------
  // These work exactly like the similarly-named methods of Message.

  public native @Cast("bool") boolean MergeFromCodedStream(CodedInputStream input);
  public native @Cast("bool") boolean ParseFromCodedStream(CodedInputStream input);
  public native @Cast("bool") boolean ParseFromZeroCopyStream(ZeroCopyInputStream input);
  public native @Cast("bool") boolean ParseFromArray(@Const Pointer data, int size);
  public native @Cast("bool") boolean ParseFromString(@StdString BytePointer data);
  public native @Cast("bool") boolean ParseFromString(@StdString String data);

  public static native @Const UnknownFieldSet default_instance();
}
