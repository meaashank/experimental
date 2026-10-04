package com.bytedance.adsdk.NOt.ZRu.NOt;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends Mm<com.bytedance.adsdk.NOt.mZ.NOt.uR> {
    private final com.bytedance.adsdk.NOt.mZ.NOt.uR uR;

    public TFq(List<com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.mZ.NOt.uR>> list) {
        super(list);
        com.bytedance.adsdk.NOt.mZ.NOt.uR uRVar = list.get(0).ZRu;
        int iMZ = uRVar != null ? uRVar.mZ() : 0;
        this.uR = new com.bytedance.adsdk.NOt.mZ.NOt.uR(new float[iMZ], new int[iMZ]);
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.NOt.mZ.NOt.uR ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.mZ.NOt.uR> zRu, float f10) {
        this.uR.ZRu(zRu.ZRu, zRu.NOt, f10);
        return this.uR;
    }
}
