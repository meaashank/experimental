package com.pgl.ssdk;

import androidx.collection.C1545m0;
import androidx.collection.LruCacheKt;
import androidx.compose.foundation.text.C1758e;
import com.pgl.ssdk.d;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.text.C5017i;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f161859a = C5017i.f218345a.toCharArray();

    public static h a(o oVar, r rVar, int i10) throws i, IOException {
        try {
            d.a aVarA = d.a(oVar, rVar);
            long jB = aVarA.b();
            o oVarA = aVarA.a();
            ByteBuffer byteBufferA = oVarA.a(0L, (int) oVarA.a());
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            return new h(a(byteBufferA, i10), jB, rVar.a(), rVar.e(), rVar.d());
        } catch (C3835b e10) {
            throw new i(e10.getMessage(), e10);
        }
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i10)));
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

    public static byte[] c(ByteBuffer byteBuffer) throws C3834a {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new C3834a("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbA = android.support.v4.media.a.a("Underflow while reading length-prefixed value. Length: ", i10, ", available: ");
        sbA.append(byteBuffer.remaining());
        throw new C3834a(sbA.toString());
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) throws C3834a {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 >= 0) {
                if (i10 <= byteBuffer.remaining()) {
                    return b(byteBuffer, i10);
                }
                StringBuilder sbA = android.support.v4.media.a.a("Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ");
                sbA.append(byteBuffer.remaining());
                throw new C3834a(sbA.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new C3834a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i10) throws i {
        a(byteBuffer);
        ByteBuffer byteBufferA = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i11 = 0;
        while (byteBufferA.hasRemaining()) {
            i11++;
            if (byteBufferA.remaining() >= 8) {
                long j10 = byteBufferA.getLong();
                if (j10 >= 4 && j10 <= LruCacheKt.f86729a) {
                    int i12 = (int) j10;
                    int iPosition = byteBufferA.position() + i12;
                    if (i12 <= byteBufferA.remaining()) {
                        if (byteBufferA.getInt() == i10) {
                            return b(byteBufferA, i12 - 4);
                        }
                        byteBufferA.position(iPosition);
                    } else {
                        StringBuilder sbA = C1545m0.a("APK Signing Block entry #", i11, " size out of range: ", i12, ", available: ");
                        sbA.append(byteBufferA.remaining());
                        throw new i(sbA.toString());
                    }
                } else {
                    throw new i("APK Signing Block entry #" + i11 + " size out of range: " + j10);
                }
            } else {
                throw new i("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i11)));
            }
        }
        throw new i("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i10)));
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("start: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            int iCapacity = byteBuffer.capacity();
            if (i11 <= byteBuffer.capacity()) {
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
            throw new IllegalArgumentException(C1758e.a("end > capacity: ", i11, " > ", iCapacity));
        }
        throw new IllegalArgumentException(C1758e.a("end < start: ", i11, " < ", i10));
    }
}
