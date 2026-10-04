package kotlin;

import kotlin.jvm.internal.C4969v;
import md.C5224C;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.5")
@dd.h
public final class t0 implements Comparable<t0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f218216b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte f218217c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte f218218d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f218219e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f218220f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f218221a;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @InterfaceC4850b0
    @Xc.g
    public /* synthetic */ t0(byte b10) {
        this.f218221a = b10;
    }

    @Xc.g
    @Xc.f
    public static final long A(byte b10, long j10) {
        return (((long) b10) & 255) - j10;
    }

    @Xc.g
    @Xc.f
    public static final int B(byte b10, int i10) {
        return (b10 & 255) - i10;
    }

    @Xc.g
    @Xc.f
    public static final int C(byte b10, short s10) {
        return (b10 & 255) - (s10 & H0.f217455d);
    }

    @Xc.g
    @Xc.f
    public static final byte D(byte b10, byte b11) {
        return (byte) C4985p0.a(b10 & 255, b11 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long E(byte b10, long j10) {
        return q0.a(((long) b10) & 255, j10);
    }

    @Xc.g
    @Xc.f
    public static final int F(byte b10, int i10) {
        return C4985p0.a(b10 & 255, i10);
    }

    @Xc.g
    @Xc.f
    public static final short G(byte b10, short s10) {
        return (short) C4985p0.a(b10 & 255, s10 & H0.f217455d);
    }

    @Xc.g
    @Xc.f
    public static final byte H(byte b10, byte b11) {
        return (byte) (b10 | b11);
    }

    @Xc.g
    @Xc.f
    public static final int I(byte b10, byte b11) {
        return (b10 & 255) + (b11 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long J(byte b10, long j10) {
        return (((long) b10) & 255) + j10;
    }

    @Xc.g
    @Xc.f
    public static final int K(byte b10, int i10) {
        return (b10 & 255) + i10;
    }

    @Xc.g
    @Xc.f
    public static final int L(byte b10, short s10) {
        return (b10 & 255) + (s10 & H0.f217455d);
    }

    @Xc.f
    public static final md.x M(byte b10, byte b11) {
        return new md.x(b10 & 255, b11 & 255, 1);
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @Xc.f
    public static final md.x N(byte b10, byte b11) {
        return C5224C.V(b10 & 255, b11 & 255);
    }

    @Xc.g
    @Xc.f
    public static final int O(byte b10, byte b11) {
        return C4985p0.a(b10 & 255, b11 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long Q(byte b10, long j10) {
        return q0.a(((long) b10) & 255, j10);
    }

    @Xc.g
    @Xc.f
    public static final int R(byte b10, int i10) {
        return C4985p0.a(b10 & 255, i10);
    }

    @Xc.g
    @Xc.f
    public static final int S(byte b10, short s10) {
        return C4985p0.a(b10 & 255, s10 & H0.f217455d);
    }

    @Xc.g
    @Xc.f
    public static final int T(byte b10, byte b11) {
        return (b10 & 255) * (b11 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long V(byte b10, long j10) {
        return (((long) b10) & 255) * j10;
    }

    @Xc.g
    @Xc.f
    public static final int W(byte b10, int i10) {
        return (b10 & 255) * i10;
    }

    @Xc.g
    @Xc.f
    public static final int X(byte b10, short s10) {
        return (b10 & 255) * (s10 & H0.f217455d);
    }

    @Xc.g
    @Xc.f
    public static final byte Y(byte b10) {
        return b10;
    }

    @Xc.g
    @Xc.f
    public static final double Z(byte b10) {
        return N0.h(b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final byte a(byte b10, byte b11) {
        return (byte) (b10 & b11);
    }

    @Xc.g
    @Xc.f
    public static final float a0(byte b10) {
        return (float) N0.h(b10 & 255);
    }

    public static final /* synthetic */ t0 b(byte b10) {
        return new t0(b10);
    }

    @Xc.g
    @Xc.f
    public static final int b0(byte b10) {
        return b10 & 255;
    }

    @Xc.g
    @Xc.f
    public static final long c0(byte b10) {
        return ((long) b10) & 255;
    }

    @Xc.g
    @Xc.f
    public static int d(byte b10, byte b11) {
        return kotlin.jvm.internal.G.t(b10 & 255, b11 & 255);
    }

    @Xc.g
    @Xc.f
    public static final short d0(byte b10) {
        return (short) (b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final int e(byte b10, long j10) {
        return Long.compare((((long) b10) & 255) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @Xc.g
    @NotNull
    public static String e0(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final int f(byte b10, int i10) {
        return Integer.compare((b10 & 255) ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @Xc.g
    @Xc.f
    public static final byte f0(byte b10) {
        return b10;
    }

    @Xc.g
    @Xc.f
    public static final int g(byte b10, short s10) {
        return kotlin.jvm.internal.G.t(b10 & 255, s10 & H0.f217455d);
    }

    @Xc.g
    @Xc.f
    public static final int g0(byte b10) {
        return b10 & 255;
    }

    @InterfaceC4850b0
    @Xc.g
    public static byte h(byte b10) {
        return b10;
    }

    @Xc.g
    @Xc.f
    public static final long h0(byte b10) {
        return ((long) b10) & 255;
    }

    @Xc.f
    public static final byte i(byte b10) {
        return (byte) (b10 - 1);
    }

    @Xc.g
    @Xc.f
    public static final short i0(byte b10) {
        return (short) (b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final int j(byte b10, byte b11) {
        return C4983o0.a(b10 & 255, b11 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long k(byte b10, long j10) {
        return r0.a(((long) b10) & 255, j10);
    }

    @Xc.g
    @Xc.f
    public static final byte k0(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    @Xc.g
    @Xc.f
    public static final int l(byte b10, int i10) {
        return C4983o0.a(b10 & 255, i10);
    }

    @Xc.g
    @Xc.f
    public static final int m(byte b10, short s10) {
        return C4983o0.a(b10 & 255, s10 & H0.f217455d);
    }

    public static boolean n(byte b10, Object obj) {
        return (obj instanceof t0) && b10 == ((t0) obj).f218221a;
    }

    public static final boolean p(byte b10, byte b11) {
        return b10 == b11;
    }

    @Xc.g
    @Xc.f
    public static final int r(byte b10, byte b11) {
        return C4983o0.a(b10 & 255, b11 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long s(byte b10, long j10) {
        return r0.a(((long) b10) & 255, j10);
    }

    @Xc.g
    @Xc.f
    public static final int t(byte b10, int i10) {
        return C4983o0.a(b10 & 255, i10);
    }

    @Xc.g
    @Xc.f
    public static final int u(byte b10, short s10) {
        return C4983o0.a(b10 & 255, s10 & H0.f217455d);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void v() {
    }

    public static int w(byte b10) {
        return b10;
    }

    @Xc.f
    public static final byte x(byte b10) {
        return (byte) (b10 + 1);
    }

    @Xc.g
    @Xc.f
    public static final byte y(byte b10) {
        return (byte) (~b10);
    }

    @Xc.g
    @Xc.f
    public static final int z(byte b10, byte b11) {
        return (b10 & 255) - (b11 & 255);
    }

    @Xc.g
    @Xc.f
    public final int c(byte b10) {
        return kotlin.jvm.internal.G.t(this.f218221a & 255, b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(t0 t0Var) {
        return kotlin.jvm.internal.G.t(this.f218221a & 255, t0Var.f218221a & 255);
    }

    public boolean equals(Object obj) {
        return n(this.f218221a, obj);
    }

    public int hashCode() {
        return this.f218221a;
    }

    public final /* synthetic */ byte j0() {
        return this.f218221a;
    }

    @Xc.g
    @NotNull
    public String toString() {
        return e0(this.f218221a);
    }
}
