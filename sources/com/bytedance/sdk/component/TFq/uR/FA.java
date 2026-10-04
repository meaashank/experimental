package com.bytedance.sdk.component.TFq.uR;

import com.bytedance.sdk.component.TFq.yBV;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FA extends ZRu {
    private int NOt;
    private Throwable ZRu;
    private String mZ;

    public FA(int i10, String str, Throwable th) {
        this.NOt = i10;
        this.mZ = str;
        this.ZRu = th;
    }

    private void NOt(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        yBV ybvVor = mZVar.Vor();
        if (ybvVor != null) {
            ybvVor.ZRu(this.NOt, this.mZ, this.ZRu);
        }
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        mZVar.ZRu(new com.bytedance.sdk.component.TFq.mZ.ZRu(this.NOt, this.mZ, this.ZRu));
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

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "failed";
    }
}
