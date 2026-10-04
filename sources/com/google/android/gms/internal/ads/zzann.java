package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzann {
    private zzaht zzb;
    private zzagk zzc;
    private zzanj zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzanh zza = new zzanh();
    private zzanl zzj = new zzanl();

    public void zza(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzanl();
            this.zzf = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract long zzb(zzeu zzeuVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean zzc(zzeu zzeuVar, long j10, zzanl zzanlVar) throws IOException;

    public final void zze(zzagk zzagkVar, zzaht zzahtVar) {
        this.zzc = zzagkVar;
        this.zzb = zzahtVar;
        zza(true);
    }

    public final void zzf(long j10, long j11) {
        this.zza.zza();
        if (j10 == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzi = zzi(j11);
            this.zze = jZzi;
            zzanj zzanjVar = this.zzd;
            String str = zzfm.zza;
            zzanjVar.zzb(jZzi);
            this.zzh = 2;
        }
    }

    public final int zzg(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        this.zzb.getClass();
        String str = zzfm.zza;
        int i10 = this.zzh;
        if (i10 != 0) {
            if (i10 == 1) {
                zzagiVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i10 != 2) {
                return -1;
            }
            long jZza = this.zzd.zza(zzagiVar);
            if (jZza >= 0) {
                zzahhVar.zza = jZza;
                return 1;
            }
            if (jZza < -1) {
                zzj(-(jZza + 2));
            }
            if (!this.zzl) {
                zzahk zzahkVarZzc = this.zzd.zzc();
                zzahkVarZzc.getClass();
                this.zzc.zzw(zzahkVarZzc);
                this.zzb.zzP(zzahkVarZzc.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzagiVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzeu zzeuVarZzd = this.zza.zzd();
            long jZzb = zzb(zzeuVarZzd);
            if (jZzb >= 0) {
                long j10 = this.zzg;
                if (j10 + jZzb >= this.zze) {
                    long jZzh = zzh(j10);
                    this.zzb.zzc(zzeuVarZzd, zzeuVarZzd.zze());
                    this.zzb.zze(jZzh, 1, zzeuVarZzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += jZzb;
            return 0;
        }
        while (true) {
            zzanh zzanhVar = this.zza;
            if (!zzanhVar.zzb(zzagiVar)) {
                this.zzh = 3;
                return -1;
            }
            long jZzn = zzagiVar.zzn();
            long j11 = this.zzf;
            this.zzk = jZzn - j11;
            if (!zzc(zzanhVar.zzd(), j11, this.zzj)) {
                zzv zzvVar = this.zzj.zza;
                this.zzi = zzvVar.zzK;
                if (!this.zzm) {
                    this.zzb.zzA(zzvVar);
                    this.zzm = true;
                }
                zzanj zzanjVar = this.zzj.zzb;
                if (zzanjVar != null) {
                    this.zzd = zzanjVar;
                } else if (zzagiVar.zzo() == -1) {
                    this.zzd = new zzanm(null);
                } else {
                    zzani zzaniVarZzc = zzanhVar.zzc();
                    this.zzd = new zzanc(this, this.zzf, zzagiVar.zzo(), zzaniVarZzc.zzd + zzaniVarZzc.zze, zzaniVarZzc.zzb, (zzaniVarZzc.zza & 4) != 0);
                }
                this.zzh = 2;
                zzanhVar.zze();
                return 0;
            }
            this.zzf = zzagiVar.zzn();
        }
    }

    public final long zzh(long j10) {
        return (j10 * 1000000) / ((long) this.zzi);
    }

    public final long zzi(long j10) {
        return (((long) this.zzi) * j10) / 1000000;
    }

    public void zzj(long j10) {
        this.zzg = j10;
    }
}
