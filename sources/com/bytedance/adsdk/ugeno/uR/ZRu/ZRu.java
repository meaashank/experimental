package com.bytedance.adsdk.ugeno.uR.ZRu;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private volatile Map<String, mZ> ZRu = new HashMap();

    public mZ ZRu(String str) {
        if (this.ZRu.containsKey(str) && this.ZRu.get(str) != null) {
            return this.ZRu.get(str);
        }
        NOt nOt = new NOt();
        this.ZRu.put(str, nOt);
        return nOt;
    }

    public void ZRu(String str, mZ mZVar) {
        if (!this.ZRu.containsKey(str) || this.ZRu.get(str) == null) {
            this.ZRu.put(str, mZVar);
        }
    }
}
