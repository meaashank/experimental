package com.bytedance.adsdk.ugeno.uR.ZRu;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements mZ {
    private List<uR> ZRu = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.uR.ZRu.mZ
    public void ZRu(uR uRVar) {
        this.ZRu.add(uRVar);
    }

    @Override // com.bytedance.adsdk.ugeno.uR.ZRu.mZ
    public void ZRu(String str) {
        if (this.ZRu.isEmpty()) {
            return;
        }
        Iterator<uR> it = this.ZRu.iterator();
        while (it.hasNext()) {
            it.next().ZRu(str);
        }
    }
}
