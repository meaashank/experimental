package com.bytedance.adsdk.NOt.mZ.ZRu;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Vor implements sAl<PointF, PointF> {
    private final NOt NOt;
    private final NOt ZRu;

    public Vor(NOt nOt, NOt nOt2) {
        this.ZRu = nOt;
        this.NOt = nOt2;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public boolean NOt() {
        return this.ZRu.NOt() && this.NOt.NOt();
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<PointF, PointF> ZRu() {
        return new com.bytedance.adsdk.NOt.ZRu.NOt.edo(this.ZRu.ZRu(), this.NOt.ZRu());
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public List<com.bytedance.adsdk.NOt.Mm.ZRu<PointF>> mZ() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
