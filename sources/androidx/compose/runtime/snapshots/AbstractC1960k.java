package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.C1886b;
import androidx.compose.runtime.InterfaceC1936o0;
import androidx.compose.runtime.U0;
import androidx.compose.runtime.Z;
import androidx.compose.runtime.snapshots.AbstractC1960k;
import ed.InterfaceC4376a;
import java.util.Set;
import kotlin.InterfaceC4850b0;
import kotlin.L0;
import kotlin.collections.U;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2431:1\n1843#2:2432\n1843#2:2441\n89#3:2433\n89#3:2442\n50#4,7:2434\n33#4,7:2443\n1#5:2450\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n100#1:2432\n251#1:2441\n100#1:2433\n251#1:2442\n186#1:2434,7\n280#1:2443,7\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class AbstractC1960k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f100175e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100176f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f100177g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public SnapshotIdSet f100178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f100179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f100180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f100181d;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.k$a */
    @V({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n547#1:2438\n547#1:2444\n550#1:2445\n1#2:2432\n138#3,5:2433\n138#3,5:2439\n1843#4:2446\n1843#4:2448\n1843#4:2450\n1843#4:2452\n1843#4:2454\n89#5:2447\n89#5:2449\n89#5:2451\n89#5:2453\n89#5:2455\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n493#1:2438\n555#1:2444\n559#1:2445\n462#1:2433,5\n529#1:2439,5\n623#1:2446\n650#1:2448\n688#1:2450\n627#1:2452\n655#1:2454\n623#1:2447\n650#1:2449\n688#1:2451\n627#1:2453\n655#1:2455\n*E\n"})
    public static final class a {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C1952c A(a aVar, ed.l lVar, ed.l lVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            if ((i10 & 2) != 0) {
                lVar2 = null;
            }
            return aVar.z(lVar, lVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC1960k C(a aVar, ed.l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            return aVar.B(lVar);
        }

        @InterfaceC4850b0
        public static /* synthetic */ void h() {
        }

        public static /* synthetic */ void i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object p(a aVar, ed.l lVar, ed.l lVar2, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            if ((i10 & 2) != 0) {
                lVar2 = null;
            }
            return aVar.o(lVar, lVar2, interfaceC4376a);
        }

        public static final void s(ed.p pVar) {
            synchronized (SnapshotKt.K()) {
                SnapshotKt.f100102i = U.v4(SnapshotKt.f100102i, pVar);
            }
        }

        public static final void u(ed.l lVar) {
            synchronized (SnapshotKt.K()) {
                SnapshotKt.f100103j = U.v4(SnapshotKt.f100103j, lVar);
            }
            SnapshotKt.C();
        }

        @NotNull
        public final AbstractC1960k B(@Nullable ed.l<Object, L0> lVar) {
            return SnapshotKt.I().E(lVar);
        }

        public final <R> R D(@NotNull InterfaceC4376a<? extends R> interfaceC4376a) {
            C1952c c1952cA = A(this, null, null, 3, null);
            try {
                AbstractC1960k abstractC1960kS = c1952cA.s();
                try {
                    R rInvoke = interfaceC4376a.invoke();
                    c1952cA.z(abstractC1960kS);
                    c1952cA.N().a();
                    return rInvoke;
                } catch (Throwable th) {
                    c1952cA.z(abstractC1960kS);
                    throw th;
                }
            } finally {
                c1952cA.d();
            }
        }

        public final <T> T E(@NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
            AbstractC1960k abstractC1960kG = g();
            ed.l<Object, L0> lVarK = abstractC1960kG != null ? abstractC1960kG.k() : null;
            AbstractC1960k abstractC1960kM = m(abstractC1960kG);
            try {
                return interfaceC4376a.invoke();
            } finally {
                x(abstractC1960kG, abstractC1960kM, lVarK);
            }
        }

        @InterfaceC4850b0
        @NotNull
        public final AbstractC1960k c() {
            return SnapshotKt.F((AbstractC1960k) SnapshotKt.f100096c.a(), null, false, 6, null);
        }

        public final boolean d(N n10) {
            return n10.f100070y == C1886b.b();
        }

        public final boolean e(O o10) {
            return o10.f100077m == C1886b.b();
        }

        @NotNull
        public final AbstractC1960k f() {
            return SnapshotKt.I();
        }

        @Nullable
        public final AbstractC1960k g() {
            return (AbstractC1960k) SnapshotKt.f100096c.a();
        }

        public final <T> T j(@NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
            AbstractC1960k abstractC1960kV = v();
            T tInvoke = interfaceC4376a.invoke();
            AbstractC1960k.f100175e.w(abstractC1960kV);
            return tInvoke;
        }

        public final boolean k() {
            return SnapshotKt.f100106m.get() > 0;
        }

        public final boolean l() {
            return SnapshotKt.f100096c.a() != null;
        }

        @InterfaceC4850b0
        @NotNull
        public final AbstractC1960k m(@Nullable AbstractC1960k abstractC1960k) {
            if (abstractC1960k instanceof N) {
                N n10 = (N) abstractC1960k;
                if (n10.f100070y == C1886b.b()) {
                    n10.f100068w = null;
                    return abstractC1960k;
                }
            }
            if (abstractC1960k instanceof O) {
                O o10 = (O) abstractC1960k;
                if (o10.f100077m == C1886b.b()) {
                    o10.f100075k = null;
                    return abstractC1960k;
                }
            }
            AbstractC1960k abstractC1960kF = SnapshotKt.F(abstractC1960k, null, false, 6, null);
            abstractC1960kF.s();
            return abstractC1960kF;
        }

        public final void n() {
            SnapshotKt.I().v();
        }

        public final <T> T o(@Nullable ed.l<Object, L0> lVar, @Nullable ed.l<Object, L0> lVar2, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
            AbstractC1960k n10;
            if (lVar == null && lVar2 == null) {
                return interfaceC4376a.invoke();
            }
            AbstractC1960k abstractC1960k = (AbstractC1960k) SnapshotKt.f100096c.a();
            if (abstractC1960k instanceof N) {
                N n11 = (N) abstractC1960k;
                if (n11.f100070y == C1886b.b()) {
                    ed.l<Object, L0> lVar3 = n11.f100068w;
                    ed.l<Object, L0> lVar4 = n11.f100069x;
                    try {
                        ((N) abstractC1960k).f100068w = SnapshotKt.P(lVar, lVar3, false, 4, null);
                        ((N) abstractC1960k).f100069x = SnapshotKt.Q(lVar2, lVar4);
                        return interfaceC4376a.invoke();
                    } finally {
                        n11.f100068w = lVar3;
                        n11.f100069x = lVar4;
                    }
                }
            }
            if (abstractC1960k == null || (abstractC1960k instanceof C1952c)) {
                n10 = new N(abstractC1960k instanceof C1952c ? (C1952c) abstractC1960k : null, lVar, lVar2, true, false);
            } else {
                if (lVar == null) {
                    return interfaceC4376a.invoke();
                }
                n10 = abstractC1960k.E(lVar);
            }
            try {
                AbstractC1960k abstractC1960kS = n10.s();
                try {
                    T tInvoke = interfaceC4376a.invoke();
                    n10.z(abstractC1960kS);
                    n10.d();
                    return tInvoke;
                } catch (Throwable th) {
                    n10.z(abstractC1960kS);
                    throw th;
                }
            } catch (Throwable th2) {
                n10.d();
                throw th2;
            }
        }

        @InterfaceC1936o0
        public final int q() {
            return U.a6(SnapshotKt.f100098e).size();
        }

        @NotNull
        public final InterfaceC1955f r(@NotNull final ed.p<? super Set<? extends Object>, ? super AbstractC1960k, L0> pVar) {
            SnapshotKt.B(SnapshotKt.f100094a);
            synchronized (SnapshotKt.f100097d) {
                SnapshotKt.f100102i = U.J4(SnapshotKt.f100102i, pVar);
            }
            return new InterfaceC1955f() { // from class: androidx.compose.runtime.snapshots.i
                @Override // androidx.compose.runtime.snapshots.InterfaceC1955f
                public final void dispose() {
                    AbstractC1960k.a.s(pVar);
                }
            };
        }

        @NotNull
        public final InterfaceC1955f t(@NotNull final ed.l<Object, L0> lVar) {
            synchronized (SnapshotKt.K()) {
                SnapshotKt.f100103j = U.J4(SnapshotKt.f100103j, lVar);
            }
            SnapshotKt.C();
            return new InterfaceC1955f() { // from class: androidx.compose.runtime.snapshots.j
                @Override // androidx.compose.runtime.snapshots.InterfaceC1955f
                public final void dispose() {
                    AbstractC1960k.a.u(lVar);
                }
            };
        }

        @InterfaceC4850b0
        @Nullable
        public final AbstractC1960k v() {
            AbstractC1960k abstractC1960k = (AbstractC1960k) SnapshotKt.f100096c.a();
            if (abstractC1960k != null) {
                SnapshotKt.f100096c.b(null);
            }
            return abstractC1960k;
        }

        @InterfaceC4850b0
        public final void w(@Nullable AbstractC1960k abstractC1960k) {
            if (abstractC1960k != null) {
                SnapshotKt.f100096c.b(abstractC1960k);
            }
        }

        @InterfaceC4850b0
        public final void x(@Nullable AbstractC1960k abstractC1960k, @NotNull AbstractC1960k abstractC1960k2, @Nullable ed.l<Object, L0> lVar) {
            if (abstractC1960k != abstractC1960k2) {
                abstractC1960k2.z(abstractC1960k);
                abstractC1960k2.d();
            } else if (abstractC1960k instanceof N) {
                ((N) abstractC1960k).f100068w = lVar;
            } else if (abstractC1960k instanceof O) {
                ((O) abstractC1960k).f100075k = lVar;
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC1960k).toString());
            }
        }

        public final void y() {
            boolean z10;
            synchronized (SnapshotKt.K()) {
                MutableScatterSet<J> mutableScatterSet = SnapshotKt.f100104k.get().f100156k;
                z10 = false;
                if (mutableScatterSet != null) {
                    if (mutableScatterSet.s()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                SnapshotKt.C();
            }
        }

        @NotNull
        public final C1952c z(@Nullable ed.l<Object, L0> lVar, @Nullable ed.l<Object, L0> lVar2) {
            C1952c c1952cE0;
            AbstractC1960k abstractC1960kI = SnapshotKt.I();
            C1952c c1952c = abstractC1960kI instanceof C1952c ? (C1952c) abstractC1960kI : null;
            if (c1952c == null || (c1952cE0 = c1952c.e0(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return c1952cE0;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ AbstractC1960k(int i10, SnapshotIdSet snapshotIdSet, C4969v c4969v) {
        this(i10, snapshotIdSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC1960k F(AbstractC1960k abstractC1960k, ed.l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return abstractC1960k.E(lVar);
    }

    public static /* synthetic */ void j() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void l() {
    }

    public final void A(boolean z10) {
        this.f100180c = z10;
    }

    public void B(int i10) {
        this.f100179b = i10;
    }

    public void C(@NotNull SnapshotIdSet snapshotIdSet) {
        this.f100178a = snapshotIdSet;
    }

    public void D(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    @NotNull
    public abstract AbstractC1960k E(@Nullable ed.l<Object, L0> lVar);

    public final int G() {
        int i10 = this.f100181d;
        this.f100181d = -1;
        return i10;
    }

    @Z
    @Nullable
    public final AbstractC1960k H() {
        return s();
    }

    @Z
    public final void I(@Nullable AbstractC1960k abstractC1960k) {
        if (SnapshotKt.f100096c.a() == this) {
            z(abstractC1960k);
            return;
        }
        U0.e("Cannot leave snapshot; " + this + " is not the current snapshot");
        throw null;
    }

    public final void J() {
        if (this.f100180c) {
            U0.d("Cannot use a disposed snapshot");
            throw null;
        }
    }

    public final void b() {
        synchronized (SnapshotKt.K()) {
            c();
            y();
        }
    }

    public void c() {
        SnapshotKt.f100098e = SnapshotKt.f100098e.t(g());
    }

    public void d() {
        this.f100180c = true;
        synchronized (SnapshotKt.K()) {
            x();
        }
    }

    public final <T> T e(@NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        AbstractC1960k abstractC1960kS = s();
        try {
            return interfaceC4376a.invoke();
        } finally {
            z(abstractC1960kS);
        }
    }

    public final boolean f() {
        return this.f100180c;
    }

    public int g() {
        return this.f100179b;
    }

    @NotNull
    public SnapshotIdSet h() {
        return this.f100178a;
    }

    @Nullable
    public abstract MutableScatterSet<J> i();

    @Nullable
    public abstract ed.l<Object, L0> k();

    public abstract boolean m();

    @NotNull
    public abstract AbstractC1960k n();

    public int o() {
        return 0;
    }

    @Nullable
    public abstract ed.l<Object, L0> p();

    public abstract boolean q();

    public final boolean r() {
        return this.f100181d >= 0;
    }

    @InterfaceC4850b0
    @Nullable
    public AbstractC1960k s() {
        AbstractC1960k abstractC1960k = (AbstractC1960k) SnapshotKt.f100096c.a();
        SnapshotKt.f100096c.b(this);
        return abstractC1960k;
    }

    public abstract void t(@NotNull AbstractC1960k abstractC1960k);

    public abstract void u(@NotNull AbstractC1960k abstractC1960k);

    public abstract void v();

    public abstract void w(@NotNull J j10);

    public final void x() {
        int i10 = this.f100181d;
        if (i10 >= 0) {
            SnapshotKt.e0(i10);
            this.f100181d = -1;
        }
    }

    public void y() {
        x();
    }

    @InterfaceC4850b0
    public void z(@Nullable AbstractC1960k abstractC1960k) {
        SnapshotKt.f100096c.b(abstractC1960k);
    }

    public AbstractC1960k(int i10, SnapshotIdSet snapshotIdSet) {
        this.f100178a = snapshotIdSet;
        this.f100179b = i10;
        this.f100181d = i10 != 0 ? SnapshotKt.j0(i10, h()) : -1;
    }
}
