package com.bytedance.adsdk.ugeno.core.NOt;

import android.content.Context;
import com.bytedance.adsdk.ugeno.core.aT;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    private boolean FA;
    private String Ht;
    private Context Mm;
    private aT TFq;
    private aT uR;
    private float ZRu = Float.MIN_VALUE;
    private float NOt = Float.MIN_VALUE;
    private int mZ = 0;

    public uR(Context context, aT aTVar, boolean z10) {
        this.Mm = context;
        this.uR = aTVar;
        this.FA = z10;
        NOt();
    }

    private void NOt() {
        aT aTVar = this.uR;
        if (aTVar == null) {
            return;
        }
        this.mZ = aTVar.mZ().optInt("slideThreshold");
        this.Ht = this.uR.mZ().optString("slideDirection");
    }

    public void ZRu() {
        this.ZRu = Float.MIN_VALUE;
        this.NOt = Float.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ZRu(com.bytedance.adsdk.ugeno.core.lp r10, com.bytedance.adsdk.ugeno.NOt.mZ r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.NOt.uR.ZRu(com.bytedance.adsdk.ugeno.core.lp, com.bytedance.adsdk.ugeno.NOt.mZ, android.view.MotionEvent):boolean");
    }

    public uR(Context context, aT aTVar, aT aTVar2, boolean z10) {
        this.Mm = context;
        this.uR = aTVar;
        this.TFq = aTVar2;
        this.FA = z10;
        NOt();
    }
}
