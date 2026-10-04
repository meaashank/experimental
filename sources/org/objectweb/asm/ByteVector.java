package org.objectweb.asm;

/* JADX INFO: loaded from: classes8.dex */
public class ByteVector {
    byte[] data;
    int length;

    public ByteVector() {
        this.data = new byte[64];
    }

    private void enlarge(int i10) {
        byte[] bArr = this.data;
        int length = bArr.length * 2;
        int i11 = this.length;
        int i12 = i10 + i11;
        if (length <= i12) {
            length = i12;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        this.data = bArr2;
    }

    public final ByteVector encodeUtf8(String str, int i10, int i11) {
        int length = str.length();
        int i12 = i10;
        int i13 = i12;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            i13 = (cCharAt < 1 || cCharAt > 127) ? cCharAt <= 2047 ? i13 + 2 : i13 + 3 : i13 + 1;
            i12++;
        }
        if (i13 > i11) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i14 = this.length;
        int i15 = i14 - i10;
        int i16 = i15 - 2;
        if (i16 >= 0) {
            byte[] bArr = this.data;
            bArr[i16] = (byte) (i13 >>> 8);
            bArr[i15 - 1] = (byte) i13;
        }
        if ((i14 + i13) - i10 > this.data.length) {
            enlarge(i13 - i10);
        }
        int i17 = this.length;
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                this.data[i17] = (byte) cCharAt2;
                i17++;
            } else if (cCharAt2 <= 2047) {
                byte[] bArr2 = this.data;
                int i18 = i17 + 1;
                bArr2[i17] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                i17 += 2;
                bArr2[i18] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                byte[] bArr3 = this.data;
                bArr3[i17] = (byte) (((cCharAt2 >> '\f') & 15) | 224);
                int i19 = i17 + 2;
                bArr3[i17 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i17 += 3;
                bArr3[i19] = (byte) ((cCharAt2 & '?') | 128);
            }
            i10++;
        }
        this.length = i17;
        return this;
    }

    public final ByteVector put11(int i10, int i11) {
        int i12 = this.length;
        if (i12 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        bArr[i12] = (byte) i10;
        bArr[i12 + 1] = (byte) i11;
        this.length = i12 + 2;
        return this;
    }

    public final ByteVector put112(int i10, int i11, int i12) {
        int i13 = this.length;
        if (i13 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        bArr[i13] = (byte) i10;
        bArr[i13 + 1] = (byte) i11;
        bArr[i13 + 2] = (byte) (i12 >>> 8);
        bArr[i13 + 3] = (byte) i12;
        this.length = i13 + 4;
        return this;
    }

    public final ByteVector put12(int i10, int i11) {
        int i12 = this.length;
        if (i12 + 3 > this.data.length) {
            enlarge(3);
        }
        byte[] bArr = this.data;
        bArr[i12] = (byte) i10;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) i11;
        this.length = i12 + 3;
        return this;
    }

    public final ByteVector put122(int i10, int i11, int i12) {
        int i13 = this.length;
        if (i13 + 5 > this.data.length) {
            enlarge(5);
        }
        byte[] bArr = this.data;
        bArr[i13] = (byte) i10;
        bArr[i13 + 1] = (byte) (i11 >>> 8);
        bArr[i13 + 2] = (byte) i11;
        bArr[i13 + 3] = (byte) (i12 >>> 8);
        bArr[i13 + 4] = (byte) i12;
        this.length = i13 + 5;
        return this;
    }

    public ByteVector putByte(int i10) {
        int i11 = this.length;
        int i12 = i11 + 1;
        if (i12 > this.data.length) {
            enlarge(1);
        }
        this.data[i11] = (byte) i10;
        this.length = i12;
        return this;
    }

    public ByteVector putByteArray(byte[] bArr, int i10, int i11) {
        if (this.length + i11 > this.data.length) {
            enlarge(i11);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i10, this.data, this.length, i11);
        }
        this.length += i11;
        return this;
    }

    public ByteVector putInt(int i10) {
        int i11 = this.length;
        if (i11 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
        this.length = i11 + 4;
        return this;
    }

    public ByteVector putLong(long j10) {
        int i10 = this.length;
        if (i10 + 8 > this.data.length) {
            enlarge(8);
        }
        byte[] bArr = this.data;
        int i11 = (int) (j10 >>> 32);
        bArr[i10] = (byte) (i11 >>> 24);
        bArr[i10 + 1] = (byte) (i11 >>> 16);
        bArr[i10 + 2] = (byte) (i11 >>> 8);
        bArr[i10 + 3] = (byte) i11;
        int i12 = (int) j10;
        bArr[i10 + 4] = (byte) (i12 >>> 24);
        bArr[i10 + 5] = (byte) (i12 >>> 16);
        bArr[i10 + 6] = (byte) (i12 >>> 8);
        bArr[i10 + 7] = (byte) i12;
        this.length = i10 + 8;
        return this;
    }

    public ByteVector putShort(int i10) {
        int i11 = this.length;
        if (i11 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i11 + 1] = (byte) i10;
        this.length = i11 + 2;
        return this;
    }

    public ByteVector putUTF8(String str) {
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i10 = this.length;
        if (i10 + 2 + length > this.data.length) {
            enlarge(length + 2);
        }
        byte[] bArr = this.data;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (length >>> 8);
        int i12 = i10 + 2;
        bArr[i11] = (byte) length;
        int i13 = 0;
        while (i13 < length) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < 1 || cCharAt > 127) {
                this.length = i12;
                return encodeUtf8(str, i13, 65535);
            }
            bArr[i12] = (byte) cCharAt;
            i13++;
            i12++;
        }
        this.length = i12;
        return this;
    }

    public ByteVector(int i10) {
        this.data = new byte[i10];
    }

    public ByteVector(byte[] bArr) {
        this.data = bArr;
        this.length = bArr.length;
    }
}
