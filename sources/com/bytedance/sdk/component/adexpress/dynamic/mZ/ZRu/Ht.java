package com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class Ht implements View.OnTouchListener {
    private static int mZ = 10;
    private float NOt;
    private com.bytedance.sdk.component.adexpress.dynamic.mZ.FA TFq;
    private float ZRu;
    private boolean uR;

    public Ht(com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2) {
        this.TFq = fa2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ZRu = motionEvent.getX();
            this.NOt = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.ZRu) >= mZ || Math.abs(y10 - this.NOt) >= mZ) {
                    this.uR = true;
                }
            } else if (action == 3) {
                this.uR = false;
            }
        } else {
            if (this.uR) {
                this.uR = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.ZRu) >= mZ || Math.abs(y11 - this.NOt) >= mZ) {
                this.uR = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2 = this.TFq;
                if (fa2 != null) {
                    fa2.ZRu();
                }
            }
        }
        return true;
    }
}
