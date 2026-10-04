package k0;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import k0.D;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,389:1\n22#2:390\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n243#1:390\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f214266b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final D[] f214267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f214268d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214269a;

    public static final class a {
        public a() {
        }

        @NotNull
        public final D[] a() {
            return B.f214267c;
        }

        public final long b() {
            return B.f214268d;
        }

        public a(C4969v c4969v) {
        }

        @T1
        public static /* synthetic */ void c() {
        }
    }

    static {
        D.a aVar = D.f214274b;
        aVar.getClass();
        D d10 = new D(D.f214275c);
        aVar.getClass();
        D d11 = new D(D.f214276d);
        aVar.getClass();
        f214267c = new D[]{d10, d11, new D(D.f214277e)};
        f214268d = C.v(0L, Float.NaN);
    }

    public /* synthetic */ B(long j10) {
        this.f214269a = j10;
    }

    public static final /* synthetic */ long b() {
        return f214268d;
    }

    public static final /* synthetic */ B c(long j10) {
        return new B(j10);
    }

    public static final int d(long j10, long j11) {
        C.c(j10, j11);
        return Float.compare(n(j10), n(j11));
    }

    public static final long f(long j10, double d10) {
        C.b(j10);
        return C.v(C.f214270a & j10, (float) (((double) n(j10)) / d10));
    }

    public static final long g(long j10, float f10) {
        C.b(j10);
        return C.v(C.f214270a & j10, n(j10) / f10);
    }

    public static final long h(long j10, int i10) {
        C.b(j10);
        return C.v(C.f214270a & j10, n(j10) / i10);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof B) && j10 == ((B) obj).f214269a;
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    public static final long l(long j10) {
        return j10 & C.f214270a;
    }

    public static final long m(long j10) {
        return f214267c[(int) ((j10 & C.f214270a) >>> 32)].f214278a;
    }

    public static final float n(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static int o(long j10) {
        return C1550p.a(j10);
    }

    public static final boolean p(long j10) {
        return (j10 & C.f214270a) == 8589934592L;
    }

    public static final boolean q(long j10) {
        return (j10 & C.f214270a) == 4294967296L;
    }

    public static final long r(long j10, double d10) {
        C.b(j10);
        return C.v(C.f214270a & j10, (float) (((double) n(j10)) * d10));
    }

    public static final long s(long j10, float f10) {
        C.b(j10);
        return C.v(C.f214270a & j10, n(j10) * f10);
    }

    public static final long t(long j10, int i10) {
        C.b(j10);
        return C.v(C.f214270a & j10, n(j10) * i10);
    }

    @NotNull
    public static String u(long j10) {
        long jM = m(j10);
        D.a aVar = D.f214274b;
        aVar.getClass();
        if (D.g(jM, D.f214275c)) {
            return "Unspecified";
        }
        aVar.getClass();
        if (D.g(jM, D.f214276d)) {
            return n(j10) + ".sp";
        }
        aVar.getClass();
        if (!D.g(jM, D.f214277e)) {
            return "Invalid";
        }
        return n(j10) + ".em";
    }

    public static final long v(long j10) {
        C.b(j10);
        return C.v(C.f214270a & j10, -n(j10));
    }

    public boolean equals(Object obj) {
        return i(this.f214269a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f214269a);
    }

    @NotNull
    public String toString() {
        return u(this.f214269a);
    }

    public final /* synthetic */ long w() {
        return this.f214269a;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void k() {
    }

    public static long e(long j10) {
        return j10;
    }
}
