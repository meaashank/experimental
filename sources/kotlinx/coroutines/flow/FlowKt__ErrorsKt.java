package kotlinx.coroutines.flow;

import androidx.collection.Q;
import kotlin.L0;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.A0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n105#2:221\n105#2:223\n1#3:222\n159#4:224\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n54#1:221\n128#1:223\n217#1:224\n*E\n"})
public final /* synthetic */ class FlowKt__ErrorsKt {
    @NotNull
    public static final <T> e<T> a(@NotNull e<? extends T> eVar, @NotNull ed.q<? super f<? super T>, ? super Throwable, ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(eVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.e<? extends T> r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.f<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.f219555c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219555c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f219554b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219555c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f219553a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.C4885d0.n(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L2b:
            r5 = move-exception
            goto L51
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C4885d0.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4f
            r0.f219553a = r6     // Catch: java.lang.Throwable -> L4f
            r0.f219555c = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = 0
            return r4
        L4f:
            r5 = move-exception
            r4 = r6
        L51:
            T r4 = r4.f217904a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L74
            kotlin.coroutines.i r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L74
            if (r4 != 0) goto L68
            return r5
        L68:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L70
            kotlin.C4987s.a(r4, r5)
            throw r4
        L70:
            kotlin.C4987s.a(r5, r4)
            throw r5
        L74:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.b(kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.f, kotlin.coroutines.e):java.lang.Object");
    }

    public static final boolean c(Throwable th, kotlin.coroutines.i iVar) {
        A0 a02 = (A0) iVar.get(A0.f218690A3);
        if (a02 == null || !a02.isCancelled()) {
            return false;
        }
        return d(th, a02.f1());
    }

    public static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && th2.equals(th);
    }

    @NotNull
    public static final <T> e<T> e(@NotNull e<? extends T> eVar, long j10, @NotNull ed.p<? super Throwable, ? super kotlin.coroutines.e<? super Boolean>, ? extends Object> pVar) {
        if (j10 > 0) {
            return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(eVar, new FlowKt__ErrorsKt$retry$3(j10, pVar, null));
        }
        throw new IllegalArgumentException(Q.a("Expected positive amount of retries, but had ", j10).toString());
    }

    public static e f(e eVar, long j10, ed.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            pVar = new FlowKt__ErrorsKt$retry$1(2, null);
        }
        return e(eVar, j10, pVar);
    }

    @NotNull
    public static final <T> e<T> g(@NotNull e<? extends T> eVar, @NotNull ed.r<? super f<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.e<? super Boolean>, ? extends Object> rVar) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(eVar, rVar);
    }
}
