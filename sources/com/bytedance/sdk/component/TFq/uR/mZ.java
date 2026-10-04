package com.bytedance.sdk.component.TFq.uR;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends ZRu {
    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        if (TextUtils.isEmpty(mZVar.TFq())) {
            com.bytedance.sdk.component.TFq.lp lpVarTFq = mZVar.om().TFq();
            mZVar.NOt(lpVarTFq.ZRu(mZVar));
            mZVar.ZRu(lpVarTFq.NOt(mZVar));
        }
        mZVar.ZRu(new Mm());
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "generate_key";
    }
}
