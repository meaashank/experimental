package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedOutputStream extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f112530c = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f112531d = a1.S();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f112532e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f112533f = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2553v f112534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f112535b;

    public static class OutOfSpaceException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f112536a = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(f112536a);
        }

        public OutOfSpaceException(String str) {
            super(w.y.a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException(Throwable th) {
            super(f112536a, th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super(w.y.a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    public static abstract class b extends CodedOutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f112537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f112538h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f112539i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f112540j;

        public b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f112537g = bArr;
            this.f112538h = bArr.length;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int f1() {
            return this.f112540j;
        }

        public final void j2(byte b10) {
            byte[] bArr = this.f112537g;
            int i10 = this.f112539i;
            this.f112539i = i10 + 1;
            bArr[i10] = b10;
            this.f112540j++;
        }

        public final void k2(int i10) {
            byte[] bArr = this.f112537g;
            int i11 = this.f112539i;
            int i12 = i11 + 1;
            this.f112539i = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f112539i = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f112539i = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f112539i = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f112540j += 4;
        }

        public final void l2(long j10) {
            byte[] bArr = this.f112537g;
            int i10 = this.f112539i;
            int i11 = i10 + 1;
            this.f112539i = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f112539i = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f112539i = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f112539i = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f112539i = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f112539i = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f112539i = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f112539i = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f112540j += 8;
        }

        public final void m2(int i10) {
            if (i10 >= 0) {
                o2(i10);
            } else {
                p2(i10);
            }
        }

        public final void n2(int i10, int i11) {
            o2((i10 << 3) | i11);
        }

        public final void o2(int i10) {
            if (!CodedOutputStream.f112531d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f112537g;
                    int i11 = this.f112539i;
                    this.f112539i = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f112540j++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f112537g;
                int i12 = this.f112539i;
                this.f112539i = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f112540j++;
                return;
            }
            long j10 = this.f112539i;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f112537g;
                int i13 = this.f112539i;
                this.f112539i = i13 + 1;
                a1.d0(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f112537g;
            int i14 = this.f112539i;
            this.f112539i = i14 + 1;
            a1.d0(bArr4, i14, (byte) i10);
            this.f112540j += (int) (((long) this.f112539i) - j10);
        }

        public final void p2(long j10) {
            if (!CodedOutputStream.f112531d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f112537g;
                    int i10 = this.f112539i;
                    this.f112539i = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f112540j++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f112537g;
                int i11 = this.f112539i;
                this.f112539i = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f112540j++;
                return;
            }
            long j11 = this.f112539i;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f112537g;
                int i12 = this.f112539i;
                this.f112539i = i12 + 1;
                a1.d0(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f112537g;
            int i13 = this.f112539i;
            this.f112539i = i13 + 1;
            a1.d0(bArr4, i13, (byte) j10);
            this.f112540j += (int) (((long) this.f112539i) - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int r1() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class c extends CodedOutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f112541g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f112542h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f112543i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f112544j;

        public c(byte[] bArr, int i10, int i11) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f112541g = bArr;
            this.f112542h = i10;
            this.f112544j = i10;
            this.f112543i = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C1(int i10) throws IOException {
            try {
                byte[] bArr = this.f112541g;
                int i11 = this.f112544j;
                int i12 = i11 + 1;
                this.f112544j = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f112544j = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f112544j = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f112544j = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f112544j), Integer.valueOf(this.f112543i), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D1(long j10) throws IOException {
            try {
                byte[] bArr = this.f112541g;
                int i10 = this.f112544j;
                int i11 = i10 + 1;
                this.f112544j = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f112544j = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f112544j = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f112544j = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f112544j = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f112544j = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f112544j = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f112544j = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f112544j), Integer.valueOf(this.f112543i), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J1(int i10) throws IOException {
            if (i10 >= 0) {
                h2(i10);
            } else {
                i2(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L1(int i10, MessageLite messageLite) throws IOException {
            g2(i10, 2);
            N1(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M1(int i10, MessageLite messageLite, G0 g02) throws IOException {
            g2(i10, 2);
            h2(((AbstractMessageLite) messageLite).p(g02));
            g02.c(messageLite, this.f112534a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void N1(MessageLite messageLite) throws IOException {
            h2(messageLite.g());
            messageLite.c(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void O1(MessageLite messageLite, G0 g02) throws IOException {
            h2(((AbstractMessageLite) messageLite).p(g02));
            g02.c(messageLite, this.f112534a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void P1(int i10, MessageLite messageLite) throws IOException {
            g2(1, 3);
            o(2, i10);
            L1(3, messageLite);
            g2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public final void T(byte b10) throws IOException {
            try {
                byte[] bArr = this.f112541g;
                int i10 = this.f112544j;
                this.f112544j = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f112544j), Integer.valueOf(this.f112543i), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            U(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public final void U(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f112541g, this.f112544j, iRemaining);
                this.f112544j += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f112544j), Integer.valueOf(this.f112543i), Integer.valueOf(iRemaining)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public final void V(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f112541g, this.f112544j, i11);
                this.f112544j += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f112544j), Integer.valueOf(this.f112543i), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public final void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public final void X(byte[] bArr, int i10, int i11) throws IOException {
            V(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Y1(int i10, ByteString byteString) throws IOException {
            g2(1, 3);
            o(2, i10);
            i(3, byteString);
            g2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i10, int i11) throws IOException {
            g2(i10, 5);
            C1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void e(int i10, String str) throws IOException {
            g2(i10, 2);
            f2(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e1() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void f(int i10, long j10) throws IOException {
            g2(i10, 0);
            i2(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int f1() {
            return this.f112544j - this.f112542h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void f2(String str) throws IOException {
            int i10 = this.f112544j;
            try {
                int iZ0 = CodedOutputStream.Z0(str.length() * 3);
                int iZ02 = CodedOutputStream.Z0(str.length());
                if (iZ02 != iZ0) {
                    h2(Utf8.k(str));
                    this.f112544j = Utf8.f112713a.e(str, this.f112541g, this.f112544j, r1());
                    return;
                }
                int i11 = i10 + iZ02;
                this.f112544j = i11;
                int i12 = Utf8.i(str, this.f112541g, i11, r1());
                this.f112544j = i10;
                h2((i12 - i10) - iZ02);
                this.f112544j = i12;
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f112544j = i10;
                g1(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void g2(int i10, int i11) throws IOException {
            h2((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void h(int i10, int i11) throws IOException {
            g2(i10, 0);
            J1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void h2(int i10) throws IOException {
            if (!CodedOutputStream.f112531d || C2518d.c() || r1() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f112541g;
                        int i11 = this.f112544j;
                        this.f112544j = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f112544j), Integer.valueOf(this.f112543i), 1), e10);
                    }
                }
                byte[] bArr2 = this.f112541g;
                int i12 = this.f112544j;
                this.f112544j = i12 + 1;
                bArr2[i12] = (byte) i10;
                return;
            }
            if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f112541g;
                int i13 = this.f112544j;
                this.f112544j = i13 + 1;
                a1.d0(bArr3, i13, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f112541g;
            int i14 = this.f112544j;
            this.f112544j = i14 + 1;
            a1.d0(bArr4, i14, (byte) (i10 | 128));
            int i15 = i10 >>> 7;
            if ((i15 & (-128)) == 0) {
                byte[] bArr5 = this.f112541g;
                int i16 = this.f112544j;
                this.f112544j = i16 + 1;
                a1.d0(bArr5, i16, (byte) i15);
                return;
            }
            byte[] bArr6 = this.f112541g;
            int i17 = this.f112544j;
            this.f112544j = i17 + 1;
            a1.d0(bArr6, i17, (byte) (i15 | 128));
            int i18 = i10 >>> 14;
            if ((i18 & (-128)) == 0) {
                byte[] bArr7 = this.f112541g;
                int i19 = this.f112544j;
                this.f112544j = i19 + 1;
                a1.d0(bArr7, i19, (byte) i18);
                return;
            }
            byte[] bArr8 = this.f112541g;
            int i20 = this.f112544j;
            this.f112544j = i20 + 1;
            a1.d0(bArr8, i20, (byte) (i18 | 128));
            int i21 = i10 >>> 21;
            if ((i21 & (-128)) == 0) {
                byte[] bArr9 = this.f112541g;
                int i22 = this.f112544j;
                this.f112544j = i22 + 1;
                a1.d0(bArr9, i22, (byte) i21);
                return;
            }
            byte[] bArr10 = this.f112541g;
            int i23 = this.f112544j;
            this.f112544j = i23 + 1;
            a1.d0(bArr10, i23, (byte) (i21 | 128));
            byte[] bArr11 = this.f112541g;
            int i24 = this.f112544j;
            this.f112544j = i24 + 1;
            a1.d0(bArr11, i24, (byte) (i10 >>> 28));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i(int i10, ByteString byteString) throws IOException {
            g2(i10, 2);
            z1(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i2(long j10) throws IOException {
            if (CodedOutputStream.f112531d && r1() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f112541g;
                    int i10 = this.f112544j;
                    this.f112544j = i10 + 1;
                    a1.d0(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f112541g;
                int i11 = this.f112544j;
                this.f112544j = i11 + 1;
                a1.d0(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f112541g;
                    int i12 = this.f112544j;
                    this.f112544j = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f112544j), Integer.valueOf(this.f112543i), 1), e10);
                }
            }
            byte[] bArr4 = this.f112541g;
            int i13 = this.f112544j;
            this.f112544j = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o(int i10, int i11) throws IOException {
            g2(i10, 0);
            h2(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void q(int i10, long j10) throws IOException {
            g2(i10, 1);
            D1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int r1() {
            return this.f112543i - this.f112544j;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s(int i10, boolean z10) throws IOException {
            g2(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u1(int i10, byte[] bArr) throws IOException {
            v1(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v1(int i10, byte[] bArr, int i11, int i12) throws IOException {
            g2(i10, 2);
            x1(bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x1(byte[] bArr, int i10, int i11) throws IOException {
            h2(i11);
            V(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y1(int i10, ByteBuffer byteBuffer) throws IOException {
            g2(i10, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z1(ByteString byteString) throws IOException {
            h2(byteString.size());
            byteString.j0(this);
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final r f112545k;

        public d(r rVar, int i10) {
            super(i10);
            if (rVar == null) {
                throw new NullPointerException("out");
            }
            this.f112545k = rVar;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void C1(int i10) throws IOException {
            r2(4);
            k2(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void D1(long j10) throws IOException {
            r2(8);
            l2(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void J1(int i10) throws IOException {
            if (i10 >= 0) {
                h2(i10);
            } else {
                i2(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L1(int i10, MessageLite messageLite) throws IOException {
            g2(i10, 2);
            N1(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M1(int i10, MessageLite messageLite, G0 g02) throws IOException {
            g2(i10, 2);
            O1(messageLite, g02);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void N1(MessageLite messageLite) throws IOException {
            h2(messageLite.g());
            messageLite.c(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void O1(MessageLite messageLite, G0 g02) throws IOException {
            h2(((AbstractMessageLite) messageLite).p(g02));
            g02.c(messageLite, this.f112534a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P1(int i10, MessageLite messageLite) throws IOException {
            g2(1, 3);
            o(2, i10);
            L1(3, messageLite);
            g2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void T(byte b10) throws IOException {
            if (this.f112539i == this.f112538h) {
                q2();
            }
            j2(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            U(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void U(ByteBuffer byteBuffer) throws IOException {
            e1();
            int iRemaining = byteBuffer.remaining();
            this.f112545k.U(byteBuffer);
            this.f112540j += iRemaining;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void V(byte[] bArr, int i10, int i11) throws IOException {
            e1();
            this.f112545k.V(bArr, i10, i11);
            this.f112540j += i11;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void W(ByteBuffer byteBuffer) throws IOException {
            e1();
            int iRemaining = byteBuffer.remaining();
            this.f112545k.W(byteBuffer);
            this.f112540j += iRemaining;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void X(byte[] bArr, int i10, int i11) throws IOException {
            e1();
            this.f112545k.X(bArr, i10, i11);
            this.f112540j += i11;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y1(int i10, ByteString byteString) throws IOException {
            g2(1, 3);
            o(2, i10);
            i(3, byteString);
            g2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c(int i10, int i11) throws IOException {
            r2(14);
            n2(i10, 5);
            k2(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e(int i10, String str) throws IOException {
            g2(i10, 2);
            f2(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e1() throws IOException {
            if (this.f112539i > 0) {
                q2();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f(int i10, long j10) throws IOException {
            r2(20);
            n2(i10, 0);
            p2(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int length = str.length() * 3;
            int iZ0 = CodedOutputStream.Z0(length);
            int i10 = iZ0 + length;
            int i11 = this.f112538h;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int i12 = Utf8.i(str, bArr, 0, length);
                h2(i12);
                X(bArr, 0, i12);
                return;
            }
            if (i10 > i11 - this.f112539i) {
                q2();
            }
            int i13 = this.f112539i;
            try {
                int iZ02 = CodedOutputStream.Z0(str.length());
                if (iZ02 != iZ0) {
                    int iK = Utf8.k(str);
                    o2(iK);
                    this.f112539i = Utf8.f112713a.e(str, this.f112537g, this.f112539i, iK);
                    this.f112540j += iK;
                    return;
                }
                int i14 = i13 + iZ02;
                this.f112539i = i14;
                int i15 = Utf8.i(str, this.f112537g, i14, this.f112538h - i14);
                this.f112539i = i13;
                int i16 = (i15 - i13) - iZ02;
                o2(i16);
                this.f112539i = i15;
                this.f112540j += i16;
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f112540j -= this.f112539i - i13;
                this.f112539i = i13;
                g1(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g2(int i10, int i11) throws IOException {
            h2((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h(int i10, int i11) throws IOException {
            r2(20);
            n2(i10, 0);
            m2(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h2(int i10) throws IOException {
            r2(5);
            o2(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i(int i10, ByteString byteString) throws IOException {
            g2(i10, 2);
            z1(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i2(long j10) throws IOException {
            r2(10);
            p2(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o(int i10, int i11) throws IOException {
            r2(20);
            n2(i10, 0);
            o2(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void q(int i10, long j10) throws IOException {
            r2(18);
            n2(i10, 1);
            l2(j10);
        }

        public final void q2() throws IOException {
            this.f112545k.V(this.f112537g, 0, this.f112539i);
            this.f112539i = 0;
        }

        public final void r2(int i10) throws IOException {
            if (this.f112538h - this.f112539i < i10) {
                q2();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void s(int i10, boolean z10) throws IOException {
            r2(11);
            n2(i10, 0);
            j2(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u1(int i10, byte[] bArr) throws IOException {
            v1(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v1(int i10, byte[] bArr, int i11, int i12) throws IOException {
            g2(i10, 2);
            x1(bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i10, int i11) throws IOException {
            h2(i11);
            V(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void y1(int i10, ByteBuffer byteBuffer) throws IOException {
            g2(i10, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void z1(ByteString byteString) throws IOException {
            h2(byteString.size());
            byteString.j0(this);
        }
    }

    public static final class e extends c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ByteBuffer f112546k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f112547l;

        public e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.f112546k = byteBuffer;
            this.f112547l = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.c, androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f112546k.position(f1() + this.f112547l);
        }
    }

    public static final class f extends b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final OutputStream f112548k;

        public f(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f112548k = outputStream;
        }

        private void q2() throws IOException {
            this.f112548k.write(this.f112537g, 0, this.f112539i);
            this.f112539i = 0;
        }

        private void r2(int i10) throws IOException {
            if (this.f112538h - this.f112539i < i10) {
                q2();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void C1(int i10) throws IOException {
            r2(4);
            k2(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void D1(long j10) throws IOException {
            r2(8);
            l2(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void J1(int i10) throws IOException {
            if (i10 >= 0) {
                h2(i10);
            } else {
                i2(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L1(int i10, MessageLite messageLite) throws IOException {
            g2(i10, 2);
            N1(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M1(int i10, MessageLite messageLite, G0 g02) throws IOException {
            g2(i10, 2);
            O1(messageLite, g02);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void N1(MessageLite messageLite) throws IOException {
            h2(messageLite.g());
            messageLite.c(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void O1(MessageLite messageLite, G0 g02) throws IOException {
            h2(((AbstractMessageLite) messageLite).p(g02));
            g02.c(messageLite, this.f112534a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P1(int i10, MessageLite messageLite) throws IOException {
            g2(1, 3);
            o(2, i10);
            L1(3, messageLite);
            g2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void T(byte b10) throws IOException {
            if (this.f112539i == this.f112538h) {
                q2();
            }
            j2(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            U(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void U(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.f112538h;
            int i11 = this.f112539i;
            if (i10 - i11 >= iRemaining) {
                byteBuffer.get(this.f112537g, i11, iRemaining);
                this.f112539i += iRemaining;
                this.f112540j += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.f112537g, i11, i12);
            int i13 = iRemaining - i12;
            this.f112539i = this.f112538h;
            this.f112540j += i12;
            q2();
            while (true) {
                int i14 = this.f112538h;
                if (i13 <= i14) {
                    byteBuffer.get(this.f112537g, 0, i13);
                    this.f112539i = i13;
                    this.f112540j += i13;
                    return;
                } else {
                    byteBuffer.get(this.f112537g, 0, i14);
                    this.f112548k.write(this.f112537g, 0, this.f112538h);
                    int i15 = this.f112538h;
                    i13 -= i15;
                    this.f112540j += i15;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void V(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f112538h;
            int i13 = this.f112539i;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f112537g, i13, i11);
                this.f112539i += i11;
                this.f112540j += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f112537g, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f112539i = this.f112538h;
            this.f112540j += i14;
            q2();
            if (i16 <= this.f112538h) {
                System.arraycopy(bArr, i15, this.f112537g, 0, i16);
                this.f112539i = i16;
            } else {
                this.f112548k.write(bArr, i15, i16);
            }
            this.f112540j += i16;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void X(byte[] bArr, int i10, int i11) throws IOException {
            V(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y1(int i10, ByteString byteString) throws IOException {
            g2(1, 3);
            o(2, i10);
            i(3, byteString);
            g2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c(int i10, int i11) throws IOException {
            r2(14);
            n2(i10, 5);
            k2(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e(int i10, String str) throws IOException {
            g2(i10, 2);
            f2(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e1() throws IOException {
            if (this.f112539i > 0) {
                q2();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f(int i10, long j10) throws IOException {
            r2(20);
            n2(i10, 0);
            p2(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int iK;
            try {
                int length = str.length() * 3;
                int iZ0 = CodedOutputStream.Z0(length);
                int i10 = iZ0 + length;
                int i11 = this.f112538h;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = Utf8.i(str, bArr, 0, length);
                    h2(i12);
                    V(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f112539i) {
                    q2();
                }
                int iZ02 = CodedOutputStream.Z0(str.length());
                int i13 = this.f112539i;
                try {
                    if (iZ02 == iZ0) {
                        int i14 = i13 + iZ02;
                        this.f112539i = i14;
                        int i15 = Utf8.i(str, this.f112537g, i14, this.f112538h - i14);
                        this.f112539i = i13;
                        iK = (i15 - i13) - iZ02;
                        o2(iK);
                        this.f112539i = i15;
                    } else {
                        iK = Utf8.k(str);
                        o2(iK);
                        this.f112539i = Utf8.f112713a.e(str, this.f112537g, this.f112539i, iK);
                    }
                    this.f112540j += iK;
                } catch (Utf8.UnpairedSurrogateException e10) {
                    this.f112540j -= this.f112539i - i13;
                    this.f112539i = i13;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (Utf8.UnpairedSurrogateException e12) {
                g1(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g2(int i10, int i11) throws IOException {
            h2((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h(int i10, int i11) throws IOException {
            r2(20);
            n2(i10, 0);
            m2(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h2(int i10) throws IOException {
            r2(5);
            o2(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i(int i10, ByteString byteString) throws IOException {
            g2(i10, 2);
            z1(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i2(long j10) throws IOException {
            r2(10);
            p2(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o(int i10, int i11) throws IOException {
            r2(20);
            n2(i10, 0);
            o2(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void q(int i10, long j10) throws IOException {
            r2(18);
            n2(i10, 1);
            l2(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void s(int i10, boolean z10) throws IOException {
            r2(11);
            n2(i10, 0);
            j2(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u1(int i10, byte[] bArr) throws IOException {
            v1(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v1(int i10, byte[] bArr, int i11, int i12) throws IOException {
            g2(i10, 2);
            x1(bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i10, int i11) throws IOException {
            h2(i11);
            V(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void y1(int i10, ByteBuffer byteBuffer) throws IOException {
            g2(i10, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void z1(ByteString byteString) throws IOException {
            h2(byteString.size());
            byteString.j0(this);
        }
    }

    public static final class g extends CodedOutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ByteBuffer f112549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ByteBuffer f112550h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f112551i;

        public g(ByteBuffer byteBuffer) {
            this.f112549g = byteBuffer;
            this.f112550h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f112551i = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void C1(int i10) throws IOException {
            try {
                this.f112550h.putInt(i10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void D1(long j10) throws IOException {
            try {
                this.f112550h.putLong(j10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void J1(int i10) throws IOException {
            if (i10 >= 0) {
                h2(i10);
            } else {
                i2(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L1(int i10, MessageLite messageLite) throws IOException {
            g2(i10, 2);
            N1(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M1(int i10, MessageLite messageLite, G0 g02) throws IOException {
            g2(i10, 2);
            O1(messageLite, g02);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void N1(MessageLite messageLite) throws IOException {
            h2(messageLite.g());
            messageLite.c(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void O1(MessageLite messageLite, G0 g02) throws IOException {
            h2(((AbstractMessageLite) messageLite).p(g02));
            g02.c(messageLite, this.f112534a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P1(int i10, MessageLite messageLite) throws IOException {
            g2(1, 3);
            o(2, i10);
            L1(3, messageLite);
            g2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void T(byte b10) throws IOException {
            try {
                this.f112550h.put(b10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            U(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void U(ByteBuffer byteBuffer) throws IOException {
            try {
                this.f112550h.put(byteBuffer);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void V(byte[] bArr, int i10, int i11) throws IOException {
            try {
                this.f112550h.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void X(byte[] bArr, int i10, int i11) throws IOException {
            V(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y1(int i10, ByteString byteString) throws IOException {
            g2(1, 3);
            o(2, i10);
            i(3, byteString);
            g2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c(int i10, int i11) throws IOException {
            g2(i10, 5);
            C1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e(int i10, String str) throws IOException {
            g2(i10, 2);
            f2(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f112549g.position(this.f112550h.position());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f(int i10, long j10) throws IOException {
            g2(i10, 0);
            i2(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int f1() {
            return this.f112550h.position() - this.f112551i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int iPosition = this.f112550h.position();
            try {
                int iZ0 = CodedOutputStream.Z0(str.length() * 3);
                int iZ02 = CodedOutputStream.Z0(str.length());
                if (iZ02 != iZ0) {
                    h2(Utf8.k(str));
                    j2(str);
                    return;
                }
                int iPosition2 = this.f112550h.position() + iZ02;
                this.f112550h.position(iPosition2);
                j2(str);
                int iPosition3 = this.f112550h.position();
                this.f112550h.position(iPosition);
                h2(iPosition3 - iPosition2);
                this.f112550h.position(iPosition3);
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f112550h.position(iPosition);
                g1(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g2(int i10, int i11) throws IOException {
            h2((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h(int i10, int i11) throws IOException {
            g2(i10, 0);
            J1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h2(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    this.f112550h.put((byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new OutOfSpaceException(e10);
                }
            }
            this.f112550h.put((byte) i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i(int i10, ByteString byteString) throws IOException {
            g2(i10, 2);
            z1(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i2(long j10) throws IOException {
            while (((-128) & j10) != 0) {
                try {
                    this.f112550h.put((byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new OutOfSpaceException(e10);
                }
            }
            this.f112550h.put((byte) j10);
        }

        public final void j2(String str) throws IOException {
            try {
                Utf8.j(str, this.f112550h);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o(int i10, int i11) throws IOException {
            g2(i10, 0);
            h2(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void q(int i10, long j10) throws IOException {
            g2(i10, 1);
            D1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int r1() {
            return this.f112550h.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void s(int i10, boolean z10) throws IOException {
            g2(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u1(int i10, byte[] bArr) throws IOException {
            v1(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v1(int i10, byte[] bArr, int i11, int i12) throws IOException {
            g2(i10, 2);
            x1(bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i10, int i11) throws IOException {
            h2(i11);
            V(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void y1(int i10, ByteBuffer byteBuffer) throws IOException {
            g2(i10, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void z1(ByteString byteString) throws IOException {
            h2(byteString.size());
            byteString.j0(this);
        }
    }

    public static final class h extends CodedOutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ByteBuffer f112552g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ByteBuffer f112553h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f112554i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f112555j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f112556k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f112557l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f112558m;

        public h(ByteBuffer byteBuffer) {
            this.f112552g = byteBuffer;
            this.f112553h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jI = a1.i(byteBuffer);
            this.f112554i = jI;
            long jPosition = ((long) byteBuffer.position()) + jI;
            this.f112555j = jPosition;
            long jLimit = jI + ((long) byteBuffer.limit());
            this.f112556k = jLimit;
            this.f112557l = jLimit - 10;
            this.f112558m = jPosition;
        }

        public static boolean k2() {
            return a1.T();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void C1(int i10) throws IOException {
            this.f112553h.putInt((int) (this.f112558m - this.f112554i), i10);
            this.f112558m += 4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void D1(long j10) throws IOException {
            this.f112553h.putLong((int) (this.f112558m - this.f112554i), j10);
            this.f112558m += 8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void J1(int i10) throws IOException {
            if (i10 >= 0) {
                h2(i10);
            } else {
                i2(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L1(int i10, MessageLite messageLite) throws IOException {
            g2(i10, 2);
            N1(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M1(int i10, MessageLite messageLite, G0 g02) throws IOException {
            g2(i10, 2);
            O1(messageLite, g02);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void N1(MessageLite messageLite) throws IOException {
            h2(messageLite.g());
            messageLite.c(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void O1(MessageLite messageLite, G0 g02) throws IOException {
            h2(((AbstractMessageLite) messageLite).p(g02));
            g02.c(messageLite, this.f112534a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P1(int i10, MessageLite messageLite) throws IOException {
            g2(1, 3);
            o(2, i10);
            L1(3, messageLite);
            g2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void T(byte b10) throws IOException {
            long j10 = this.f112558m;
            if (j10 >= this.f112556k) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f112558m), Long.valueOf(this.f112556k), 1));
            }
            this.f112558m = 1 + j10;
            a1.b0(j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            U(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void U(ByteBuffer byteBuffer) throws IOException {
            try {
                int iRemaining = byteBuffer.remaining();
                l2(this.f112558m);
                this.f112553h.put(byteBuffer);
                this.f112558m += (long) iRemaining;
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void V(byte[] bArr, int i10, int i11) throws IOException {
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j10 = i11;
                long j11 = this.f112556k - j10;
                long j12 = this.f112558m;
                if (j11 >= j12) {
                    a1.o(bArr, i10, j12, j10);
                    this.f112558m += j10;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f112558m), Long.valueOf(this.f112556k), Integer.valueOf(i11)));
            }
            throw new NullPointerException("value");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.r
        public void X(byte[] bArr, int i10, int i11) throws IOException {
            V(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y1(int i10, ByteString byteString) throws IOException {
            g2(1, 3);
            o(2, i10);
            i(3, byteString);
            g2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c(int i10, int i11) throws IOException {
            g2(i10, 5);
            C1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e(int i10, String str) throws IOException {
            g2(i10, 2);
            f2(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f112552g.position((int) (this.f112558m - this.f112554i));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f(int i10, long j10) throws IOException {
            g2(i10, 0);
            i2(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int f1() {
            return (int) (this.f112558m - this.f112555j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            long j10 = this.f112558m;
            try {
                int iZ0 = CodedOutputStream.Z0(str.length() * 3);
                int iZ02 = CodedOutputStream.Z0(str.length());
                if (iZ02 != iZ0) {
                    int iK = Utf8.k(str);
                    h2(iK);
                    l2(this.f112558m);
                    Utf8.j(str, this.f112553h);
                    this.f112558m += (long) iK;
                    return;
                }
                int i10 = ((int) (this.f112558m - this.f112554i)) + iZ02;
                this.f112553h.position(i10);
                Utf8.j(str, this.f112553h);
                int iPosition = this.f112553h.position() - i10;
                h2(iPosition);
                this.f112558m += (long) iPosition;
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f112558m = j10;
                l2(j10);
                g1(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g2(int i10, int i11) throws IOException {
            h2((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h(int i10, int i11) throws IOException {
            g2(i10, 0);
            J1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h2(int i10) throws IOException {
            if (this.f112558m <= this.f112557l) {
                while ((i10 & (-128)) != 0) {
                    long j10 = this.f112558m;
                    this.f112558m = j10 + 1;
                    a1.b0(j10, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                long j11 = this.f112558m;
                this.f112558m = 1 + j11;
                a1.b0(j11, (byte) i10);
                return;
            }
            while (true) {
                long j12 = this.f112558m;
                if (j12 >= this.f112556k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f112558m), Long.valueOf(this.f112556k), 1));
                }
                if ((i10 & (-128)) == 0) {
                    this.f112558m = 1 + j12;
                    a1.b0(j12, (byte) i10);
                    return;
                } else {
                    this.f112558m = j12 + 1;
                    a1.b0(j12, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i(int i10, ByteString byteString) throws IOException {
            g2(i10, 2);
            z1(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i2(long j10) throws IOException {
            if (this.f112558m <= this.f112557l) {
                while ((j10 & (-128)) != 0) {
                    long j11 = this.f112558m;
                    this.f112558m = j11 + 1;
                    a1.b0(j11, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                long j12 = this.f112558m;
                this.f112558m = 1 + j12;
                a1.b0(j12, (byte) j10);
                return;
            }
            while (true) {
                long j13 = this.f112558m;
                if (j13 >= this.f112556k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f112558m), Long.valueOf(this.f112556k), 1));
                }
                if ((j10 & (-128)) == 0) {
                    this.f112558m = 1 + j13;
                    a1.b0(j13, (byte) j10);
                    return;
                } else {
                    this.f112558m = j13 + 1;
                    a1.b0(j13, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
            }
        }

        public final int j2(long j10) {
            return (int) (j10 - this.f112554i);
        }

        public final void l2(long j10) {
            this.f112553h.position((int) (j10 - this.f112554i));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o(int i10, int i11) throws IOException {
            g2(i10, 0);
            h2(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void q(int i10, long j10) throws IOException {
            g2(i10, 1);
            D1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int r1() {
            return (int) (this.f112556k - this.f112558m);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void s(int i10, boolean z10) throws IOException {
            g2(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u1(int i10, byte[] bArr) throws IOException {
            v1(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v1(int i10, byte[] bArr, int i11, int i12) throws IOException {
            g2(i10, 2);
            x1(bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i10, int i11) throws IOException {
            h2(i11);
            V(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void y1(int i10, ByteBuffer byteBuffer) throws IOException {
            g2(i10, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void z1(ByteString byteString) throws IOException {
            h2(byteString.size());
            byteString.j0(this);
        }
    }

    public CodedOutputStream() {
    }

    public static int A0(int i10, Y y10) {
        return B0(3, y10) + Y0(2, i10) + (X0(1) * 2);
    }

    public static int B0(int i10, Y y10) {
        return C0(y10) + X0(i10);
    }

    public static int C0(Y y10) {
        int iF = y10.f();
        return Z0(iF) + iF;
    }

    public static int D0(int i10) {
        return Z0(i10) + i10;
    }

    public static int E0(int i10, MessageLite messageLite) {
        return F0(3, messageLite) + Y0(2, i10) + (X0(1) * 2);
    }

    public static int F0(int i10, MessageLite messageLite) {
        return H0(messageLite) + X0(i10);
    }

    public static int G0(int i10, MessageLite messageLite, G0 g02) {
        return I0(messageLite, g02) + X0(i10);
    }

    public static int H0(MessageLite messageLite) {
        int iG = messageLite.g();
        return Z0(iG) + iG;
    }

    public static int I0(MessageLite messageLite, G0 g02) {
        int iP = ((AbstractMessageLite) messageLite).p(g02);
        return Z0(iP) + iP;
    }

    public static int J0(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int K0(int i10, ByteString byteString) {
        return g0(3, byteString) + Y0(2, i10) + (X0(1) * 2);
    }

    @Deprecated
    public static int L0(int i10) {
        return Z0(i10);
    }

    @Deprecated
    public static int M0(long j10) {
        return b1(j10);
    }

    public static int N0(int i10, int i11) {
        return X0(i10) + 4;
    }

    public static int O0(int i10) {
        return 4;
    }

    public static int P0(int i10, long j10) {
        return X0(i10) + 8;
    }

    public static int Q0(long j10) {
        return 8;
    }

    public static int R0(int i10, int i11) {
        return S0(i11) + X0(i10);
    }

    public static int S0(int i10) {
        return Z0(c1(i10));
    }

    public static int T0(int i10, long j10) {
        return U0(j10) + X0(i10);
    }

    public static int U0(long j10) {
        return b1(d1(j10));
    }

    public static int V0(int i10, String str) {
        return W0(str) + X0(i10);
    }

    public static int W0(String str) {
        int length;
        try {
            length = Utf8.k(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(V.f112719a).length;
        }
        return Z0(length) + length;
    }

    public static int X0(int i10) {
        return Z0(i10 << 3);
    }

    public static int Y0(int i10, int i11) {
        return Z0(i11) + X0(i10);
    }

    public static int Z0(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int a0(int i10, boolean z10) {
        return X0(i10) + 1;
    }

    public static int a1(int i10, long j10) {
        return b1(j10) + X0(i10);
    }

    public static int b0(boolean z10) {
        return 1;
    }

    public static int b1(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((CoroutineScheduler.f220658x & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int c0(int i10, byte[] bArr) {
        return d0(bArr) + X0(i10);
    }

    public static int c1(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int d0(byte[] bArr) {
        int length = bArr.length;
        return Z0(length) + length;
    }

    public static long d1(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int e0(int i10, ByteBuffer byteBuffer) {
        return f0(byteBuffer) + X0(i10);
    }

    public static int f0(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        return Z0(iCapacity) + iCapacity;
    }

    public static int g0(int i10, ByteString byteString) {
        return h0(byteString) + X0(i10);
    }

    public static int h0(ByteString byteString) {
        int size = byteString.size();
        return Z0(size) + size;
    }

    public static int i0(int i10, double d10) {
        return X0(i10) + 8;
    }

    public static CodedOutputStream i1(r rVar, int i10) {
        if (i10 >= 0) {
            return new d(rVar, i10);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    public static int j0(double d10) {
        return 8;
    }

    public static CodedOutputStream j1(OutputStream outputStream) {
        return new f(outputStream, 4096);
    }

    public static int k0(int i10, int i11) {
        return x0(i11) + X0(i10);
    }

    public static CodedOutputStream k1(OutputStream outputStream, int i10) {
        return new f(outputStream, i10);
    }

    public static int l0(int i10) {
        return x0(i10);
    }

    public static CodedOutputStream l1(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new e(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return a1.T() ? new h(byteBuffer) : new g(byteBuffer);
    }

    public static int m0(int i10, int i11) {
        return X0(i10) + 4;
    }

    @Deprecated
    public static CodedOutputStream m1(ByteBuffer byteBuffer, int i10) {
        return l1(byteBuffer);
    }

    public static int n0(int i10) {
        return 4;
    }

    public static CodedOutputStream n1(byte[] bArr) {
        return new c(bArr, 0, bArr.length);
    }

    public static int o0(int i10, long j10) {
        return X0(i10) + 8;
    }

    public static CodedOutputStream o1(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int p0(long j10) {
        return 8;
    }

    public static CodedOutputStream p1(ByteBuffer byteBuffer) {
        return new g(byteBuffer);
    }

    public static int q0(int i10, float f10) {
        return X0(i10) + 4;
    }

    public static CodedOutputStream q1(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public static int r0(float f10) {
        return 4;
    }

    @Deprecated
    public static int s0(int i10, MessageLite messageLite) {
        return messageLite.g() + (X0(i10) * 2);
    }

    @Deprecated
    public static int t0(int i10, MessageLite messageLite, G0 g02) {
        return ((AbstractMessageLite) messageLite).p(g02) + (X0(i10) * 2);
    }

    @Deprecated
    public static int u0(MessageLite messageLite) {
        return messageLite.g();
    }

    @Deprecated
    public static int v0(MessageLite messageLite, G0 g02) {
        return ((AbstractMessageLite) messageLite).p(g02);
    }

    public static int w0(int i10, int i11) {
        return x0(i11) + X0(i10);
    }

    public static int x0(int i10) {
        if (i10 >= 0) {
            return Z0(i10);
        }
        return 10;
    }

    public static int y0(int i10, long j10) {
        return b1(j10) + X0(i10);
    }

    public static int z0(long j10) {
        return b1(j10);
    }

    public final void A1(double d10) throws IOException {
        D1(Double.doubleToRawLongBits(d10));
    }

    public final void B1(int i10) throws IOException {
        J1(i10);
    }

    public final void C(int i10, long j10) throws IOException {
        q(i10, j10);
    }

    public abstract void C1(int i10) throws IOException;

    public abstract void D1(long j10) throws IOException;

    public final void E1(float f10) throws IOException {
        C1(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void F1(int i10, MessageLite messageLite) throws IOException {
        g2(i10, 3);
        messageLite.c(this);
        g2(i10, 4);
    }

    public final void G(int i10, double d10) throws IOException {
        q(i10, Double.doubleToRawLongBits(d10));
    }

    @Deprecated
    public final void G1(int i10, MessageLite messageLite, G0 g02) throws IOException {
        g2(i10, 3);
        I1(messageLite, g02);
        g2(i10, 4);
    }

    @Deprecated
    public final void H1(MessageLite messageLite) throws IOException {
        messageLite.c(this);
    }

    @Deprecated
    public final void I1(MessageLite messageLite, G0 g02) throws IOException {
        g02.c(messageLite, this.f112534a);
    }

    public abstract void J1(int i10) throws IOException;

    public final void K1(long j10) throws IOException {
        i2(j10);
    }

    public final void L(int i10, long j10) throws IOException {
        f(i10, j10);
    }

    public abstract void L1(int i10, MessageLite messageLite) throws IOException;

    public abstract void M1(int i10, MessageLite messageLite, G0 g02) throws IOException;

    public abstract void N1(MessageLite messageLite) throws IOException;

    public abstract void O1(MessageLite messageLite, G0 g02) throws IOException;

    public final void P(int i10, float f10) throws IOException {
        c(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void P1(int i10, MessageLite messageLite) throws IOException;

    public final void Q(int i10, int i11) throws IOException {
        h(i10, i11);
    }

    public final void Q1(byte b10) throws IOException {
        T(b10);
    }

    public final void R1(int i10) throws IOException {
        T((byte) i10);
    }

    public final void S(int i10, int i11) throws IOException {
        o(i10, c1(i11));
    }

    public final void S1(ByteString byteString) throws IOException {
        byteString.j0(this);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public abstract void T(byte b10) throws IOException;

    public abstract void T1(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.r
    public abstract void U(ByteBuffer byteBuffer) throws IOException;

    public final void U1(byte[] bArr) throws IOException {
        V(bArr, 0, bArr.length);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public abstract void V(byte[] bArr, int i10, int i11) throws IOException;

    public final void V1(byte[] bArr, int i10, int i11) throws IOException {
        V(bArr, i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public abstract void W(ByteBuffer byteBuffer) throws IOException;

    @Deprecated
    public final void W1(int i10) throws IOException {
        C1(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public abstract void X(byte[] bArr, int i10, int i11) throws IOException;

    @Deprecated
    public final void X1(long j10) throws IOException {
        D1(j10);
    }

    public abstract void Y1(int i10, ByteString byteString) throws IOException;

    public final void Z() {
        if (r1() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public final void Z1(int i10) throws IOException {
        h2(i10);
    }

    @Deprecated
    public final void a2(long j10) throws IOException {
        i2(j10);
    }

    public final void b2(int i10) throws IOException {
        C1(i10);
    }

    public abstract void c(int i10, int i11) throws IOException;

    public final void c2(long j10) throws IOException {
        D1(j10);
    }

    public final void d2(int i10) throws IOException {
        h2(c1(i10));
    }

    public abstract void e(int i10, String str) throws IOException;

    public abstract void e1() throws IOException;

    public final void e2(long j10) throws IOException {
        i2(d1(j10));
    }

    public abstract void f(int i10, long j10) throws IOException;

    public abstract int f1();

    public abstract void f2(String str) throws IOException;

    public final void g1(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f112530c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(V.f112719a);
        try {
            h2(bytes.length);
            X(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    public abstract void g2(int i10, int i11) throws IOException;

    public abstract void h(int i10, int i11) throws IOException;

    public boolean h1() {
        return this.f112535b;
    }

    public abstract void h2(int i10) throws IOException;

    public abstract void i(int i10, ByteString byteString) throws IOException;

    public abstract void i2(long j10) throws IOException;

    public final void m(int i10, long j10) throws IOException {
        f(i10, d1(j10));
    }

    public abstract void o(int i10, int i11) throws IOException;

    public abstract void q(int i10, long j10) throws IOException;

    public abstract int r1();

    public abstract void s(int i10, boolean z10) throws IOException;

    public void s1() {
        this.f112535b = true;
    }

    public final void t(int i10, int i11) throws IOException {
        c(i10, i11);
    }

    public final void t1(boolean z10) throws IOException {
        T(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void u1(int i10, byte[] bArr) throws IOException;

    public abstract void v1(int i10, byte[] bArr, int i11, int i12) throws IOException;

    public final void w1(byte[] bArr) throws IOException {
        x1(bArr, 0, bArr.length);
    }

    public abstract void x1(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void y1(int i10, ByteBuffer byteBuffer) throws IOException;

    public abstract void z1(ByteString byteString) throws IOException;

    public CodedOutputStream(a aVar) {
    }
}
