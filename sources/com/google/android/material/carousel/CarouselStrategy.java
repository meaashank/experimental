package com.google.android.material.carousel;

import android.view.View;
import androidx.annotation.NonNull;
import e.InterfaceC4348w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CarouselStrategy {
    public static int[] doubleCounts(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public static float getChildMaskPercentage(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public boolean isContained() {
        return true;
    }

    public abstract KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view);

    public boolean shouldRefreshKeylineState(Carousel carousel, int i10) {
        return false;
    }
}
