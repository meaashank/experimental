package com.inmobi.ads.controllers;

import androidx.annotation.Keep;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.EnumC3675p1;
import com.inmobi.media.L9;
import com.inmobi.media.Xb;
import e.e0;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@e0
@Keep
public abstract class PublisherCallbacks {

    @NotNull
    public static final L9 Companion = new L9();
    public static final byte NORMAL_FLOW = 0;
    public static final byte PRELOAD_FLOW = 1;

    public abstract byte getType();

    public abstract void onAdClicked(@NotNull Map<Object, ? extends Object> map);

    public abstract void onAdDismissed();

    public void onAdDisplayFailed() {
    }

    public abstract void onAdDisplayed(@NotNull AdMetaInfo adMetaInfo);

    public abstract void onAdFetchFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
        G.p(info, "info");
    }

    public void onAdImpressed() {
    }

    public void onAdImpression(@Nullable Xb xb2) {
    }

    public abstract void onAdLoadFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus);

    public abstract void onAdLoadSucceeded(@NotNull AdMetaInfo adMetaInfo);

    public void onAdWillDisplay() {
    }

    public void onAudioStateChanged(boolean z10) {
    }

    public void onAudioStatusChanged(@NotNull EnumC3675p1 audioStatusInternal) {
        G.p(audioStatusInternal, "audioStatusInternal");
    }

    public void onImraidLog(@NotNull String log) {
        G.p(log, "log");
    }

    public abstract void onRequestPayloadCreated(@NotNull byte[] bArr);

    public abstract void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> rewards) {
        G.p(rewards, "rewards");
    }

    public abstract void onUserLeftApplication();

    public void onVideoCompleted() {
    }

    public void onVideoSkipped() {
    }
}
