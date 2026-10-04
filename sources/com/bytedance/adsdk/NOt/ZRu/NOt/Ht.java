package com.bytedance.adsdk.NOt.ZRu.NOt;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends Mm<Integer> {
    public Ht(List<com.bytedance.adsdk.NOt.Mm.ZRu<Integer>> list) {
        super(list);
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public Integer ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<Integer> zRu, float f10) {
        return Integer.valueOf(mZ(zRu, f10));
    }

    public int Vor() {
        return mZ(mZ(), TFq());
    }

    public int mZ(com.bytedance.adsdk.NOt.Mm.ZRu<Integer> zRu, float f10) {
        if (zRu.ZRu == null || zRu.NOt == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.mZ == null) {
            return com.bytedance.adsdk.NOt.Ht.TFq.ZRu(zRu.FA(), zRu.Vor(), f10);
        }
        zRu.Mm.getClass();
        uR();
        FA();
        throw null;
    }
}
