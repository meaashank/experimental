package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgzf {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zzb(objArr[i11], i11);
        }
        return objArr;
    }

    public static Object zzb(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 9), "at index ", i10));
    }
}
