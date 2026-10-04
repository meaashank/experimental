package com.bytedance.adsdk.NOt.ZRu.NOt;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class Vor extends com.bytedance.adsdk.NOt.Mm.ZRu<PointF> {
    private final com.bytedance.adsdk.NOt.Mm.ZRu<PointF> ZH;
    private Path aT;

    public Vor(com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.Mm.ZRu<PointF> zRu) {
        super(mm, zRu.ZRu, zRu.NOt, zRu.mZ, zRu.uR, zRu.TFq, zRu.Ht, zRu.Mm);
        this.ZH = zRu;
        ZRu();
    }

    public Path NOt() {
        return this.aT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ZRu() {
        T t10;
        T t11;
        T t12 = this.NOt;
        boolean z10 = (t12 == 0 || (t11 = this.ZRu) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.ZRu;
        if (t13 == 0 || (t10 = this.NOt) == 0 || z10) {
            return;
        }
        com.bytedance.adsdk.NOt.Mm.ZRu<PointF> zRu = this.ZH;
        this.aT = com.bytedance.adsdk.NOt.Ht.Ht.ZRu((PointF) t13, (PointF) t10, zRu.FA, zRu.Vor);
    }
}
