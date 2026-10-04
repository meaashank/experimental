package kotlin;

import kotlin.jvm.internal.C4969v;
import md.C5224C;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.5")
@dd.h
public final class H0 implements Comparable<H0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f217453b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final short f217454c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final short f217455d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f217456e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f217457f = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f217458a;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @InterfaceC4850b0
    @Xc.g
    public /* synthetic */ H0(short s10) {
        this.f217458a = s10;
    }

    @Xc.g
    @Xc.f
    public static final long A(short s10, long j10) {
        return (((long) s10) & Nd.g.f65032t) - j10;
    }

    @Xc.g
    @Xc.f
    public static final int B(short s10, int i10) {
        return (s10 & 65535) - i10;
    }

    @Xc.g
    @Xc.f
    public static final int C(short s10, short s11) {
        return (s10 & f217455d) - (s11 & f217455d);
    }

    @Xc.g
    @Xc.f
    public static final byte D(short s10, byte b10) {
        return (byte) C4985p0.a(s10 & f217455d, b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long E(short s10, long j10) {
        return q0.a(((long) s10) & Nd.g.f65032t, j10);
    }

    @Xc.g
    @Xc.f
    public static final int F(short s10, int i10) {
        return C4985p0.a(s10 & f217455d, i10);
    }

    @Xc.g
    @Xc.f
    public static final short G(short s10, short s11) {
        return (short) C4985p0.a(s10 & f217455d, s11 & f217455d);
    }

    @Xc.g
    @Xc.f
    public static final short H(short s10, short s11) {
        return (short) (s10 | s11);
    }

    @Xc.g
    @Xc.f
    public static final int I(short s10, byte b10) {
        return (s10 & f217455d) + (b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long J(short s10, long j10) {
        return (((long) s10) & Nd.g.f65032t) + j10;
    }

    @Xc.g
    @Xc.f
    public static final int K(short s10, int i10) {
        return (s10 & 65535) + i10;
    }

    @Xc.g
    @Xc.f
    public static final int L(short s10, short s11) {
        return (s10 & f217455d) + (s11 & f217455d);
    }

    @Xc.f
    public static final md.x M(short s10, short s11) {
        return new md.x(s10 & f217455d, s11 & f217455d, 1);
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @Xc.f
    public static final md.x N(short s10, short s11) {
        return C5224C.V(s10 & f217455d, s11 & f217455d);
    }

    @Xc.g
    @Xc.f
    public static final int O(short s10, byte b10) {
        return C4985p0.a(s10 & f217455d, b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long Q(short s10, long j10) {
        return q0.a(((long) s10) & Nd.g.f65032t, j10);
    }

    @Xc.g
    @Xc.f
    public static final int R(short s10, int i10) {
        return C4985p0.a(s10 & f217455d, i10);
    }

    @Xc.g
    @Xc.f
    public static final int S(short s10, short s11) {
        return C4985p0.a(s10 & f217455d, s11 & f217455d);
    }

    @Xc.g
    @Xc.f
    public static final int T(short s10, byte b10) {
        return (s10 & f217455d) * (b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long V(short s10, long j10) {
        return (((long) s10) & Nd.g.f65032t) * j10;
    }

    @Xc.g
    @Xc.f
    public static final int W(short s10, int i10) {
        return (s10 & 65535) * i10;
    }

    @Xc.g
    @Xc.f
    public static final int X(short s10, short s11) {
        return (s10 & f217455d) * (s11 & f217455d);
    }

    @Xc.g
    @Xc.f
    public static final byte Y(short s10) {
        return (byte) s10;
    }

    @Xc.g
    @Xc.f
    public static final double Z(short s10) {
        return N0.h(s10 & f217455d);
    }

    @Xc.g
    @Xc.f
    public static final short a(short s10, short s11) {
        return (short) (s10 & s11);
    }

    @Xc.g
    @Xc.f
    public static final float a0(short s10) {
        return (float) N0.h(s10 & f217455d);
    }

    public static final /* synthetic */ H0 b(short s10) {
        return new H0(s10);
    }

    @Xc.g
    @Xc.f
    public static final int b0(short s10) {
        return s10 & f217455d;
    }

    @Xc.g
    @Xc.f
    public static final int c(short s10, byte b10) {
        return kotlin.jvm.internal.G.t(s10 & f217455d, b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long c0(short s10) {
        return ((long) s10) & Nd.g.f65032t;
    }

    @Xc.g
    @Xc.f
    public static final int d(short s10, long j10) {
        return Long.compare((((long) s10) & Nd.g.f65032t) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @Xc.g
    @Xc.f
    public static final short d0(short s10) {
        return s10;
    }

    @Xc.g
    @Xc.f
    public static final int e(short s10, int i10) {
        return Integer.compare((s10 & f217455d) ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @Xc.g
    @NotNull
    public static String e0(short s10) {
        return String.valueOf(s10 & f217455d);
    }

    @Xc.g
    @Xc.f
    public static final byte f0(short s10) {
        return (byte) s10;
    }

    @Xc.g
    @Xc.f
    public static int g(short s10, short s11) {
        return kotlin.jvm.internal.G.t(s10 & f217455d, s11 & f217455d);
    }

    @Xc.g
    @Xc.f
    public static final int g0(short s10) {
        return s10 & f217455d;
    }

    @InterfaceC4850b0
    @Xc.g
    public static short h(short s10) {
        return s10;
    }

    @Xc.g
    @Xc.f
    public static final long h0(short s10) {
        return ((long) s10) & Nd.g.f65032t;
    }

    @Xc.f
    public static final short i(short s10) {
        return (short) (s10 - 1);
    }

    @Xc.g
    @Xc.f
    public static final short i0(short s10) {
        return s10;
    }

    @Xc.g
    @Xc.f
    public static final int j(short s10, byte b10) {
        return C4983o0.a(s10 & f217455d, b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long k(short s10, long j10) {
        return r0.a(((long) s10) & Nd.g.f65032t, j10);
    }

    @Xc.g
    @Xc.f
    public static final short k0(short s10, short s11) {
        return (short) (s10 ^ s11);
    }

    @Xc.g
    @Xc.f
    public static final int l(short s10, int i10) {
        return C4983o0.a(s10 & f217455d, i10);
    }

    @Xc.g
    @Xc.f
    public static final int m(short s10, short s11) {
        return C4983o0.a(s10 & f217455d, s11 & f217455d);
    }

    public static boolean n(short s10, Object obj) {
        return (obj instanceof H0) && s10 == ((H0) obj).f217458a;
    }

    public static final boolean p(short s10, short s11) {
        return s10 == s11;
    }

    @Xc.g
    @Xc.f
    public static final int r(short s10, byte b10) {
        return C4983o0.a(s10 & f217455d, b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long s(short s10, long j10) {
        return r0.a(((long) s10) & Nd.g.f65032t, j10);
    }

    @Xc.g
    @Xc.f
    public static final int t(short s10, int i10) {
        return C4983o0.a(s10 & f217455d, i10);
    }

    @Xc.g
    @Xc.f
    public static final int u(short s10, short s11) {
        return C4983o0.a(s10 & f217455d, s11 & f217455d);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void v() {
    }

    public static int w(short s10) {
        return s10;
    }

    @Xc.f
    public static final short x(short s10) {
        return (short) (s10 + 1);
    }

    @Xc.g
    @Xc.f
    public static final short y(short s10) {
        return (short) (~s10);
    }

    @Xc.g
    @Xc.f
    public static final int z(short s10, byte b10) {
        return (s10 & f217455d) - (b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(H0 h02) {
        return kotlin.jvm.internal.G.t(this.f217458a & f217455d, h02.f217458a & f217455d);
    }

    public boolean equals(Object obj) {
        return n(this.f217458a, obj);
    }

    @Xc.g
    @Xc.f
    public final int f(short s10) {
        return kotlin.jvm.internal.G.t(this.f217458a & f217455d, s10 & f217455d);
    }

    public int hashCode() {
        return this.f217458a;
    }

    public final /* synthetic */ short j0() {
        return this.f217458a;
    }

    @Xc.g
    @NotNull
    public String toString() {
        return e0(this.f217458a);
    }
}
