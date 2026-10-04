package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zzbjn {
    public static boolean zza(@Nullable zzbjv zzbjvVar, @Nullable zzbjs zzbjsVar, String... strArr) {
        if (zzbjsVar == null) {
            return false;
        }
        zzbjvVar.zzb(zzbjsVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), strArr);
        return true;
    }
}
