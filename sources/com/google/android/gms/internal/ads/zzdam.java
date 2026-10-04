package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdam implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdam(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdam zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdam(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdal((zzdap) this.zza.zzb(), ((zzddg) this.zzb).zza());
    }
}
