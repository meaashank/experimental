package com.github.appintro.internal;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ScrollerCustomDuration extends Scroller {
    private double scrollDurationFactor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollerCustomDuration(@NotNull Context context, @NotNull Interpolator interpolator) {
        super(context, interpolator);
        G.p(context, "context");
        G.p(interpolator, "interpolator");
        this.scrollDurationFactor = 6.0d;
    }

    public final double getScrollDurationFactor() {
        return this.scrollDurationFactor;
    }

    public final void setScrollDurationFactor(double d10) {
        this.scrollDurationFactor = d10;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, (int) (((double) i14) * this.scrollDurationFactor));
    }
}
