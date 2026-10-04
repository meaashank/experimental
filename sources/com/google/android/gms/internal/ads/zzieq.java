package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class zzieq extends zzier {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;
    private int zze;
    private final OutputStream zzf;

    public zzieq(OutputStream outputStream, int i10) {
        super(null);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzf = outputStream;
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.zzb = bArr;
        this.zzc = bArr.length;
    }

    private final void zzJ(int i10) throws IOException {
        if (this.zzc - this.zzd < i10) {
            zzK();
        }
    }

    private final void zzK() throws IOException {
        this.zzf.write(this.zzb, 0, this.zzd);
        this.zzd = 0;
    }

    public final void zzA(long j10) {
        int i10 = this.zzd;
        int i11 = i10 + 1;
        long j11 = j10 & (-128);
        int i12 = (int) j10;
        int i13 = this.zze;
        if (j11 == 0) {
            this.zzb[i10] = (byte) i12;
            this.zzd = i11;
            this.zze = i13 + 1;
            return;
        }
        int i14 = i10 + 2;
        byte[] bArr = this.zzb;
        bArr[i10] = (byte) (i12 | 128);
        long j12 = j10 >>> 7;
        long j13 = j12 & (-128);
        int i15 = (int) j12;
        if (j13 == 0) {
            bArr[i11] = (byte) i15;
            this.zzd = i14;
            this.zze = i13 + 2;
            return;
        }
        int i16 = i10 + 3;
        bArr[i11] = (byte) (i15 | 128);
        long j14 = j10 >>> 14;
        long j15 = j14 & (-128);
        int i17 = (int) j14;
        if (j15 == 0) {
            bArr[i14] = (byte) i17;
            this.zzd = i16;
            this.zze = i13 + 3;
            return;
        }
        int i18 = i10 + 4;
        bArr[i14] = (byte) (i17 | 128);
        long j16 = j10 >>> 21;
        long j17 = j16 & (-128);
        int i19 = (int) j16;
        if (j17 == 0) {
            bArr[i16] = (byte) i19;
            this.zzd = i18;
            this.zze = i13 + 4;
            return;
        }
        int i20 = i10 + 5;
        bArr[i16] = (byte) (i19 | 128);
        long j18 = j10 >>> 28;
        int i21 = (int) j18;
        if ((j18 & (-128)) == 0) {
            bArr[i18] = (byte) i21;
            this.zzd = i20;
            this.zze = i13 + 5;
            return;
        }
        int i22 = i10 + 6;
        bArr[i18] = (byte) (i21 | 128);
        long j19 = j10 >>> 35;
        int i23 = (int) j19;
        if ((j19 & (-128)) == 0) {
            bArr[i20] = (byte) i23;
            this.zzd = i22;
            this.zze = i13 + 6;
            return;
        }
        int i24 = i10 + 7;
        bArr[i20] = (byte) (i23 | 128);
        long j20 = j10 >>> 42;
        long j21 = j20 & (-128);
        int i25 = (int) j20;
        if (j21 == 0) {
            bArr[i22] = (byte) i25;
            this.zzd = i24;
            this.zze = i13 + 7;
            return;
        }
        int i26 = i10 + 8;
        bArr[i22] = (byte) (i25 | 128);
        long j22 = j10 >>> 49;
        long j23 = j22 & (-128);
        int i27 = (int) j22;
        if (j23 == 0) {
            bArr[i24] = (byte) i27;
            this.zzd = i26;
            this.zze = i13 + 8;
            return;
        }
        int i28 = i10 + 9;
        bArr[i24] = (byte) (i27 | 128);
        long j24 = j10 >>> 56;
        long j25 = j24 & (-128);
        int i29 = (int) j24;
        if (j25 == 0) {
            bArr[i26] = (byte) i29;
            this.zzd = i28;
            this.zze = i13 + 9;
        } else {
            bArr[i26] = (byte) (i29 | 128);
            bArr[i28] = (byte) (j10 >>> 63);
            this.zzd = i10 + 10;
            this.zze = i13 + 10;
        }
    }

    public final void zzB(int i10) {
        int i11 = this.zzd;
        byte[] bArr = this.zzb;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
        this.zzd = i11 + 4;
        this.zze += 4;
    }

    public final void zzC(long j10) {
        int i10 = this.zzd;
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
        this.zze += 8;
    }

    public final void zzD(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzc;
        int i13 = this.zzd;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zzb, i13, i11);
            this.zzd += i11;
            this.zze += i11;
            return;
        }
        byte[] bArr2 = this.zzb;
        System.arraycopy(bArr, i10, bArr2, i13, i14);
        int i15 = i10 + i14;
        this.zzd = i12;
        this.zze += i14;
        zzK();
        int i16 = i11 - i14;
        if (i16 <= i12) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.zzd = i16;
        } else {
            this.zzf.write(bArr, i15, i16);
        }
        this.zze += i16;
    }

    @Override // com.google.android.gms.internal.ads.zzidz
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzD(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzb(int i10, int i11) throws IOException {
        zzr((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzc(int i10, int i11) throws IOException {
        zzJ(20);
        zzz(i10 << 3);
        if (i11 >= 0) {
            zzz(i11);
        } else {
            zzA(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzd(int i10, int i11) throws IOException {
        zzJ(20);
        zzz(i10 << 3);
        zzz(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zze(int i10, int i11) throws IOException {
        zzJ(14);
        zzz((i10 << 3) | 5);
        zzB(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzf(int i10, long j10) throws IOException {
        zzJ(20);
        zzz(i10 << 3);
        zzA(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzg(int i10, long j10) throws IOException {
        zzJ(18);
        zzz((i10 << 3) | 1);
        zzC(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzh(int i10, boolean z10) throws IOException {
        zzJ(11);
        zzz(i10 << 3);
        zzv(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzi(int i10, String str) throws IOException {
        zzr((i10 << 3) | 2);
        zzw(str);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzj(int i10, zziei zzieiVar) throws IOException {
        zzr((i10 << 3) | 2);
        zzk(zzieiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzk(zziei zzieiVar) throws IOException {
        zzr(zzieiVar.zzb());
        zzieiVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzl(byte[] bArr, int i10, int i11) throws IOException {
        zzr(i11);
        zzD(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzm(int i10, zzigw zzigwVar) throws IOException {
        zzr(11);
        zzd(2, i10);
        zzr(26);
        zzo(zzigwVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzn(int i10, zziei zzieiVar) throws IOException {
        zzr(11);
        zzd(2, i10);
        zzj(3, zzieiVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzo(zzigw zzigwVar) throws IOException {
        zzr(zzigwVar.zzbr());
        zzigwVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzp(byte b10) throws IOException {
        if (this.zzd == this.zzc) {
            zzK();
        }
        zzv(b10);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzq(int i10) throws IOException {
        if (i10 >= 0) {
            zzr(i10);
        } else {
            zzt(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzr(int i10) throws IOException {
        zzJ(5);
        zzz(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzs(int i10) throws IOException {
        zzJ(4);
        zzB(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzt(long j10) throws IOException {
        zzJ(10);
        zzA(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzu(long j10) throws IOException {
        zzJ(8);
        zzC(j10);
    }

    public final void zzv(byte b10) {
        byte[] bArr = this.zzb;
        int i10 = this.zzd;
        bArr[i10] = b10;
        this.zzd = i10 + 1;
        this.zze++;
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzw(String str) throws IOException {
        int iZzb;
        int length = str.length() * 3;
        int iZzF = zzier.zzF(length);
        int i10 = iZzF + length;
        int i11 = this.zzc;
        if (i10 > i11) {
            byte[] bArr = new byte[length];
            int iZzc = zziim.zzc(str, bArr, 0, length);
            zzr(iZzc);
            zzD(bArr, 0, iZzc);
            return;
        }
        if (i10 > i11 - this.zzd) {
            zzK();
        }
        int iZzF2 = zzier.zzF(str.length());
        int i12 = this.zzd;
        try {
            if (iZzF2 == iZzF) {
                int i13 = i12 + iZzF2;
                this.zzd = i13;
                int iZzc2 = zziim.zzc(str, this.zzb, i13, i11 - i13);
                this.zzd = i12;
                iZzb = (iZzc2 - i12) - iZzF2;
                zzz(iZzb);
                this.zzd = iZzc2;
            } else {
                int i14 = zziim.zza;
                iZzb = zziij.zzb(str);
                zzz(iZzb);
                this.zzd = zziim.zzc(str, this.zzb, this.zzd, iZzb);
            }
            this.zze += iZzb;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new zziep(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzx() throws IOException {
        if (this.zzd > 0) {
            zzK();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final int zzy() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzz(int i10) {
        int i11 = this.zzd;
        int i12 = i11 + 1;
        int i13 = i10 & (-128);
        int i14 = this.zze;
        if (i13 == 0) {
            this.zzb[i11] = (byte) i10;
            this.zzd = i12;
            this.zze = i14 + 1;
            return;
        }
        int i15 = i11 + 2;
        byte[] bArr = this.zzb;
        bArr[i11] = (byte) (i10 | 128);
        int i16 = i10 >>> 7;
        if ((i16 & (-128)) == 0) {
            bArr[i12] = (byte) i16;
            this.zzd = i15;
            this.zze = i14 + 2;
            return;
        }
        int i17 = i11 + 3;
        bArr[i12] = (byte) (i16 | 128);
        int i18 = i10 >>> 14;
        if ((i18 & (-128)) == 0) {
            bArr[i15] = (byte) i18;
            this.zzd = i17;
            this.zze = i14 + 3;
            return;
        }
        int i19 = i11 + 4;
        bArr[i15] = (byte) (i18 | 128);
        int i20 = i10 >>> 21;
        if ((i20 & (-128)) == 0) {
            bArr[i17] = (byte) i20;
            this.zzd = i19;
            this.zze = i14 + 4;
        } else {
            bArr[i17] = (byte) (i20 | 128);
            bArr[i19] = (byte) (i10 >>> 28);
            this.zzd = i11 + 5;
            this.zze = i14 + 5;
        }
    }
}
