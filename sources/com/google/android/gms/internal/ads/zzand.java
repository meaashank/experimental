package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzand implements zzanj {
    private final zzagu zza;
    private final zzagt zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzand(zzagu zzaguVar, zzagt zzagtVar) {
        this.zza = zzaguVar;
        this.zzb = zzagtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanj
    public final long zza(zzagi zzagiVar) {
        long j10 = this.zzd;
        if (j10 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j10 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzanj
    public final void zzb(long j10) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfm.zzo(jArr, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzanj
    public final zzahk zzc() {
        zzguk.zzi(this.zzc != -1);
        return new zzags(this.zza, this.zzc);
    }

    public final void zzd(long j10) {
        this.zzc = j10;
    }
}
