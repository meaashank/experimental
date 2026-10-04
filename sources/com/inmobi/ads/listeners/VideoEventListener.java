package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiNative;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class VideoEventListener {
    public void onAudioStateChanged(@NotNull InMobiNative inMobiNative, boolean z10) {
        G.p(inMobiNative, "inMobiNative");
    }

    public void onVideoCompleted(@NotNull InMobiNative ad2) {
        G.p(ad2, "ad");
    }

    public void onVideoSkipped(@NotNull InMobiNative ad2) {
        G.p(ad2, "ad");
    }
}
