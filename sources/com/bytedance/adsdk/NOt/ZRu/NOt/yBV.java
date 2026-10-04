package com.bytedance.adsdk.NOt.ZRu.NOt;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.NOt.ZRu.NOt.ZRu;

/* JADX INFO: loaded from: classes2.dex */
public class yBV {
    private ZRu<com.bytedance.adsdk.NOt.Mm.mZ, com.bytedance.adsdk.NOt.Mm.mZ> FA;
    private ZRu<PointF, PointF> Ht;
    private ZRu<?, PointF> Mm;
    private final Matrix NOt;
    private final float[] TFq;
    private ZRu<Float, Float> Vor;
    private uR ZH;
    private final Matrix ZRu = new Matrix();
    private ZRu<Integer, Integer> aT;
    private ZRu<?, Float> edo;
    private uR lp;
    private final Matrix mZ;
    private ZRu<?, Float> sAl;
    private final Matrix uR;

    public yBV(com.bytedance.adsdk.NOt.mZ.ZRu.lp lpVar) {
        this.Ht = lpVar.ZRu() == null ? null : lpVar.ZRu().ZRu();
        this.Mm = lpVar.NOt() == null ? null : lpVar.NOt().ZRu();
        this.FA = lpVar.mZ() == null ? null : lpVar.mZ().ZRu();
        this.Vor = lpVar.uR() == null ? null : lpVar.uR().ZRu();
        uR uRVar = lpVar.FA() == null ? null : (uR) lpVar.FA().ZRu();
        this.ZH = uRVar;
        if (uRVar != null) {
            this.NOt = new Matrix();
            this.mZ = new Matrix();
            this.uR = new Matrix();
            this.TFq = new float[9];
        } else {
            this.NOt = null;
            this.mZ = null;
            this.uR = null;
            this.TFq = null;
        }
        this.lp = lpVar.Vor() == null ? null : (uR) lpVar.Vor().ZRu();
        if (lpVar.TFq() != null) {
            this.aT = lpVar.TFq().ZRu();
        }
        if (lpVar.Ht() != null) {
            this.sAl = lpVar.Ht().ZRu();
        } else {
            this.sAl = null;
        }
        if (lpVar.Mm() != null) {
            this.edo = lpVar.Mm().ZRu();
        } else {
            this.edo = null;
        }
    }

