package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzza {
    private final zzabp zza;
    private final zzeu zzb = new zzeu(32);
    private zzyz zzc;
    private zzyz zzd;
    private zzyz zze;
    private long zzf;

    public zzza(zzabp zzabpVar) {
        this.zza = zzabpVar;
        zzyz zzyzVar = new zzyz(0L, 65536);
        this.zzc = zzyzVar;
        this.zzd = zzyzVar;
        this.zze = zzyzVar;
    }

    private final int zzi(int i10) {
        zzyz zzyzVar = this.zze;
        if (zzyzVar.zzc == null) {
            zzabn zzabnVarZza = this.zza.zza();
            zzyz zzyzVar2 = new zzyz(this.zze.zzb, 65536);
            zzyzVar.zzc = zzabnVarZza;
            zzyzVar.zzd = zzyzVar2;
        }
        return Math.min(i10, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i10) {
        long j10 = this.zzf + ((long) i10);
        this.zzf = j10;
        zzyz zzyzVar = this.zze;
        if (j10 == zzyzVar.zzb) {
            this.zze = zzyzVar.zzd;
        }
    }

    private static zzyz zzk(zzyz zzyzVar, zziy zziyVar, zzzb zzzbVar, zzeu zzeuVar) {
        zzyz zzyzVarZzm;
        if (zziyVar.zzk()) {
            long j10 = zzzbVar.zzb;
            int iZzt = 1;
            zzeuVar.zza(1);
            zzyz zzyzVarZzm2 = zzm(zzyzVar, j10, zzeuVar.zzi(), 1);
            long j11 = j10 + 1;
            byte b10 = zzeuVar.zzi()[0];
            int i10 = b10 & 128;
            int i11 = b10 & 127;
            zziv zzivVar = zziyVar.zzb;
            byte[] bArr = zzivVar.zza;
            if (bArr == null) {
                zzivVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i10 != 0;
            zzyzVarZzm = zzm(zzyzVarZzm2, j11, zzivVar.zza, i11);
            long j12 = j11 + ((long) i11);
            if (z10) {
                zzeuVar.zza(2);
                zzyzVarZzm = zzm(zzyzVarZzm, j12, zzeuVar.zzi(), 2);
                j12 += 2;
                iZzt = zzeuVar.zzt();
            }
            int i12 = iZzt;
            int[] iArr = zzivVar.zzd;
            if (iArr == null || iArr.length < i12) {
                iArr = new int[i12];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzivVar.zze;
            if (iArr3 == null || iArr3.length < i12) {
                iArr3 = new int[i12];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i13 = i12 * 6;
                zzeuVar.zza(i13);
                zzyzVarZzm = zzm(zzyzVarZzm, j12, zzeuVar.zzi(), i13);
                j12 += (long) i13;
                zzeuVar.zzh(0);
                for (int i14 = 0; i14 < i12; i14++) {
                    iArr2[i14] = zzeuVar.zzt();
                    iArr4[i14] = zzeuVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzzbVar.zza - ((int) (j12 - zzzbVar.zzb));
            }
            zzahs zzahsVar = zzzbVar.zzc;
            String str = zzfm.zza;
            zzivVar.zza(i12, iArr2, iArr4, zzahsVar.zzb, zzivVar.zza, zzahsVar.zza, zzahsVar.zzc, zzahsVar.zzd);
            long j13 = zzzbVar.zzb;
            int i15 = (int) (j12 - j13);
            zzzbVar.zzb = j13 + ((long) i15);
            zzzbVar.zza -= i15;
        } else {
            zzyzVarZzm = zzyzVar;
        }
        if (!zziyVar.zze()) {
            zziyVar.zzj(zzzbVar.zza);
            return zzl(zzyzVarZzm, zzzbVar.zzb, zziyVar.zzc, zzzbVar.zza);
        }
        zzeuVar.zza(4);
        zzyz zzyzVarZzm3 = zzm(zzyzVarZzm, zzzbVar.zzb, zzeuVar.zzi(), 4);
        int iZzH = zzeuVar.zzH();
        zzzbVar.zzb += 4;
        zzzbVar.zza -= 4;
        zziyVar.zzj(iZzH);
        zzyz zzyzVarZzl = zzl(zzyzVarZzm3, zzzbVar.zzb, zziyVar.zzc, iZzH);
        zzzbVar.zzb += (long) iZzH;
        int i16 = zzzbVar.zza - iZzH;
        zzzbVar.zza = i16;
        ByteBuffer byteBuffer = zziyVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            zziyVar.zze = ByteBuffer.allocate(i16);
        } else {
            zziyVar.zze.clear();
        }
        return zzl(zzyzVarZzl, zzzbVar.zzb, zziyVar.zze, zzzbVar.zza);
    }

    private static zzyz zzl(zzyz zzyzVar, long j10, ByteBuffer byteBuffer, int i10) {
        zzyz zzyzVarZzn = zzn(zzyzVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (zzyzVarZzn.zzb - j10));
            byteBuffer.put(zzyzVarZzn.zzc.zza, zzyzVarZzn.zzb(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == zzyzVarZzn.zzb) {
                zzyzVarZzn = zzyzVarZzn.zzd;
            }
        }
        return zzyzVarZzn;
    }

    private static zzyz zzm(zzyz zzyzVar, long j10, byte[] bArr, int i10) {
        zzyz zzyzVarZzn = zzn(zzyzVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (zzyzVarZzn.zzb - j10));
            System.arraycopy(zzyzVarZzn.zzc.zza, zzyzVarZzn.zzb(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == zzyzVarZzn.zzb) {
                zzyzVarZzn = zzyzVarZzn.zzd;
            }
        }
        return zzyzVarZzn;
    }

    private static zzyz zzn(zzyz zzyzVar, long j10) {
        while (j10 >= zzyzVar.zzb) {
            zzyzVar = zzyzVar.zzd;
        }
        return zzyzVar;
    }

    public final void zza() {
        zzyz zzyzVar = this.zzc;
        if (zzyzVar.zzc != null) {
            this.zza.zzc(zzyzVar);
            zzyzVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzyz zzyzVar2 = this.zzc;
        this.zzd = zzyzVar2;
        this.zze = zzyzVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zziy zziyVar, zzzb zzzbVar) {
        this.zzd = zzk(this.zzd, zziyVar, zzzbVar, this.zzb);
    }

    public final void zzd(zziy zziyVar, zzzb zzzbVar) {
        zzk(this.zzd, zziyVar, zzzbVar, this.zzb);
    }

    public final void zze(long j10) {
        zzyz zzyzVar;
        if (j10 != -1) {
            while (true) {
                zzyzVar = this.zzc;
                if (j10 < zzyzVar.zzb) {
                    break;
                }
                this.zza.zzb(zzyzVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzyzVar.zza) {
                this.zzd = zzyzVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i10, boolean z10) throws IOException {
        int iZzi = zzi(i10);
        zzyz zzyzVar = this.zze;
        int iZza = zzjVar.zza(zzyzVar.zzc.zza, zzyzVar.zzb(this.zzf), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzeu zzeuVar, int i10) {
        while (i10 > 0) {
            int iZzi = zzi(i10);
            zzyz zzyzVar = this.zze;
            zzeuVar.zzm(zzyzVar.zzc.zza, zzyzVar.zzb(this.zzf), iZzi);
            i10 -= iZzi;
            zzj(iZzi);
        }
    }
}
