package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq;

import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Vor;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends ZRu {
    private oK mZ;

    public Ht(oK oKVar, TFq tFq) {
        com.bytedance.sdk.component.NOt.ZRu.Ht htMm;
        this.mZ = oKVar;
        this.ZRu = new ArrayList();
        if (oKVar != null && (htMm = oKVar.Mm()) != null) {
            for (int i10 = 0; i10 < htMm.ZRu(); i10++) {
                this.ZRu.add(new Vor.NOt(htMm.ZRu(i10), htMm.NOt(i10)));
            }
        }
        this.NOt = tFq;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu
    public String Ht() {
        return ZRu(this.mZ.mZ());
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu
    public boolean NOt() {
        return this.mZ.mZ() >= 200 && this.mZ.mZ() < 300;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu
    public String TFq() {
        oK oKVar = this.mZ;
        return (oKVar == null || oKVar.FA() == null) ? "http/1.1" : this.mZ.FA().toString();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu
    public int ZRu() {
        return this.mZ.mZ();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu
    public List<Vor.NOt> mZ() {
        return this.ZRu;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu
    public InputStream uR() {
        return this.mZ.Ht().mZ();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu
    public String ZRu(String str, String str2) {
        return ZRu(str) != null ? ZRu(str).NOt : str2;
    }
}
