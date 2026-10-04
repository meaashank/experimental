package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class yBV extends FrameLayout {
    private TextView Ht;
    private ImageView NOt;
    private boolean TFq;
    private Context ZRu;
    private Zf mZ;
    private AnimatorSet uR;

    public yBV(@NonNull Context context) {
        super(context);
        this.TFq = true;
        this.ZRu = context;
        this.uR = new AnimatorSet();
        mZ();
        uR();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.yBV.1
            @Override // java.lang.Runnable
            public void run() {
                int iZRu = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(yBV.this.ZRu, 50.0f);
                int iZRu2 = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(yBV.this.ZRu, 50.0f);
                if (yBV.this.mZ.getMeasuredHeight() > 0) {
                    iZRu = yBV.this.mZ.getMeasuredHeight();
                }
                if (yBV.this.mZ.getMeasuredWidth() > 0) {
                    iZRu2 = yBV.this.mZ.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yBV.this.NOt.getLayoutParams();
                layoutParams.topMargin = ((int) ((iZRu / 2.0f) - com.bytedance.sdk.component.adexpress.uR.FA.ZRu(yBV.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(yBV.this.ZRu, 40.0f));
                layoutParams.leftMargin = ((int) ((iZRu2 / 2.0f) - com.bytedance.sdk.component.adexpress.uR.FA.ZRu(yBV.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(yBV.this.ZRu, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.uR.FA.ZRu(yBV.this.getContext(), 5.0f) + ((-iZRu) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.uR.FA.ZRu(yBV.this.getContext(), 5.0f) + ((-iZRu2) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                yBV.this.NOt.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.Ht.setVisibility(0);
        this.Ht.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.Ht.setTextColor(i10);
    }

    private void mZ() {
        this.mZ = new Zf(this.ZRu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 50.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 40.0f);
        int iZRu = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 20.0f);
        layoutParams.leftMargin = iZRu;
        layoutParams.setMarginStart(iZRu);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.mZ, layoutParams);
        this.NOt = new ImageView(this.ZRu);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 78.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 78.0f));
        this.NOt.setImageResource(com.bytedance.sdk.component.utils.om.uR(this.ZRu, "tt_splash_hand"));
        addView(this.NOt, layoutParams2);
        TextView textView = new TextView(this.ZRu);
        this.Ht = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 10.0f);
        addView(this.Ht, layoutParams3);
        this.Ht.setVisibility(8);
    }

    private void uR() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.NOt, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.yBV.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (yBV.this.TFq) {
                    yBV.this.mZ.ZRu();
                }
                yBV.this.TFq = !r2.TFq;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(yBV.this.NOt, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                yBV.this.NOt.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.NOt, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.uR.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void NOt() {
        AnimatorSet animatorSet = this.uR;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Zf zf = this.mZ;
        if (zf != null) {
            zf.NOt();
        }
        ImageView imageView = this.NOt;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void ZRu() {
        this.uR.start();
    }
}
