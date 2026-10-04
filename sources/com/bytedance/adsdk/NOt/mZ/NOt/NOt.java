package com.bytedance.adsdk.NOt.mZ.NOt;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements mZ {
    private final com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> NOt;
    private final boolean TFq;
    private final String ZRu;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.Ht mZ;
    private final boolean uR;

    public NOt(String str, com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> sal, com.bytedance.adsdk.NOt.mZ.ZRu.Ht ht, boolean z10, boolean z11) {
        this.ZRu = str;
        this.NOt = sal;
        this.mZ = ht;
        this.uR = z10;
        this.TFq = z11;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> NOt() {
        return this.NOt;
    }

    public boolean TFq() {
        return this.TFq;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.NOt.mZ
    public com.bytedance.adsdk.NOt.ZRu.ZRu.mZ ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        return new com.bytedance.adsdk.NOt.ZRu.ZRu.Ht(vor, zRu, this);
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.Ht mZ() {
        return this.mZ;
    }

    public boolean uR() {
        return this.uR;
    }

    public String ZRu() {
        return this.ZRu;
    }
}
