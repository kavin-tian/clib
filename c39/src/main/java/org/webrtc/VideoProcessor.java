//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.webrtc;

import androidx.annotation.Nullable;
import org.webrtc.VideoFrame.Buffer;

public interface VideoProcessor extends CapturerObserver {
    default void onFrameCaptured(VideoFrame frame, FrameAdaptationParameters parameters) {
        VideoFrame adaptedFrame = applyFrameAdaptationParameters(frame, parameters);
        if (adaptedFrame != null) {
            this.onFrameCaptured(adaptedFrame);
            adaptedFrame.release();
        }

    }

    void setSink(@Nullable VideoSink var1);

    @Nullable
    static VideoFrame applyFrameAdaptationParameters(VideoFrame frame, FrameAdaptationParameters parameters) {
        if (parameters.drop) {
            return null;
        } else {
            Buffer adaptedBuffer = frame.getBuffer().cropAndScale(parameters.cropX, parameters.cropY, parameters.cropWidth, parameters.cropHeight, parameters.scaleWidth, parameters.scaleHeight);
            return new VideoFrame(adaptedBuffer, frame.getRotation(), parameters.timestampNs);
        }
    }

    public static class FrameAdaptationParameters {
        public final int cropX;
        public final int cropY;
        public final int cropWidth;
        public final int cropHeight;
        public final int scaleWidth;
        public final int scaleHeight;
        public final long timestampNs;
        public final boolean drop;

        public FrameAdaptationParameters(int cropX, int cropY, int cropWidth, int cropHeight, int scaleWidth, int scaleHeight, long timestampNs, boolean drop) {
            this.cropX = cropX;
            this.cropY = cropY;
            this.cropWidth = cropWidth;
            this.cropHeight = cropHeight;
            this.scaleWidth = scaleWidth;
            this.scaleHeight = scaleHeight;
            this.timestampNs = timestampNs;
            this.drop = drop;
        }
    }
}
