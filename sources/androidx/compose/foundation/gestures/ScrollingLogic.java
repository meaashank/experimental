package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.k0;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class ScrollingLogic {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f89782k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public A f89783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public k0 f89784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public q f89785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Orientation f89786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f89787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public NestedScrollDispatcher f89788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f89789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public w f89790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f89791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ed.l<P.g, P.g> f89792j;

    public static final class a implements s {
        public a() {
        }

        @Override // androidx.compose.foundation.gestures.s
        public long a(long j10, int i10) {
            ScrollingLogic scrollingLogic = ScrollingLogic.this;
            scrollingLogic.f89789g = i10;
            k0 k0Var = scrollingLogic.f89784b;
            if (k0Var == null || !scrollingLogic.o()) {
                ScrollingLogic scrollingLogic2 = ScrollingLogic.this;
                return scrollingLogic2.s(scrollingLogic2.f89790h, j10, i10);
            }
            ScrollingLogic scrollingLogic3 = ScrollingLogic.this;
            return k0Var.a(j10, scrollingLogic3.f89789g, scrollingLogic3.f89792j);
        }

        @Override // androidx.compose.foundation.gestures.s
        public long b(long j10, int i10) {
            ScrollingLogic scrollingLogic = ScrollingLogic.this;
            return scrollingLogic.s(scrollingLogic.f89790h, j10, i10);
        }
    }

    public ScrollingLogic(@NotNull A a10, @Nullable k0 k0Var, @NotNull q qVar, @NotNull Orientation orientation, boolean z10, @NotNull NestedScrollDispatcher nestedScrollDispatcher) {
        this.f89783a = a10;
        this.f89784b = k0Var;
        this.f89785c = qVar;
        this.f89786d = orientation;
        this.f89787e = z10;
        this.f89788f = nestedScrollDispatcher;
        androidx.compose.ui.input.nestedscroll.e.f102137b.getClass();
        this.f89789g = androidx.compose.ui.input.nestedscroll.e.f102138c;
        this.f89790h = ScrollableKt.f89715b;
        this.f89791i = new a();
        this.f89792j = new ed.l<P.g, P.g>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$performScrollForOverscroll$1
            {
                super(1);
            }

            public final long e(long j10) {
                ScrollingLogic scrollingLogic = this.f89812d;
                return scrollingLogic.s(scrollingLogic.f89790h, j10, scrollingLogic.f89789g);
            }

            @Override // ed.l
            public /* synthetic */ P.g invoke(P.g gVar) {
                return new P.g(e(gVar.f65507a));
            }
        };
    }

    public static /* synthetic */ Object w(ScrollingLogic scrollingLogic, MutatePriority mutatePriority, ed.p pVar, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollingLogic.v(mutatePriority, pVar, eVar);
    }

    public final float A(long j10) {
        return this.f89786d == Orientation.Horizontal ? k0.E.l(j10) : k0.E.n(j10);
    }

    public final float B(long j10) {
        return this.f89786d == Orientation.Horizontal ? P.g.p(j10) : P.g.r(j10);
    }

    public final long C(float f10) {
        if (f10 != 0.0f) {
            return this.f89786d == Orientation.Horizontal ? P.h.a(f10, 0.0f) : P.h.a(0.0f, f10);
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    public final boolean D(@NotNull A a10, @NotNull Orientation orientation, @Nullable k0 k0Var, boolean z10, @NotNull q qVar, @NotNull NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z11;
        boolean z12 = true;
        if (kotlin.jvm.internal.G.g(this.f89783a, a10)) {
            z11 = false;
        } else {
            this.f89783a = a10;
            z11 = true;
        }
        this.f89784b = k0Var;
        if (this.f89786d != orientation) {
            this.f89786d = orientation;
            z11 = true;
        }
        if (this.f89787e != z10) {
            this.f89787e = z10;
        } else {
            z12 = z11;
        }
        this.f89785c = qVar;
        this.f89788f = nestedScrollDispatcher;
        return z12;
    }

    public final long E(long j10, float f10) {
        return this.f89786d == Orientation.Horizontal ? k0.E.g(j10, f10, 0.0f, 2, null) : k0.E.g(j10, 0.0f, f10, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(long r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super k0.E> r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.f89797d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89797d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f89795b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89797d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r11 = r0.f89794a
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref.LongRef) r11
            kotlin.C4885d0.n(r13)
            r5 = r10
            goto L54
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            kotlin.C4885d0.n(r13)
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            r6.f217903a = r11
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r4 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)
            r0.f89794a = r6
            r0.f89797d = r3
            java.lang.Object r11 = r10.v(r13, r4, r0)
            if (r11 != r1) goto L53
            return r1
        L53:
            r11 = r6
        L54:
            long r11 = r11.f217903a
            k0.E r13 = new k0.E
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.n(long, kotlin.coroutines.e):java.lang.Object");
    }

    public final boolean o() {
        return this.f89783a.d() || this.f89783a.g();
    }

    public final boolean p() {
        return this.f89786d == Orientation.Vertical;
    }

    @Nullable
    public final Object q(long j10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        long jZ = z(j10);
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this, null);
        k0 k0Var = this.f89784b;
        if (k0Var == null || !o()) {
            Object objInvoke = scrollingLogic$onDragStopped$performFling$1.invoke(new k0.E(jZ), eVar);
            return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : L0.f217464a;
        }
        Object objC = k0Var.c(jZ, scrollingLogic$onDragStopped$performFling$1, eVar);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : L0.f217464a;
    }

    public final long r(long j10) {
        if (!this.f89783a.c()) {
            return C(t(this.f89783a.b(t(B(j10)))));
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    public final long s(w wVar, long j10, int i10) {
        long jD = this.f89788f.d(j10, i10);
        long jU = P.g.u(j10, jD);
        long jU2 = u(C(wVar.a(B(u(y(jU))))));
        return P.g.v(P.g.v(jD, jU2), this.f89788f.b(jU2, P.g.u(jU, jU2), i10));
    }

    public final float t(float f10) {
        return this.f89787e ? f10 * (-1) : f10;
    }

    public final long u(long j10) {
        return this.f89787e ? P.g.x(j10, -1.0f) : j10;
    }

    @Nullable
    public final Object v(@NotNull MutatePriority mutatePriority, @NotNull ed.p<? super s, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objA = this.f89783a.a(mutatePriority, new ScrollingLogic$scroll$2(this, pVar, null), eVar);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : L0.f217464a;
    }

    public final boolean x() {
        if (this.f89783a.c()) {
            return true;
        }
        k0 k0Var = this.f89784b;
        return k0Var != null ? k0Var.b() : false;
    }

    public final long y(long j10) {
        return this.f89786d == Orientation.Horizontal ? P.g.i(j10, 0.0f, 0.0f, 1, null) : P.g.i(j10, 0.0f, 0.0f, 2, null);
    }

    public final long z(long j10) {
        return this.f89786d == Orientation.Horizontal ? k0.E.g(j10, 0.0f, 0.0f, 1, null) : k0.E.g(j10, 0.0f, 0.0f, 2, null);
    }
}
