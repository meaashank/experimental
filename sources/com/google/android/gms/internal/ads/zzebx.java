package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebx implements zzinw {
    private final zziof zza;

    private zzebx(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzebx zzc(zziof zziofVar) {
        return new zzebx(zziofVar);
    }

    public static zzebw zzd(zzbri zzbriVar) {
        return new zzebw(zzbriVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzebw zzb() {
        return new zzebw((zzbri) this.zza.zzb());
    }
}
