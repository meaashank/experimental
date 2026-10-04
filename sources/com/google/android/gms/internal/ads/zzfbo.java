package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbo implements zzinw {
    private final zziof zza;

    private zzfbo(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzfbo zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzfbo(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfbm zzb() {
        return new zzfbm(zzfoy.zzc(), ((zzcok) this.zza).zza());
    }
}
