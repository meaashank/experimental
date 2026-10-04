package androidx.compose.runtime;

import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class PausableMonotonicFrameClock implements InterfaceC1981y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99176c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC1981y0 f99177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Latch f99178b = new Latch();

    public PausableMonotonicFrameClock(@NotNull InterfaceC1981y0 interfaceC1981y0) {
        this.f99177a = interfaceC1981y0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.InterfaceC1981y0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object B1(@org.jetbrains.annotations.NotNull ed.l<? super java.lang.Long, ? extends R> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.f99183e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99183e = r1
            goto L18
        L13:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f99181c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f99183e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.C4885d0.n(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f99180b
            ed.l r6 = (ed.l) r6
            java.lang.Object r2 = r0.f99179a
            androidx.compose.runtime.PausableMonotonicFrameClock r2 = (androidx.compose.runtime.PausableMonotonicFrameClock) r2
            kotlin.C4885d0.n(r7)
            goto L51
        L3e:
            kotlin.C4885d0.n(r7)
            androidx.compose.runtime.Latch r7 = r5.f99178b
            r0.f99179a = r5
            r0.f99180b = r6
            r0.f99183e = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L50
            goto L60
        L50:
            r2 = r5
        L51:
            androidx.compose.runtime.y0 r7 = r2.f99177a
            r2 = 0
            r0.f99179a = r2
            r0.f99180b = r2
            r0.f99183e = r3
            java.lang.Object r6 = r7.B1(r6, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.B1(ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    public final boolean d() {
        return !this.f99178b.e();
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public <R> R fold(R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> cVar) {
        return (E) i.b.a.b(this, cVar);
    }

    @Override // androidx.compose.runtime.InterfaceC1981y0, kotlin.coroutines.i.b
    public /* synthetic */ i.c getKey() {
        return C1978x0.a(this);
    }

    public final void h() {
        this.f99178b.d();
    }

    public final void i() {
        this.f99178b.f();
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i minusKey(@NotNull i.c<?> cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i plus(@NotNull kotlin.coroutines.i iVar) {
        return i.b.a.d(this, iVar);
    }
}
