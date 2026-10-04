package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeso implements zzinw {
    private final zziof zza;

    private zzeso(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzeso zzc(zziof zziofVar) {
        return new zzeso(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzesn zzb() {
        return new zzesn((zzdoe) this.zza.zzb());
    }
}
