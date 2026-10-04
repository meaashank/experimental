package com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class FA implements View.OnTouchListener {
    private float Ht;
    private float Mm;
    private final boolean NOt;
    private float TFq;
    private final com.bytedance.sdk.component.adexpress.dynamic.mZ.FA ZRu;
    private final int mZ = 10;
    private float uR;

    public FA(com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2, boolean z10) {
        this.ZRu = fa2;
        this.NOt = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2;
        com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.uR = motionEvent.getX();
            this.TFq = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.TFq);
        } else if (action == 1) {
            this.Ht = motionEvent.getX();
            this.Mm = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.Mm);
            if (this.NOt || (fa3 = this.ZRu) == null) {
                float f10 = this.Ht - this.uR;
                float f11 = this.Mm - this.TFq;
                if (com.bytedance.sdk.component.adexpress.uR.FA.NOt(com.bytedance.sdk.component.adexpress.uR.ZRu(), Math.abs((float) Math.sqrt((f11 * f11) + (f10 * f10)))) > 10.0f && (fa2 = this.ZRu) != null) {
                    fa2.ZRu();
                }
            } else {
                fa3.ZRu();
            }
        }
        return true;
    }
}
