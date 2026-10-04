package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbjs {
    private final long zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final zzbjs zzc;

    public zzbjs(long j10, @Nullable String str, @Nullable zzbjs zzbjsVar) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = zzbjsVar;
    }

    public final long zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzbjs zzc() {
        return this.zzc;
    }
}
