package com.bytedance.adsdk.NOt.mZ.ZRu;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TFq implements sAl<PointF, PointF> {
    private final List<com.bytedance.adsdk.NOt.Mm.ZRu<PointF>> ZRu;

    public TFq(List<com.bytedance.adsdk.NOt.Mm.ZRu<PointF>> list) {
        this.ZRu = list;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public boolean NOt() {
        return this.ZRu.size() == 1 && this.ZRu.get(0).TFq();
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<PointF, PointF> ZRu() {
        return this.ZRu.get(0).TFq() ? new com.bytedance.adsdk.NOt.ZRu.NOt.ZH(this.ZRu) : new com.bytedance.adsdk.NOt.ZRu.NOt.aT(this.ZRu);
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public List<com.bytedance.adsdk.NOt.Mm.ZRu<PointF>> mZ() {
        return this.ZRu;
    }
}
