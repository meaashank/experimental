package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class Zf extends View {
    private static int mZ = 50;
    private int NOt;
    private Paint ZRu;
    private ObjectAnimator uR;

    public Zf(Context context) {
        this(context, null);
    }

    private void mZ() {
        Paint paint = new Paint();
        this.ZRu = paint;
        paint.setAntiAlias(true);
        this.ZRu.setColor(Color.parseColor("#FFFFFFFF"));
        this.ZRu.setStyle(Paint.Style.STROKE);
        this.ZRu.setStrokeWidth(18.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.uR = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
    }

    public void NOt() {
        clearAnimation();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.ZRu.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.NOt, this.ZRu);
    }

    public Zf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public Zf(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.NOt = 10;
        mZ();
    }

    public void ZRu() {
        int iMin = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        mZ = iMin;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(10, iMin);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.Zf.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Zf.this.NOt = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Zf.this.invalidate();
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.Zf.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Zf.this.uR.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Zf.this.setVisibility(0);
                Zf.this.setAlpha(1.0f);
            }
        });
        valueAnimatorOfInt.start();
    }
}
