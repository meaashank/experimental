package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmg implements zzinw {
    private final zziof zza;

    private zzdmg(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdmg zza(zziof zziofVar) {
        return new zzdmg(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdmf(((zzioi) this.zza).zzb());
    }
}
