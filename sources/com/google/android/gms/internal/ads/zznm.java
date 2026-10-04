package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zznm {
    public static final zznm zza;
    public static final zznm zzb;
    public static final zznm zzc;
    public final long zzd;
    public final long zze = 0;

    static {
        zznm zznmVar = new zznm(0L, 0L);
        zza = zznmVar;
        zzb = new zznm(Long.MAX_VALUE, 0L);
        zzc = zznmVar;
    }

    public zznm(long j10, long j11) {
        this.zzd = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zznm.class == obj.getClass() && this.zzd == ((zznm) obj).zzd;
    }

    public final int hashCode() {
        return ((int) this.zzd) * 31;
    }
}
