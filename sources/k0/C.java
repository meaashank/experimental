package k0;

import androidx.compose.runtime.T1;
import ed.InterfaceC4376a;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.V;
import n0.C5238e;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,389:1\n251#1:390\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n265#1:390\n*E\n"})
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f214270a = 1095216660480L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f214271b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f214272c = 4294967296L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f214273d = 8589934592L;

    public static final long a(float f10, long j10) {
        return v(j10, f10);
    }

    @InterfaceC4850b0
    public static final void b(long j10) {
        if (s(j10)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    @InterfaceC4850b0
    public static final void c(long j10, long j11) {
        if (s(j10) || s(j11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (D.g(B.m(j10), B.m(j11))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) D.i(B.m(j10))) + " and " + ((Object) D.i(B.m(j11)))).toString());
    }

    @InterfaceC4850b0
    public static final void d(long j10, long j11, long j12) {
        if (s(j10) || s(j11) || s(j12)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (D.g(B.m(j10), B.m(j11)) && D.g(B.m(j11), B.m(j12))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) D.i(B.m(j10))) + " and " + ((Object) D.i(B.m(j11)))).toString());
    }

    public static final long e(double d10) {
        return v(8589934592L, (float) d10);
    }

    public static final long f(float f10) {
        return v(8589934592L, f10);
    }

    public static final long g(int i10) {
        return v(8589934592L, i10);
    }

    public static final long k(double d10) {
        return v(4294967296L, (float) d10);
    }

    public static final long l(float f10) {
        return v(4294967296L, f10);
    }

    public static final long m(int i10) {
        return v(4294967296L, i10);
    }

    public static final boolean q(long j10) {
        return !s(j10);
    }

    public static final boolean s(long j10) {
        return B.l(j10) == 0;
    }

    @T1
    public static final long u(long j10, long j11, float f10) {
        c(j10, j11);
        return v(f214270a & j10, C5238e.j(B.n(j10), B.n(j11), f10));
    }

    @InterfaceC4850b0
    public static final long v(long j10, float f10) {
        long jFloatToIntBits = j10 | (((long) Float.floatToIntBits(f10)) & ZipKt.f225990j);
        B.e(jFloatToIntBits);
        return jFloatToIntBits;
    }

    public static final long w(long j10, @NotNull InterfaceC4376a<B> interfaceC4376a) {
        return !s(j10) ? j10 : interfaceC4376a.invoke().f214269a;
    }

    @T1
    public static final long x(double d10, long j10) {
        b(j10);
        return v(f214270a & j10, B.n(j10) * ((float) d10));
    }

    @T1
    public static final long y(float f10, long j10) {
        b(j10);
        return v(f214270a & j10, B.n(j10) * f10);
    }

    @T1
    public static final long z(int i10, long j10) {
        b(j10);
        return v(f214270a & j10, B.n(j10) * i10);
    }

    @T1
    public static /* synthetic */ void h(double d10) {
    }

    @T1
    public static /* synthetic */ void i(float f10) {
    }

    @T1
    public static /* synthetic */ void j(int i10) {
    }

    @T1
    public static /* synthetic */ void n(double d10) {
    }

    @T1
    public static /* synthetic */ void o(float f10) {
    }

    @T1
    public static /* synthetic */ void p(int i10) {
    }

    @T1
    public static /* synthetic */ void r(long j10) {
    }

    @T1
    public static /* synthetic */ void t(long j10) {
    }
}
