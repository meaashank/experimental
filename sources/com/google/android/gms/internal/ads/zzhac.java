package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzhac {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzhac(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z10 = true;
            zzguk.zzc(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            zzguk.zzc(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhac) {
            zzhac zzhacVar = (zzhac) obj;
            if (this.zzi == zzhacVar.zzi && Arrays.equals(this.zzf, zzhacVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i10) {
        return this.zzf[i10];
    }

    public final boolean zzb(int i10) {
        return this.zzh[i10 % this.zzc];
    }

    public final int zzc(char c10) throws zzhaf {
        if (c10 > 127) {
            throw new zzhaf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        byte b10 = this.zzg[c10];
        if (b10 != -1) {
            return b10;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new zzhaf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        throw new zzhaf(androidx.compose.runtime.R0.a(new StringBuilder(String.valueOf(c10).length() + 24), "Unrecognized character: ", c10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    public final zzhac zzd() {
        boolean z10;
        int i10 = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i10 >= length) {
                return this;
            }
            if (zzgts.zzd(cArr[i10])) {
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = false;
                        break;
                    }
                    if (zzgts.zzc(cArr[i11])) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                zzguk.zzj(!z10, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i12 = 0; i12 < cArr.length; i12++) {
                    char c10 = cArr[i12];
                    if (zzgts.zzd(c10)) {
                        c10 ^= 32;
                    }
                    cArr2[i12] = (char) c10;
                }
                zzhac zzhacVar = new zzhac(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzhacVar.zzi) {
                    return zzhacVar;
                }
                byte[] bArr = zzhacVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i13 = 65; i13 <= 90; i13++) {
                    int i14 = i13 | 32;
                    byte b10 = bArr[i13];
                    byte b11 = bArr[i14];
                    if (b10 == -1) {
                        bArrCopyOf[i13] = b11;
                    } else {
                        char c11 = (char) i13;
                        char c12 = (char) i14;
                        if (b11 != -1) {
                            throw new IllegalStateException(zzgvb.zzd("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                        }
                        bArrCopyOf[i14] = b10;
                    }
                }
                return new zzhac(zzhacVar.zze.concat(".ignoreCase()"), zzhacVar.zzf, bArrCopyOf, true);
            }
            i10++;
        }
    }

    public final boolean zze(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final /* synthetic */ char[] zzf() {
        return this.zzf;
    }

    private zzhac(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZza = zzhaz.zza(length, RoundingMode.UNNECESSARY);
            this.zzb = iZza;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZza);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = iZza >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zzhaz.zzb(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z10;
        } catch (ArithmeticException e10) {
            int length2 = cArr.length;
            throw new IllegalArgumentException(androidx.multidex.d.a(new StringBuilder(String.valueOf(length2).length() + 24), "Illegal alphabet length ", length2), e10);
        }
    }
}
