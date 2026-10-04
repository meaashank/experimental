package com.bytedance.adsdk.NOt.mZ.mZ;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends ZRu {
    public Ht(com.bytedance.adsdk.NOt.Vor vor, TFq tFq) {
        super(vor, tFq);
    }

    @Override // com.bytedance.adsdk.NOt.mZ.mZ.ZRu
    public void NOt(Canvas canvas, Matrix matrix, int i10) {
        super.NOt(canvas, matrix, i10);
    }

    @Override // com.bytedance.adsdk.NOt.mZ.mZ.ZRu, com.bytedance.adsdk.NOt.ZRu.ZRu.TFq
    public void ZRu(RectF rectF, Matrix matrix, boolean z10) {
        super.ZRu(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
