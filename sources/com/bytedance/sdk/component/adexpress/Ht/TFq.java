package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends FrameLayout {
    private AnimatorSet NOt;
    private ImageView ZRu;

    public TFq(Context context) {
        super(context);
        mZ();
        uR();
    }

    private void mZ() {
        ImageView imageView = new ImageView(getContext());
        this.ZRu = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.om.uR(getContext(), "tt_white_hand"));
        int iZRu = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iZRu, iZRu);
        layoutParams.gravity = 17;
        addView(this.ZRu, layoutParams);
    }

    private void uR() {
        this.NOt = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ZRu, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ZRu, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.NOt.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void NOt() {
        AnimatorSet animatorSet = this.NOt;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void ZRu() {
        AnimatorSet animatorSet = this.NOt;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
