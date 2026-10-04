package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnm implements zzinw {
    private final zziof zza;

    private zzdnm(zzdnb zzdnbVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdnm zza(zzdnb zzdnbVar, zziof zziofVar) {
        return new zzdnm(zzdnbVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzdon) this.zza.zzb(), zzcgj.zzf);
    }
}
