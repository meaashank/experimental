package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdza implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdza(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdza zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdza(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdyz((zzbif) this.zza.zzb(), (zzfiy) this.zzb.zzb());
    }
}
