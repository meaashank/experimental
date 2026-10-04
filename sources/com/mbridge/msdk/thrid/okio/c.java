package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.collection.LruCacheKt;
import androidx.collection.Q;
import androidx.compose.foundation.text.C1758e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.text.X;
import p0.C5377a;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f159808c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    o f159809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f159810b;

    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f159810b, LruCacheKt.f86729a);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f159810b > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            return c.this.read(bArr, i10, i11);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j10) throws EOFException {
        return new f(c(j10));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() throws EOFException {
        return d(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(Q.a("limit < 0: ", j10));
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jA = a((byte) 10, 0L, j11);
        if (jA != -1) {
            return h(jA);
        }
        if (j11 < size() && f(j11 - 1) == 13 && f(j11) == 10) {
            return h(j11);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + cVar.o().g() + X.f218288F);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j10) throws EOFException {
        if (this.f159810b < j10) {
            throw new EOFException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j10 = this.f159810b;
        if (j10 != cVar.f159810b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        o oVar = this.f159809a;
        o oVar2 = cVar.f159809a;
        int i10 = oVar.f159843b;
        int i11 = oVar2.f159843b;
        while (j11 < this.f159810b) {
            long jMin = Math.min(oVar.f159844c - i10, oVar2.f159844c - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (oVar.f159842a[i10] != oVar2.f159842a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == oVar.f159844c) {
                oVar = oVar.f159847f;
                i10 = oVar.f159843b;
            }
            if (i11 == oVar2.f159844c) {
                oVar2 = oVar2.f159847f;
                i11 = oVar2.f159843b;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() {
        return this.f159810b == 0;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() {
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() {
        return u.a(readShort());
    }

    public String h(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (f(j11) == 13) {
                String strG = g(j11);
                skip(2L);
                return strG;
            }
        }
        String strG2 = g(j10);
        skip(1L);
        return strG2;
    }

    public int hashCode() {
        o oVar = this.f159809a;
        if (oVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = oVar.f159844c;
            for (int i12 = oVar.f159843b; i12 < i11; i12++) {
                i10 = (i10 * 31) + oVar.f159842a[i12];
            }
            oVar = oVar.f159847f;
        } while (oVar != this.f159809a);
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095 A[EDGE_INSN: B:43:0x0095->B:37:0x0095 BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // com.mbridge.msdk.thrid.okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i() {
        /*
            r14 = this;
            long r0 = r14.f159810b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L9c
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            com.mbridge.msdk.thrid.okio.o r6 = r14.f159809a
            byte[] r7 = r6.f159842a
            int r8 = r6.f159843b
            int r9 = r6.f159844c
        L13:
            if (r8 >= r9) goto L81
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L37
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-87)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6c
            r11 = 70
            if (r10 > r11) goto L6c
            int r11 = r10 + (-55)
        L37:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L47
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L47:
            com.mbridge.msdk.thrid.okio.c r0 = new com.mbridge.msdk.thrid.okio.c
            r0.<init>()
            com.mbridge.msdk.thrid.okio.c r0 = r0.a(r4)
            com.mbridge.msdk.thrid.okio.c r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.p()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6c:
            if (r0 == 0) goto L70
            r1 = 1
            goto L81
        L70:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r1 = p0.C5377a.a(r10, r1)
            r0.<init>(r1)
            throw r0
        L81:
            if (r8 != r9) goto L8d
            com.mbridge.msdk.thrid.okio.o r7 = r6.b()
            r14.f159809a = r7
            com.mbridge.msdk.thrid.okio.p.a(r6)
            goto L8f
        L8d:
            r6.f159843b = r8
        L8f:
            if (r1 != 0) goto L95
            com.mbridge.msdk.thrid.okio.o r6 = r14.f159809a
            if (r6 != 0) goto Lb
        L95:
            long r1 = r14.f159810b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f159810b = r1
            return r4
        L9c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.c.i():long");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    public final void k() {
        try {
            skip(this.f159810b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f159810b == 0) {
            return cVar;
        }
        o oVarC = this.f159809a.c();
        cVar.f159809a = oVarC;
        oVarC.f159848g = oVarC;
        oVarC.f159847f = oVarC;
        for (o oVar = this.f159809a.f159847f; oVar != this.f159809a; oVar = oVar.f159847f) {
            cVar.f159809a.f159848g.a(oVar.c());
        }
        cVar.f159810b = this.f159810b;
        return cVar;
    }

    public final long m() {
        long j10 = this.f159810b;
        if (j10 == 0) {
            return 0L;
        }
        o oVar = this.f159809a.f159848g;
        int i10 = oVar.f159844c;
        return (i10 >= 8192 || !oVar.f159846e) ? j10 : j10 - ((long) (i10 - oVar.f159843b));
    }

    public byte[] n() {
        try {
            return c(this.f159810b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public f o() {
        return new f(n());
    }

    public String p() {
        try {
            return a(this.f159810b, u.f159857a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final f q() {
        long j10 = this.f159810b;
        if (j10 <= LruCacheKt.f86729a) {
            return a((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f159810b);
    }

    public int read(byte[] bArr, int i10, int i11) {
        u.a(bArr.length, i10, i11);
        o oVar = this.f159809a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, oVar.f159844c - oVar.f159843b);
        System.arraycopy(oVar.f159842a, oVar.f159843b, bArr, i10, iMin);
        int i12 = oVar.f159843b + iMin;
        oVar.f159843b = i12;
        this.f159810b -= (long) iMin;
        if (i12 == oVar.f159844c) {
            this.f159809a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() {
        long j10 = this.f159810b;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        o oVar = this.f159809a;
        int i10 = oVar.f159843b;
        int i11 = oVar.f159844c;
        int i12 = i10 + 1;
        byte b10 = oVar.f159842a[i10];
        this.f159810b = j10 - 1;
        if (i12 != i11) {
            oVar.f159843b = i12;
            return b10;
        }
        this.f159809a = oVar.b();
        p.a(oVar);
        return b10;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() {
        long j10 = this.f159810b;
        if (j10 < 4) {
            throw new IllegalStateException("size < 4: " + this.f159810b);
        }
        o oVar = this.f159809a;
        int i10 = oVar.f159843b;
        int i11 = oVar.f159844c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = oVar.f159842a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f159810b = j10 - 4;
        if (i14 != i11) {
            oVar.f159843b = i14;
            return i15;
        }
        this.f159809a = oVar.b();
        p.a(oVar);
        return i15;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() {
        long j10 = this.f159810b;
        if (j10 < 2) {
            throw new IllegalStateException("size < 2: " + this.f159810b);
        }
        o oVar = this.f159809a;
        int i10 = oVar.f159843b;
        int i11 = oVar.f159844c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = oVar.f159842a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f159810b = j10 - 2;
        if (i14 == i11) {
            this.f159809a = oVar.b();
            p.a(oVar);
        } else {
            oVar.f159843b = i14;
        }
        return (short) i15;
    }

    public final long size() {
        return this.f159810b;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            if (this.f159809a == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, r0.f159844c - r0.f159843b);
            long j11 = iMin;
            this.f159810b -= j11;
            j10 -= j11;
            o oVar = this.f159809a;
            int i10 = oVar.f159843b + iMin;
            oVar.f159843b = i10;
            if (i10 == oVar.f159844c) {
                this.f159809a = oVar.b();
                p.a(oVar);
            }
        }
    }

    public String toString() {
        return q().toString();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(String str) {
        return a(str, 0, str.length());
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j10) throws EOFException {
        u.a(this.f159810b, 0L, j10);
        if (j10 > LruCacheKt.f86729a) {
            throw new IllegalArgumentException(Q.a("byteCount > Integer.MAX_VALUE: ", j10));
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() {
        return u.a(readInt());
    }

    public final byte f(long j10) {
        u.a(this.f159810b, j10, 1L);
        long j11 = this.f159810b;
        if (j11 - j10 > j10) {
            o oVar = this.f159809a;
            long j12 = j10;
            while (true) {
                int i10 = oVar.f159844c;
                int i11 = oVar.f159843b;
                long j13 = i10 - i11;
                if (j12 < j13) {
                    return oVar.f159842a[i11 + ((int) j12)];
                }
                j12 -= j13;
                oVar = oVar.f159847f;
            }
        } else {
            long j14 = j10 - j11;
            o oVar2 = this.f159809a.f159848g;
            while (true) {
                int i12 = oVar2.f159844c;
                int i13 = oVar2.f159843b;
                j14 += (long) (i12 - i13);
                if (j14 >= 0) {
                    return oVar2.f159842a[i13 + ((int) j14)];
                }
                oVar2 = oVar2.f159848g;
            }
        }
    }

    public String g(long j10) throws EOFException {
        return a(j10, u.f159857a);
    }

    public o b(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            o oVar = this.f159809a;
            if (oVar == null) {
                o oVarA = p.a();
                this.f159809a = oVarA;
                oVarA.f159848g = oVarA;
                oVarA.f159847f = oVarA;
                return oVarA;
            }
            o oVar2 = oVar.f159848g;
            return (oVar2.f159844c + i10 > 8192 || !oVar2.f159846e) ? oVar2.a(p.a()) : oVar2;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c writeShort(int i10) {
        o oVarB = b(2);
        byte[] bArr = oVarB.f159842a;
        int i11 = oVarB.f159844c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        oVarB.f159844c = i11 + 2;
        this.f159810b += 2;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int iRemaining = byteBuffer.remaining();
            int i10 = iRemaining;
            while (i10 > 0) {
                o oVarB = b(1);
                int iMin = Math.min(i10, 8192 - oVarB.f159844c);
                byteBuffer.get(oVarB.f159842a, oVarB.f159844c, iMin);
                i10 -= iMin;
                oVarB.f159844c += iMin;
            }
            this.f159810b += (long) iRemaining;
            return iRemaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final c a(c cVar, long j10, long j11) {
        if (cVar != null) {
            long j12 = j10;
            u.a(this.f159810b, j12, j11);
            if (j11 != 0) {
                cVar.f159810b += j11;
                o oVar = this.f159809a;
                while (true) {
                    long j13 = oVar.f159844c - oVar.f159843b;
                    if (j12 < j13) {
                        break;
                    }
                    j12 -= j13;
                    oVar = oVar.f159847f;
                }
                o oVar2 = oVar;
                long j14 = j11;
                while (j14 > 0) {
                    o oVarC = oVar2.c();
                    int i10 = (int) (((long) oVarC.f159843b) + j12);
                    oVarC.f159843b = i10;
                    oVarC.f159844c = Math.min(i10 + ((int) j14), oVarC.f159844c);
                    o oVar3 = cVar.f159809a;
                    if (oVar3 == null) {
                        oVarC.f159848g = oVarC;
                        oVarC.f159847f = oVarC;
                        cVar.f159809a = oVarC;
                    } else {
                        oVar3.f159848g.a(oVarC);
                    }
                    j14 -= (long) (oVarC.f159844c - oVarC.f159843b);
                    oVar2 = oVar2.f159847f;
                    j12 = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 >= 0) {
            long j11 = this.f159810b;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            cVar.a(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(Q.a("byteCount < 0: ", j10));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.f159809a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), oVar.f159844c - oVar.f159843b);
        byteBuffer.put(oVar.f159842a, oVar.f159843b, iMin);
        int i10 = oVar.f159843b + iMin;
        oVar.f159843b = i10;
        this.f159810b -= (long) iMin;
        if (i10 == oVar.f159844c) {
            this.f159809a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c writeByte(int i10) {
        o oVarB = b(1);
        byte[] bArr = oVarB.f159842a;
        int i11 = oVarB.f159844c;
        oVarB.f159844c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f159810b++;
        return this;
    }

    public c f(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            writeByte((i10 >> 6) | 192);
            writeByte((i10 & 63) | 128);
            return this;
        }
        if (i10 >= 65536) {
            if (i10 <= 1114111) {
                writeByte((i10 >> 18) | 240);
                writeByte(((i10 >> 12) & 63) | 128);
                writeByte(((i10 >> 6) & 63) | 128);
                writeByte((i10 & 63) | 128);
                return this;
            }
            throw new IllegalArgumentException(C5377a.a(i10, new StringBuilder("Unexpected code point: ")));
        }
        if (i10 >= 55296 && i10 <= 57343) {
            writeByte(63);
            return this;
        }
        writeByte((i10 >> 12) | 224);
        writeByte(((i10 >> 6) & 63) | 128);
        writeByte((i10 & 63) | 128);
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String a(Charset charset) {
        try {
            return a(this.f159810b, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c writeInt(int i10) {
        o oVarB = b(4);
        byte[] bArr = oVarB.f159842a;
        int i11 = oVarB.f159844c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        oVarB.f159844c = i11 + 4;
        this.f159810b += 4;
        return this;
    }

    public String a(long j10, Charset charset) throws EOFException {
        u.a(this.f159810b, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > LruCacheKt.f86729a) {
            throw new IllegalArgumentException(Q.a("byteCount > Integer.MAX_VALUE: ", j10));
        }
        if (j10 == 0) {
            return "";
        }
        o oVar = this.f159809a;
        int i10 = oVar.f159843b;
        if (((long) i10) + j10 > oVar.f159844c) {
            return new String(c(j10), charset);
        }
        String str = new String(oVar.f159842a, i10, (int) j10, charset);
        int i11 = (int) (((long) oVar.f159843b) + j10);
        oVar.f159843b = i11;
        this.f159810b -= j10;
        if (i11 == oVar.f159844c) {
            this.f159809a = oVar.b();
            p.a(oVar);
        }
        return str;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return t.f159853d;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c a(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        o oVarB = b(iNumberOfTrailingZeros);
        byte[] bArr = oVarB.f159842a;
        int i10 = oVarB.f159844c;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f159808c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        oVarB.f159844c += iNumberOfTrailingZeros;
        this.f159810b += (long) iNumberOfTrailingZeros;
        return this;
    }

    public c a(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public c a(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("beginIndex < 0: ", i10));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbA = android.support.v4.media.a.a("endIndex > string.length: ", i11, " > ");
                sbA.append(str.length());
                throw new IllegalArgumentException(sbA.toString());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    o oVarB = b(1);
                    byte[] bArr = oVarB.f159842a;
                    int i12 = oVarB.f159844c - i10;
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
                    int i14 = oVarB.f159844c;
                    int i15 = (i12 + i10) - i14;
                    oVarB.f159844c = i14 + i15;
                    this.f159810b += (long) i15;
                } else {
                    if (cCharAt2 < 2048) {
                        writeByte((cCharAt2 >> 6) | 192);
                        writeByte((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            writeByte((i17 >> 18) | 240);
                            writeByte(((i17 >> 12) & 63) | 128);
                            writeByte(((i17 >> 6) & 63) | 128);
                            writeByte((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            writeByte(63);
                            i10 = i16;
                        }
                    } else {
                        writeByte((cCharAt2 >> '\f') | 224);
                        writeByte(((cCharAt2 >> 6) & 63) | 128);
                        writeByte((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(C1758e.a("endIndex < beginIndex: ", i11, " < ", i10));
    }

    public c a(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError(android.support.v4.media.c.a("beginIndex < 0: ", i10));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbA = android.support.v4.media.a.a("endIndex > string.length: ", i11, " > ");
                sbA.append(str.length());
                throw new IllegalArgumentException(sbA.toString());
            }
            if (charset != null) {
                if (charset.equals(u.f159857a)) {
                    return a(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return write(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(C1758e.a("endIndex < beginIndex: ", i11, " < ", i10));
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            u.a(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                o oVarB = b(1);
                int iMin = Math.min(i12 - i10, 8192 - oVarB.f159844c);
                System.arraycopy(bArr, i10, oVarB.f159842a, oVarB.f159844c, iMin);
                i10 += iMin;
                oVarB.f159844c += iMin;
            }
            this.f159810b += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long a(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long jB = sVar.b(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jB == -1) {
                return j10;
            }
            j10 += jB;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar != this) {
            u.a(cVar.f159810b, 0L, j10);
            while (j10 > 0) {
                o oVar = cVar.f159809a;
                if (j10 < oVar.f159844c - oVar.f159843b) {
                    o oVar2 = this.f159809a;
                    o oVar3 = oVar2 != null ? oVar2.f159848g : null;
                    if (oVar3 != null && oVar3.f159846e) {
                        if ((((long) oVar3.f159844c) + j10) - ((long) (oVar3.f159845d ? 0 : oVar3.f159843b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            oVar.a(oVar3, (int) j10);
                            cVar.f159810b -= j10;
                            this.f159810b += j10;
                            return;
                        }
                    }
                    cVar.f159809a = oVar.a((int) j10);
                }
                o oVar4 = cVar.f159809a;
                long j11 = oVar4.f159844c - oVar4.f159843b;
                cVar.f159809a = oVar4.b();
                o oVar5 = this.f159809a;
                if (oVar5 == null) {
                    this.f159809a = oVar4;
                    oVar4.f159848g = oVar4;
                    oVar4.f159847f = oVar4;
                } else {
                    oVar5.f159848g.a(oVar4).a();
                }
                cVar.f159810b -= j11;
                this.f159810b += j11;
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b10) {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    public long a(byte b10, long j10, long j11) {
        o oVar;
        long j12 = 0;
        if (j10 >= 0 && j11 >= j10) {
            long j13 = this.f159810b;
            long j14 = j11 > j13 ? j13 : j11;
            if (j10 == j14 || (oVar = this.f159809a) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    oVar = oVar.f159848g;
                    j13 -= (long) (oVar.f159844c - oVar.f159843b);
                }
            } else {
                while (true) {
                    long j15 = ((long) (oVar.f159844c - oVar.f159843b)) + j12;
                    if (j15 >= j10) {
                        break;
                    }
                    oVar = oVar.f159847f;
                    j12 = j15;
                }
                j13 = j12;
            }
            long j16 = j10;
            while (j13 < j14) {
                byte[] bArr = oVar.f159842a;
                int iMin = (int) Math.min(oVar.f159844c, (((long) oVar.f159843b) + j14) - j13);
                for (int i10 = (int) ((((long) oVar.f159843b) + j16) - j13); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return ((long) (i10 - oVar.f159843b)) + j13;
                    }
                }
                j13 += (long) (oVar.f159844c - oVar.f159843b);
                oVar = oVar.f159847f;
                j16 = j13;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f159810b), Long.valueOf(j10), Long.valueOf(j11)));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean a(long j10, f fVar) {
        return a(j10, fVar, 0, fVar.j());
    }

    public boolean a(long j10, f fVar, int i10, int i11) {
        if (j10 < 0 || i10 < 0 || i11 < 0 || this.f159810b - j10 < i11 || fVar.j() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (f(((long) i12) + j10) != fVar.a(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public final f a(int i10) {
        if (i10 == 0) {
            return f.f159813e;
        }
        return new q(this, i10);
    }
}
