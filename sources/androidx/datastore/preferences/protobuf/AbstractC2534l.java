package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2523f0;
import androidx.datastore.preferences.protobuf.Utf8;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2534l extends r implements Writer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f112868e = 4096;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f112869f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f112870g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2542p f112871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<AbstractC2516c> f112873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112874d;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112875a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f112875a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112875a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112875a[WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112875a[WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112875a[WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112875a[WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112875a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f112875a[WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f112875a[WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f112875a[WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f112875a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f112875a[WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f112875a[WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f112875a[WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f112875a[WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f112875a[WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f112875a[WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l$b */
    public static final class b extends AbstractC2534l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ByteBuffer f112876h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f112877i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f112878j;

        public b(AbstractC2542p abstractC2542p, int i10) {
            super(abstractC2542p, i10);
            Z0();
        }

        private int Y0() {
            return this.f112877i - this.f112878j;
        }

        private int c1() {
            return this.f112878j + 1;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void A0(long j10) {
            int i10 = this.f112878j;
            this.f112878j = i10 - 8;
            this.f112876h.putLong(i10 - 7, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void F(int i10, Object obj, G0 g02) throws IOException {
            R0(i10, 4);
            g02.c(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void F0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void K(int i10, Object obj) throws IOException {
            int iC0 = c0();
            A0.a().k(obj, this);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void K0(int i10) {
            W0(CodedOutputStream.c1(i10));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void N0(long j10) {
            X0(CodedOutputStream.d1(j10));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void O(int i10, Object obj) throws IOException {
            R0(i10, 4);
            A0.a().k(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void Q0(String str) {
            int i10;
            int i11;
            int i12;
            char cCharAt;
            r0(str.length());
            int length = str.length() - 1;
            this.f112878j -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.f112876h.put(this.f112878j + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.f112878j--;
                return;
            }
            this.f112878j += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i12 = this.f112878j) >= 0) {
                    ByteBuffer byteBuffer = this.f112876h;
                    this.f112878j = i12 - 1;
                    byteBuffer.put(i12, (byte) cCharAt2);
                } else if (cCharAt2 < 2048 && (i11 = this.f112878j) > 0) {
                    ByteBuffer byteBuffer2 = this.f112876h;
                    this.f112878j = i11 - 1;
                    byteBuffer2.put(i11, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f112876h;
                    int i13 = this.f112878j;
                    this.f112878j = i13 - 1;
                    byteBuffer3.put(i13, (byte) ((cCharAt2 >>> 6) | 960));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i10 = this.f112878j) > 1) {
                    ByteBuffer byteBuffer4 = this.f112876h;
                    this.f112878j = i10 - 1;
                    byteBuffer4.put(i10, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f112876h;
                    int i14 = this.f112878j;
                    this.f112878j = i14 - 1;
                    byteBuffer5.put(i14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f112876h;
                    int i15 = this.f112878j;
                    this.f112878j = i15 - 1;
                    byteBuffer6.put(i15, (byte) ((cCharAt2 >>> '\f') | 480));
                } else {
                    if (this.f112878j > 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                ByteBuffer byteBuffer7 = this.f112876h;
                                int i16 = this.f112878j;
                                this.f112878j = i16 - 1;
                                byteBuffer7.put(i16, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.f112876h;
                                int i17 = this.f112878j;
                                this.f112878j = i17 - 1;
                                byteBuffer8.put(i17, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.f112876h;
                                int i18 = this.f112878j;
                                this.f112878j = i18 - 1;
                                byteBuffer9.put(i18, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.f112876h;
                                int i19 = this.f112878j;
                                this.f112878j = i19 - 1;
                                byteBuffer10.put(i19, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void R0(int i10, int i11) {
            W0((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void S(int i10, int i11) {
            r0(10);
            K0(i11);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void T(byte b10) {
            ByteBuffer byteBuffer = this.f112876h;
            int i10 = this.f112878j;
            this.f112878j = i10 - 1;
            byteBuffer.put(i10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void U(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (this.f112878j + 1 < iRemaining) {
                a1(iRemaining);
            }
            int i10 = this.f112878j - iRemaining;
            this.f112878j = i10;
            this.f112876h.position(i10 + 1);
            this.f112876h.put(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void V(byte[] bArr, int i10, int i11) {
            if (this.f112878j + 1 < i11) {
                a1(i11);
            }
            int i12 = this.f112878j - i11;
            this.f112878j = i12;
            this.f112876h.position(i12 + 1);
            this.f112876h.put(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void W(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.f112878j;
            if (i10 + 1 < iRemaining) {
                this.f112874d += iRemaining;
                this.f112873c.addFirst(AbstractC2516c.j(byteBuffer));
                Z0();
            } else {
                int i11 = i10 - iRemaining;
                this.f112878j = i11;
                this.f112876h.position(i11 + 1);
                this.f112876h.put(byteBuffer);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void W0(int i10) {
            if ((i10 & (-128)) == 0) {
                f1(i10);
                return;
            }
            if ((i10 & (-16384)) == 0) {
                h1(i10);
                return;
            }
            if (((-2097152) & i10) == 0) {
                g1(i10);
            } else if (((-268435456) & i10) == 0) {
                e1(i10);
            } else {
                d1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void X(byte[] bArr, int i10, int i11) {
            int i12 = this.f112878j;
            if (i12 + 1 < i11) {
                this.f112874d += i11;
                this.f112873c.addFirst(AbstractC2516c.l(bArr, i10, i11));
                Z0();
            } else {
                int i13 = i12 - i11;
                this.f112878j = i13;
                this.f112876h.position(i13 + 1);
                this.f112876h.put(bArr, i10, i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void X0(long j10) {
            switch (AbstractC2534l.a0(j10)) {
                case 1:
                    f1((int) j10);
                    break;
                case 2:
                    h1((int) j10);
                    break;
                case 3:
                    g1((int) j10);
                    break;
                case 4:
                    e1((int) j10);
                    break;
                case 5:
                    k1(j10);
                    break;
                case 6:
                    p1(j10);
                    break;
                case 7:
                    o1(j10);
                    break;
                case 8:
                    i1(j10);
                    break;
                case 9:
                    m1(j10);
                    break;
                case 10:
                    q1(j10);
                    break;
            }
        }

        public final void Z0() {
            b1(f0());
        }

        public final void a1(int i10) {
            b1(g0(i10));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void b0() {
            if (this.f112876h != null) {
                this.f112874d += Y0();
                this.f112876h.position(this.f112878j + 1);
                this.f112876h = null;
                this.f112878j = 0;
                this.f112877i = 0;
            }
        }

        public final void b1(AbstractC2516c abstractC2516c) {
            if (!abstractC2516c.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferF = abstractC2516c.f();
            if (!byteBufferF.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            b0();
            this.f112873c.addFirst(abstractC2516c);
            this.f112876h = byteBufferF;
            byteBufferF.limit(byteBufferF.capacity());
            this.f112876h.position(0);
            this.f112876h.order(ByteOrder.LITTLE_ENDIAN);
            int iLimit = this.f112876h.limit() - 1;
            this.f112877i = iLimit;
            this.f112878j = iLimit;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void c(int i10, int i11) {
            r0(9);
            x0(i11);
            R0(i10, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public int c0() {
            return this.f112874d + Y0();
        }

        public final void d1(int i10) {
            ByteBuffer byteBuffer = this.f112876h;
            int i11 = this.f112878j;
            this.f112878j = i11 - 1;
            byteBuffer.put(i11, (byte) (i10 >>> 28));
            int i12 = this.f112878j;
            this.f112878j = i12 - 4;
            this.f112876h.putInt(i12 - 3, (i10 & 127) | 128 | ((((i10 >>> 21) & 127) | 128) << 24) | ((((i10 >>> 14) & 127) | 128) << 16) | ((((i10 >>> 7) & 127) | 128) << 8));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void e(int i10, String str) {
            int iC0 = c0();
            Q0(str);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        public final void e1(int i10) {
            int i11 = this.f112878j;
            this.f112878j = i11 - 4;
            this.f112876h.putInt(i11 - 3, (i10 & 127) | 128 | ((266338304 & i10) << 3) | (((2080768 & i10) | 2097152) << 2) | (((i10 & 16256) | 16384) << 1));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void f(int i10, long j10) {
            r0(15);
            X0(j10);
            R0(i10, 0);
        }

        public final void f1(int i10) {
            ByteBuffer byteBuffer = this.f112876h;
            int i11 = this.f112878j;
            this.f112878j = i11 - 1;
            byteBuffer.put(i11, (byte) i10);
        }

        public final void g1(int i10) {
            int i11 = this.f112878j - 3;
            this.f112878j = i11;
            this.f112876h.putInt(i11, (((i10 & 127) | 128) << 8) | ((2080768 & i10) << 10) | (((i10 & 16256) | 16384) << 9));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void h(int i10, int i11) {
            r0(15);
            F0(i11);
            R0(i10, 0);
        }

        public final void h1(int i10) {
            int i11 = this.f112878j;
            this.f112878j = i11 - 2;
            this.f112876h.putShort(i11 - 1, (short) ((i10 & 127) | 128 | ((i10 & 16256) << 1)));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void i(int i10, ByteString byteString) {
            try {
                byteString.n0(this);
                r0(10);
                W0(byteString.size());
                R0(i10, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        public final void i1(long j10) {
            int i10 = this.f112878j;
            this.f112878j = i10 - 8;
            this.f112876h.putLong(i10 - 7, (j10 & 127) | 128 | ((71494644084506624L & j10) << 7) | (((558551906910208L & j10) | 562949953421312L) << 6) | (((4363686772736L & j10) | 4398046511104L) << 5) | (((34091302912L & j10) | 34359738368L) << 4) | (((266338304 & j10) | 268435456) << 3) | (((2080768 & j10) | 2097152) << 2) | (((16256 & j10) | 16384) << 1));
        }

        public final void j1(long j10) {
            int i10 = this.f112878j;
            this.f112878j = i10 - 8;
            this.f112876h.putLong(i10 - 7, (j10 & 127) | 128 | (((71494644084506624L & j10) | 72057594037927936L) << 7) | (((558551906910208L & j10) | 562949953421312L) << 6) | (((4363686772736L & j10) | 4398046511104L) << 5) | (((34091302912L & j10) | 34359738368L) << 4) | (((266338304 & j10) | 268435456) << 3) | (((2080768 & j10) | 2097152) << 2) | (((16256 & j10) | 16384) << 1));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void k(int i10, Object obj, G0 g02) throws IOException {
            int iC0 = c0();
            g02.c(obj, this);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        public final void k1(long j10) {
            int i10 = this.f112878j;
            this.f112878j = i10 - 5;
            this.f112876h.putLong(i10 - 7, (((j10 & 127) | 128) << 24) | ((34091302912L & j10) << 28) | (((266338304 & j10) | 268435456) << 27) | (((2080768 & j10) | 2097152) << 26) | (((16256 & j10) | 16384) << 25));
        }

        public final void l1(long j10) {
            e1((int) j10);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void m(int i10, long j10) {
            r0(15);
            N0(j10);
            R0(i10, 0);
        }

        public final void m1(long j10) {
            ByteBuffer byteBuffer = this.f112876h;
            int i10 = this.f112878j;
            this.f112878j = i10 - 1;
            byteBuffer.put(i10, (byte) (j10 >>> 56));
            j1(j10 & 72057594037927935L);
        }

        public final void n1(long j10) {
            f1((int) j10);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void o(int i10, int i11) {
            r0(10);
            W0(i11);
            R0(i10, 0);
        }

        public final void o1(long j10) {
            int i10 = this.f112878j - 7;
            this.f112878j = i10;
            this.f112876h.putLong(i10, (((j10 & 127) | 128) << 8) | ((558551906910208L & j10) << 14) | (((4363686772736L & j10) | 4398046511104L) << 13) | (((34091302912L & j10) | 34359738368L) << 12) | (((266338304 & j10) | 268435456) << 11) | (((2080768 & j10) | 2097152) << 10) | (((16256 & j10) | 16384) << 9));
        }

        public final void p1(long j10) {
            int i10 = this.f112878j;
            this.f112878j = i10 - 6;
            this.f112876h.putLong(i10 - 7, (((j10 & 127) | 128) << 16) | ((4363686772736L & j10) << 21) | (((34091302912L & j10) | 34359738368L) << 20) | (((266338304 & j10) | 268435456) << 19) | (((2080768 & j10) | 2097152) << 18) | (((16256 & j10) | 16384) << 17));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void q(int i10, long j10) {
            r0(13);
            A0(j10);
            R0(i10, 1);
        }

        public final void q1(long j10) {
            ByteBuffer byteBuffer = this.f112876h;
            int i10 = this.f112878j;
            this.f112878j = i10 - 1;
            byteBuffer.put(i10, (byte) (j10 >>> 63));
            ByteBuffer byteBuffer2 = this.f112876h;
            int i11 = this.f112878j;
            this.f112878j = i11 - 1;
            byteBuffer2.put(i11, (byte) (((j10 >>> 56) & 127) | 128));
            j1(j10 & 72057594037927935L);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void r0(int i10) {
            if (this.f112878j + 1 < i10) {
                a1(i10);
            }
        }

        public final void r1(long j10) {
            g1((int) j10);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void s(int i10, boolean z10) {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        public final void s1(long j10) {
            h1((int) j10);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void u(int i10) {
            R0(i10, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void w(int i10) {
            R0(i10, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void x0(int i10) {
            int i11 = this.f112878j;
            this.f112878j = i11 - 4;
            this.f112876h.putInt(i11 - 3, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l$c */
    public static final class c extends AbstractC2534l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AbstractC2516c f112879h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f112880i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f112881j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f112882k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f112883l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f112884m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f112885n;

        public c(AbstractC2542p abstractC2542p, int i10) {
            super(abstractC2542p, i10);
            Z0();
        }

        private void Z0() {
            b1(j0());
        }

        private void a1(int i10) {
            b1(k0(i10));
        }

        private void b1(AbstractC2516c abstractC2516c) {
            if (!abstractC2516c.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            b0();
            this.f112873c.addFirst(abstractC2516c);
            this.f112879h = abstractC2516c;
            this.f112880i = abstractC2516c.a();
            int iB = abstractC2516c.b();
            this.f112882k = abstractC2516c.e() + iB;
            int iG = abstractC2516c.g() + iB;
            this.f112881j = iG;
            this.f112883l = iG - 1;
            int i10 = this.f112882k - 1;
            this.f112884m = i10;
            this.f112885n = i10;
        }

        private void d1(int i10) {
            byte[] bArr = this.f112880i;
            int i11 = this.f112885n;
            int i12 = i11 - 1;
            this.f112885n = i12;
            bArr[i11] = (byte) (i10 >>> 28);
            int i13 = i11 - 2;
            this.f112885n = i13;
            bArr[i12] = (byte) (((i10 >>> 21) & 127) | 128);
            int i14 = i11 - 3;
            this.f112885n = i14;
            bArr[i13] = (byte) (((i10 >>> 14) & 127) | 128);
            int i15 = i11 - 4;
            this.f112885n = i15;
            bArr[i14] = (byte) (((i10 >>> 7) & 127) | 128);
            this.f112885n = i11 - 5;
            bArr[i15] = (byte) ((i10 & 127) | 128);
        }

        private void e1(int i10) {
            byte[] bArr = this.f112880i;
            int i11 = this.f112885n;
            int i12 = i11 - 1;
            this.f112885n = i12;
            bArr[i11] = (byte) (i10 >>> 21);
            int i13 = i11 - 2;
            this.f112885n = i13;
            bArr[i12] = (byte) (((i10 >>> 14) & 127) | 128);
            int i14 = i11 - 3;
            this.f112885n = i14;
            bArr[i13] = (byte) (((i10 >>> 7) & 127) | 128);
            this.f112885n = i11 - 4;
            bArr[i14] = (byte) ((i10 & 127) | 128);
        }

        private void f1(int i10) {
            byte[] bArr = this.f112880i;
            int i11 = this.f112885n;
            this.f112885n = i11 - 1;
            bArr[i11] = (byte) i10;
        }

        private void g1(int i10) {
            byte[] bArr = this.f112880i;
            int i11 = this.f112885n;
            int i12 = i11 - 1;
            this.f112885n = i12;
            bArr[i11] = (byte) (i10 >>> 14);
            int i13 = i11 - 2;
            this.f112885n = i13;
            bArr[i12] = (byte) (((i10 >>> 7) & 127) | 128);
            this.f112885n = i11 - 3;
            bArr[i13] = (byte) ((i10 & 127) | 128);
        }

        private void h1(int i10) {
            byte[] bArr = this.f112880i;
            int i11 = this.f112885n;
            int i12 = i11 - 1;
            this.f112885n = i12;
            bArr[i11] = (byte) (i10 >>> 7);
            this.f112885n = i11 - 2;
            bArr[i12] = (byte) ((i10 & 127) | 128);
        }

        private void i1(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            int i11 = i10 - 1;
            this.f112885n = i11;
            bArr[i10] = (byte) (j10 >>> 49);
            int i12 = i10 - 2;
            this.f112885n = i12;
            bArr[i11] = (byte) (((j10 >>> 42) & 127) | 128);
            int i13 = i10 - 3;
            this.f112885n = i13;
            bArr[i12] = (byte) (((j10 >>> 35) & 127) | 128);
            int i14 = i10 - 4;
            this.f112885n = i14;
            bArr[i13] = (byte) (((j10 >>> 28) & 127) | 128);
            int i15 = i10 - 5;
            this.f112885n = i15;
            bArr[i14] = (byte) (((j10 >>> 21) & 127) | 128);
            int i16 = i10 - 6;
            this.f112885n = i16;
            bArr[i15] = (byte) (((j10 >>> 14) & 127) | 128);
            int i17 = i10 - 7;
            this.f112885n = i17;
            bArr[i16] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f112885n = i10 - 8;
            bArr[i17] = (byte) ((j10 & 127) | 128);
        }

        private void j1(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            int i11 = i10 - 1;
            this.f112885n = i11;
            bArr[i10] = (byte) (j10 >>> 28);
            int i12 = i10 - 2;
            this.f112885n = i12;
            bArr[i11] = (byte) (((j10 >>> 21) & 127) | 128);
            int i13 = i10 - 3;
            this.f112885n = i13;
            bArr[i12] = (byte) (((j10 >>> 14) & 127) | 128);
            int i14 = i10 - 4;
            this.f112885n = i14;
            bArr[i13] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f112885n = i10 - 5;
            bArr[i14] = (byte) ((j10 & 127) | 128);
        }

        private void k1(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            int i11 = i10 - 1;
            this.f112885n = i11;
            bArr[i10] = (byte) (j10 >>> 21);
            int i12 = i10 - 2;
            this.f112885n = i12;
            bArr[i11] = (byte) (((j10 >>> 14) & 127) | 128);
            int i13 = i10 - 3;
            this.f112885n = i13;
            bArr[i12] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f112885n = i10 - 4;
            bArr[i13] = (byte) ((j10 & 127) | 128);
        }

        private void l1(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            int i11 = i10 - 1;
            this.f112885n = i11;
            bArr[i10] = (byte) (j10 >>> 56);
            int i12 = i10 - 2;
            this.f112885n = i12;
            bArr[i11] = (byte) (((j10 >>> 49) & 127) | 128);
            int i13 = i10 - 3;
            this.f112885n = i13;
            bArr[i12] = (byte) (((j10 >>> 42) & 127) | 128);
            int i14 = i10 - 4;
            this.f112885n = i14;
            bArr[i13] = (byte) (((j10 >>> 35) & 127) | 128);
            int i15 = i10 - 5;
            this.f112885n = i15;
            bArr[i14] = (byte) (((j10 >>> 28) & 127) | 128);
            int i16 = i10 - 6;
            this.f112885n = i16;
            bArr[i15] = (byte) (((j10 >>> 21) & 127) | 128);
            int i17 = i10 - 7;
            this.f112885n = i17;
            bArr[i16] = (byte) (((j10 >>> 14) & 127) | 128);
            int i18 = i10 - 8;
            this.f112885n = i18;
            bArr[i17] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f112885n = i10 - 9;
            bArr[i18] = (byte) ((j10 & 127) | 128);
        }

        private void m1(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            this.f112885n = i10 - 1;
            bArr[i10] = (byte) j10;
        }

        private void n1(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            int i11 = i10 - 1;
            this.f112885n = i11;
            bArr[i10] = (byte) (j10 >>> 42);
            int i12 = i10 - 2;
            this.f112885n = i12;
            bArr[i11] = (byte) (((j10 >>> 35) & 127) | 128);
            int i13 = i10 - 3;
            this.f112885n = i13;
            bArr[i12] = (byte) (((j10 >>> 28) & 127) | 128);
            int i14 = i10 - 4;
            this.f112885n = i14;
            bArr[i13] = (byte) (((j10 >>> 21) & 127) | 128);
            int i15 = i10 - 5;
            this.f112885n = i15;
            bArr[i14] = (byte) (((j10 >>> 14) & 127) | 128);
            int i16 = i10 - 6;
            this.f112885n = i16;
            bArr[i15] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f112885n = i10 - 7;
            bArr[i16] = (byte) ((j10 & 127) | 128);
        }

        private void o1(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            int i11 = i10 - 1;
            this.f112885n = i11;
            bArr[i10] = (byte) (j10 >>> 35);
            int i12 = i10 - 2;
            this.f112885n = i12;
            bArr[i11] = (byte) (((j10 >>> 28) & 127) | 128);
            int i13 = i10 - 3;
            this.f112885n = i13;
            bArr[i12] = (byte) (((j10 >>> 21) & 127) | 128);
            int i14 = i10 - 4;
            this.f112885n = i14;
            bArr[i13] = (byte) (((j10 >>> 14) & 127) | 128);
            int i15 = i10 - 5;
            this.f112885n = i15;
            bArr[i14] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f112885n = i10 - 6;
            bArr[i15] = (byte) ((j10 & 127) | 128);
        }

        private void p1(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            int i11 = i10 - 1;
            this.f112885n = i11;
            bArr[i10] = (byte) (j10 >>> 63);
            int i12 = i10 - 2;
            this.f112885n = i12;
            bArr[i11] = (byte) (((j10 >>> 56) & 127) | 128);
            int i13 = i10 - 3;
            this.f112885n = i13;
            bArr[i12] = (byte) (((j10 >>> 49) & 127) | 128);
            int i14 = i10 - 4;
            this.f112885n = i14;
            bArr[i13] = (byte) (((j10 >>> 42) & 127) | 128);
            int i15 = i10 - 5;
            this.f112885n = i15;
            bArr[i14] = (byte) (((j10 >>> 35) & 127) | 128);
            int i16 = i10 - 6;
            this.f112885n = i16;
            bArr[i15] = (byte) (((j10 >>> 28) & 127) | 128);
            int i17 = i10 - 7;
            this.f112885n = i17;
            bArr[i16] = (byte) (((j10 >>> 21) & 127) | 128);
            int i18 = i10 - 8;
            this.f112885n = i18;
            bArr[i17] = (byte) (((j10 >>> 14) & 127) | 128);
            int i19 = i10 - 9;
            this.f112885n = i19;
            bArr[i18] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f112885n = i10 - 10;
            bArr[i19] = (byte) ((j10 & 127) | 128);
        }

        private void q1(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            int i11 = i10 - 1;
            this.f112885n = i11;
            bArr[i10] = (byte) (((int) j10) >>> 14);
            int i12 = i10 - 2;
            this.f112885n = i12;
            bArr[i11] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f112885n = i10 - 3;
            bArr[i12] = (byte) ((j10 & 127) | 128);
        }

        private void r1(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            int i11 = i10 - 1;
            this.f112885n = i11;
            bArr[i10] = (byte) (j10 >>> 7);
            this.f112885n = i10 - 2;
            bArr[i11] = (byte) ((((int) j10) & 127) | 128);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void A0(long j10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            int i11 = i10 - 1;
            this.f112885n = i11;
            bArr[i10] = (byte) (((int) (j10 >> 56)) & 255);
            int i12 = i10 - 2;
            this.f112885n = i12;
            bArr[i11] = (byte) (((int) (j10 >> 48)) & 255);
            int i13 = i10 - 3;
            this.f112885n = i13;
            bArr[i12] = (byte) (((int) (j10 >> 40)) & 255);
            int i14 = i10 - 4;
            this.f112885n = i14;
            bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
            int i15 = i10 - 5;
            this.f112885n = i15;
            bArr[i14] = (byte) (((int) (j10 >> 24)) & 255);
            int i16 = i10 - 6;
            this.f112885n = i16;
            bArr[i15] = (byte) (((int) (j10 >> 16)) & 255);
            int i17 = i10 - 7;
            this.f112885n = i17;
            bArr[i16] = (byte) (((int) (j10 >> 8)) & 255);
            this.f112885n = i10 - 8;
            bArr[i17] = (byte) (((int) j10) & 255);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void F(int i10, Object obj, G0 g02) throws IOException {
            R0(i10, 4);
            g02.c(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void F0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void K(int i10, Object obj) throws IOException {
            int iC0 = c0();
            A0.a().k(obj, this);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void K0(int i10) {
            W0(CodedOutputStream.c1(i10));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void N0(long j10) {
            X0(CodedOutputStream.d1(j10));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void O(int i10, Object obj) throws IOException {
            R0(i10, 4);
            A0.a().k(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void Q0(String str) {
            int i10;
            int i11;
            int i12;
            char cCharAt;
            r0(str.length());
            int length = str.length() - 1;
            this.f112885n -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.f112880i[this.f112885n + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.f112885n--;
                return;
            }
            this.f112885n += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i12 = this.f112885n) > this.f112883l) {
                    byte[] bArr = this.f112880i;
                    this.f112885n = i12 - 1;
                    bArr[i12] = (byte) cCharAt2;
                } else if (cCharAt2 < 2048 && (i11 = this.f112885n) > this.f112881j) {
                    byte[] bArr2 = this.f112880i;
                    int i13 = i11 - 1;
                    this.f112885n = i13;
                    bArr2[i11] = (byte) ((cCharAt2 & '?') | 128);
                    this.f112885n = i11 - 2;
                    bArr2[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i10 = this.f112885n) > this.f112881j + 1) {
                    byte[] bArr3 = this.f112880i;
                    int i14 = i10 - 1;
                    this.f112885n = i14;
                    bArr3[i10] = (byte) ((cCharAt2 & '?') | 128);
                    int i15 = i10 - 2;
                    this.f112885n = i15;
                    bArr3[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    this.f112885n = i10 - 3;
                    bArr3[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                } else {
                    if (this.f112885n > this.f112881j + 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                byte[] bArr4 = this.f112880i;
                                int i16 = this.f112885n;
                                int i17 = i16 - 1;
                                this.f112885n = i17;
                                bArr4[i16] = (byte) ((codePoint & 63) | 128);
                                int i18 = i16 - 2;
                                this.f112885n = i18;
                                bArr4[i17] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i19 = i16 - 3;
                                this.f112885n = i19;
                                bArr4[i18] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.f112885n = i16 - 4;
                                bArr4[i19] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void R0(int i10, int i11) {
            W0((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void S(int i10, int i11) throws IOException {
            r0(10);
            K0(i11);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void T(byte b10) {
            byte[] bArr = this.f112880i;
            int i10 = this.f112885n;
            this.f112885n = i10 - 1;
            bArr[i10] = b10;
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void U(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (c1() < iRemaining) {
                a1(iRemaining);
            }
            int i10 = this.f112885n - iRemaining;
            this.f112885n = i10;
            byteBuffer.get(this.f112880i, i10 + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void V(byte[] bArr, int i10, int i11) {
            if (c1() < i11) {
                a1(i11);
            }
            int i12 = this.f112885n - i11;
            this.f112885n = i12;
            System.arraycopy(bArr, i10, this.f112880i, i12 + 1, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void W(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (c1() < iRemaining) {
                this.f112874d += iRemaining;
                this.f112873c.addFirst(AbstractC2516c.j(byteBuffer));
                Z0();
            }
            int i10 = this.f112885n - iRemaining;
            this.f112885n = i10;
            byteBuffer.get(this.f112880i, i10 + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void W0(int i10) {
            if ((i10 & (-128)) == 0) {
                f1(i10);
                return;
            }
            if ((i10 & (-16384)) == 0) {
                h1(i10);
                return;
            }
            if (((-2097152) & i10) == 0) {
                g1(i10);
            } else if (((-268435456) & i10) == 0) {
                e1(i10);
            } else {
                d1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void X(byte[] bArr, int i10, int i11) {
            if (c1() < i11) {
                this.f112874d += i11;
                this.f112873c.addFirst(AbstractC2516c.l(bArr, i10, i11));
                Z0();
            } else {
                int i12 = this.f112885n - i11;
                this.f112885n = i12;
                System.arraycopy(bArr, i10, this.f112880i, i12 + 1, i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void X0(long j10) {
            switch (AbstractC2534l.a0(j10)) {
                case 1:
                    m1(j10);
                    break;
                case 2:
                    r1(j10);
                    break;
                case 3:
                    q1(j10);
                    break;
                case 4:
                    k1(j10);
                    break;
                case 5:
                    j1(j10);
                    break;
                case 6:
                    o1(j10);
                    break;
                case 7:
                    n1(j10);
                    break;
                case 8:
                    i1(j10);
                    break;
                case 9:
                    l1(j10);
                    break;
                case 10:
                    p1(j10);
                    break;
            }
        }

        public int Y0() {
            return this.f112884m - this.f112885n;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void b0() {
            if (this.f112879h != null) {
                this.f112874d = Y0() + this.f112874d;
                AbstractC2516c abstractC2516c = this.f112879h;
                abstractC2516c.h((this.f112885n - abstractC2516c.b()) + 1);
                this.f112879h = null;
                this.f112885n = 0;
                this.f112884m = 0;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void c(int i10, int i11) throws IOException {
            r0(9);
            x0(i11);
            R0(i10, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public int c0() {
            return Y0() + this.f112874d;
        }

        public int c1() {
            return this.f112885n - this.f112883l;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void e(int i10, String str) throws IOException {
            int iC0 = c0();
            Q0(str);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void f(int i10, long j10) throws IOException {
            r0(15);
            X0(j10);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void h(int i10, int i11) throws IOException {
            r0(15);
            F0(i11);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void i(int i10, ByteString byteString) throws IOException {
            try {
                byteString.n0(this);
                r0(10);
                W0(byteString.size());
                R0(i10, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void k(int i10, Object obj, G0 g02) throws IOException {
            int iC0 = c0();
            g02.c(obj, this);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void m(int i10, long j10) throws IOException {
            r0(15);
            N0(j10);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void o(int i10, int i11) throws IOException {
            r0(10);
            W0(i11);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void q(int i10, long j10) throws IOException {
            r0(13);
            A0(j10);
            R0(i10, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void r0(int i10) {
            if (c1() < i10) {
                a1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void s(int i10, boolean z10) throws IOException {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void u(int i10) {
            R0(i10, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void w(int i10) {
            R0(i10, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void x0(int i10) {
            byte[] bArr = this.f112880i;
            int i11 = this.f112885n;
            int i12 = i11 - 1;
            this.f112885n = i12;
            bArr[i11] = (byte) ((i10 >> 24) & 255);
            int i13 = i11 - 2;
            this.f112885n = i13;
            bArr[i12] = (byte) ((i10 >> 16) & 255);
            int i14 = i11 - 3;
            this.f112885n = i14;
            bArr[i13] = (byte) ((i10 >> 8) & 255);
            this.f112885n = i11 - 4;
            bArr[i14] = (byte) (i10 & 255);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l$d */
    public static final class d extends AbstractC2534l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ByteBuffer f112886h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f112887i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f112888j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f112889k;

        public d(AbstractC2542p abstractC2542p, int i10) {
            super(abstractC2542p, i10);
            c1();
        }

        public static boolean Y0() {
            return a1.T();
        }

        private int a1() {
            return (int) (this.f112888j - this.f112889k);
        }

        private static boolean b1() {
            return a1.T();
        }

        private void c1() {
            e1(f0());
        }

        private void d1(int i10) {
            e1(g0(i10));
        }

        private void e1(AbstractC2516c abstractC2516c) {
            if (!abstractC2516c.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferF = abstractC2516c.f();
            if (!byteBufferF.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            b0();
            this.f112873c.addFirst(abstractC2516c);
            this.f112886h = byteBufferF;
            byteBufferF.limit(byteBufferF.capacity());
            this.f112886h.position(0);
            long jI = a1.i(this.f112886h);
            this.f112887i = jI;
            long jLimit = jI + ((long) (this.f112886h.limit() - 1));
            this.f112888j = jLimit;
            this.f112889k = jLimit;
        }

        private int f1() {
            return Z0() + 1;
        }

        private void g1(int i10) {
            long j10 = this.f112889k;
            this.f112889k = j10 - 1;
            a1.b0(j10, (byte) (i10 >>> 28));
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (((i10 >>> 21) & 127) | 128));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((i10 >>> 14) & 127) | 128));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) (((i10 >>> 7) & 127) | 128));
            long j14 = this.f112889k;
            this.f112889k = j14 - 1;
            a1.b0(j14, (byte) ((i10 & 127) | 128));
        }

        private void h1(int i10) {
            long j10 = this.f112889k;
            this.f112889k = j10 - 1;
            a1.b0(j10, (byte) (i10 >>> 21));
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (((i10 >>> 14) & 127) | 128));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((i10 >>> 7) & 127) | 128));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) ((i10 & 127) | 128));
        }

        private void i1(int i10) {
            long j10 = this.f112889k;
            this.f112889k = j10 - 1;
            a1.b0(j10, (byte) i10);
        }

        private void j1(int i10) {
            long j10 = this.f112889k;
            this.f112889k = j10 - 1;
            a1.b0(j10, (byte) (i10 >>> 14));
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (((i10 >>> 7) & 127) | 128));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) ((i10 & 127) | 128));
        }

        private void k1(int i10) {
            long j10 = this.f112889k;
            this.f112889k = j10 - 1;
            a1.b0(j10, (byte) (i10 >>> 7));
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) ((i10 & 127) | 128));
        }

        private void l1(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (j10 >>> 49));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((j10 >>> 42) & 127) | 128));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) (((j10 >>> 35) & 127) | 128));
            long j14 = this.f112889k;
            this.f112889k = j14 - 1;
            a1.b0(j14, (byte) (((j10 >>> 28) & 127) | 128));
            long j15 = this.f112889k;
            this.f112889k = j15 - 1;
            a1.b0(j15, (byte) (((j10 >>> 21) & 127) | 128));
            long j16 = this.f112889k;
            this.f112889k = j16 - 1;
            a1.b0(j16, (byte) (((j10 >>> 14) & 127) | 128));
            long j17 = this.f112889k;
            this.f112889k = j17 - 1;
            a1.b0(j17, (byte) (((j10 >>> 7) & 127) | 128));
            long j18 = this.f112889k;
            this.f112889k = j18 - 1;
            a1.b0(j18, (byte) ((j10 & 127) | 128));
        }

        private void m1(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (j10 >>> 28));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((j10 >>> 21) & 127) | 128));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) (((j10 >>> 14) & 127) | 128));
            long j14 = this.f112889k;
            this.f112889k = j14 - 1;
            a1.b0(j14, (byte) (((j10 >>> 7) & 127) | 128));
            long j15 = this.f112889k;
            this.f112889k = j15 - 1;
            a1.b0(j15, (byte) ((j10 & 127) | 128));
        }

        private void n1(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (j10 >>> 21));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((j10 >>> 14) & 127) | 128));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) (((j10 >>> 7) & 127) | 128));
            long j14 = this.f112889k;
            this.f112889k = j14 - 1;
            a1.b0(j14, (byte) ((j10 & 127) | 128));
        }

        private void o1(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (j10 >>> 56));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((j10 >>> 49) & 127) | 128));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) (((j10 >>> 42) & 127) | 128));
            long j14 = this.f112889k;
            this.f112889k = j14 - 1;
            a1.b0(j14, (byte) (((j10 >>> 35) & 127) | 128));
            long j15 = this.f112889k;
            this.f112889k = j15 - 1;
            a1.b0(j15, (byte) (((j10 >>> 28) & 127) | 128));
            long j16 = this.f112889k;
            this.f112889k = j16 - 1;
            a1.b0(j16, (byte) (((j10 >>> 21) & 127) | 128));
            long j17 = this.f112889k;
            this.f112889k = j17 - 1;
            a1.b0(j17, (byte) (((j10 >>> 14) & 127) | 128));
            long j18 = this.f112889k;
            this.f112889k = j18 - 1;
            a1.b0(j18, (byte) (((j10 >>> 7) & 127) | 128));
            long j19 = this.f112889k;
            this.f112889k = j19 - 1;
            a1.b0(j19, (byte) ((j10 & 127) | 128));
        }

        private void p1(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) j10);
        }

        private void q1(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (j10 >>> 42));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((j10 >>> 35) & 127) | 128));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) (((j10 >>> 28) & 127) | 128));
            long j14 = this.f112889k;
            this.f112889k = j14 - 1;
            a1.b0(j14, (byte) (((j10 >>> 21) & 127) | 128));
            long j15 = this.f112889k;
            this.f112889k = j15 - 1;
            a1.b0(j15, (byte) (((j10 >>> 14) & 127) | 128));
            long j16 = this.f112889k;
            this.f112889k = j16 - 1;
            a1.b0(j16, (byte) (((j10 >>> 7) & 127) | 128));
            long j17 = this.f112889k;
            this.f112889k = j17 - 1;
            a1.b0(j17, (byte) ((j10 & 127) | 128));
        }

        private void r1(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (j10 >>> 35));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((j10 >>> 28) & 127) | 128));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) (((j10 >>> 21) & 127) | 128));
            long j14 = this.f112889k;
            this.f112889k = j14 - 1;
            a1.b0(j14, (byte) (((j10 >>> 14) & 127) | 128));
            long j15 = this.f112889k;
            this.f112889k = j15 - 1;
            a1.b0(j15, (byte) (((j10 >>> 7) & 127) | 128));
            long j16 = this.f112889k;
            this.f112889k = j16 - 1;
            a1.b0(j16, (byte) ((j10 & 127) | 128));
        }

        private void s1(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (j10 >>> 63));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((j10 >>> 56) & 127) | 128));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) (((j10 >>> 49) & 127) | 128));
            long j14 = this.f112889k;
            this.f112889k = j14 - 1;
            a1.b0(j14, (byte) (((j10 >>> 42) & 127) | 128));
            long j15 = this.f112889k;
            this.f112889k = j15 - 1;
            a1.b0(j15, (byte) (((j10 >>> 35) & 127) | 128));
            long j16 = this.f112889k;
            this.f112889k = j16 - 1;
            a1.b0(j16, (byte) (((j10 >>> 28) & 127) | 128));
            long j17 = this.f112889k;
            this.f112889k = j17 - 1;
            a1.b0(j17, (byte) (((j10 >>> 21) & 127) | 128));
            long j18 = this.f112889k;
            this.f112889k = j18 - 1;
            a1.b0(j18, (byte) (((j10 >>> 14) & 127) | 128));
            long j19 = this.f112889k;
            this.f112889k = j19 - 1;
            a1.b0(j19, (byte) (((j10 >>> 7) & 127) | 128));
            long j20 = this.f112889k;
            this.f112889k = j20 - 1;
            a1.b0(j20, (byte) ((j10 & 127) | 128));
        }

        private void t1(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (((int) j10) >>> 14));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((j10 >>> 7) & 127) | 128));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) ((j10 & 127) | 128));
        }

        private void u1(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (j10 >>> 7));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) ((((int) j10) & 127) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void A0(long j10) {
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) (((int) (j10 >> 56)) & 255));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) (((int) (j10 >> 48)) & 255));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) (((int) (j10 >> 40)) & 255));
            long j14 = this.f112889k;
            this.f112889k = j14 - 1;
            a1.b0(j14, (byte) (((int) (j10 >> 32)) & 255));
            long j15 = this.f112889k;
            this.f112889k = j15 - 1;
            a1.b0(j15, (byte) (((int) (j10 >> 24)) & 255));
            long j16 = this.f112889k;
            this.f112889k = j16 - 1;
            a1.b0(j16, (byte) (((int) (j10 >> 16)) & 255));
            long j17 = this.f112889k;
            this.f112889k = j17 - 1;
            a1.b0(j17, (byte) (((int) (j10 >> 8)) & 255));
            long j18 = this.f112889k;
            this.f112889k = j18 - 1;
            a1.b0(j18, (byte) (((int) j10) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void F(int i10, Object obj, G0 g02) throws IOException {
            R0(i10, 4);
            g02.c(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void F0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void K(int i10, Object obj) throws IOException {
            int iC0 = c0();
            A0.a().k(obj, this);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void K0(int i10) {
            W0(CodedOutputStream.c1(i10));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void N0(long j10) {
            X0(CodedOutputStream.d1(j10));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void O(int i10, Object obj) throws IOException {
            R0(i10, 4);
            A0.a().k(obj, this);
            R0(i10, 3);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void Q0(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC2534l.d.Q0(java.lang.String):void");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void R0(int i10, int i11) {
            W0((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void S(int i10, int i11) {
            r0(10);
            K0(i11);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void T(byte b10) {
            long j10 = this.f112889k;
            this.f112889k = j10 - 1;
            a1.b0(j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void U(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (f1() < iRemaining) {
                d1(iRemaining);
            }
            this.f112889k -= (long) iRemaining;
            this.f112886h.position(Z0() + 1);
            this.f112886h.put(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void V(byte[] bArr, int i10, int i11) {
            if (f1() < i11) {
                d1(i11);
            }
            this.f112889k -= (long) i11;
            this.f112886h.position(Z0() + 1);
            this.f112886h.put(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void W(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (f1() < iRemaining) {
                this.f112874d += iRemaining;
                this.f112873c.addFirst(AbstractC2516c.j(byteBuffer));
                c1();
            } else {
                this.f112889k -= (long) iRemaining;
                this.f112886h.position(Z0() + 1);
                this.f112886h.put(byteBuffer);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void W0(int i10) {
            if ((i10 & (-128)) == 0) {
                i1(i10);
                return;
            }
            if ((i10 & (-16384)) == 0) {
                k1(i10);
                return;
            }
            if (((-2097152) & i10) == 0) {
                j1(i10);
            } else if (((-268435456) & i10) == 0) {
                h1(i10);
            } else {
                g1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void X(byte[] bArr, int i10, int i11) {
            if (f1() < i11) {
                this.f112874d += i11;
                this.f112873c.addFirst(AbstractC2516c.l(bArr, i10, i11));
                c1();
            } else {
                this.f112889k -= (long) i11;
                this.f112886h.position(Z0() + 1);
                this.f112886h.put(bArr, i10, i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void X0(long j10) {
            switch (AbstractC2534l.a0(j10)) {
                case 1:
                    p1(j10);
                    break;
                case 2:
                    u1(j10);
                    break;
                case 3:
                    t1(j10);
                    break;
                case 4:
                    n1(j10);
                    break;
                case 5:
                    m1(j10);
                    break;
                case 6:
                    r1(j10);
                    break;
                case 7:
                    q1(j10);
                    break;
                case 8:
                    l1(j10);
                    break;
                case 9:
                    o1(j10);
                    break;
                case 10:
                    s1(j10);
                    break;
            }
        }

        public final int Z0() {
            return (int) (this.f112889k - this.f112887i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void b0() {
            if (this.f112886h != null) {
                this.f112874d += a1();
                this.f112886h.position(Z0() + 1);
                this.f112886h = null;
                this.f112889k = 0L;
                this.f112888j = 0L;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void c(int i10, int i11) {
            r0(9);
            x0(i11);
            R0(i10, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public int c0() {
            return this.f112874d + a1();
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void e(int i10, String str) {
            int iC0 = c0();
            Q0(str);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void f(int i10, long j10) {
            r0(15);
            X0(j10);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void h(int i10, int i11) {
            r0(15);
            F0(i11);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void i(int i10, ByteString byteString) {
            try {
                byteString.n0(this);
                r0(10);
                W0(byteString.size());
                R0(i10, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void k(int i10, Object obj, G0 g02) throws IOException {
            int iC0 = c0();
            g02.c(obj, this);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void m(int i10, long j10) {
            r0(15);
            N0(j10);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void o(int i10, int i11) {
            r0(10);
            W0(i11);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void q(int i10, long j10) {
            r0(13);
            A0(j10);
            R0(i10, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void r0(int i10) {
            if (f1() < i10) {
                d1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void s(int i10, boolean z10) {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void u(int i10) {
            R0(i10, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void w(int i10) {
            R0(i10, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void x0(int i10) {
            long j10 = this.f112889k;
            this.f112889k = j10 - 1;
            a1.b0(j10, (byte) ((i10 >> 24) & 255));
            long j11 = this.f112889k;
            this.f112889k = j11 - 1;
            a1.b0(j11, (byte) ((i10 >> 16) & 255));
            long j12 = this.f112889k;
            this.f112889k = j12 - 1;
            a1.b0(j12, (byte) ((i10 >> 8) & 255));
            long j13 = this.f112889k;
            this.f112889k = j13 - 1;
            a1.b0(j13, (byte) (i10 & 255));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l$e */
    public static final class e extends AbstractC2534l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AbstractC2516c f112890h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f112891i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f112892j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f112893k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f112894l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f112895m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f112896n;

        public e(AbstractC2542p abstractC2542p, int i10) {
            super(abstractC2542p, i10);
            b1();
        }

        public static boolean a1() {
            return a1.S();
        }

        private void b1() {
            d1(j0());
        }

        private void c1(int i10) {
            d1(k0(i10));
        }

        private void d1(AbstractC2516c abstractC2516c) {
            if (!abstractC2516c.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            b0();
            this.f112873c.addFirst(abstractC2516c);
            this.f112890h = abstractC2516c;
            this.f112891i = abstractC2516c.a();
            int iB = abstractC2516c.b();
            this.f112893k = abstractC2516c.e() + iB;
            long jG = abstractC2516c.g() + iB;
            this.f112892j = jG;
            this.f112894l = jG - 1;
            long j10 = this.f112893k - 1;
            this.f112895m = j10;
            this.f112896n = j10;
        }

        private void f1(int i10) {
            byte[] bArr = this.f112891i;
            long j10 = this.f112896n;
            this.f112896n = j10 - 1;
            a1.d0(bArr, j10, (byte) (i10 >>> 28));
            byte[] bArr2 = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr2, j11, (byte) (((i10 >>> 21) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr3, j12, (byte) (((i10 >>> 14) & 127) | 128));
            byte[] bArr4 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr4, j13, (byte) (((i10 >>> 7) & 127) | 128));
            byte[] bArr5 = this.f112891i;
            long j14 = this.f112896n;
            this.f112896n = j14 - 1;
            a1.d0(bArr5, j14, (byte) ((i10 & 127) | 128));
        }

        private void g1(int i10) {
            byte[] bArr = this.f112891i;
            long j10 = this.f112896n;
            this.f112896n = j10 - 1;
            a1.d0(bArr, j10, (byte) (i10 >>> 21));
            byte[] bArr2 = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr2, j11, (byte) (((i10 >>> 14) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr3, j12, (byte) (((i10 >>> 7) & 127) | 128));
            byte[] bArr4 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr4, j13, (byte) ((i10 & 127) | 128));
        }

        private void h1(int i10) {
            byte[] bArr = this.f112891i;
            long j10 = this.f112896n;
            this.f112896n = j10 - 1;
            a1.d0(bArr, j10, (byte) i10);
        }

        private void i1(int i10) {
            byte[] bArr = this.f112891i;
            long j10 = this.f112896n;
            this.f112896n = j10 - 1;
            a1.d0(bArr, j10, (byte) (i10 >>> 14));
            byte[] bArr2 = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr2, j11, (byte) (((i10 >>> 7) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr3, j12, (byte) ((i10 & 127) | 128));
        }

        private void j1(int i10) {
            byte[] bArr = this.f112891i;
            long j10 = this.f112896n;
            this.f112896n = j10 - 1;
            a1.d0(bArr, j10, (byte) (i10 >>> 7));
            byte[] bArr2 = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr2, j11, (byte) ((i10 & 127) | 128));
        }

        private void k1(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) (j10 >>> 49));
            byte[] bArr2 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr2, j12, (byte) (((j10 >>> 42) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr3, j13, (byte) (((j10 >>> 35) & 127) | 128));
            byte[] bArr4 = this.f112891i;
            long j14 = this.f112896n;
            this.f112896n = j14 - 1;
            a1.d0(bArr4, j14, (byte) (((j10 >>> 28) & 127) | 128));
            byte[] bArr5 = this.f112891i;
            long j15 = this.f112896n;
            this.f112896n = j15 - 1;
            a1.d0(bArr5, j15, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr6 = this.f112891i;
            long j16 = this.f112896n;
            this.f112896n = j16 - 1;
            a1.d0(bArr6, j16, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr7 = this.f112891i;
            long j17 = this.f112896n;
            this.f112896n = j17 - 1;
            a1.d0(bArr7, j17, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr8 = this.f112891i;
            long j18 = this.f112896n;
            this.f112896n = j18 - 1;
            a1.d0(bArr8, j18, (byte) ((j10 & 127) | 128));
        }

        private void l1(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) (j10 >>> 28));
            byte[] bArr2 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr2, j12, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr3, j13, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr4 = this.f112891i;
            long j14 = this.f112896n;
            this.f112896n = j14 - 1;
            a1.d0(bArr4, j14, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr5 = this.f112891i;
            long j15 = this.f112896n;
            this.f112896n = j15 - 1;
            a1.d0(bArr5, j15, (byte) ((j10 & 127) | 128));
        }

        private void m1(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) (j10 >>> 21));
            byte[] bArr2 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr2, j12, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr3, j13, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr4 = this.f112891i;
            long j14 = this.f112896n;
            this.f112896n = j14 - 1;
            a1.d0(bArr4, j14, (byte) ((j10 & 127) | 128));
        }

        private void n1(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) (j10 >>> 56));
            byte[] bArr2 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr2, j12, (byte) (((j10 >>> 49) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr3, j13, (byte) (((j10 >>> 42) & 127) | 128));
            byte[] bArr4 = this.f112891i;
            long j14 = this.f112896n;
            this.f112896n = j14 - 1;
            a1.d0(bArr4, j14, (byte) (((j10 >>> 35) & 127) | 128));
            byte[] bArr5 = this.f112891i;
            long j15 = this.f112896n;
            this.f112896n = j15 - 1;
            a1.d0(bArr5, j15, (byte) (((j10 >>> 28) & 127) | 128));
            byte[] bArr6 = this.f112891i;
            long j16 = this.f112896n;
            this.f112896n = j16 - 1;
            a1.d0(bArr6, j16, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr7 = this.f112891i;
            long j17 = this.f112896n;
            this.f112896n = j17 - 1;
            a1.d0(bArr7, j17, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr8 = this.f112891i;
            long j18 = this.f112896n;
            this.f112896n = j18 - 1;
            a1.d0(bArr8, j18, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr9 = this.f112891i;
            long j19 = this.f112896n;
            this.f112896n = j19 - 1;
            a1.d0(bArr9, j19, (byte) ((j10 & 127) | 128));
        }

        private void o1(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) j10);
        }

        private void p1(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) (j10 >>> 42));
            byte[] bArr2 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr2, j12, (byte) (((j10 >>> 35) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr3, j13, (byte) (((j10 >>> 28) & 127) | 128));
            byte[] bArr4 = this.f112891i;
            long j14 = this.f112896n;
            this.f112896n = j14 - 1;
            a1.d0(bArr4, j14, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr5 = this.f112891i;
            long j15 = this.f112896n;
            this.f112896n = j15 - 1;
            a1.d0(bArr5, j15, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr6 = this.f112891i;
            long j16 = this.f112896n;
            this.f112896n = j16 - 1;
            a1.d0(bArr6, j16, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr7 = this.f112891i;
            long j17 = this.f112896n;
            this.f112896n = j17 - 1;
            a1.d0(bArr7, j17, (byte) ((j10 & 127) | 128));
        }

        private void q1(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) (j10 >>> 35));
            byte[] bArr2 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr2, j12, (byte) (((j10 >>> 28) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr3, j13, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr4 = this.f112891i;
            long j14 = this.f112896n;
            this.f112896n = j14 - 1;
            a1.d0(bArr4, j14, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr5 = this.f112891i;
            long j15 = this.f112896n;
            this.f112896n = j15 - 1;
            a1.d0(bArr5, j15, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr6 = this.f112891i;
            long j16 = this.f112896n;
            this.f112896n = j16 - 1;
            a1.d0(bArr6, j16, (byte) ((j10 & 127) | 128));
        }

        private void r1(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) (j10 >>> 63));
            byte[] bArr2 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr2, j12, (byte) (((j10 >>> 56) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr3, j13, (byte) (((j10 >>> 49) & 127) | 128));
            byte[] bArr4 = this.f112891i;
            long j14 = this.f112896n;
            this.f112896n = j14 - 1;
            a1.d0(bArr4, j14, (byte) (((j10 >>> 42) & 127) | 128));
            byte[] bArr5 = this.f112891i;
            long j15 = this.f112896n;
            this.f112896n = j15 - 1;
            a1.d0(bArr5, j15, (byte) (((j10 >>> 35) & 127) | 128));
            byte[] bArr6 = this.f112891i;
            long j16 = this.f112896n;
            this.f112896n = j16 - 1;
            a1.d0(bArr6, j16, (byte) (((j10 >>> 28) & 127) | 128));
            byte[] bArr7 = this.f112891i;
            long j17 = this.f112896n;
            this.f112896n = j17 - 1;
            a1.d0(bArr7, j17, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr8 = this.f112891i;
            long j18 = this.f112896n;
            this.f112896n = j18 - 1;
            a1.d0(bArr8, j18, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr9 = this.f112891i;
            long j19 = this.f112896n;
            this.f112896n = j19 - 1;
            a1.d0(bArr9, j19, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr10 = this.f112891i;
            long j20 = this.f112896n;
            this.f112896n = j20 - 1;
            a1.d0(bArr10, j20, (byte) ((j10 & 127) | 128));
        }

        private void s1(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) (((int) j10) >>> 14));
            byte[] bArr2 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr2, j12, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr3 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr3, j13, (byte) ((j10 & 127) | 128));
        }

        private void t1(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) (j10 >>> 7));
            byte[] bArr2 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr2, j12, (byte) ((((int) j10) & 127) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void A0(long j10) {
            byte[] bArr = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr, j11, (byte) (((int) (j10 >> 56)) & 255));
            byte[] bArr2 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr2, j12, (byte) (((int) (j10 >> 48)) & 255));
            byte[] bArr3 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr3, j13, (byte) (((int) (j10 >> 40)) & 255));
            byte[] bArr4 = this.f112891i;
            long j14 = this.f112896n;
            this.f112896n = j14 - 1;
            a1.d0(bArr4, j14, (byte) (((int) (j10 >> 32)) & 255));
            byte[] bArr5 = this.f112891i;
            long j15 = this.f112896n;
            this.f112896n = j15 - 1;
            a1.d0(bArr5, j15, (byte) (((int) (j10 >> 24)) & 255));
            byte[] bArr6 = this.f112891i;
            long j16 = this.f112896n;
            this.f112896n = j16 - 1;
            a1.d0(bArr6, j16, (byte) (((int) (j10 >> 16)) & 255));
            byte[] bArr7 = this.f112891i;
            long j17 = this.f112896n;
            this.f112896n = j17 - 1;
            a1.d0(bArr7, j17, (byte) (((int) (j10 >> 8)) & 255));
            byte[] bArr8 = this.f112891i;
            long j18 = this.f112896n;
            this.f112896n = j18 - 1;
            a1.d0(bArr8, j18, (byte) (((int) j10) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void F(int i10, Object obj, G0 g02) throws IOException {
            R0(i10, 4);
            g02.c(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void F0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void K(int i10, Object obj) throws IOException {
            int iC0 = c0();
            A0.a().k(obj, this);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void K0(int i10) {
            W0(CodedOutputStream.c1(i10));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void N0(long j10) {
            X0(CodedOutputStream.d1(j10));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void O(int i10, Object obj) throws IOException {
            R0(i10, 4);
            A0.a().k(obj, this);
            R0(i10, 3);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void Q0(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC2534l.e.Q0(java.lang.String):void");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void R0(int i10, int i11) {
            W0((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void S(int i10, int i11) {
            r0(10);
            K0(i11);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void T(byte b10) {
            byte[] bArr = this.f112891i;
            long j10 = this.f112896n;
            this.f112896n = j10 - 1;
            a1.d0(bArr, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void U(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            r0(iRemaining);
            long j10 = this.f112896n - ((long) iRemaining);
            this.f112896n = j10;
            byteBuffer.get(this.f112891i, ((int) j10) + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void V(byte[] bArr, int i10, int i11) {
            if (i10 < 0 || i10 + i11 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            r0(i11);
            long j10 = this.f112896n - ((long) i11);
            this.f112896n = j10;
            System.arraycopy(bArr, i10, this.f112891i, ((int) j10) + 1, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void W(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (e1() < iRemaining) {
                this.f112874d += iRemaining;
                this.f112873c.addFirst(AbstractC2516c.j(byteBuffer));
                b1();
            }
            long j10 = this.f112896n - ((long) iRemaining);
            this.f112896n = j10;
            byteBuffer.get(this.f112891i, ((int) j10) + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void W0(int i10) {
            if ((i10 & (-128)) == 0) {
                h1(i10);
                return;
            }
            if ((i10 & (-16384)) == 0) {
                j1(i10);
                return;
            }
            if (((-2097152) & i10) == 0) {
                i1(i10);
            } else if (((-268435456) & i10) == 0) {
                g1(i10);
            } else {
                f1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public void X(byte[] bArr, int i10, int i11) {
            if (i10 < 0 || i10 + i11 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            if (e1() < i11) {
                this.f112874d += i11;
                this.f112873c.addFirst(AbstractC2516c.l(bArr, i10, i11));
                b1();
            } else {
                long j10 = this.f112896n - ((long) i11);
                this.f112896n = j10;
                System.arraycopy(bArr, i10, this.f112891i, ((int) j10) + 1, i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void X0(long j10) {
            switch (AbstractC2534l.a0(j10)) {
                case 1:
                    o1(j10);
                    break;
                case 2:
                    t1(j10);
                    break;
                case 3:
                    s1(j10);
                    break;
                case 4:
                    m1(j10);
                    break;
                case 5:
                    l1(j10);
                    break;
                case 6:
                    q1(j10);
                    break;
                case 7:
                    p1(j10);
                    break;
                case 8:
                    k1(j10);
                    break;
                case 9:
                    n1(j10);
                    break;
                case 10:
                    r1(j10);
                    break;
            }
        }

        public final int Y0() {
            return (int) this.f112896n;
        }

        public int Z0() {
            return (int) (this.f112895m - this.f112896n);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void b0() {
            if (this.f112890h != null) {
                this.f112874d = Z0() + this.f112874d;
                AbstractC2516c abstractC2516c = this.f112890h;
                abstractC2516c.h((((int) this.f112896n) - abstractC2516c.b()) + 1);
                this.f112890h = null;
                this.f112896n = 0L;
                this.f112895m = 0L;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void c(int i10, int i11) {
            r0(9);
            x0(i11);
            R0(i10, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public int c0() {
            return Z0() + this.f112874d;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void e(int i10, String str) {
            int iC0 = c0();
            Q0(str);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        public int e1() {
            return (int) (this.f112896n - this.f112894l);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void f(int i10, long j10) {
            r0(15);
            X0(j10);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void h(int i10, int i11) {
            r0(15);
            F0(i11);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void i(int i10, ByteString byteString) {
            try {
                byteString.n0(this);
                r0(10);
                W0(byteString.size());
                R0(i10, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void k(int i10, Object obj, G0 g02) throws IOException {
            int iC0 = c0();
            g02.c(obj, this);
            int iC02 = c0() - iC0;
            r0(10);
            W0(iC02);
            R0(i10, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void m(int i10, long j10) {
            r0(15);
            N0(j10);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void o(int i10, int i11) {
            r0(10);
            W0(i11);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void q(int i10, long j10) {
            r0(13);
            A0(j10);
            R0(i10, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void r0(int i10) {
            if (e1() < i10) {
                c1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void s(int i10, boolean z10) {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void u(int i10) {
            R0(i10, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void w(int i10) {
            R0(i10, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2534l
        public void x0(int i10) {
            byte[] bArr = this.f112891i;
            long j10 = this.f112896n;
            this.f112896n = j10 - 1;
            a1.d0(bArr, j10, (byte) ((i10 >> 24) & 255));
            byte[] bArr2 = this.f112891i;
            long j11 = this.f112896n;
            this.f112896n = j11 - 1;
            a1.d0(bArr2, j11, (byte) ((i10 >> 16) & 255));
            byte[] bArr3 = this.f112891i;
            long j12 = this.f112896n;
            this.f112896n = j12 - 1;
            a1.d0(bArr3, j12, (byte) ((i10 >> 8) & 255));
            byte[] bArr4 = this.f112891i;
            long j13 = this.f112896n;
            this.f112896n = j13 - 1;
            a1.d0(bArr4, j13, (byte) (i10 & 255));
        }
    }

    public AbstractC2534l(AbstractC2542p abstractC2542p, int i10) {
        this.f112873c = new ArrayDeque<>(4);
        if (i10 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        V.e(abstractC2542p, "alloc");
        this.f112871a = abstractC2542p;
        this.f112872b = i10;
    }

    public static final void J0(Writer writer, int i10, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f112875a[fieldType.ordinal()]) {
            case 1:
                writer.s(i10, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.c(i10, ((Integer) obj).intValue());
                return;
            case 3:
                writer.q(i10, ((Long) obj).longValue());
                return;
            case 4:
                writer.h(i10, ((Integer) obj).intValue());
                return;
            case 5:
                writer.L(i10, ((Long) obj).longValue());
                return;
            case 6:
                writer.t(i10, ((Integer) obj).intValue());
                return;
            case 7:
                writer.C(i10, ((Long) obj).longValue());
                return;
            case 8:
                writer.S(i10, ((Integer) obj).intValue());
                return;
            case 9:
                writer.m(i10, ((Long) obj).longValue());
                return;
            case 10:
                writer.e(i10, (String) obj);
                return;
            case 11:
                writer.o(i10, ((Integer) obj).intValue());
                return;
            case 12:
                writer.f(i10, ((Long) obj).longValue());
                return;
            case 13:
                writer.P(i10, ((Float) obj).floatValue());
                return;
            case 14:
                writer.G(i10, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.K(i10, obj);
                return;
            case 16:
                writer.i(i10, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof V.c) {
                    writer.Q(i10, ((V.c) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.Q(i10, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    public static byte a0(long j10) {
        byte b10;
        if (((-128) & j10) == 0) {
            return (byte) 1;
        }
        if (j10 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j10) != 0) {
            b10 = (byte) 6;
            j10 >>>= 28;
        } else {
            b10 = 2;
        }
        if ((CoroutineScheduler.f220658x & j10) != 0) {
            b10 = (byte) (b10 + 2);
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? (byte) (b10 + 1) : b10;
    }

    public static boolean d0() {
        return a1.T();
    }

    public static boolean e0() {
        return a1.S();
    }

    public static AbstractC2534l h0(AbstractC2542p abstractC2542p) {
        return i0(abstractC2542p, 4096);
    }

    public static AbstractC2534l i0(AbstractC2542p abstractC2542p, int i10) {
        return a1.T() ? p0(abstractC2542p, i10) : new b(abstractC2542p, i10);
    }

    public static AbstractC2534l l0(AbstractC2542p abstractC2542p) {
        return m0(abstractC2542p, 4096);
    }

    public static AbstractC2534l m0(AbstractC2542p abstractC2542p, int i10) {
        return a1.S() ? q0(abstractC2542p, i10) : new c(abstractC2542p, i10);
    }

    public static AbstractC2534l n0(AbstractC2542p abstractC2542p, int i10) {
        return new b(abstractC2542p, i10);
    }

    public static AbstractC2534l o0(AbstractC2542p abstractC2542p, int i10) {
        return new c(abstractC2542p, i10);
    }

    public static AbstractC2534l p0(AbstractC2542p abstractC2542p, int i10) {
        if (a1.T()) {
            return new d(abstractC2542p, i10);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    public static AbstractC2534l q0(AbstractC2542p abstractC2542p, int i10) {
        if (a1.S()) {
            return new e(abstractC2542p, i10);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void A(int i10, List<String> list) throws IOException {
        if (!(list instanceof InterfaceC2513a0)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                e(i10, list.get(size));
            }
            return;
        }
        InterfaceC2513a0 interfaceC2513a0 = (InterfaceC2513a0) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            I0(i10, interfaceC2513a0.U3(size2));
        }
    }

    public abstract void A0(long j10);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void B(int i10, List<?> list, G0 g02) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            F(i10, list.get(size), g02);
        }
    }

    public final void B0(int i10, C2519d0 c2519d0, boolean z10) throws IOException {
        if (!z10) {
            for (int i11 = c2519d0.f112837d - 1; i11 >= 0; i11--) {
                q(i10, c2519d0.getLong(i11));
            }
            return;
        }
        r0((c2519d0.f112837d * 8) + 10);
        int iC0 = c0();
        for (int i12 = c2519d0.f112837d - 1; i12 >= 0; i12--) {
            A0(c2519d0.getLong(i12));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void C(int i10, long j10) throws IOException {
        q(i10, j10);
    }

    public final void C0(int i10, List<Long> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                q(i10, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 8) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(list.get(size2).longValue());
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void D(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof C2519d0) {
            O0(i10, (C2519d0) list, z10);
        } else {
            P0(i10, list, z10);
        }
    }

    public final void D0(int i10, O o10, boolean z10) throws IOException {
        if (!z10) {
            for (int i11 = o10.f112671d - 1; i11 >= 0; i11--) {
                P(i10, o10.getFloat(i11));
            }
            return;
        }
        r0((o10.f112671d * 4) + 10);
        int iC0 = c0();
        for (int i12 = o10.f112671d - 1; i12 >= 0; i12--) {
            x0(Float.floatToRawIntBits(o10.getFloat(i12)));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void E(int i10, List<Integer> list, boolean z10) throws IOException {
        g(i10, list, z10);
    }

    public final void E0(int i10, List<Float> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                P(i10, list.get(size).floatValue());
            }
            return;
        }
        r0((list.size() * 4) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    public abstract void F0(int i10);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void G(int i10, double d10) throws IOException {
        q(i10, Double.doubleToRawLongBits(d10));
    }

    public final void G0(int i10, U u10, boolean z10) throws IOException {
        if (!z10) {
            for (int i11 = u10.f112709d - 1; i11 >= 0; i11--) {
                h(i10, u10.getInt(i11));
            }
            return;
        }
        r0((u10.f112709d * 10) + 10);
        int iC0 = c0();
        for (int i12 = u10.f112709d - 1; i12 >= 0; i12--) {
            F0(u10.getInt(i12));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void H(int i10, List<Long> list, boolean z10) throws IOException {
        v(i10, list, z10);
    }

    public final void H0(int i10, List<Integer> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                h(i10, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            F0(list.get(size2).intValue());
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder I() {
        return Writer.FieldOrder.DESCENDING;
    }

    public final void I0(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            e(i10, (String) obj);
        } else {
            i(i10, (ByteString) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void J(int i10, List<?> list, G0 g02) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            k(i10, list.get(size), g02);
        }
    }

    public abstract void K0(int i10);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void L(int i10, long j10) throws IOException {
        f(i10, j10);
    }

    public final void L0(int i10, U u10, boolean z10) throws IOException {
        if (!z10) {
            for (int i11 = u10.f112709d - 1; i11 >= 0; i11--) {
                S(i10, u10.getInt(i11));
            }
            return;
        }
        r0((u10.f112709d * 5) + 10);
        int iC0 = c0();
        for (int i12 = u10.f112709d - 1; i12 >= 0; i12--) {
            K0(u10.getInt(i12));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void M(int i10, List<Integer> list, boolean z10) throws IOException {
        j(i10, list, z10);
    }

    public final void M0(int i10, List<Integer> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                S(i10, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 5) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            K0(list.get(size2).intValue());
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void N(int i10, List<Boolean> list, boolean z10) throws IOException {
        if (list instanceof C2540o) {
            t0(i10, (C2540o) list, z10);
        } else {
            u0(i10, list, z10);
        }
    }

    public abstract void N0(long j10);

    public final void O0(int i10, C2519d0 c2519d0, boolean z10) throws IOException {
        if (!z10) {
            for (int i11 = c2519d0.f112837d - 1; i11 >= 0; i11--) {
                m(i10, c2519d0.getLong(i11));
            }
            return;
        }
        r0((c2519d0.f112837d * 10) + 10);
        int iC0 = c0();
        for (int i12 = c2519d0.f112837d - 1; i12 >= 0; i12--) {
            N0(c2519d0.getLong(i12));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void P(int i10, float f10) throws IOException {
        c(i10, Float.floatToRawIntBits(f10));
    }

    public final void P0(int i10, List<Long> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                m(i10, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            N0(list.get(size2).longValue());
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void Q(int i10, int i11) throws IOException {
        h(i10, i11);
    }

    public abstract void Q0(String str);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void R(int i10, List<Long> list, boolean z10) throws IOException {
        p(i10, list, z10);
    }

    public abstract void R0(int i10, int i11);

    public final void S0(int i10, U u10, boolean z10) throws IOException {
        if (!z10) {
            for (int i11 = u10.f112709d - 1; i11 >= 0; i11--) {
                o(i10, u10.getInt(i11));
            }
            return;
        }
        r0((u10.f112709d * 5) + 10);
        int iC0 = c0();
        for (int i12 = u10.f112709d - 1; i12 >= 0; i12--) {
            W0(u10.getInt(i12));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    public final void T0(int i10, List<Integer> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                o(i10, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 5) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            W0(list.get(size2).intValue());
        }
        C2532k.a(this, iC0, i10, 2);
    }

    public final void U0(int i10, C2519d0 c2519d0, boolean z10) throws IOException {
        if (!z10) {
            for (int i11 = c2519d0.f112837d - 1; i11 >= 0; i11--) {
                f(i10, c2519d0.getLong(i11));
            }
            return;
        }
        r0((c2519d0.f112837d * 10) + 10);
        int iC0 = c0();
        for (int i12 = c2519d0.f112837d - 1; i12 >= 0; i12--) {
            X0(c2519d0.getLong(i12));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    public final void V0(int i10, List<Long> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                f(i10, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            X0(list.get(size2).longValue());
        }
        C2532k.a(this, iC0, i10, 2);
    }

    public abstract void W0(int i10);

    public abstract void X0(long j10);

    public final Queue<AbstractC2516c> Z() {
        b0();
        return this.f112873c;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void a(int i10, List<Float> list, boolean z10) throws IOException {
        if (list instanceof O) {
            D0(i10, (O) list, z10);
        } else {
            E0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void b(int i10, Object obj) throws IOException {
        R0(1, 4);
        if (obj instanceof ByteString) {
            i(3, (ByteString) obj);
        } else {
            K(3, obj);
        }
        o(2, i10);
        R0(1, 3);
    }

    public abstract void b0();

    public abstract int c0();

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void d(int i10, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            O(i10, list.get(size));
        }
    }

    public final AbstractC2516c f0() {
        return this.f112871a.a(this.f112872b);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void g(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof U) {
            G0(i10, (U) list, z10);
        } else {
            H0(i10, list, z10);
        }
    }

    public final AbstractC2516c g0(int i10) {
        return this.f112871a.a(Math.max(i10, this.f112872b));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void j(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof U) {
            y0(i10, (U) list, z10);
        } else {
            z0(i10, list, z10);
        }
    }

    public final AbstractC2516c j0() {
        return this.f112871a.b(this.f112872b);
    }

    public final AbstractC2516c k0(int i10) {
        return this.f112871a.b(Math.max(i10, this.f112872b));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void l(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof U) {
            S0(i10, (U) list, z10);
        } else {
            T0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void n(int i10, C2523f0.b<K, V> bVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int iC0 = c0();
            J0(this, 2, bVar.f112849c, entry.getValue());
            J0(this, 1, bVar.f112847a, entry.getKey());
            W0(c0() - iC0);
            R0(i10, 2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void p(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof C2519d0) {
            U0(i10, (C2519d0) list, z10);
        } else {
            V0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void r(int i10, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            K(i10, list.get(size));
        }
    }

    public abstract void r0(int i10);

    public abstract void s0(boolean z10);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void t(int i10, int i11) throws IOException {
        c(i10, i11);
    }

    public final void t0(int i10, C2540o c2540o, boolean z10) throws IOException {
        if (!z10) {
            for (int i11 = c2540o.f112903d - 1; i11 >= 0; i11--) {
                s(i10, c2540o.r(i11));
            }
            return;
        }
        r0(c2540o.f112903d + 10);
        int iC0 = c0();
        for (int i12 = c2540o.f112903d - 1; i12 >= 0; i12--) {
            s0(c2540o.r(i12));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    public final void u0(int i10, List<Boolean> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                s(i10, list.get(size).booleanValue());
            }
            return;
        }
        r0(list.size() + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            s0(list.get(size2).booleanValue());
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void v(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof C2519d0) {
            B0(i10, (C2519d0) list, z10);
        } else {
            C0(i10, list, z10);
        }
    }

    public final void v0(int i10, C2555w c2555w, boolean z10) throws IOException {
        if (!z10) {
            for (int i11 = c2555w.f113011d - 1; i11 >= 0; i11--) {
                G(i10, c2555w.getDouble(i11));
            }
            return;
        }
        r0((c2555w.f113011d * 8) + 10);
        int iC0 = c0();
        for (int i12 = c2555w.f113011d - 1; i12 >= 0; i12--) {
            A0(Double.doubleToRawLongBits(c2555w.getDouble(i12)));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    public final void w0(int i10, List<Double> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                G(i10, list.get(size).doubleValue());
            }
            return;
        }
        r0((list.size() * 8) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void x(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof U) {
            L0(i10, (U) list, z10);
        } else {
            M0(i10, list, z10);
        }
    }

    public abstract void x0(int i10);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void y(int i10, List<Double> list, boolean z10) throws IOException {
        if (list instanceof C2555w) {
            v0(i10, (C2555w) list, z10);
        } else {
            w0(i10, list, z10);
        }
    }

    public final void y0(int i10, U u10, boolean z10) throws IOException {
        if (!z10) {
            for (int i11 = u10.f112709d - 1; i11 >= 0; i11--) {
                c(i10, u10.getInt(i11));
            }
            return;
        }
        r0((u10.f112709d * 4) + 10);
        int iC0 = c0();
        for (int i12 = u10.f112709d - 1; i12 >= 0; i12--) {
            x0(u10.getInt(i12));
        }
        C2532k.a(this, iC0, i10, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void z(int i10, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            i(i10, list.get(size));
        }
    }

    public final void z0(int i10, List<Integer> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c(i10, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 4) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(list.get(size2).intValue());
        }
        C2532k.a(this, iC0, i10, 2);
    }

    public /* synthetic */ AbstractC2534l(AbstractC2542p abstractC2542p, int i10, a aVar) {
        this(abstractC2542p, i10);
    }
}
