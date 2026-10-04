package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczu implements zzinw {
    private final zziof zza;

    private zzczu(zzczr zzczrVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzczu zza(zzczr zzczrVar, zziof zziofVar) {
        return new zzczu(zzczrVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzdab) this.zza.zzb(), zzcgj.zzh);
    }
}
