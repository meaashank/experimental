package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbg implements zzinw {
    private final zziof zza;

    private zzfbg(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzfbg zzc(zziof zziofVar) {
        return new zzfbg(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfbe zzb() {
        return new zzfbe((zzflc) this.zza.zzb());
    }
}
