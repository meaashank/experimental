package com.bytedance.adsdk.NOt.ZRu.NOt;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.NOt.ZRu.NOt.ZRu;

/* JADX INFO: loaded from: classes2.dex */
public class mZ implements ZRu.InterfaceC0381ZRu {
    private final ZRu<Float, Float> Ht;
    private boolean Mm = true;
    private final ZRu<Integer, Integer> NOt;
    private final ZRu<Float, Float> TFq;
    private final ZRu.InterfaceC0381ZRu ZRu;
    private final ZRu<Float, Float> mZ;
    private final ZRu<Float, Float> uR;

    public mZ(ZRu.InterfaceC0381ZRu interfaceC0381ZRu, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu, com.bytedance.adsdk.NOt.TFq.aT aTVar) {
        this.ZRu = interfaceC0381ZRu;
        ZRu<Integer, Integer> ZRu = aTVar.ZRu().ZRu();
        this.NOt = ZRu;
        ZRu.ZRu(this);
        zRu.ZRu(ZRu);
        ZRu<Float, Float> ZRu2 = aTVar.NOt().ZRu();
        this.mZ = ZRu2;
        ZRu2.ZRu(this);
        zRu.ZRu(ZRu2);
        ZRu<Float, Float> ZRu3 = aTVar.mZ().ZRu();
        this.uR = ZRu3;
        ZRu3.ZRu(this);
        zRu.ZRu(ZRu3);
        ZRu<Float, Float> ZRu4 = aTVar.uR().ZRu();
        this.TFq = ZRu4;
        ZRu4.ZRu(this);
        zRu.ZRu(ZRu4);
        ZRu<Float, Float> ZRu5 = aTVar.TFq().ZRu();
        this.Ht = ZRu5;
        ZRu5.ZRu(this);
        zRu.ZRu(ZRu5);
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.InterfaceC0381ZRu
    public void ZRu() {
        this.Mm = true;
        this.ZRu.ZRu();
    }

    public void ZRu(Paint paint) {
        if (this.Mm) {
            this.Mm = false;
            double dFloatValue = ((double) this.uR.Mm().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.TFq.Mm().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.NOt.Mm().intValue();
            paint.setShadowLayer(this.Ht.Mm().floatValue(), fSin, fCos, Color.argb(Math.round(this.mZ.Mm().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
