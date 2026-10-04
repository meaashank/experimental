package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfql implements zzinw {
    private final zziof zza;

    private zzfql(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzfql zzc(zziof zziofVar) {
        return new zzfql(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfqh zzb() {
        return new zzfqh(((zzioi) this.zza).zzb());
    }
}
