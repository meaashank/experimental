package kotlin.time;

import androidx.collection.C1550p;
import androidx.collection.LruCacheKt;
import jd.C4806d;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: kotlin.time.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.6")
@V({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1613:1\n41#1:1614\n41#1:1615\n41#1:1616\n41#1:1617\n41#1:1618\n572#1:1619\n589#1:1627\n173#2,6:1620\n1#3:1626\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n42#1:1614\n43#1:1615\n353#1:1616\n362#1:1617\n546#1:1618\n847#1:1619\n938#1:1627\n889#1:1620,6\n*E\n"})
@dd.h
public final class C5041h implements Comparable<C5041h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f218419c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f218424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f218418b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f218420d = j.m(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f218421e = j.m(-4611686018427387903L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f218422f = 9223372036854759646L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f218423g = f218422f;

    /* JADX INFO: renamed from: kotlin.time.h$a */
    @V({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Duration.kt\nkotlin/time/DurationKt\n*L\n1#1,1613:1\n1#2:1614\n1449#3:1615\n1449#3:1616\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration$Companion\n*L\n337#1:1615\n347#1:1616\n*E\n"})
    public static final class a {
        public a() {
        }

        @Xc.f
        public static /* synthetic */ void A(double d10) {
        }

        @Xc.f
        public static /* synthetic */ void B(int i10) {
        }

        @Xc.f
        public static /* synthetic */ void C(long j10) {
        }

        @Xc.f
        public static /* synthetic */ void G(double d10) {
        }

        @Xc.f
        public static /* synthetic */ void H(int i10) {
        }

        @Xc.f
        public static /* synthetic */ void I(long j10) {
        }

        @Xc.f
        public static /* synthetic */ void N(double d10) {
        }

        @Xc.f
        public static /* synthetic */ void O(int i10) {
        }

        @Xc.f
        public static /* synthetic */ void P(long j10) {
        }

        @Xc.f
        public static /* synthetic */ void T(double d10) {
        }

        @Xc.f
        public static /* synthetic */ void U(int i10) {
        }

        @Xc.f
        public static /* synthetic */ void V(long j10) {
        }

        public static /* synthetic */ void X() {
        }

        @Xc.f
        public static /* synthetic */ void f(double d10) {
        }

        @Xc.f
        public static /* synthetic */ void g(int i10) {
        }

        @Xc.f
        public static /* synthetic */ void h(long j10) {
        }

        @Xc.f
        public static /* synthetic */ void l(double d10) {
        }

        @Xc.f
        public static /* synthetic */ void m(int i10) {
        }

        @Xc.f
        public static /* synthetic */ void n(long j10) {
        }

        public static /* synthetic */ void q() {
        }

        @Xc.f
        public static /* synthetic */ void u(double d10) {
        }

        @Xc.f
        public static /* synthetic */ void v(int i10) {
        }

        @Xc.f
        public static /* synthetic */ void w(long j10) {
        }

        public final long D(double d10) {
            return j.N(d10, DurationUnit.MINUTES);
        }

        public final long E(int i10) {
            return j.O(i10, DurationUnit.MINUTES);
        }

        public final long F(long j10) {
            return j.P(j10, DurationUnit.MINUTES);
        }

        public final long J() {
            return C5041h.f218421e;
        }

        public final long K(double d10) {
            return j.N(d10, DurationUnit.NANOSECONDS);
        }

        public final long L(int i10) {
            return j.O(i10, DurationUnit.NANOSECONDS);
        }

        public final long M(long j10) {
            return j.P(j10, DurationUnit.NANOSECONDS);
        }

        public final long Q(double d10) {
            return j.N(d10, DurationUnit.SECONDS);
        }

        public final long R(int i10) {
            return j.O(i10, DurationUnit.SECONDS);
        }

        public final long S(long j10) {
            return j.P(j10, DurationUnit.SECONDS);
        }

        public final long W() {
            return C5041h.f218419c;
        }

        public final long Y(@NotNull String value) {
            kotlin.jvm.internal.G.p(value, "value");
            try {
                long jH = j.H(value, false, false, 4, null);
                C5041h.f218418b.getClass();
                if (C5041h.s(jH, C5041h.f218423g)) {
                    throw new IllegalStateException("invariant failed");
                }
                return jH;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(android.support.v4.media.i.a("Invalid duration string format: '", value, "'."), e10);
            }
        }

        public final long Z(@NotNull String value) {
            kotlin.jvm.internal.G.p(value, "value");
            try {
                long jH = j.H(value, true, false, 4, null);
                C5041h.f218418b.getClass();
                if (C5041h.s(jH, C5041h.f218423g)) {
                    throw new IllegalStateException("invariant failed");
                }
                return jH;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(android.support.v4.media.i.a("Invalid ISO duration string format: '", value, "'."), e10);
            }
        }

        @n
        public final double a(double d10, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
            kotlin.jvm.internal.G.p(sourceUnit, "sourceUnit");
            kotlin.jvm.internal.G.p(targetUnit, "targetUnit");
            return l.a(d10, sourceUnit, targetUnit);
        }

        @Nullable
        public final C5041h a0(@NotNull String value) {
            kotlin.jvm.internal.G.p(value, "value");
            long jG = j.G(value, true, false);
            C5041h.f218418b.getClass();
            if (C5041h.s(jG, C5041h.f218423g)) {
                return null;
            }
            return new C5041h(jG);
        }

        public final long b(long j10) {
            C5041h.l(j10);
            if (i.c()) {
                if (C5041h.Q(j10)) {
                    long j11 = j10 >> 1;
                    if (-4611686018426999999L <= j11 && j11 < 4611686018427000000L) {
                        return j10;
                    }
                    throw new AssertionError(j11 + " ns is out of nanoseconds range");
                }
                long j12 = j10 >> 1;
                if ((-4611686018427387903L >= j12 || j12 >= 4611686018427387903L) && j12 != 4611686018427387903L && j12 != -4611686018427387903L) {
                    throw new AssertionError(j12 + " ms is out of milliseconds range");
                }
                if (-4611686018426L > j12 || j12 >= 4611686018427L) {
                    return j10;
                }
                throw new AssertionError(j12 + " ms is denormalized");
            }
            return j10;
        }

        @Nullable
        public final C5041h b0(@NotNull String value) {
            kotlin.jvm.internal.G.p(value, "value");
            long jG = j.G(value, false, false);
            C5041h.f218418b.getClass();
            if (C5041h.s(jG, C5041h.f218423g)) {
                return null;
            }
            return new C5041h(jG);
        }

        public final long c(double d10) {
            return j.N(d10, DurationUnit.DAYS);
        }

        public final long d(int i10) {
            return j.O(i10, DurationUnit.DAYS);
        }

        public final long e(long j10) {
            return j.P(j10, DurationUnit.DAYS);
        }

        public final long i(double d10) {
            return j.N(d10, DurationUnit.HOURS);
        }

        public final long j(int i10) {
            return j.O(i10, DurationUnit.HOURS);
        }

        public final long k(long j10) {
            return j.P(j10, DurationUnit.HOURS);
        }

        public final long o() {
            return C5041h.f218420d;
        }

        public final long p() {
            return C5041h.f218423g;
        }

        public final long r(double d10) {
            return j.N(d10, DurationUnit.MICROSECONDS);
        }

        public final long s(int i10) {
            return j.O(i10, DurationUnit.MICROSECONDS);
        }

        public final long t(long j10) {
            return j.P(j10, DurationUnit.MICROSECONDS);
        }

        public final long x(double d10) {
            return j.N(d10, DurationUnit.MILLISECONDS);
        }

        public final long y(int i10) {
            return j.O(i10, DurationUnit.MILLISECONDS);
        }

        public final long z(long j10) {
            return j.P(j10, DurationUnit.MILLISECONDS);
        }

        public a(C4969v c4969v) {
        }
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Don't call this constructor directly.")
    public /* synthetic */ C5041h(long j10) {
        this.f218424a = j10;
    }

    public static final long A(long j10) {
        return g0(j10, DurationUnit.MINUTES);
    }

    public static final long B(long j10) {
        long j11 = j10 >> 1;
        if (Q(j10)) {
            return j11;
        }
        if (j11 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j11 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j11 * ((long) 1000000);
    }

    public static final long C(long j10) {
        return g0(j10, DurationUnit.SECONDS);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void D() {
    }

    public static final int E(long j10) {
        if (R(j10)) {
            return 0;
        }
        return (int) (g0(j10, DurationUnit.MINUTES) % ((long) 60));
    }

    @InterfaceC4850b0
    public static /* synthetic */ void F() {
    }

    public static final int G(long j10) {
        if (R(j10)) {
            return 0;
        }
        return (int) (O(j10) ? ((j10 >> 1) % ((long) 1000)) * ((long) 1000000) : (j10 >> 1) % ((long) 1000000000));
    }

    @InterfaceC4850b0
    public static /* synthetic */ void H() {
    }

    public static final int I(long j10) {
        if (R(j10)) {
            return 0;
        }
        return (int) (g0(j10, DurationUnit.SECONDS) % ((long) 60));
    }

    public static final DurationUnit J(long j10) {
        return Q(j10) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static final int K(long j10) {
        return ((int) j10) & 1;
    }

    public static final long L(long j10) {
        return j10 >> 1;
    }

    public static int M(long j10) {
        return C1550p.a(j10);
    }

    public static final boolean N(long j10) {
        return !R(j10);
    }

    public static final boolean O(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static final boolean Q(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean R(long j10) {
        return j10 == f218420d || j10 == f218421e;
    }

    public static final boolean S(long j10) {
        return j10 < 0;
    }

    public static final boolean T(long j10) {
        return j10 > 0;
    }

    public static final long V(long j10, long j11) {
        return W(j10, l0(j11));
    }

    public static final long W(long j10, long j11) {
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return O(j10) ? g(j10, j10 >> 1, j11 >> 1) : g(j10, j11 >> 1, j10 >> 1);
        }
        if (Q(j10)) {
            return j.p((j10 >> 1) + (j11 >> 1));
        }
        long j12 = j.j(j10 >> 1, j11 >> 1);
        if (j12 != f218422f) {
            return (j12 == 4611686018427387903L || j12 == -4611686018427387903L) ? j.m(j12) : j.n(j12);
        }
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    }

    public static final long X(long j10, double d10) {
        int iK0 = C4806d.K0(d10);
        if (iK0 == d10) {
            return Y(j10, iK0);
        }
        DurationUnit durationUnitJ = J(j10);
        return j.N(d0(j10, durationUnitJ) * d10, durationUnitJ);
    }

    public static final long Y(long j10, int i10) {
        if (R(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : l0(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return f218419c;
        }
        long j11 = j10 >> 1;
        long j12 = i10;
        long j13 = j11 * j12;
        if (!Q(j10)) {
            if (j13 / j12 == j11) {
                return j.m(md.u.N(j13, new md.o(-4611686018427387903L, 4611686018427387903L)));
            }
            return Integer.signum(i10) * Long.signum(j11) > 0 ? f218420d : f218421e;
        }
        if (-2147483647L <= j11 && j11 < 2147483648L) {
            return j.o(j13);
        }
        if (j13 / j12 == j11) {
            return j.p(j13);
        }
        long j14 = 1000000;
        long j15 = j11 / j14;
        long j16 = j15 * j12;
        long j17 = (((j11 - (j15 * j14)) * j12) / j14) + j16;
        if (j16 / j12 != j15 || (j17 ^ j16) < 0) {
            return Integer.signum(i10) * Long.signum(j11) > 0 ? f218420d : f218421e;
        }
        return j.m(md.u.N(j17, new md.o(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final <T> T Z(long j10, @NotNull ed.p<? super Long, ? super Integer, ? extends T> action) {
        kotlin.jvm.internal.G.p(action, "action");
        return action.invoke(Long.valueOf(g0(j10, DurationUnit.SECONDS)), Integer.valueOf(G(j10)));
    }

    public static final <T> T a0(long j10, @NotNull ed.q<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        kotlin.jvm.internal.G.p(action, "action");
        return action.invoke(Long.valueOf(g0(j10, DurationUnit.MINUTES)), Integer.valueOf(I(j10)), Integer.valueOf(G(j10)));
    }

    public static final <T> T b0(long j10, @NotNull ed.r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        kotlin.jvm.internal.G.p(action, "action");
        return action.x(Long.valueOf(g0(j10, DurationUnit.HOURS)), Integer.valueOf(E(j10)), Integer.valueOf(I(j10)), Integer.valueOf(G(j10)));
    }

    public static final <T> T c0(long j10, @NotNull ed.s<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        kotlin.jvm.internal.G.p(action, "action");
        return action.p(Long.valueOf(g0(j10, DurationUnit.DAYS)), Integer.valueOf(v(j10)), Integer.valueOf(E(j10)), Integer.valueOf(I(j10)), Integer.valueOf(G(j10)));
    }

    public static final long d(long j10) {
        return j10 >> 1;
    }

    public static final double d0(long j10, @NotNull DurationUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        if (j10 == f218420d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f218421e) {
            return Double.NEGATIVE_INFINITY;
        }
        return l.a(j10 >> 1, J(j10), unit);
    }

    public static final int e0(long j10, @NotNull DurationUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        return (int) md.u.M(g0(j10, unit), -2147483648L, LruCacheKt.f86729a);
    }

    @NotNull
    public static final String f0(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (S(j10)) {
            sb2.append(SignatureVisitor.SUPER);
        }
        sb2.append("PT");
        long jT = t(j10);
        long jG0 = g0(jT, DurationUnit.HOURS);
        int iE = E(jT);
        int I10 = I(jT);
        int iG = G(jT);
        long j11 = R(j10) ? 9999999999999L : jG0;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (I10 == 0 && iG == 0) ? false : true;
        if (iE != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(j11);
            sb2.append(androidx.compose.ui.graphics.vector.f.f101676h);
        }
        if (z10) {
            sb2.append(iE);
            sb2.append(androidx.compose.ui.graphics.vector.f.f101672d);
        }
        if (z12 || (!z11 && !z10)) {
            h(j10, sb2, I10, iG, 9, t1.b.f238816R4, true);
        }
        return sb2.toString();
    }

    public static final long g(long j10, long j11, long j12) {
        long j13 = 1000000;
        long j14 = j12 / j13;
        long j15 = j.j(j11, j14);
        if (-4611686018426L > j15 || j15 >= 4611686018427L) {
            return j.m(j15);
        }
        return j.o((j15 * j13) + (j12 - (j14 * j13)));
    }

    public static final long g0(long j10, @NotNull DurationUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        if (j10 == f218420d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f218421e) {
            return Long.MIN_VALUE;
        }
        return l.b(j10 >> 1, J(j10), unit);
    }

    public static final void h(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strO4 = M.o4(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strO4.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strO4.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strO4, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strO4, 0, i15);
            }
        }
        sb2.append(str);
    }

    @NotNull
    public static String h0(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f218420d) {
            return j.f218437k;
        }
        if (j10 == f218421e) {
            return "-Infinity";
        }
        boolean zS = S(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zS) {
            sb2.append(SignatureVisitor.SUPER);
        }
        long jT = t(j10);
        long jG0 = g0(jT, DurationUnit.DAYS);
        int iV = v(jT);
        int iE = E(jT);
        int I10 = I(jT);
        int iG = G(jT);
        int i10 = 0;
        boolean z10 = jG0 != 0;
        boolean z11 = iV != 0;
        boolean z12 = iE != 0;
        boolean z13 = (I10 == 0 && iG == 0) ? false : true;
        if (z10) {
            sb2.append(jG0);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iV);
            sb2.append(androidx.compose.ui.graphics.vector.f.f101675g);
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iE);
            sb2.append(androidx.compose.ui.graphics.vector.f.f101671c);
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (I10 != 0 || z10 || z11 || z12) {
                h(j10, sb2, I10, iG, 9, "s", false);
            } else if (iG >= 1000000) {
                h(j10, sb2, iG / 1000000, iG % 1000000, 6, "ms", false);
            } else if (iG >= 1000) {
                h(j10, sb2, iG / 1000, iG % 1000, 3, "us", false);
            } else {
                sb2.append(iG);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zS && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final /* synthetic */ C5041h i(long j10) {
        return new C5041h(j10);
    }

    @NotNull
    public static final String i0(long j10, @NotNull DurationUnit unit, int i10) {
        kotlin.jvm.internal.G.p(unit, "unit");
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("decimals must be not negative, but was ", i10).toString());
        }
        double dD0 = d0(j10, unit);
        if (Double.isInfinite(dD0)) {
            return String.valueOf(dD0);
        }
        if (i10 > 12) {
            i10 = 12;
        }
        return i.b(dD0, i10).concat(m.i(unit));
    }

    public static /* synthetic */ String j0(long j10, DurationUnit durationUnit, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return i0(j10, durationUnit, i10);
    }

    public static int k(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return kotlin.jvm.internal.G.u(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return S(j10) ? -i10 : i10;
    }

    public static final long k0(long j10, @NotNull DurationUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        DurationUnit durationUnitJ = J(j10);
        if (unit.compareTo(durationUnitJ) <= 0 || R(j10)) {
            return j10;
        }
        long j11 = j10 >> 1;
        return j.P(j11 - (j11 % l.b(1L, unit, durationUnitJ)), durationUnitJ);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Don't call this constructor directly.")
    public static long l(long j10) {
        return j10;
    }

    public static final long l0(long j10) {
        return j.l(-(j10 >> 1), ((int) j10) & 1);
    }

    public static final double m(long j10, long j11) {
        DurationUnit durationUnit = (DurationUnit) Oc.h.X(J(j10), J(j11));
        return d0(j10, durationUnit) / d0(j11, durationUnit);
    }

    public static final long n(long j10, double d10) {
        int iK0 = C4806d.K0(d10);
        if (iK0 == d10 && iK0 != 0) {
            return p(j10, iK0);
        }
        DurationUnit durationUnitJ = J(j10);
        return j.N(d0(j10, durationUnitJ) / d10, durationUnitJ);
    }

    public static final long p(long j10, int i10) {
        if (i10 == 0) {
            if (T(j10)) {
                return f218420d;
            }
            if (S(j10)) {
                return f218421e;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (Q(j10)) {
            return j.o((j10 >> 1) / ((long) i10));
        }
        if (R(j10)) {
            return Y(j10, Integer.signum(i10));
        }
        long j11 = j10 >> 1;
        long j12 = i10;
        long j13 = j11 / j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return j.m(j13);
        }
        long j14 = 1000000;
        return j.o((j13 * j14) + (((j11 - (j13 * j12)) * j14) / j12));
    }

    public static boolean r(long j10, Object obj) {
        return (obj instanceof C5041h) && j10 == ((C5041h) obj).f218424a;
    }

    public static final boolean s(long j10, long j11) {
        return j10 == j11;
    }

    public static final long t(long j10) {
        return S(j10) ? l0(j10) : j10;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void u() {
    }

    public static final int v(long j10) {
        if (R(j10)) {
            return 0;
        }
        return (int) (g0(j10, DurationUnit.HOURS) % ((long) 24));
    }

    public static final long w(long j10) {
        return g0(j10, DurationUnit.DAYS);
    }

    public static final long x(long j10) {
        return g0(j10, DurationUnit.HOURS);
    }

    public static final long y(long j10) {
        return g0(j10, DurationUnit.MICROSECONDS);
    }

    public static final long z(long j10) {
        return (O(j10) && N(j10)) ? j10 >> 1 : g0(j10, DurationUnit.MILLISECONDS);
    }

    @Override // java.lang.Comparable
    public int compareTo(C5041h c5041h) {
        return k(this.f218424a, c5041h.f218424a);
    }

    public boolean equals(Object obj) {
        return r(this.f218424a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f218424a);
    }

    public int j(long j10) {
        return k(this.f218424a, j10);
    }

    public final /* synthetic */ long m0() {
        return this.f218424a;
    }

    @NotNull
    public String toString() {
        return h0(this.f218424a);
    }
}
