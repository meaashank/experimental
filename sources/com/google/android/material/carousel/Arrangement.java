package com.google.android.material.carousel;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    public Arrangement(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.priority = i10;
        this.smallSize = O0.a.d(f10, f11, f12);
        this.smallCount = i11;
        this.mediumSize = f13;
        this.mediumCount = i12;
        this.largeSize = f14;
        this.largeCount = i13;
        fit(f15, f11, f12, f14);
        this.cost = cost(f14);
    }

    private float calculateLargeSize(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    private float cost(float f10) {
        if (isValid()) {
            return Math.abs(f10 - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    public static Arrangement findLowestCostArrangement(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        Arrangement arrangement = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    Arrangement arrangement2 = new Arrangement(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return arrangement;
    }

    private void fit(float f10, float f11, float f12, float f13) {
        float space = f10 - getSpace();
        int i10 = this.smallCount;
        if (i10 > 0 && space > 0.0f) {
            float f14 = this.smallSize;
            this.smallSize = Math.min(space / i10, f12 - f14) + f14;
        } else if (i10 > 0 && space < 0.0f) {
            float f15 = this.smallSize;
            this.smallSize = Math.max(space / i10, f11 - f15) + f15;
        }
        int i11 = this.smallCount;
        float f16 = i11 > 0 ? this.smallSize : 0.0f;
        this.smallSize = f16;
        float fCalculateLargeSize = calculateLargeSize(f10, i11, f16, this.mediumCount, this.largeCount);
        this.largeSize = fCalculateLargeSize;
        float f17 = (this.smallSize + fCalculateLargeSize) / 2.0f;
        this.mediumSize = f17;
        int i12 = this.mediumCount;
        if (i12 <= 0 || fCalculateLargeSize == f13) {
            return;
        }
        float f18 = (f13 - fCalculateLargeSize) * this.largeCount;
        float fMin = Math.min(Math.abs(f18), f17 * 0.1f * i12);
        if (f18 > 0.0f) {
            this.mediumSize -= fMin / this.mediumCount;
            this.largeSize = (fMin / this.largeCount) + this.largeSize;
        } else {
            this.mediumSize = (fMin / this.mediumCount) + this.mediumSize;
            this.largeSize -= fMin / this.largeCount;
        }
    }

    private float getSpace() {
        return (this.smallSize * this.smallCount) + (this.mediumSize * this.mediumCount) + (this.largeSize * this.largeCount);
    }

    private boolean isValid() {
        int i10 = this.largeCount;
        if (i10 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i10 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f10 = this.largeSize;
        float f11 = this.mediumSize;
        return f10 > f11 && f11 > this.smallSize;
    }

    public int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + "]";
    }
}
