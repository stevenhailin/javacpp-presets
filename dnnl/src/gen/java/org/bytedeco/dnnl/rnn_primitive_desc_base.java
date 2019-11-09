// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \}
 <p>
 *  \addtogroup cpp_api_rnn RNN
 *  A primitive to compute common recurrent layer.
 * 
 *  @see \ref dev_guide_rnn in developer guide
 *  @see \ref c_api_rnn in \ref c_api
 *  \{ */

@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class rnn_primitive_desc_base extends org.bytedeco.dnnl.primitive_desc {
    static { Loader.load(); }

    
        
        
            public rnn_primitive_desc_base() { super((Pointer)null); allocate(); }
            private native void allocate();
    
        
        ///
        public rnn_primitive_desc_base(const_dnnl_op_desc_t desc, @Const primitive_attr attr,
                    @Const @ByRef engine e, @Const dnnl_primitive_desc hint_fwd_pd,
                    @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd, allow_empty); }
        private native void allocate(const_dnnl_op_desc_t desc, @Const primitive_attr attr,
                    @Const @ByRef engine e, @Const dnnl_primitive_desc hint_fwd_pd,
                    @Cast("bool") boolean allow_empty/*=false*/);
        public rnn_primitive_desc_base(const_dnnl_op_desc_t desc, @Const primitive_attr attr,
                    @Const @ByRef engine e, @Const dnnl_primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(const_dnnl_op_desc_t desc, @Const primitive_attr attr,
                    @Const @ByRef engine e, @Const dnnl_primitive_desc hint_fwd_pd);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rnn_primitive_desc_base(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rnn_primitive_desc_base(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public rnn_primitive_desc_base position(long position) {
        return (rnn_primitive_desc_base)super.position(position);
    }

}