    private void TFq() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.TFq[i10] = 0.0f;
        }
    }

    public ZRu<?, Float> NOt() {
        return this.sAl;
    }

    public void ZRu(com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        zRu.ZRu(this.aT);
        zRu.ZRu(this.sAl);
        zRu.ZRu(this.edo);
        zRu.ZRu(this.Ht);
        zRu.ZRu(this.Mm);
        zRu.ZRu(this.FA);
        zRu.ZRu(this.Vor);
        zRu.ZRu(this.ZH);
        zRu.ZRu(this.lp);
    }

    public ZRu<?, Float> mZ() {
        return this.edo;
    }

    public Matrix uR() {
        PointF pointFMm;
        PointF pointFMm2;
        this.ZRu.reset();
        ZRu<?, PointF> zRu = this.Mm;
        if (zRu != null && (pointFMm2 = zRu.Mm()) != null) {
            float f10 = pointFMm2.x;
            if (f10 != 0.0f || pointFMm2.y != 0.0f) {
                this.ZRu.preTranslate(f10, pointFMm2.y);
            }
        }
        ZRu<Float, Float> zRu2 = this.Vor;
        if (zRu2 != null) {
            float fFloatValue = zRu2 instanceof WMI ? zRu2.Mm().floatValue() : ((uR) zRu2).Vor();
            if (fFloatValue != 0.0f) {
                this.ZRu.preRotate(fFloatValue);
            }
        }
        if (this.ZH != null) {
            float fCos = this.lp == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.Vor()) + 90.0f));
            float fSin = this.lp == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.Vor()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.Vor()));
            TFq();
            float[] fArr = this.TFq;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f11 = -fSin;
            fArr[3] = f11;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.NOt.setValues(fArr);
            TFq();
            float[] fArr2 = this.TFq;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.mZ.setValues(fArr2);
            TFq();
            float[] fArr3 = this.TFq;
            fArr3[0] = fCos;
            fArr3[1] = f11;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.uR.setValues(fArr3);
            this.mZ.preConcat(this.NOt);
            this.uR.preConcat(this.mZ);
            this.ZRu.preConcat(this.uR);
        }
        ZRu<com.bytedance.adsdk.NOt.Mm.mZ, com.bytedance.adsdk.NOt.Mm.mZ> zRu3 = this.FA;
        if (zRu3 != null) {
            com.bytedance.adsdk.NOt.Mm.mZ mZVarMm = zRu3.Mm();
            if (mZVarMm.ZRu() != 1.0f || mZVarMm.NOt() != 1.0f) {
                this.ZRu.preScale(mZVarMm.ZRu(), mZVarMm.NOt());
            }
        }
        ZRu<PointF, PointF> zRu4 = this.Ht;
        if (zRu4 != null && (((pointFMm = zRu4.Mm()) != null && pointFMm.x != 0.0f) || pointFMm.y != 0.0f)) {
            this.ZRu.preTranslate(-pointFMm.x, -pointFMm.y);
        }
        return this.ZRu;
    }

    public Matrix NOt(float f10) {
        ZRu<?, PointF> zRu = this.Mm;
        PointF pointFMm = zRu == null ? null : zRu.Mm();
        ZRu<com.bytedance.adsdk.NOt.Mm.mZ, com.bytedance.adsdk.NOt.Mm.mZ> zRu2 = this.FA;
        com.bytedance.adsdk.NOt.Mm.mZ mZVarMm = zRu2 == null ? null : zRu2.Mm();
        this.ZRu.reset();
        if (pointFMm != null) {
            this.ZRu.preTranslate(pointFMm.x * f10, pointFMm.y * f10);
        }
        if (mZVarMm != null) {
            double d10 = f10;
            this.ZRu.preScale((float) Math.pow(mZVarMm.ZRu(), d10), (float) Math.pow(mZVarMm.NOt(), d10));
        }
        ZRu<Float, Float> zRu3 = this.Vor;
        if (zRu3 != null) {
            float fFloatValue = zRu3.Mm().floatValue();
            ZRu<PointF, PointF> zRu4 = this.Ht;
            PointF pointFMm2 = zRu4 != null ? zRu4.Mm() : null;
            this.ZRu.preRotate(fFloatValue * f10, pointFMm2 == null ? 0.0f : pointFMm2.x, pointFMm2 != null ? pointFMm2.y : 0.0f);
        }
        return this.ZRu;
    }

    public void ZRu(ZRu.InterfaceC0381ZRu interfaceC0381ZRu) {
        ZRu<Integer, Integer> zRu = this.aT;
        if (zRu != null) {
            zRu.ZRu(interfaceC0381ZRu);
        }
        ZRu<?, Float> zRu2 = this.sAl;
        if (zRu2 != null) {
            zRu2.ZRu(interfaceC0381ZRu);
        }
        ZRu<?, Float> zRu3 = this.edo;
        if (zRu3 != null) {
            zRu3.ZRu(interfaceC0381ZRu);
        }
        ZRu<PointF, PointF> zRu4 = this.Ht;
        if (zRu4 != null) {
            zRu4.ZRu(interfaceC0381ZRu);
        }
        ZRu<?, PointF> zRu5 = this.Mm;
        if (zRu5 != null) {
            zRu5.ZRu(interfaceC0381ZRu);
        }
        ZRu<com.bytedance.adsdk.NOt.Mm.mZ, com.bytedance.adsdk.NOt.Mm.mZ> zRu6 = this.FA;
        if (zRu6 != null) {
            zRu6.ZRu(interfaceC0381ZRu);
        }
        ZRu<Float, Float> zRu7 = this.Vor;
        if (zRu7 != null) {
            zRu7.ZRu(interfaceC0381ZRu);
        }
        uR uRVar = this.ZH;
        if (uRVar != null) {
            uRVar.ZRu(interfaceC0381ZRu);
        }
        uR uRVar2 = this.lp;
        if (uRVar2 != null) {
            uRVar2.ZRu(interfaceC0381ZRu);
        }
    }

    public void ZRu(float f10) {
        ZRu<Integer, Integer> zRu = this.aT;
        if (zRu != null) {
            zRu.ZRu(f10);
        }
        ZRu<?, Float> zRu2 = this.sAl;
        if (zRu2 != null) {
            zRu2.ZRu(f10);
        }
        ZRu<?, Float> zRu3 = this.edo;
        if (zRu3 != null) {
            zRu3.ZRu(f10);
        }
        ZRu<PointF, PointF> zRu4 = this.Ht;
        if (zRu4 != null) {
            zRu4.ZRu(f10);
        }
        ZRu<?, PointF> zRu5 = this.Mm;
        if (zRu5 != null) {
            zRu5.ZRu(f10);
        }
        ZRu<com.bytedance.adsdk.NOt.Mm.mZ, com.bytedance.adsdk.NOt.Mm.mZ> zRu6 = this.FA;
        if (zRu6 != null) {
            zRu6.ZRu(f10);
        }
        ZRu<Float, Float> zRu7 = this.Vor;
        if (zRu7 != null) {
            zRu7.ZRu(f10);
        }
        uR uRVar = this.ZH;
        if (uRVar != null) {
            uRVar.ZRu(f10);
        }
        uR uRVar2 = this.lp;
        if (uRVar2 != null) {
            uRVar2.ZRu(f10);
        }
    }

    public ZRu<?, Integer> ZRu() {
        return this.aT;
    }
}
