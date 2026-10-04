package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n229#1:240\n229#1:241\n229#1:243\n33#2,6:234\n1#3:242\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n169#1:240\n173#1:241\n204#1:243\n79#1:234,6\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class p implements h, androidx.compose.foundation.lazy.layout.x {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f91466C = 8;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f91467A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f91468B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Object f91470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f91471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f91473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f91474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f91475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f91476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final List<v0> f91477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f91478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Object f91479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final LazyLayoutItemAnimator<p> f91480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f91481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f91482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f91483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f91484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f91485t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f91486u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f91487v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f91488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f91489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f91490y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f91491z;

    public /* synthetic */ p(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, LayoutDirection layoutDirection, int i13, int i14, List list, long j10, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, int i15, int i16, C4969v c4969v) {
        this(i10, obj, z10, i11, i12, z11, layoutDirection, i13, i14, list, j10, obj2, lazyLayoutItemAnimator, j11, i15, i16);
    }

    private final long q(long j10, ed.l<? super Integer, Integer> lVar) {
        return k0.u.a(this.f91471f ? (int) (j10 >> 32) : lVar.invoke(Integer.valueOf((int) (j10 >> 32))).intValue(), this.f91471f ? lVar.invoke(Integer.valueOf((int) (j10 & ZipKt.f225990j))).intValue() : (int) (j10 & ZipKt.f225990j));
    }

    private final int s(long j10) {
        return (int) (this.f91471f ? j10 & ZipKt.f225990j : j10 >> 32);
    }

    private final int u(v0 v0Var) {
        return this.f91471f ? v0Var.f102605b : v0Var.f102604a;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public int a() {
        return this.f91477l.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    public long b() {
        return this.f91489x;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    public long c() {
        return this.f91490y;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public int d() {
        return this.f91482q;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public long e() {
        return this.f91481p;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public void f(boolean z10) {
        this.f91468B = z10;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public boolean g() {
        return this.f91468B;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    @Nullable
    public Object getContentType() {
        return this.f91479n;
    }

    @Override // androidx.compose.foundation.lazy.grid.h, androidx.compose.foundation.lazy.layout.x
    public int getIndex() {
        return this.f91469d;
    }

    @Override // androidx.compose.foundation.lazy.grid.h, androidx.compose.foundation.lazy.layout.x
    @NotNull
    public Object getKey() {
        return this.f91470e;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public boolean h() {
        return this.f91471f;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    public int i() {
        return this.f91467A;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public void j(int i10, int i11, int i12, int i13) {
        w(i10, i11, i12, i13, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public int k() {
        return this.f91483r;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    public int l() {
        return this.f91491z;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public int m() {
        return this.f91485t;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    @Nullable
    public Object n(int i10) {
        return this.f91477l.get(i10).g();
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public long o(int i10) {
        return this.f91490y;
    }

    public final void p(int i10) {
        if (this.f91468B) {
            return;
        }
        long j10 = this.f91490y;
        boolean z10 = this.f91471f;
        this.f91490y = k0.u.a(z10 ? (int) (j10 >> 32) : ((int) (j10 >> 32)) + i10, z10 ? ((int) (j10 & ZipKt.f225990j)) + i10 : (int) (j10 & ZipKt.f225990j));
        int size = this.f91477l.size();
        for (int i11 = 0; i11 < size; i11++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimationE = this.f91480o.e(this.f91470e, i11);
            if (lazyLayoutItemAnimationE != null) {
                long j11 = lazyLayoutItemAnimationE.f91609l;
                lazyLayoutItemAnimationE.f91609l = k0.u.a(this.f91471f ? (int) (j11 >> 32) : Integer.valueOf(((int) (j11 >> 32)) + i10).intValue(), this.f91471f ? ((int) (j11 & ZipKt.f225990j)) + i10 : (int) (j11 & ZipKt.f225990j));
            }
        }
    }

    public final int r() {
        return this.f91472g;
    }

    public final int t() {
        return this.f91484s;
    }

    public final void v(@NotNull v0.a aVar) {
        GraphicsLayer graphicsLayer;
        v0.a aVar2;
        int i10;
        int i11;
        if (this.f91486u == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int size = this.f91477l.size();
        int i12 = 0;
        while (i12 < size) {
            v0 v0Var = this.f91477l.get(i12);
            int iU = this.f91487v - u(v0Var);
            int i13 = this.f91488w;
            long jA = this.f91490y;
            LazyLayoutItemAnimation lazyLayoutItemAnimationE = this.f91480o.e(this.f91470e, i12);
            if (lazyLayoutItemAnimationE != null) {
                long jR = k0.t.r(jA, lazyLayoutItemAnimationE.t());
                if ((s(jA) <= iU && s(jR) <= iU) || (s(jA) >= i13 && s(jR) >= i13)) {
                    lazyLayoutItemAnimationE.n();
                }
                graphicsLayer = lazyLayoutItemAnimationE.f91611n;
                jA = jR;
            } else {
                graphicsLayer = null;
            }
            if (this.f91473h) {
                boolean z10 = this.f91471f;
                if (z10) {
                    i10 = (int) (jA >> 32);
                } else {
                    i10 = (this.f91486u - ((int) (jA >> 32))) - (z10 ? v0Var.f102605b : v0Var.f102604a);
                }
                if (z10) {
                    i11 = (this.f91486u - ((int) (jA & ZipKt.f225990j))) - (z10 ? v0Var.f102605b : v0Var.f102604a);
                } else {
                    i11 = (int) (jA & ZipKt.f225990j);
                }
                jA = k0.u.a(i10, i11);
            }
            long jR2 = k0.t.r(jA, this.f91478m);
            if (lazyLayoutItemAnimationE != null) {
                lazyLayoutItemAnimationE.f91610m = jR2;
            }
            if (!this.f91471f) {
                aVar2 = aVar;
                GraphicsLayer graphicsLayer2 = graphicsLayer;
                if (graphicsLayer2 != null) {
                    v0.a.B(aVar2, v0Var, jR2, graphicsLayer2, 0.0f, 4, null);
                } else {
                    v0.a.A(aVar2, v0Var, jR2, 0.0f, null, 6, null);
                }
            } else if (graphicsLayer != null) {
                aVar2 = aVar;
                v0.a.J(aVar2, v0Var, jR2, graphicsLayer, 0.0f, 4, null);
            } else {
                aVar2 = aVar;
                v0.a.I(aVar2, v0Var, jR2, 0.0f, null, 6, null);
            }
            i12++;
            aVar = aVar2;
        }
    }

    public final void w(int i10, int i11, int i12, int i13, int i14, int i15) {
        boolean z10 = this.f91471f;
        this.f91486u = z10 ? i13 : i12;
        if (!z10) {
            i12 = i13;
        }
        if (z10 && this.f91474i == LayoutDirection.Rtl) {
            i11 = (i12 - i11) - this.f91472g;
        }
        this.f91490y = z10 ? k0.u.a(i11, i10) : k0.u.a(i10, i11);
        this.f91491z = i14;
        this.f91467A = i15;
        this.f91487v = -this.f91475j;
        this.f91488w = this.f91486u + this.f91476k;
    }

    public final void x(int i10) {
        this.f91486u = i10;
        this.f91488w = i10 + this.f91476k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, LayoutDirection layoutDirection, int i13, int i14, List<? extends v0> list, long j10, Object obj2, LazyLayoutItemAnimator<p> lazyLayoutItemAnimator, long j11, int i15, int i16) {
        this.f91469d = i10;
        this.f91470e = obj;
        this.f91471f = z10;
        this.f91472g = i11;
        this.f91473h = z11;
        this.f91474i = layoutDirection;
        this.f91475j = i13;
        this.f91476k = i14;
        this.f91477l = list;
        this.f91478m = j10;
        this.f91479n = obj2;
        this.f91480o = lazyLayoutItemAnimator;
        this.f91481p = j11;
        this.f91482q = i15;
        this.f91483r = i16;
        this.f91486u = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            v0 v0Var = (v0) list.get(i17);
            iMax = Math.max(iMax, this.f91471f ? v0Var.f102605b : v0Var.f102604a);
        }
        this.f91484s = iMax;
        int i18 = i12 + iMax;
        this.f91485t = i18 >= 0 ? i18 : 0;
        this.f91489x = this.f91471f ? k0.y.a(this.f91472g, iMax) : k0.y.a(iMax, this.f91472g);
        k0.t.f214328b.getClass();
        this.f91490y = k0.t.f214329c;
        this.f91491z = -1;
        this.f91467A = -1;
    }
}
