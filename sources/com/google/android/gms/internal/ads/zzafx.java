package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzafx implements zzahk {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;

    public zzafx(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        long jZzf;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        this.zzg = z11;
        if (j10 == -1) {
            this.zzd = -1L;
            jZzf = -9223372036854775807L;
        } else {
            this.zzd = j10 - j11;
            jZzf = zzf(j10, j11, i10);
        }
        this.zzf = jZzf;
    }

    private static long zzf(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j10) {
        long j11 = this.zzd;
        if (j11 == -1) {
            zzahl zzahlVar = new zzahl(0L, this.zzb);
            return new zzahi(zzahlVar, zzahlVar);
        }
        long j12 = ((long) this.zze) * j10;
        long j13 = this.zzc;
        long jMin = ((j12 / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZze = zze(jMax);
        zzahl zzahlVar2 = new zzahl(jZze, jMax);
        if (j11 != -1 && jZze < j10) {
            long j14 = jMax + j13;
            if (j14 < this.zza) {
                return new zzahi(zzahlVar2, new zzahl(zze(j14), j14));
            }
        }
        return new zzahi(zzahlVar2, zzahlVar2);
    }

    public final long zze(long j10) {
        return zzf(j10, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzj() {
        return this.zzg;
    }
}
