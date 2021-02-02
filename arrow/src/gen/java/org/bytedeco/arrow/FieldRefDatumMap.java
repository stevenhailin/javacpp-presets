// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("std::unordered_map<arrow::FieldRef,arrow::Datum,arrow::FieldRef::Hash>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FieldRefDatumMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FieldRefDatumMap(Pointer p) { super(p); }
    public FieldRefDatumMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef FieldRefDatumMap put(@ByRef FieldRefDatumMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef Datum get(@ByRef FieldRef i);
    public native FieldRefDatumMap put(@ByRef FieldRef i, Datum value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @ByRef @Const FieldRef first();
        public native @Name("operator *().second") @MemberGetter @ByRef @Const Datum second();
    }
}
