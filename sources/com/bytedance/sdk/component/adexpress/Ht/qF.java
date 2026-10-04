package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class qF extends View {
    private float FA;
    private long Ht;
    private float Mm;
    private float NOt;
    private Paint TFq;
    private Animator.AnimatorListener Vor;
    private float ZRu;
    private int aT;
    private ValueAnimator mZ;
    private ValueAnimator uR;

    public qF(Context context, int i10) {
        super(context);
        this.Ht = 300L;
        this.Mm = 0.0f;
        this.aT = i10;
        ZRu();
    }

    public void NOt() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.FA);
        this.mZ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.Ht);
        this.mZ.setInterpolator(new LinearInterpolator());
        this.mZ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.qF.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                qF.this.Mm = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qF.this.invalidate();
            }
        });
        this.mZ.start();
    }

    public void mZ() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.FA, 0.0f);
        this.uR = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.Ht);
        this.uR.setInterpolator(new LinearInterpolator());
        this.uR.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.qF.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                qF.this.Mm = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qF.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.Vor;
        if (animatorListener != null) {
            this.uR.addListener(animatorListener);
        }
        this.uR.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.ZRu, this.NOt, this.Mm, this.TFq);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.ZRu = i10 / 2.0f;
        this.NOt = i11 / 2.0f;
        this.FA = (float) (Math.hypot(i10, i11) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.Vor = animatorListener;
    }

    public void ZRu() {
        Paint paint = new Paint(1);
        this.TFq = paint;
        paint.setStyle(Paint.Style.FILL);
        this.TFq.setColor(this.aT);
    }
}
