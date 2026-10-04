package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfaz implements zzinw {
    private final zziof zza;

    private zzfaz(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzfaz zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzfaz(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfax zzb() {
        return new zzfax(zzfoy.zzc(), (zzedp) this.zza.zzb());
    }
}
