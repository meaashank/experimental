package com.bytedance.adsdk.NOt.mZ.NOt;

import com.bytedance.adsdk.NOt.ZRu.ZRu.to;

/* JADX INFO: loaded from: classes2.dex */
public class om implements mZ {
    private final boolean Ht;
    private final ZRu NOt;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt TFq;
    private final String ZRu;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt mZ;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt uR;

    public enum ZRu {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static ZRu ZRu(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i10)));
        }
    }

    public om(String str, ZRu zRu, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt2, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt3, boolean z10) {
        this.ZRu = str;
        this.NOt = zRu;
        this.mZ = nOt;
        this.uR = nOt2;
        this.TFq = nOt3;
        this.Ht = z10;
    }

    public boolean Ht() {
        return this.Ht;
    }

    public ZRu NOt() {
        return this.NOt;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt TFq() {
        return this.TFq;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt mZ() {
        return this.uR;
    }

    public String toString() {
        return "Trim Path: {start: " + this.mZ + ", end: " + this.uR + ", offset: " + this.TFq + "}";
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt uR() {
        return this.mZ;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.NOt.mZ
    public com.bytedance.adsdk.NOt.ZRu.ZRu.mZ ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        return new to(zRu, this);
    }
}
