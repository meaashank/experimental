package kotlinx.coroutines.reactive;

import androidx.collection.Q;
import ed.l;
import ed.p;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C4987s;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.coroutines.i;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.Y;
import kotlinx.coroutines.AbstractC5049a;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.channels.j;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.selects.h;
import kotlinx.coroutines.selects.j;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nPublish.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Publish.kt\nkotlinx/coroutines/reactive/PublisherCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
@InterfaceC5120x0
public final class PublisherCoroutine<T> extends AbstractC5049a<L0> implements q<T>, Subscription {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f220492g = AtomicLongFieldUpdater.newUpdater(PublisherCoroutine.class, "_nRequested$volatile");
    private volatile /* synthetic */ long _nRequested$volatile;
    private volatile boolean cancelled;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Subscriber<T> f220493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final p<Throwable, i, L0> f220494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.sync.a f220495f;

    /* JADX WARN: Multi-variable type inference failed */
    public PublisherCoroutine(@NotNull i iVar, @NotNull Subscriber<T> subscriber, @NotNull p<? super Throwable, ? super i, L0> pVar) {
        super(iVar, false, true);
        this.f220493d = subscriber;
        this.f220494e = pVar;
        this.f220495f = new MutexImpl(true);
    }

    public static final Object T1(PublisherCoroutine publisherCoroutine, Object obj, Object obj2) {
        Throwable thW1 = publisherCoroutine.W1(obj);
        if (thW1 == null) {
            return publisherCoroutine;
        }
        throw thW1;
    }

    public static /* synthetic */ void Z1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(j<?> jVar, Object obj) {
        if (a.C0832a.c(this.f220495f, null, 1, null)) {
            jVar.f(L0.f217464a);
        } else {
            C5092j.f(this, null, null, new PublisherCoroutine$registerSelectForSend$1(this, jVar, null), 3, null);
        }
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
    public /* bridge */ /* synthetic */ void H(l lVar) {
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
    public java.lang.Object I(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.reactive.PublisherCoroutine$send$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.reactive.PublisherCoroutine$send$1 r0 = (kotlinx.coroutines.reactive.PublisherCoroutine$send$1) r0
            int r1 = r0.f220505e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220505e = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.PublisherCoroutine$send$1 r0 = new kotlinx.coroutines.reactive.PublisherCoroutine$send$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f220503c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220505e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f220502b
            java.lang.Object r0 = r0.f220501a
            kotlinx.coroutines.reactive.PublisherCoroutine r0 = (kotlinx.coroutines.reactive.PublisherCoroutine) r0
            kotlin.C4885d0.n(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C4885d0.n(r6)
            kotlinx.coroutines.sync.a r6 = r4.f220495f
            r0.f220501a = r4
            r0.f220502b = r5
            r0.f220505e = r3
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherCoroutine.I(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    public void P1(@NotNull Throwable th, boolean z10) {
        i2(th, z10);
    }

    public final Throwable W1(T t10) throws Throwable {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        long j11;
        if (t10 == null) {
            j2();
            throw new NullPointerException("Attempted to emit `null` inside a reactive publisher");
        }
        if (!isActive()) {
            j2();
            return f1();
        }
        try {
            this.f220493d.onNext(t10);
            do {
                atomicLongFieldUpdater = f220492g;
                j10 = atomicLongFieldUpdater.get(this);
                if (j10 < 0 || j10 == Long.MAX_VALUE) {
                    break;
                }
                j11 = j10 - 1;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
            if (j11 == 0) {
                return null;
            }
            j2();
            return null;
        } catch (Throwable th) {
            this.cancelled = true;
            boolean zY = Y(th);
            j2();
            if (zY) {
                return th;
            }
            this.f220494e.invoke(th, this.f218811c);
            return f1();
        }
    }

    public final void X1(Throwable th, boolean z10) {
        try {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f220492g;
            if (atomicLongFieldUpdater.get(this) != -2) {
                atomicLongFieldUpdater.set(this, -2L);
                if (this.cancelled) {
                    if (th != null && !z10) {
                        this.f220494e.invoke(th, this.f218811c);
                    }
                } else if (th == null) {
                    try {
                        this.f220493d.onComplete();
                    } catch (Throwable th2) {
                        I.b(this.f218811c, th2);
                    }
                } else {
                    try {
                        this.f220493d.onError(th);
                    } catch (Throwable th3) {
                        if (th3 != th) {
                            C4987s.a(th, th3);
                        }
                        I.b(this.f218811c, th);
                    }
                }
            }
        } finally {
            a.C0832a.d(this.f220495f, null, 1, null);
        }
    }

    public final /* synthetic */ long a2() {
        return this._nRequested$volatile;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.A0
    public void cancel() throws Throwable {
        this.cancelled = true;
        a(null);
    }

    @Override // kotlinx.coroutines.channels.q
    @NotNull
    public s<T> d() {
        return this;
    }

    @NotNull
    public Void d2(@NotNull l<? super Throwable, L0> lVar) {
        throw new UnsupportedOperationException("PublisherCoroutine doesn't support invokeOnClose");
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public void Q1(@NotNull L0 l02) {
        i2(null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object f2(Object obj, Object obj2) throws Throwable {
        Throwable thW1 = W1(obj);
        if (thW1 == null) {
            return this;
        }
        throw thW1;
    }

    @Override // kotlinx.coroutines.channels.s
    @NotNull
    public kotlinx.coroutines.selects.g<T, s<T>> h() {
        PublisherCoroutine$onSend$1 publisherCoroutine$onSend$1 = PublisherCoroutine$onSend$1.f220496a;
        G.n(publisherCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Y.q(publisherCoroutine$onSend$1, 3);
        PublisherCoroutine$onSend$2 publisherCoroutine$onSend$2 = PublisherCoroutine$onSend$2.f220497a;
        G.n(publisherCoroutine$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        Y.q(publisherCoroutine$onSend$2, 3);
        return new h(this, publisherCoroutine$onSend$1, publisherCoroutine$onSend$2, null, 8, null);
    }

    public final /* synthetic */ void h2(long j10) {
        this._nRequested$volatile = j10;
    }

    public final void i2(Throwable th, boolean z10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f220492g;
            j10 = atomicLongFieldUpdater.get(this);
            if (j10 == -2) {
                return;
            }
            if (j10 < 0) {
                throw new IllegalStateException("Check failed.");
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, -1L));
        if (j10 == 0) {
            X1(th, z10);
        } else if (a.C0832a.c(this.f220495f, null, 1, null)) {
            X1(th, z10);
        }
    }

    public final void j2() {
        a.C0832a.d(this.f220495f, null, 1, null);
        if (U() && a.C0832a.c(this.f220495f, null, 1, null)) {
            X1(v0(), w0());
        }
    }

    @Override // kotlinx.coroutines.channels.s
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC4852c0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(T t10) {
        return s.a.c(this, t10);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) throws Throwable {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        long j12;
        if (j10 <= 0) {
            Y(new IllegalArgumentException(Q.a("non-positive subscription request ", j10)));
            return;
        }
        do {
            atomicLongFieldUpdater = f220492g;
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 < 0) {
                return;
            }
            j12 = j11 + j10;
            if (j12 < 0 || j10 == Long.MAX_VALUE) {
                j12 = Long.MAX_VALUE;
            }
            if (j11 == j12) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j12));
        if (j11 == 0) {
            j2();
        }
    }

    @Override // kotlinx.coroutines.channels.s
    @NotNull
    public Object t(T t10) throws Throwable {
        if (!a.C0832a.c(this.f220495f, null, 1, null)) {
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
