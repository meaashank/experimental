package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcon implements zzinw {
    private final zzcod zza;

    private zzcon(zzcod zzcodVar) {
        this.zza = zzcodVar;
    }

    public static zzcon zzc(zzcod zzcodVar) {
        return new zzcon(zzcodVar);
    }

    public final zzbmb zza() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return this.zza.zzh();
    }
}
