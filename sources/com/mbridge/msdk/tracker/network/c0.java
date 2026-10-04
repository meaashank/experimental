package com.mbridge.msdk.tracker.network;

import android.util.Log;
import com.android.launcher3.IconCache;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f159942a = "TrackManager_Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f159943b = "com.mbridge.msdk.tracker.network.c0";

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f159942a, a(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f159942a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f159942a, a(str, objArr));
    }

    public static void d(String str, Object... objArr) {
    }

    private static String a(String str, Object... objArr) {
        String string;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(f159943b)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbA = android.support.v4.media.f.a(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), IconCache.EMPTY_CLASS_NAME);
                sbA.append(stackTrace[i10].getMethodName());
                string = sbA.toString();
                break;
            }
            i10++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str);
    }
}
