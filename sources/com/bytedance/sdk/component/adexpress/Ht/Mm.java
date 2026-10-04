package com.bytedance.sdk.component.adexpress.Ht;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class Mm extends xY {
    private View NOt;
    private TextView ZRu;
    private AnimatorSet mZ;

    public Mm(Context context) {
        super(context);
        this.mZ = new AnimatorSet();
        NOt(context);
    }

    private void NOt(Context context) {
        View viewZRu = com.bytedance.sdk.component.adexpress.mZ.ZRu.ZRu(context);
        this.NOt = viewZRu;
        addView(viewZRu);
        setClipChildren(false);
        this.ZRu = (TextView) findViewById(2097610748);
    }

    private void uR() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.NOt, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.uR.FA.ZRu(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.NOt, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.mZ.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.mZ.setDuration(1000L);
        this.mZ.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.Ht.xY
    public void ZRu(Context context) {
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
        this.mZ.cancel();
    }
}
