package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class Vor extends View {
    private static final int[] ZRu = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private int FA;
    private final Paint Ht;
    private int Mm;
    private final RectF NOt;
    private final Paint TFq;
    private int Vor;
    private final RectF mZ;
    private final ArrayList<ZRu> uR;

    public static final class ZRu {
        public float NOt;
        public Paint ZRu;
        float mZ;
        float uR;

        public ZRu(Paint paint, float f10, float f11, float f12) {
            this.ZRu = paint;
            this.NOt = f10;
            this.mZ = f11;
            this.uR = f12;
        }
    }

    public Vor(Context context) {
        super(context);
        this.NOt = new RectF();
        this.mZ = new RectF();
        this.uR = new ArrayList<>();
        this.Ht = new Paint();
        Paint paint = new Paint();
        this.TFq = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void ZRu() {
        if (this.Mm <= 0) {
            return;
        }
        int width = (int) (((this.FA * 1.0f) / 100.0f) * getWidth());
        this.mZ.right = Math.max(this.Vor, width);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.NOt;
        int i10 = this.Mm;
        canvas.drawRoundRect(rectF, i10, i10, this.TFq);
        RectF rectF2 = this.mZ;
        int i11 = this.Mm;
        canvas.drawRoundRect(rectF2, i11, i11, this.Ht);
        int iSave = canvas.save();
        canvas.translate(this.mZ.right - this.Vor, 0.0f);
        ArrayList<ZRu> arrayList = this.uR;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            ZRu zRu = arrayList.get(i12);
            i12++;
            ZRu zRu2 = zRu;
            canvas.drawCircle(zRu2.mZ, zRu2.uR, zRu2.NOt, zRu2.ZRu);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i11 / 2;
        this.Mm = i14;
        this.Vor = i14 * 5;
        float f10 = i10;
        float f11 = i11;
        this.NOt.set(0.0f, 0.0f, f10, f11);
        this.mZ.set(0.0f, 0.0f, 0.0f, f11);
        this.Ht.setShader(new LinearGradient(0.0f, 0.0f, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.uR.clear();
        float f12 = this.Mm / 4.0f;
        for (int i15 : ZRu) {
            Paint paint = new Paint();
            paint.setColor(i15);
            this.uR.add(new ZRu(paint, this.Mm / 2.0f, f12, f11 / 2.0f));
            f12 += (this.Mm / 2.0f) * 3.0f;
        }
        ZRu();
    }

    public void setProgress(int i10) {
        int i11 = this.FA;
        if (i11 == i10) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 100) {
            i10 = 100;
        }
        if (i11 == i10) {
            return;
        }
        this.FA = i10;
        ZRu();
    }
}
