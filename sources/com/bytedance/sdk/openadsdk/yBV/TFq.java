package com.bytedance.sdk.openadsdk.yBV;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Vor;
import com.bytedance.sdk.openadsdk.core.edo;

/* JADX INFO: loaded from: classes3.dex */
class TFq implements uR {
    private uR NOt;
    private int TFq;
    long ZRu = System.currentTimeMillis();
    private int mZ;
    private int uR;

    public TFq(uR uRVar, int i10, int i11, int i12) {
        this.NOt = uRVar;
        this.mZ = i10;
        this.uR = i11;
        this.TFq = i12;
    }

    @Override // com.bytedance.sdk.openadsdk.yBV.uR
    public com.bytedance.sdk.openadsdk.yBV.NOt.ZRu generatorModel() {
        com.bytedance.sdk.openadsdk.yBV.NOt.ZRu zRuGeneratorModel = this.NOt.generatorModel();
        zRuGeneratorModel.ZRu(BuildConfig.VERSION_NAME);
        zRuGeneratorModel.ZRu(this.mZ);
        zRuGeneratorModel.NOt(this.uR);
        zRuGeneratorModel.mZ(this.TFq);
        zRuGeneratorModel.NOt(this.ZRu);
        zRuGeneratorModel.Ht(Vor.NOt().TFq());
        zRuGeneratorModel.uR(edo.uR());
        return zRuGeneratorModel;
    }
}
