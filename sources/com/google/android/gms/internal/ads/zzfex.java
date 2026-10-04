package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfex implements zzinw {
    private final zziof zza;

    private zzfex(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar3;
    }

    public static zzfex zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzfex(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfev zzb() {
        return new zzfev(zzcry.zza(), zzfoy.zzc(), ((zzcok) this.zza).zza());
    }
}
