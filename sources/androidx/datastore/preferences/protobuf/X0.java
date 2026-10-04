package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class X0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f112771f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final X0 f112772g = new X0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f112774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f112775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f112777e;

    public X0() {
        this(0, new int[8], new Object[8], true);
    }

    public static boolean c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static X0 e() {
        return f112772g;
    }

    public static int h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    public static int i(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    public static X0 o(X0 x02, X0 x03) {
        int i10 = x02.f112773a + x03.f112773a;
        int[] iArrCopyOf = Arrays.copyOf(x02.f112774b, i10);
        System.arraycopy(x03.f112774b, 0, iArrCopyOf, x02.f112773a, x03.f112773a);
        Object[] objArrCopyOf = Arrays.copyOf(x02.f112775c, i10);
        System.arraycopy(x03.f112775c, 0, objArrCopyOf, x02.f112773a, x03.f112773a);
        return new X0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static X0 p() {
        return new X0();
    }

    public static void u(int i10, Object obj, Writer writer) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            writer.L(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            writer.q(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            writer.i(i11, (ByteString) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.j());
            }
            writer.c(i11, ((Integer) obj).intValue());
        } else if (writer.I() == Writer.FieldOrder.ASCENDING) {
            writer.u(i11);
            ((X0) obj).w(writer);
            writer.w(i11);
        } else {
            writer.w(i11);
            ((X0) obj).w(writer);
            writer.u(i11);
        }
    }

    public void a() {
        if (!this.f112777e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        int i10 = this.f112773a;
        int[] iArr = this.f112774b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f112774b = Arrays.copyOf(iArr, i11);
            this.f112775c = Arrays.copyOf(this.f112775c, i11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof X0)) {
            return false;
        }
        X0 x02 = (X0) obj;
        int i10 = this.f112773a;
        return i10 == x02.f112773a && c(this.f112774b, x02.f112774b, i10) && d(this.f112775c, x02.f112775c, this.f112773a);
    }

    public int f() {
        int iA1;
        int i10 = this.f112776d;
        if (i10 != -1) {
            return i10;
        }
        int iF = 0;
        for (int i11 = 0; i11 < this.f112773a; i11++) {
            int i12 = this.f112774b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iA1 = CodedOutputStream.a1(i13, ((Long) this.f112775c[i11]).longValue());
            } else if (i14 == 1) {
                iA1 = CodedOutputStream.o0(i13, ((Long) this.f112775c[i11]).longValue());
            } else if (i14 == 2) {
                iA1 = CodedOutputStream.g0(i13, (ByteString) this.f112775c[i11]);
            } else if (i14 == 3) {
                iF = ((X0) this.f112775c[i11]).f() + (CodedOutputStream.X0(i13) * 2) + iF;
            } else {
                if (i14 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.j());
                }
                iA1 = CodedOutputStream.m0(i13, ((Integer) this.f112775c[i11]).intValue());
            }
            iF = iA1 + iF;
        }
        this.f112776d = iF;
        return iF;
    }

    public int g() {
        int i10 = this.f112776d;
        if (i10 != -1) {
            return i10;
        }
        int iK0 = 0;
        for (int i11 = 0; i11 < this.f112773a; i11++) {
            iK0 += CodedOutputStream.K0(this.f112774b[i11] >>> 3, (ByteString) this.f112775c[i11]);
        }
        this.f112776d = iK0;
        return iK0;
    }

    public int hashCode() {
        int i10 = this.f112773a;
        return i(this.f112775c, this.f112773a) + ((h(this.f112774b, i10) + ((527 + i10) * 31)) * 31);
    }

    public void j() {
        this.f112777e = false;
    }

    public boolean k(int i10, AbstractC2549t abstractC2549t) throws IOException {
        a();
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            r(i10, Long.valueOf(abstractC2549t.G()));
            return true;
        }
        if (i12 == 1) {
            r(i10, Long.valueOf(abstractC2549t.B()));
            return true;
        }
        if (i12 == 2) {
            r(i10, abstractC2549t.x());
            return true;
        }
        if (i12 == 3) {
            X0 x02 = new X0();
            x02.l(abstractC2549t);
            abstractC2549t.a((i11 << 3) | 4);
            r(i10, x02);
            return true;
        }
        if (i12 == 4) {
            return false;
        }
        if (i12 != 5) {
            throw InvalidProtocolBufferException.j();
        }
        r(i10, Integer.valueOf(abstractC2549t.A()));
        return true;
    }

    public final X0 l(AbstractC2549t abstractC2549t) throws IOException {
        int iY;
        do {
            iY = abstractC2549t.Y();
            if (iY == 0) {
                break;
            }
        } while (k(iY, abstractC2549t));
        return this;
    }

    public X0 m(int i10, ByteString byteString) {
        a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r((i10 << 3) | 2, byteString);
        return this;
    }

    public X0 n(int i10, int i11) {
        a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(i10 << 3, Long.valueOf(i11));
        return this;
    }

    public final void q(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f112773a; i11++) {
            C2537m0.c(sb2, i10, String.valueOf(this.f112774b[i11] >>> 3), this.f112775c[i11]);
        }
    }

    public void r(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f112774b;
        int i11 = this.f112773a;
        iArr[i11] = i10;
        this.f112775c[i11] = obj;
        this.f112773a = i11 + 1;
    }

    public void s(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f112773a; i10++) {
            codedOutputStream.Y1(this.f112774b[i10] >>> 3, (ByteString) this.f112775c[i10]);
        }
    }

    public void t(Writer writer) throws IOException {
        if (writer.I() == Writer.FieldOrder.DESCENDING) {
            for (int i10 = this.f112773a - 1; i10 >= 0; i10--) {
                writer.b(this.f112774b[i10] >>> 3, this.f112775c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f112773a; i11++) {
            writer.b(this.f112774b[i11] >>> 3, this.f112775c[i11]);
        }
    }

    public void v(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f112773a; i10++) {
            int i11 = this.f112774b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                codedOutputStream.f(i12, ((Long) this.f112775c[i10]).longValue());
            } else if (i13 == 1) {
                codedOutputStream.q(i12, ((Long) this.f112775c[i10]).longValue());
            } else if (i13 == 2) {
                codedOutputStream.i(i12, (ByteString) this.f112775c[i10]);
            } else if (i13 == 3) {
                codedOutputStream.g2(i12, 3);
                ((X0) this.f112775c[i10]).v(codedOutputStream);
                codedOutputStream.g2(i12, 4);
            } else {
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.j();
                }
                codedOutputStream.c(i12, ((Integer) this.f112775c[i10]).intValue());
            }
        }
    }

    public void w(Writer writer) throws IOException {
        if (this.f112773a == 0) {
            return;
        }
        if (writer.I() == Writer.FieldOrder.ASCENDING) {
            for (int i10 = 0; i10 < this.f112773a; i10++) {
                u(this.f112774b[i10], this.f112775c[i10], writer);
            }
            return;
        }
        for (int i11 = this.f112773a - 1; i11 >= 0; i11--) {
            u(this.f112774b[i11], this.f112775c[i11], writer);
        }
    }

    public X0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f112776d = -1;
        this.f112773a = i10;
        this.f112774b = iArr;
        this.f112775c = objArr;
        this.f112777e = z10;
    }
}
