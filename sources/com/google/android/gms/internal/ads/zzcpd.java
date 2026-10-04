package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcpd implements zzinw {
    private final zziof zza;

    private zzcpd(zzcod zzcodVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcpd zzc(zzcod zzcodVar, zziof zziofVar) {
        return new zzcpd(zzcodVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcga zzb() {
        return ((zzcfv) this.zza.zzb()).zzs();
    }
}
