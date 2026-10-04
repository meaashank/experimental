package com.bytedance.adsdk.NOt.mZ.NOt;

import android.graphics.PointF;
import androidx.compose.animation.C1636p;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class edo {
    private PointF NOt;
    private final List<com.bytedance.adsdk.NOt.mZ.ZRu> ZRu;
    private boolean mZ;

    public edo(PointF pointF, boolean z10, List<com.bytedance.adsdk.NOt.mZ.ZRu> list) {
        this.NOt = pointF;
        this.mZ = z10;
        this.ZRu = new ArrayList(list);
    }

    public boolean NOt() {
        return this.mZ;
    }

    public void ZRu(float f10, float f11) {
        if (this.NOt == null) {
            this.NOt = new PointF();
        }
        this.NOt.set(f10, f11);
    }

    public List<com.bytedance.adsdk.NOt.mZ.ZRu> mZ() {
        return this.ZRu;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.ZRu.size());
        sb2.append("closed=");
        return C1636p.a(sb2, this.mZ, '}');
    }

    public PointF ZRu() {
        return this.NOt;
    }

    public edo() {
        this.ZRu = new ArrayList();
    }

    public void ZRu(boolean z10) {
        this.mZ = z10;
    }

    public void ZRu(edo edoVar, edo edoVar2, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        if (this.NOt == null) {
            this.NOt = new PointF();
        }
        this.mZ = edoVar.NOt() || edoVar2.NOt();
        if (edoVar.mZ().size() != edoVar2.mZ().size()) {
            edoVar.mZ().size();
            edoVar2.mZ().size();
        }
        int iMin = Math.min(edoVar.mZ().size(), edoVar2.mZ().size());
        if (this.ZRu.size() < iMin) {
            for (int size = this.ZRu.size(); size < iMin; size++) {
                this.ZRu.add(new com.bytedance.adsdk.NOt.mZ.ZRu());
            }
        } else if (this.ZRu.size() > iMin) {
            for (int size2 = this.ZRu.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.NOt.mZ.ZRu> list = this.ZRu;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFZRu = edoVar.ZRu();
        PointF pointFZRu2 = edoVar2.ZRu();
        ZRu(com.bytedance.adsdk.NOt.Ht.TFq.ZRu(pointFZRu.x, pointFZRu2.x, f10), com.bytedance.adsdk.NOt.Ht.TFq.ZRu(pointFZRu.y, pointFZRu2.y, f10));
        for (int size3 = this.ZRu.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.NOt.mZ.ZRu zRu = edoVar.mZ().get(size3);
            com.bytedance.adsdk.NOt.mZ.ZRu zRu2 = edoVar2.mZ().get(size3);
            PointF pointFZRu3 = zRu.ZRu();
            PointF pointFNOt = zRu.NOt();
            PointF pointFMZ = zRu.mZ();
            PointF pointFZRu4 = zRu2.ZRu();
            PointF pointFNOt2 = zRu2.NOt();
            PointF pointFMZ2 = zRu2.mZ();
            this.ZRu.get(size3).ZRu(com.bytedance.adsdk.NOt.Ht.TFq.ZRu(pointFZRu3.x, pointFZRu4.x, f10), com.bytedance.adsdk.NOt.Ht.TFq.ZRu(pointFZRu3.y, pointFZRu4.y, f10));
            this.ZRu.get(size3).NOt(com.bytedance.adsdk.NOt.Ht.TFq.ZRu(pointFNOt.x, pointFNOt2.x, f10), com.bytedance.adsdk.NOt.Ht.TFq.ZRu(pointFNOt.y, pointFNOt2.y, f10));
            this.ZRu.get(size3).mZ(com.bytedance.adsdk.NOt.Ht.TFq.ZRu(pointFMZ.x, pointFMZ2.x, f10), com.bytedance.adsdk.NOt.Ht.TFq.ZRu(pointFMZ.y, pointFMZ2.y, f10));
        }
    }
}
