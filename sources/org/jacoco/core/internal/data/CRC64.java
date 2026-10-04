package org.jacoco.core.internal.data;

/* JADX INFO: loaded from: classes6.dex */
public final class CRC64 {
    private static final long[] LOOKUPTABLE = new long[256];
    private static final long POLY64REV = -2882303761517117440L;

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            long j10 = i10;
            for (int i11 = 0; i11 < 8; i11++) {
                j10 = (j10 & 1) == 1 ? (j10 >>> 1) ^ POLY64REV : j10 >>> 1;
            }
            LOOKUPTABLE[i10] = j10;
        }
    }

    private CRC64() {
    }

    public static long classId(byte[] bArr) {
        return (bArr.length > 7 && bArr[6] == 0 && bArr[7] == 53) ? update(update(update(0L, bArr, 0, 7), (byte) 52), bArr, 8, bArr.length) : update(0L, bArr, 0, bArr.length);
    }

    private static long update(long j10, byte b10) {
        return (j10 >>> 8) ^ LOOKUPTABLE[(b10 ^ ((int) j10)) & 255];
    }

    private static long update(long j10, byte[] bArr, int i10, int i11) {
        while (i10 < i11) {
            j10 = update(j10, bArr[i10]);
            i10++;
        }
        return j10;
    }
}
