package com.bytedance.adsdk.NOt.Mm;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.NOt.Mm;
import com.bytedance.component.sdk.annotation.FloatRange;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu<T> {
    public PointF FA;
    public final float Ht;
    public Float Mm;
    public T NOt;
    public final Interpolator TFq;
    public PointF Vor;
    private float ZH;
    public final T ZRu;
    private final Mm aT;
    private int edo;
    private float lp;
    public final Interpolator mZ;
    private float oK;
    private int sAl;
    public final Interpolator uR;
    private float yBV;

    public ZRu(Mm mm, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.ZH = -3987645.8f;
        this.lp = -3987645.8f;
        this.sAl = 784923401;
        this.edo = 784923401;
        this.oK = Float.MIN_VALUE;
        this.yBV = Float.MIN_VALUE;
        this.FA = null;
        this.Vor = null;
        this.aT = mm;
        this.ZRu = t10;
        this.NOt = t11;
        this.mZ = interpolator;
        this.uR = null;
        this.TFq = null;
        this.Ht = f10;
        this.Mm = f11;
    }

    public int FA() {
        if (this.sAl == 784923401) {
            this.sAl = ((Integer) this.ZRu).intValue();
        }
        return this.sAl;
    }

    public float Ht() {
        if (this.ZH == -3987645.8f) {
            this.ZH = ((Float) this.ZRu).floatValue();
        }
        return this.ZH;
    }

    public float Mm() {
        if (this.lp == -3987645.8f) {
            this.lp = ((Float) this.NOt).floatValue();
        }
        return this.lp;
    }

    public boolean TFq() {
        return this.mZ == null && this.uR == null && this.TFq == null;
    }

    public int Vor() {
        if (this.edo == 784923401) {
            this.edo = ((Integer) this.NOt).intValue();
        }
        return this.edo;
    }

    public ZRu<T> ZRu(T t10, T t11) {
        return new ZRu<>(t10, t11);
    }

    public float mZ() {
        Mm mm = this.aT;
        if (mm == null) {
            return 0.0f;
        }
        if (this.oK == Float.MIN_VALUE) {
            this.oK = (this.Ht - mm.Ht()) / this.aT.WMI();
        }
        return this.oK;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.ZRu + ", endValue=" + this.NOt + ", startFrame=" + this.Ht + ", endFrame=" + this.Mm + ", interpolator=" + this.mZ + '}';
    }

    public float uR() {
        if (this.aT == null) {
            return 1.0f;
        }
        if (this.yBV == Float.MIN_VALUE) {
            if (this.Mm == null) {
                this.yBV = 1.0f;
            } else {
                this.yBV = ((this.Mm.floatValue() - this.Ht) / this.aT.WMI()) + mZ();
            }
        }
        return this.yBV;
    }

    public boolean ZRu(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return f10 >= mZ() && f10 < uR();
    }

    public ZRu(Mm mm, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.ZH = -3987645.8f;
        this.lp = -3987645.8f;
        this.sAl = 784923401;
        this.edo = 784923401;
        this.oK = Float.MIN_VALUE;
        this.yBV = Float.MIN_VALUE;
        this.FA = null;
        this.Vor = null;
        this.aT = mm;
        this.ZRu = t10;
        this.NOt = t11;
        this.mZ = null;
        this.uR = interpolator;
        this.TFq = interpolator2;
        this.Ht = f10;
        this.Mm = f11;
    }

    public ZRu(Mm mm, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.ZH = -3987645.8f;
        this.lp = -3987645.8f;
        this.sAl = 784923401;
        this.edo = 784923401;
        this.oK = Float.MIN_VALUE;
        this.yBV = Float.MIN_VALUE;
        this.FA = null;
        this.Vor = null;
        this.aT = mm;
        this.ZRu = t10;
        this.NOt = t11;
        this.mZ = interpolator;
        this.uR = interpolator2;
        this.TFq = interpolator3;
        this.Ht = f10;
        this.Mm = f11;
    }

    public ZRu(T t10) {
        this.ZH = -3987645.8f;
        this.lp = -3987645.8f;
        this.sAl = 784923401;
        this.edo = 784923401;
        this.oK = Float.MIN_VALUE;
        this.yBV = Float.MIN_VALUE;
        this.FA = null;
        this.Vor = null;
        this.aT = null;
        this.ZRu = t10;
        this.NOt = t10;
        this.mZ = null;
        this.uR = null;
        this.TFq = null;
        this.Ht = Float.MIN_VALUE;
        this.Mm = Float.valueOf(Float.MAX_VALUE);
    }

    private ZRu(T t10, T t11) {
        this.ZH = -3987645.8f;
        this.lp = -3987645.8f;
        this.sAl = 784923401;
        this.edo = 784923401;
        this.oK = Float.MIN_VALUE;
        this.yBV = Float.MIN_VALUE;
        this.FA = null;
        this.Vor = null;
        this.aT = null;
        this.ZRu = t10;
        this.NOt = t11;
        this.mZ = null;
        this.uR = null;
        this.TFq = null;
        this.Ht = Float.MIN_VALUE;
        this.Mm = Float.valueOf(Float.MAX_VALUE);
    }
}
