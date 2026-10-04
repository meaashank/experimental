package com.bytedance.sdk.component.TFq.uR;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends ZRu {
    private byte[] NOt(com.bytedance.sdk.component.TFq.mZ.mZ mZVar, String str) {
        com.bytedance.sdk.component.TFq.mZ mZVarMZ = mZVar.om().mZ(mZVar.OCA());
        if (mZVarMZ == null) {
            return null;
        }
        return mZVarMZ.ZRu(str);
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        String strAT = mZVar.aT();
        byte[] bArrZRu = (mZVar.to() || mZVar.OCA().Ht()) ? ZRu(mZVar, strAT) : NOt(mZVar, strAT);
        if (bArrZRu == null) {
            mZVar.ZRu(new ZH());
        } else {
            mZVar.ZRu(new NOt(bArrZRu, null));
            mZVar.om().NOt(mZVar.OCA()).ZRu(strAT, bArrZRu);
        }
    }

    private byte[] ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar, String str) {
        mZVar.om().mZ(mZVar.OCA());
        Collection<com.bytedance.sdk.component.TFq.mZ> collectionMZ = mZVar.om().mZ();
        if (collectionMZ == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.TFq.mZ> it = collectionMZ.iterator();
        while (it.hasNext()) {
            byte[] bArrZRu = it.next().ZRu(str);
            if (bArrZRu != null) {
                return bArrZRu;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "disk_cache";
    }
}
