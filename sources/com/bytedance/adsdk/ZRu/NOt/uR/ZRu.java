package com.bytedance.adsdk.ZRu.NOt.uR;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum ZRu implements TFq {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, ZRu> uR = new HashMap(128);

    static {
        for (ZRu zRu : values()) {
            uR.put(zRu.name().toLowerCase(), zRu);
        }
    }

    public static ZRu ZRu(String str) {
        return uR.get(str.toLowerCase());
    }
}
