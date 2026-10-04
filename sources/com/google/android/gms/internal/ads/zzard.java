package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzard {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfj zza = new zzfj(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzeu zzb = new zzeu();

    public static long zze(zzeu zzeuVar) {
        int iZzg = zzeuVar.zzg();
        if (zzeuVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzeuVar.zzm(bArr, 0, 9);
        zzeuVar.zzh(iZzg);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = b11;
        long j12 = (248 & j11) >> 3;
        long j13 = (bArr[1] & 255) << 20;
        long j14 = (j11 & 3) << 13;
        return j14 | j13 | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
    }

    private final int zzf(zzagi zzagiVar) {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzagiVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfj zzb() {
        return this.zza;
    }

    public final int zzc(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzagiVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j11 = jZzo - ((long) iMin);
            if (zzagiVar.zzn() != j11) {
                zzahhVar.zza = j11;
                return 1;
            }
            zzeu zzeuVar = this.zzb;
            zzeuVar.zza(iMin);
            zzagiVar.zzl();
            zzagiVar.zzi(zzeuVar.zzi(), 0, iMin);
            int iZzg = zzeuVar.zzg();
            int iZze = zzeuVar.zze() - 4;
            while (true) {
                if (iZze < iZzg) {
                    break;
                }
                if (zzg(zzeuVar.zzi(), iZze) == 442) {
                    zzeuVar.zzh(iZze + 4);
                    long jZze = zze(zzeuVar);
                    if (jZze != -9223372036854775807L) {
                        j10 = jZze;
                        break;
                    }
                }
                iZze--;
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzagiVar);
            return 0;
        }
        if (this.zzd) {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zzf(zzagiVar);
                return 0;
            }
            zzfj zzfjVar = this.zza;
            this.zzh = zzfjVar.zzf(this.zzg) - zzfjVar.zze(j12);
            zzf(zzagiVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzagiVar.zzo());
        if (zzagiVar.zzn() != 0) {
            zzahhVar.zza = 0L;
            return 1;
        }
        zzeu zzeuVar2 = this.zzb;
        zzeuVar2.zza(iMin2);
        zzagiVar.zzl();
        zzagiVar.zzi(zzeuVar2.zzi(), 0, iMin2);
        int iZzg2 = zzeuVar2.zzg();
        int iZze2 = zzeuVar2.zze();
        while (true) {
            if (iZzg2 >= iZze2 - 3) {
                break;
            }
            if (zzg(zzeuVar2.zzi(), iZzg2) == 442) {
                zzeuVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzeuVar2);
                if (jZze2 != -9223372036854775807L) {
                    j10 = jZze2;
                    break;
                }
            }
            iZzg2++;
        }
        this.zzf = j10;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
