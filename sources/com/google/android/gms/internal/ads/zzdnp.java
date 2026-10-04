package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnp implements zzinw {
    private final zzdnb zza;
    private final zziof zzb;

    private zzdnp(zzdnb zzdnbVar, zziof zziofVar) {
        this.zza = zzdnbVar;
        this.zzb = zziofVar;
    }

    public static zzdnp zza(zzdnb zzdnbVar, zziof zziofVar) {
        return new zzdnp(zzdnbVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZze = this.zza.zze((zzdce) this.zzb.zzb());
        zzioe.zzb(setZze);
        return setZze;
    }
}
