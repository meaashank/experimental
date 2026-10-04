package kotlin;

import androidx.collection.C1550p;
import kotlin.jvm.internal.C4969v;
import md.C5222A;
import md.C5224C;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.5")
@dd.h
public final class B0 implements Comparable<B0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f217435b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f217436c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f217437d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f217438e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f217439f = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f217440a;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @InterfaceC4850b0
    @Xc.g
    public /* synthetic */ B0(long j10) {
        this.f217440a = j10;
    }

    @Xc.g
    @Xc.f
    public static final long A(long j10, long j11) {
        return j10 - j11;
    }

    @Xc.g
    @Xc.f
    public static final long B(long j10, int i10) {
        return j10 - (((long) i10) & ZipKt.f225990j);
    }

    @Xc.g
    @Xc.f
    public static final long C(long j10, short s10) {
        return j10 - (((long) s10) & Nd.g.f65032t);
    }

    @Xc.g
    @Xc.f
    public static final byte D(long j10, byte b10) {
        return (byte) q0.a(j10, ((long) b10) & 255);
    }

    @Xc.g
    @Xc.f
    public static final long E(long j10, long j11) {
        return q0.a(j10, j11);
    }

    @Xc.g
    @Xc.f
    public static final int F(long j10, int i10) {
        return (int) q0.a(j10, ((long) i10) & ZipKt.f225990j);
    }

    @Xc.g
    @Xc.f
    public static final short G(long j10, short s10) {
        return (short) q0.a(j10, ((long) s10) & Nd.g.f65032t);
    }

    @Xc.g
    @Xc.f
    public static final long H(long j10, long j11) {
        return j10 | j11;
    }

    @Xc.g
    @Xc.f
    public static final long I(long j10, byte b10) {
        return j10 + (((long) b10) & 255);
    }

    @Xc.g
    @Xc.f
    public static final long J(long j10, long j11) {
        return j10 + j11;
    }

    @Xc.g
    @Xc.f
    public static final long K(long j10, int i10) {
        return j10 + (((long) i10) & ZipKt.f225990j);
    }

    @Xc.g
    @Xc.f
    public static final long L(long j10, short s10) {
        return j10 + (((long) s10) & Nd.g.f65032t);
    }

    @Xc.f
    public static final C5222A M(long j10, long j11) {
        return new C5222A(j10, j11);
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @Xc.f
    public static final C5222A N(long j10, long j11) {
        return C5224C.X(j10, j11);
    }

    @Xc.g
    @Xc.f
    public static final long O(long j10, byte b10) {
        return q0.a(j10, ((long) b10) & 255);
    }

    @Xc.g
    @Xc.f
    public static final long Q(long j10, long j11) {
        return N0.p(j10, j11);
    }

    @Xc.g
    @Xc.f
    public static final long R(long j10, int i10) {
        return q0.a(j10, ((long) i10) & ZipKt.f225990j);
    }

    @Xc.g
    @Xc.f
    public static final long S(long j10, short s10) {
        return q0.a(j10, ((long) s10) & Nd.g.f65032t);
    }

    @Xc.g
    @Xc.f
    public static final long T(long j10, int i10) {
        return j10 << i10;
    }

    @Xc.g
    @Xc.f
    public static final long V(long j10, int i10) {
        return j10 >>> i10;
    }

    @Xc.g
    @Xc.f
    public static final long W(long j10, byte b10) {
        return j10 * (((long) b10) & 255);
    }

    @Xc.g
    @Xc.f
    public static final long X(long j10, long j11) {
        return j10 * j11;
    }

    @Xc.g
    @Xc.f
    public static final long Y(long j10, int i10) {
        return j10 * (((long) i10) & ZipKt.f225990j);
    }

    @Xc.g
    @Xc.f
    public static final long Z(long j10, short s10) {
        return j10 * (((long) s10) & Nd.g.f65032t);
    }

    @Xc.g
    @Xc.f
    public static final long a(long j10, long j11) {
        return j10 & j11;
    }

    @Xc.g
    @Xc.f
    public static final byte a0(long j10) {
        return (byte) j10;
    }

    public static final /* synthetic */ B0 b(long j10) {
        return new B0(j10);
    }

    @Xc.g
    @Xc.f
    public static final double b0(long j10) {
        return N0.q(j10);
    }

    @Xc.g
    @Xc.f
    public static final int c(long j10, byte b10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, (((long) b10) & 255) ^ Long.MIN_VALUE);
    }

    @Xc.g
    @Xc.f
    public static final float c0(long j10) {
        return (float) N0.q(j10);
    }

    @Xc.g
    @Xc.f
    public static final int d0(long j10) {
        return (int) j10;
    }

    @Xc.g
    @Xc.f
    public static int e(long j10, long j11) {
        return N0.n(j10, j11);
    }

    @Xc.g
    @Xc.f
    public static final long e0(long j10) {
        return j10;
    }

    @Xc.g
    @Xc.f
    public static final int f(long j10, int i10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, (((long) i10) & ZipKt.f225990j) ^ Long.MIN_VALUE);
    }

    @Xc.g
    @Xc.f
    public static final short f0(long j10) {
        return (short) j10;
    }

    @Xc.g
    @Xc.f
    public static final int g(long j10, short s10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, (((long) s10) & Nd.g.f65032t) ^ Long.MIN_VALUE);
    }

    @Xc.g
    @NotNull
    public static String g0(long j10) {
        return N0.t(j10, 10);
    }

    @InterfaceC4850b0
    @Xc.g
    public static long h(long j10) {
        return j10;
    }

    @Xc.g
    @Xc.f
    public static final byte h0(long j10) {
        return (byte) j10;
    }

    @Xc.f
    public static final long i(long j10) {
        return j10 - 1;
    }

    @Xc.g
    @Xc.f
    public static final int i0(long j10) {
        return (int) j10;
    }

    @Xc.g
    @Xc.f
    public static final long j(long j10, byte b10) {
        return r0.a(j10, ((long) b10) & 255);
    }

    @Xc.g
    @Xc.f
    public static final long j0(long j10) {
        return j10;
    }

    @Xc.g
    @Xc.f
    public static final long k(long j10, long j11) {
        return N0.o(j10, j11);
    }

    @Xc.g
    @Xc.f
    public static final short k0(long j10) {
        return (short) j10;
    }

    @Xc.g
    @Xc.f
    public static final long l(long j10, int i10) {
        return r0.a(j10, ((long) i10) & ZipKt.f225990j);
    }

    @Xc.g
    @Xc.f
    public static final long m(long j10, short s10) {
        return r0.a(j10, ((long) s10) & Nd.g.f65032t);
    }

    @Xc.g
    @Xc.f
    public static final long m0(long j10, long j11) {
        return j10 ^ j11;
    }

    public static boolean n(long j10, Object obj) {
        return (obj instanceof B0) && j10 == ((B0) obj).f217440a;
    }

    public static final boolean p(long j10, long j11) {
        return j10 == j11;
    }

    @Xc.g
    @Xc.f
    public static final long r(long j10, byte b10) {
        return r0.a(j10, ((long) b10) & 255);
    }

    @Xc.g
    @Xc.f
    public static final long s(long j10, long j11) {
        return r0.a(j10, j11);
    }

    @Xc.g
    @Xc.f
    public static final long t(long j10, int i10) {
        return r0.a(j10, ((long) i10) & ZipKt.f225990j);
    }

    @Xc.g
    @Xc.f
    public static final long u(long j10, short s10) {
        return r0.a(j10, ((long) s10) & Nd.g.f65032t);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void v() {
    }

    public static int w(long j10) {
        return C1550p.a(j10);
    }

    @Xc.f
    public static final long x(long j10) {
        return j10 + 1;
    }

    @Xc.g
    @Xc.f
    public static final long y(long j10) {
        return ~j10;
    }

    @Xc.g
    @Xc.f
    public static final long z(long j10, byte b10) {
        return j10 - (((long) b10) & 255);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(B0 b02) {
        return N0.n(this.f217440a, b02.f217440a);
    }

    @Xc.g
    @Xc.f
    public final int d(long j10) {
        return N0.n(this.f217440a, j10);
    }

    public boolean equals(Object obj) {
        return n(this.f217440a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f217440a);
    }

    public final /* synthetic */ long l0() {
        return this.f217440a;
    }

    @Xc.g
    @NotNull
    public String toString() {
        return N0.t(this.f217440a, 10);
    }
}
