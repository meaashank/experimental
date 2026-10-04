package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexl implements zzinw {
    private final zziof zza;

    private zzexl(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzexl zzc(zziof zziofVar) {
        return new zzexl(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexj zzb() {
        return new zzexj(((zzddg) this.zza).zza());
    }
}
