package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.C1497c;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zziib {
    private static final zziib zza = new zziib(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zziib(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zziib zza() {
        return zza;
    }

    public static zziib zzb() {
        return new zziib();
    }

    public static zziib zzc(zziib zziibVar, zziib zziibVar2) {
        int i10 = zziibVar.zzb + zziibVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zziibVar.zzc, i10);
        System.arraycopy(zziibVar2.zzc, 0, iArrCopyOf, zziibVar.zzb, zziibVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zziibVar.zzd, i10);
        System.arraycopy(zziibVar2.zzd, 0, objArrCopyOf, zziibVar.zzb, zziibVar2.zzb);
        return new zziib(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zziib)) {
            return false;
        }
        zziib zziibVar = (zziib) obj;
        int i10 = this.zzb;
        if (i10 == zziibVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziibVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zziibVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zziip zziipVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zziipVar.zzv(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzg(zziip zziipVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zziipVar.zzc(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zziipVar.zzj(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zziipVar.zzn(i12, (zziei) obj);
                } else if (i13 == 3) {
                    zziipVar.zzt(i12);
                    ((zziib) obj).zzg(zziipVar);
                    zziipVar.zzu(i12);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(new zzigd("Protocol message tag had invalid wire type."));
                    }
                    zziipVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zziei zzieiVar = (zziei) this.zzd[i11];
            int iZzF = zzier.zzF(8);
            int iZzF2 = zzier.zzF(i12) + zzier.zzF(16);
            int iZzF3 = zzier.zzF(24);
            int iZzb = zzieiVar.zzb();
            iA = C1497c.a(iZzF + iZzF, iZzF2, C3294f1.a(iZzb, iZzb, iZzF3), iA);
        }
        this.zze = iA;
        return iA;
    }

    public final int zzi() {
        int iZzF;
        int iZzG;
        int iZzF2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).getClass();
                    iZzF2 = zzier.zzF(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    zziei zzieiVar = (zziei) this.zzd[i11];
                    int iZzF3 = zzier.zzF(i15);
                    int iZzb = zzieiVar.zzb();
                    iA = C3320l1.a(iZzb, iZzb, iZzF3, iA);
                } else if (i14 == 3) {
                    int iZzF4 = zzier.zzF(i13 << 3);
                    iZzF = iZzF4 + iZzF4;
                    iZzG = ((zziib) this.zzd[i11]).zzi();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzigd("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i11]).getClass();
                    iZzF2 = zzier.zzF(i13 << 3) + 4;
                }
                iA = iZzF2 + iA;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzF = zzier.zzF(i16);
                iZzG = zzier.zzG(jLongValue);
            }
            iA = iZzG + iZzF + iA;
        }
        this.zze = iA;
        return iA;
    }

    public final void zzj(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzigy.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzk(int i10, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final boolean zzl(int i10, zziem zziemVar) throws IOException {
        int iZza;
        zze();
        int i11 = i10 & 7;
        if (i11 == 0) {
            zzk(i10, Long.valueOf(zziemVar.zzg()));
            return true;
        }
        if (i11 == 1) {
            zzk(i10, Long.valueOf(zziemVar.zzi()));
            return true;
        }
        if (i11 == 2) {
            zzk(i10, zziemVar.zzn());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                zziemVar.zzK();
                return false;
            }
            if (i11 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            zzk(i10, Integer.valueOf(zziemVar.zzj()));
            return true;
        }
        zziemVar.zzJ();
        zziemVar.zzb++;
        zziib zziibVar = new zziib();
        do {
            iZza = zziemVar.zza();
            if (iZza == 0) {
                break;
            }
        } while (zziibVar.zzl(iZza, zziemVar));
        zziemVar.zzb--;
        zziemVar.zzb(4 | ((i10 >>> 3) << 3));
        zzk(i10, zziibVar);
        return true;
    }

    public final zziib zzm(zziib zziibVar) {
        if (zziibVar.equals(zza)) {
            return this;
        }
        zze();
        int i10 = this.zzb + zziibVar.zzb;
        zzn(i10);
        System.arraycopy(zziibVar.zzc, 0, this.zzc, this.zzb, zziibVar.zzb);
        System.arraycopy(zziibVar.zzd, 0, this.zzd, this.zzb, zziibVar.zzb);
        this.zzb = i10;
        return this;
    }

    private zziib() {
        this(0, new int[8], new Object[8], true);
    }
}
