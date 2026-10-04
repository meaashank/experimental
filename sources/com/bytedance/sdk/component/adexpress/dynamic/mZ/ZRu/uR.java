package com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class uR implements View.OnTouchListener {
    private boolean FA;
    private float Ht;
    private float Mm;
    private float NOt;
    private boolean TFq = true;
    private com.bytedance.sdk.component.adexpress.dynamic.mZ.FA Vor;
    private boolean ZH;
    private float ZRu;
    private int aT;
    private float mZ;
    private float uR;

    public uR(com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2, int i10, boolean z10) {
        this.Vor = fa2;
        this.aT = i10;
        this.ZH = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2;
        com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa3;
        com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa4;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ZRu = motionEvent.getX();
            this.NOt = motionEvent.getY();
            this.Ht = motionEvent.getY();
            this.TFq = true;
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.Mm = y10;
                if (Math.abs(y10 - this.Ht) > 10.0f) {
                    this.FA = true;
                }
                this.uR = motionEvent.getX();
                this.mZ = motionEvent.getY();
                if (Math.abs(this.uR - this.ZRu) > 8.0f || Math.abs(this.mZ - this.NOt) > 8.0f) {
                    this.TFq = false;
                }
            }
        } else {
            if (!this.FA && !this.TFq) {
                return false;
            }
            if (this.ZH || (fa4 = this.Vor) == null) {
                int iNOt = com.bytedance.sdk.component.adexpress.uR.FA.NOt(com.bytedance.sdk.component.adexpress.uR.ZRu(), Math.abs(this.Mm - this.Ht));
                if (this.Mm - this.Ht < 0.0f && iNOt > this.aT && (fa3 = this.Vor) != null) {
                    fa3.ZRu();
                } else if (this.TFq && (fa2 = this.Vor) != null) {
                    fa2.ZRu();
                }
            } else {
                fa4.ZRu();
            }
        }
        return true;
    }
}
