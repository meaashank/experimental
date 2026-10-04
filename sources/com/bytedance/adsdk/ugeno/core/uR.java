package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    private static Map<String, NOt> ZRu = new HashMap();

    public static void ZRu(List<NOt> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (NOt nOt : list) {
            if (nOt != null) {
                ZRu.put(nOt.ZRu(), nOt);
            }
        }
    }

    public static NOt ZRu(String str) {
        return ZRu.get(str);
    }
}
