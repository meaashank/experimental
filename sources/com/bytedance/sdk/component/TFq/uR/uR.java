package com.bytedance.sdk.component.TFq.uR;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends ZRu {
    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        com.bytedance.sdk.component.TFq.NOt nOtOCA = mZVar.OCA();
        if (nOtOCA != null) {
            if (nOtOCA.mZ()) {
                mZVar.ZRu(new aT());
                return;
            } else if (nOtOCA.uR()) {
                mZVar.ZRu(new Ht());
                return;
            }
        }
        mZVar.ZRu(new ZH());
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "cache_policy";
    }
}
