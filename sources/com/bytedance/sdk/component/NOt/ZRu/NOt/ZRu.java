package com.bytedance.sdk.component.NOt.ZRu.NOt;

import android.support.v4.media.a;
import androidx.collection.LruCacheKt;
import androidx.compose.foundation.text.C1758e;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p0.C5377a;

/* JADX INFO: loaded from: classes2.dex */
public final class ZRu implements NOt, mZ, Cloneable, ByteChannel {
    private static final byte[] mZ = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    long NOt;
    TFq ZRu;

    public byte NOt() {
        long j10 = this.NOt;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        TFq tFq = this.ZRu;
        int i10 = tFq.NOt;
        int i11 = tFq.mZ;
        int i12 = i10 + 1;
        byte b10 = tFq.ZRu[i10];
        this.NOt = j10 - 1;
        if (i12 != i11) {
            tFq.NOt = i12;
            return b10;
        }
        this.ZRu = tFq.NOt();
        Ht.ZRu(tFq);
        return b10;
    }

    public final uR TFq() {
        long j10 = this.NOt;
        if (j10 <= LruCacheKt.f86729a) {
            return uR((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.NOt);
    }

    public boolean ZRu() {
        return this.NOt == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZRu)) {
            return false;
        }
        ZRu zRu = (ZRu) obj;
        long j10 = this.NOt;
        if (j10 != zRu.NOt) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        TFq tFq = this.ZRu;
        TFq tFq2 = zRu.ZRu;
        int i10 = tFq.NOt;
        int i11 = tFq2.NOt;
        while (j11 < this.NOt) {
            long jMin = Math.min(tFq.mZ - i10, tFq2.mZ - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (tFq.ZRu[i10] != tFq2.ZRu[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == tFq.mZ) {
                tFq = tFq.Ht;
                i10 = tFq.NOt;
            }
            if (i11 == tFq2.mZ) {
                tFq2 = tFq2.Ht;
                i11 = tFq2.NOt;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        TFq tFq = this.ZRu;
        if (tFq == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = tFq.mZ;
            for (int i12 = tFq.NOt; i12 < i11; i12++) {
                i10 = (i10 * 31) + tFq.ZRu[i12];
            }
            tFq = tFq.Ht;
        } while (tFq != this.ZRu);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public String mZ() {
        try {
            return ZRu(this.NOt, Vor.ZRu);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        TFq tFq = this.ZRu;
        if (tFq == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), tFq.mZ - tFq.NOt);
        byteBuffer.put(tFq.ZRu, tFq.NOt, iMin);
        int i10 = tFq.NOt + iMin;
        tFq.NOt = i10;
        this.NOt -= (long) iMin;
        if (i10 == tFq.mZ) {
            this.ZRu = tFq.NOt();
            Ht.ZRu(tFq);
        }
        return iMin;
    }

    public String toString() {
        return TFq().toString();
    }

    /* JADX INFO: renamed from: uR, reason: merged with bridge method [inline-methods] */
    public ZRu clone() {
        ZRu zRu = new ZRu();
        if (this.NOt == 0) {
            return zRu;
        }
        TFq tFqZRu = this.ZRu.ZRu();
        zRu.ZRu = tFqZRu;
        tFqZRu.Mm = tFqZRu;
        tFqZRu.Ht = tFqZRu;
        TFq tFq = this.ZRu;
        while (true) {
            tFq = tFq.Ht;
            if (tFq == this.ZRu) {
                zRu.NOt = this.NOt;
                return zRu;
            }
            zRu.ZRu.Mm.ZRu(tFq.ZRu());
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            TFq tFqMZ = mZ(1);
            int iMin = Math.min(i10, 8192 - tFqMZ.mZ);
            byteBuffer.get(tFqMZ.ZRu, tFqMZ.mZ, iMin);
            i10 -= iMin;
            tFqMZ.mZ += iMin;
        }
        this.NOt += (long) iRemaining;
        return iRemaining;
    }

    public String ZRu(long j10, Charset charset) throws EOFException {
        Vor.ZRu(this.NOt, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > LruCacheKt.f86729a) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
        }
        if (j10 == 0) {
            return "";
        }
        TFq tFq = this.ZRu;
        int i10 = tFq.NOt;
        if (((long) i10) + j10 > tFq.mZ) {
            return new String(ZRu(j10), charset);
        }
        String str = new String(tFq.ZRu, i10, (int) j10, charset);
        int i11 = (int) (((long) tFq.NOt) + j10);
        tFq.NOt = i11;
        this.NOt -= j10;
        if (i11 == tFq.mZ) {
            this.ZRu = tFq.NOt();
            Ht.ZRu(tFq);
        }
        return str;
    }

    public TFq mZ(int i10) {
        if (i10 > 0 && i10 <= 8192) {
            TFq tFq = this.ZRu;
            if (tFq == null) {
                TFq tFqZRu = Ht.ZRu();
                this.ZRu = tFqZRu;
                tFqZRu.Mm = tFqZRu;
                tFqZRu.Ht = tFqZRu;
                return tFqZRu;
            }
            TFq tFq2 = tFq.Mm;
            return (tFq2.mZ + i10 > 8192 || !tFq2.TFq) ? tFq2.ZRu(Ht.ZRu()) : tFq2;
        }
        throw new IllegalArgumentException();
    }

    public final uR uR(int i10) {
        if (i10 == 0) {
            return uR.mZ;
        }
        return new Mm(this, i10);
    }

    public ZRu NOt(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            Vor.ZRu(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                TFq tFqMZ = mZ(1);
                int iMin = Math.min(i12 - i10, 8192 - tFqMZ.mZ);
                System.arraycopy(bArr, i10, tFqMZ.ZRu, tFqMZ.mZ, iMin);
                i10 += iMin;
                tFqMZ.mZ += iMin;
            }
            this.NOt += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] ZRu(long j10) throws EOFException {
        Vor.ZRu(this.NOt, 0L, j10);
        if (j10 <= LruCacheKt.f86729a) {
            byte[] bArr = new byte[(int) j10];
            ZRu(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
    }

    public ZRu NOt(int i10) {
        TFq tFqMZ = mZ(1);
        byte[] bArr = tFqMZ.ZRu;
        int i11 = tFqMZ.mZ;
        tFqMZ.mZ = i11 + 1;
        bArr[i11] = (byte) i10;
        this.NOt++;
        return this;
    }

    public void ZRu(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int iZRu = ZRu(bArr, i10, bArr.length - i10);
            if (iZRu == -1) {
                throw new EOFException();
            }
            i10 += iZRu;
        }
    }

    public ZRu NOt(long j10) {
        if (j10 == 0) {
            return NOt(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        TFq tFqMZ = mZ(iNumberOfTrailingZeros);
        byte[] bArr = tFqMZ.ZRu;
        int i10 = tFqMZ.mZ;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = mZ[(int) (15 & j10)];
            j10 >>>= 4;
        }
        tFqMZ.mZ += iNumberOfTrailingZeros;
        this.NOt += (long) iNumberOfTrailingZeros;
        return this;
    }

    public int ZRu(byte[] bArr, int i10, int i11) {
        Vor.ZRu(bArr.length, i10, i11);
        TFq tFq = this.ZRu;
        if (tFq == null) {
            return -1;
        }
        int iMin = Math.min(i11, tFq.mZ - tFq.NOt);
        System.arraycopy(tFq.ZRu, tFq.NOt, bArr, i10, iMin);
        int i12 = tFq.NOt + iMin;
        tFq.NOt = i12;
        this.NOt -= (long) iMin;
        if (i12 == tFq.mZ) {
            this.ZRu = tFq.NOt();
            Ht.ZRu(tFq);
        }
        return iMin;
    }

    public ZRu ZRu(String str) {
        return ZRu(str, 0, str.length());
    }

    public ZRu ZRu(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbA = a.a("endIndex > string.length: ", i11, " > ");
                sbA.append(str.length());
                throw new IllegalArgumentException(sbA.toString());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    TFq tFqMZ = mZ(1);
                    byte[] bArr = tFqMZ.ZRu;
                    int i12 = tFqMZ.mZ - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = tFqMZ.mZ;
                    int i15 = (i12 + i10) - i14;
                    tFqMZ.mZ = i14 + i15;
                    this.NOt += (long) i15;
                } else {
                    if (cCharAt2 < 2048) {
                        NOt((cCharAt2 >> 6) | 192);
                        NOt((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            NOt((i17 >> 18) | 240);
                            NOt(((i17 >> 12) & 63) | 128);
                            NOt(((i17 >> 6) & 63) | 128);
                            NOt((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            NOt(63);
                            i10 = i16;
                        }
                    } else {
                        NOt((cCharAt2 >> '\f') | 224);
                        NOt(((cCharAt2 >> 6) & 63) | 128);
                        NOt((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(C1758e.a("endIndex < beginIndex: ", i11, " < ", i10));
    }

    public ZRu ZRu(int i10) {
        if (i10 < 128) {
            NOt(i10);
            return this;
        }
        if (i10 < 2048) {
            NOt((i10 >> 6) | 192);
            NOt((i10 & 63) | 128);
            return this;
        }
        if (i10 >= 65536) {
            if (i10 <= 1114111) {
                NOt((i10 >> 18) | 240);
                NOt(((i10 >> 12) & 63) | 128);
                NOt(((i10 >> 6) & 63) | 128);
                NOt((i10 & 63) | 128);
                return this;
            }
            throw new IllegalArgumentException(C5377a.a(i10, new StringBuilder("Unexpected code point: ")));
        }
        if (i10 >= 55296 && i10 <= 57343) {
            NOt(63);
            return this;
        }
        NOt((i10 >> 12) | 224);
        NOt(((i10 >> 6) & 63) | 128);
        NOt((i10 & 63) | 128);
        return this;
    }

    public ZRu ZRu(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbA = a.a("endIndex > string.length: ", i11, " > ");
                sbA.append(str.length());
                throw new IllegalArgumentException(sbA.toString());
            }
            if (charset != null) {
                if (charset.equals(Vor.ZRu)) {
                    return ZRu(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return NOt(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(C1758e.a("endIndex < beginIndex: ", i11, " < ", i10));
    }
}
