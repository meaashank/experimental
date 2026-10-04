package androidx.compose.ui.layout;

import androidx.compose.runtime.T1;
import ed.InterfaceC4376a;
import n0.C5238e;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,199:1\n131#1:203\n63#2,3:200\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n145#1:203\n32#1:200,3\n*E\n"})
public final class D0 {
    @T1
    public static final long a(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j) | (Float.floatToRawIntBits(f10) << 32);
        C0.e(jFloatToRawIntBits);
        return jFloatToRawIntBits;
    }

    @T1
    public static final long c(long j10, long j11) {
        return P.o.a(P.n.t(j10) / C0.m(j11), P.n.m(j10) / C0.o(j11));
    }

    public static final boolean d(long j10) {
        C0.f102390b.getClass();
        return j10 != C0.f102391c;
    }

    @T1
    public static /* synthetic */ void e(long j10) {
    }

    public static final boolean f(long j10) {
        C0.f102390b.getClass();
        return j10 == C0.f102391c;
    }

    @T1
    public static /* synthetic */ void g(long j10) {
    }

    @T1
    public static final long h(long j10, long j11, float f10) {
        return a(C5238e.j(C0.m(j10), C0.m(j11), f10), C5238e.j(C0.o(j10), C0.o(j11), f10));
    }

    public static final float i(float f10) {
        float f11 = 10;
        float f12 = f10 * f11;
        int i10 = (int) f12;
        if (f12 - i10 >= 0.5f) {
            i10++;
        }
        return i10 / f11;
    }

    public static final long j(long j10, @NotNull InterfaceC4376a<C0> interfaceC4376a) {
        C0.f102390b.getClass();
        return j10 != C0.f102391c ? j10 : interfaceC4376a.invoke().f102392a;
    }

    @T1
    public static final long k(long j10, long j11) {
        return P.o.a(C0.m(j11) * P.n.t(j10), C0.o(j11) * P.n.m(j10));
    }

    @T1
    public static final long l(long j10, long j11) {
        return k(j11, j10);
    }
}
