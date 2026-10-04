package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {
    static final HashFunction FINGERPRINT_2011 = new Fingerprint2011();

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private static final long f150988K0 = -6505348102511208375L;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    private static final long f150989K1 = -8261664234251669945L;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    private static final long f150990K2 = -4288712594273399085L;

    /* JADX INFO: renamed from: K3, reason: collision with root package name */
    private static final long f150991K3 = -4132994306676758123L;

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i10, int i11) {
        long jMurmurHash64WithSeed = i11 <= 32 ? murmurHash64WithSeed(bArr, i10, i11, -1397348546323613475L) : i11 <= 64 ? hashLength33To64(bArr, i10, i11) : fullFingerprint(bArr, i10, i11);
        long jLoad64 = f150988K0;
        long jLoad642 = i11 >= 8 ? LittleEndianByteArray.load64(bArr, i10) : -6505348102511208375L;
        if (i11 >= 9) {
            jLoad64 = LittleEndianByteArray.load64(bArr, (i10 + i11) - 8);
        }
        long jHash128to64 = hash128to64(jMurmurHash64WithSeed + jLoad64, jLoad642);
        return (jHash128to64 == 0 || jHash128to64 == 1) ? jHash128to64 - 2 : jHash128to64;
    }

    private static long fullFingerprint(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = bArr;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i10);
        int i12 = i10 + i11;
        long jLoad642 = LittleEndianByteArray.load64(bArr2, i12 - 16) ^ f150989K1;
        long jLoad643 = f150988K0 ^ LittleEndianByteArray.load64(bArr2, i12 - 56);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j10 = i11;
        weakHashLength32WithSeeds(bArr2, i12 - 64, j10, jLoad642, jArr);
        weakHashLength32WithSeeds(bArr2, i12 - 32, j10 * f150989K1, f150988K0, jArr2);
        long[] jArr3 = jArr2;
        long jShiftMix = (shiftMix(jArr[1]) * f150989K1) + jLoad643;
        long jRotateRight = Long.rotateRight(jLoad64 + jShiftMix, 39) * f150989K1;
        int i13 = (i11 - 1) & (-64);
        long jRotateRight2 = Long.rotateRight(jLoad642, 33) * f150989K1;
        long j11 = jRotateRight;
        long j12 = jShiftMix;
        int i14 = i10;
        while (true) {
            long jRotateRight3 = Long.rotateRight(j11 + jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr2, i14 + 16), 37) * f150989K1;
            long jRotateRight4 = Long.rotateRight(jRotateRight2 + jArr[1] + LittleEndianByteArray.load64(bArr2, i14 + 48), 42) * f150989K1;
            long j13 = jArr3[1] ^ jRotateRight3;
            long j14 = jRotateRight4 ^ jArr[0];
            long jRotateRight5 = Long.rotateRight(j12 ^ jArr3[0], 33);
            weakHashLength32WithSeeds(bArr2, i14, jArr[1] * f150989K1, jArr3[0] + j13, jArr);
            int i15 = i14;
            long[] jArr4 = jArr3;
            weakHashLength32WithSeeds(bArr, i15 + 32, jRotateRight5 + jArr3[1], j14, jArr4);
            i14 = i15 + 64;
            i13 -= 64;
            if (i13 == 0) {
                return hash128to64((shiftMix(j14) * f150989K1) + hash128to64(jArr[0], jArr4[0]) + j13, hash128to64(jArr[1], jArr4[1]) + jRotateRight5);
            }
            bArr2 = bArr;
            jArr3 = jArr4;
            j12 = j13;
            jRotateRight2 = j14;
            j11 = jRotateRight5;
        }
    }

    @VisibleForTesting
    public static long hash128to64(long j10, long j11) {
        long j12 = (j11 ^ j10) * f150991K3;
        long j13 = (j10 ^ (j12 ^ (j12 >>> 47))) * f150991K3;
        return (j13 ^ (j13 >>> 47)) * f150991K3;
    }

    private static long hashLength33To64(byte[] bArr, int i10, int i11) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i10 + 24);
        int i12 = i10 + i11;
        int i13 = i12 - 16;
        long jLoad642 = ((((long) i11) + LittleEndianByteArray.load64(bArr, i13)) * f150988K0) + LittleEndianByteArray.load64(bArr, i10);
        long jRotateRight = Long.rotateRight(jLoad642 + jLoad64, 52);
        long jRotateRight2 = Long.rotateRight(jLoad642, 37);
        long jLoad643 = jLoad642 + LittleEndianByteArray.load64(bArr, i10 + 8);
        long jRotateRight3 = Long.rotateRight(jLoad643, 7) + jRotateRight2;
        int i14 = i10 + 16;
        long jLoad644 = jLoad643 + LittleEndianByteArray.load64(bArr, i14);
        long j10 = jLoad64 + jLoad644;
        long jRotateRight4 = Long.rotateRight(jLoad644, 31) + jRotateRight + jRotateRight3;
        long jLoad645 = LittleEndianByteArray.load64(bArr, i14) + LittleEndianByteArray.load64(bArr, i12 - 32);
        long jLoad646 = LittleEndianByteArray.load64(bArr, i12 - 8);
        long jRotateRight5 = Long.rotateRight(jLoad645 + jLoad646, 52);
        long jRotateRight6 = Long.rotateRight(jLoad645, 37);
        long jLoad647 = jLoad645 + LittleEndianByteArray.load64(bArr, i12 - 24);
        long jRotateRight7 = Long.rotateRight(jLoad647, 7) + jRotateRight6;
        long jLoad648 = jLoad647 + LittleEndianByteArray.load64(bArr, i13);
        return shiftMix((shiftMix(((jLoad648 + jLoad646 + jRotateRight4) * f150988K0) + ((Long.rotateRight(jLoad648, 31) + jRotateRight5 + jRotateRight7 + j10) * f150990K2)) * f150988K0) + jRotateRight4) * f150990K2;
    }

    @VisibleForTesting
    public static long murmurHash64WithSeed(byte[] bArr, int i10, int i11, long j10) {
        int i12 = i11 & (-8);
        int i13 = i11 & 7;
        long jLoad64Safely = j10 ^ (((long) i11) * f150991K3);
        for (int i14 = 0; i14 < i12; i14 += 8) {
            jLoad64Safely = (jLoad64Safely ^ (shiftMix(LittleEndianByteArray.load64(bArr, i10 + i14) * f150991K3) * f150991K3)) * f150991K3;
        }
        if (i13 != 0) {
            jLoad64Safely = (LittleEndianByteArray.load64Safely(bArr, i10 + i12, i13) ^ jLoad64Safely) * f150991K3;
        }
        return shiftMix(shiftMix(jLoad64Safely) * f150991K3);
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
        long jRotateRight = Long.rotateRight(j13, 23) + Long.rotateRight(j11 + j12 + jLoad644, 51);
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
        return "Hashing.fingerprint2011()";
    }
}
