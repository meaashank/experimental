package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.K0;
import com.inmobi.media.L0;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f10, float f11) {
        G.p(animationType, "animationType");
        int i10 = a.f151709a[animationType.ordinal()];
        if (i10 == 1) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i10 == 2) {
            K0 k02 = new K0(f10 / 2.0f, f11 / 2.0f);
            k02.setDuration(500L);
            k02.setFillAfter(false);
            k02.setInterpolator(new AccelerateInterpolator());
            return k02;
        }
        if (i10 != 3) {
            return null;
        }
        L0 l02 = new L0(f10 / 2.0f, f11 / 2.0f);
        l02.setDuration(500L);
        l02.setFillAfter(false);
        l02.setInterpolator(new AccelerateInterpolator());
        return l02;
    }
}
