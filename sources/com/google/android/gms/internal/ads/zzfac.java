package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfac implements zzinw {
    private final zziof zza;

    private zzfac(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzfac zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzfac(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfab zzb() {
        return new zzfab(((zzcok) this.zza).zza(), zzfoy.zzc());
    }
}
