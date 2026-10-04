package androidx.activity;

import kotlin.L0;

/* JADX INFO: loaded from: classes.dex */
public final class FullyDrawnReporterKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.L0] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.activity.z r4, @org.jetbrains.annotations.NotNull ed.l<? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1) r0
            int r1 = r0.f84859c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f84859c = r1
            goto L18
        L13:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f84858b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f84859c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f84857a
            androidx.activity.z r4 = (androidx.activity.z) r4
            kotlin.C4885d0.n(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r5 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C4885d0.n(r6)
            r4.c()
            boolean r6 = r4.e()
            if (r6 == 0) goto L44
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        L44:
            r0.f84857a = r4     // Catch: java.lang.Throwable -> L2b
            r0.f84859c = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r4.h()
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        L55:
            r4.h()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.FullyDrawnReporterKt.a(androidx.activity.z, ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    public static final Object b(z zVar, ed.l<? super kotlin.coroutines.e<? super L0>, ? extends Object> lVar, kotlin.coroutines.e<? super L0> eVar) {
        zVar.c();
        if (zVar.e()) {
            return L0.f217464a;
        }
        try {
            lVar.invoke(eVar);
            zVar.h();
            return L0.f217464a;
        } catch (Throwable th) {
            zVar.h();
            throw th;
        }
    }
}
