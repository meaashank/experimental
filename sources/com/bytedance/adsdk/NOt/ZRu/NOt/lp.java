package com.bytedance.adsdk.NOt.ZRu.NOt;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lp extends Mm<com.bytedance.adsdk.NOt.Mm.mZ> {
    private final com.bytedance.adsdk.NOt.Mm.mZ uR;

    public lp(List<com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.Mm.mZ>> list) {
        super(list);
        this.uR = new com.bytedance.adsdk.NOt.Mm.mZ();
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.NOt.Mm.mZ ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.Mm.mZ> zRu, float f10) {
        com.bytedance.adsdk.NOt.Mm.mZ mZVar;
        com.bytedance.adsdk.NOt.Mm.mZ mZVar2 = zRu.ZRu;
        if (mZVar2 == null || (mZVar = zRu.NOt) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.NOt.Mm.mZ mZVar3 = mZVar2;
        com.bytedance.adsdk.NOt.Mm.mZ mZVar4 = mZVar;
        if (this.mZ == null) {
            this.uR.ZRu(com.bytedance.adsdk.NOt.Ht.TFq.ZRu(mZVar3.ZRu(), mZVar4.ZRu(), f10), com.bytedance.adsdk.NOt.Ht.TFq.ZRu(mZVar3.NOt(), mZVar4.NOt(), f10));
            return this.uR;
        }
        zRu.Mm.getClass();
        uR();
        FA();
        throw null;
    }
}
