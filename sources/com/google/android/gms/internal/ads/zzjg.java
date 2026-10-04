package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjg {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzjg(float f10, float f11, long j10, float f12, long j11, long j12, float f13, byte[] bArr) {
        this.zza = j11;
        this.zzb = j12;
    }

    private final void zzf() {
        long j10;
        long j11 = this.zzc;
        if (j11 != -9223372036854775807L) {
            j10 = this.zzd;
            if (j10 == -9223372036854775807L) {
                long j12 = this.zzf;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.zzg;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.zze == j10) {
            return;
        }
        this.zze = j10;
        this.zzh = j10;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j10, long j11, float f10) {
        return (long) ((j11 * 9.999871E-4f) + (j10 * 0.999f));
    }

    public final void zza(zzaf zzafVar) {
        long j10 = zzafVar.zza;
        this.zzc = zzfm.zzt(-9223372036854775807L);
        this.zzf = zzfm.zzt(-9223372036854775807L);
        this.zzg = zzfm.zzt(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j10) {
        this.zzd = j10;
        zzf();
    }

    public final void zzc() {
        long j10 = this.zzh;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.zzb;
        this.zzh = j11;
        long j12 = this.zzg;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.zzh = j12;
        }
        this.zzl = -9223372036854775807L;
    }

    public final float zzd(long j10, long j11) {
        long jMax;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j12 = j10 - j11;
        long j13 = this.zzm;
        if (j13 == -9223372036854775807L) {
            this.zzm = j12;
            this.zzn = 0L;
        } else {
            long jMax2 = Math.max(j12, zzg(j13, j12, 0.999f));
            this.zzm = jMax2;
            this.zzn = zzg(this.zzn, Math.abs(j12 - jMax2), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j14 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j14) {
            long jZzt = zzfm.zzt(1000L);
            float f10 = this.zzk - 1.0f;
            float f11 = this.zzi - 1.0f;
            long j15 = this.zze;
            float f12 = jZzt;
            long j16 = this.zzh - (((long) (f10 * f12)) + ((long) (f11 * f12)));
            long[] jArr = {j14, j15, j16};
            jMax = jArr[0];
            for (int i10 = 1; i10 < 3; i10++) {
                long j17 = jArr[i10];
                if (j17 > jMax) {
                    jMax = j17;
                }
            }
            this.zzh = jMax;
        } else {
            long jMax3 = j10 - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j18 = this.zzh;
            String str = zzfm.zza;
            jMax = Math.max(j18, Math.min(jMax3, j14));
            this.zzh = jMax;
            long j19 = this.zzg;
            if (j19 != -9223372036854775807L && jMax > j19) {
                this.zzh = j19;
                jMax = j19;
            }
        }
        long j20 = j10 - jMax;
        if (Math.abs(j20) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j20 * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zze() {
        return this.zzh;
    }
}
