package com.bytedance.adsdk.NOt.ZRu.ZRu;

import com.bytedance.adsdk.NOt.ZRu.NOt.ZRu;
import com.bytedance.adsdk.NOt.mZ.NOt.om;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class to implements ZRu.InterfaceC0381ZRu, mZ {
    private final com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<?, Float> Ht;
    private final com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<?, Float> Mm;
    private final boolean NOt;
    private final com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<?, Float> TFq;
    private final String ZRu;
    private final List<ZRu.InterfaceC0381ZRu> mZ = new ArrayList();
    private final om.ZRu uR;

    public to(com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu, com.bytedance.adsdk.NOt.mZ.NOt.om omVar) {
        this.ZRu = omVar.ZRu();
        this.NOt = omVar.Ht();
        this.uR = omVar.NOt();
        com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Float, Float> ZRu = omVar.uR().ZRu();
        this.TFq = ZRu;
        com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Float, Float> ZRu2 = omVar.mZ().ZRu();
        this.Ht = ZRu2;
        com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Float, Float> ZRu3 = omVar.TFq().ZRu();
        this.Mm = ZRu3;
        zRu.ZRu(ZRu);
        zRu.ZRu(ZRu2);
        zRu.ZRu(ZRu3);
        ZRu.ZRu(this);
        ZRu2.ZRu(this);
        ZRu3.ZRu(this);
    }

    public boolean Ht() {
        return this.NOt;
    }

    public om.ZRu NOt() {
        return this.uR;
    }

    public com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<?, Float> TFq() {
        return this.Mm;
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.mZ
    public void ZRu(List<mZ> list, List<mZ> list2) {
    }

    public com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<?, Float> mZ() {
        return this.TFq;
    }

    public com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<?, Float> uR() {
        return this.Ht;
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.InterfaceC0381ZRu
    public void ZRu() {
        for (int i10 = 0; i10 < this.mZ.size(); i10++) {
            this.mZ.get(i10).ZRu();
        }
    }

    public void ZRu(ZRu.InterfaceC0381ZRu interfaceC0381ZRu) {
        this.mZ.add(interfaceC0381ZRu);
    }
}
