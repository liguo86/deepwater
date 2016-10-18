// Targeted by JavaCPP version unknown: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.caffe.*;

// The following code has been generated by JavaCPP.

public class americano extends org.bytedeco.javacpp.presets.americano {
    static { Loader.load(); }

@Name("std::vector<caffe::FloatNCCL*>") public static class NCCLVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NCCLVector(Pointer p) { super(p); }
    public NCCLVector(FloatNCCL ... array) { this(array.length); put(array); }
    public NCCLVector()       { allocate();  }
    public NCCLVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef NCCLVector put(@ByRef NCCLVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native FloatNCCL get(@Cast("size_t") long i);
    public native NCCLVector put(@Cast("size_t") long i, FloatNCCL value);

    public NCCLVector put(FloatNCCL ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

// Parsed from americano.hpp

// #ifndef AMERICANO_HPP
// #define AMERICANO_HPP

// #include <boost/thread.hpp>
// #include <glog/logging.h>
// #include <csignal>
// #include <cuda_runtime.h>
// #include <iostream>
// #include <string.h>

// #include "caffe/caffe.hpp"
// #include "caffe/parallel.hpp"
// #include "caffe/util/db.hpp"
// #include "google/protobuf/message.h"

@Namespace("caffe") public static native void installFailureSignalHandler();

@Namespace("caffe") public static native void sigstop();

@Namespace("caffe") public static native int device_count();
@Namespace("caffe") public static native int get_device();
@Namespace("caffe") public static native void set_device(int device);

@Namespace("caffe") public static native int ptr_device(FloatPointer ptr);
@Namespace("caffe") public static native int ptr_device(FloatBuffer ptr);
@Namespace("caffe") public static native int ptr_device(float[] ptr);

@Namespace("caffe") @NoOffset public static class Barrier extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Barrier(Pointer p) { super(p); }

  public Barrier(int count) { super((Pointer)null); allocate(count); }
  private native void allocate(int count);

  public native void Wait();
}

@Namespace("caffe") @NoOffset public static class FloatNCCL extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatNCCL(Pointer p) { super(p); }

  public FloatNCCL(@SharedPtr FloatSolver solver, Barrier barrier) { super((Pointer)null); allocate(solver, barrier); }
  private native void allocate(@SharedPtr FloatSolver solver, Barrier barrier);

  public static native void InitSingleProcess(@Const @ByRef NCCLVector nccls);

  public native void Broadcast();
}



// #endif


}