package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class FA extends xY {
    private AnimatorSet Ht;
    private ImageView NOt;
    private int TFq;
    private TextView ZRu;
    private ImageView mZ;
    private ImageView uR;

    public FA(Context context) {
        super(context);
        this.Ht = new AnimatorSet();
        NOt(context);
    }

    private void NOt(Context context) {
        addView(com.bytedance.sdk.component.adexpress.mZ.ZRu.NOt(context));
        this.NOt = (ImageView) findViewById(2097610751);
        this.mZ = (ImageView) findViewById(2097610750);
        this.uR = (ImageView) findViewById(2097610749);
        this.ZRu = (TextView) findViewById(2097610748);
    }

    private void uR() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.Ht.xY
    public void ZRu(Context context) {
    }

    public float getAlphaColor() {
        return this.TFq;
    }

    public void setAlphaColor(int i10) {
        if (i10 < 0 || i10 > 60) {
            return;
        }
        int i11 = i10 + 195;
        ImageView imageView = this.uR;
        int iRgb = Color.rgb(i11, i11, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i12 = ((i10 + 20) % 60) + 195;
        this.mZ.setColorFilter(Color.rgb(i12, i12, i12), mode);
        int i13 = ((i10 + 40) % 60) + 195;
        this.NOt.setColorFilter(Color.rgb(i13, i13, i13), mode);
    }

    public void setButtonText(String str) {
        if (this.ZRu == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.ZRu.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.Ht.xY
    public void ZRu() {
        uR();
    }

    @Override // com.bytedance.sdk.component.adexpress.Ht.xY
    public void NOt() {
        this.Ht.cancel();
    }
}
