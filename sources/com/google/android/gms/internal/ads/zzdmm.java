package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmm implements zzinw {
    private final zziof zza;

    private zzdmm(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdmm zza(zziof zziofVar) {
        return new zzdmm(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdml(((zzioi) this.zza).zzb());
    }
}
