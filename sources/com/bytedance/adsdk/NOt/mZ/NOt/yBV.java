package com.bytedance.adsdk.NOt.mZ.NOt;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class yBV implements mZ {
    private final List<mZ> NOt;
    private final String ZRu;
    private final boolean mZ;

    public yBV(String str, List<mZ> list, boolean z10) {
        this.ZRu = str;
        this.NOt = list;
        this.mZ = z10;
    }

    public List<mZ> NOt() {
        return this.NOt;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public boolean mZ() {
        return this.mZ;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.ZRu + "' Shapes: " + Arrays.toString(this.NOt.toArray()) + '}';
    }

    @Override // com.bytedance.adsdk.NOt.mZ.NOt.mZ
    public com.bytedance.adsdk.NOt.ZRu.ZRu.mZ ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        return new com.bytedance.adsdk.NOt.ZRu.ZRu.uR(vor, zRu, this, mm);
    }
}
