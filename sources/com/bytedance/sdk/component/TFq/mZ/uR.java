package com.bytedance.sdk.component.TFq.mZ;

import com.bytedance.sdk.component.TFq.ZH;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class uR<T> implements ZH {
    private boolean FA;
    private int Ht;
    private Map<String, String> Mm;
    private String NOt;
    private int TFq;
    private boolean Vor;
    private int ZH;
    private String ZRu;
    private com.bytedance.sdk.component.TFq.Mm aT;
    private T mZ;
    private T uR;

    @Override // com.bytedance.sdk.component.TFq.ZH
    public boolean Ht() {
        return this.Vor;
    }

    @Override // com.bytedance.sdk.component.TFq.ZH
    public int Mm() {
        return this.ZH;
    }

    @Override // com.bytedance.sdk.component.TFq.ZH
    public T NOt() {
        return this.mZ;
    }

    @Override // com.bytedance.sdk.component.TFq.ZH
    public boolean TFq() {
        return this.FA;
    }

    public uR ZRu(mZ mZVar, T t10) {
        this.mZ = t10;
        this.ZRu = mZVar.TFq();
        this.NOt = mZVar.ZRu();
        this.TFq = mZVar.NOt();
        this.Ht = mZVar.mZ();
        this.Vor = mZVar.oK();
        this.aT = mZVar.yBV();
        this.ZH = mZVar.WMI();
        return this;
    }

    @Override // com.bytedance.sdk.component.TFq.ZH
    public T mZ() {
        return this.uR;
    }

    @Override // com.bytedance.sdk.component.TFq.ZH
    public Map<String, String> uR() {
        return this.Mm;
    }

    public uR ZRu(mZ mZVar, T t10, Map<String, String> map, boolean z10) {
        this.Mm = map;
        this.FA = z10;
        return ZRu(mZVar, t10);
    }

    @Override // com.bytedance.sdk.component.TFq.ZH
    public String ZRu() {
        return this.NOt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.TFq.ZH
    public void ZRu(Object obj) {
        this.uR = this.mZ;
        this.mZ = obj;
    }
}
