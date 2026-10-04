package kotlinx.coroutines.sync;

import ed.InterfaceC4376a;
import kotlin.coroutines.e;
import kotlinx.coroutines.internal.Q;
import kotlinx.coroutines.internal.W;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SemaphoreKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f220784a = W.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Q f220785b = new Q("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Q f220786c = new Q("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Q f220787d = new Q("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Q f220788e = new Q("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f220789f = W.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    @NotNull
    public static final b a(int i10, int i11) {
        return new SemaphoreImpl(i10, i11);
    }

    public static b b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return new SemaphoreImpl(i10, i11);
    }

    public static final c j(long j10, c cVar) {
        return new c(j10, cVar, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.b r4, @org.jetbrains.annotations.NotNull ed.InterfaceC4376a<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.SemaphoreKt$withPermit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = (kotlinx.coroutines.sync.SemaphoreKt$withPermit$1) r0
            int r1 = r0.f220793d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220793d = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = new kotlinx.coroutines.sync.SemaphoreKt$withPermit$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f220792c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220793d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f220791b
            r5 = r4
            ed.a r5 = (ed.InterfaceC4376a) r5
            java.lang.Object r4 = r0.f220790a
            kotlinx.coroutines.sync.b r4 = (kotlinx.coroutines.sync.b) r4
            kotlin.C4885d0.n(r6)
            goto L48
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.C4885d0.n(r6)
            r0.f220790a = r4
            r0.f220791b = r5
            r0.f220793d = r3
            java.lang.Object r6 = r4.g(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L50
            r4.release()
            return r5
        L50:
            r5 = move-exception
            r4.release()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreKt.k(kotlinx.coroutines.sync.b, ed.a, kotlin.coroutines.e):java.lang.Object");
    }

    public static final <T> Object l(b bVar, InterfaceC4376a<? extends T> interfaceC4376a, e<? super T> eVar) {
        bVar.g(eVar);
        try {
            return interfaceC4376a.invoke();
        } finally {
            bVar.release();
        }
    }
}
