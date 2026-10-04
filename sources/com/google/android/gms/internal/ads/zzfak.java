package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfak implements zzinw {
    private final zziof zza;

    private zzfak(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzfak zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzfak(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfai zzb() {
        return new zzfai(zzfoy.zzc(), ((zzcok) this.zza).zza());
    }
}
