package com.bytedance.sdk.component.TFq.uR;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.TFq.qF;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class aT extends ZRu {
    private Bitmap NOt(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        Collection<qF> collectionZRu = mZVar.om().ZRu();
        Bitmap bitmapZRu = null;
        if (collectionZRu == null) {
            return null;
        }
        Iterator<qF> it = collectionZRu.iterator();
        while (it.hasNext() && (bitmapZRu = it.next().ZRu(mZVar.TFq())) == null) {
        }
        return bitmapZRu;
    }

    private Bitmap mZ(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        return mZVar.om().ZRu(mZVar.OCA()).ZRu(mZVar.TFq());
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        int iLp = mZVar.lp();
        Bitmap bitmapNOt = (iLp == 2 || iLp == 1) ? (mZVar.to() || mZVar.OCA().Ht()) ? NOt(mZVar) : mZ(mZVar) : null;
        if (bitmapNOt == null) {
            mZVar.ZRu(new lp());
        } else {
            mZVar.ZRu(new sAl(bitmapNOt, null, false));
        }
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "memory_cache";
    }
}
