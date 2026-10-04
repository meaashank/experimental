package com.bytedance.sdk.openadsdk.core.TFq;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class Ht extends FrameLayout {
    private boolean FA;
    private boolean Ht;
    private ValueAnimator Mm;
    private int NOt;
    private Drawable TFq;
    private int ZRu;
    private Drawable mZ;
    private Drawable uR;

    public Ht(Context context) {
        super(context);
        this.ZRu = 100;
    }

    private void ZRu() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.Mm = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.Mm.setRepeatCount(-1);
        this.Mm.setInterpolator(new LinearInterpolator());
        this.Mm.setRepeatMode(1);
        this.Mm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.TFq.Ht.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Ht.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.Mm.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Ht = true;
        if (this.TFq != null) {
            ZRu();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Ht = false;
        ValueAnimator valueAnimator = this.Mm;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Mm.removeAllUpdateListeners();
            this.Mm = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            ValueAnimator valueAnimator = this.Mm;
            if (valueAnimator == null || this.FA) {
                return;
            }
            this.FA = true;
            valueAnimator.pause();
            return;
        }
        if (this.FA) {
            this.FA = false;
            ValueAnimator valueAnimator2 = this.Mm;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                ZRu();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.TFq = drawable;
        setProgressDrawable(drawable);
        if (this.Ht && this.Mm == null) {
            ZRu();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(Vor.ZRu(this, layoutParams));
    }

    public void setMax(int i10) {
        this.ZRu = i10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setProgress(int i10) {
        this.NOt = i10;
        Drawable drawable = this.mZ;
        if (drawable != null) {
            drawable.setLevel((int) ((i10 * 10000.0f) / this.ZRu));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.uR = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.uR;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable3 = ((LayerDrawable) this.uR).getDrawable(i10);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.mZ = drawable3;
                }
            }
        }
        Drawable drawable4 = this.uR;
        if (drawable4 instanceof RotateDrawable) {
            this.mZ = drawable4;
        }
    }

    public Ht(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.ZRu = 100;
    }
}
