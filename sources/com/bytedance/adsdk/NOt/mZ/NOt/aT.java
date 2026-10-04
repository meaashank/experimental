package com.bytedance.adsdk.NOt.mZ.NOt;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class aT implements mZ {
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt FA;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt Ht;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt Mm;
    private final ZRu NOt;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt TFq;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt Vor;
    private final boolean ZH;
    private final String ZRu;
    private final boolean aT;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt mZ;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> uR;

    public enum ZRu {
        STAR(1),
        POLYGON(2);

        private final int mZ;

        ZRu(int i10) {
            this.mZ = i10;
        }

        public static ZRu ZRu(int i10) {
            for (ZRu zRu : values()) {
                if (zRu.mZ == i10) {
                    return zRu;
                }
            }
            return null;
        }
    }

    public aT(String str, ZRu zRu, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt, com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> sal, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt2, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt3, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt4, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt5, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt6, boolean z10, boolean z11) {
        this.ZRu = str;
        this.NOt = zRu;
        this.mZ = nOt;
        this.uR = sal;
        this.TFq = nOt2;
        this.Ht = nOt3;
        this.Mm = nOt4;
        this.FA = nOt5;
        this.Vor = nOt6;
        this.aT = z10;
        this.ZH = z11;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt FA() {
        return this.FA;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt Ht() {
        return this.Ht;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt Mm() {
        return this.Mm;
    }

    public ZRu NOt() {
        return this.NOt;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt TFq() {
        return this.TFq;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt Vor() {
        return this.Vor;
    }

    public boolean ZH() {
        return this.ZH;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public boolean aT() {
        return this.aT;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt mZ() {
        return this.mZ;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> uR() {
        return this.uR;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.NOt.mZ
    public com.bytedance.adsdk.NOt.ZRu.ZRu.mZ ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        return new com.bytedance.adsdk.NOt.ZRu.ZRu.edo(vor, zRu, this);
    }
}
