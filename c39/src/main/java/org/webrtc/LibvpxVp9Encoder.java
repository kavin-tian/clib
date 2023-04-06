//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.webrtc;

public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    public LibvpxVp9Encoder() {
    }

    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }

    static native long nativeCreateEncoder();

    public boolean isHardwareEncoder() {
        return false;
    }

    static native boolean nativeIsSupported();
}
