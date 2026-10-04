package com.prism.gaia.helper.utils;

import android.util.Pair;
import androidx.collection.Q;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.H0;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f165053a = 22;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f165054b = 101010256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165055c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f165056d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f165057e = 20;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f165058f = 20;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f165059g = 1347094023;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f165060h = 65535;

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i10 = iCapacity - 22;
        int iMin = Math.min(i10, 65535);
        for (int i11 = 0; i11 < iMin; i11++) {
            int i12 = i10 - i11;
            if (byteBuffer.getInt(i12) == 101010256 && (byteBuffer.getShort(i12 + 20) & H0.f217455d) == i11) {
                return i12;
            }
        }
        return -1;
    }

    public static Pair<ByteBuffer, Long> c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> pairD = d(randomAccessFile, 0);
        return pairD != null ? pairD : d(randomAccessFile, 65535);
    }

    public static Pair<ByteBuffer, Long> d(RandomAccessFile randomAccessFile, int i10) throws IOException {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("maxCommentSize: ", i10));
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, length - 22)) + 22);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        int iB = b(byteBufferAllocate);
        if (iB == -1) {
            return null;
        }
        byteBufferAllocate.position(iB);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(byteOrder);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) iB)));
    }

    public static int e(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getShort(i10) & H0.f217455d;
    }

    public static long f(ByteBuffer byteBuffer, int i10) {
        return ((long) byteBuffer.getInt(i10)) & ZipKt.f225990j;
    }

    public static long g(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & ZipKt.f225990j;
    }

    public static long h(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return ((long) byteBuffer.getInt(byteBuffer.position() + 12)) & ZipKt.f225990j;
    }

    public static final boolean i(RandomAccessFile randomAccessFile, long j10) throws IOException {
        long j11 = j10 - 20;
        if (j11 < 0) {
            return false;
        }
        randomAccessFile.seek(j11);
        return randomAccessFile.readInt() == 1347094023;
    }

    public static void j(ByteBuffer byteBuffer, int i10, long j10) {
        if (j10 < 0 || j10 > ZipKt.f225990j) {
            throw new IllegalArgumentException(Q.a("uint32 value of out range: ", j10));
        }
        byteBuffer.putInt(byteBuffer.position() + i10, (int) j10);
    }

    public static void k(ByteBuffer byteBuffer, long j10) {
        a(byteBuffer);
        j(byteBuffer, byteBuffer.position() + 16, j10);
    }
}
