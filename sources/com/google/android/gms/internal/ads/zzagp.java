package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzagp {
    public static boolean zza(zzeu zzeuVar, zzagu zzaguVar, int i10, zzago zzagoVar) {
        int iZzg = zzeuVar.zzg();
        long jZzz = zzeuVar.zzz();
        long j10 = jZzz >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        long j11 = jZzz >> 12;
        long j12 = jZzz >> 8;
        long j13 = jZzz >> 4;
        long j14 = jZzz >> 1;
        long j15 = jZzz & 1;
        int i11 = (int) (j13 & 15);
        if (i11 <= 7) {
            if (i11 != zzaguVar.zzg - 1) {
                return false;
            }
        } else if (i11 > 10 || zzaguVar.zzg != 2) {
            return false;
        }
        int i12 = (int) (j14 & 7);
        if ((i12 != 0 && i12 != zzaguVar.zzi) || j15 == 1 || !zzd(zzeuVar, zzaguVar, z10, zzagoVar)) {
            return false;
        }
        long j16 = zzagoVar.zza;
        int iZzc = zzc(zzeuVar, (int) (j11 & 15));
        long j17 = zzaguVar.zzj;
        boolean z11 = j17 == 0 || j16 + ((long) iZzc) >= j17;
        if (iZzc == -1) {
            return false;
        }
        if ((!z11 && iZzc < zzaguVar.zza) || iZzc > zzaguVar.zzb) {
            return false;
        }
        int i13 = zzaguVar.zze;
        int i14 = (int) (j12 & 15);
        if (i14 != 0) {
            if (i14 <= 11) {
                if (i14 != zzaguVar.zzf) {
                    return false;
                }
            } else if (i14 == 12) {
                if (zzeuVar.zzs() * 1000 != i13) {
                    return false;
                }
            } else {
                if (i14 > 14) {
                    return false;
                }
                int iZzt = zzeuVar.zzt();
                if (i14 == 14) {
                    iZzt *= 10;
                }
                if (iZzt != i13) {
                    return false;
                }
            }
        }
        if (zzeuVar.zzs() != zzfm.zzN(zzeuVar.zzi(), iZzg, zzeuVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzeuVar.zzd() != 0) {
            int iZzn = zzeuVar.zzn();
            if ((iZzn & 128) != 0) {
                return false;
            }
            int i15 = (iZzn & 126) >> 1;
            if ((i15 >= 2 && i15 <= 7) || (i15 >= 13 && i15 <= 31)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + 57);
                sb2.append("Ignoring frame where first subframe has a reserved type: ");
                sb2.append(i15);
                zzeh.zzb("FlacFrameReader", sb2.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzagi zzagiVar, zzagu zzaguVar) throws IOException {
        zzagiVar.zzl();
        zzagiVar.zzk(1);
        byte[] bArr = new byte[1];
        zzagiVar.zzi(bArr, 0, 1);
        int i10 = bArr[0] & 1;
        boolean z10 = 1 == i10;
        zzagiVar.zzk(2);
        int i11 = 1 != i10 ? 6 : 7;
        zzeu zzeuVar = new zzeu(i11);
        zzeuVar.zzf(zzagl.zzb(zzagiVar, zzeuVar.zzi(), 0, i11));
        zzagiVar.zzl();
        zzago zzagoVar = new zzago();
        if (zzd(zzeuVar, zzaguVar, z10, zzagoVar)) {
            return zzagoVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzeu zzeuVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zzeuVar.zzs() + 1;
            case 7:
                return zzeuVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzeu zzeuVar, zzagu zzaguVar, boolean z10, zzago zzagoVar) {
        try {
            long jZzO = zzeuVar.zzO();
            if (!z10) {
                jZzO *= (long) zzaguVar.zzb;
            }
            long j10 = zzaguVar.zzj;
            if (j10 != 0 && jZzO > j10) {
                return false;
            }
            zzagoVar.zza = jZzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
