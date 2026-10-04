package com.bytedance.adsdk.ugeno.core.NOt;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.aT;
import com.bytedance.adsdk.ugeno.core.lp;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private float NOt;
    private boolean TFq;
    private float ZRu;
    private aT mZ;
    private Context uR;

    public NOt(Context context, aT aTVar) {
        this.uR = context;
        this.mZ = aTVar;
    }

    public boolean ZRu(lp lpVar, com.bytedance.adsdk.ugeno.NOt.mZ mZVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ZRu = motionEvent.getX();
            this.NOt = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.ZRu) >= 15.0f || Math.abs(y10 - this.NOt) >= 15.0f) {
                    this.TFq = true;
                }
            } else if (action == 3) {
                this.TFq = false;
            }
        } else {
            if (this.TFq) {
                this.TFq = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.ZRu) >= 15.0f || Math.abs(y11 - this.NOt) >= 15.0f) {
                this.TFq = false;
            } else if (lpVar != null) {
                lpVar.ZRu(this.mZ, mZVar, mZVar);
                return true;
            }
        }
        return true;
    }
}
