package com.bytedance.sdk.component.adexpress.Ht;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class Vor extends View {
    private int FA;
    private int Ht;
    private Paint Mm;
    private int NOt;
    private Paint TFq;
    private int ZRu;
    private final RectF mZ;
    private Paint uR;

    public Vor(Context context) {
        super(context);
        this.mZ = new RectF();
        ZRu();
    }

    private void ZRu() {
        Paint paint = new Paint();
        this.uR = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.Mm = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.TFq = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.mZ;
        int i10 = this.Ht;
        canvas.drawRoundRect(rectF, i10, i10, this.TFq);
        RectF rectF2 = this.mZ;
        int i11 = this.Ht;
        canvas.drawRoundRect(rectF2, i11, i11, this.uR);
        int i12 = this.ZRu;
        int i13 = this.NOt;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.Mm);
        int i14 = this.ZRu;
        int i15 = this.NOt;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.Mm);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.ZRu = i10;
        this.NOt = i11;
        RectF rectF = this.mZ;
        int i14 = this.FA;
        rectF.set(i14, i14, i10 - i14, i11 - i14);
    }

    public void setBgColor(int i10) {
        this.TFq.setStyle(Paint.Style.FILL);
        this.TFq.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.Mm.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.Mm.setStrokeWidth(i10);
    }

    public void setRadius(int i10) {
        this.Ht = i10;
    }

    public void setStrokeColor(int i10) {
        this.uR.setStyle(Paint.Style.STROKE);
        this.uR.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.uR.setStrokeWidth(i10);
        this.FA = i10;
    }
}
