package com.bytedance.adsdk.ugeno.uR.mZ;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.uR.Mm;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends ZRu {
    private float Vor;
    private boolean ZH;
    private float aT;

    public uR(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.uR.mZ.ZRu
    public boolean ZRu(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return ZRu(this.NOt, (MotionEvent) objArr[0]);
    }

    public boolean ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Vor = motionEvent.getRawX();
            this.aT = motionEvent.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (Math.abs(rawX - this.Vor) >= 15.0f || Math.abs(rawY - this.aT) >= 15.0f) {
                    this.ZH = true;
                }
            } else if (action == 3) {
                this.ZH = false;
            }
        } else {
            if (this.ZH) {
                this.ZH = false;
                this.Vor = 0.0f;
                this.aT = 0.0f;
                return false;
            }
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.Vor) < 15.0f && Math.abs(rawY2 - this.aT) < 15.0f) {
                Mm mm = this.ZRu;
                if (mm != null) {
                    mm.ZRu(mZVar, this.Ht, this.mZ.NOt());
                    this.Vor = 0.0f;
                    this.aT = 0.0f;
                    return true;
                }
            } else {
                this.ZH = false;
            }
        }
        return true;
    }
}
