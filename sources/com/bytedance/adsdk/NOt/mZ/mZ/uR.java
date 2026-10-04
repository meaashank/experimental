package com.bytedance.adsdk.NOt.mZ.mZ;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.adsdk.NOt.aT;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends ZRu {
    private final Paint FA;
    protected final aT Mm;
    private final Rect Vor;
    private com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<ColorFilter, ColorFilter> ZH;
    private final Rect aT;
    private com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Bitmap, Bitmap> lp;

    public uR(com.bytedance.adsdk.NOt.Vor vor, TFq tFq) {
        super(vor, tFq);
        this.FA = new com.bytedance.adsdk.NOt.ZRu.ZRu(3);
        this.Vor = new Rect();
        this.aT = new Rect();
        this.Mm = vor.Ht(tFq.Mm());
    }

    private Bitmap lp() {
        Bitmap bitmapMm;
        com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Bitmap, Bitmap> zRu = this.lp;
        if (zRu != null && (bitmapMm = zRu.Mm()) != null) {
            return bitmapMm;
        }
        Bitmap bitmapTFq = this.NOt.TFq(this.mZ.Mm());
        if (bitmapTFq != null) {
            return bitmapTFq;
        }
        aT aTVar = this.Mm;
        if (aTVar != null) {
            return aTVar.aT();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.mZ.ZRu
    public void NOt(Canvas canvas, Matrix matrix, int i10) {
        super.NOt(canvas, matrix, i10);
        Bitmap bitmapLp = lp();
        if (bitmapLp == null || bitmapLp.isRecycled() || this.Mm == null) {
            return;
        }
        float fZRu = com.bytedance.adsdk.NOt.Ht.Ht.ZRu();
        this.FA.setAlpha(i10);
        com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<ColorFilter, ColorFilter> zRu = this.ZH;
        if (zRu != null) {
            this.FA.setColorFilter(zRu.Mm());
        }
        canvas.save();
        canvas.concat(matrix);
        this.Vor.set(0, 0, bitmapLp.getWidth(), bitmapLp.getHeight());
        if (this.NOt.uR()) {
            this.aT.set(0, 0, (int) (this.Mm.ZRu() * fZRu), (int) (this.Mm.NOt() * fZRu));
        } else {
            this.aT.set(0, 0, (int) (bitmapLp.getWidth() * fZRu), (int) (bitmapLp.getHeight() * fZRu));
        }
        canvas.drawBitmap(bitmapLp, this.Vor, this.aT, this.FA);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.NOt.mZ.mZ.ZRu, com.bytedance.adsdk.NOt.ZRu.ZRu.TFq
    public void ZRu(RectF rectF, Matrix matrix, boolean z10) {
        super.ZRu(rectF, matrix, z10);
        if (this.Mm != null) {
            float fZRu = com.bytedance.adsdk.NOt.Ht.Ht.ZRu();
            rectF.set(0.0f, 0.0f, this.Mm.ZRu() * fZRu, this.Mm.NOt() * fZRu);
            this.ZRu.mapRect(rectF);
        }
    }
}
