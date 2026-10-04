package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class om extends LinearLayout {
    private LinearLayout FA;
    private TextView Ht;
    private ZRu Mm;
    private TextView NOt;
    private TextView TFq;
    private int Vor;
    private int ZH;
    private TextView ZRu;
    private int aT;
    private JSONObject lp;
    private ImageView mZ;
    private com.bytedance.sdk.component.utils.OCA uR;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.Ht.om$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (om.this.mZ != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new NOt(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.om.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        om.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.om.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                om.this.mZ.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                om.this.mZ.startAnimation(rotateAnimation);
            }
        }
    }

    public static class NOt implements Interpolator {
        private NOt() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return f10 <= 0.25f ? (f10 * (-2.0f)) + 0.5f : f10 <= 0.5f ? (f10 * 4.0f) - 1.0f : f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }

        public /* synthetic */ NOt(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public interface ZRu {
    }

    public om(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        this.Vor = i10;
        this.aT = i11;
        this.ZH = i12;
        this.lp = jSONObject;
        ZRu(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.FA;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.uR == null) {
                this.uR = new com.bytedance.sdk.component.utils.OCA(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.Ht.om.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void setOnShakeViewListener(ZRu zRu) {
        this.Mm = zRu;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.TFq.setText(str);
        } else {
            this.TFq.setVisibility(8);
            this.Ht.setVisibility(8);
        }
    }

    public void ZRu(Context context, View view) {
        addView(view);
        this.FA = (LinearLayout) findViewById(2097610727);
        this.mZ = (ImageView) findViewById(2097610725);
        this.ZRu = (TextView) findViewById(2097610724);
        this.NOt = (TextView) findViewById(2097610726);
        this.TFq = (TextView) findViewById(2097610723);
        this.Ht = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.FA.setBackground(gradientDrawable);
    }

    public void ZRu() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
