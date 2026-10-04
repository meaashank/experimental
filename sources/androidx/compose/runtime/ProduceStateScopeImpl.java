package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,223:1\n314#2,11:224\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n50#1:224,11\n*E\n"})
public final class ProduceStateScopeImpl<T> implements Z0<T>, L0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.i f99191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L0<T> f99192b;

    public ProduceStateScopeImpl(@NotNull L0<T> l02, @NotNull kotlin.coroutines.i iVar) {
        this.f99191a = iVar;
        this.f99192b = l02;
    }

    @Override // androidx.compose.runtime.L0
    public T component1() {
        return this.f99192b.component1();
    }

    @Override // androidx.compose.runtime.L0
    @NotNull
    public ed.l<T, kotlin.L0> component2() {
        return this.f99192b.component2();
    }

    @Override // androidx.compose.runtime.L0, androidx.compose.runtime.X1
    public T getValue() {
        return this.f99192b.getValue();
    }

    @Override // kotlinx.coroutines.L
    @NotNull
    public kotlin.coroutines.i m() {
        return this.f99191a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.Z0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object r0(@org.jetbrains.annotations.NotNull ed.InterfaceC4376a<kotlin.L0> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) r0
            int r1 = r0.f99196d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99196d = r1
            goto L18
        L13:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f99194b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f99196d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            java.lang.Object r5 = r0.f99193a
            ed.a r5 = (ed.InterfaceC4376a) r5
            kotlin.C4885d0.n(r6)     // Catch: java.lang.Throwable -> L33
            goto L4f
        L33:
            r6 = move-exception
            goto L55
        L35:
            kotlin.C4885d0.n(r6)
            r0.f99193a = r5     // Catch: java.lang.Throwable -> L33
            r0.f99196d = r3     // Catch: java.lang.Throwable -> L33
            kotlinx.coroutines.o r6 = new kotlinx.coroutines.o     // Catch: java.lang.Throwable -> L33
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)     // Catch: java.lang.Throwable -> L33
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L33
            r6.n0()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r6.z()     // Catch: java.lang.Throwable -> L33
            if (r6 != r1) goto L4f
            return r1
        L4f:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L33
            r6.<init>()     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L55:
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl.r0(ed.a, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.runtime.L0
    public void setValue(T t10) {
        this.f99192b.setValue(t10);
    }
}
