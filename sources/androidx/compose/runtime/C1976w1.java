package androidx.compose.runtime;

import fd.InterfaceC4418a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4179:1\n159#2,8:4180\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3550#1:4180,8\n*E\n"})
public final class C1976w1 implements androidx.compose.runtime.tooling.d, Iterable<androidx.compose.runtime.tooling.d>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1973v1 f100263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f100265c;

    public C1976w1(C1973v1 c1973v1, int i10, int i11, int i12, C4969v c4969v) {
        this(c1973v1, i10, (i12 & 4) != 0 ? c1973v1.f100258g : i11);
    }

    public static final androidx.compose.runtime.tooling.d h(C1976w1 c1976w1, C1889c c1889c) {
        int i10;
        int i11;
        if (!c1976w1.f100263a.R(c1889c) || (i10 = c1976w1.f100263a.i(c1889c)) < (i11 = c1976w1.f100264b) || i10 - i11 >= C1979x1.Y(c1976w1.f100263a.f100252a, i11)) {
            return null;
        }
        return new C1976w1(c1976w1.f100263a, i10, c1976w1.f100265c);
    }

    public static final androidx.compose.runtime.tooling.d i(androidx.compose.runtime.tooling.d dVar, int i10) {
        return (androidx.compose.runtime.tooling.d) kotlin.collections.U.L2(kotlin.collections.U.g2(dVar.g(), i10));
    }

    private final void t() {
        if (this.f100263a.f100258g != this.f100265c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.tooling.b
    @Nullable
    public androidx.compose.runtime.tooling.d b(@NotNull Object obj) {
        if (obj instanceof C1889c) {
            return h(this, (C1889c) obj);
        }
        if (obj instanceof S1) {
            S1 s12 = (S1) obj;
            androidx.compose.runtime.tooling.d dVarB = b(s12.f99336a);
            if (dVarB != null) {
                return i(dVarB, s12.f99337b);
            }
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.b
    @NotNull
    public Iterable<androidx.compose.runtime.tooling.d> g() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.d
    @Nullable
    public Object g0() {
        if (!C1979x1.f0(this.f100263a.f100252a, this.f100264b)) {
            return null;
        }
        C1973v1 c1973v1 = this.f100263a;
        return c1973v1.f100254c[C1979x1.n0(c1973v1.f100252a, this.f100264b)];
    }

    @Override // androidx.compose.runtime.tooling.d
    @NotNull
    public Iterable<Object> getData() {
        C1915h0 c1915h0B0 = this.f100263a.b0(this.f100264b);
        return c1915h0B0 != null ? new O1(this.f100263a, this.f100264b, c1915h0B0) : new M(this.f100263a, this.f100264b);
    }

    @Override // androidx.compose.runtime.tooling.d
    @NotNull
    public Object getKey() {
        if (!C1979x1.d0(this.f100263a.f100252a, this.f100264b)) {
            return Integer.valueOf(this.f100263a.f100252a[this.f100264b * 5]);
        }
        C1973v1 c1973v1 = this.f100263a;
        Object obj = c1973v1.f100254c[C1979x1.o0(c1973v1.f100252a, this.f100264b)];
        kotlin.jvm.internal.G.m(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.d
    @Nullable
    public String h0() {
        if (!C1979x1.b0(this.f100263a.f100252a, this.f100264b)) {
            C1915h0 c1915h0B0 = this.f100263a.b0(this.f100264b);
            if (c1915h0B0 != null) {
                return c1915h0B0.f99692b;
            }
            return null;
        }
        C1973v1 c1973v1 = this.f100263a;
        Object obj = c1973v1.f100254c[C1979x1.M(c1973v1.f100252a, this.f100264b)];
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.d
    public int i0() {
        return C1979x1.Y(this.f100263a.f100252a, this.f100264b);
    }

    @Override // androidx.compose.runtime.tooling.b
    public boolean isEmpty() {
        return C1979x1.Y(this.f100263a.f100252a, this.f100264b) == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<androidx.compose.runtime.tooling.d> iterator() {
        t();
        C1915h0 c1915h0B0 = this.f100263a.b0(this.f100264b);
        if (c1915h0B0 != null) {
            C1973v1 c1973v1 = this.f100263a;
            int i10 = this.f100264b;
            return new P1(c1973v1, i10, c1915h0B0, new C1901d(i10));
        }
        C1973v1 c1973v12 = this.f100263a;
        int i11 = this.f100264b;
        return new C1909f0(c1973v12, i11 + 1, C1979x1.Y(c1973v12.f100252a, i11) + i11);
    }

    public final int j() {
        return this.f100264b;
    }

    @Override // androidx.compose.runtime.tooling.d
    @NotNull
    public Object j0() {
        t();
        C1970u1 c1970u1P = this.f100263a.P();
        try {
            return c1970u1P.a(this.f100264b);
        } finally {
            c1970u1P.e();
        }
    }

    @Override // androidx.compose.runtime.tooling.d
    public int k0() {
        int iI0 = i0() + this.f100264b;
        C1973v1 c1973v1 = this.f100263a;
        return (iI0 < c1973v1.f100253b ? C1979x1.Q(c1973v1.f100252a, iI0) : c1973v1.f100255d) - C1979x1.Q(this.f100263a.f100252a, this.f100264b);
    }

    @NotNull
    public final C1973v1 o() {
        return this.f100263a;
    }

    public final int q() {
        return this.f100265c;
    }

    public C1976w1(@NotNull C1973v1 c1973v1, int i10, int i11) {
        this.f100263a = c1973v1;
        this.f100264b = i10;
        this.f100265c = i11;
    }
}
