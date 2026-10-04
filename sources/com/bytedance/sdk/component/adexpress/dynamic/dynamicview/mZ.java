package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.e0;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends Ht {
    ObjectAnimator NOt;
    private int OCA;
    ObjectAnimator ZRu;
    private boolean to;
    private Runnable xY;

    public mZ(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context, dynamicRootView, fa2);
        this.OCA = 0;
        this.to = false;
        this.xY = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mZ.1
            @Override // java.lang.Runnable
            public void run() {
                mZ.this.ZRu();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cox
    public void NOt() {
        removeCallbacks(this.xY);
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
        postDelayed(this.xY, e0.f86339l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu() {
        final View childAt;
        final View childAt2 = getChildAt(this.OCA);
        if (childAt2 == null) {
            return;
        }
        int i10 = this.OCA;
        if (i10 == 0) {
            this.to = false;
        }
        if (i10 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.OCA + 1)).getChildCount() <= 0) {
            this.to = true;
            childAt = getChildAt(this.OCA - 1);
            this.ZRu = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (getChildAt(this.OCA).getWidth() + this.Mm) / 2);
        } else {
            childAt = getChildAt(this.OCA + 1);
            this.ZRu = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(getChildAt(this.OCA).getWidth() + this.Mm)) / 2);
        }
        if (childAt == null) {
            return;
        }
        this.ZRu.setInterpolator(new LinearInterpolator());
        this.ZRu.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mZ.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        if (this.to) {
            this.NOt = ObjectAnimator.ofFloat(childAt, "translationX", (-(childAt.getWidth() + this.Mm)) / 2, 0.0f);
        } else {
            this.NOt = ObjectAnimator.ofFloat(childAt, "translationX", (childAt.getWidth() + this.Mm) / 2, 0.0f);
        }
        this.NOt.setInterpolator(new LinearInterpolator());
        this.NOt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mZ.3
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
                childAt.setVisibility(0);
            }
        });
        this.ZRu.setDuration(500L);
        this.NOt.setDuration(500L);
        this.ZRu.start();
        this.NOt.start();
        if (this.to) {
            this.OCA--;
        } else {
            this.OCA++;
        }
        postDelayed(this.xY, 2000L);
    }
}
