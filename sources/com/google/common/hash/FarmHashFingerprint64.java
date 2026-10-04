package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private static final long f150985K0 = -4348849565147123417L;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    private static final long f150986K1 = -5435081209227447693L;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    private static final long f150987K2 = -7286425919675154353L;

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i10, int i11) {
        return i11 <= 32 ? i11 <= 16 ? hashLength0to16(bArr, i10, i11) : hashLength17to32(bArr, i10, i11) : i11 <= 64 ? hashLength33To64(bArr, i10, i11) : hashLength65Plus(bArr, i10, i11);
    }

    private static long hashLength0to16(byte[] bArr, int i10, int i11) {
        if (i11 >= 8) {
            long j10 = ((long) (i11 * 2)) + f150987K2;
            long jLoad64 = LittleEndianByteArray.load64(bArr, i10) + f150987K2;
            long jLoad642 = LittleEndianByteArray.load64(bArr, (i10 + i11) - 8);
            return hashLength16((Long.rotateRight(jLoad642, 37) * j10) + jLoad64, (Long.rotateRight(jLoad64, 25) + jLoad642) * j10, j10);
        }
        if (i11 >= 4) {
            return hashLength16(((long) i11) + ((((long) LittleEndianByteArray.load32(bArr, i10)) & ZipKt.f225990j) << 3), ((long) LittleEndianByteArray.load32(bArr, (i10 + i11) - 4)) & ZipKt.f225990j, ((long) (i11 * 2)) + f150987K2);
        }
        if (i11 <= 0) {
            return f150987K2;
        }
        return shiftMix((((long) ((bArr[i10] & 255) + ((bArr[(i11 >> 1) + i10] & 255) << 8))) * f150987K2) ^ (((long) (i11 + ((bArr[(i11 - 1) + i10] & 255) << 2))) * f150985K0)) * f150987K2;
    }

    private static long hashLength16(long j10, long j11, long j12) {
        long j13 = (j10 ^ j11) * j12;
        long j14 = ((j13 ^ (j13 >>> 47)) ^ j11) * j12;
        return (j14 ^ (j14 >>> 47)) * j12;
    }

    private static long hashLength17to32(byte[] bArr, int i10, int i11) {
        long j10 = ((long) (i11 * 2)) + f150987K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i10) * f150986K1;
        long jLoad642 = LittleEndianByteArray.load64(bArr, i10 + 8);
        int i12 = i10 + i11;
        long jLoad643 = LittleEndianByteArray.load64(bArr, i12 - 8) * j10;
        return hashLength16(Long.rotateRight(jLoad643, 30) + Long.rotateRight(jLoad64 + jLoad642, 43) + (LittleEndianByteArray.load64(bArr, i12 - 16) * f150987K2), Long.rotateRight(jLoad642 + f150987K2, 18) + jLoad64 + jLoad643, j10);
    }

    private static long hashLength33To64(byte[] bArr, int i10, int i11) {
        long j10 = ((long) (i11 * 2)) + f150987K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i10) * f150987K2;
        long jLoad642 = LittleEndianByteArray.load64(bArr, i10 + 8);
        int i12 = i10 + i11;
        long jLoad643 = LittleEndianByteArray.load64(bArr, i12 - 8) * j10;
        long jRotateRight = Long.rotateRight(jLoad643, 30) + Long.rotateRight(jLoad64 + jLoad642, 43) + (LittleEndianByteArray.load64(bArr, i12 - 16) * f150987K2);
        long jHashLength16 = hashLength16(jRotateRight, jLoad643 + Long.rotateRight(jLoad642 + f150987K2, 18) + jLoad64, j10);
        long jLoad644 = LittleEndianByteArray.load64(bArr, i10 + 16) * j10;
        long jLoad645 = LittleEndianByteArray.load64(bArr, i10 + 24);
        long jLoad646 = (jRotateRight + LittleEndianByteArray.load64(bArr, i12 - 32)) * j10;
        return hashLength16(Long.rotateRight(jLoad646, 30) + Long.rotateRight(jLoad644 + jLoad645, 43) + ((jHashLength16 + LittleEndianByteArray.load64(bArr, i12 - 24)) * j10), Long.rotateRight(jLoad64 + jLoad645, 18) + jLoad644 + jLoad646, j10);
    }

    private static long hashLength65Plus(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = bArr;
        long j10 = 81;
        long j11 = f150986K1;
        long j12 = (j10 * f150986K1) + 113;
        long jShiftMix = shiftMix((j12 * f150987K2) + 113) * f150987K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        char c10 = 1;
        int i12 = i11 - 1;
        int i13 = ((i12 / 64) * 64) + i10;
        int i14 = i12 & 63;
        int i15 = i13 + i14;
        int i16 = i15 - 63;
        long j13 = j12;
        long jLoad64 = (j10 * f150987K2) + LittleEndianByteArray.load64(bArr, i10);
        int i17 = i10;
        while (true) {
            long j14 = j11;
            long jRotateRight = Long.rotateRight(jLoad64 + j13 + jArr[0] + LittleEndianByteArray.load64(bArr2, i17 + 8), 37) * j14;
            long jRotateRight2 = Long.rotateRight(j13 + jArr[c10] + LittleEndianByteArray.load64(bArr2, i17 + 48), 42) * j14;
            long j15 = jRotateRight ^ jArr2[c10];
            char c11 = c10;
            long jLoad642 = jArr[0] + LittleEndianByteArray.load64(bArr2, i17 + 40) + jRotateRight2;
            long jRotateRight3 = Long.rotateRight(jShiftMix + jArr2[0], 33) * j14;
            weakHashLength32WithSeeds(bArr2, i17, jArr[c11] * j14, j15 + jArr2[0], jArr);
            int i18 = i17;
            long[] jArr3 = jArr;
            weakHashLength32WithSeeds(bArr2, i18 + 32, jArr2[c11] + jRotateRight3, jLoad642 + LittleEndianByteArray.load64(bArr2, i18 + 16), jArr2);
            i17 = i18 + 64;
            if (i17 == i13) {
                long j16 = ((j15 & 255) << c11) + j14;
                long j17 = jArr2[0] + ((long) i14);
                jArr2[0] = j17;
                long j18 = jArr3[0] + j17;
                jArr3[0] = j18;
                jArr2[0] = jArr2[0] + j18;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jLoad642 + jArr3[0] + LittleEndianByteArray.load64(bArr2, i15 - 55), 37) * j16;
                long jRotateRight5 = Long.rotateRight(jLoad642 + jArr3[c11] + LittleEndianByteArray.load64(bArr2, i15 - 15), 42) * j16;
                long j19 = jRotateRight4 ^ (jArr2[c11] * 9);
                long jLoad643 = (jArr3[0] * 9) + LittleEndianByteArray.load64(bArr2, i15 - 23) + jRotateRight5;
                long jRotateRight6 = Long.rotateRight(j15 + jArr2[0], 33) * j16;
                weakHashLength32WithSeeds(bArr2, i16, jArr3[c11] * j16, jArr2[0] + j19, jArr3);
                weakHashLength32WithSeeds(bArr2, i15 - 31, jArr2[c11] + jRotateRight6, LittleEndianByteArray.load64(bArr2, i15 - 47) + jLoad643, jArr2);
                return hashLength16((shiftMix(jLoad643) * f150985K0) + hashLength16(jArr3[0], jArr2[0], j16) + j19, hashLength16(jArr3[c11], jArr2[c11], j16) + jRotateRight6, j16);
            }
            bArr2 = bArr;
            jLoad64 = jRotateRight3;
            j11 = j14;
            jShiftMix = j15;
            c10 = c11;
            j13 = jLoad642;
            jArr = jArr3;
        }
    }

    private static long shiftMix(long j10) {
        return j10 ^ (j10 >>> 47);
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i10, long j10, long j11, long[] jArr) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i10);
        long jLoad642 = LittleEndianByteArray.load64(bArr, i10 + 8);
        long jLoad643 = LittleEndianByteArray.load64(bArr, i10 + 16);
        long jLoad644 = LittleEndianByteArray.load64(bArr, i10 + 24);
        long j12 = j10 + jLoad64;
        long j13 = jLoad642 + j12 + jLoad643;
        long jRotateRight = Long.rotateRight(j13, 44) + Long.rotateRight(j11 + j12 + jLoad644, 21);
        jArr[0] = j13 + jLoad644;
        jArr[1] = jRotateRight + j12;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
        return HashCode.fromLong(fingerprint(bArr, i10, i11));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
