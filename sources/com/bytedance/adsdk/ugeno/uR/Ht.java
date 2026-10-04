package com.bytedance.adsdk.ugeno.uR;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Ht {
    private static Map<String, mZ> ZRu = new HashMap();

    public static void ZRu(List<mZ> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (mZ mZVar : list) {
            if (mZVar != null) {
                ZRu.put(mZVar.ZRu(), mZVar);
            }
        }
    }

    public static mZ ZRu(String str) {
        return ZRu.get(str);
    }
}
