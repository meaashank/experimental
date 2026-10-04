package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeva implements zzinw {
    private final zziof zza;

    private zzeva(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzeva zzc(zziof zziofVar) {
        return new zzeva(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeuy zzb() {
        return new zzeuy(((zzcok) this.zza).zza());
    }
}
