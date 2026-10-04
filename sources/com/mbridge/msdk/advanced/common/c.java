package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f153745a = new HashMap();

    public static void a(String str, boolean z10) {
        f153745a.put(str, Boolean.valueOf(z10));
    }

    public static void b(String str) {
        f153745a.remove(str);
    }

    public static boolean a(String str) {
        if (f153745a.containsKey(str)) {
            return f153745a.get(str).booleanValue();
        }
        return false;
    }
}
