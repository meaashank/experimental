package com.prism.commons.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, V> f162066a = new ConcurrentHashMap();

    public static V a(String str) {
        V v10 = f162066a.get(str);
        if (v10 != null) {
            return v10;
        }
        V v11 = new V(str);
        f162066a.put(str, v11);
        return v11;
    }
}
