package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevl implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzevl(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar2;
        this.zzb = zziofVar3;
    }

    public static zzevl zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzevl(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevj zzb() {
        return new zzevj(zzfoy.zzc(), ((zzddg) this.zza).zza(), (zzfmm) this.zzb.zzb());
    }
}
