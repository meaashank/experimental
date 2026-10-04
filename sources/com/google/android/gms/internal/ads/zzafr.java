package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafr {
    public static final zzafr zza = new zzafr(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzafr(int i10, long j10, long j11) {
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzafr zza(long j10, long j11) {
        return new zzafr(-1, j10, j11);
    }

    public static zzafr zzb(long j10, long j11) {
        return new zzafr(-2, j10, j11);
    }

    public static zzafr zzc(long j10) {
        return new zzafr(0, -9223372036854775807L, j10);
    }

    public final /* synthetic */ int zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
