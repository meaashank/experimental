package kotlinx.coroutines.stream;

import Vc.d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class StreamFlow<T> implements e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220736b = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Stream<T> f220737a;
    private volatile /* synthetic */ int consumed$volatile = 0;

    /* JADX INFO: renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1, reason: invalid class name */
    @d(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {22}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f220738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f220739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f220740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f220741d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ StreamFlow<T> f220742e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f220743f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StreamFlow<T> streamFlow, kotlin.coroutines.e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.f220742e = streamFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f220741d = obj;
            this.f220743f |= Integer.MIN_VALUE;
            return this.f220742e.collect(null, this);
        }
    }

    public StreamFlow(@NotNull Stream<T> stream) {
        this.f220737a = stream;
    }

    private final /* synthetic */ int c() {
        return this.consumed$volatile;
    }

    private final /* synthetic */ void e(int i10) {
        this.consumed$volatile = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.f<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.stream.StreamFlow.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = (kotlinx.coroutines.stream.StreamFlow.AnonymousClass1) r0
            int r1 = r0.f220743f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220743f = r1
            goto L18
        L13:
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = new kotlinx.coroutines.stream.StreamFlow$collect$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f220741d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220743f
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f220740c
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.f220739b
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.f) r2
            java.lang.Object r4 = r0.f220738a
            kotlinx.coroutines.stream.StreamFlow r4 = (kotlinx.coroutines.stream.StreamFlow) r4
            kotlin.C4885d0.n(r7)     // Catch: java.lang.Throwable -> L34
            r7 = r2
            goto L54
        L34:
            r6 = move-exception
            goto L77
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.C4885d0.n(r7)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = kotlinx.coroutines.stream.StreamFlow.f220736b
            r2 = 0
            boolean r7 = r7.compareAndSet(r5, r2, r3)
            if (r7 == 0) goto L7d
            java.util.stream.Stream<T> r7 = r5.f220737a     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r7 = io.reactivex.rxjava3.internal.jdk8.C4693k.a(r7)     // Catch: java.lang.Throwable -> L75
            r4 = r7
            r7 = r6
            r6 = r4
            r4 = r5
        L54:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L34
            r0.f220738a = r4     // Catch: java.lang.Throwable -> L34
            r0.f220739b = r7     // Catch: java.lang.Throwable -> L34
            r0.f220740c = r6     // Catch: java.lang.Throwable -> L34
            r0.f220743f = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r7.emit(r2, r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L54
            return r1
        L6d:
            java.util.stream.Stream<T> r6 = r4.f220737a
            io.reactivex.rxjava3.internal.jdk8.x.a(r6)
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        L75:
            r6 = move-exception
            r4 = r5
        L77:
            java.util.stream.Stream<T> r7 = r4.f220737a
            io.reactivex.rxjava3.internal.jdk8.x.a(r7)
            throw r6
        L7d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Stream.consumeAsFlow can be collected only once"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.StreamFlow.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.e):java.lang.Object");
    }
}
