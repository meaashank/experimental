package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmt implements zzinw {
    private final zziof zza;

    private zzdmt(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdmt zza(zziof zziofVar) {
        return new zzdmt(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdms(((zzioi) this.zza).zzb());
    }
}
