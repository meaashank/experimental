package com.bytedance.sdk.component.TFq.uR;

/* JADX INFO: loaded from: classes2.dex */
public class ZH extends ZRu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        com.bytedance.sdk.component.TFq.mZ.mZ mZVar2;
        final com.bytedance.sdk.component.TFq.mZ.Ht htOm = mZVar.om();
        com.bytedance.sdk.component.TFq.uR uRVarUR = htOm.uR();
        mZVar.ZRu(false);
        try {
            com.bytedance.sdk.component.TFq.Ht htZRu = uRVarUR.ZRu(new com.bytedance.sdk.component.TFq.NOt.mZ(mZVar.ZRu(), mZVar.sAl(), mZVar.edo(), mZVar.xY()));
            int iNOt = htZRu.NOt();
            mZVar.ZRu(htZRu.ZRu());
            mZVar2 = 200;
            try {
                if (htZRu.NOt() != 200) {
                    htOm.FA();
                    String.valueOf(htZRu);
                    Object objMZ = htZRu.mZ();
                    ZRu(iNOt, htZRu.uR(), objMZ instanceof Throwable ? (Throwable) objMZ : null, mZVar);
                    return;
                }
                final byte[] bArr = (byte[]) htZRu.mZ();
                mZVar.ZRu(new NOt(bArr, htZRu));
                final String strAT = mZVar.aT();
                final com.bytedance.sdk.component.TFq.NOt nOtOCA = mZVar.OCA();
                if (nOtOCA.mZ()) {
                    htOm.NOt(mZVar.OCA()).ZRu(strAT, bArr);
                }
                final com.bytedance.sdk.component.TFq.mZ.mZ mZVar3 = mZVar;
                try {
                    htOm.Ht().submit(new Runnable() { // from class: com.bytedance.sdk.component.TFq.uR.ZH.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (nOtOCA.uR()) {
                                htOm.mZ(mZVar3.OCA()).ZRu(strAT, bArr);
                            }
                        }
                    });
                    return;
                } catch (Throwable th) {
                    th = th;
                    mZVar2 = mZVar3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            mZVar2 = mZVar;
        }
        ZRu(1004, "net request failed!", th, mZVar2);
    }

    private void ZRu(int i10, String str, Throwable th, com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        mZVar.ZRu(new FA(i10, str, th));
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "net_request";
    }
}
