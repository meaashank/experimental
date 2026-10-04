package com.prism.gaia.helper.utils.apk;

import android.util.Pair;
import androidx.collection.C1545m0;
import androidx.collection.LruCacheKt;
import androidx.collection.N0;
import androidx.collection.Q;
import androidx.compose.foundation.text.C1758e;
import androidx.compose.runtime.snapshots.z;
import com.prism.gaia.helper.utils.D;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f165081a = 1048576;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f165082b = 257;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165083c = 258;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f165084d = 259;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f165085e = 260;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f165086f = 513;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f165087g = 514;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f165088h = 769;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f165089i = 1057;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f165090j = 1059;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f165091k = 1061;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f165092l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f165093m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f165094n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f165095o = 3617552046287187010L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f165096p = 2334950737559900225L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f165097q = 32;

    public static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageDigest[] f165098a;

        public a(MessageDigest[] messageDigestArr) {
            this.f165098a = messageDigestArr;
        }

        @Override // com.prism.gaia.helper.utils.apk.e
        public void a(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            for (MessageDigest messageDigest : this.f165098a) {
                byteBufferSlice.position(0);
                messageDigest.update(byteBufferSlice);
            }
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int b(int i10, int i11) {
        if (i10 == 1) {
            if (i11 == 1) {
                return 0;
            }
            if (i11 == 2 || i11 == 3) {
                return -1;
            }
            throw new IllegalArgumentException(android.support.v4.media.c.a("Unknown digestAlgorithm2: ", i11));
        }
        if (i10 == 2) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return 0;
                }
                if (i11 != 3) {
                    throw new IllegalArgumentException(android.support.v4.media.c.a("Unknown digestAlgorithm2: ", i11));
                }
            }
            return 1;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Unknown digestAlgorithm1: ", i10));
        }
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return -1;
        }
        if (i11 == 3) {
            return 0;
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("Unknown digestAlgorithm2: ", i11));
    }

    public static int c(int i10, int i11) {
        return b(n(i10), n(i11));
    }

    public static ByteBuffer d(ByteBuffer byteBuffer, int i10) throws SignatureNotFoundExceptionG {
        a(byteBuffer);
        ByteBuffer byteBufferT = t(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i11 = 0;
        while (byteBufferT.hasRemaining()) {
            i11++;
            if (byteBufferT.remaining() < 8) {
                throw new SignatureNotFoundExceptionG(android.support.v4.media.c.a("Insufficient data to read size of APK Signing Block entry #", i11));
            }
            long j10 = byteBufferT.getLong();
            if (j10 < 4 || j10 > LruCacheKt.f86729a) {
                throw new SignatureNotFoundExceptionG("APK Signing Block entry #" + i11 + " size out of range: " + j10);
            }
            int i12 = (int) j10;
            int iPosition = byteBufferT.position() + i12;
            if (i12 > byteBufferT.remaining()) {
                StringBuilder sbA = C1545m0.a("APK Signing Block entry #", i11, " size out of range: ", i12, ", available: ");
                sbA.append(byteBufferT.remaining());
                throw new SignatureNotFoundExceptionG(sbA.toString());
            }
            if (byteBufferT.getInt() == i10) {
                return g(byteBufferT, i12 - 4);
            }
            byteBufferT.position(iPosition);
        }
        throw new SignatureNotFoundExceptionG(N0.a("No block with ID ", i10, " in APK Signing Block."));
    }

    public static Pair<ByteBuffer, Long> e(RandomAccessFile randomAccessFile, long j10) throws SignatureNotFoundExceptionG, IOException {
        if (j10 < 32) {
            throw new SignatureNotFoundExceptionG(Q.a("APK too small for APK Signing Block. ZIP Central Directory offset: ", j10));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j10 - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(8) != f165096p || byteBufferAllocate.getLong(16) != f165095o) {
            throw new SignatureNotFoundExceptionG("No APK Signing Block before ZIP Central Directory");
        }
        long j11 = byteBufferAllocate.getLong(0);
        if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
            throw new SignatureNotFoundExceptionG(Q.a("APK Signing Block size out of range: ", j11));
        }
        int i10 = (int) (8 + j11);
        long j12 = j10 - ((long) i10);
        if (j12 < 0) {
            throw new SignatureNotFoundExceptionG(Q.a("APK Signing Block offset out of range: ", j12));
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j12);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j13 = byteBufferAllocate2.getLong(0);
        if (j13 == j11) {
            return Pair.create(byteBufferAllocate2, Long.valueOf(j12));
        }
        StringBuilder sbA = z.a("APK Signing Block sizes in header and footer do not match: ", j13, " vs ");
        sbA.append(j11);
        throw new SignatureNotFoundExceptionG(sbA.toString());
    }

    public static g f(RandomAccessFile randomAccessFile, int i10) throws SignatureNotFoundExceptionG, IOException {
        Pair<ByteBuffer, Long> pairL = l(randomAccessFile);
        ByteBuffer byteBuffer = (ByteBuffer) pairL.first;
        long jLongValue = ((Long) pairL.second).longValue();
        if (D.i(randomAccessFile, jLongValue)) {
            throw new SignatureNotFoundExceptionG("ZIP64 APK not supported");
        }
        long jH = h(byteBuffer, jLongValue);
        Pair<ByteBuffer, Long> pairE = e(randomAccessFile, jH);
        ByteBuffer byteBuffer2 = (ByteBuffer) pairE.first;
        return new g(d(byteBuffer2, i10), ((Long) pairE.second).longValue(), jH, jLongValue, byteBuffer);
    }

    public static ByteBuffer g(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("size: ", i10));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static long h(ByteBuffer byteBuffer, long j10) throws SignatureNotFoundExceptionG {
        long jG = D.g(byteBuffer);
        if (jG <= j10) {
            if (D.h(byteBuffer) + jG == j10) {
                return jG;
            }
            throw new SignatureNotFoundExceptionG("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        StringBuilder sbA = z.a("ZIP Central Directory offset out of range: ", jG, ". ZIP End of Central Directory offset: ");
        sbA.append(j10);
        throw new SignatureNotFoundExceptionG(sbA.toString());
    }

    public static long i(long j10) {
        return (j10 + 1048575) / 1048576;
    }

    public static String j(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        if (i10 == 3) {
            return "SHA-256";
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("Unknown content digest algorthm: ", i10));
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        if (i10 == 3) {
            return 32;
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("Unknown content digest algorthm: ", i10));
    }

    public static Pair<ByteBuffer, Long> l(RandomAccessFile randomAccessFile) throws SignatureNotFoundExceptionG, IOException {
        Pair<ByteBuffer, Long> pairC = D.c(randomAccessFile);
        if (pairC != null) {
            return pairC;
        }
        throw new SignatureNotFoundExceptionG("Not an APK file: ZIP End of Central Directory record not found");
    }

    public static ByteBuffer m(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return g(byteBuffer, i10);
        }
        StringBuilder sbA = android.support.v4.media.a.a("Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ");
        sbA.append(byteBuffer.remaining());
        throw new IOException(sbA.toString());
    }

    public static int n(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        if (i10 == 1057 || i10 == 1059 || i10 == 1061) {
            return 3;
        }
        switch (i10) {
            case 257:
            case f165084d /* 259 */:
                return 1;
            case f165083c /* 258 */:
            case f165085e /* 260 */:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i10));
        }
    }

    public static String o(int i10) {
        if (i10 == 513 || i10 == 514) {
            return "EC";
        }
        if (i10 == 769) {
            return "DSA";
        }
        if (i10 == 1057) {
            return "RSA";
        }
        if (i10 == 1059) {
            return "EC";
        }
        if (i10 == 1061) {
            return "DSA";
        }
        switch (i10) {
            case 257:
            case f165083c /* 258 */:
            case f165084d /* 259 */:
            case f165085e /* 260 */:
                return "RSA";
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i10));
        }
    }

    public static Pair<String, ? extends AlgorithmParameterSpec> p(int i10) {
        if (i10 != 513) {
            if (i10 == 514) {
                return Pair.create("SHA512withECDSA", null);
            }
            if (i10 != 769) {
                if (i10 != 1057) {
                    if (i10 != 1059) {
                        if (i10 != 1061) {
                            switch (i10) {
                                case 257:
                                    return Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                                case f165083c /* 258 */:
                                    return Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                                case f165084d /* 259 */:
                                    break;
                                case f165085e /* 260 */:
                                    return Pair.create("SHA512withRSA", null);
                                default:
                                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i10));
                            }
                        }
                    }
                }
                return Pair.create("SHA256withRSA", null);
            }
            return Pair.create("SHA256withDSA", null);
        }
        return Pair.create("SHA256withECDSA", null);
    }

    public static byte[] q(byte[] bArr, long j10, g gVar) throws SecurityException {
        if (bArr.length != 40) {
            throw new SecurityException("Verity digest size is wrong: " + bArr.length);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.position(32);
        if (byteBufferOrder.getLong() == j10 - (gVar.f165102c - gVar.f165101b)) {
            return Arrays.copyOfRange(bArr, 0, 32);
        }
        throw new SecurityException("APK content size did not verify");
    }

    public static byte[] r(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbA = android.support.v4.media.a.a("Underflow while reading length-prefixed value. Length: ", i10, ", available: ");
        sbA.append(byteBuffer.remaining());
        throw new IOException(sbA.toString());
    }

    public static void s(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 3] = (byte) ((i10 >>> 24) & 255);
    }

    public static ByteBuffer t(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("start: ", i10));
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(C1758e.a("end < start: ", i11, " < ", i10));
        }
        int iCapacity = byteBuffer.capacity();
        if (i11 > byteBuffer.capacity()) {
            throw new IllegalArgumentException(C1758e.a("end > capacity: ", i11, " > ", iCapacity));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i11);
            byteBuffer.position(i10);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    public static void u(Map<Integer, byte[]> map, RandomAccessFile randomAccessFile, g gVar) throws SecurityException {
    }
}
