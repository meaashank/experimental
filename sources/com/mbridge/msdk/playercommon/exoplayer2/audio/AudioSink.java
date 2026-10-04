package com.mbridge.msdk.playercommon.exoplayer2.audio;

import U6.j;
import android.support.v4.media.c;
import androidx.annotation.Nullable;
import androidx.collection.C1545m0;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;

    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th) {
            super(th);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i10, int i11, int i12, int i13) {
            StringBuilder sbA = C1545m0.a("AudioTrack init failed: ", i10, ", Config(", i11, j.f68738d);
            sbA.append(i12);
            sbA.append(j.f68738d);
            sbA.append(i13);
            sbA.append(")");
            super(sbA.toString());
            this.audioTrackState = i10;
        }
    }

    public interface Listener {
        void onAudioSessionId(int i10);

        void onPositionDiscontinuity();

        void onUnderrun(int i10, long j10, long j11);
    }

    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i10) {
            super(c.a("AudioTrack write failed: ", i10));
            this.errorCode = i10;
        }
    }

    void configure(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, int i15) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21(int i10);

    long getCurrentPositionUs(boolean z10);

    PlaybackParameters getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j10) throws InitializationException, WriteException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEncodingSupported(int i10);

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void release();

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i10);

    void setListener(Listener listener);

    PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters);

    void setVolume(float f10);
}
