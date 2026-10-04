package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import e.InterfaceC4337k;
import e.InterfaceC4348w;

/* JADX INFO: loaded from: classes4.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    protected DrawableWithAnimatedVisibilityChange drawable;
    S spec;

    public DrawingDelegate(S s10) {
        this.spec = s10;
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @InterfaceC4337k int i10);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void registerDrawable(@NonNull DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        this.drawable = drawableWithAnimatedVisibilityChange;
    }

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f10);
    }
}
