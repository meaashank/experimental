package com.bytedance.adsdk.NOt.mZ.NOt;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    private final com.bytedance.adsdk.NOt.mZ.ZRu.FA NOt;
    private final ZRu ZRu;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.uR mZ;
    private final boolean uR;

    public enum ZRu {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public FA(ZRu zRu, com.bytedance.adsdk.NOt.mZ.ZRu.FA fa2, com.bytedance.adsdk.NOt.mZ.ZRu.uR uRVar, boolean z10) {
        this.ZRu = zRu;
        this.NOt = fa2;
        this.mZ = uRVar;
        this.uR = z10;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.FA NOt() {
        return this.NOt;
    }

    public ZRu ZRu() {
        return this.ZRu;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.uR mZ() {
        return this.mZ;
    }

    public boolean uR() {
        return this.uR;
    }
}
