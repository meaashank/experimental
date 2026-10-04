package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbs implements zzinw {
    private final zziof zza;

    private zzfbs(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzfbs zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzfbs(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfbq zzb() {
        return new zzfbq(zzfoy.zzc(), (zzebm) this.zza.zzb());
    }
}
