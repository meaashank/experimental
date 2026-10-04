package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class oK extends FrameLayout {
    private ImageView NOt;
    private boolean TFq;
    private Context ZRu;
    private Zf mZ;
    private AnimatorSet uR;

    public oK(@NonNull Context context) {
        super(context);
        this.TFq = true;
        this.ZRu = context;
        this.uR = new AnimatorSet();
        mZ();
        uR();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.oK.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oK.this.NOt.getLayoutParams();
                layoutParams.topMargin = (int) ((oK.this.mZ.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.uR.FA.ZRu(oK.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((oK.this.mZ.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.uR.FA.ZRu(oK.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.uR.FA.ZRu(oK.this.getContext(), 5.0f) + ((-oK.this.mZ.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.uR.FA.ZRu(oK.this.getContext(), 5.0f) + ((-oK.this.mZ.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                oK.this.NOt.setLayoutParams(layoutParams);
            }
        });
    }

    private void uR() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.NOt, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.oK.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (oK.this.TFq) {
                    oK.this.mZ.ZRu();
                }
                oK.this.TFq = !r2.TFq;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(oK.this.NOt, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                oK.this.NOt.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.NOt, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.uR.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void mZ() {
        this.mZ = new Zf(this.ZRu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 40.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.mZ, layoutParams);
        this.NOt = new ImageView(this.ZRu);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 62.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 62.0f));
        layoutParams2.gravity = 16;
        this.NOt.setImageResource(com.bytedance.sdk.component.utils.om.uR(this.ZRu, "tt_splash_hand"));
        addView(this.NOt, layoutParams2);
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
