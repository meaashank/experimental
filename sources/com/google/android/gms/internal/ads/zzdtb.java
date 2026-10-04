package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdtb implements zzinw {
    private final zziof zza;

    private zzdtb(zzdsv zzdsvVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdtb zza(zzdsv zzdsvVar, zziof zziofVar) {
        return new zzdtb(zzdsvVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzgxw.zzi(new zzdlo((zzdst) this.zza.zzb(), zzcgj.zzh));
    }
}
