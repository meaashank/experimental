package com.bytedance.sdk.component.TFq.uR;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements Vor {
    private com.bytedance.sdk.component.TFq.Ht NOt;
    private byte[] ZRu;

    public NOt(byte[] bArr, com.bytedance.sdk.component.TFq.Ht ht) {
        this.ZRu = bArr;
        this.NOt = ht;
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        Vor tFq;
        int iLp = mZVar.lp();
        mZVar.ZRu(this.ZRu.length);
        if (iLp == 2) {
            tFq = com.bytedance.sdk.component.TFq.mZ.mZ.ZRu.ZRu(this.ZRu) ? new TFq(this.ZRu, this.NOt) : this.NOt == null ? new ZH() : new FA(1001, "not image format", null);
        } else if (iLp != 3) {
            boolean zNOt = com.bytedance.sdk.component.TFq.mZ.mZ.ZRu.NOt(this.ZRu);
            tFq = (!zNOt && com.bytedance.sdk.component.TFq.mZ.mZ.ZRu.ZRu(this.ZRu)) ? new TFq(this.ZRu, this.NOt) : new sAl(this.ZRu, this.NOt, zNOt);
        } else {
            byte[] bArr = this.ZRu;
            tFq = new sAl(bArr, this.NOt, com.bytedance.sdk.component.TFq.mZ.mZ.ZRu.NOt(bArr));
        }
        mZVar.ZRu(tFq);
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "image_type";
    }
}
