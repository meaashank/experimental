package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__TransformKt$runningFold$1$1<T> implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<R> f219866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.q<R, T, kotlin.coroutines.e<? super R>, Object> f219867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f<R> f219868c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningFold$1$1(Ref.ObjectRef<R> objectRef, ed.q<? super R, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends Object> qVar, f<? super R> fVar) {
        this.f219866a = objectRef;
        this.f219867b = qVar;
        this.f219868c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r7.emit((R) r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.f
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) r0
            int r1 = r0.f219873e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219873e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f219871c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219873e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.C4885d0.n(r8)
            goto L6e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f219870b
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r2 = r0.f219869a
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) r2
            kotlin.C4885d0.n(r8)
            goto L58
        L3e:
            kotlin.C4885d0.n(r8)
            kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r6.f219866a
            ed.q<R, T, kotlin.coroutines.e<? super R>, java.lang.Object> r2 = r6.f219867b
            T r5 = r8.f217904a
            r0.f219869a = r6
            r0.f219870b = r8
            r0.f219873e = r4
            java.lang.Object r7 = r2.invoke(r5, r7, r0)
            if (r7 != r1) goto L54
            goto L6d
        L54:
            r2 = r8
            r8 = r7
            r7 = r2
            r2 = r6
        L58:
            r7.f217904a = r8
            kotlinx.coroutines.flow.f<R> r7 = r2.f219868c
            kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r2.f219866a
            T r8 = r8.f217904a
            r2 = 0
            r0.f219869a = r2
            r0.f219870b = r2
            r0.f219873e = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1.emit(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }
}
