package com.bytedance.sdk.component.TFq.NOt;

import com.bytedance.sdk.component.TFq.Ht;
import com.bytedance.sdk.component.TFq.Mm;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class uR<T> implements Ht {
    private int NOt;
    private Mm TFq;
    Map<String, String> ZRu;
    private T mZ;
    private String uR;

    public uR(int i10, T t10, String str) {
        this.NOt = i10;
        this.mZ = t10;
        this.uR = str;
    }

    @Override // com.bytedance.sdk.component.TFq.Ht
    public int NOt() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.TFq.Ht
    public Map<String, String> TFq() {
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.component.TFq.Ht
    public Mm ZRu() {
        return this.TFq;
    }

    @Override // com.bytedance.sdk.component.TFq.Ht
    public T mZ() {
        return this.mZ;
    }

    @Override // com.bytedance.sdk.component.TFq.Ht
    public String uR() {
        return this.uR;
    }

    public void ZRu(Mm mm) {
        this.TFq = mm;
    }

    public uR(int i10, T t10, String str, Map<String, String> map) {
        this(i10, t10, str);
        this.ZRu = map;
    }
}
