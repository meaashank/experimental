package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfff implements zzinw {
    private final zziof zza;

    private zzfff(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar3;
    }

    public static zzfff zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzfff(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzffd zzb() {
        return new zzffd(zzcsa.zza(), zzfoy.zzc(), ((zzffo) this.zza).zza());
    }
}
