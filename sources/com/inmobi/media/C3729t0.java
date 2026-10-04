package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3729t0 {
    public static final String a(String str, Map map) {
        if (map == null || str == null) {
            return str;
        }
        String strB2 = str;
        for (Object obj : map.keySet()) {
            strB2 = strB2 != null ? kotlin.text.F.B2(strB2, String.valueOf(obj), String.valueOf(map.get(obj)), false, 4, null) : null;
        }
        return strB2;
    }
}
