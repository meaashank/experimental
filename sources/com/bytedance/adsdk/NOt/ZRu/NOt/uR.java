package com.bytedance.adsdk.NOt.ZRu.NOt;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends Mm<Float> {
    public uR(List<com.bytedance.adsdk.NOt.Mm.ZRu<Float>> list) {
        super(list);
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public Float ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<Float> zRu, float f10) {
        return Float.valueOf(mZ(zRu, f10));
    }

    public float Vor() {
        return mZ(mZ(), TFq());
    }

    public float mZ(com.bytedance.adsdk.NOt.Mm.ZRu<Float> zRu, float f10) {
        if (zRu.ZRu == null || zRu.NOt == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.mZ == null) {
            return com.bytedance.adsdk.NOt.Ht.TFq.ZRu(zRu.Ht(), zRu.Mm(), f10);
        }
        zRu.Mm.getClass();
        uR();
        FA();
        throw null;
    }
}
