package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C4987s;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.Y;
import kotlinx.coroutines.AbstractC5049a;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.channels.j;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.coroutines.sync.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zc.P;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nRxObservable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxObservable.kt\nkotlinx/coroutines/rx3/RxObservableCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,207:1\n1#2:208\n159#3:209\n*S KotlinDebug\n*F\n+ 1 RxObservable.kt\nkotlinx/coroutines/rx3/RxObservableCoroutine\n*L\n165#1:209\n*E\n"})
public final class RxObservableCoroutine<T> extends AbstractC5049a<L0> implements kotlinx.coroutines.channels.q<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220593f = AtomicIntegerFieldUpdater.newUpdater(RxObservableCoroutine.class, "_signal$volatile");
    private volatile /* synthetic */ int _signal$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final P<T> f220594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.sync.a f220595e;

    public RxObservableCoroutine(@NotNull kotlin.coroutines.i iVar, @NotNull P<T> p10) {
        super(iVar, false, true);
        this.f220594d = p10;
        this.f220595e = MutexKt.b(false, 1, null);
    }

    public static final /* synthetic */ Object T1(RxObservableCoroutine rxObservableCoroutine, Object obj, Object obj2) throws Throwable {
        rxObservableCoroutine.f2(obj, obj2);
        return rxObservableCoroutine;
    }

    private final Throwable W1(T t10) throws Throwable {
        if (!isActive()) {
            X1(v0(), w0());
            return f1();
        }
        try {
            this.f220594d.onNext(t10);
            j2();
            return null;
        } catch (Throwable th) {
            UndeliverableException undeliverableException = new UndeliverableException(th);
            boolean zY = Y(undeliverableException);
            j2();
            if (zY) {
                return undeliverableException;
            }
            b.a(undeliverableException, this.f218811c);
            return f1();
        }
    }

    private final void X1(Throwable th, boolean z10) {
        try {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220593f;
            if (atomicIntegerFieldUpdater.get(this) != -2) {
                atomicIntegerFieldUpdater.set(this, -2);
                Throwable th2 = th != null ? th : null;
                if (th2 == null) {
                    try {
                        this.f220594d.onComplete();
                    } catch (Exception e10) {
                        b.a(e10, this.f218811c);
                    }
                } else if ((th2 instanceof UndeliverableException) && !z10) {
                    b.a(th, this.f218811c);
                } else if (th2 != f1() || !this.f220594d.isDisposed()) {
                    try {
                        this.f220594d.onError(th);
                    } catch (Exception e11) {
                        C4987s.a(th, e11);
                        b.a(th, this.f218811c);
                    }
                }
            }
        } finally {
            a.C0832a.d(this.f220595e, null, 1, null);
        }
    }

    public static /* synthetic */ void Z1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object f2(Object obj, Object obj2) throws Throwable {
        G.n(obj, "null cannot be cast to non-null type T of kotlinx.coroutines.rx3.RxObservableCoroutine");
        Throwable thW1 = W1(obj);
        if (thW1 == null) {
            return this;
        }
        throw thW1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(kotlinx.coroutines.selects.j<?> jVar, Object obj) {
        if (a.C0832a.c(this.f220595e, null, 1, null)) {
            jVar.f(L0.f217464a);
        } else {
            C5092j.f(this, null, null, new RxObservableCoroutine$registerSelectForSend$1(this, jVar, null), 3, null);
        }
    }

    private final void i2(Throwable th, boolean z10) {
        if (f220593f.compareAndSet(this, 0, -1) && a.C0832a.c(this.f220595e, null, 1, null)) {
            X1(th, z10);
        }
    }

    private final void j2() {
        a.C0832a.d(this.f220595e, null, 1, null);
        if (isActive() || !a.C0832a.c(this.f220595e, null, 1, null)) {
            return;
        }
        X1(v0(), w0());
    }

    @Override // kotlinx.coroutines.channels.s
    public boolean C() {
        return !isActive();
    }

    @Override // kotlinx.coroutines.channels.s
    public boolean G(@Nullable Throwable th) {
        return Y(th);
    }

    @Override // kotlinx.coroutines.channels.s
    public /* bridge */ /* synthetic */ void H(ed.l lVar) {
        d2(lVar);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.s
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object I(@org.jetbrains.annotations.NotNull T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.rx3.RxObservableCoroutine$send$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.rx3.RxObservableCoroutine$send$1 r0 = (kotlinx.coroutines.rx3.RxObservableCoroutine$send$1) r0
            int r1 = r0.f220605e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220605e = r1
            goto L18
        L13:
            kotlinx.coroutines.rx3.RxObservableCoroutine$send$1 r0 = new kotlinx.coroutines.rx3.RxObservableCoroutine$send$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f220603c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220605e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f220602b
            java.lang.Object r0 = r0.f220601a
            kotlinx.coroutines.rx3.RxObservableCoroutine r0 = (kotlinx.coroutines.rx3.RxObservableCoroutine) r0
            kotlin.C4885d0.n(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C4885d0.n(r6)
            kotlinx.coroutines.sync.a r6 = r4.f220595e
            r0.f220601a = r4
            r0.f220602b = r5
            r0.f220605e = r3
            r2 = 0
            java.lang.Object r6 = kotlinx.coroutines.sync.a.C0832a.b(r6, r2, r0, r3, r2)
            if (r6 != r1) goto L48
            return r1
        L48:
            r0 = r4
        L49:
            java.lang.Throwable r5 = r0.W1(r5)
            if (r5 != 0) goto L52
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        L52:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.RxObservableCoroutine.I(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    public void P1(@NotNull Throwable th, boolean z10) {
        i2(th, z10);
    }

    public final /* synthetic */ int a2() {
        return this._signal$volatile;
    }

    @Override // kotlinx.coroutines.channels.q
    @NotNull
    public kotlinx.coroutines.channels.s<T> d() {
        return this;
    }

    @NotNull
    public Void d2(@NotNull ed.l<? super Throwable, L0> lVar) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public void Q1(@NotNull L0 l02) {
        i2(null, false);
    }

    @Override // kotlinx.coroutines.channels.s
    @NotNull
    public kotlinx.coroutines.selects.g<T, kotlinx.coroutines.channels.s<T>> h() {
        RxObservableCoroutine$onSend$1 rxObservableCoroutine$onSend$1 = RxObservableCoroutine$onSend$1.f220596a;
        G.n(rxObservableCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Y.q(rxObservableCoroutine$onSend$1, 3);
        RxObservableCoroutine$onSend$2 rxObservableCoroutine$onSend$2 = RxObservableCoroutine$onSend$2.f220597a;
        G.n(rxObservableCoroutine$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        Y.q(rxObservableCoroutine$onSend$2, 3);
        return new kotlinx.coroutines.selects.h(this, rxObservableCoroutine$onSend$1, rxObservableCoroutine$onSend$2, null, 8, null);
    }

    public final /* synthetic */ void h2(int i10) {
        this._signal$volatile = i10;
    }

    @Override // kotlinx.coroutines.channels.s
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC4852c0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(@NotNull T t10) {
        return s.a.c(this, t10);
    }

    @Override // kotlinx.coroutines.channels.s
    @NotNull
    public Object t(@NotNull T t10) throws Throwable {
        if (!a.C0832a.c(this.f220595e, null, 1, null)) {
            kotlinx.coroutines.channels.j.f219194b.getClass();
            return kotlinx.coroutines.channels.j.f219195c;
        }
        Throwable thW1 = W1(t10);
        if (thW1 != null) {
            kotlinx.coroutines.channels.j.f219194b.getClass();
            return new j.a(thW1);
        }
        j.b bVar = kotlinx.coroutines.channels.j.f219194b;
        L0 l02 = L0.f217464a;
        bVar.getClass();
        return l02;
    }
}
