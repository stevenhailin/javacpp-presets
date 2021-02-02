// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


/************************************************************
 * This is the form of the struct that's stored in the
 * PyCapsule returned by an array's __array_struct__ attribute. See
 * https://docs.scipy.org/doc/numpy/reference/arrays.interface.html for the full
 * documentation.
 ************************************************************/
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArrayInterface extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArrayInterface() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArrayInterface(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArrayInterface(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArrayInterface position(long position) {
        return (PyArrayInterface)super.position(position);
    }
    @Override public PyArrayInterface getPointer(long i) {
        return new PyArrayInterface((Pointer)this).position(position + i);
    }

    public native int two(); public native PyArrayInterface two(int setter);              /*
                           * contains the integer 2 as a sanity
                           * check
                           */

    public native int nd(); public native PyArrayInterface nd(int setter);               /* number of dimensions */

    public native @Cast("char") byte typekind(); public native PyArrayInterface typekind(byte setter);        /*
                           * kind in array --- character code of
                           * typestr
                           */

    public native int itemsize(); public native PyArrayInterface itemsize(int setter);         /* size of each element */

    public native int flags(); public native PyArrayInterface flags(int setter);            /*
                           * how should be data interpreted. Valid
                           * flags are CONTIGUOUS (1), F_CONTIGUOUS (2),
                           * ALIGNED (0x100), NOTSWAPPED (0x200), and
                           * WRITEABLE (0x400).  ARR_HAS_DESCR (0x800)
                           * states that arrdescr field is present in
                           * structure
                           */

    public native @Cast("npy_intp*") SizeTPointer shape(); public native PyArrayInterface shape(SizeTPointer setter);       /*
                            * A length-nd array of shape
                            * information
                            */

    public native @Cast("npy_intp*") SizeTPointer strides(); public native PyArrayInterface strides(SizeTPointer setter);    /* A length-nd array of stride information */

    public native Pointer data(); public native PyArrayInterface data(Pointer setter);           /* A pointer to the first element of the array */

    public native PyObject descr(); public native PyArrayInterface descr(PyObject setter);      /*
                           * A list of fields or NULL (ignored if flags
                           * does not have ARR_HAS_DESCR flag set)
                           */
}
