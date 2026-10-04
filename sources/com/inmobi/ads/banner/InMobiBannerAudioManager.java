package com.inmobi.ads.banner;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.J4;
import dd.o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class InMobiBannerAudioManager {

    @NotNull
    public static final InMobiBannerAudioManager INSTANCE = new InMobiBannerAudioManager();

    public static InMobiBanner a(ViewGroup viewGroup) {
        InMobiBanner inMobiBannerA;
        if (viewGroup instanceof InMobiBanner) {
            if (viewGroup.getVisibility() == 0 && viewGroup.isShown()) {
                return (InMobiBanner) viewGroup;
            }
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof ViewGroup) && (inMobiBannerA = a((ViewGroup) childAt)) != null) {
                return inMobiBannerA;
            }
        }
        return null;
    }

    @o
    public static final void setAudioEnabled(boolean z10) {
        J4 j42 = J4.f152122c;
        J4.f152123d.set(z10);
    }

    @o
    public static final <T extends ViewGroup> void setAudioListener(@NotNull T t10, @NotNull AudioListener audioListener) {
        G.p(t10, "t");
        G.p(audioListener, "audioListener");
        INSTANCE.getClass();
        InMobiBanner inMobiBannerA = a(t10);
        if (inMobiBannerA == null || !inMobiBannerA.isAudioAd()) {
            return;
        }
        inMobiBannerA.setAudioListener(audioListener);
    }
}
