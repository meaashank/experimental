package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WMI implements com.bytedance.adsdk.ZRu.NOt.NOt.ZRu {
    protected com.bytedance.adsdk.ZRu.NOt.NOt.ZRu NOt;
    protected com.bytedance.adsdk.ZRu.NOt.NOt.ZRu ZRu;
    protected com.bytedance.adsdk.ZRu.NOt.uR.mZ mZ;

    public WMI(com.bytedance.adsdk.ZRu.NOt.uR.mZ mZVar) {
        this.mZ = mZVar;
    }

    public void NOt(com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu) {
        this.NOt = zRu;
    }

    public void ZRu(com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu) {
        this.ZRu = zRu;
    }

    public String toString() {
        return NOt();
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public String NOt() {
        return this.ZRu.NOt() + this.mZ.ZRu() + this.NOt.NOt();
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public com.bytedance.adsdk.ZRu.NOt.uR.TFq ZRu() {
        return com.bytedance.adsdk.ZRu.NOt.uR.Ht.OPERATOR_RESULT;
    }
}
