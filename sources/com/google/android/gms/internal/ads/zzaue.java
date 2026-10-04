package com.google.android.gms.internal.ads;

import android.util.Log;
import com.android.launcher3.IconCache;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaue {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable("Volley", 2);
    private static final String zzc = zzaue.class.getName();

    public static void zza(String str, Object... objArr) {
        if (zzb) {
            Log.v(zza, zze(str, objArr));
        }
    }

    public static void zzb(String str, Object... objArr) {
        Log.d(zza, zze(str, objArr));
    }

    public static void zzc(String str, Object... objArr) {
        Log.e(zza, zze(str, objArr));
    }

    public static void zzd(Throwable th, String str, Object... objArr) {
        Log.e(zza, zze(str, objArr), th);
    }

    private static String zze(String str, Object... objArr) {
        String strA;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                strA = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(zzc)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i10].getMethodName();
                strA = androidx.compose.animation.core.E0.a(new StringBuilder(com.google.android.gms.ads.internal.util.e.a(strSubstring2, 1) + String.valueOf(methodName).length()), strSubstring2, IconCache.EMPTY_CLASS_NAME, methodName);
                break;
            }
            i10++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), strA, str2);
    }
}
