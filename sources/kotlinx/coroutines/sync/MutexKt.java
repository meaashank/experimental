package kotlinx.coroutines.sync;

import ed.InterfaceC4376a;
import kotlin.coroutines.e;
import kotlinx.coroutines.internal.Q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class MutexKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Q f220761a = new Q("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Q f220762b = new Q("ALREADY_LOCKED_BY_OWNER");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f220763c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f220764d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f220765e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f220766f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f220767g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f220768h = 2;

    @NotNull
    public static final a a(boolean z10) {
        return new MutexImpl(z10);
    }

    public static a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return new MutexImpl(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.a r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull ed.InterfaceC4376a<? extends T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.MutexKt$withLock$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = (kotlinx.coroutines.sync.MutexKt$withLock$1) r0
            int r1 = r0.f220773e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220773e = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = new kotlinx.coroutines.sync.MutexKt$withLock$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f220772d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220773e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f220771c
            r6 = r4
            ed.a r6 = (ed.InterfaceC4376a) r6
            java.lang.Object r5 = r0.f220770b
            java.lang.Object r4 = r0.f220769a
            kotlinx.coroutines.sync.a r4 = (kotlinx.coroutines.sync.a) r4
            kotlin.C4885d0.n(r7)
            goto L4c
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.C4885d0.n(r7)
            r0.f220769a = r4
            r0.f220770b = r5
            r0.f220771c = r6
            r0.f220773e = r3
            java.lang.Object r7 = r4.h(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L54
            r4.i(r5)
            return r6
        L54:
            r6 = move-exception
            r4.i(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexKt.e(kotlinx.coroutines.sync.a, java.lang.Object, ed.a, kotlin.coroutines.e):java.lang.Object");
    }

    public static final <T> Object f(a aVar, Object obj, InterfaceC4376a<? extends T> interfaceC4376a, e<? super T> eVar) {
        aVar.h(obj, eVar);
        try {
            return interfaceC4376a.invoke();
        } finally {
            aVar.i(obj);
        }
    }

    public static /* synthetic */ Object g(a aVar, Object obj, InterfaceC4376a interfaceC4376a, e eVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        aVar.h(obj, eVar);
        try {
            return interfaceC4376a.invoke();
        } finally {
            aVar.i(obj);
        }
    }
}
