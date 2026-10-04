package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public abstract class O8 {
    public static String a(String valueTypeString) {
        kotlin.jvm.internal.G.p(valueTypeString, "valueTypeString");
        int length = valueTypeString.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.G.t(valueTypeString.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = R6.a(length, 1, valueTypeString, i10);
        int iHashCode = strA.hashCode();
        return iHashCode != -1900324833 ? iHashCode != -835221992 ? iHashCode != 116079 ? (iHashCode == 3213227 && strA.equals("html")) ? "HTML" : com.prism.lib_google_billing.q.f194113a : !strA.equals("url") ? com.prism.lib_google_billing.q.f194113a : "URL" : !strA.equals("reference_iframe") ? com.prism.lib_google_billing.q.f194113a : "REF_IFRAME" : !strA.equals("reference_html") ? com.prism.lib_google_billing.q.f194113a : "REF_HTML";
    }
}
