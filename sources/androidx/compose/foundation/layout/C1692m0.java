package androidx.compose.foundation.layout;

import androidx.collection.C1550p;
import k0.C4811b;
import k0.C4812c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,723:1\n229#1:724\n230#1:725\n232#1:726\n231#1:727\n232#1:728\n229#1,4:729\n231#1,2:733\n229#1,2:735\n230#1:737\n232#1:738\n232#1:739\n230#1:740\n229#1:741\n230#1:742\n231#1:743\n232#1:744\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n257#1:724\n258#1:725\n259#1:726\n259#1:727\n260#1:728\n266#1:729,4\n268#1:733,2\n268#1:735,2\n274#1:737\n276#1:738\n282#1:739\n284#1:740\n288#1:741\n289#1:742\n290#1:743\n291#1:744\n*E\n"})
@dd.h
public final class C1692m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90933a;

    public /* synthetic */ C1692m0(long j10) {
        this.f90933a = j10;
    }

    public static final /* synthetic */ C1692m0 a(long j10) {
        return new C1692m0(j10);
    }

    public static long b(int i10, int i11, int i12, int i13) {
        return C4812c.a(i10, i11, i12, i13);
    }

    public static long c(long j10) {
        return j10;
    }

    public static long d(long j10, @NotNull LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return C4812c.a(layoutOrientation == layoutOrientation2 ? C4811b.q(j10) : C4811b.p(j10), layoutOrientation == layoutOrientation2 ? C4811b.o(j10) : C4811b.n(j10), layoutOrientation == layoutOrientation2 ? C4811b.p(j10) : C4811b.q(j10), layoutOrientation == layoutOrientation2 ? C4811b.n(j10) : C4811b.o(j10));
    }

    public static final long e(long j10, int i10, int i11, int i12, int i13) {
        return C4812c.a(i10, i11, i12, i13);
    }

    public static long f(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = C4811b.q(j10);
        }
        if ((i14 & 2) != 0) {
            i11 = C4811b.o(j10);
        }
        if ((i14 & 4) != 0) {
            i12 = C4811b.p(j10);
        }
        if ((i14 & 8) != 0) {
            i13 = C4811b.n(j10);
        }
        return C4812c.a(i10, i11, i12, i13);
    }

    public static boolean g(long j10, Object obj) {
        return (obj instanceof C1692m0) && C4811b.f(j10, ((C1692m0) obj).f90933a);
    }

    public static final boolean h(long j10, long j11) {
        return C4811b.f(j10, j11);
    }

    public static final int i(long j10) {
        return C4811b.n(j10);
    }

    public static final int j(long j10) {
        return C4811b.p(j10);
    }

    public static final int k(long j10) {
        return C4811b.o(j10);
    }

    public static final int l(long j10) {
        return C4811b.q(j10);
    }

    public static int m(long j10) {
        return C1550p.a(j10);
    }

    public static final int n(long j10, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? C4811b.n(j10) : C4811b.o(j10);
    }

    public static final int o(long j10, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? C4811b.o(j10) : C4811b.n(j10);
    }

    public static final long p(long j10) {
        return C4812c.a(C4811b.q(j10), C4811b.o(j10), C4811b.n(j10) != Integer.MAX_VALUE ? C4811b.n(j10) : C4811b.p(j10), C4811b.n(j10));
    }

    public static final long q(long j10, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? C4812c.a(C4811b.q(j10), C4811b.o(j10), C4811b.p(j10), C4811b.n(j10)) : C4812c.a(C4811b.p(j10), C4811b.n(j10), C4811b.q(j10), C4811b.o(j10));
    }

    public static String r(long j10) {
        return "OrientationIndependentConstraints(value=" + ((Object) C4811b.v(j10)) + ')';
    }

    public boolean equals(Object obj) {
        return g(this.f90933a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f90933a);
    }

    public final /* synthetic */ long s() {
        return this.f90933a;
    }

    public String toString() {
        return r(this.f90933a);
    }
}
