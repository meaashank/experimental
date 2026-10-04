package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnx implements zzinw {
    private final zzdnb zza;
    private final zziof zzb;

    private zzdnx(zzdnb zzdnbVar, zziof zziofVar) {
        this.zza = zzdnbVar;
        this.zzb = zziofVar;
    }

    public static zzdnx zza(zzdnb zzdnbVar, zziof zziofVar) {
        return new zzdnx(zzdnbVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzg((Executor) this.zzb.zzb());
    }
}
