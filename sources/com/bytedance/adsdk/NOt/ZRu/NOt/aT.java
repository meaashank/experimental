package com.bytedance.adsdk.NOt.ZRu.NOt;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class aT extends Mm<PointF> {
    private final PathMeasure Ht;
    private Vor Mm;
    private final float[] TFq;
    private final PointF uR;

    public aT(List<? extends com.bytedance.adsdk.NOt.Mm.ZRu<PointF>> list) {
        super(list);
        this.uR = new PointF();
        this.TFq = new float[2];
        this.Ht = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public PointF ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<PointF> zRu, float f10) {
        Vor vor = (Vor) zRu;
        Path pathNOt = vor.NOt();
        if (pathNOt == null) {
            return zRu.ZRu;
        }
        if (this.mZ != null) {
            vor.Mm.getClass();
            uR();
            FA();
            throw null;
        }
        if (this.Mm != vor) {
            this.Ht.setPath(pathNOt, false);
            this.Mm = vor;
        }
        PathMeasure pathMeasure = this.Ht;
        pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.TFq, null);
        PointF pointF = this.uR;
        float[] fArr = this.TFq;
        pointF.set(fArr[0], fArr[1]);
        return this.uR;
    }
}
