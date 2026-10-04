package com.bytedance.adsdk.NOt.mZ.NOt;

import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public class TFq implements mZ {
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt FA;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.Ht Ht;
    private final String Mm;
    private final Path.FillType NOt;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.Ht TFq;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt Vor;
    private final Mm ZRu;
    private final boolean aT;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.mZ mZ;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.uR uR;

    public TFq(String str, Mm mm, Path.FillType fillType, com.bytedance.adsdk.NOt.mZ.ZRu.mZ mZVar, com.bytedance.adsdk.NOt.mZ.ZRu.uR uRVar, com.bytedance.adsdk.NOt.mZ.ZRu.Ht ht, com.bytedance.adsdk.NOt.mZ.ZRu.Ht ht2, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt2, boolean z10) {
        this.ZRu = mm;
        this.NOt = fillType;
        this.mZ = mZVar;
        this.uR = uRVar;
        this.TFq = ht;
        this.Ht = ht2;
        this.Mm = str;
        this.FA = nOt;
        this.Vor = nOt2;
        this.aT = z10;
    }

    public boolean FA() {
        return this.aT;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.Ht Ht() {
        return this.TFq;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.Ht Mm() {
        return this.Ht;
    }

    public Mm NOt() {
        return this.ZRu;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.uR TFq() {
        return this.uR;
    }

    public String ZRu() {
        return this.Mm;
    }

    public Path.FillType mZ() {
        return this.NOt;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.mZ uR() {
        return this.mZ;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.NOt.mZ
    public com.bytedance.adsdk.NOt.ZRu.ZRu.mZ ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        return new com.bytedance.adsdk.NOt.ZRu.ZRu.FA(vor, mm, zRu, this);
    }
}
