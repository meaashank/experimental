package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcyd {
    private final zzdgq zza;

    @Nullable
    private final zzdiv zzb;

    public zzcyd(zzdgq zzdgqVar, @Nullable zzdiv zzdivVar) {
        this.zza = zzdgqVar;
        this.zzb = zzdivVar;
    }

    public final zzdgq zza() {
        return this.zza;
    }

    public final zzdlo zzb() {
        zzdiv zzdivVar = this.zzb;
        return zzdivVar != null ? new zzdlo(zzdivVar, zzcgj.zzh) : new zzdlo(new zzcyc(this), zzcgj.zzh);
    }

    @Nullable
    public final zzdiv zzc() {
        return this.zzb;
    }
}
