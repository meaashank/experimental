package com.bytedance.adsdk.ugeno.uR.mZ;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends ZRu {
    private float Vor;
    private int ZH;
    private float aT;
    private String lp;

    public mZ(Context context) {
        super(context);
        this.ZH = 0;
        this.lp = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.uR.mZ.ZRu
    public boolean ZRu(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, String> map = this.TFq;
        if (map != null) {
            this.lp = TextUtils.isEmpty(map.get("direction")) ? "all" : this.TFq.get("direction");
            this.ZH = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(this.TFq.get("distance"), 0);
        }
        return ZRu(this.NOt, (MotionEvent) objArr[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean ZRu(com.bytedance.adsdk.ugeno.NOt.mZ r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.uR.mZ.mZ.ZRu(com.bytedance.adsdk.ugeno.NOt.mZ, android.view.MotionEvent):boolean");
    }
}
