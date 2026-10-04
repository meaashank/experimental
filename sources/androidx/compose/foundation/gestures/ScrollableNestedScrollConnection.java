package androidx.compose.foundation.gestures;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ScrollingLogic f89732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f89733b;

    public ScrollableNestedScrollConnection(@NotNull ScrollingLogic scrollingLogic, boolean z10) {
        this.f89732a = scrollingLogic;
        this.f89733b = z10;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long H0(long j10, long j11, int i10) {
        if (this.f89733b) {
            return this.f89732a.r(j11);
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    public final boolean a() {
        return this.f89733b;
    }

    @NotNull
    public final ScrollingLogic b() {
        return this.f89732a;
    }

    public final void c(boolean z10) {
        this.f89733b = z10;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public /* synthetic */ long j2(long j10, int i10) {
        return androidx.compose.ui.input.nestedscroll.a.d(this, j10, i10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public Object m1(long j10, kotlin.coroutines.e eVar) {
        return androidx.compose.ui.input.nestedscroll.a.j(this, j10, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s0(long r3, long r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super k0.E> r7) throws java.lang.Throwable {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r3
            int r4 = r3.f89737d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f89737d = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.f89735b
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r3.f89737d
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r5 = r3.f89734a
            kotlin.C4885d0.n(r4)
            goto L45
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            kotlin.C4885d0.n(r4)
            boolean r4 = r2.f89733b
            if (r4 == 0) goto L4e
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r2.f89732a
            r3.f89734a = r5
            r3.f89737d = r1
            java.lang.Object r4 = r4.n(r5, r3)
            if (r4 != r7) goto L45
            return r7
        L45:
            k0.E r4 = (k0.E) r4
            long r3 = r4.f214281a
            long r3 = k0.E.p(r5, r3)
            goto L55
        L4e:
            k0.E$a r3 = k0.E.f214279b
            r3.getClass()
            long r3 = k0.E.f214280c
        L55:
            k0.E r5 = new k0.E
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.s0(long, long, kotlin.coroutines.e):java.lang.Object");
    }
}
