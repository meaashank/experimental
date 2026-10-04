package com.bytedance.adsdk.NOt.mZ.mZ;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class FA extends ZRu {
    private final Paint FA;
    private final RectF Mm;
    private final float[] Vor;
    private final TFq ZH;
    private final Path aT;
    private com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<ColorFilter, ColorFilter> lp;

    public FA(com.bytedance.adsdk.NOt.Vor vor, TFq tFq) {
        super(vor, tFq);
        this.Mm = new RectF();
        com.bytedance.adsdk.NOt.ZRu.ZRu zRu = new com.bytedance.adsdk.NOt.ZRu.ZRu();
        this.FA = zRu;
        this.Vor = new float[8];
        this.aT = new Path();
        this.ZH = tFq;
        zRu.setAlpha(0);
        zRu.setStyle(Paint.Style.FILL);
        zRu.setColor(tFq.yBV());
    }

    @Override // com.bytedance.adsdk.NOt.mZ.mZ.ZRu
    public void NOt(Canvas canvas, Matrix matrix, int i10) {
        super.NOt(canvas, matrix, i10);
        int iAlpha = Color.alpha(this.ZH.yBV());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.uR.ZRu() == null ? 100 : this.uR.ZRu().Mm().intValue())) / 100.0f) * (i10 / 255.0f) * 255.0f);
        this.FA.setAlpha(iIntValue);
        com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<ColorFilter, ColorFilter> zRu = this.lp;
        if (zRu != null) {
            this.FA.setColorFilter(zRu.Mm());
        }
        if (iIntValue > 0) {
            float[] fArr = this.Vor;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.ZH.qF();
            float[] fArr2 = this.Vor;
            fArr2[3] = 0.0f;
            fArr2[4] = this.ZH.qF();
            this.Vor[5] = this.ZH.WMI();
            float[] fArr3 = this.Vor;
            fArr3[6] = 0.0f;
            fArr3[7] = this.ZH.WMI();
            matrix.mapPoints(this.Vor);
            this.aT.reset();
            Path path = this.aT;
            float[] fArr4 = this.Vor;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.aT;
            float[] fArr5 = this.Vor;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.aT;
            float[] fArr6 = this.Vor;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.aT;
            float[] fArr7 = this.Vor;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.aT;
            float[] fArr8 = this.Vor;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.aT.close();
            canvas.drawPath(this.aT, this.FA);
        }
    }

    @Override // com.bytedance.adsdk.NOt.mZ.mZ.ZRu, com.bytedance.adsdk.NOt.ZRu.ZRu.TFq
    public void ZRu(RectF rectF, Matrix matrix, boolean z10) {
        super.ZRu(rectF, matrix, z10);
        this.Mm.set(0.0f, 0.0f, this.ZH.qF(), this.ZH.WMI());
        this.ZRu.mapRect(this.Mm);
        rectF.set(this.Mm);
    }
}
