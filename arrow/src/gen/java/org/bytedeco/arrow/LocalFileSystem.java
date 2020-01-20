// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief EXPERIMENTAL: a FileSystem implementation accessing files
 *  on the local machine.
 * 
 *  This class handles only {@code /}-separated paths.  If desired, conversion
 *  from Windows backslash-separated paths should be done by the caller.
 *  Details such as symlinks are abstracted away (symlinks are always
 *  followed, except when deleting an entry). */
@Namespace("arrow::fs") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class LocalFileSystem extends FileSystem {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LocalFileSystem(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LocalFileSystem(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LocalFileSystem position(long position) {
        return (LocalFileSystem)super.position(position);
    }

  public LocalFileSystem() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** \cond FALSE */
  /** \endcond */
  public native @ByVal Status GetTargetStats(@StdString String path, FileStats out);
  public native @ByVal Status GetTargetStats(@StdString BytePointer path, FileStats out);
  public native @ByVal Status GetTargetStats(@Const @ByRef Selector select, @StdVector FileStats out);

  public native @ByVal Status CreateDir(@StdString String path, @Cast("bool") boolean recursive/*=true*/);
  public native @ByVal Status CreateDir(@StdString String path);
  public native @ByVal Status CreateDir(@StdString BytePointer path, @Cast("bool") boolean recursive/*=true*/);
  public native @ByVal Status CreateDir(@StdString BytePointer path);

  public native @ByVal Status DeleteDir(@StdString String path);
  public native @ByVal Status DeleteDir(@StdString BytePointer path);
  public native @ByVal Status DeleteDirContents(@StdString String path);
  public native @ByVal Status DeleteDirContents(@StdString BytePointer path);

  public native @ByVal Status DeleteFile(@StdString String path);
  public native @ByVal Status DeleteFile(@StdString BytePointer path);

  public native @ByVal Status Move(@StdString String src, @StdString String dest);
  public native @ByVal Status Move(@StdString BytePointer src, @StdString BytePointer dest);

  public native @ByVal Status CopyFile(@StdString String src, @StdString String dest);
  public native @ByVal Status CopyFile(@StdString BytePointer src, @StdString BytePointer dest);

  public native @ByVal Status OpenInputStream(@StdString String path,
                           @SharedPtr InputStream out);
  public native @ByVal Status OpenInputStream(@StdString BytePointer path,
                           @SharedPtr InputStream out);

  public native @ByVal Status OpenInputFile(@StdString String path,
                         @SharedPtr RandomAccessFile out);
  public native @ByVal Status OpenInputFile(@StdString BytePointer path,
                         @SharedPtr RandomAccessFile out);

  public native @ByVal Status OpenOutputStream(@StdString String path,
                            @SharedPtr OutputStream out);
  public native @ByVal Status OpenOutputStream(@StdString BytePointer path,
                            @SharedPtr OutputStream out);

  public native @ByVal Status OpenAppendStream(@StdString String path,
                            @SharedPtr OutputStream out);
  public native @ByVal Status OpenAppendStream(@StdString BytePointer path,
                            @SharedPtr OutputStream out);
}