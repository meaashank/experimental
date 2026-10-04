package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.e0;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends Ht {
    ObjectAnimator NOt;
    private int OCA;
    ObjectAnimator ZRu;
    private Runnable to;

    public uR(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context, dynamicRootView, fa2);
        this.OCA = 0;
        this.to = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uR.1
            @Override // java.lang.Runnable
            public void run() {
                uR.this.ZRu();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cox
    public void NOt() {
        removeCallbacks(this.to);
        ObjectAnimator objectAnimator = this.ZRu;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.ZRu.cancel();
        }
        ObjectAnimator objectAnimator2 = this.NOt;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.NOt.cancel();
        }
        super.NOt();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.FA - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i10 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.to, e0.f86339l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu() {
        final View childAt = getChildAt(this.OCA);
        final View childAt2 = getChildAt((this.OCA + 1) % getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(getChildAt(this.OCA).getHeight() + this.FA)) / 2);
        this.ZRu = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.ZRu.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uR.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (childAt2.getHeight() + this.FA) / 2, 0.0f);
        this.NOt = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.NOt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uR.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.ZRu.setDuration(500L);
        this.NOt.setDuration(500L);
        this.ZRu.start();
        this.NOt.start();
        int i10 = this.OCA + 1;
        this.OCA = i10;
        this.OCA = i10 % getChildCount();
        postDelayed(this.to, 2000L);
    }
}
