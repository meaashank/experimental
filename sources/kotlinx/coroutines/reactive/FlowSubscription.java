package kotlinx.coroutines.reactive;

import ed.l;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.L0;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.AbstractC5049a;
import kotlinx.coroutines.C5102o;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,269:1\n159#2:270\n*S KotlinDebug\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription\n*L\n208#1:270\n*E\n"})
@InterfaceC5120x0
public final class FlowSubscription<T> extends AbstractC5049a<L0> implements Subscription {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f220464f = AtomicLongFieldUpdater.newUpdater(FlowSubscription.class, "requested$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220465g = AtomicReferenceFieldUpdater.newUpdater(FlowSubscription.class, Object.class, "producer$volatile");
    private volatile boolean cancellationRequested;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    @NotNull
    public final kotlinx.coroutines.flow.e<T> f220466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    @NotNull
    public final Subscriber<? super T> f220467e;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    @V({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription$consumeFlow$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,269:1\n318#2,11:270\n*S KotlinDebug\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription$consumeFlow$2\n*L\n237#1:270,11\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlowSubscription<T> f220468a;

        public a(FlowSubscription<T> flowSubscription) {
            this.f220468a = flowSubscription;
        }

        @Override // kotlinx.coroutines.flow.f
        @Nullable
        public final Object emit(T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            this.f220468a.f220467e.onNext(t10);
            if (FlowSubscription.f220464f.decrementAndGet(this.f220468a) > 0) {
                JobKt__JobKt.x(this.f220468a.f218811c);
                return L0.f217464a;
            }
            FlowSubscription<T> flowSubscription = this.f220468a;
            C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
            c5102o.n0();
            FlowSubscription.f220465g.set(flowSubscription, c5102o);
            Object objZ = c5102o.z();
            return objZ == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ : L0.f217464a;
        }
    }

    @V({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 ReactiveFlow.kt\nkotlinx/coroutines/reactive/FlowSubscription\n*L\n1#1,161:1\n200#2,2:162\n*E\n"})
    public static final class b implements kotlin.coroutines.e<L0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f220469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FlowSubscription f220470b;

        public b(i iVar, FlowSubscription flowSubscription) {
            this.f220469a = iVar;
            this.f220470b = flowSubscription;
        }

        @Override // kotlin.coroutines.e
        @NotNull
        public i getContext() {
            return this.f220469a;
        }

        @Override // kotlin.coroutines.e
        public void resumeWith(@NotNull Object obj) {
            FlowSubscription flowSubscription = this.f220470b;
            wd.a.c(new FlowSubscription$createInitialContinuation$1$1(flowSubscription), flowSubscription);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowSubscription(@NotNull kotlinx.coroutines.flow.e<? extends T> eVar, @NotNull Subscriber<? super T> subscriber, @NotNull i iVar) {
        super(iVar, false, true);
        this.f220466d = eVar;
        this.f220467e = subscriber;
        this.producer$volatile = Z1();
    }

    public final Object X1(kotlin.coroutines.e<? super L0> eVar) {
        Object objCollect = this.f220466d.collect(new a(this), eVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }

    public final kotlin.coroutines.e<L0> Z1() {
        return new b(this.f218811c, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a2(kotlin.coroutines.e<? super kotlin.L0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r0 = (kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1) r0
            int r1 = r0.f220474d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220474d = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r0 = new kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f220472b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220474d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f220471a
            kotlinx.coroutines.reactive.FlowSubscription r0 = (kotlinx.coroutines.reactive.FlowSubscription) r0
            kotlin.C4885d0.n(r5)     // Catch: java.lang.Throwable -> L2b
            goto L44
        L2b:
            r5 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C4885d0.n(r5)
            r0.f220471a = r4     // Catch: java.lang.Throwable -> L53
            r0.f220474d = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r5 = r4.X1(r0)     // Catch: java.lang.Throwable -> L53
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            org.reactivestreams.Subscriber<? super T> r5 = r0.f220467e     // Catch: java.lang.Throwable -> L4a
            r5.onComplete()     // Catch: java.lang.Throwable -> L4a
            goto L50
        L4a:
            r5 = move-exception
            kotlin.coroutines.i r0 = r0.f218811c
            kotlinx.coroutines.I.b(r0, r5)
        L50:
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        L53:
            r5 = move-exception
            r0 = r4
        L55:
            boolean r1 = r0.cancellationRequested
            if (r1 == 0) goto L65
            boolean r1 = r0.isActive()
            if (r1 != 0) goto L65
            java.util.concurrent.CancellationException r1 = r0.f1()
            if (r5 == r1) goto L74
        L65:
            org.reactivestreams.Subscriber<? super T> r1 = r0.f220467e     // Catch: java.lang.Throwable -> L6b
            r1.onError(r5)     // Catch: java.lang.Throwable -> L6b
            goto L74
        L6b:
            r1 = move-exception
            kotlin.C4987s.a(r5, r1)
            kotlin.coroutines.i r0 = r0.f218811c
            kotlinx.coroutines.I.b(r0, r5)
        L74:
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.FlowSubscription.a2(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ long b2(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, l<? super Long, Long> lVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
        while (true) {
            long j10 = atomicLongFieldUpdater2.get(obj);
            Object obj2 = obj;
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (atomicLongFieldUpdater3.compareAndSet(obj2, j10, lVar.invoke(Long.valueOf(j10)).longValue())) {
                return j10;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            obj = obj2;
        }
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.A0
    public void cancel() throws Throwable {
        this.cancellationRequested = true;
        a(null);
    }

    public final /* synthetic */ Object d2() {
        return this.producer$volatile;
    }

    public final /* synthetic */ long f2() {
        return this.requested$volatile;
    }

    public final /* synthetic */ void h2(Object obj) {
        this.producer$volatile = obj;
    }

    public final /* synthetic */ void i2(long j10) {
        this.requested$volatile = j10;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        long j11;
        long j12;
        kotlin.coroutines.e eVar;
        if (j10 <= 0) {
            return;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f220464f;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = j11 + j10;
            if (j12 <= 0) {
                j12 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j12));
        if (j11 <= 0) {
            do {
                eVar = (kotlin.coroutines.e) f220465g.getAndSet(this, null);
            } while (eVar == null);
            eVar.resumeWith(L0.f217464a);
        }
    }
}
