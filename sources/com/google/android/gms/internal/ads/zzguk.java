package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzguk {
    public static void zza(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgvb.zzd(str, Character.valueOf(c10)));
        }
    }

    public static void zzd(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgvb.zzd(str, Integer.valueOf(i10)));
        }
    }

    public static void zze(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgvb.zzd(str, Long.valueOf(j10)));
        }
    }

    public static void zzf(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(zzgvb.zzd(str, obj));
        }
    }

    public static void zzg(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(zzgvb.zzd(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void zzh(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(zzgvb.zzd(str, obj, obj2));
        }
    }

    public static void zzi(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzj(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object zzk(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzl(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzgvb.zzd(str, obj2));
    }

    public static int zzm(int i10, int i11, String str) {
        String strZzd;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZzd = zzgvb.zzd("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(androidx.multidex.d.a(new StringBuilder(String.valueOf(i11).length() + 15), "negative size: ", i11));
            }
            strZzd = zzgvb.zzd("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZzd);
    }

    public static int zzn(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzp(i10, i11, FirebaseAnalytics.Param.INDEX));
        }
        return i10;
    }

    public static void zzo(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? zzp(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? zzp(i11, i12, "end index") : zzgvb.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    private static String zzp(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzgvb.zzd("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzgvb.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(androidx.multidex.d.a(new StringBuilder(String.valueOf(i11).length() + 15), "negative size: ", i11));
    }
}
