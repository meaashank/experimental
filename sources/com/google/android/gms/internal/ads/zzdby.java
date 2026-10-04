package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdby implements zzinw {
    private final zziof zza;

    private zzdby(zzdbu zzdbuVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdby zza(zzdbu zzdbuVar, zziof zziofVar) {
        return new zzdby(zzdbuVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzdbs) this.zza.zzb(), zzcgj.zzh);
    }
}
