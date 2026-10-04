package com.inmobi.media;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3500c8 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f152798a;

    public C3500c8(C3528e8 view) {
        kotlin.jvm.internal.G.p(view, "view");
        this.f152798a = new WeakReference(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        kotlin.jvm.internal.G.p(animation, "animation");
        C3528e8 c3528e8 = (C3528e8) this.f152798a.get();
        if (c3528e8 == null) {
            return;
        }
        int visibility = c3528e8.getVisibility();
        if (visibility == 4 || visibility == 8) {
            kotlin.jvm.internal.G.n(animation.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            if (((Float) r6).floatValue() >= 1.0d) {
                c3528e8.a();
                return;
            }
            return;
        }
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.G.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c3528e8.f152862l = 360 * ((Float) animatedValue).floatValue();
        c3528e8.invalidate();
    }
}
