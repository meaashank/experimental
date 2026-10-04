package kotlinx.coroutines.reactive;

import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.channels.j;
import kotlinx.coroutines.channels.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/ReactiveSubscriber\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,269:1\n1#2:270\n509#3,5:271\n*S KotlinDebug\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/ReactiveSubscriber\n*L\n127#1:271,5\n*E\n"})
public final class ReactiveSubscriber<T> implements Subscriber<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f220506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f220507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.channels.g<T> f220508c;

    public ReactiveSubscriber(int i10, @NotNull BufferOverflow bufferOverflow, long j10) {
        this.f220506a = j10;
        this.f220508c = i.d(i10 == 0 ? 1 : i10, bufferOverflow, null, 4, null);
    }

    public final void a() {
        Subscription subscription = this.f220507b;
        if (subscription != null) {
            subscription.cancel();
        } else {
            G.S("subscription");
            throw null;
        }
    }

    public final void b() {
        Subscription subscription = this.f220507b;
        if (subscription != null) {
            subscription.request(this.f220506a);
        } else {
            G.S("subscription");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r0 = (kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1) r0
            int r1 = r0.f220511c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220511c = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r0 = new kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f220509a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220511c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C4885d0.n(r5)
            kotlinx.coroutines.channels.j r5 = (kotlinx.coroutines.channels.j) r5
            java.lang.Object r5 = r5.f219196a
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C4885d0.n(r5)
            kotlinx.coroutines.channels.g<T> r5 = r4.f220508c
            r0.f220511c = r3
            java.lang.Object r5 = r5.B(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.Throwable r0 = kotlinx.coroutines.channels.j.f(r5)
            if (r0 != 0) goto L4d
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.j.c
            if (r0 == 0) goto L4c
            r5 = 0
        L4c:
            return r5
        L4d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ReactiveSubscriber.c(kotlin.coroutines.e):java.lang.Object");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        s.a.a(this.f220508c, null, 1, null);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@Nullable Throwable th) {
        this.f220508c.G(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@NotNull T t10) {
        if (this.f220508c.t(t10) instanceof j.c) {
            throw new IllegalArgumentException(("Element " + t10 + " was not added to channel because it was full, " + this.f220508c).toString());
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(@NotNull Subscription subscription) {
        this.f220507b = subscription;
        b();
    }
}
