package com.bytedance.sdk.openadsdk.uR.ZRu;

/* JADX INFO: loaded from: classes3.dex */
class Mm implements com.bytedance.sdk.component.Ht.ZRu.TFq.mZ {
    private final com.bytedance.sdk.component.Mm.NOt.NOt ZRu;

    public Mm() {
        com.bytedance.sdk.component.Mm.NOt.NOt nOtMZ = com.bytedance.sdk.openadsdk.WMI.mZ.ZRu().NOt().mZ();
        this.ZRu = nOtMZ;
        nOtMZ.ZRu(7);
        nOtMZ.ZRu("track_url");
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.TFq.mZ
    public void ZRu(String str) {
        this.ZRu.NOt(str);
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.TFq.mZ
    public void ZRu(String str, String str2) {
        this.ZRu.NOt(str, str2);
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.TFq.mZ
    public com.bytedance.sdk.component.Ht.ZRu.TFq.uR ZRu() {
        return new Vor(this.ZRu.ZRu());
    }
}
