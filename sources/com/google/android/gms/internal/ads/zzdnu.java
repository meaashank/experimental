package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnu implements zzinw {
    private final zziof zza;

    private zzdnu(zzdnb zzdnbVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzdnu zza(zzdnb zzdnbVar, zziof zziofVar, zziof zziofVar2) {
        return new zzdnu(zzdnbVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzdor) this.zza.zzb(), zzfoy.zzc());
    }
}
