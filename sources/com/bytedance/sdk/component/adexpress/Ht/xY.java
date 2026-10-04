package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public class xY extends RelativeLayout {
    private AnimatorSet FA;
    private AnimatorSet Ht;
    private AnimatorSet Mm;
    private ImageView NOt;
    private TextView TFq;
    private AnimatorSet Vor;
    private int ZH;
    private ImageView ZRu;
    private String aT;
    private ImageView mZ;
    private TextView uR;

    public xY(Context context) {
        super(context);
        this.Ht = new AnimatorSet();
        this.Mm = new AnimatorSet();
        this.FA = new AnimatorSet();
        this.Vor = new AnimatorSet();
        this.ZH = 100;
        ZRu(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.Ht;
    }

    public void mZ() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ZRu, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ZRu, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.ZRu, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.uR.FA.ZRu(getContext(), -this.ZH));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(getContext(), this.ZH));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.xY.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (xY.this.mZ != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) xY.this.mZ.getLayoutParams();
                    layoutParams.height = num.intValue();
                    xY.this.mZ.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.mZ, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.mZ, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.NOt, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.NOt, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.NOt, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.NOt, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.NOt, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.uR.FA.ZRu(getContext(), -this.ZH));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.Mm.setDuration(50L);
        this.Vor.setDuration(1500L);
        this.FA.setDuration(50L);
        this.Mm.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.FA.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.Vor.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.Ht.playSequentially(this.FA, this.Vor, this.Mm);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NOt();
    }

    public void setGuideText(String str) {
        TextView textView = this.uR;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.TFq != null) {
            if (TextUtils.isEmpty(str)) {
                this.TFq.setText("");
            } else {
                this.TFq.setText(str);
            }
        }
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
            AnimatorSet animatorSet3 = this.Mm;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.Vor;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.NOt(e10.getMessage());
        }
    }

    public void ZRu(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.uR.ZRu();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.aT)) {
            addView(com.bytedance.sdk.component.adexpress.mZ.ZRu.Ht(context));
            this.ZH = (int) (((double) this.ZH) * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.mZ.ZRu.TFq(context));
        }
        this.ZRu = (ImageView) findViewById(2097610734);
        this.NOt = (ImageView) findViewById(2097610735);
        this.uR = (TextView) findViewById(2097610730);
        this.mZ = (ImageView) findViewById(2097610733);
        this.TFq = (TextView) findViewById(2097610731);
    }

    public xY(Context context, String str) {
        super(context);
        this.Ht = new AnimatorSet();
        this.Mm = new AnimatorSet();
        this.FA = new AnimatorSet();
        this.Vor = new AnimatorSet();
        this.ZH = 100;
        setClipChildren(false);
        this.aT = str;
        ZRu(context);
    }

    public void ZRu() {
        mZ();
        this.Ht.start();
        this.Ht.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.Ht.xY.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                xY.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.xY.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        xY.this.Ht.start();
                    }
                }, 200L);
            }
        });
    }
}
