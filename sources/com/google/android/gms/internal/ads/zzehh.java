package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzehh implements zzinw {
    private final zziof zza;

    private zzehh(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzehh zzc(zziof zziofVar) {
        return new zzehh(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehg zzb() {
        return new zzehg(((zzcok) this.zza).zza());
    }
}
