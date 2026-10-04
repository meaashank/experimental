package com.tencent.cos.xml.s3;

import android.support.v4.media.c;
import com.google.common.base.Ascii;
import okio.h0;

/* JADX INFO: loaded from: classes7.dex */
public class Base64Codec implements Codec {
    private static final int MASK_2BITS = 3;
    private static final int MASK_4BITS = 15;
    private static final int MASK_6BITS = 63;
    private static final int OFFSET_OF_0 = -4;
    private static final int OFFSET_OF_PLUS = -19;
    private static final int OFFSET_OF_SLASH = -16;
    private static final int OFFSET_OF_a = 71;
    private static final byte PAD = 61;
    private final byte[] alphabets;

    public static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[123];
            for (int i10 = 0; i10 <= 122; i10++) {
                if (i10 >= 65 && i10 <= 90) {
                    bArr[i10] = (byte) (i10 - 65);
                } else if (i10 >= 48 && i10 <= 57) {
                    bArr[i10] = (byte) (i10 + 4);
                } else if (i10 == 43) {
                    bArr[i10] = (byte) (i10 + 19);
                } else if (i10 == 47) {
                    bArr[i10] = (byte) (i10 + 16);
                } else if (i10 < 97 || i10 > 122) {
                    bArr[i10] = -1;
                } else {
                    bArr[i10] = (byte) (i10 - 71);
                }
            }
            return bArr;
        }
    }

    public Base64Codec() {
        this.alphabets = CodecUtils.toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    }

    @Override // com.tencent.cos.xml.s3.Codec
    public byte[] decode(byte[] bArr, int i10) {
        int i11;
        if (i10 % 4 != 0) {
            throw new IllegalArgumentException(c.a("Input is expected to be encoded in multiple of 4 bytes but found: ", i10));
        }
        int i12 = i10 - 1;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i11 = 2;
            if (i14 >= 2 || i12 <= -1 || bArr[i12] != 61) {
                break;
            }
            i12--;
            i14++;
        }
        if (i14 == 0) {
            i11 = 3;
        } else if (i14 != 1) {
            if (i14 != 2) {
                throw new Error("Impossible");
            }
            i11 = 1;
        }
        int i15 = ((i10 / 4) * 3) - (3 - i11);
        byte[] bArr2 = new byte[i15];
        int i16 = 0;
        while (i16 < i15 - (i11 % 3)) {
            decode4bytes(bArr, i13, bArr2, i16);
            i13 += 4;
            i16 += 3;
        }
        if (i11 < 3) {
            decode1to3bytes(i11, bArr, i13, bArr2, i16);
        }
        return bArr2;
    }

    public void decode1to3bytes(int i10, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = i12 + 1;
        int iPos = pos(bArr[i11]) << 2;
        int i14 = i11 + 2;
        int iPos2 = pos(bArr[i11 + 1]);
        bArr2[i12] = (byte) (iPos | ((iPos2 >>> 4) & 3));
        if (i10 == 1) {
            CodecUtils.sanityCheckLastPos(iPos2, 15);
            return;
        }
        int i15 = i12 + 2;
        int i16 = i11 + 3;
        int iPos3 = pos(bArr[i14]);
        bArr2[i13] = (byte) (((iPos2 & 15) << 4) | (15 & (iPos3 >>> 2)));
        if (i10 == 2) {
            CodecUtils.sanityCheckLastPos(iPos3, 3);
        } else {
            bArr2[i15] = (byte) (((iPos3 & 3) << 6) | pos(bArr[i16]));
        }
    }

    public void decode4bytes(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iPos = pos(bArr[i10]) << 2;
        int iPos2 = pos(bArr[i10 + 1]);
        bArr2[i11] = (byte) (iPos | ((iPos2 >>> 4) & 3));
        int iPos3 = pos(bArr[i10 + 2]);
        bArr2[i11 + 1] = (byte) (((iPos2 & 15) << 4) | ((iPos3 >>> 2) & 15));
        bArr2[i11 + 2] = (byte) (pos(bArr[i10 + 3]) | ((iPos3 & 3) << 6));
    }

    @Override // com.tencent.cos.xml.s3.Codec
    public byte[] encode(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i10 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 4];
            int i11 = 0;
            while (i10 < bArr.length) {
                encode3bytes(bArr, i10, bArr2, i11);
                i10 += 3;
                i11 += 4;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 4];
        int i12 = 0;
        while (i10 < bArr.length - length2) {
            encode3bytes(bArr, i10, bArr3, i12);
            i10 += 3;
            i12 += 4;
        }
        if (length2 == 1) {
            encode1byte(bArr, i10, bArr3, i12);
            return bArr3;
        }
        if (length2 != 2) {
            throw new IllegalStateException();
        }
        encode2bytes(bArr, i10, bArr3, i12);
        return bArr3;
    }

    public void encode1byte(byte[] bArr, int i10, byte[] bArr2, int i11) {
        byte[] bArr3 = this.alphabets;
        byte b10 = bArr[i10];
        bArr2[i11] = bArr3[(b10 >>> 2) & 63];
        bArr2[i11 + 1] = bArr3[(b10 & 3) << 4];
        bArr2[i11 + 2] = 61;
        bArr2[i11 + 3] = 61;
    }

    public void encode2bytes(byte[] bArr, int i10, byte[] bArr2, int i11) {
        byte[] bArr3 = this.alphabets;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        bArr2[i11] = bArr3[(b10 >>> 2) & 63];
        byte b11 = bArr[i12];
        bArr2[i11 + 1] = bArr3[((b10 & 3) << 4) | ((b11 >>> 4) & 15)];
        bArr2[i11 + 2] = bArr3[(b11 & Ascii.SI) << 2];
        bArr2[i11 + 3] = 61;
    }

    public void encode3bytes(byte[] bArr, int i10, byte[] bArr2, int i11) {
        byte[] bArr3 = this.alphabets;
        byte b10 = bArr[i10];
        bArr2[i11] = bArr3[(b10 >>> 2) & 63];
        byte b11 = bArr[i10 + 1];
        bArr2[i11 + 1] = bArr3[((b10 & 3) << 4) | ((b11 >>> 4) & 15)];
        int i12 = (b11 & Ascii.SI) << 2;
        byte b12 = bArr[i10 + 2];
        bArr2[i11 + 2] = bArr3[((b12 >>> 6) & 3) | i12];
        bArr2[i11 + 3] = bArr3[b12 & h0.f225962a];
    }

    public int pos(byte b10) {
        byte b11 = LazyHolder.DECODED[b10];
        if (b11 > -1) {
            return b11;
        }
        throw new IllegalArgumentException("Invalid base 64 character: '" + ((char) b10) + "'");
    }

    public Base64Codec(byte[] bArr) {
        this.alphabets = bArr;
    }
}
