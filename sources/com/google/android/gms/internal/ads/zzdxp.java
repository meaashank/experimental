package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxp implements zzinw {
    private final zziof zza;

    private zzdxp(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdxp zzc(zziof zziofVar) {
        return new zzdxp(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdxo zzb() {
        return new zzdxo((zzclm) this.zza.zzb());
    }
}
