package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class WMI extends View {
    private int Ht;
    private boolean Mm;
    private Paint NOt;
    private ValueAnimator TFq;
    private Context ZRu;
    private RectF mZ;
    private float uR;

    public WMI(Context context) {
        super(context);
        this.Ht = 1500;
        this.ZRu = context;
        Paint paint = new Paint();
        this.NOt = paint;
        paint.setAntiAlias(true);
        this.NOt.setStyle(Paint.Style.STROKE);
        this.NOt.setStrokeWidth(10.0f);
        this.NOt.setColor(Color.parseColor("#80FFFFFF"));
        this.mZ = new RectF();
    }

    public void NOt() {
        ValueAnimator valueAnimator = this.TFq;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void mZ() {
        this.Mm = true;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.Mm) {
            return;
        }
        canvas.drawArc(this.mZ, 270.0f, this.uR, false, this.NOt);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.mZ.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }

    public void setDuration(int i10) {
        this.Ht = i10;
    }

    public void ZRu() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.TFq = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.Ht);
        this.TFq.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.WMI.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                WMI.this.uR = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WMI.this.requestLayout();
            }
        });
        this.TFq.start();
    }
}
