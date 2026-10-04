package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__LimitKt$take$2$1<T> implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f219613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f219614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f<T> f219615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f219616d;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1(Ref.IntRef intRef, int i10, f<? super T> fVar, Object obj) {
        this.f219613a = intRef;
        this.f219614b = i10;
        this.f219615c = fVar;
        this.f219616d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r7.emit(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt__LimitKt.f(r7, r6, r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.f219619c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219619c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f219617a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219619c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.C4885d0.n(r7)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.C4885d0.n(r7)
            goto L4f
        L36:
            kotlin.C4885d0.n(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f219613a
            int r2 = r7.f217902a
            int r2 = r2 + r4
            r7.f217902a = r2
            int r7 = r5.f219614b
            if (r2 >= r7) goto L52
            kotlinx.coroutines.flow.f<T> r7 = r5.f219615c
            r0.f219619c = r4
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L4f
            goto L5e
        L4f:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        L52:
            kotlinx.coroutines.flow.f<T> r7 = r5.f219615c
            java.lang.Object r2 = r5.f219616d
            r0.f219619c = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt__LimitKt.f(r7, r6, r2, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }
}
