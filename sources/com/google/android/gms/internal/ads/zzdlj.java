package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdlj implements zzinw {
    private final zziof zza;

    private zzdlj(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdlj zza(zziof zziofVar) {
        return new zzdlj(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdli(((zzioi) this.zza).zzb());
    }
}
