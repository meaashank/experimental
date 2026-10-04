package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zztr {
    private final zzcp[] zza;
    private final zzue zzb;
    private final zzcv zzc;

    public zztr(zzcp... zzcpVarArr) {
        zzue zzueVar = new zzue();
        zzcv zzcvVar = new zzcv();
        zzcp[] zzcpVarArr2 = {zzueVar, zzcvVar};
        this.zza = zzcpVarArr2;
        System.arraycopy(zzcpVarArr, 0, zzcpVarArr2, 0, 0);
        this.zzb = zzueVar;
        this.zzc = zzcvVar;
    }

    public final zzcp[] zza() {
        return this.zza;
    }

    public final zzav zzb(zzav zzavVar) {
        zzcv zzcvVar = this.zzc;
        zzcvVar.zzk(zzavVar.zzb);
        zzcvVar.zzl(zzavVar.zzc);
        return zzavVar;
    }

    public final boolean zzc(boolean z10) {
        this.zzb.zzq(z10);
        return z10;
    }

    public final long zzd(long j10) {
        zzcv zzcvVar = this.zzc;
        return zzcvVar.zzc() ? zzcvVar.zzm(j10) : j10;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}
