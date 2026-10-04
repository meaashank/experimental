package com.prism.gaia.helper.utils;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class A {
    public static String a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        return str.replaceFirst(str2, str3);
    }

    public static void b(String[] strArr, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = a(strArr[i10], str, str2);
        }
    }

    public static <T> String c(Iterable<T> iterable, String str) {
        StringBuilder sb2 = new StringBuilder("[");
        if (iterable != null && str != null) {
            Iterator<T> it = iterable.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append(str);
                i10++;
            }
            if (i10 > 0) {
                sb2.delete(sb2.length() - str.length(), sb2.length());
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static int d(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-') {
                cArr[i10] = cCharAt;
                i10++;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return Integer.parseInt(new String(cArr, 0, i10));
    }
}
