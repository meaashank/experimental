package com.android.launcher3.touch;

/* JADX INFO: loaded from: classes2.dex */
public class OverScroll {
    private static final float OVERSCROLL_DAMP_FACTOR = 0.07f;

    public static int dampedScroll(float f10, int i10) {
        if (Float.compare(f10, 0.0f) == 0) {
            return 0;
        }
        float f11 = i10;
        float f12 = f10 / f11;
        float fAbs = (f12 / Math.abs(f12)) * overScrollInfluenceCurve(Math.abs(f12));
        if (Math.abs(fAbs) >= 1.0f) {
            fAbs /= Math.abs(fAbs);
        }
        return Math.round(fAbs * OVERSCROLL_DAMP_FACTOR * f11);
    }

    private static float overScrollInfluenceCurve(float f10) {
        float f11 = f10 - 1.0f;
        return (f11 * f11 * f11) + 1.0f;
    }
}
