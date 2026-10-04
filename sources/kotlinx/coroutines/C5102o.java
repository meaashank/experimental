package kotlinx.coroutines;

import ed.InterfaceC4376a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.InterfaceC4850b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.InterfaceC5098m;
import kotlinx.coroutines.internal.C5079m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,681:1\n226#1,10:685\n226#1,10:695\n226#1,10:706\n1#2:682\n20#3:683\n20#3:684\n18#3:705\n17#3:716\n18#3,3:717\n17#3:720\n18#3,3:721\n18#3:728\n17#3,4:729\n57#4,2:724\n57#4,2:726\n57#4,2:733\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n242#1:685,10\n245#1:695,10\n250#1:706,10\n68#1:683\n154#1:684\n248#1:705\n273#1:716\n274#1:717,3\n283#1:720\n284#1:721,3\n385#1:728\n388#1:729,4\n325#1:724,2\n335#1:726,2\n605#1:733,2\n*E\n"})
@InterfaceC4850b0
public class C5102o<T> extends Y<T> implements InterfaceC5100n<T>, Vc.c, l1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220419f = AtomicIntegerFieldUpdater.newUpdater(C5102o.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220420g = AtomicReferenceFieldUpdater.newUpdater(C5102o.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220421h = AtomicReferenceFieldUpdater.newUpdater(C5102o.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.e<T> f220422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.i f220423e;

    /* JADX WARN: Multi-variable type inference failed */
    public C5102o(@NotNull kotlin.coroutines.e<? super T> eVar, int i10) {
        super(i10);
        this.f220422d = eVar;
        this.f220423e = eVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C5055d.f219207a;
    }

    private final /* synthetic */ void N(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ed.l<? super Integer, kotlin.L0> lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void O(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ed.l<Object, kotlin.L0> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void W(C5102o c5102o, Object obj, int i10, ed.l lVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        c5102o.V(obj, i10, lVar);
    }

    private final boolean f0() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220419f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f220419f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final boolean j0() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220419f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f220419f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Nullable
    public final Object B() {
        return f220420g.get(this);
    }

    public final String C() {
        Object obj = f220420g.get(this);
        return obj instanceof N0 ? "Active" : obj instanceof r ? "Cancelled" : "Completed";
    }

    public final /* synthetic */ int D() {
        return this._decisionAndIndex$volatile;
    }

    public final /* synthetic */ Object F() {
        return this._parentHandle$volatile;
    }

    public final /* synthetic */ Object H() {
        return this._state$volatile;
    }

    public final InterfaceC5058e0 J() {
        A0 a02 = (A0) getContext().get(A0.f218690A3);
        if (a02 == null) {
            return null;
        }
        InterfaceC5058e0 interfaceC5058e0B = JobKt__JobKt.B(a02, true, false, new C5109s(this), 2, null);
        androidx.concurrent.futures.c.a(f220421h, this, null, interfaceC5058e0B);
        return interfaceC5058e0B;
    }

    public final void K(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220420g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C5055d)) {
                if (obj2 instanceof InterfaceC5098m ? true : obj2 instanceof kotlinx.coroutines.internal.N) {
                    P(obj, obj2);
                    throw null;
                }
                if (obj2 instanceof B) {
                    B b10 = (B) obj2;
                    if (!b10.d()) {
                        P(obj, obj2);
                        throw null;
                    }
                    if (obj2 instanceof r) {
                        if (!androidx.activity.D.a(obj2)) {
                            b10 = null;
                        }
                        Throwable th = b10 != null ? b10.f218701a : null;
                        if (obj instanceof InterfaceC5098m) {
                            k((InterfaceC5098m) obj, th);
                            return;
                        } else {
                            kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            q((kotlinx.coroutines.internal.N) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof A) {
                    A a10 = (A) obj2;
                    if (a10.f218686b != null) {
                        P(obj, obj2);
                        throw null;
                    }
                    if (obj instanceof kotlinx.coroutines.internal.N) {
                        return;
                    }
                    kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC5098m interfaceC5098m = (InterfaceC5098m) obj;
                    if (a10.h()) {
                        k(interfaceC5098m, a10.f218689e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.c.a(f220420g, this, obj2, A.g(a10, null, interfaceC5098m, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof kotlinx.coroutines.internal.N) {
                        return;
                    }
                    kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.c.a(f220420g, this, obj2, new A(obj2, (InterfaceC5098m) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            } else if (androidx.concurrent.futures.c.a(f220420g, this, obj2, obj)) {
                return;
            }
        }
    }

    public final void L(@NotNull InterfaceC5098m interfaceC5098m) {
        K(interfaceC5098m);
    }

    public final boolean M() {
        if (!Z.d(this.f218805c)) {
            return false;
        }
        kotlin.coroutines.e<T> eVar = this.f220422d;
        kotlin.jvm.internal.G.n(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C5079m) eVar).t();
    }

    public final void P(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @NotNull
    public String Q() {
        return "CancellableContinuation";
    }

    public final void R(@NotNull Throwable th) {
        if (s(th)) {
            return;
        }
        g(th);
        u();
    }

    public final void S() {
        Throwable thD;
        kotlin.coroutines.e<T> eVar = this.f220422d;
        C5079m c5079m = eVar instanceof C5079m ? (C5079m) eVar : null;
        if (c5079m == null || (thD = c5079m.D(this)) == null) {
            return;
        }
        t();
        g(thD);
    }

    @dd.j(name = "resetStateReusable")
    public final boolean T() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220420g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof A) && ((A) obj).f218688d != null) {
            t();
            return false;
        }
        f220419f.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C5055d.f219207a);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    public boolean U() {
        return !(f220420g.get(this) instanceof N0);
    }

    public final void V(Object obj, int i10, ed.l<? super Throwable, kotlin.L0> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220420g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof N0)) {
                Object obj3 = obj;
                ed.l<? super Throwable, kotlin.L0> lVar2 = lVar;
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.h()) {
                        if (lVar2 != null) {
                            o(lVar2, rVar.f218701a);
                            return;
                        }
                        return;
                    }
                }
                j(obj3);
                throw null;
            }
            Object obj4 = obj;
            int i11 = i10;
            ed.l<? super Throwable, kotlin.L0> lVar3 = lVar;
            if (androidx.concurrent.futures.c.a(f220420g, this, obj2, Y((N0) obj2, obj4, i11, lVar3, null))) {
                u();
                v(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                lVar = lVar3;
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    public void X(T t10, @Nullable ed.l<? super Throwable, kotlin.L0> lVar) {
        V(t10, this.f218805c, lVar);
    }

    public final Object Y(N0 n02, Object obj, int i10, ed.l<? super Throwable, kotlin.L0> lVar, Object obj2) {
        if (obj instanceof B) {
            return obj;
        }
        if ((Z.c(i10) || obj2 != null) && !(lVar == null && !(n02 instanceof InterfaceC5098m) && obj2 == null)) {
            return new A(obj, n02 instanceof InterfaceC5098m ? (InterfaceC5098m) n02 : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    public final /* synthetic */ void Z(int i10) {
        this._decisionAndIndex$volatile = i10;
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    public void a0(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th) {
        kotlin.coroutines.e<T> eVar = this.f220422d;
        C5079m c5079m = eVar instanceof C5079m ? (C5079m) eVar : null;
        W(this, new B(th, false, 2, null), (c5079m != null ? c5079m.f220345d : null) == coroutineDispatcher ? 4 : this.f218805c, null, 4, null);
    }

    @Override // kotlinx.coroutines.l1
    public void b(@NotNull kotlinx.coroutines.internal.N<?> n10, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220419f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        K(n10);
    }

    public final /* synthetic */ void b0(Object obj) {
        this._parentHandle$volatile = obj;
    }

    @Override // kotlinx.coroutines.Y
    public void c(@Nullable Object obj, @NotNull Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220420g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof N0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof B) {
                return;
            }
            if (obj2 instanceof A) {
                A a10 = (A) obj2;
                if (a10.h()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (androidx.concurrent.futures.c.a(f220420g, this, obj2, A.g(a10, null, null, null, null, th3, 15, null))) {
                    a10.i(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (androidx.concurrent.futures.c.a(f220420g, this, obj2, new A(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    public void c0(@NotNull Object obj) {
        v(this.f218805c);
    }

    @Override // kotlinx.coroutines.Y
    @NotNull
    public final kotlin.coroutines.e<T> d() {
        return this.f220422d;
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    @Nullable
    public Object d0(T t10, @Nullable Object obj) {
        return i0(t10, obj, null);
    }

    @Override // kotlinx.coroutines.Y
    @Nullable
    public Throwable e(@Nullable Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    public final /* synthetic */ void e0(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.Y
    public <T> T f(@Nullable Object obj) {
        return obj instanceof A ? (T) ((A) obj).f218685a : obj;
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    public boolean g(@Nullable Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220420g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof N0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.c.a(f220420g, this, obj, new r(this, th, (obj instanceof InterfaceC5098m) || (obj instanceof kotlinx.coroutines.internal.N))));
        N0 n02 = (N0) obj;
        if (n02 instanceof InterfaceC5098m) {
            k((InterfaceC5098m) obj, th);
        } else if (n02 instanceof kotlinx.coroutines.internal.N) {
            q((kotlinx.coroutines.internal.N) obj, th);
        }
        u();
        v(this.f218805c);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    @Nullable
    public Object g0(@NotNull Throwable th) {
        return i0(new B(th, false, 2, null), null, null);
    }

    @Override // Vc.c
    @Nullable
    public Vc.c getCallerFrame() {
        kotlin.coroutines.e<T> eVar = this.f220422d;
        if (eVar instanceof Vc.c) {
            return (Vc.c) eVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.e
    @NotNull
    public kotlin.coroutines.i getContext() {
        return this.f220423e;
    }

    @Override // Vc.c
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    @Nullable
    public Object h0(T t10, @Nullable Object obj, @Nullable ed.l<? super Throwable, kotlin.L0> lVar) {
        return i0(t10, obj, lVar);
    }

    @Override // kotlinx.coroutines.Y
    @Nullable
    public Object i() {
        return f220420g.get(this);
    }

    public final kotlinx.coroutines.internal.Q i0(Object obj, Object obj2, ed.l<? super Throwable, kotlin.L0> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220420g;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof N0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof A) && obj4 != null && ((A) obj3).f218688d == obj4) {
                    return C5104p.f220431g;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            ed.l<? super Throwable, kotlin.L0> lVar2 = lVar;
            if (androidx.concurrent.futures.c.a(f220420g, this, obj3, Y((N0) obj3, obj5, this.f218805c, lVar2, obj6))) {
                u();
                return C5104p.f220431g;
            }
            obj = obj5;
            lVar = lVar2;
            obj2 = obj6;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    public boolean isActive() {
        return f220420g.get(this) instanceof N0;
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    public boolean isCancelled() {
        return f220420g.get(this) instanceof r;
    }

    public final Void j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void k(@NotNull InterfaceC5098m interfaceC5098m, @Nullable Throwable th) {
        try {
            interfaceC5098m.a(th);
        } catch (Throwable th2) {
            I.b(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    public void k0(@NotNull ed.l<? super Throwable, kotlin.L0> lVar) {
        C5106q.c(this, new InterfaceC5098m.a(lVar));
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    public void l0(@NotNull CoroutineDispatcher coroutineDispatcher, T t10) {
        kotlin.coroutines.e<T> eVar = this.f220422d;
        C5079m c5079m = eVar instanceof C5079m ? (C5079m) eVar : null;
        W(this, t10, (c5079m != null ? c5079m.f220345d : null) == coroutineDispatcher ? 4 : this.f218805c, null, 4, null);
    }

    public final void m(InterfaceC5118w0 interfaceC5118w0, Throwable th) {
        try {
            interfaceC5118w0.a(th);
        } catch (Throwable th2) {
            I.b(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final /* synthetic */ void m0(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ed.l<? super Integer, Integer> lVar) {
        int i10;
        do {
            i10 = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i10, lVar.invoke(Integer.valueOf(i10)).intValue()));
    }

    public final void n(InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        try {
            interfaceC4376a.invoke();
        } catch (Throwable th) {
            I.b(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5100n
    public void n0() {
        InterfaceC5058e0 interfaceC5058e0J = J();
        if (interfaceC5058e0J != null && U()) {
            interfaceC5058e0J.dispose();
            f220421h.set(this, M0.f218772a);
        }
    }

    public final void o(@NotNull ed.l<? super Throwable, kotlin.L0> lVar, @NotNull Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            I.b(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void q(kotlinx.coroutines.internal.N<?> n10, Throwable th) {
        int i10 = f220419f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            n10.z(i10, th, getContext());
        } catch (Throwable th2) {
            I.b(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@NotNull Object obj) {
        W(this, E.c(obj, this), this.f218805c, null, 4, null);
    }

    public final boolean s(Throwable th) {
        if (!M()) {
            return false;
        }
        kotlin.coroutines.e<T> eVar = this.f220422d;
        kotlin.jvm.internal.G.n(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C5079m) eVar).v(th);
    }

    public final void t() {
        InterfaceC5058e0 interfaceC5058e0X = x();
        if (interfaceC5058e0X == null) {
            return;
        }
        interfaceC5058e0X.dispose();
        f220421h.set(this, M0.f218772a);
    }

    @NotNull
    public String toString() {
        return Q() + '(' + O.c(this.f220422d) + "){" + C() + "}@" + O.b(this);
    }

    public final void u() {
        if (M()) {
            return;
        }
        t();
    }

    public final void v(int i10) {
        if (f0()) {
            return;
        }
        Z.a(this, i10);
    }

    @NotNull
    public Throwable w(@NotNull A0 a02) {
        return a02.f1();
    }

    public final InterfaceC5058e0 x() {
        return (InterfaceC5058e0) f220421h.get(this);
    }

    @InterfaceC4850b0
    @Nullable
    public final Object z() {
        A0 a02;
        boolean zM = M();
        if (j0()) {
            if (x() == null) {
                J();
            }
            if (zM) {
                S();
            }
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (zM) {
            S();
        }
        Object obj = f220420g.get(this);
        if (obj instanceof B) {
            throw ((B) obj).f218701a;
        }
        if (!Z.c(this.f218805c) || (a02 = (A0) getContext().get(A0.f218690A3)) == null || a02.isActive()) {
            return f(obj);
        }
        CancellationException cancellationExceptionF1 = a02.f1();
        c(obj, cancellationExceptionF1);
        throw cancellationExceptionF1;
    }
}
