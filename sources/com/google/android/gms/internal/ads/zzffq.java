package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffq implements zzinw {
    private final zzffn zza;

    private zzffq(zzffn zzffnVar) {
        this.zza = zzffnVar;
    }

    public static zzffq zzc(zzffn zzffnVar) {
        return new zzffq(zzffnVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzh());
    }
}
