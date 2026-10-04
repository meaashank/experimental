package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmb implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdmb(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdmb zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdmb(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdma(((zzczc) this.zza).zza(), (zzfte) this.zzb.zzb());
    }
}
