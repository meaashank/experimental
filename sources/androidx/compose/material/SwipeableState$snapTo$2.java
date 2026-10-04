package androidx.compose.material;

/* JADX INFO: loaded from: classes.dex */
public final class SwipeableState$snapTo$2<T> implements kotlinx.coroutines.flow.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f97777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<T> f97778b;

    public SwipeableState$snapTo$2(T t10, SwipeableState<T> swipeableState) {
        this.f97777a = t10;
        this.f97778b = swipeableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$snapTo$2$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = (androidx.compose.material.SwipeableState$snapTo$2$emit$1) r0
            int r1 = r0.f97782d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97782d = r1
            goto L18
        L13:
            androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = new androidx.compose.material.SwipeableState$snapTo$2$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f97780b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f97782d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f97779a
            androidx.compose.material.SwipeableState$snapTo$2 r5 = (androidx.compose.material.SwipeableState$snapTo$2) r5
            kotlin.C4885d0.n(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C4885d0.n(r6)
            T r6 = r4.f97777a
            java.lang.Float r5 = androidx.compose.material.SwipeableKt.f(r5, r6)
            if (r5 == 0) goto L5a
            androidx.compose.material.SwipeableState<T> r6 = r4.f97778b
            float r5 = r5.floatValue()
            r0.f97779a = r4
            r0.f97782d = r3
            java.lang.Object r5 = r6.Q(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r5 = r4
        L50:
            androidx.compose.material.SwipeableState<T> r6 = r5.f97778b
            T r5 = r5.f97777a
            r6.K(r5)
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        L5a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The target value must have an associated anchor."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$snapTo$2.emit(java.util.Map, kotlin.coroutines.e):java.lang.Object");
    }
}
