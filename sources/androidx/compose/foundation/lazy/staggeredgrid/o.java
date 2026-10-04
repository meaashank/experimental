package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AbstractC2155a;
import androidx.compose.ui.layout.B0;
import androidx.compose.ui.layout.T;
import java.util.List;
import java.util.Map;
import k0.InterfaceC4814e;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,267:1\n33#2,6:268\n33#2,6:274\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n*L\n191#1:268,6\n225#1:274,6\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class o implements l, T {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f92134u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final int[] f92135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f92136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f92137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final T f92138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f92139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f92140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f92141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final x f92142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final y f92143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final InterfaceC4814e f92144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f92145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final List<p> f92146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f92147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f92148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f92149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f92150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f92151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f92152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final L f92153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Orientation f92154t;

    public /* synthetic */ o(int[] iArr, int[] iArr2, float f10, T t10, boolean z10, boolean z11, boolean z12, x xVar, y yVar, InterfaceC4814e interfaceC4814e, int i10, List list, long j10, int i11, int i12, int i13, int i14, int i15, L l10, C4969v c4969v) {
        this(iArr, iArr2, f10, t10, z10, z11, z12, xVar, yVar, interfaceC4814e, i10, list, j10, i11, i12, i13, i14, i15, l10);
    }

    @Override // androidx.compose.ui.layout.T
    @NotNull
    public Map<AbstractC2155a, Integer> E() {
        return this.f92138d.E();
    }

    @Override // androidx.compose.ui.layout.T
    @Nullable
    public ed.l<B0, L0> F() {
        return this.f92138d.F();
    }

    @Override // androidx.compose.ui.layout.T
    public void G() {
        this.f92138d.G();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.l
    @NotNull
    public Orientation a() {
        return this.f92154t;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.l
    public long b() {
        return this.f92147m;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.l
    public int c() {
        return this.f92151q;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.l
    public int d() {
        return this.f92148n;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.l
    public int e() {
        return this.f92149o;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.l
    public int f() {
        return this.f92150p;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.l
    public int g() {
        return this.f92145k;
    }

    @Override // androidx.compose.ui.layout.T
    public int getHeight() {
        return this.f92138d.getHeight();
    }

    @Override // androidx.compose.ui.layout.T
    public int getWidth() {
        return this.f92138d.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.l
    public int h() {
        return this.f92152r;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.l
    @NotNull
    public List<p> i() {
        return this.f92146l;
    }

    public final boolean j() {
        return this.f92135a[0] != 0 || this.f92136b[0] > 0;
    }

    public final boolean k() {
        return this.f92139e;
    }

    public final float l() {
        return this.f92137c;
    }

    @NotNull
    public final L m() {
        return this.f92153s;
    }

    @NotNull
    public final InterfaceC4814e n() {
        return this.f92144j;
    }

    @NotNull
    public final int[] o() {
        return this.f92135a;
    }

    @NotNull
    public final int[] p() {
        return this.f92136b;
    }

    @NotNull
    public final T q() {
        return this.f92138d;
    }

    public final boolean r() {
        return this.f92141g;
    }

    @NotNull
    public final x s() {
        return this.f92142h;
    }

    @NotNull
    public final y t() {
        return this.f92143i;
    }

    public final boolean u() {
        return this.f92140f;
    }

    public final void v(boolean z10) {
        this.f92139e = z10;
    }

    public final void w(float f10) {
        this.f92137c = f10;
    }

    public final void x(@NotNull int[] iArr) {
        this.f92136b = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f92141g
            r1 = 0
            if (r0 != 0) goto Lc6
            java.util.List<androidx.compose.foundation.lazy.staggeredgrid.p> r0 = r9.f92146l
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc6
            int[] r0 = r9.f92135a
            int r0 = r0.length
            if (r0 != 0) goto L14
            goto Lc6
        L14:
            int[] r0 = r9.f92136b
            int r0 = r0.length
            if (r0 != 0) goto L1b
            goto Lc6
        L1b:
            int r0 = r9.f92149o
            int r2 = r9.f92151q
            int r0 = r0 - r2
            java.util.List<androidx.compose.foundation.lazy.staggeredgrid.p> r2 = r9.f92146l
            int r3 = r2.size()
            r4 = r1
        L27:
            r5 = 1
            if (r4 >= r3) goto L92
            java.lang.Object r6 = r2.get(r4)
            androidx.compose.foundation.lazy.staggeredgrid.p r6 = (androidx.compose.foundation.lazy.staggeredgrid.p) r6
            boolean r7 = r6.f92174v
            if (r7 != 0) goto L91
            int r7 = r6.r()
            if (r7 > 0) goto L3c
            r7 = r5
            goto L3d
        L3c:
            r7 = r1
        L3d:
            int r8 = r6.r()
            int r8 = r8 + r10
            if (r8 > 0) goto L45
            goto L46
        L45:
            r5 = r1
        L46:
            if (r7 == r5) goto L49
            goto L91
        L49:
            int r5 = r6.r()
            int r7 = r9.f92148n
            if (r5 > r7) goto L6a
            if (r10 >= 0) goto L61
            int r5 = r6.r()
            int r7 = r6.f92169q
            int r5 = r5 + r7
            int r7 = r9.f92148n
            int r5 = r5 - r7
            int r7 = -r10
            if (r5 <= r7) goto L69
            goto L6a
        L61:
            int r5 = r6.r()
            int r7 = r7 - r5
            if (r7 <= r10) goto L69
            goto L6a
        L69:
            return r1
        L6a:
            int r5 = r6.r()
            int r7 = r6.f92169q
            int r5 = r5 + r7
            if (r5 < r0) goto L8e
            if (r10 >= 0) goto L83
            int r5 = r6.r()
            int r6 = r6.f92169q
            int r5 = r5 + r6
            int r6 = r9.f92149o
            int r5 = r5 - r6
            int r6 = -r10
            if (r5 <= r6) goto L8d
            goto L8e
        L83:
            int r5 = r9.f92149o
            int r6 = r6.r()
            int r5 = r5 - r6
            if (r5 <= r10) goto L8d
            goto L8e
        L8d:
            return r1
        L8e:
            int r4 = r4 + 1
            goto L27
        L91:
            return r1
        L92:
            int[] r0 = r9.f92136b
            int r0 = r0.length
            int[] r2 = new int[r0]
            r3 = r1
        L98:
            if (r3 >= r0) goto La4
            int[] r4 = r9.f92136b
            r4 = r4[r3]
            int r4 = r4 - r10
            r2[r3] = r4
            int r3 = r3 + 1
            goto L98
        La4:
            r9.f92136b = r2
            java.util.List<androidx.compose.foundation.lazy.staggeredgrid.p> r0 = r9.f92146l
            int r2 = r0.size()
        Lac:
            if (r1 >= r2) goto Lba
            java.lang.Object r3 = r0.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.p r3 = (androidx.compose.foundation.lazy.staggeredgrid.p) r3
            r3.i(r10)
            int r1 = r1 + 1
            goto Lac
        Lba:
            float r0 = (float) r10
            r9.f92137c = r0
            boolean r0 = r9.f92139e
            if (r0 != 0) goto Lc5
            if (r10 <= 0) goto Lc5
            r9.f92139e = r5
        Lc5:
            return r5
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.o.y(int):boolean");
    }

    public o(int[] iArr, int[] iArr2, float f10, T t10, boolean z10, boolean z11, boolean z12, x xVar, y yVar, InterfaceC4814e interfaceC4814e, int i10, List<p> list, long j10, int i11, int i12, int i13, int i14, int i15, L l10) {
        this.f92135a = iArr;
        this.f92136b = iArr2;
        this.f92137c = f10;
        this.f92138d = t10;
        this.f92139e = z10;
        this.f92140f = z11;
        this.f92141g = z12;
        this.f92142h = xVar;
        this.f92143i = yVar;
        this.f92144j = interfaceC4814e;
        this.f92145k = i10;
        this.f92146l = list;
        this.f92147m = j10;
        this.f92148n = i11;
        this.f92149o = i12;
        this.f92150p = i13;
        this.f92151q = i14;
        this.f92152r = i15;
        this.f92153s = l10;
        this.f92154t = z11 ? Orientation.Vertical : Orientation.Horizontal;
    }
}
