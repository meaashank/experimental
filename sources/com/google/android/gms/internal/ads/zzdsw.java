package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdsw implements zzinw {
    private final zziof zza;

    private zzdsw(zzdsv zzdsvVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdsw zza(zzdsv zzdsvVar, zziof zziofVar) {
        return new zzdsw(zzdsvVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdst zzdstVar = (zzdst) this.zza.zzb();
        zzioe.zzb(zzdstVar);
        return zzdstVar;
    }
}
