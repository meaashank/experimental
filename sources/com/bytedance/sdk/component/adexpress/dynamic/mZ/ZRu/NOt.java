package com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.mZ.Vor;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.mZ.FA Ht;
    private float NOt;
    private Vor TFq;
    private float ZRu;
    private long mZ;
    private boolean uR;

    public NOt(Vor vor, com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2) {
        this.TFq = vor;
        this.Ht = fa2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mZ = System.currentTimeMillis();
            this.ZRu = motionEvent.getX();
            this.NOt = motionEvent.getY();
            this.TFq.TFq();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.ZRu) >= com.bytedance.sdk.component.adexpress.uR.FA.ZRu(com.bytedance.sdk.component.adexpress.uR.ZRu(), 10.0f) || Math.abs(y10 - this.NOt) >= com.bytedance.sdk.component.adexpress.uR.FA.ZRu(com.bytedance.sdk.component.adexpress.uR.ZRu(), 10.0f)) {
                    this.uR = true;
                    this.TFq.Ht();
                }
            }
        } else {
            if (this.uR) {
                return false;
            }
            if (System.currentTimeMillis() - this.mZ >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2 = this.Ht;
                if (fa2 != null) {
                    fa2.ZRu();
                }
            } else {
                this.TFq.Ht();
            }
        }
        return true;
    }
}
