package com.prism.gaia.helper.utils;

import java.io.ByteArrayOutputStream;
import kotlin.io.encoding.Base64;
import okio.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class Base64Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f165044a = h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f165045b = 16515072;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165046c = 258048;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f165047d = 4032;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f165048e = 63;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte f165049f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte f165050g = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte f165051h = -3;

    public static class InvalidBase64ByteException extends Exception {
        private InvalidBase64ByteException() {
        }
    }

    public static byte a(byte b10) throws InvalidBase64ByteException {
        int i10;
        if (65 <= b10 && b10 <= 90) {
            i10 = b10 - 65;
        } else if (97 <= b10 && b10 <= 122) {
            i10 = b10 - 71;
        } else {
            if (48 > b10 || b10 > 57) {
                if (b10 == 43) {
                    return (byte) 62;
                }
                if (b10 == 47) {
                    return h0.f225962a;
                }
                if (b10 == 61) {
                    return (byte) -1;
                }
                if (b10 == 32 || b10 == 9 || b10 == 13 || b10 == 10) {
                    return (byte) -2;
                }
                throw new InvalidBase64ByteException();
            }
            i10 = b10 + 4;
        }
        return (byte) i10;
    }

    public static byte[] b(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, int i10, int i11) throws InvalidBase64ByteException {
        while (i10 < i11) {
            byte bA = a(bArr[i10]);
            if (bA != -2 && bA != -1) {
                return null;
            }
            i10++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int c(int i10) {
        int i11 = i10 % 3;
        int i12 = (i10 / 3) * 4;
        return i11 == 2 ? i12 + 4 : i11 == 1 ? i12 + 4 : i12;
    }

    public static byte[] d(byte[] bArr) {
        return e(bArr, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r9 != (-3)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        return r0.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] e(byte[] r13, int r14) {
        /*
            int r0 = r13.length
            int r14 = java.lang.Math.min(r0, r14)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            int r1 = r14 / 4
            r2 = 3
            int r1 = r1 * r2
            int r1 = r1 + r2
            r0.<init>(r1)
            r1 = 1
            int[] r3 = new int[r1]
        L12:
            r4 = 0
            r5 = 0
            r6 = r3[r5]     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            if (r6 >= r14) goto L99
            r6 = r5
            r7 = r6
        L1a:
            r8 = 4
            if (r6 >= r8) goto L86
            byte r9 = g(r13, r3, r14)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            r10 = -1
            r11 = -3
            if (r9 == r11) goto L33
            if (r9 != r10) goto L28
            goto L33
        L28:
            int r7 = r7 << 6
            r8 = r9 & 255(0xff, float:3.57E-43)
            int r7 = r7 + r8
            r8 = r3[r5]     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            int r8 = r8 + r1
            r3[r5] = r8     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            goto L3c
        L33:
            if (r6 == 0) goto L7e
            if (r6 == r1) goto L7e
            r12 = 2
            if (r6 == r12) goto L54
            if (r6 == r2) goto L3f
        L3c:
            int r6 = r6 + 1
            goto L1a
        L3f:
            if (r9 != r10) goto L4d
            int r1 = r7 >> 2
            int r2 = r7 >> 10
            r0.write(r2)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r1)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
        L4d:
            r1 = r3[r5]     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            byte[] r13 = b(r0, r13, r1, r14)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            return r13
        L54:
            if (r9 != r11) goto L5d
            r1 = r3[r5]     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            byte[] r13 = b(r0, r13, r1, r14)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            return r13
        L5d:
            r2 = r3[r5]     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            int r2 = r2 + r1
            r3[r5] = r2     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            byte r1 = g(r13, r3, r14)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            if (r1 != r11) goto L6f
            r1 = r3[r5]     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            byte[] r13 = b(r0, r13, r1, r14)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            return r13
        L6f:
            if (r1 != r10) goto L7d
            int r1 = r7 >> 4
            r0.write(r1)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            r1 = r3[r5]     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            byte[] r13 = b(r0, r13, r1, r14)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            return r13
        L7d:
            return r4
        L7e:
            if (r9 != r11) goto L85
            byte[] r13 = r0.toByteArray()     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            return r13
        L85:
            return r4
        L86:
            int r5 = r7 >> 16
            r0.write(r5)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            int r5 = r7 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            r0.write(r5)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            r5 = r7 & 255(0xff, float:3.57E-43)
            r0.write(r5)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            goto L12
        L99:
            byte[] r13 = b(r0, r13, r6, r14)     // Catch: com.prism.gaia.helper.utils.Base64Utils.InvalidBase64ByteException -> L9e
            return r13
        L9e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.helper.utils.Base64Utils.e(byte[], int):byte[]");
    }

    public static String f(byte[] bArr) {
        int i10;
        int length = bArr.length;
        byte[] bArr2 = new byte[c(length)];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int i13 = bArr[i12] & 255;
            int i14 = i12 + 1;
            if (i14 < length) {
                int i15 = (i13 << 8) | (bArr[i14] & 255);
                int i16 = i12 + 2;
                i10 = i16 < length ? (i15 << 8) | (bArr[i16] & 255) : i15 << 2;
            } else {
                i10 = i13 << 4;
            }
            if (i12 + 2 < length) {
                bArr2[i11] = f165044a[(16515072 & i10) >>> 18];
                i11++;
            }
            if (i14 < length) {
                bArr2[i11] = f165044a[(258048 & i10) >>> 12];
                i11++;
            }
            int i17 = i11 + 1;
            byte[] bArr3 = f165044a;
            bArr2[i11] = bArr3[(i10 & f165047d) >>> 6];
            i11 += 2;
            bArr2[i17] = bArr3[i10 & 63];
        }
        int i18 = length % 3;
        if (i18 > 0) {
            int i19 = i11 + 1;
            bArr2[i11] = Base64.f217719k;
            if (i18 == 1) {
                bArr2[i19] = Base64.f217719k;
            }
        }
        return new String(bArr2, C3919b.f165106b);
    }

    public static byte g(byte[] bArr, int[] iArr, int i10) throws InvalidBase64ByteException {
        while (true) {
            int i11 = iArr[0];
            if (i11 >= i10) {
                return (byte) -3;
            }
            byte bA = a(bArr[i11]);
            if (bA != -2) {
                return bA;
            }
            iArr[0] = iArr[0] + 1;
        }
    }

    public static byte[] h() {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes(C3919b.f165106b);
    }
}
