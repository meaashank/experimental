package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwq implements zzinw {
    private final zzcwk zza;
    private final zziof zzb;

    private zzcwq(zzcwk zzcwkVar, zziof zziofVar) {
        this.zza = zzcwkVar;
        this.zzb = zziofVar;
    }

    public static zzcwq zzc(zzcwk zzcwkVar, zziof zziofVar) {
        return new zzcwq(zzcwkVar, zziofVar);
    }

    public static zzcwd zzd(zzcwk zzcwkVar, Object obj) {
        return (zzcwg) obj;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcwd zzb() {
        return ((zzcwh) this.zzb).zzb();
    }
}
