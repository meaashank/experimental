package kotlin.time;

import androidx.collection.C1550p;
import kotlin.InterfaceC4887e0;
import kotlin.O0;
import kotlin.time.InterfaceC5040g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.9")
@O0(markerClass = {n.class})
public interface F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f218379a = a.f218380a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f218380a = new a();
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f218381b = new b();

        @Override // kotlin.time.F.c, kotlin.time.F
        public InterfaceC5040g a() {
            return new a(C.f218376b.e());
        }

        public long b() {
            return C.f218376b.e();
        }

        @NotNull
        public String toString() {
            C.f218376b.getClass();
            return "TimeSource(System.nanoTime())";
        }

        @InterfaceC4887e0(version = "1.9")
        @dd.h
        @O0(markerClass = {n.class})
        public static final class a implements InterfaceC5040g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f218382a;

            public /* synthetic */ a(long j10) {
                this.f218382a = j10;
            }

            public static final /* synthetic */ a d(long j10) {
                return new a(j10);
            }

            public static final int e(long j10, long j11) {
                long jN = n(j10, j11);
                C5041h.f218418b.getClass();
                return C5041h.k(jN, C5041h.f218419c);
            }

            public static int f(long j10, @NotNull InterfaceC5040g other) {
                kotlin.jvm.internal.G.p(other, "other");
                return InterfaceC5040g.a.a(new a(j10), other);
            }

            public static long g(long j10) {
                return j10;
            }

            public static long h(long j10) {
                return C.f218376b.d(j10);
            }

            public static boolean i(long j10, Object obj) {
                return (obj instanceof a) && j10 == ((a) obj).f218382a;
            }

            public static final boolean j(long j10, long j11) {
                return j10 == j11;
            }

            public static boolean k(long j10) {
                return C5041h.S(C.f218376b.d(j10));
            }

            public static boolean l(long j10) {
                return !C5041h.S(C.f218376b.d(j10));
            }

            public static int m(long j10) {
                return C1550p.a(j10);
            }

            public static final long n(long j10, long j11) {
                C.f218376b.getClass();
                return z.h(j10, j11, DurationUnit.NANOSECONDS);
            }

            public static long r(long j10, long j11) {
                C c10 = C.f218376b;
                long jL0 = C5041h.l0(j11);
                c10.getClass();
                return z.d(j10, DurationUnit.NANOSECONDS, jL0);
            }

            public static long s(long j10, @NotNull InterfaceC5040g other) {
                kotlin.jvm.internal.G.p(other, "other");
                if (other instanceof a) {
                    return n(j10, ((a) other).f218382a);
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) v(j10)) + " and " + other);
            }

            public static long u(long j10, long j11) {
                C.f218376b.getClass();
                return z.d(j10, DurationUnit.NANOSECONDS, j11);
            }

            public static String v(long j10) {
                return "ValueTimeMark(reading=" + j10 + ')';
            }

            @Override // kotlin.time.InterfaceC5040g
            public /* bridge */ int J3(@NotNull InterfaceC5040g interfaceC5040g) {
                return InterfaceC5040g.a.a(this, interfaceC5040g);
            }

            @Override // kotlin.time.InterfaceC5040g
            public long P(@NotNull InterfaceC5040g other) {
                kotlin.jvm.internal.G.p(other, "other");
                return s(this.f218382a, other);
            }

            @Override // kotlin.time.E
            public long a() {
                return C.f218376b.d(this.f218382a);
            }

            @Override // kotlin.time.E
            public boolean b() {
                return k(this.f218382a);
            }

            @Override // kotlin.time.E
            public boolean c() {
                return l(this.f218382a);
            }

            @Override // java.lang.Comparable
            public /* bridge */ int compareTo(InterfaceC5040g interfaceC5040g) {
                return InterfaceC5040g.a.a(this, interfaceC5040g);
            }

            @Override // kotlin.time.InterfaceC5040g
            public boolean equals(Object obj) {
                return i(this.f218382a, obj);
            }

            @Override // kotlin.time.InterfaceC5040g
            public int hashCode() {
                return C1550p.a(this.f218382a);
            }

            @Override // kotlin.time.InterfaceC5040g, kotlin.time.E
            public InterfaceC5040g o(long j10) {
                return new a(u(this.f218382a, j10));
            }

            public long p(long j10) {
                return r(this.f218382a, j10);
            }

            @Override // kotlin.time.InterfaceC5040g, kotlin.time.E
            public InterfaceC5040g q(long j10) {
                return new a(r(this.f218382a, j10));
            }

            public long t(long j10) {
                return u(this.f218382a, j10);
            }

            public String toString() {
                return v(this.f218382a);
            }

            public final /* synthetic */ long w() {
                return this.f218382a;
            }

            @Override // kotlin.time.E
            public E o(long j10) {
                return new a(u(this.f218382a, j10));
            }

            @Override // kotlin.time.E
            public E q(long j10) {
                return new a(r(this.f218382a, j10));
            }
        }

        @Override // kotlin.time.F
        public E a() {
            return new a(C.f218376b.e());
        }
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {n.class})
    public interface c extends F {
        @Override // kotlin.time.F
        @NotNull
        InterfaceC5040g a();
    }

    @NotNull
    E a();
}
