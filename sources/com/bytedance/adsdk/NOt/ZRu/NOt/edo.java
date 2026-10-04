package com.bytedance.adsdk.NOt.ZRu.NOt;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class edo extends ZRu<PointF, PointF> {
    private final ZRu<Float, Float> FA;
    private final PointF Ht;
    private final PointF Mm;
    protected com.bytedance.adsdk.NOt.Mm.NOt<Float> TFq;
    private final ZRu<Float, Float> Vor;
    protected com.bytedance.adsdk.NOt.Mm.NOt<Float> uR;

    public edo(ZRu<Float, Float> zRu, ZRu<Float, Float> zRu2) {
        super(Collections.EMPTY_LIST);
        this.Ht = new PointF();
        this.Mm = new PointF();
        this.FA = zRu;
        this.Vor = zRu2;
        ZRu(FA());
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public PointF ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<PointF> zRu, float f10) {
        if (this.uR != null && this.FA.mZ() != null) {
            this.FA.TFq();
            throw null;
        }
        if (this.TFq != null && this.Vor.mZ() != null) {
            this.Vor.TFq();
            throw null;
        }
        this.Mm.set(this.Ht.x, 0.0f);
        PointF pointF = this.Mm;
        pointF.set(pointF.x, this.Ht.y);
        return this.Mm;
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    /* JADX INFO: renamed from: Vor, reason: merged with bridge method [inline-methods] */
    public PointF Mm() {
        return ZRu(null, 0.0f);
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    public void ZRu(float f10) {
        this.FA.ZRu(f10);
        this.Vor.ZRu(f10);
        this.Ht.set(this.FA.Mm().floatValue(), this.Vor.Mm().floatValue());
        for (int i10 = 0; i10 < this.ZRu.size(); i10++) {
            this.ZRu.get(i10).ZRu();
        }
    }
}
