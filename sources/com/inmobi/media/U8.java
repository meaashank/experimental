package com.inmobi.media;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.text.C5013e;

/* JADX INFO: loaded from: classes5.dex */
public abstract class U8 {
    public static final boolean a(Ma ma2) {
        String str;
        kotlin.jvm.internal.G.p(ma2, "<this>");
        Map map = ma2.f152247c;
        return (map == null || (str = (String) map.get("Content-Encoding")) == null || !kotlin.text.M.p3(str, "gzip", false, 2, null)) ? false : true;
    }

    public static final String a(String url, Map map) {
        kotlin.jvm.internal.G.p(url, "url");
        if (map == null) {
            return url;
        }
        boolean z10 = C3473a9.f152704a;
        C3473a9.a(map);
        String strA = C3473a9.a("&", map);
        StringBuilder sb2 = new StringBuilder(url);
        int length = strA.length() - 1;
        int i10 = 0;
        boolean z11 = false;
        while (i10 <= length) {
            boolean z12 = kotlin.jvm.internal.G.t(strA.charAt(!z11 ? i10 : length), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                }
                length--;
            } else if (z12) {
                i10++;
            } else {
                z11 = true;
            }
        }
        if (strA.subSequence(i10, length + 1).toString().length() > 0) {
            if (!kotlin.text.M.p3(url, "?", false, 2, null)) {
                sb2.append("?");
            }
            if (!kotlin.text.F.d2(url, "&", false, 2, null) && !kotlin.text.F.d2(url, "?", false, 2, null)) {
                sb2.append("&");
            }
            sb2.append(strA);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    public static final String a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return new String(bArr, C5013e.f218326b);
            } catch (UnsupportedEncodingException | Exception unused) {
            }
        }
        return "";
    }
}
