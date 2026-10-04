package com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu;

import android.text.TextUtils;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.sAl;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends ZH {
    public TFq FA;
    public ZRu Vor;

    public uR(ZH.ZRu zRu) {
        super(zRu);
        TFq tFq = new TFq();
        this.FA = tFq;
        this.Vor = new ZRu(tFq.NOt());
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.ZH
    public com.bytedance.sdk.component.NOt.ZRu.uR ZRu() {
        return this.FA;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.ZH
    public com.bytedance.sdk.component.NOt.ZRu.NOt ZRu(sAl sal) {
        sal.ZRu(this);
        if (sal.NOt() == null || sal.NOt().ZRu() == null || TextUtils.isEmpty(sal.NOt().ZRu().toString())) {
            return null;
        }
        if (ZRu.ZRu == null || !ZRu.ZRu.NOt() || !this.Vor.TFq() || "setting".equals(sal.Ht())) {
            NOt nOt = new NOt(sal, this.FA);
            this.FA.mZ().add(nOt);
            return nOt;
        }
        NOt nOt2 = new NOt(sal, this.Vor);
        this.Vor.mZ().add(nOt2);
        return nOt2;
    }
}
