//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.webrtc;

public interface RefCounted {
    void retain();

    @CalledByNative
    void release();
}
