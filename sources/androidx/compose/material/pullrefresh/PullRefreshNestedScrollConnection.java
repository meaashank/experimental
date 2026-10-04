package androidx.compose.material.pullrefresh;

import P.g;
import P.h;
import ed.l;
import ed.p;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PullRefreshNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l<Float, Float> f98704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final p<Float, e<? super Float>, Object> f98705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98706c;

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshNestedScrollConnection(@NotNull l<? super Float, Float> lVar, @NotNull p<? super Float, ? super e<? super Float>, ? extends Object> pVar, boolean z10) {
        this.f98704a = lVar;
        this.f98705b = pVar;
        this.f98706c = z10;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long H0(long j10, long j11, int i10) {
        if (!this.f98706c) {
            g.f65503b.getClass();
            return g.f65504c;
        }
        androidx.compose.ui.input.nestedscroll.e.f102137b.getClass();
        if (i10 == androidx.compose.ui.input.nestedscroll.e.f102138c && g.r(j11) > 0.0f) {
            return h.a(0.0f, this.f98704a.invoke(Float.valueOf(g.r(j11))).floatValue());
        }
        g.f65503b.getClass();
        return g.f65504c;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long j2(long j10, int i10) {
        if (!this.f98706c) {
            g.f65503b.getClass();
            return g.f65504c;
        }
        androidx.compose.ui.input.nestedscroll.e.f102137b.getClass();
        if (i10 == androidx.compose.ui.input.nestedscroll.e.f102138c && g.r(j10) < 0.0f) {
            return h.a(0.0f, this.f98704a.invoke(Float.valueOf(g.r(j10))).floatValue());
        }
        g.f65503b.getClass();
        return g.f65504c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m1(long r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super k0.E> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.f98710d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98710d = r1
            goto L18
        L13:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f98708b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f98710d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            float r5 = r0.f98707a
            kotlin.C4885d0.n(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C4885d0.n(r7)
            ed.p<java.lang.Float, kotlin.coroutines.e<? super java.lang.Float>, java.lang.Object> r7 = r4.f98705b
            float r5 = k0.E.n(r5)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r5 = 0
            r0.f98707a = r5
            r0.f98710d = r3
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = k0.F.a(r5, r6)
            k0.E r7 = new k0.E
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.m1(long, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public Object s0(long j10, long j11, e eVar) {
        return androidx.compose.ui.input.nestedscroll.a.i(this, j10, j11, eVar);
    }
}
