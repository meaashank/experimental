package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdj {
    private final String zza;
    private final long zzb;

    public zzgdj() {
        this.zza = null;
        this.zzb = -1L;
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }

    public zzgdj(String str, long j10) {
        this.zza = str;
        this.zzb = j10;
    }
}
