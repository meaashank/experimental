package com.android.launcher3;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class LogDecelerateInterpolator implements TimeInterpolator {
    int mBase;
    int mDrift;
    final float mLogScale;

    public LogDecelerateInterpolator(int i10, int i11) {
        this.mBase = i10;
        this.mDrift = i11;
        this.mLogScale = 1.0f / computeLog(1.0f, i10, i11);
    }

    public static float computeLog(float f10, int i10, int i11) {
        return (i11 * f10) + ((float) (-Math.pow(i10, -f10))) + 1.0f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (Float.compare(f10, 1.0f) == 0) {
            return 1.0f;
        }
        return computeLog(f10, this.mBase, this.mDrift) * this.mLogScale;
    }
}
