package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzehd implements zzinw {
    private final zziof zza;

    private zzehd(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzehd zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzehd(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehc zzb() {
        return new zzehc(((zzcok) this.zza).zza(), zzfoy.zzc());
    }
}
