package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnd implements zzinw {
    private final zziof zza;

    private zzdnd(zzdnb zzdnbVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdnd zza(zzdnb zzdnbVar, zziof zziofVar) {
        return new zzdnd(zzdnbVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzfqo) this.zza.zzb(), zzcgj.zzh);
    }
}
