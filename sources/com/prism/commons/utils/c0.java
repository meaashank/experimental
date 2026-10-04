package com.prism.commons.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f162082b = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f162083a = new LinkedHashMap();

    public static c0 b() {
        return f162082b;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f162083a.entrySet()) {
            sb2.append(androidx.compose.ui.tooling.data.k.f105391d);
            sb2.append(entry.getKey());
            sb2.append(": ");
            sb2.append(entry.getValue());
            sb2.append("\n");
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public Map<String, String> c() {
        return this.f162083a;
    }

    public void d(String str, String str2) {
        this.f162083a.put(str, str2);
    }
}
