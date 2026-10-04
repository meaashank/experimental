package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdiu implements zzinw {
    private final zziof zza;

    private zzdiu(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdiu zza(zziof zziofVar) {
        return new zzdiu(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdit(((zzioi) this.zza).zzb());
    }
}
