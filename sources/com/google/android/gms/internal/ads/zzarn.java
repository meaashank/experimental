package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes4.dex */
final class zzarn {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfj zza = new zzfj(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzeu zzb = new zzeu();

    public zzarn(int i10) {
    }

    private final int zze(zzagi zzagiVar) {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzagiVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzagi zzagiVar, zzahh zzahhVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzagiVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzagiVar);
                return 0;
            }
            if (this.zzd) {
                long j11 = this.zzf;
                if (j11 == -9223372036854775807L) {
                    zze(zzagiVar);
                    return 0;
                }
                zzfj zzfjVar = this.zza;
                this.zzh = zzfjVar.zzf(this.zzg) - zzfjVar.zze(j11);
                zze(zzagiVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzagiVar.zzo());
            if (zzagiVar.zzn() != 0) {
                zzahhVar.zza = 0L;
                return 1;
            }
            zzeu zzeuVar = this.zzb;
            zzeuVar.zza(iMin);
            zzagiVar.zzl();
            zzagiVar.zzi(zzeuVar.zzi(), 0, iMin);
            int iZzg = zzeuVar.zzg();
            int iZze = zzeuVar.zze();
            while (true) {
                if (iZzg >= iZze) {
                    break;
                }
                if (zzeuVar.zzi()[iZzg] == 71) {
                    long jZzb = zzarx.zzb(zzeuVar, iZzg, i10);
                    if (jZzb != -9223372036854775807L) {
                        j10 = jZzb;
                        break;
                    }
                }
                iZzg++;
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzagiVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j12 = jZzo - ((long) iMin2);
        if (zzagiVar.zzn() != j12) {
            zzahhVar.zza = j12;
            return 1;
        }
        zzeu zzeuVar2 = this.zzb;
        zzeuVar2.zza(iMin2);
        zzagiVar.zzl();
        zzagiVar.zzi(zzeuVar2.zzi(), 0, iMin2);
        int iZzg2 = zzeuVar2.zzg();
        int iZze2 = zzeuVar2.zze();
        int i11 = iZze2 - 188;
        while (true) {
            if (i11 < iZzg2) {
                break;
            }
            byte[] bArrZzi = zzeuVar2.zzi();
            int i12 = -4;
            int i13 = 0;
            while (true) {
                if (i12 > 4) {
                    break;
                }
                int i14 = (i12 * Opcodes.NEWARRAY) + i11;
                if (i14 < iZzg2 || i14 >= iZze2 || bArrZzi[i14] != 71) {
                    i13 = 0;
                } else {
                    i13++;
                    if (i13 == 5) {
                        long jZzb2 = zzarx.zzb(zzeuVar2, i11, i10);
                        if (jZzb2 != -9223372036854775807L) {
                            j10 = jZzb2;
                            break;
                        }
                    }
                }
                i12++;
            }
            i11--;
        }
        this.zzg = j10;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfj zzd() {
        return this.zza;
    }
}
