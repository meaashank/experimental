package com.bytedance.adsdk.NOt.mZ.NOt;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class ZH implements mZ {
    private final com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> NOt;
    private final boolean TFq;
    private final String ZRu;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> mZ;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt uR;

    public ZH(String str, com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> sal, com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> sal2, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt, boolean z10) {
        this.ZRu = str;
        this.NOt = sal;
        this.mZ = sal2;
        this.uR = nOt;
        this.TFq = z10;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt NOt() {
        return this.uR;
    }

    public boolean TFq() {
        return this.TFq;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> mZ() {
        return this.mZ;
    }

    public String toString() {
        return "RectangleShape{position=" + this.NOt + ", size=" + this.mZ + '}';
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> uR() {
        return this.NOt;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.NOt.mZ
    public com.bytedance.adsdk.NOt.ZRu.ZRu.mZ ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        return new com.bytedance.adsdk.NOt.ZRu.ZRu.oK(vor, zRu, this);
    }
}
