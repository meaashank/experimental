package K3;

import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static int a(String str) {
        byte[] bytes = str.getBytes();
        return d(bytes, bytes.length, -1756908916);
    }

    public static int b(String str, int i10, int i11) {
        return a(str.substring(i10, i11 + i10));
    }

    public static int c(byte[] bArr, int i10) {
        return d(bArr, i10, -1756908916);
    }

    public static int d(byte[] bArr, int i10, int i11) {
        int i12 = i11 ^ i10;
        int i13 = i10 / 4;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i14 * 4;
            int i16 = ((bArr[i15] & 255) + ((bArr[i15 + 1] & 255) << 8) + ((bArr[i15 + 2] & 255) << 16) + ((bArr[i15 + 3] & 255) << 24)) * 1540483477;
            i12 = (i12 * 1540483477) ^ (((i16 >>> 24) ^ i16) * 1540483477);
        }
        int i17 = i10 % 4;
        if (i17 == 1) {
            i12 = ((bArr[i10 & (-4)] & 255) ^ i12) * 1540483477;
        } else {
            if (i17 != 2) {
                if (i17 == 3) {
                    i12 ^= (bArr[(i10 & (-4)) + 2] & 255) << 16;
                }
            }
            i12 ^= (bArr[(i10 & (-4)) + 1] & 255) << 8;
            i12 = ((bArr[i10 & (-4)] & 255) ^ i12) * 1540483477;
        }
        int i18 = ((i12 >>> 13) ^ i12) * 1540483477;
        return i18 ^ (i18 >>> 15);
    }

    public static long e(String str) {
        byte[] bytes = str.getBytes();
        return h(bytes, bytes.length, -512093083);
    }

    public static long f(String str, int i10, int i11) {
        return e(str.substring(i10, i11 + i10));
    }

    public static long g(byte[] bArr, int i10) {
        return h(bArr, i10, -512093083);
    }

    public static long h(byte[] bArr, int i10, int i11) {
        long j10 = -4132994306676758123L;
        long j11 = (((long) i11) & ZipKt.f225990j) ^ (((long) i10) * (-4132994306676758123L));
        int i12 = i10 / 8;
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i13 * 8;
            long j12 = j10;
            long j13 = ((((long) bArr[i14]) & 255) + ((((long) bArr[i14 + 1]) & 255) << 8) + ((((long) bArr[i14 + 2]) & 255) << 16) + ((((long) bArr[i14 + 3]) & 255) << 24) + ((((long) bArr[i14 + 4]) & 255) << 32) + ((((long) bArr[i14 + 5]) & 255) << 40) + ((((long) bArr[i14 + 6]) & 255) << 48) + ((((long) bArr[i14 + 7]) & 255) << 56)) * j12;
            j11 = (j11 ^ ((j13 ^ (j13 >>> 47)) * j12)) * j12;
            i13++;
            j10 = j12;
        }
        long j14 = j10;
        switch (i10 % 8) {
            case 7:
                j11 ^= ((long) (bArr[(i10 & (-8)) + 6] & 255)) << 48;
            case 6:
                j11 ^= ((long) (bArr[(i10 & (-8)) + 5] & 255)) << 40;
            case 5:
                j11 ^= ((long) (bArr[(i10 & (-8)) + 4] & 255)) << 32;
            case 4:
                j11 ^= ((long) (bArr[(i10 & (-8)) + 3] & 255)) << 24;
            case 3:
                j11 ^= ((long) (bArr[(i10 & (-8)) + 2] & 255)) << 16;
            case 2:
                j11 ^= ((long) (bArr[(i10 & (-8)) + 1] & 255)) << 8;
            case 1:
                j11 = (j11 ^ ((long) (bArr[i10 & (-8)] & 255))) * j14;
                break;
        }
        long j15 = (j11 ^ (j11 >>> 47)) * j14;
        return j15 ^ (j15 >>> 47);
    }
}
