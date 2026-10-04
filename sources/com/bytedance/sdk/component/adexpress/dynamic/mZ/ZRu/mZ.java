package com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class mZ implements View.OnTouchListener {
    private boolean FA;
    private com.bytedance.sdk.component.adexpress.dynamic.mZ.FA Ht;
    private int Mm;
    private float NOt;
    private boolean TFq;
    private boolean Vor;
    private float ZRu;
    private float mZ;
    private float uR;

    public mZ(com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2) {
        this(fa2, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2;
        com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa3;
        com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa4;
        if (this.Vor) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ZRu = motionEvent.getX();
            this.NOt = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.uR = motionEvent.getX();
                this.mZ = motionEvent.getY();
                if (Math.abs(this.uR - this.ZRu) > 10.0f) {
                    this.TFq = true;
                }
                if (Math.abs(this.uR - this.ZRu) > 8.0f || Math.abs(this.mZ - this.NOt) > 8.0f) {
                    this.FA = false;
                }
                int iNOt = com.bytedance.sdk.component.adexpress.uR.FA.NOt(com.bytedance.sdk.component.adexpress.uR.ZRu(), Math.abs(this.uR - this.ZRu));
                if (this.uR > this.ZRu && iNOt > this.Mm && (fa4 = this.Ht) != null) {
                    fa4.ZRu();
                    this.Vor = true;
                }
            }
        } else {
            if (!this.TFq && !this.FA) {
                return false;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int iNOt2 = com.bytedance.sdk.component.adexpress.uR.FA.NOt(com.bytedance.sdk.component.adexpress.uR.ZRu(), Math.abs(this.uR - this.ZRu));
            if (this.uR > this.ZRu && iNOt2 > this.Mm && (fa3 = this.Ht) != null) {
                fa3.ZRu();
                this.Vor = true;
            }
            float fAbs = Math.abs(x10 - this.ZRu);
            float fAbs2 = Math.abs(y10 - this.NOt);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (fa2 = this.Ht) != null) {
                fa2.NOt();
                this.Vor = true;
            }
        }
        return true;
    }

    public mZ(com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2, int i10) {
        this.Mm = 5;
        this.FA = true;
        this.Ht = fa2;
        if (i10 > 0) {
            this.Mm = i10;
        }
    }
}
