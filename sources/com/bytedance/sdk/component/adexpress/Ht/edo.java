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
public class edo extends FrameLayout {
    private TextView Ht;
    private ImageView NOt;
    private boolean TFq;
    private Context ZRu;
    private uR mZ;
    private AnimatorSet uR;

    public edo(@NonNull Context context) {
        super(context);
        this.TFq = true;
        this.ZRu = context;
        this.uR = new AnimatorSet();
        mZ();
        uR();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.edo.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) edo.this.NOt.getLayoutParams();
                layoutParams.topMargin = ((int) ((edo.this.mZ.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.uR.FA.ZRu(edo.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(edo.this.ZRu, 20.0f));
                layoutParams.leftMargin = ((int) ((edo.this.mZ.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.uR.FA.ZRu(edo.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(edo.this.ZRu, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.uR.FA.ZRu(edo.this.getContext(), 5.0f) + ((-edo.this.mZ.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.uR.FA.ZRu(edo.this.getContext(), 5.0f) + ((-edo.this.mZ.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                edo.this.NOt.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.Ht.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.Ht.setTextColor(i10);
    }

    private void mZ() {
        this.mZ = new uR(this.ZRu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 80.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 20.0f);
        int iZRu = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 20.0f);
        layoutParams.leftMargin = iZRu;
        layoutParams.setMarginStart(iZRu);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.mZ, layoutParams);
        this.mZ.ZRu();
        this.NOt = new ImageView(this.ZRu);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 80.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 80.0f));
        this.NOt.setImageResource(com.bytedance.sdk.component.utils.om.uR(this.ZRu, "tt_splash_hand"));
        addView(this.NOt, layoutParams2);
        TextView textView = new TextView(this.ZRu);
        this.Ht = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 10.0f);
        addView(this.Ht, layoutParams3);
    }

    private void uR() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.NOt, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.edo.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (edo.this.TFq) {
                    edo.this.mZ.ZRu();
                    edo.this.mZ.setAlpha(1.0f);
                } else {
                    edo.this.mZ.NOt();
                    edo.this.mZ.setAlpha(0.0f);
                }
                edo.this.TFq = !r2.TFq;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(edo.this.NOt, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                edo.this.NOt.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.NOt, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.uR.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void NOt() {
        AnimatorSet animatorSet = this.uR;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        uR uRVar = this.mZ;
        if (uRVar != null) {
            uRVar.NOt();
        }
    }

    public void ZRu() {
        this.uR.start();
    }
}
