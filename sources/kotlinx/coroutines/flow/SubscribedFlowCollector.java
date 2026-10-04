package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,422:1\n326#2:423\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n413#1:423\n*E\n"})
public final class SubscribedFlowCollector<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f<T> f220055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.p<f<? super T>, kotlin.coroutines.e<? super L0>, Object> f220056b;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(@NotNull f<? super T> fVar, @NotNull ed.p<? super f<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        this.f220055a = fVar;
        this.f220056b = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.f220061e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220061e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f220059c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220061e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.C4885d0.n(r7)
            goto L77
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r2 = r0.f220058b
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.f220057a
            kotlinx.coroutines.flow.SubscribedFlowCollector r4 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r4
            kotlin.C4885d0.n(r7)     // Catch: java.lang.Throwable -> L3e
            goto L5e
        L3e:
            r7 = move-exception
            goto L7d
        L40:
            kotlin.C4885d0.n(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlinx.coroutines.flow.f<T> r7 = r6.f220055a
            kotlin.coroutines.i r5 = r0.getContext()
            r2.<init>(r7, r5)
            ed.p<kotlinx.coroutines.flow.f<? super T>, kotlin.coroutines.e<? super kotlin.L0>, java.lang.Object> r7 = r6.f220056b     // Catch: java.lang.Throwable -> L3e
            r0.f220057a = r6     // Catch: java.lang.Throwable -> L3e
            r0.f220058b = r2     // Catch: java.lang.Throwable -> L3e
            r0.f220061e = r4     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3e
            if (r7 != r1) goto L5d
            goto L76
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.f<T> r7 = r4.f220055a
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector
            if (r2 == 0) goto L7a
            kotlinx.coroutines.flow.SubscribedFlowCollector r7 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r7
            r2 = 0
            r0.f220057a = r2
            r0.f220058b = r2
            r0.f220061e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        L7a:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        L7d:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.a(kotlin.coroutines.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        return this.f220055a.emit(t10, eVar);
    }
}
