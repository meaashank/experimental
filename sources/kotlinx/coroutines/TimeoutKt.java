package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class TimeoutKt {
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.coroutines.TimeoutCancellationException a(long r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.U r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.A0 r5) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.V
            if (r0 == 0) goto L7
            kotlinx.coroutines.V r4 = (kotlinx.coroutines.V) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            kotlin.time.h$a r0 = kotlin.time.C5041h.f218418b
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = kotlin.time.j.P(r2, r0)
            java.lang.String r4 = r4.m(r0)
            if (r4 != 0) goto L20
        L18:
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r0 = " ms"
            java.lang.String r4 = androidx.compose.ui.input.pointer.C2151s.a(r4, r2, r0)
        L20:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.a(long, kotlinx.coroutines.U, kotlinx.coroutines.A0):kotlinx.coroutines.TimeoutCancellationException");
    }

    public static final <U, T extends U> Object b(h1<U, ? super T> h1Var, ed.p<? super L, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar) {
        JobKt__JobKt.w(h1Var, DelayKt.d(h1Var.f220299d.getContext()).h1(h1Var.f220264e, h1Var, h1Var.f218811c));
        return wd.b.e(h1Var, h1Var, pVar);
    }

    @Nullable
    public static final <T> Object c(long j10, @NotNull ed.p<? super L, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super T> eVar) {
        if (j10 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objB = b(new h1(j10, eVar), pVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objB;
    }

    @Nullable
    public static final <T> Object d(long j10, @NotNull ed.p<? super L, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super T> eVar) {
        return c(DelayKt.e(j10), pVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.h1] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object e(long r7, @org.jetbrains.annotations.NotNull ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.f218803e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218803e = r1
            goto L18
        L13:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f218802d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f218803e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.f218801c
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r0.f218800b
            ed.p r8 = (ed.p) r8
            kotlin.C4885d0.n(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L30
            return r10
        L30:
            r8 = move-exception
            goto L62
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.C4885d0.n(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L44
            return r3
        L44:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.f218800b = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L60
            r0.f218801c = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L60
            r0.f218799a = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L60
            r0.f218803e = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L60
            kotlinx.coroutines.h1 r2 = new kotlinx.coroutines.h1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L60
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L60
            r10.f217904a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L60
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L60
            if (r7 != r1) goto L5f
            return r1
        L5f:
            return r7
        L60:
            r8 = move-exception
            r7 = r10
        L62:
            kotlinx.coroutines.A0 r9 = r8.f218798a
            T r7 = r7.f217904a
            if (r9 != r7) goto L69
            return r3
        L69:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.e(long, ed.p, kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public static final <T> Object f(long j10, @NotNull ed.p<? super L, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super T> eVar) {
        return e(DelayKt.e(j10), pVar, eVar);
    }
}
