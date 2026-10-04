package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwi implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdwi(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdwi zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdwi(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdwh((zzdew) this.zza.zzb(), ((zzczc) this.zzb).zza());
    }
}
