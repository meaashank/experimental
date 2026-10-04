package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzakw extends zzafx implements zzalf {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzakw(long j10, long j11, int i10, int i11, boolean z10) {
        this(j10, j11, i10, i11, false, true);
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzf(long j10) {
        return zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final int zzh() {
        return this.zzb;
    }

    public final zzakw zzi(long j10) {
        return new zzakw(j10, this.zza, this.zzb, this.zzc, false, false);
    }

    private zzakw(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, false, z11);
        this.zza = j11;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10 == -1 ? -1L : j10;
    }

    public zzakw(long j10, long j11, zzahe zzaheVar, boolean z10) {
        this(j10, j11, zzaheVar.zzf, zzaheVar.zzc, false, true);
    }
}
