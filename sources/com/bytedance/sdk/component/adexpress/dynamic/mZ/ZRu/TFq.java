package com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class TFq implements View.OnTouchListener {
    private float NOt;
    private int TFq;
    private float ZRu;
    private boolean mZ;
    private com.bytedance.sdk.component.adexpress.dynamic.mZ.FA uR;

    public TFq(com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2, int i10) {
        this.uR = fa2;
        this.TFq = i10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ZRu = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.NOt = y10;
                if (Math.abs(y10 - this.ZRu) > 10.0f) {
                    this.mZ = true;
                }
            }
        } else {
            if (!this.mZ) {
                return false;
            }
            int iNOt = com.bytedance.sdk.component.adexpress.uR.FA.NOt(com.bytedance.sdk.component.adexpress.uR.ZRu(), Math.abs(this.NOt - this.ZRu));
            if (this.NOt - this.ZRu < 0.0f && iNOt > this.TFq && (fa2 = this.uR) != null) {
                fa2.ZRu();
                this.ZRu = 0.0f;
                this.NOt = 0.0f;
                this.mZ = false;
            }
        }
        return true;
    }
}
