package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdei implements zzinw {
    private final zziof zza;

    private zzdei(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdei zza(zziof zziofVar) {
        return new zzdei(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdeh(((zzioi) this.zza).zzb());
    }
}
