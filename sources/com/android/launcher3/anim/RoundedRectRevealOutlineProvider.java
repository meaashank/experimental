package com.android.launcher3.anim;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedRectRevealOutlineProvider extends RevealOutlineAnimation {
    private final float mEndRadius;
    private final Rect mEndRect;
    private final float mStartRadius;
    private final Rect mStartRect;

    public RoundedRectRevealOutlineProvider(float f10, float f11, Rect rect, Rect rect2) {
        this.mStartRadius = f10;
        this.mEndRadius = f11;
        this.mStartRect = rect;
        this.mEndRect = rect2;
    }

    @Override // com.android.launcher3.anim.RevealOutlineAnimation
    public void setProgress(float f10) {
        float f11 = 1.0f - f10;
        this.mOutlineRadius = (this.mEndRadius * f10) + (this.mStartRadius * f11);
        Rect rect = this.mOutline;
        Rect rect2 = this.mStartRect;
        Rect rect3 = this.mEndRect;
        rect.left = (int) ((rect3.left * f10) + (rect2.left * f11));
        rect.top = (int) ((rect3.top * f10) + (rect2.top * f11));
        rect.right = (int) ((rect3.right * f10) + (rect2.right * f11));
        rect.bottom = (int) ((f10 * rect3.bottom) + (f11 * rect2.bottom));
    }

    @Override // com.android.launcher3.anim.RevealOutlineAnimation
    public boolean shouldRemoveElevationDuringAnimation() {
        return false;
    }
}
