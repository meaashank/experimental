package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfft implements zzinw {
    private final zzffn zza;

    private zzfft(zzffn zzffnVar) {
        this.zza = zzffnVar;
    }

    public static zzfft zzc(zzffn zzffnVar) {
        return new zzfft(zzffnVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzi());
    }
}
