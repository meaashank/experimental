package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejp implements zzinw {
    private final zziof zza;

    private zzejp(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzejp zzc(zziof zziofVar) {
        return new zzejp(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzejo zzb() {
        return new zzejo(((zzcpi) this.zza).zzb());
    }
}
