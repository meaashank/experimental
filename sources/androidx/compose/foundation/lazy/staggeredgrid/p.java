package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.v0;
import java.util.List;
import kotlin.collections.I;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1354:1\n1341#1:1376\n1343#1:1377\n1341#1:1378\n1343#1:1380\n1343#1:1381\n317#2,8:1355\n317#2,8:1363\n69#2,4:1372\n74#2:1379\n1#3:1371\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1283#1:1376\n1303#1:1377\n1304#1:1378\n1331#1:1380\n1335#1:1381\n1220#1:1355,8\n1226#1:1363,8\n1282#1:1372,4\n1282#1:1379\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class p implements g, androidx.compose.foundation.lazy.layout.x {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f92155y = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f92156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Object f92157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<v0> f92158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f92159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f92160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f92161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f92162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f92163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Object f92164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final LazyLayoutItemAnimator<p> f92165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f92166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f92167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f92168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f92169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f92170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f92171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f92172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f92173u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f92174v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f92175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f92176x;

    public /* synthetic */ p(int i10, Object obj, List list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10, C4969v c4969v) {
        this(i10, obj, list, z10, i11, i12, i13, i14, i15, obj2, lazyLayoutItemAnimator, j10);
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public int a() {
        return this.f92158f.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.g
    public long b() {
        return this.f92175w;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.g
    public long c() {
        return this.f92176x;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.g, androidx.compose.foundation.lazy.layout.x
    public int d() {
        return this.f92160h;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public long e() {
        return this.f92166n;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public void f(boolean z10) {
        this.f92174v = z10;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public boolean g() {
        return this.f92174v;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.g
    @Nullable
    public Object getContentType() {
        return this.f92164l;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.g, androidx.compose.foundation.lazy.layout.x
    public int getIndex() {
        return this.f92156d;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.g, androidx.compose.foundation.lazy.layout.x
    @NotNull
    public Object getKey() {
        return this.f92157e;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public boolean h() {
        return this.f92159g;
    }

    public final void i(int i10) {
        if (this.f92174v) {
            return;
        }
        long j10 = this.f92176x;
        boolean z10 = this.f92159g;
        this.f92176x = k0.u.a(z10 ? (int) (j10 >> 32) : ((int) (j10 >> 32)) + i10, z10 ? ((int) (j10 & ZipKt.f225990j)) + i10 : (int) (j10 & ZipKt.f225990j));
        int size = this.f92158f.size();
        for (int i11 = 0; i11 < size; i11++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimationE = this.f92165m.e(this.f92157e, i11);
            if (lazyLayoutItemAnimationE != null) {
                long j11 = lazyLayoutItemAnimationE.f91609l;
                lazyLayoutItemAnimationE.f91609l = k0.u.a(this.f92159g ? (int) (j11 >> 32) : Integer.valueOf(((int) (j11 >> 32)) + i10).intValue(), this.f92159g ? ((int) (j11 & ZipKt.f225990j)) + i10 : (int) (j11 & ZipKt.f225990j));
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public void j(int i10, int i11, int i12, int i13) {
        if (this.f92159g) {
            i12 = i13;
        }
        w(i10, i11, i12);
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public int k() {
        return this.f92161i;
    }

    public final long l(long j10, ed.l<? super Integer, Integer> lVar) {
        return k0.u.a(this.f92159g ? (int) (j10 >> 32) : lVar.invoke(Integer.valueOf((int) (j10 >> 32))).intValue(), this.f92159g ? lVar.invoke(Integer.valueOf((int) (j10 & ZipKt.f225990j))).intValue() : (int) (j10 & ZipKt.f225990j));
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public int m() {
        return this.f92169q;
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    @Nullable
    public Object n(int i10) {
        return this.f92158f.get(i10).g();
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    public long o(int i10) {
        return this.f92176x;
    }

    public final int p() {
        return this.f92170r;
    }

    public final int q(long j10) {
        return (int) (this.f92159g ? j10 & ZipKt.f225990j : j10 >> 32);
    }

    public final int r() {
        return (int) (!this.f92159g ? this.f92176x >> 32 : this.f92176x & ZipKt.f225990j);
    }

    public final int s() {
        return this.f92168p;
    }

    public final int t(v0 v0Var) {
        return this.f92159g ? v0Var.f102605b : v0Var.f102604a;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        return this.f92167o;
    }

    public final void v(@NotNull v0.a aVar, @NotNull m mVar) {
        GraphicsLayer graphicsLayer;
        v0.a aVar2;
        int i10;
        int i11;
        if (this.f92171s == -1) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List<v0> list = this.f92158f;
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            v0 v0Var = list.get(i12);
            int i13 = this.f92172t - (this.f92159g ? v0Var.f102605b : v0Var.f102604a);
            int i14 = this.f92173u;
            long jA = this.f92176x;
            LazyLayoutItemAnimation lazyLayoutItemAnimationE = this.f92165m.e(this.f92157e, i12);
            if (lazyLayoutItemAnimationE != null) {
                long jR = k0.t.r(jA, lazyLayoutItemAnimationE.t());
                if ((q(jA) <= i13 && q(jR) <= i13) || (q(jA) >= i14 && q(jR) >= i14)) {
                    lazyLayoutItemAnimationE.n();
                }
                graphicsLayer = lazyLayoutItemAnimationE.f91611n;
                jA = jR;
            } else {
                graphicsLayer = null;
            }
            if (mVar.f92121l) {
                boolean z10 = this.f92159g;
                if (z10) {
                    i10 = (int) (jA >> 32);
                } else {
                    i10 = (this.f92171s - ((int) (jA >> 32))) - (z10 ? v0Var.f102605b : v0Var.f102604a);
                }
                if (z10) {
                    i11 = (this.f92171s - ((int) (jA & ZipKt.f225990j))) - (z10 ? v0Var.f102605b : v0Var.f102604a);
                } else {
                    i11 = (int) (jA & ZipKt.f225990j);
                }
                jA = k0.u.a(i10, i11);
            }
            long jR2 = k0.t.r(jA, mVar.f92118i);
            if (lazyLayoutItemAnimationE != null) {
                lazyLayoutItemAnimationE.f91610m = jR2;
            }
            if (graphicsLayer != null) {
                aVar2 = aVar;
                v0.a.B(aVar2, v0Var, jR2, graphicsLayer, 0.0f, 4, null);
            } else {
                aVar2 = aVar;
                v0.a.A(aVar2, v0Var, jR2, 0.0f, null, 6, null);
            }
            i12++;
            aVar = aVar2;
        }
    }

    public final void w(int i10, int i11, int i12) {
        this.f92171s = i12;
        this.f92172t = -this.f92162j;
        this.f92173u = i12 + this.f92163k;
        this.f92176x = this.f92159g ? k0.u.a(i11, i10) : k0.u.a(i10, i11);
    }

    public final void x(boolean z10) {
        this.f92167o = z10;
    }

    public final void y(int i10) {
        this.f92171s = i10;
        this.f92173u = i10 + this.f92163k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(int i10, Object obj, List<? extends v0> list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator<p> lazyLayoutItemAnimator, long j10) {
        Integer numValueOf;
        this.f92156d = i10;
        this.f92157e = obj;
        this.f92158f = list;
        this.f92159g = z10;
        this.f92160h = i12;
        this.f92161i = i13;
        this.f92162j = i14;
        this.f92163k = i15;
        this.f92164l = obj2;
        this.f92165m = lazyLayoutItemAnimator;
        this.f92166n = j10;
        int i16 = 1;
        this.f92167o = true;
        Integer num = null;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            v0 v0Var = (v0) list.get(0);
            numValueOf = Integer.valueOf(z10 ? v0Var.f102605b : v0Var.f102604a);
            int iL = I.L(list);
            if (1 <= iL) {
                int i17 = 1;
                while (true) {
                    v0 v0Var2 = (v0) list.get(i17);
                    Integer numValueOf2 = Integer.valueOf(this.f92159g ? v0Var2.f102605b : v0Var2.f102604a);
                    numValueOf = numValueOf2.compareTo(numValueOf) > 0 ? numValueOf2 : numValueOf;
                    if (i17 == iL) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        this.f92168p = iIntValue;
        int i18 = iIntValue + i11;
        this.f92169q = i18 < 0 ? 0 : i18;
        List<v0> list2 = this.f92158f;
        if (!list2.isEmpty()) {
            v0 v0Var3 = list2.get(0);
            Integer numValueOf3 = Integer.valueOf(this.f92159g ? v0Var3.f102604a : v0Var3.f102605b);
            int iL2 = I.L(list2);
            if (1 <= iL2) {
                while (true) {
                    v0 v0Var4 = list2.get(i16);
                    Integer numValueOf4 = Integer.valueOf(this.f92159g ? v0Var4.f102604a : v0Var4.f102605b);
                    numValueOf3 = numValueOf4.compareTo(numValueOf3) > 0 ? numValueOf4 : numValueOf3;
                    if (i16 == iL2) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            num = numValueOf3;
        }
        int iIntValue2 = num != null ? num.intValue() : 0;
        this.f92170r = iIntValue2;
        this.f92171s = -1;
        this.f92175w = this.f92159g ? k0.y.a(iIntValue2, this.f92168p) : k0.y.a(this.f92168p, iIntValue2);
        k0.t.f214328b.getClass();
        this.f92176x = k0.t.f214329c;
    }
}
