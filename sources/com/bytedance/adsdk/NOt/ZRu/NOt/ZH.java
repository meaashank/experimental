package com.bytedance.adsdk.NOt.ZRu.NOt;

import android.graphics.PointF;
import i.C4541d;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZH extends Mm<PointF> {
    private final PointF uR;

    public ZH(List<com.bytedance.adsdk.NOt.Mm.ZRu<PointF>> list) {
        super(list);
        this.uR = new PointF();
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public PointF ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<PointF> zRu, float f10) {
        return ZRu(zRu, f10, f10, f10);
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public PointF ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<PointF> zRu, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = zRu.ZRu;
        if (pointF2 == null || (pointF = zRu.NOt) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.mZ != null) {
            zRu.Mm.getClass();
            uR();
            FA();
            throw null;
        }
        PointF pointF5 = this.uR;
        float f13 = pointF3.x;
        float fA = C4541d.a(pointF4.x, f13, f11, f13);
        float f14 = pointF3.y;
        pointF5.set(fA, C4541d.a(pointF4.y, f14, f12, f14));
        return this.uR;
    }
}
