package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexi implements zzinw {
    private final zziof zza;

    private zzexi(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzexi zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzexi(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexg zzb() {
        return new zzexg(zzfoy.zzc(), ((zzcok) this.zza).zza());
    }
}
