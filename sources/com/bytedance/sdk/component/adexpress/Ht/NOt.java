package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.f;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends FrameLayout {
    private int FA;
    private View Ht;
    private ImageView Mm;
    private ObjectAnimator NOt;
    private View TFq;
    private int Vor;
    private AnimatorSet ZRu;
    private Context aT;
    private boolean mZ;
    private View uR;

    public NOt(Context context, int i10, int i11) {
        super(context);
        this.mZ = false;
        this.ZRu = new AnimatorSet();
        this.FA = i10;
        this.Vor = i11;
        this.aT = context;
        mZ();
        uR();
    }

    private void uR() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.uR, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.uR, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.TFq, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.TFq, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.Ht, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.Ht, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.Mm, f.f106849i, 0.0f, -20.0f, 0.0f);
        this.NOt = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.ZRu.setDuration(1500L);
        this.ZRu.setInterpolator(new AccelerateDecelerateInterpolator());
        this.ZRu.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.ZRu.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.NOt.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                NOt.this.mZ = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (NOt.this.mZ) {
                    return;
                }
                NOt.this.NOt.start();
                NOt.this.ZRu.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void mZ() {
        View view = new View(this.aT);
        this.uR = view;
        view.setBackground(ZRu("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.FA) * 0.45d), (int) (((double) this.Vor) * 0.45d));
        layoutParams.gravity = 17;
        this.uR.setLayoutParams(layoutParams);
        addView(this.uR);
        View view2 = new View(this.aT);
        this.TFq = view2;
        view2.setBackground(ZRu("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.FA) * 0.25d), (int) (((double) this.Vor) * 0.25d));
        layoutParams2.gravity = 17;
        this.TFq.setLayoutParams(layoutParams2);
        addView(this.TFq);
        View view3 = new View(this.aT);
        this.Ht = view3;
        view3.setBackground(ZRu("#807BBEFF", "#FF7BBEFF"));
        int i10 = this.FA;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i10) * 0.25d), (int) (((double) i10) * 0.25d));
        layoutParams3.gravity = 17;
        this.Ht.setLayoutParams(layoutParams3);
        addView(this.Ht);
        ImageView imageView = new ImageView(this.aT);
        this.Mm = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.om.uR(getContext(), "tt_blue_hand"));
        this.Mm.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.FA) * 0.62d), (int) (((double) this.Vor) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.Mm.setLayoutParams(layoutParams4);
        addView(this.Mm);
    }

    public void NOt() {
        this.mZ = true;
        ObjectAnimator objectAnimator = this.NOt;
        if (objectAnimator == null || this.ZRu == null) {
            return;
        }
        objectAnimator.cancel();
        this.ZRu.cancel();
    }

    private GradientDrawable ZRu(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void ZRu() {
        this.mZ = false;
        ObjectAnimator objectAnimator = this.NOt;
        if (objectAnimator == null || this.ZRu == null) {
            return;
        }
        objectAnimator.start();
        this.ZRu.start();
    }
}
