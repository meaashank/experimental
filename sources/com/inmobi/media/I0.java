package com.inmobi.media;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes5.dex */
public final class I0 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f152036a;

    public I0(J0 j02) {
        this.f152036a = j02;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        kotlin.jvm.internal.G.p(drawable, "drawable");
        super.onAnimationEnd(drawable);
        this.f152036a.e();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        kotlin.jvm.internal.G.p(drawable, "drawable");
        super.onAnimationStart(drawable);
    }
}
