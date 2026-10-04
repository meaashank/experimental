package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzded implements zzinw {
    private final zziof zza;

    private zzded(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzded zzc(zziof zziofVar) {
        return new zzded(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzddy zzb() {
        return new zzddy(((zzioi) this.zza).zzb());
    }
}
