package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffr implements zzinw {
    private final zzffn zza;

    private zzffr(zzffn zzffnVar) {
        this.zza = zzffnVar;
    }

    public static zzffr zzc(zzffn zzffnVar) {
        return new zzffr(zzffnVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzg());
    }
}
