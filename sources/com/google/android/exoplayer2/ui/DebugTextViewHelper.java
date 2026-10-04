package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.support.v4.media.e;
import android.widget.TextView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class DebugTextViewHelper extends Player.DefaultEventListener implements Runnable {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final SimpleExoPlayer player;
    private boolean started;
    private final TextView textView;

    public DebugTextViewHelper(SimpleExoPlayer simpleExoPlayer, TextView textView) {
        this.player = simpleExoPlayer;
        this.textView = textView;
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        return " sib:" + decoderCounters.skippedInputBufferCount + " sb:" + decoderCounters.skippedOutputBufferCount + " rb:" + decoderCounters.renderedOutputBufferCount + " db:" + decoderCounters.droppedBufferCount + " mcdb:" + decoderCounters.maxConsecutiveDroppedBufferCount + " dk:" + decoderCounters.droppedToKeyframeCount;
    }

    private static String getPixelAspectRatioString(float f10) {
        return (f10 == -1.0f || f10 == 1.0f) ? "" : " par:".concat(String.format(Locale.US, "%.02f", Float.valueOf(f10)));
    }

    public String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        if (audioFormat == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(audioFormat.sampleMimeType);
        sb2.append("(id:");
        sb2.append(audioFormat.f150732id);
        sb2.append(" hz:");
        sb2.append(audioFormat.sampleRate);
        sb2.append(" ch:");
        sb2.append(audioFormat.channelCount);
        return e.a(sb2, getDecoderCountersBufferCountString(this.player.getAudioDecoderCounters()), ")");
    }

    public String getDebugString() {
        return getPlayerStateString() + getVideoString() + getAudioString();
    }

    public String getPlayerStateString() {
        int playbackState = this.player.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s window:%s", Boolean.valueOf(this.player.getPlayWhenReady()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle", Integer.valueOf(this.player.getCurrentWindowIndex()));
    }

    public String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        if (videoFormat == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(videoFormat.sampleMimeType);
        sb2.append("(id:");
        sb2.append(videoFormat.f150732id);
        sb2.append(" r:");
        sb2.append(videoFormat.width);
        sb2.append("x");
        sb2.append(videoFormat.height);
        sb2.append(getPixelAspectRatioString(videoFormat.pixelWidthHeightRatio));
        return e.a(sb2, getDecoderCountersBufferCountString(this.player.getVideoDecoderCounters()), ")");
    }

    @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlayerStateChanged(boolean z10, int i10) {
        updateAndPost();
    }

    @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
    public final void onPositionDiscontinuity(int i10) {
        updateAndPost();
    }

    @Override // java.lang.Runnable
    public final void run() {
        updateAndPost();
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.addListener(this);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this);
            this.textView.removeCallbacks(this);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this);
        this.textView.postDelayed(this, 1000L);
    }
}
