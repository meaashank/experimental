package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajf {
    private long zza = -9223372036854775807L;
    private long zzb = -9223372036854775807L;
    private boolean zzc;

    @Nullable
    private zzx zzd;

    public final zzajf zza(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzajf zzb(long j10) {
        this.zzb = j10;
        return this;
    }

    public final zzajf zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzajf zzd(@Nullable zzx zzxVar) {
        this.zzd = zzxVar;
        return this;
    }

    public final zzajg zze() {
        return new zzajh(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
