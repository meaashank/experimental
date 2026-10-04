package com.bytedance.sdk.component.TFq.uR;

import com.bytedance.sdk.component.TFq.yBV;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class sAl<T> extends ZRu {
    private com.bytedance.sdk.component.TFq.Ht NOt;
    private T ZRu;
    private boolean mZ;

    public sAl(T t10, com.bytedance.sdk.component.TFq.Ht ht, boolean z10) {
        this.ZRu = t10;
        this.NOt = ht;
        this.mZ = z10;
    }

    private Map<String, String> NOt() {
        com.bytedance.sdk.component.TFq.Ht ht = this.NOt;
        if (ht != null) {
            return ht.TFq();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        String strZf = mZVar.Zf();
        Map<String, List<com.bytedance.sdk.component.TFq.mZ.mZ>> mapMm = mZVar.om().Mm();
        List<com.bytedance.sdk.component.TFq.mZ.mZ> list = mapMm.get(strZf);
        if (list == null) {
            NOt(mZVar);
            return;
        }
        synchronized (list) {
            try {
                Iterator<com.bytedance.sdk.component.TFq.mZ.mZ> it = list.iterator();
                while (it.hasNext()) {
                    NOt(it.next());
                }
                list.clear();
                mapMm.remove(strZf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void NOt(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        yBV ybvVor = mZVar.Vor();
        if (ybvVor != null) {
            ybvVor.ZRu(new com.bytedance.sdk.component.TFq.mZ.uR().ZRu(mZVar, this.ZRu, NOt(), this.mZ));
        }
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "success";
    }
}
