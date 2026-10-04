package com.bytedance.adsdk.NOt.mZ.NOt;

import androidx.activity.C1477d;

/* JADX INFO: loaded from: classes2.dex */
public class WMI implements mZ {
    private final int NOt;
    private final String ZRu;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.FA mZ;
    private final boolean uR;

    public WMI(String str, int i10, com.bytedance.adsdk.NOt.mZ.ZRu.FA fa2, boolean z10) {
        this.ZRu = str;
        this.NOt = i10;
        this.mZ = fa2;
        this.uR = z10;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.FA NOt() {
        return this.mZ;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public boolean mZ() {
        return this.uR;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.ZRu);
        sb2.append(", index=");
        return C1477d.a(sb2, this.NOt, '}');
    }

    @Override // com.bytedance.adsdk.NOt.mZ.NOt.mZ
    public com.bytedance.adsdk.NOt.ZRu.ZRu.mZ ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        return new com.bytedance.adsdk.NOt.ZRu.ZRu.qF(vor, zRu, this);
    }
}
