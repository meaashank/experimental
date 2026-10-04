package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfdy implements zzinw {
    private final zziof zza;

    private zzfdy(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzfdy zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzfdy(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdx zzb() {
        return new zzfdx(zzfoy.zzc(), ((zzcok) this.zza).zza());
    }
}
