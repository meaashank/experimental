package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdno implements zzinw {
    private final zziof zza;

    private zzdno(zzdnb zzdnbVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdno zza(zzdnb zzdnbVar, zziof zziofVar) {
        return new zzdno(zzdnbVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzdwh) this.zza.zzb(), zzcgj.zzh);
    }
}
