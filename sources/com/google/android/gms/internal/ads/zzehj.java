package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzehj implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzehj(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzehj zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzehj(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehi zzb() {
        return new zzehi(((zzcok) this.zza).zza(), (zzcer) this.zzb.zzb());
    }
}
