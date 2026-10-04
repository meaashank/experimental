package com.bytedance.adsdk.NOt;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import i.C4541d;

/* JADX INFO: loaded from: classes2.dex */
class yBV implements Interpolator {
    private final float[] NOt;
    private final float[] ZRu;

    public yBV(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = (int) (length / 0.002f);
        int i11 = i10 + 1;
        this.ZRu = new float[i11];
        this.NOt = new float[i11];
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < i11; i12++) {
            pathMeasure.getPosTan((i12 * length) / i10, fArr, null);
            this.ZRu[i12] = fArr[0];
            this.NOt[i12] = fArr[1];
        }
    }

    private static Path ZRu(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.ZRu.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.ZRu[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.ZRu;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.NOt[i10];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.NOt;
        float f15 = fArr2[i10];
        return C4541d.a(fArr2[length], f15, f14, f15);
    }

    public yBV(float f10, float f11, float f12, float f13) {
        this(ZRu(f10, f11, f12, f13));
    }
}
