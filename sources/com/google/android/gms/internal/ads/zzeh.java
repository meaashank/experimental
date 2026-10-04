package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.fragment.app.C2564b;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeh {
    private static final Object zza = new Object();

    @Pure
    public static void zza(@e.Y(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.d(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzb(@e.Y(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.i(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzc(@e.Y(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzd(@e.Y(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.w(str, zzg(str2, th));
        }
    }

    @Pure
    public static void zze(@e.Y(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzf(@e.Y(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.e(str, zzg(str2, th));
        }
    }

    @Pure
    public static String zzg(String str, @Nullable Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (zza) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", TextProcessor.f150538k0);
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return C2564b.a(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }
}
