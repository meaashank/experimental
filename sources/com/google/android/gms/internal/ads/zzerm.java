package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzerm implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzerm(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzerm zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzerm(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzerl zzb() {
        return new zzerl((zzesp) this.zza.zzb(), (zzdya) this.zzb.zzb());
    }
}
