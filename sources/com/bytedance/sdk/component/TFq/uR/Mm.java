package com.bytedance.sdk.component.TFq.uR;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Mm extends ZRu {
    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        List<com.bytedance.sdk.component.TFq.mZ.mZ> linkedList;
        String strZf = mZVar.Zf();
        Map<String, List<com.bytedance.sdk.component.TFq.mZ.mZ>> mapMm = mZVar.om().Mm();
        synchronized (mapMm) {
            try {
                linkedList = mapMm.get(strZf);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (linkedList) {
            try {
                linkedList.add(mZVar);
                mapMm.put(strZf, linkedList);
                if (linkedList.size() <= 1) {
                    mZVar.ZRu(new uR());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "check_duplicate";
    }
}
