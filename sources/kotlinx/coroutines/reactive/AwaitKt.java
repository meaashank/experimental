package kotlinx.coroutines.reactive;

import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5102o;
import kotlinx.coroutines.I;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/reactive/AwaitKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,325:1\n318#2,11:326\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/reactive/AwaitKt\n*L\n182#1:326,11\n*E\n"})
public final class AwaitKt {
    @Nullable
    public static final <T> Object d(@NotNull Publisher<T> publisher, @NotNull kotlin.coroutines.e<? super T> eVar) {
        return j(publisher, Mode.FIRST, null, eVar, 2, null);
    }

    @Nullable
    public static final <T> Object e(@NotNull Publisher<T> publisher, T t10, @NotNull kotlin.coroutines.e<? super T> eVar) {
        return i(publisher, Mode.FIRST_OR_DEFAULT, t10, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object f(@org.jetbrains.annotations.NotNull org.reactivestreams.Publisher<T> r7, @org.jetbrains.annotations.NotNull ed.InterfaceC4376a<? extends T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1 r0 = (kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1) r0
            int r1 = r0.f220435c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f220435c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1 r0 = new kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f220434b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.f220435c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.f220433a
            r8 = r7
            ed.a r8 = (ed.InterfaceC4376a) r8
            kotlin.C4885d0.n(r9)
            goto L4b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.C4885d0.n(r9)
            r9 = r2
            kotlinx.coroutines.reactive.Mode r2 = kotlinx.coroutines.reactive.Mode.FIRST_OR_DEFAULT
            r4.f220433a = r8
            r4.f220435c = r9
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            java.lang.Object r9 = j(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4b
            return r0
        L4b:
            if (r9 != 0) goto L52
            java.lang.Object r7 = r8.invoke()
            return r7
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.AwaitKt.f(org.reactivestreams.Publisher, ed.a, kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public static final <T> Object g(@NotNull Publisher<T> publisher, @NotNull kotlin.coroutines.e<? super T> eVar) {
        return j(publisher, Mode.FIRST_OR_DEFAULT, null, eVar, 2, null);
    }

    @Nullable
    public static final <T> Object h(@NotNull Publisher<T> publisher, @NotNull kotlin.coroutines.e<? super T> eVar) {
        return j(publisher, Mode.LAST, null, eVar, 2, null);
    }

    public static final <T> Object i(Publisher<T> publisher, Mode mode, T t10, kotlin.coroutines.e<? super T> eVar) {
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        f.e(publisher, c5102o.f220423e).subscribe(new AwaitKt$awaitOne$2$1(c5102o, mode, t10));
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }

    public static /* synthetic */ Object j(Publisher publisher, Mode mode, Object obj, kotlin.coroutines.e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return i(publisher, mode, obj, eVar);
    }

    @Nullable
    public static final <T> Object k(@NotNull Publisher<T> publisher, @NotNull kotlin.coroutines.e<? super T> eVar) {
        return j(publisher, Mode.SINGLE, null, eVar, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @kotlin.InterfaceC4982o(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated without a replacement due to its name incorrectly conveying the behavior. Please consider using awaitFirstOrElse().")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(org.reactivestreams.Publisher r7, ed.InterfaceC4376a r8, kotlin.coroutines.e r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.reactive.AwaitKt$awaitSingleOrElse$1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.reactive.AwaitKt$awaitSingleOrElse$1 r0 = (kotlinx.coroutines.reactive.AwaitKt$awaitSingleOrElse$1) r0
            int r1 = r0.f220454c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f220454c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            kotlinx.coroutines.reactive.AwaitKt$awaitSingleOrElse$1 r0 = new kotlinx.coroutines.reactive.AwaitKt$awaitSingleOrElse$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f220453b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.f220454c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.f220452a
            r8 = r7
            ed.a r8 = (ed.InterfaceC4376a) r8
            kotlin.C4885d0.n(r9)
            goto L4b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.C4885d0.n(r9)
            r9 = r2
            kotlinx.coroutines.reactive.Mode r2 = kotlinx.coroutines.reactive.Mode.SINGLE_OR_DEFAULT
            r4.f220452a = r8
            r4.f220454c = r9
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            java.lang.Object r9 = j(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4b
            return r0
        L4b:
            if (r9 != 0) goto L52
            java.lang.Object r7 = r8.invoke()
            return r7
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.AwaitKt.m(org.reactivestreams.Publisher, ed.a, kotlin.coroutines.e):java.lang.Object");
    }

    public static final void o(i iVar, String str) {
        I.b(iVar, new IllegalStateException(android.support.v4.media.i.a("'", str, "' was called after the publisher already signalled being in a terminal state")));
    }

    public static final void p(i iVar, Mode mode) {
        I.b(iVar, new IllegalStateException("Only a single value was requested in '" + mode + "', but the publisher provided more"));
    }
}
