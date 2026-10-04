package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.L1;
import androidx.compose.ui.graphics.M0;
import androidx.compose.ui.platform.C2278s0;
import androidx.compose.ui.platform.InspectableValueKt;
import jd.C4806d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n*L\n1#1,875:1\n135#2:876\n135#2:877\n806#3,5:878\n806#3,5:883\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n664#1:876\n674#1:877\n585#1:878,5\n691#1:883,5\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class AndroidEdgeEffectOverscrollEffect implements k0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f88350i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public P.g f88351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final G f88352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final L0<kotlin.L0> f88353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f88356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.input.pointer.z f88357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.p f88358h;

    public AndroidEdgeEffectOverscrollEffect(@NotNull Context context, @NotNull j0 j0Var) {
        androidx.compose.ui.p c1842y;
        G g10 = new G(context, M0.t(j0Var.f90165a));
        this.f88352b = g10;
        kotlin.L0 l02 = kotlin.L0.f217464a;
        this.f88353c = ActualAndroid_androidKt.e(l02, L1.a());
        this.f88354d = true;
        P.n.f65527b.getClass();
        this.f88356f = P.n.f65528c;
        androidx.compose.ui.p pVarE = androidx.compose.ui.input.pointer.T.e(androidx.compose.ui.p.f103112M2, l02, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null));
        if (Build.VERSION.SDK_INT >= 31) {
            c1842y = new E(this, g10, InspectableValueKt.e() ? new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
                {
                    super(1);
                }

                public final void e(@NotNull C2278s0 c2278s0) {
                    c2278s0.f103927a = "overscroll";
                    c2278s0.f103928b = this.f88370d;
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                    e(c2278s0);
                    return kotlin.L0.f217464a;
                }
            } : InspectableValueKt.f103595a);
        } else {
            c1842y = new C1842y(this, g10, j0Var, InspectableValueKt.e() ? new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$2
                {
                    super(1);
                }

                public final void e(@NotNull C2278s0 c2278s0) {
                    c2278s0.f103927a = "overscroll";
                    c2278s0.f103928b = this.f88371d;
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                    e(c2278s0);
                    return kotlin.L0.f217464a;
                }
            } : InspectableValueKt.f103595a);
        }
        this.f88358h = pVarE.P0(c1842y);
    }

    @e.f0
    public static /* synthetic */ void k() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127 A[ADDED_TO_REGION] */
    @Override // androidx.compose.foundation.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(long r11, int r13, @org.jetbrains.annotations.NotNull ed.l<? super P.g, P.g> r14) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.a(long, int, ed.l):long");
    }

    @Override // androidx.compose.foundation.k0
    public boolean b() {
        G g10 = this.f88352b;
        EdgeEffect edgeEffect = g10.f88701d;
        if (edgeEffect != null && F.f88668a.b(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = g10.f88702e;
        if (edgeEffect2 != null && F.f88668a.b(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = g10.f88703f;
        if (edgeEffect3 != null && F.f88668a.b(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = g10.f88704g;
        return (edgeEffect4 == null || F.f88668a.b(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r13.invoke(r14, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.k0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(long r11, @org.jetbrains.annotations.NotNull ed.p<? super k0.E, ? super kotlin.coroutines.e<? super k0.E>, ? extends java.lang.Object> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.c(long, ed.p, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.foundation.k0
    @NotNull
    public androidx.compose.ui.p d() {
        return this.f88358h;
    }

    public final void h() {
        boolean zIsFinished;
        G g10 = this.f88352b;
        EdgeEffect edgeEffect = g10.f88701d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = g10.f88702e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = g10.f88703f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = g10.f88704g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            m();
        }
    }

    public final long i() {
        P.g gVar = this.f88351a;
        long jB = gVar != null ? gVar.f65507a : P.o.b(this.f88356f);
        return P.h.a(P.g.p(jB) / P.n.t(this.f88356f), P.g.r(jB) / P.n.m(this.f88356f));
    }

    public final boolean j() {
        return this.f88354d;
    }

    @NotNull
    public final L0<kotlin.L0> l() {
        return this.f88353c;
    }

    public final void m() {
        if (this.f88354d) {
            this.f88353c.setValue(kotlin.L0.f217464a);
        }
    }

    public final float n(long j10) {
        float fP = P.g.p(i());
        float fR = P.g.r(j10) / P.n.m(this.f88356f);
        EdgeEffect edgeEffectG = this.f88352b.g();
        F f10 = F.f88668a;
        return f10.b(edgeEffectG) == 0.0f ? P.n.m(this.f88356f) * (-f10.d(edgeEffectG, -fR, 1 - fP)) : P.g.r(j10);
    }

    public final float o(long j10) {
        float fR = P.g.r(i());
        float fP = P.g.p(j10) / P.n.t(this.f88356f);
        EdgeEffect edgeEffectI = this.f88352b.i();
        F f10 = F.f88668a;
        return f10.b(edgeEffectI) == 0.0f ? P.n.t(this.f88356f) * f10.d(edgeEffectI, fP, 1 - fR) : P.g.p(j10);
    }

    public final float p(long j10) {
        float fR = P.g.r(i());
        float fP = P.g.p(j10) / P.n.t(this.f88356f);
        EdgeEffect edgeEffectK = this.f88352b.k();
        F f10 = F.f88668a;
        return f10.b(edgeEffectK) == 0.0f ? P.n.t(this.f88356f) * (-f10.d(edgeEffectK, -fP, fR)) : P.g.p(j10);
    }

    public final float q(long j10) {
        float fP = P.g.p(i());
        float fR = P.g.r(j10) / P.n.m(this.f88356f);
        EdgeEffect edgeEffectM = this.f88352b.m();
        F f10 = F.f88668a;
        return f10.b(edgeEffectM) == 0.0f ? P.n.m(this.f88356f) * f10.d(edgeEffectM, fR, fP) : P.g.r(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(long r8) {
        /*
            r7 = this;
            androidx.compose.foundation.G r0 = r7.f88352b
            android.widget.EdgeEffect r1 = r0.f88703f
            boolean r0 = r0.o(r1)
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L2e
            float r0 = P.g.p(r8)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2e
            androidx.compose.foundation.F r0 = androidx.compose.foundation.F.f88668a
            androidx.compose.foundation.G r4 = r7.f88352b
            android.widget.EdgeEffect r4 = r4.i()
            float r5 = P.g.p(r8)
            r0.e(r4, r5)
            androidx.compose.foundation.G r0 = r7.f88352b
            android.widget.EdgeEffect r4 = r0.f88703f
            boolean r0 = r0.o(r4)
            r0 = r0 ^ r1
            goto L2f
        L2e:
            r0 = r3
        L2f:
            androidx.compose.foundation.G r4 = r7.f88352b
            android.widget.EdgeEffect r5 = r4.f88704g
            boolean r4 = r4.o(r5)
            if (r4 == 0) goto L60
            float r4 = P.g.p(r8)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L60
            androidx.compose.foundation.F r4 = androidx.compose.foundation.F.f88668a
            androidx.compose.foundation.G r5 = r7.f88352b
            android.widget.EdgeEffect r5 = r5.k()
            float r6 = P.g.p(r8)
            r4.e(r5, r6)
            if (r0 != 0) goto L5f
            androidx.compose.foundation.G r0 = r7.f88352b
            android.widget.EdgeEffect r4 = r0.f88704g
            boolean r0 = r0.o(r4)
            if (r0 != 0) goto L5d
            goto L5f
        L5d:
            r0 = r3
            goto L60
        L5f:
            r0 = r1
        L60:
            androidx.compose.foundation.G r4 = r7.f88352b
            android.widget.EdgeEffect r5 = r4.f88701d
            boolean r4 = r4.o(r5)
            if (r4 == 0) goto L91
            float r4 = P.g.r(r8)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L91
            androidx.compose.foundation.F r4 = androidx.compose.foundation.F.f88668a
            androidx.compose.foundation.G r5 = r7.f88352b
            android.widget.EdgeEffect r5 = r5.m()
            float r6 = P.g.r(r8)
            r4.e(r5, r6)
            if (r0 != 0) goto L90
            androidx.compose.foundation.G r0 = r7.f88352b
            android.widget.EdgeEffect r4 = r0.f88701d
            boolean r0 = r0.o(r4)
            if (r0 != 0) goto L8e
            goto L90
        L8e:
            r0 = r3
            goto L91
        L90:
            r0 = r1
        L91:
            androidx.compose.foundation.G r4 = r7.f88352b
            android.widget.EdgeEffect r5 = r4.f88702e
            boolean r4 = r4.o(r5)
            if (r4 == 0) goto Lc1
            float r4 = P.g.r(r8)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lc1
            androidx.compose.foundation.F r2 = androidx.compose.foundation.F.f88668a
            androidx.compose.foundation.G r4 = r7.f88352b
            android.widget.EdgeEffect r4 = r4.g()
            float r8 = P.g.r(r8)
            r2.e(r4, r8)
            if (r0 != 0) goto Lc0
            androidx.compose.foundation.G r8 = r7.f88352b
            android.widget.EdgeEffect r9 = r8.f88702e
            boolean r8 = r8.o(r9)
            if (r8 != 0) goto Lbf
            goto Lc0
        Lbf:
            return r3
        Lc0:
            return r1
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.r(long):boolean");
    }

    public final void s(boolean z10) {
        this.f88354d = z10;
    }

    public final boolean t() {
        boolean z10;
        G g10 = this.f88352b;
        if (g10.y(g10.f88703f)) {
            P.g.f65503b.getClass();
            o(P.g.f65504c);
            z10 = true;
        } else {
            z10 = false;
        }
        G g11 = this.f88352b;
        if (g11.y(g11.f88704g)) {
            P.g.f65503b.getClass();
            p(P.g.f65504c);
            z10 = true;
        }
        G g12 = this.f88352b;
        if (g12.y(g12.f88701d)) {
            P.g.f65503b.getClass();
            q(P.g.f65504c);
            z10 = true;
        }
        G g13 = this.f88352b;
        if (!g13.y(g13.f88702e)) {
            return z10;
        }
        P.g.f65503b.getClass();
        n(P.g.f65504c);
        return true;
    }

    public final void u(long j10) {
        long j11 = this.f88356f;
        P.n.f65527b.getClass();
        boolean zK = P.n.k(j11, P.n.f65528c);
        boolean zK2 = P.n.k(j10, this.f88356f);
        this.f88356f = j10;
        if (!zK2) {
            this.f88352b.C(k0.y.a(C4806d.L0(P.n.t(j10)), C4806d.L0(P.n.m(j10))));
        }
        if (zK || zK2) {
            return;
        }
        m();
        h();
    }
}
