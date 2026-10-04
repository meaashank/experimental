package com.bytedance.sdk.component.adexpress.Ht;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class ZH extends FrameLayout {
    private final ImageView NOt;
    private final TextView ZRu;
    private final lp mZ;
    private final RotateAnimation uR;

    public ZH(@NonNull Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.mZ.ZRu.uR(context));
        this.ZRu = (TextView) findViewById(2097610742);
        this.NOt = (ImageView) findViewById(2097610745);
        this.mZ = (lp) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.uR = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.ZH.1
            @Override // java.lang.Runnable
            public void run() {
                ZH.this.NOt.startAnimation(ZH.this.uR);
                ZH.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.ZH.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ZH.this.mZ.ZRu(4);
                    }
                }, 100L);
                ZH.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Ht.ZH.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ZH.this.mZ.ZRu(4);
                    }
                }, 300L);
                ZH zh = ZH.this;
                zh.postDelayed(zh.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.ZRu;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void NOt() {
        this.uR.cancel();
    }

    public void ZRu() {
        postDelayed(getHaloAnimation(), 300L);
    }
}
