package kotlin;

import kotlin.jvm.internal.C4969v;
import md.C5224C;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.5")
@dd.h
public final class x0 implements Comparable<x0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f218493b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f218494c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f218495d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f218496e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f218497f = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f218498a;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @InterfaceC4850b0
    @Xc.g
    public /* synthetic */ x0(int i10) {
        this.f218498a = i10;
    }

    @Xc.g
    @Xc.f
    public static final long A(int i10, long j10) {
        return (((long) i10) & ZipKt.f225990j) - j10;
    }

    @Xc.g
    @Xc.f
    public static final int B(int i10, int i11) {
        return i10 - i11;
    }

    @Xc.g
    @Xc.f
    public static final int C(int i10, short s10) {
        return i10 - (s10 & H0.f217455d);
    }

    @Xc.g
    @Xc.f
    public static final byte D(int i10, byte b10) {
        return (byte) C4985p0.a(i10, b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long E(int i10, long j10) {
        return q0.a(((long) i10) & ZipKt.f225990j, j10);
    }

    @Xc.g
    @Xc.f
    public static final int F(int i10, int i11) {
        return C4985p0.a(i10, i11);
    }

    @Xc.g
    @Xc.f
    public static final short G(int i10, short s10) {
        return (short) C4985p0.a(i10, s10 & H0.f217455d);
    }

    @Xc.g
    @Xc.f
    public static final int H(int i10, int i11) {
        return i10 | i11;
    }

    @Xc.g
    @Xc.f
    public static final int I(int i10, byte b10) {
        return i10 + (b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long J(int i10, long j10) {
        return (((long) i10) & ZipKt.f225990j) + j10;
    }

    @Xc.g
    @Xc.f
    public static final int K(int i10, int i11) {
        return i10 + i11;
    }

    @Xc.g
    @Xc.f
    public static final int L(int i10, short s10) {
        return i10 + (s10 & H0.f217455d);
    }

    @Xc.f
    public static final md.x M(int i10, int i11) {
        return new md.x(i10, i11, 1);
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @Xc.f
    public static final md.x N(int i10, int i11) {
        return C5224C.V(i10, i11);
    }

    @Xc.g
    @Xc.f
    public static final int O(int i10, byte b10) {
        return C4985p0.a(i10, b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long Q(int i10, long j10) {
        return q0.a(((long) i10) & ZipKt.f225990j, j10);
    }

    @Xc.g
    @Xc.f
    public static final int R(int i10, int i11) {
        return N0.g(i10, i11);
    }

    @Xc.g
    @Xc.f
    public static final int S(int i10, short s10) {
        return C4985p0.a(i10, s10 & H0.f217455d);
    }

    @Xc.g
    @Xc.f
    public static final int T(int i10, int i11) {
        return i10 << i11;
    }

    @Xc.g
    @Xc.f
    public static final int V(int i10, int i11) {
        return i10 >>> i11;
    }

    @Xc.g
    @Xc.f
    public static final int W(int i10, byte b10) {
        return i10 * (b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long X(int i10, long j10) {
        return (((long) i10) & ZipKt.f225990j) * j10;
    }

    @Xc.g
    @Xc.f
    public static final int Y(int i10, int i11) {
        return i10 * i11;
    }

    @Xc.g
    @Xc.f
    public static final int Z(int i10, short s10) {
        return i10 * (s10 & H0.f217455d);
    }

    @Xc.g
    @Xc.f
    public static final int a(int i10, int i11) {
        return i10 & i11;
    }

    @Xc.g
    @Xc.f
    public static final byte a0(int i10) {
        return (byte) i10;
    }

    public static final /* synthetic */ x0 b(int i10) {
        return new x0(i10);
    }

    @Xc.g
    @Xc.f
    public static final double b0(int i10) {
        return N0.h(i10);
    }

    @Xc.g
    @Xc.f
    public static final int c(int i10, byte b10) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, (b10 & 255) ^ Integer.MIN_VALUE);
    }

    @Xc.g
    @Xc.f
    public static final float c0(int i10) {
        return (float) N0.h(i10);
    }

    @Xc.g
    @Xc.f
    public static final int d(int i10, long j10) {
        return Long.compare((((long) i10) & ZipKt.f225990j) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @Xc.g
    @Xc.f
    public static final int d0(int i10) {
        return i10;
    }

    @Xc.g
    @Xc.f
    public static final long e0(int i10) {
        return ((long) i10) & ZipKt.f225990j;
    }

    @Xc.g
    @Xc.f
    public static int f(int i10, int i11) {
        return N0.e(i10, i11);
    }

    @Xc.g
    @Xc.f
    public static final short f0(int i10) {
        return (short) i10;
    }

    @Xc.g
    @Xc.f
    public static final int g(int i10, short s10) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, (s10 & H0.f217455d) ^ Integer.MIN_VALUE);
    }

    @Xc.g
    @NotNull
    public static String g0(int i10) {
        return String.valueOf(((long) i10) & ZipKt.f225990j);
    }

    @InterfaceC4850b0
    @Xc.g
    public static int h(int i10) {
        return i10;
    }

    @Xc.g
    @Xc.f
    public static final byte h0(int i10) {
        return (byte) i10;
    }

    @Xc.f
    public static final int i(int i10) {
        return i10 - 1;
    }

    @Xc.g
    @Xc.f
    public static final int i0(int i10) {
        return i10;
    }

    @Xc.g
    @Xc.f
    public static final int j(int i10, byte b10) {
        return C4983o0.a(i10, b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long j0(int i10) {
        return ((long) i10) & ZipKt.f225990j;
    }

    @Xc.g
    @Xc.f
    public static final long k(int i10, long j10) {
        return r0.a(((long) i10) & ZipKt.f225990j, j10);
    }

    @Xc.g
    @Xc.f
    public static final short k0(int i10) {
        return (short) i10;
    }

    @Xc.g
    @Xc.f
    public static final int l(int i10, int i11) {
        return N0.f(i10, i11);
    }

    @Xc.g
    @Xc.f
    public static final int m(int i10, short s10) {
        return C4983o0.a(i10, s10 & H0.f217455d);
    }

    @Xc.g
    @Xc.f
    public static final int m0(int i10, int i11) {
        return i10 ^ i11;
    }

    public static boolean n(int i10, Object obj) {
        return (obj instanceof x0) && i10 == ((x0) obj).f218498a;
    }

    public static final boolean p(int i10, int i11) {
        return i10 == i11;
    }

    @Xc.g
    @Xc.f
    public static final int r(int i10, byte b10) {
        return C4983o0.a(i10, b10 & 255);
    }

    @Xc.g
    @Xc.f
    public static final long s(int i10, long j10) {
        return r0.a(((long) i10) & ZipKt.f225990j, j10);
    }

    @Xc.g
    @Xc.f
    public static final int t(int i10, int i11) {
        return C4983o0.a(i10, i11);
    }

    @Xc.g
    @Xc.f
    public static final int u(int i10, short s10) {
        return C4983o0.a(i10, s10 & H0.f217455d);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void v() {
    }

    public static int w(int i10) {
        return i10;
    }

    @Xc.f
    public static final int x(int i10) {
        return i10 + 1;
    }

    @Xc.g
    @Xc.f
    public static final int y(int i10) {
        return ~i10;
    }

    @Xc.g
    @Xc.f
    public static final int z(int i10, byte b10) {
        return i10 - (b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(x0 x0Var) {
        return N0.e(this.f218498a, x0Var.f218498a);
    }

    @Xc.g
    @Xc.f
    public final int e(int i10) {
        return N0.e(this.f218498a, i10);
    }

    public boolean equals(Object obj) {
        return n(this.f218498a, obj);
    }

    public int hashCode() {
        return this.f218498a;
    }

    public final /* synthetic */ int l0() {
        return this.f218498a;
    }

    @Xc.g
    @NotNull
    public String toString() {
        return g0(this.f218498a);
    }
}
