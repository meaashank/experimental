package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbgo {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbgo(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzbgo)) {
            return false;
        }
        zzbgo zzbgoVar = (zzbgo) obj;
        return zzbgoVar.zza == this.zza && zzbgoVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
