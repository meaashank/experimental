package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdgj implements zzinw {
    private final zziof zza;

    private zzdgj(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdgj zza(zziof zziofVar) {
        return new zzdgj(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdgi(((zzioi) this.zza).zzb());
    }
}
