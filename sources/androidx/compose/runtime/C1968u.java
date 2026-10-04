package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.InterfaceC1946s;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4584:1\n4186#1,8:4593\n4186#1,8:4608\n4553#1,7:4617\n4553#1,7:4632\n1#2:4585\n2300#3,7:4586\n2308#3:4601\n2290#3,6:4602\n2297#3:4616\n159#4,8:4624\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n4168#1:4593,8\n4223#1:4608,8\n4243#1:4617,7\n4561#1:4632,7\n4159#1:4586,7\n4159#1:4601\n4214#1:4602,6\n4214#1:4616\n4406#1:4624,8\n*E\n"})
public final class C1968u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static J f100214a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100215b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100216c = 125;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100217d = -127;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100218e = 200;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f100220g = 201;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f100222i = 202;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f100224k = 203;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f100226m = 204;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f100228o = 206;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f100230q = 207;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f100231r = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Object f100219f = new S0("provider");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Object f100221h = new S0("provider");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Object f100223j = new S0("compositionLocalMap");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Object f100225l = new S0("providerValues");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Object f100227n = new S0("providers");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Object f100229p = new S0("reference");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final Comparator<C1942q0> f100232s = new C1965t();

    public static final int A(List<C1942q0> list, int i10) {
        int iB = B(list, i10);
        return iB < 0 ? -(iB + 1) : iB;
    }

    public static final int B(List<C1942q0> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iT = kotlin.jvm.internal.G.t(list.get(i12).f99961b, i10);
            if (iT < 0) {
                i11 = i12 + 1;
            } else {
                if (iT <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final C1942q0 C(List<C1942q0> list, int i10, int i11) {
        int iA = A(list, i10);
        if (iA >= list.size()) {
            return null;
        }
        C1942q0 c1942q0 = list.get(iA);
        if (c1942q0.f99961b < i11) {
            return c1942q0;
        }
        return null;
    }

    @NotNull
    public static final Object D() {
        return f100223j;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void E() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void F() {
    }

    public static /* synthetic */ void G() {
    }

    @NotNull
    public static final Object H() {
        return f100219f;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void I() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void J() {
    }

    public static final Object K(C1947s0 c1947s0) {
        return c1947s0.f99973b != null ? new C1944r0(Integer.valueOf(c1947s0.f99972a), c1947s0.f99973b) : Integer.valueOf(c1947s0.f99972a);
    }

    public static final Object L(Object obj, Object obj2, Object obj3) {
        C1944r0 c1944r0 = obj instanceof C1944r0 ? (C1944r0) obj : null;
        if (c1944r0 == null) {
            return null;
        }
        if (kotlin.jvm.internal.G.g(c1944r0.f99964a, obj2) && kotlin.jvm.internal.G.g(c1944r0.f99965b, obj3)) {
            return obj;
        }
        Object objL = L(c1944r0.f99964a, obj2, obj3);
        return objL == null ? L(c1944r0.f99965b, obj2, obj3) : objL;
    }

    @NotNull
    public static final Object M() {
        return f100221h;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void N() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void O() {
    }

    @NotNull
    public static final Object P() {
        return f100227n;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void Q() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void R() {
    }

    @NotNull
    public static final Object S() {
        return f100225l;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void T() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void U() {
    }

    @NotNull
    public static final Object V() {
        return f100229p;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void W() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void X() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void Y() {
    }

    public static final void Z(List<C1942q0> list, int i10, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iB = B(list, i10);
        if (iB < 0) {
            int i11 = -(iB + 1);
            if (!(obj instanceof N)) {
                obj = null;
            }
            list.add(i11, new C1942q0(recomposeScopeImpl, i10, obj));
            return;
        }
        C1942q0 c1942q0 = list.get(iB);
        if (!(obj instanceof N)) {
            c1942q0.f99962c = null;
            return;
        }
        Object obj2 = c1942q0.f99962c;
        if (obj2 == null) {
            c1942q0.f99962c = obj;
        } else if (obj2 instanceof MutableScatterSet) {
            ((MutableScatterSet) obj2).C(obj);
        } else {
            c1942q0.f99962c = androidx.collection.T0.d(obj2, obj);
        }
    }

    public static final boolean a0(@NotNull C1970u1 c1970u1) {
        return c1970u1.f100243h > c1970u1.f100245j + 1;
    }

    public static final int b(C1942q0 c1942q0, C1942q0 c1942q02) {
        return kotlin.jvm.internal.G.t(c1942q0.f99961b, c1942q02.f99961b);
    }

    public static final boolean b0(@NotNull C1982y1 c1982y1) {
        return c1982y1.f100343t > c1982y1.f100345v + 1;
    }

    public static final boolean c(int i10) {
        return i10 != 0;
    }

    @InterfaceC1935o
    public static final boolean c0() {
        J j10 = f100214a;
        return j10 != null && j10.a();
    }

    public static final int d(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static final <K, V> MutableScatterMap<K, Object> d0(int i10) {
        return new MutableScatterMap<>(i10);
    }

    public static final int e0(C1970u1 c1970u1, int i10, int i11, int i12) {
        if (i10 != i11) {
            if (i10 == i12 || i11 == i12) {
                return i12;
            }
            if (C1979x1.p0(c1970u1.f100237b, i10) == i11) {
                return i11;
            }
            if (C1979x1.p0(c1970u1.f100237b, i11) != i10) {
                if (C1979x1.p0(c1970u1.f100237b, i10) == C1979x1.p0(c1970u1.f100237b, i11)) {
                    return C1979x1.p0(c1970u1.f100237b, i10);
                }
                int iY = y(c1970u1, i10, i12);
                int iY2 = y(c1970u1, i11, i12);
                int i13 = iY - iY2;
                for (int i14 = 0; i14 < i13; i14++) {
                    i10 = C1979x1.p0(c1970u1.f100237b, i10);
                }
                int i15 = iY2 - iY;
                for (int i16 = 0; i16 < i15; i16++) {
                    i11 = C1979x1.p0(c1970u1.f100237b, i11);
                }
                while (i10 != i11) {
                    i10 = C1979x1.p0(c1970u1.f100237b, i10);
                    i11 = C1979x1.p0(c1970u1.f100237b, i11);
                }
                return i10;
            }
        }
        return i10;
    }

    public static final void f0(@NotNull C1982y1 c1982y1, @NotNull InterfaceC1931m1 interfaceC1931m1) {
        int iN0;
        int[] iArr = c1982y1.f100325b;
        int i10 = c1982y1.f100343t;
        int iS = c1982y1.S(iArr, c1982y1.r0(c1982y1.u0(i10) + i10));
        for (int iS2 = c1982y1.S(c1982y1.f100325b, c1982y1.r0(c1982y1.f100343t)); iS2 < iS; iS2++) {
            Object obj = c1982y1.f100326c[c1982y1.T(iS2)];
            int iG = -1;
            if (obj instanceof InterfaceC1938p) {
                interfaceC1931m1.c((InterfaceC1938p) obj, c1982y1.n0() - iS2, -1, -1);
            }
            if (obj instanceof C1937o1) {
                int iN02 = c1982y1.n0() - iS2;
                C1937o1 c1937o1 = (C1937o1) obj;
                C1889c c1889c = c1937o1.f99956b;
                if (c1889c == null || !c1889c.b()) {
                    iN0 = -1;
                } else {
                    iG = c1982y1.G(c1889c);
                    iN0 = c1982y1.n0() - c1982y1.x1(iG);
                }
                interfaceC1931m1.b(c1937o1.f99955a, iN02, iG, iN0);
            }
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).B();
            }
        }
        c1982y1.g1();
    }

    public static final void g0(C1982y1 c1982y1, int i10, int i11, Object obj) {
        InterfaceC1946s.f99968a.getClass();
        if (obj == c1982y1.n1(i10, i11, InterfaceC1946s.a.f99970b)) {
            return;
        }
        v("Slot table is out of sync");
        throw null;
    }

    public static final C1942q0 h0(List<C1942q0> list, int i10) {
        int iB = B(list, i10);
        if (iB >= 0) {
            return list.remove(iB);
        }
        return null;
    }

    public static final void i0(List<C1942q0> list, int i10, int i11) {
        int iA = A(list, i10);
        while (iA < list.size() && list.get(iA).f99961b < i11) {
            list.remove(iA);
        }
    }

    public static final void j0(boolean z10) {
        if (z10) {
            return;
        }
        v("Check failed");
        throw null;
    }

    public static final void k0(boolean z10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (z10) {
            return;
        }
        v(interfaceC4376a.invoke());
        throw null;
    }

    public static final MutableScatterMap l(int i10) {
        return new MutableScatterMap(i10);
    }

    @InterfaceC1935o
    public static final void l0(@NotNull InterfaceC1946s interfaceC1946s, @NotNull String str) {
        interfaceC1946s.n(str);
    }

    @InterfaceC1935o
    public static final void m0(@NotNull InterfaceC1946s interfaceC1946s) {
        interfaceC1946s.w();
    }

    @InterfaceC1935o
    public static final void n0(@NotNull InterfaceC1946s interfaceC1946s, int i10, @NotNull String str) {
        interfaceC1946s.q(i10, str);
    }

    @InterfaceC1935o
    public static final void o0() {
        J j10 = f100214a;
        if (j10 != null) {
            j10.c();
        }
    }

    @InterfaceC1935o
    public static final void p0(int i10, int i11, int i12, @NotNull String str) {
        J j10 = f100214a;
        if (j10 != null) {
            j10.b(i10, i11, i12, str);
        }
    }

    public static final boolean q(int i10) {
        return i10 != 0;
    }

    public static final int r(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static final <R> void r0(@NotNull C1982y1 c1982y1, @Nullable C1889c c1889c, @NotNull ed.p<? super Integer, ? super Integer, ? extends R> pVar) {
        int iG;
        int iN0;
        if (c1889c == null || !c1889c.b()) {
            iG = -1;
            iN0 = -1;
        } else {
            iG = c1982y1.G(c1889c);
            iN0 = c1982y1.n0() - c1982y1.x1(iG);
        }
        pVar.invoke(Integer.valueOf(iG), Integer.valueOf(iN0));
    }

    @InterfaceC1935o
    public static final <T> T s(@NotNull InterfaceC1946s interfaceC1946s, boolean z10, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        T t10 = (T) interfaceC1946s.a0();
        if (!z10) {
            InterfaceC1946s.f99968a.getClass();
            if (t10 != InterfaceC1946s.a.f99970b) {
                return t10;
            }
        }
        T tInvoke = interfaceC4376a.invoke();
        interfaceC1946s.S(tInvoke);
        return tInvoke;
    }

    public static final List<Object> t(C1973v1 c1973v1, C1889c c1889c) {
        ArrayList arrayList = new ArrayList();
        C1970u1 c1970u1P = c1973v1.P();
        try {
            u(c1970u1P, arrayList, c1973v1.i(c1889c));
            return arrayList;
        } finally {
            c1970u1P.e();
        }
    }

    public static final void u(C1970u1 c1970u1, List<Object> list, int i10) {
        if (C1979x1.f0(c1970u1.f100237b, i10)) {
            list.add(c1970u1.T(i10));
            return;
        }
        int iY = i10 + 1;
        int iY2 = C1979x1.Y(c1970u1.f100237b, i10) + i10;
        while (iY < iY2) {
            u(c1970u1, list, iY);
            iY += C1979x1.Y(c1970u1.f100237b, iY);
        }
    }

    public static final void v(@NotNull String str) {
        throw new ComposeRuntimeError(android.support.v4.media.i.a("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @NotNull
    public static final Void w(@NotNull String str) {
        throw new ComposeRuntimeError(android.support.v4.media.i.a("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void x(@NotNull C1982y1 c1982y1, @NotNull InterfaceC1931m1 interfaceC1931m1) {
        int iG;
        int iN0;
        int i10 = c1982y1.f100343t;
        int i11 = c1982y1.f100344u;
        while (i10 < i11) {
            Object objR0 = c1982y1.R0(i10);
            if (objR0 instanceof InterfaceC1938p) {
                interfaceC1931m1.a((InterfaceC1938p) objR0, c1982y1.n0() - c1982y1.z1(i10), -1, -1);
            }
            int iV1 = c1982y1.v1(c1982y1.f100325b, c1982y1.r0(i10));
            int i12 = i10 + 1;
            int iS = c1982y1.S(c1982y1.f100325b, c1982y1.r0(i12));
            for (int i13 = iV1; i13 < iS; i13++) {
                int i14 = i13 - iV1;
                Object obj = c1982y1.f100326c[c1982y1.T(i13)];
                if (obj instanceof C1937o1) {
                    C1937o1 c1937o1 = (C1937o1) obj;
                    InterfaceC1934n1 interfaceC1934n1 = c1937o1.f99955a;
                    if (!(interfaceC1934n1 instanceof InterfaceC1943q1)) {
                        g0(c1982y1, i10, i14, obj);
                        int iN02 = c1982y1.n0() - i14;
                        C1889c c1889c = c1937o1.f99956b;
                        if (c1889c == null || !c1889c.b()) {
                            iG = -1;
                            iN0 = -1;
                        } else {
                            iG = c1982y1.G(c1889c);
                            iN0 = c1982y1.n0() - c1982y1.x1(iG);
                        }
                        interfaceC1931m1.b(interfaceC1934n1, iN02, iG, iN0);
                    }
                } else if (obj instanceof RecomposeScopeImpl) {
                    g0(c1982y1, i10, i14, obj);
                    ((RecomposeScopeImpl) obj).B();
                }
            }
            i10 = i12;
        }
    }

    public static final int y(C1970u1 c1970u1, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = C1979x1.p0(c1970u1.f100237b, i10);
            i12++;
        }
        return i12;
    }

    public static final List<C1942q0> z(List<C1942q0> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int iA = A(list, i10); iA < list.size(); iA++) {
            C1942q0 c1942q0 = list.get(iA);
            if (c1942q0.f99961b >= i11) {
                break;
            }
            arrayList.add(c1942q0);
        }
        return arrayList;
    }
}
