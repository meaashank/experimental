package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends FrameLayout {
    private AnimatorSet Ht;
    private ImageView NOt;
    private WMI TFq;
    private Context ZRu;
    private ImageView mZ;
    private TextView uR;

    public mZ(@NonNull Context context) {
        super(context);
        this.Ht = new AnimatorSet();
        this.ZRu = context;
        TFq();
        Ht();
    }

    private void Ht() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mZ, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mZ, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.Ht.setDuration(800L);
        this.Ht.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void TFq() {
        FrameLayout frameLayout = new FrameLayout(this.ZRu);
        this.TFq = new WMI(this.ZRu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 95.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.TFq, layoutParams);
        this.NOt = new ImageView(this.ZRu);
        int iZRu = com.bytedance.sdk.component.utils.le.ZRu(this.ZRu, 60.0f);
        this.NOt.setImageDrawable(com.bytedance.sdk.component.adexpress.uR.Vor.ZRu(1, null, null, new int[]{iZRu, iZRu}, Integer.valueOf(com.bytedance.sdk.component.utils.le.ZRu(this.ZRu, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 75.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.NOt, layoutParams2);
        this.mZ = new ImageView(this.ZRu);
        int iZRu2 = com.bytedance.sdk.component.utils.le.ZRu(this.ZRu, 50.0f);
        this.mZ.setImageDrawable(com.bytedance.sdk.component.adexpress.uR.Vor.ZRu(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iZRu2, iZRu2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 63.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZRu, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.mZ, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.ZRu);
        this.uR = textView;
        textView.setTextColor(-1);
        this.uR.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.uR, layoutParams4);
    }

    public void NOt() {
        this.Ht.cancel();
    }

    public void ZRu() {
        this.Ht.start();
    }

    public void mZ() {
        this.TFq.ZRu();
    }

    public void setGuideText(String str) {
        this.uR.setText(str);
    }

    public void uR() {
        this.TFq.NOt();
        this.TFq.mZ();
    }
}
