package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnn implements zzinw {
    private final zziof zza;

    private zzdnn(zzdnb zzdnbVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdnn zza(zzdnb zzdnbVar, zziof zziofVar) {
        return new zzdnn(zzdnbVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzdon) this.zza.zzb(), zzcgj.zzf);
    }
}
