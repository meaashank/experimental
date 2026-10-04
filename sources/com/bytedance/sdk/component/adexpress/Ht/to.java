package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class to extends FrameLayout {
    private AnimatorSet FA;
    private AnimatorSet Ht;
    private AnimatorSet Mm;
    private ImageView NOt;
    private TextView TFq;
    private AnimatorSet Vor;
    private Context ZRu;
    private ImageView mZ;
    private ImageView uR;

    public to(@NonNull Context context) {
        super(context);
        this.Ht = new AnimatorSet();
        this.Mm = new AnimatorSet();
        this.FA = new AnimatorSet();
        this.Vor = new AnimatorSet();
        this.ZRu = context;
        mZ();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setGuideText(String str) {
        this.TFq.setText(str);
    }

    private void mZ() {
        ImageView imageView = new ImageView(this.ZRu);
        this.uR = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.om.uR(this.ZRu, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 30.0f);
        addView(this.uR, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.ZRu);
        this.mZ = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.om.uR(this.ZRu, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 50.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 30.0f);
        addView(this.mZ, layoutParams2);
        ImageView imageView3 = new ImageView(this.ZRu);
        this.NOt = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.om.uR(this.ZRu, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 80.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 30.0f);
        addView(this.NOt, layoutParams3);
        TextView textView = new TextView(this.ZRu);
        this.TFq = textView;
        textView.setTextColor(-1);
        this.TFq.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.TFq, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.to.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) to.this.NOt.getLayoutParams();
                layoutParams5.topMargin = (int) ((to.this.mZ.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.uR.FA.ZRu(to.this.getContext(), 7.0f));
                int iZRu = (-to.this.mZ.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(to.this.ZRu, 30.0f));
                layoutParams5.leftMargin = iZRu;
                layoutParams5.setMarginStart(iZRu);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                to.this.NOt.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) to.this.uR.getLayoutParams();
                layoutParams6.topMargin = (int) ((to.this.mZ.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.uR.FA.ZRu(to.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((to.this.mZ.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(to.this.ZRu, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                to.this.uR.setLayoutParams(layoutParams6);
            }
        });
    }

    private void uR() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.NOt, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mZ, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.mZ, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.uR, "alpha", 0.0f, 1.0f);
        this.FA.setDuration(300L);
        this.FA.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.NOt, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.uR.FA.ZRu(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.to.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) to.this.uR.getLayoutParams();
                layoutParams.width = num.intValue();
                to.this.uR.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.mZ, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.uR.FA.ZRu(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.Vor.setDuration(1500L);
        this.Vor.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.NOt, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.uR, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.mZ, "alpha", 1.0f, 0.0f);
        this.Mm.setDuration(50L);
        this.Mm.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.Ht.playSequentially(this.FA, this.Vor, this.Mm);
    }

    public void NOt() {
        try {
            AnimatorSet animatorSet = this.Ht;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.FA;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.Vor;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.Mm;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void ZRu() {
        uR();
        this.Ht.start();
        this.Ht.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.Ht.to.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                to.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.to.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        to.this.Ht.start();
                    }
                }, 200L);
            }
        });
    }
}
