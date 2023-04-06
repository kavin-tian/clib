//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.webrtc;

import androidx.annotation.Nullable;

public interface VideoEncoderFactory {
    @Nullable
    @CalledByNative
    VideoEncoder createEncoder(VideoCodecInfo var1);

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs();

    @CalledByNative
    default VideoCodecInfo[] getImplementations() {
        return this.getSupportedCodecs();
    }
}
