package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.H0;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n {
    public static m<ByteBuffer, Long> a(o oVar) throws IOException {
        if (oVar.a() < 22) {
            return null;
        }
        m<ByteBuffer, Long> mVarA = a(oVar, 0);
        return mVarA != null ? mVarA : a(oVar, 65535);
    }

    private static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i10 = iCapacity - 22;
        int iMin = Math.min(i10, 65535);
        for (int i11 = 0; i11 <= iMin; i11++) {
            int i12 = i10 - i11;
            if (byteBuffer.getInt(i12) == 101010256 && a(byteBuffer, i12 + 20) == i11) {
                return i12;
            }
        }
        return -1;
    }

    public static long c(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 16);
    }

    public static long d(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 12);
    }

    public static int e(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 10);
    }

    private static m<ByteBuffer, Long> a(o oVar, int i10) throws IOException {
        if (i10 >= 0 && i10 <= 65535) {
            long jA = oVar.a();
            if (jA < 22) {
                return null;
            }
            int iMin = ((int) Math.min(i10, jA - 22)) + 22;
            long j10 = jA - ((long) iMin);
            ByteBuffer byteBufferA = oVar.a(j10, iMin);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            int iB = b(byteBufferA);
            if (iB == -1) {
                return null;
            }
            byteBufferA.position(iB);
            ByteBuffer byteBufferSlice = byteBufferA.slice();
            byteBufferSlice.order(byteOrder);
            return m.a(byteBufferSlice, Long.valueOf(j10 + ((long) iB)));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i10)));
    }

    public static long b(ByteBuffer byteBuffer, int i10) {
        return ((long) byteBuffer.getInt(i10)) & ZipKt.f225990j;
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int a(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getShort(i10) & H0.f217455d;
    }
}
