package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdex implements zzinw {
    private final zziof zza;

    private zzdex(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdex zza(zziof zziofVar) {
        return new zzdex(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdew(((zzioi) this.zza).zzb());
    }
}
