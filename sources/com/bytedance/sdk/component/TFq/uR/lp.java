package com.bytedance.sdk.component.TFq.uR;

/* JADX INFO: loaded from: classes2.dex */
public class lp extends ZRu {
    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        byte[] bArrZRu = mZVar.om().NOt(mZVar.OCA()).ZRu(mZVar.aT());
        if (bArrZRu == null) {
            mZVar.ZRu(new Ht());
        } else {
            mZVar.ZRu(new NOt(bArrZRu, null));
        }
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "raw_cache";
    }
}
