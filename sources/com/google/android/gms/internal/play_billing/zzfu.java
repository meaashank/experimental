package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class zzfu extends zzfx {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzfu(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzb(byte b10) throws IOException {
        int i10 = this.zzd;
        try {
            int i11 = i10 + 1;
            try {
                this.zzb[i10] = b10;
                this.zzd = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new zzfv(i10, this.zzc, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.zzb, this.zzd, i11);
            this.zzd += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfv(this.zzd, this.zzc, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzd(int i10, boolean z10) throws IOException {
        zzu(i10 << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zze(byte[] bArr, int i10, int i11) throws IOException {
        zzu(i11);
        zzc(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzf(int i10, zzfp zzfpVar) throws IOException {
        zzu((i10 << 3) | 2);
        zzg(zzfpVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzg(zzfp zzfpVar) throws IOException {
        zzu(zzfpVar.zzd());
        zzfpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzh(int i10, int i11) throws IOException {
        zzu((i10 << 3) | 5);
        zzi(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzi(int i10) throws IOException {
        int i11 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zzd = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfv(i11, this.zzc, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzj(int i10, long j10) throws IOException {
        zzu((i10 << 3) | 1);
        zzk(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzk(long j10) throws IOException {
        int i10 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.zzd = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfv(i10, this.zzc, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzl(int i10, int i11) throws IOException {
        zzu(i10 << 3);
        zzm(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzm(int i10) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i10 >= 0) {
            zzu(i10);
            return;
        }
        int i11 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            long j10 = i10;
            int i12 = i11 + 1;
            try {
                bArr[i11] = (byte) (((int) j10) | 128);
                int i13 = i11 + 2;
                try {
                    bArr[i12] = (byte) (((int) (j10 >>> 7)) | 128);
                    int i14 = i11 + 3;
                    bArr[i13] = (byte) (((int) (j10 >>> 14)) | 128);
                    i13 = i11 + 4;
                    bArr[i14] = (byte) (((int) (j10 >>> 21)) | 128);
                    int i15 = i11 + 5;
                    bArr[i13] = (byte) (((int) (j10 >>> 28)) | 128);
                    int i16 = i11 + 6;
                    try {
                        bArr[i15] = -1;
                        int i17 = i11 + 7;
                        bArr[i16] = -1;
                        i16 = i11 + 8;
                        bArr[i17] = -1;
                        i12 = i11 + 9;
                        bArr[i16] = -1;
                        i11 += 10;
                        bArr[i12] = 1;
                        this.zzd = i11;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i16;
                        throw new zzfv(i11, this.zzc, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i11 = i13;
                }
            } catch (IndexOutOfBoundsException e12) {
                i11 = i12;
                indexOutOfBoundsException = e12;
            }
        } catch (IndexOutOfBoundsException e13) {
            indexOutOfBoundsException = e13;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzn(zzhr zzhrVar) throws IOException {
        zzu(zzhrVar.zzn());
        zzhrVar.zzD(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzo(int i10, zzhr zzhrVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzu(26);
        zzn(zzhrVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzp(int i10, zzfp zzfpVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzf(3, zzfpVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzq(int i10, String str) throws IOException {
        zzu((i10 << 3) | 2);
        zzr(str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzr(String str) throws IOException {
        int i10 = this.zzd;
        try {
            int iZzy = zzfx.zzy(str.length() * 3);
            int iZzy2 = zzfx.zzy(str.length());
            if (iZzy2 != iZzy) {
                int i11 = zzjc.zza;
                zzu(zziz.zzb(str));
                byte[] bArr = this.zzb;
                int i12 = this.zzd;
                this.zzd = zzjc.zza(str, bArr, i12, bArr.length - i12);
                return;
            }
            int i13 = i10 + iZzy2;
            this.zzd = i13;
            byte[] bArr2 = this.zzb;
            int iZza = zzjc.zza(str, bArr2, i13, bArr2.length - i13);
            this.zzd = i10;
            zzu((iZza - i10) - iZzy2);
            this.zzd = iZza;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfv(e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzs(int i10, int i11) throws IOException {
        zzu((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzt(int i10, int i11) throws IOException {
        zzu(i10 << 3);
        zzu(i11);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0011: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:18), block:B:8:0x0010 */
    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzu(int i10) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11;
        int i12 = this.zzd;
        try {
            try {
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
            i12 = i11;
        }
        if ((i10 & (-128)) == 0) {
            int i13 = i12 + 1;
            this.zzb[i12] = (byte) i10;
            this.zzd = i13;
            return;
        }
        byte[] bArr = this.zzb;
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i10 | 128);
        int i15 = i10 >>> 7;
        if ((i15 & (-128)) == 0) {
            int i16 = i12 + 2;
            bArr[i14] = (byte) i15;
            this.zzd = i16;
            return;
        }
        int i17 = i12 + 2;
        try {
            bArr[i14] = (byte) (i15 | 128);
            int i18 = i10 >>> 14;
            if ((i18 & (-128)) == 0) {
                int i19 = i12 + 3;
                bArr[i17] = (byte) i18;
                this.zzd = i19;
                return;
            }
            int i20 = i12 + 3;
            try {
                bArr[i17] = (byte) (i18 | 128);
                int i21 = i10 >>> 21;
                if ((i21 & (-128)) == 0) {
                    int i22 = i12 + 4;
                    bArr[i20] = (byte) i21;
                    this.zzd = i22;
                    return;
                } else {
                    i17 = i12 + 4;
                    bArr[i20] = (byte) (i21 | 128);
                    int i23 = i12 + 5;
                    bArr[i17] = (byte) (i10 >>> 28);
                    this.zzd = i23;
                    return;
                }
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i20;
            }
        } catch (IndexOutOfBoundsException e13) {
            indexOutOfBoundsException = e13;
            i12 = i17;
        }
        throw new zzfv(i12, this.zzc, 1, indexOutOfBoundsException);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzv(int i10, long j10) throws IOException {
        zzu(i10 << 3);
        zzw(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzw(long j10) throws IOException {
        long j11 = j10 & (-128);
        int i10 = this.zzd;
        try {
            if (j11 == 0) {
                this.zzb[i10] = (byte) j10;
                this.zzd = i10 + 1;
                return;
            }
            byte[] bArr = this.zzb;
            bArr[i10] = (byte) (((int) j10) | 128);
            int i11 = i10 + 1;
            long j12 = j10 >>> 7;
            long j13 = j12 & (-128);
            int i12 = (int) j12;
            if (j13 == 0) {
                bArr[i11] = (byte) i12;
                this.zzd = i10 + 2;
                return;
            }
            bArr[i11] = (byte) (i12 | 128);
            int i13 = i10 + 2;
            long j14 = j10 >>> 14;
            long j15 = j14 & (-128);
            int i14 = (int) j14;
            if (j15 == 0) {
                bArr[i13] = (byte) i14;
                this.zzd = i10 + 3;
                return;
            }
            bArr[i13] = (byte) (i14 | 128);
            int i15 = i10 + 3;
            long j16 = j10 >>> 21;
            long j17 = j16 & (-128);
            int i16 = (int) j16;
            if (j17 == 0) {
                bArr[i15] = (byte) i16;
                this.zzd = i10 + 4;
                return;
            }
            bArr[i15] = (byte) (i16 | 128);
            int i17 = i10 + 4;
            long j18 = j10 >>> 28;
            long j19 = j18 & (-128);
            int i18 = (int) j18;
            if (j19 == 0) {
                bArr[i17] = (byte) i18;
                this.zzd = i10 + 5;
                return;
            }
            bArr[i17] = (byte) (i18 | 128);
            int i19 = i10 + 5;
            long j20 = j10 >>> 35;
            long j21 = j20 & (-128);
            int i20 = (int) j20;
            if (j21 == 0) {
                bArr[i19] = (byte) i20;
                this.zzd = i10 + 6;
                return;
            }
            bArr[i19] = (byte) (i20 | 128);
            int i21 = i10 + 6;
            long j22 = j10 >>> 42;
            long j23 = j22 & (-128);
            int i22 = (int) j22;
            if (j23 == 0) {
                bArr[i21] = (byte) i22;
                this.zzd = i10 + 7;
                return;
            }
            bArr[i21] = (byte) (i22 | 128);
            int i23 = i10 + 7;
            long j24 = j10 >>> 49;
            long j25 = j24 & (-128);
            int i24 = (int) j24;
            if (j25 == 0) {
                bArr[i23] = (byte) i24;
                this.zzd = i10 + 8;
                return;
            }
            bArr[i23] = (byte) (i24 | 128);
            int i25 = i10 + 8;
            long j26 = j10 >>> 56;
            int i26 = (int) j26;
            if (((-128) & j26) == 0) {
                bArr[i25] = (byte) i26;
                this.zzd = i10 + 9;
            } else {
                bArr[i25] = (byte) (i26 | 128);
                bArr[i10 + 9] = (byte) (j10 >>> 63);
                this.zzd = i10 + 10;
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfv(i10, this.zzc, 1, e10);
        }
    }
}
