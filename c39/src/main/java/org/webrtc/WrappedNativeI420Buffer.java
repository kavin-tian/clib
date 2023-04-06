//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;

class WrappedNativeI420Buffer implements I420Buffer {
    private final int width;
    private final int height;
    private final ByteBuffer dataY;
    private final int strideY;
    private final ByteBuffer dataU;
    private final int strideU;
    private final ByteBuffer dataV;
    private final int strideV;
    private final long nativeBuffer;

    @CalledByNative
    WrappedNativeI420Buffer(int width, int height, ByteBuffer dataY, int strideY, ByteBuffer dataU, int strideU, ByteBuffer dataV, int strideV, long nativeBuffer) {
        this.width = width;
        this.height = height;
        this.dataY = dataY;
        this.strideY = strideY;
        this.dataU = dataU;
        this.strideU = strideU;
        this.dataV = dataV;
        this.strideV = strideV;
        this.nativeBuffer = nativeBuffer;
        this.retain();
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    public int getStrideY() {
        return this.strideY;
    }

    public int getStrideU() {
        return this.strideU;
    }

    public int getStrideV() {
        return this.strideV;
    }

    public I420Buffer toI420() {
        this.retain();
        return this;
    }

    public void retain() {
        JniCommon.nativeAddRef(this.nativeBuffer);
    }

    public void release() {
        JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    public Buffer cropAndScale(int cropX, int cropY, int cropWidth, int cropHeight, int scaleWidth, int scaleHeight) {
        return JavaI420Buffer.cropAndScaleI420(this, cropX, cropY, cropWidth, cropHeight, scaleWidth, scaleHeight);
    }
}
