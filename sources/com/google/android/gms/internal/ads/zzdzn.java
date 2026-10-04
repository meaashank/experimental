package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdzn implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdzn(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdzn zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzdzn(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzm zzb() {
        return new zzdzm((zzbif) this.zza.zzb(), ((zzioa) this.zzb).zzb());
    }
}
