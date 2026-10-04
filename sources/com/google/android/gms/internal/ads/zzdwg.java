package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwg implements zzinw {
    private final zziof zza;

    private zzdwg(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdwg zzc(zziof zziofVar) {
        return new zzdwg(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdwf zzb() {
        return new zzdwf(((zzdrj) this.zza).zza());
    }
}
