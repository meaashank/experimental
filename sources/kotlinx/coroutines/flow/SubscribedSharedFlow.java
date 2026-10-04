package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.L0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class SubscribedSharedFlow<T> implements n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n<T> f220062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.p<f<? super T>, kotlin.coroutines.e<? super L0>, Object> f220063b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1, reason: invalid class name */
    @Vc.d(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {405}, m = "collect", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f220064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SubscribedSharedFlow<T> f220065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f220066c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubscribedSharedFlow<T> subscribedSharedFlow, kotlin.coroutines.e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.f220065b = subscribedSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f220064a = obj;
            this.f220066c |= Integer.MIN_VALUE;
            return this.f220065b.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedSharedFlow(@NotNull n<? extends T> nVar, @NotNull ed.p<? super f<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        this.f220062a = nVar;
        this.f220063b = pVar;
    }

    @Override // kotlinx.coroutines.flow.n
    @NotNull
    public List<T> a() {
        return this.f220062a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.f<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedSharedFlow.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = (kotlinx.coroutines.flow.SubscribedSharedFlow.AnonymousClass1) r0
            int r1 = r0.f220066c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220066c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = new kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f220064a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220066c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            kotlin.C4885d0.n(r7)
            goto L44
        L2f:
            kotlin.C4885d0.n(r7)
            kotlinx.coroutines.flow.n<T> r7 = r5.f220062a
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = new kotlinx.coroutines.flow.SubscribedFlowCollector
            ed.p<kotlinx.coroutines.flow.f<? super T>, kotlin.coroutines.e<? super kotlin.L0>, java.lang.Object> r4 = r5.f220063b
            r2.<init>(r6, r4)
            r0.f220066c = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedSharedFlow.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.e):java.lang.Object");
    }
}
