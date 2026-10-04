package com.bytedance.adsdk.NOt.mZ;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ZRu {
    private final PointF NOt;
    private final PointF ZRu;
    private final PointF mZ;

    public ZRu() {
        this.ZRu = new PointF();
        this.NOt = new PointF();
        this.mZ = new PointF();
    }

    public void NOt(float f10, float f11) {
        this.NOt.set(f10, f11);
    }

    public void ZRu(float f10, float f11) {
        this.ZRu.set(f10, f11);
    }

    public void mZ(float f10, float f11) {
        this.mZ.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.mZ.x), Float.valueOf(this.mZ.y), Float.valueOf(this.ZRu.x), Float.valueOf(this.ZRu.y), Float.valueOf(this.NOt.x), Float.valueOf(this.NOt.y));
    }

    public PointF NOt() {
        return this.NOt;
    }

    public PointF ZRu() {
        return this.ZRu;
    }

    public PointF mZ() {
        return this.mZ;
    }

    public ZRu(PointF pointF, PointF pointF2, PointF pointF3) {
        this.ZRu = pointF;
        this.NOt = pointF2;
        this.mZ = pointF3;
    }
}
