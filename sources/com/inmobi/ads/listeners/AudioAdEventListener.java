package com.inmobi.ads.listeners;

import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AudioAdEventListener extends AdEventListener<InMobiAudio> {
    public void onAdDismissed(@NotNull InMobiAudio ad2) {
        G.p(ad2, "ad");
    }

    public void onAdDisplayFailed(@NotNull InMobiAudio ad2) {
        G.p(ad2, "ad");
    }

    public void onAdDisplayed(@NotNull InMobiAudio ad2) {
        G.p(ad2, "ad");
    }

    public void onAdFetchFailed(@NotNull InMobiAudio ad2, @NotNull InMobiAdRequestStatus status) {
        G.p(ad2, "ad");
        G.p(status, "status");
    }

    public void onAudioStatusChanged(@NotNull InMobiAudio ad2, @NotNull AudioStatus audioStatus) {
        G.p(ad2, "ad");
        G.p(audioStatus, "audioStatus");
    }

    public void onRewardsUnlocked(@NotNull InMobiAudio ad2, @NotNull Map<Object, ? extends Object> rewards) {
        G.p(ad2, "ad");
        G.p(rewards, "rewards");
    }

    public void onUserLeftApplication(@NotNull InMobiAudio ad2) {
        G.p(ad2, "ad");
    }
}
