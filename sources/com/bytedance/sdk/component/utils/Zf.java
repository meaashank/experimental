package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class Zf {
    public static Method ZRu(String str, String str2, Class<?>... clsArr) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Class<?> clsZRu = ZRu(str);
                if (clsZRu != null) {
                    return clsZRu.getMethod(str2, clsArr);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Class<?> ZRu(String str) {
        try {
            try {
                try {
                    return Class.forName(str, true, ZRu());
                } catch (ClassNotFoundException unused) {
                    return Class.forName(str);
                }
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return Class.forName(str, true, Zf.class.getClassLoader());
        }
    }

    private static ClassLoader ZRu() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader == null ? Zf.class.getClassLoader() : contextClassLoader;
    }
}
