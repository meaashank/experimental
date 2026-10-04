package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.time.C5041h;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n318#2,11:160\n318#2,11:171\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n103#1:160,11\n123#1:171,11\n*E\n"})
public final class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.f218714b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218714b = r1
            goto L18
        L13:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f218713a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f218714b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            kotlin.C4885d0.n(r4)
            goto L47
        L2f:
            kotlin.C4885d0.n(r4)
            r0.f218714b = r3
            kotlinx.coroutines.o r4 = new kotlinx.coroutines.o
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)
            r4.<init>(r0, r3)
            r4.n0()
            java.lang.Object r4 = r4.z()
            if (r4 != r1) goto L47
            return r1
        L47:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.a(kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public static final Object b(long j10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        if (j10 <= 0) {
            return kotlin.L0.f217464a;
        }
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        if (j10 < Long.MAX_VALUE) {
            d(c5102o.f220423e).T0(j10, c5102o);
        }
        Object objZ = c5102o.z();
        return objZ == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ : kotlin.L0.f217464a;
    }

    @Nullable
    public static final Object c(long j10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objB = b(e(j10), eVar);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : kotlin.L0.f217464a;
    }

    @NotNull
    public static final U d(@NotNull kotlin.coroutines.i iVar) {
        i.b bVar = iVar.get(kotlin.coroutines.f.f217679y3);
        U u10 = bVar instanceof U ? (U) bVar : null;
        return u10 == null ? Q.a() : u10;
    }

    public static final long e(long j10) {
        boolean zT = C5041h.T(j10);
        if (zT) {
            C5041h.a aVar = C5041h.f218418b;
            return C5041h.z(C5041h.W(j10, kotlin.time.j.P(999999L, DurationUnit.NANOSECONDS)));
        }
        if (zT) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
