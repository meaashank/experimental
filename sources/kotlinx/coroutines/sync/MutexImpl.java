package kotlinx.coroutines.sync;

import dd.g;
import ed.l;
import ed.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.L0;
import kotlin.coroutines.e;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.Y;
import kotlinx.coroutines.C5102o;
import kotlinx.coroutines.C5106q;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC5058e0;
import kotlinx.coroutines.InterfaceC5100n;
import kotlinx.coroutines.InterfaceC5107q0;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.internal.N;
import kotlinx.coroutines.internal.Q;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.selects.h;
import kotlinx.coroutines.selects.j;
import kotlinx.coroutines.selects.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n336#2,12:306\n1#3:318\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n170#1:306,12\n*E\n"})
public class MutexImpl extends SemaphoreImpl implements kotlinx.coroutines.sync.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220744i = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final q<j<?>, Object, Object, l<Throwable, L0>> f220745h;
    private volatile /* synthetic */ Object owner$volatile;

    @V({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1#2:306\n*E\n"})
    public final class CancellableContinuationWithOwner implements InterfaceC5100n<L0>, l1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g
        @NotNull
        public final C5102o<L0> f220746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @g
        @Nullable
        public final Object f220747b;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(@NotNull C5102o<? super L0> c5102o, @Nullable Object obj) {
            this.f220746a = c5102o;
            this.f220747b = obj;
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        public boolean U() {
            return this.f220746a.U();
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void X(@NotNull L0 l02, @Nullable l<? super Throwable, L0> lVar) {
            MutexImpl.f220744i.set(MutexImpl.this, this.f220747b);
            C5102o<L0> c5102o = this.f220746a;
            final MutexImpl mutexImpl = MutexImpl.this;
            c5102o.X(l02, new l<Throwable, L0>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void e(@NotNull Throwable th) {
                    mutexImpl.i(this.f220747b);
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                    e(th);
                    return L0.f217464a;
                }
            });
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        @InterfaceC5107q0
        public void a0(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th) {
            this.f220746a.a0(coroutineDispatcher, th);
        }

        @Override // kotlinx.coroutines.l1
        public void b(@NotNull N<?> n10, int i10) {
            this.f220746a.b(n10, i10);
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        @InterfaceC5107q0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void l0(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull L0 l02) {
            this.f220746a.l0(coroutineDispatcher, l02);
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        @InterfaceC5120x0
        public void c0(@NotNull Object obj) {
            this.f220746a.c0(obj);
        }

        @InterfaceC5120x0
        @Nullable
        public Object d(@NotNull L0 l02, @Nullable Object obj) {
            return this.f220746a.d0(l02, obj);
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        public Object d0(L0 l02, Object obj) {
            return this.f220746a.d0(l02, obj);
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object h0(@NotNull L0 l02, @Nullable Object obj, @Nullable l<? super Throwable, L0> lVar) {
            final MutexImpl mutexImpl = MutexImpl.this;
            Object objH0 = this.f220746a.h0(l02, obj, new l<Throwable, L0>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void e(@NotNull Throwable th) {
                    MutexImpl.f220744i.set(mutexImpl, this.f220747b);
                    mutexImpl.i(this.f220747b);
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                    e(th);
                    return L0.f217464a;
                }
            });
            if (objH0 != null) {
                MutexImpl.f220744i.set(MutexImpl.this, this.f220747b);
            }
            return objH0;
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        public boolean g(@Nullable Throwable th) {
            return this.f220746a.g(th);
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        @InterfaceC5120x0
        @Nullable
        public Object g0(@NotNull Throwable th) {
            return this.f220746a.g0(th);
        }

        @Override // kotlin.coroutines.e
        @NotNull
        public i getContext() {
            return this.f220746a.getContext();
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        public boolean isActive() {
            return this.f220746a.isActive();
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        public boolean isCancelled() {
            return this.f220746a.isCancelled();
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        public void k0(@NotNull l<? super Throwable, L0> lVar) {
            this.f220746a.k0(lVar);
        }

        @Override // kotlinx.coroutines.InterfaceC5100n
        @InterfaceC5120x0
        public void n0() {
            this.f220746a.n0();
        }

        @Override // kotlin.coroutines.e
        public void resumeWith(@NotNull Object obj) {
            this.f220746a.resumeWith(obj);
        }
    }

    @V({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1#2:306\n*E\n"})
    public final class a<Q> implements k<Q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g
        @NotNull
        public final k<Q> f220753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @g
        @Nullable
        public final Object f220754b;

        public a(@NotNull k<Q> kVar, @Nullable Object obj) {
            this.f220753a = kVar;
            this.f220754b = obj;
        }

        @Override // kotlinx.coroutines.l1
        public void b(@NotNull N<?> n10, int i10) {
            this.f220753a.b(n10, i10);
        }

        @Override // kotlinx.coroutines.selects.j
        public void f(@Nullable Object obj) {
            MutexImpl.f220744i.set(MutexImpl.this, this.f220754b);
            this.f220753a.f(obj);
        }

        @Override // kotlinx.coroutines.selects.j
        public void g(@NotNull InterfaceC5058e0 interfaceC5058e0) {
            this.f220753a.g(interfaceC5058e0);
        }

        @Override // kotlinx.coroutines.selects.j
        @NotNull
        public i getContext() {
            return this.f220753a.getContext();
        }

        @Override // kotlinx.coroutines.selects.j
        public boolean j(@NotNull Object obj, @Nullable Object obj2) {
            boolean zJ = this.f220753a.j(obj, obj2);
            MutexImpl mutexImpl = MutexImpl.this;
            if (zJ) {
                MutexImpl.f220744i.set(mutexImpl, this.f220754b);
            }
            return zJ;
        }
    }

    public MutexImpl(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : MutexKt.f220761a;
        this.f220745h = new q<j<?>, Object, Object, l<? super Throwable, ? extends L0>>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            {
                super(3);
            }

            @Override // ed.q
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final l<Throwable, L0> invoke(@NotNull j<?> jVar, @Nullable final Object obj, @Nullable Object obj2) {
                final MutexImpl mutexImpl = this.f220758d;
                return new l<Throwable, L0>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void e(@NotNull Throwable th) {
                        mutexImpl.i(obj);
                    }

                    @Override // ed.l
                    public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                        e(th);
                        return L0.f217464a;
                    }
                };
            }
        };
    }

    public static /* synthetic */ void M() {
    }

    public static Object Q(MutexImpl mutexImpl, Object obj, e<? super L0> eVar) {
        if (mutexImpl.b(obj)) {
            return L0.f217464a;
        }
        Object objR = mutexImpl.R(obj, eVar);
        return objR == CoroutineSingletons.COROUTINE_SUSPENDED ? objR : L0.f217464a;
    }

    public final /* synthetic */ Object N() {
        return this.owner$volatile;
    }

    public final int P(Object obj) {
        while (c()) {
            Object obj2 = f220744i.get(this);
            if (obj2 != MutexKt.f220761a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public final Object R(Object obj, e<? super L0> eVar) {
        C5102o c5102oB = C5106q.b(IntrinsicsKt__IntrinsicsJvmKt.e(eVar));
        try {
            m(new CancellableContinuationWithOwner(c5102oB, obj));
            Object objZ = c5102oB.z();
            return objZ == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ : L0.f217464a;
        } catch (Throwable th) {
            c5102oB.S();
            throw th;
        }
    }

    @Nullable
    public Object S(@Nullable Object obj, @Nullable Object obj2) {
        if (!G.g(obj2, MutexKt.f220762b)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public void T(@NotNull j<?> jVar, @Nullable Object obj) {
        if (obj != null && d(obj)) {
            jVar.f(MutexKt.f220762b);
        } else {
            G.n(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            C(new a((k) jVar, obj), obj);
        }
    }

    public final /* synthetic */ void U(Object obj) {
        this.owner$volatile = obj;
    }

    public final int V(Object obj) {
        while (!a()) {
            if (obj == null) {
                return 1;
            }
            int iP = P(obj);
            if (iP == 1) {
                return 2;
            }
            if (iP == 2) {
                return 1;
            }
        }
        f220744i.set(this, obj);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean b(@Nullable Object obj) {
        int iV = V(obj);
        if (iV == 0) {
            return true;
        }
        if (iV == 1) {
            return false;
        }
        if (iV != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean c() {
        return f() == 0;
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean d(@NotNull Object obj) {
        return P(obj) == 1;
    }

    @Override // kotlinx.coroutines.sync.a
    @NotNull
    public kotlinx.coroutines.selects.g<Object, kotlinx.coroutines.sync.a> e() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.f220756a;
        G.n(mutexImpl$onLock$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Y.q(mutexImpl$onLock$1, 3);
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.f220757a;
        G.n(mutexImpl$onLock$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        Y.q(mutexImpl$onLock$2, 3);
        return new h(this, mutexImpl$onLock$1, mutexImpl$onLock$2, this.f220745h);
    }

    @Override // kotlinx.coroutines.sync.a
    @Nullable
    public Object h(@Nullable Object obj, @NotNull e<? super L0> eVar) {
        return Q(this, obj, eVar);
    }

    @Override // kotlinx.coroutines.sync.a
    public void i(@Nullable Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220744i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            Q q10 = MutexKt.f220761a;
            if (obj2 != q10) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj2, q10)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @NotNull
    public String toString() {
        return "Mutex@" + O.b(this) + "[isLocked=" + c() + ",owner=" + f220744i.get(this) + ']';
    }
}
