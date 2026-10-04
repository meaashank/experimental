package com.bytedance.adsdk.ugeno.Vor.TFq;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.NOt.mZ;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends mZ<ZRu> {
    private static final int CTl = Color.parseColor("#FFC642");
    private static final int fOq = Color.parseColor("#e3e3e4");
    private float HZ;
    private int NOt;
    private float RPV;
    private int ZRu;
    private float jJC;

    public NOt(Context context) {
        super(context);
        this.ZRu = CTl;
        this.NOt = fOq;
        this.HZ = 4.0f;
        this.jJC = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
        if (Nb()) {
            ((ZRu) this.Ht).ZRu(this.HZ, this.ZRu, this.NOt, this.jJC, (int) this.RPV);
        } else {
            ((ZRu) this.Ht).ZRu(this.HZ, this.ZRu, this.NOt, this.jJC, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public ZRu uR() {
        ZRu zRu = new ZRu(this.mZ);
        zRu.ZRu(this);
        return zRu;
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void ZRu(String str, String str2) {
        super.ZRu(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.ZRu = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.NOt = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2, fOq);
                break;
            case "gap":
                this.RPV = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case "size":
                this.jJC = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 20.0f);
                break;
            case "score":
                this.HZ = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 4.0f);
                break;
        }
    }
}
