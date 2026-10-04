package com.prism.hider.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168392a = "app_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f168393b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f168394c = 23;

    public static void a(String str, Object... objArr) {
    }

    public static void b(String str, Throwable th, Object... objArr) {
        e(str, 6, th, objArr);
    }

    public static void c(String str, Object... objArr) {
        e(str, 6, null, objArr);
    }

    public static void d(String str, Object... objArr) {
        e(str, 4, null, objArr);
    }

    public static void e(String str, int i10, Throwable th, Object... objArr) {
        String string;
        if (th == null && objArr != null && objArr.length == 1) {
            string = objArr[0].toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (objArr != null) {
                for (Object obj : objArr) {
                    sb2.append(obj);
                }
            }
            if (th != null) {
                sb2.append("\n");
                sb2.append(Log.getStackTraceString(th));
            }
            string = sb2.toString();
        }
        Log.println(i10, str, string);
    }

    public static String f(Class cls) {
        return g(cls.getSimpleName());
    }

    public static String g(String str) {
        int length = str.length();
        int i10 = f168393b;
        if (length <= 23 - i10) {
            return f168392a.concat(str);
        }
        return f168392a + str.substring(0, 22 - i10);
    }

    public static String h(String str, Class cls) {
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a(str);
        sbA.append(cls.getSimpleName());
        return g(sbA.toString());
    }

    public static void i(String str, Object... objArr) {
    }

    public static void j(String str, Throwable th, Object... objArr) {
        e(str, 5, th, objArr);
    }

    public static void k(String str, Object... objArr) {
        e(str, 5, null, objArr);
    }
}
