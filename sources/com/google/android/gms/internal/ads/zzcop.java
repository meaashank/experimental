package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcop implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcop(zzcod zzcodVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcop zza(zzcod zzcodVar, zziof zziofVar, zziof zziofVar2) {
        return new zzcop(zzcodVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdN)).booleanValue() ? new zzbbd((zzbay) this.zzb.zzb()) : new zzbbd((zzbay) this.zza.zzb());
    }
}
