package com.prism.gaia.download;

import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class q {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        int iIndexOf = lowerCase.indexOf(59);
        return iIndexOf != -1 ? lowerCase.substring(0, iIndexOf) : lowerCase;
    }
}
