package com.bytedance.adsdk.ZRu.NOt.TFq;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    public static boolean NOt(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean ZRu(char c10) {
        return c10 == ' ';
    }

    public static boolean mZ(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean uR(char c10) {
        return '+' == c10 || '-' == c10 || '*' == c10 || '/' == c10 || '%' == c10 || '=' == c10 || '>' == c10 || '<' == c10 || '!' == c10 || '&' == c10 || '|' == c10 || '?' == c10 || ':' == c10;
    }
}
