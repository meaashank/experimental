package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.InterfaceC2008b2;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import k0.C4811b;
import kotlin.L0;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class v0 implements Y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f102603f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f102606c = k0.y.a(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f102607d = PlaceableKt.f102494b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f102608e;

    @kotlin.jvm.internal.V({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n1#1,594:1\n452#1,2:595\n486#1,3:597\n455#1,2:600\n486#1,3:602\n461#1:605\n452#1,2:606\n486#1,3:608\n455#1,2:611\n486#1,3:613\n461#1:616\n486#1,3:617\n486#1,3:620\n452#1,2:623\n486#1,3:625\n455#1,2:628\n486#1,3:630\n461#1:633\n452#1,2:634\n486#1,3:636\n455#1,2:639\n486#1,3:641\n461#1:644\n486#1,3:645\n486#1,3:648\n496#1,3:651\n496#1,3:654\n469#1,2:657\n496#1,3:659\n472#1,2:662\n496#1,3:664\n478#1:667\n469#1,2:668\n496#1,3:670\n472#1,2:673\n496#1,3:675\n478#1:678\n486#1,3:679\n486#1,3:682\n496#1,3:685\n496#1,3:688\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n215#1:595,2\n215#1:597,3\n215#1:600,2\n215#1:602,3\n215#1:605\n233#1:606,2\n233#1:608,3\n233#1:611,2\n233#1:613,3\n233#1:616\n247#1:617,3\n260#1:620,3\n284#1:623,2\n284#1:625,3\n284#1:628,2\n284#1:630,3\n284#1:633\n310#1:634,2\n310#1:636,3\n310#1:639,2\n310#1:641,3\n310#1:644\n332#1:645,3\n352#1:648,3\n374#1:651,3\n394#1:654,3\n420#1:657,2\n420#1:659,3\n420#1:662,2\n420#1:664,3\n420#1:667\n444#1:668,2\n444#1:670,3\n444#1:673,2\n444#1:675,3\n444#1:678\n453#1:679,3\n455#1:682,3\n470#1:685,3\n472#1:688,3\n*E\n"})
    @w0
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f102609b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f102610a;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void A(a aVar, v0 v0Var, long j10, float f10, ed.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = PlaceableKt.f102493a;
            }
            aVar.y(v0Var, j10, f11, lVar);
        }

        public static /* synthetic */ void B(a aVar, v0 v0Var, long j10, GraphicsLayer graphicsLayer, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.z(v0Var, j10, graphicsLayer, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void E(a aVar, v0 v0Var, int i10, int i11, float f10, ed.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = PlaceableKt.f102493a;
            }
            aVar.C(v0Var, i10, i11, f11, lVar);
        }

        public static /* synthetic */ void F(a aVar, v0 v0Var, int i10, int i11, GraphicsLayer graphicsLayer, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 8) != 0) {
                f10 = 0.0f;
            }
            aVar.D(v0Var, i10, i11, graphicsLayer, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void I(a aVar, v0 v0Var, long j10, float f10, ed.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = PlaceableKt.f102493a;
            }
            aVar.G(v0Var, j10, f11, lVar);
        }

        public static /* synthetic */ void J(a aVar, v0 v0Var, long j10, GraphicsLayer graphicsLayer, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.H(v0Var, j10, graphicsLayer, f10);
        }

        public static /* synthetic */ void j(a aVar, v0 v0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.i(v0Var, i10, i11, f10);
        }

        public static /* synthetic */ void l(a aVar, v0 v0Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.k(v0Var, j10, f10);
        }

        public static /* synthetic */ void r(a aVar, v0 v0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.q(v0Var, i10, i11, f10);
        }

        public static /* synthetic */ void t(a aVar, v0 v0Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.s(v0Var, j10, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void w(a aVar, v0 v0Var, int i10, int i11, float f10, ed.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = PlaceableKt.f102493a;
            }
            aVar.u(v0Var, i10, i11, f11, lVar);
        }

        public static /* synthetic */ void x(a aVar, v0 v0Var, int i10, int i11, GraphicsLayer graphicsLayer, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 8) != 0) {
                f10 = 0.0f;
            }
            aVar.v(v0Var, i10, i11, graphicsLayer, f10);
        }

        public final void C(@NotNull v0 v0Var, int i10, int i11, float f10, @NotNull ed.l<? super InterfaceC2008b2, L0> lVar) {
            long jA = k0.u.a(i10, i11);
            h(v0Var);
            v0Var.d1(k0.t.r(jA, v0Var.f102608e), f10, lVar);
        }

        public final void D(@NotNull v0 v0Var, int i10, int i11, @NotNull GraphicsLayer graphicsLayer, float f10) {
            long jA = k0.u.a(i10, i11);
            h(v0Var);
            v0Var.c1(k0.t.r(jA, v0Var.f102608e), f10, graphicsLayer);
        }

        public final void G(@NotNull v0 v0Var, long j10, float f10, @NotNull ed.l<? super InterfaceC2008b2, L0> lVar) {
            h(v0Var);
            v0Var.d1(k0.t.r(j10, v0Var.f102608e), f10, lVar);
        }

        public final void H(@NotNull v0 v0Var, long j10, @NotNull GraphicsLayer graphicsLayer, float f10) {
            h(v0Var);
            v0Var.c1(k0.t.r(j10, v0Var.f102608e), f10, graphicsLayer);
        }

        public final void K(@NotNull ed.l<? super a, L0> lVar) {
            this.f102610a = true;
            lVar.invoke(this);
            this.f102610a = false;
        }

        public float d(@NotNull A0 a02, float f10) {
            return f10;
        }

        @Nullable
        public InterfaceC2188x e() {
            return null;
        }

        @NotNull
        public abstract LayoutDirection f();

        public abstract int g();

        /* JADX WARN: Multi-variable type inference failed */
        public final void h(v0 v0Var) {
            if (v0Var instanceof androidx.compose.ui.node.X) {
                ((androidx.compose.ui.node.X) v0Var).E0(this.f102610a);
            }
        }

        public final void i(@NotNull v0 v0Var, int i10, int i11, float f10) {
            long jA = k0.u.a(i10, i11);
            h(v0Var);
            v0Var.d1(k0.t.r(jA, v0Var.f102608e), f10, null);
        }

        public final void k(@NotNull v0 v0Var, long j10, float f10) {
            h(v0Var);
            v0Var.d1(k0.t.r(j10, v0Var.f102608e), f10, null);
        }

        public final void m(@NotNull v0 v0Var, long j10, float f10, @NotNull GraphicsLayer graphicsLayer) {
            h(v0Var);
            v0Var.c1(k0.t.r(j10, v0Var.f102608e), f10, graphicsLayer);
        }

        public final void n(@NotNull v0 v0Var, long j10, float f10, @Nullable ed.l<? super InterfaceC2008b2, L0> lVar) {
            h(v0Var);
            v0Var.d1(k0.t.r(j10, v0Var.f102608e), f10, lVar);
        }

        public final void o(@NotNull v0 v0Var, long j10, float f10, @NotNull GraphicsLayer graphicsLayer) {
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(v0Var);
                v0Var.c1(k0.t.r(j10, v0Var.f102608e), f10, graphicsLayer);
            } else {
                long jA = k0.u.a((g() - v0Var.f102604a) - ((int) (j10 >> 32)), (int) (j10 & ZipKt.f225990j));
                h(v0Var);
                v0Var.c1(k0.t.r(jA, v0Var.f102608e), f10, graphicsLayer);
            }
        }

        public final void p(@NotNull v0 v0Var, long j10, float f10, @Nullable ed.l<? super InterfaceC2008b2, L0> lVar) {
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(v0Var);
                v0Var.d1(k0.t.r(j10, v0Var.f102608e), f10, lVar);
            } else {
                long jA = k0.u.a((g() - v0Var.f102604a) - ((int) (j10 >> 32)), (int) (j10 & ZipKt.f225990j));
                h(v0Var);
                v0Var.d1(k0.t.r(jA, v0Var.f102608e), f10, lVar);
            }
        }

        public final void q(@NotNull v0 v0Var, int i10, int i11, float f10) {
            long jA = k0.u.a(i10, i11);
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(v0Var);
                v0Var.d1(k0.t.r(jA, v0Var.f102608e), f10, null);
            } else {
                long jA2 = k0.u.a((g() - v0Var.f102604a) - ((int) (jA >> 32)), (int) (jA & ZipKt.f225990j));
                h(v0Var);
                v0Var.d1(k0.t.r(jA2, v0Var.f102608e), f10, null);
            }
        }

        public final void s(@NotNull v0 v0Var, long j10, float f10) {
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(v0Var);
                v0Var.d1(k0.t.r(j10, v0Var.f102608e), f10, null);
            } else {
                long jA = k0.u.a((g() - v0Var.f102604a) - ((int) (j10 >> 32)), (int) (j10 & ZipKt.f225990j));
                h(v0Var);
                v0Var.d1(k0.t.r(jA, v0Var.f102608e), f10, null);
            }
        }

        public final void u(@NotNull v0 v0Var, int i10, int i11, float f10, @NotNull ed.l<? super InterfaceC2008b2, L0> lVar) {
            long jA = k0.u.a(i10, i11);
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(v0Var);
                v0Var.d1(k0.t.r(jA, v0Var.f102608e), f10, lVar);
            } else {
                long jA2 = k0.u.a((g() - v0Var.f102604a) - ((int) (jA >> 32)), (int) (jA & ZipKt.f225990j));
                h(v0Var);
                v0Var.d1(k0.t.r(jA2, v0Var.f102608e), f10, lVar);
            }
        }

        public final void v(@NotNull v0 v0Var, int i10, int i11, @NotNull GraphicsLayer graphicsLayer, float f10) {
            long jA = k0.u.a(i10, i11);
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(v0Var);
                v0Var.c1(k0.t.r(jA, v0Var.f102608e), f10, graphicsLayer);
            } else {
                long jA2 = k0.u.a((g() - v0Var.f102604a) - ((int) (jA >> 32)), (int) (jA & ZipKt.f225990j));
                h(v0Var);
                v0Var.c1(k0.t.r(jA2, v0Var.f102608e), f10, graphicsLayer);
            }
        }

        public final void y(@NotNull v0 v0Var, long j10, float f10, @NotNull ed.l<? super InterfaceC2008b2, L0> lVar) {
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(v0Var);
                v0Var.d1(k0.t.r(j10, v0Var.f102608e), f10, lVar);
            } else {
                long jA = k0.u.a((g() - v0Var.f102604a) - ((int) (j10 >> 32)), (int) (j10 & ZipKt.f225990j));
                h(v0Var);
                v0Var.d1(k0.t.r(jA, v0Var.f102608e), f10, lVar);
            }
        }

        public final void z(@NotNull v0 v0Var, long j10, @NotNull GraphicsLayer graphicsLayer, float f10) {
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(v0Var);
                v0Var.c1(k0.t.r(j10, v0Var.f102608e), f10, graphicsLayer);
            } else {
                long jA = k0.u.a((g() - v0Var.f102604a) - ((int) (j10 >> 32)), (int) (j10 & ZipKt.f225990j));
                h(v0Var);
                v0Var.c1(k0.t.r(jA, v0Var.f102608e), f10, graphicsLayer);
            }
        }
    }

    public v0() {
        k0.t.f214328b.getClass();
        this.f102608e = k0.t.f214329c;
    }

    public final long N0() {
        return this.f102608e;
    }

    public final int O0() {
        return this.f102605b;
    }

    public final long P0() {
        return this.f102606c;
    }

    public final long X0() {
        return this.f102607d;
    }

    public final int Y0() {
        return this.f102604a;
    }

    public final void b1() {
        this.f102604a = md.u.K((int) (this.f102606c >> 32), C4811b.q(this.f102607d), C4811b.o(this.f102607d));
        int iK = md.u.K((int) (this.f102606c & ZipKt.f225990j), C4811b.p(this.f102607d), C4811b.n(this.f102607d));
        this.f102605b = iK;
        int i10 = this.f102604a;
        long j10 = this.f102606c;
        this.f102608e = k0.u.a((i10 - ((int) (j10 >> 32))) / 2, (iK - ((int) (ZipKt.f225990j & j10))) / 2);
    }

    public void c1(long j10, float f10, @NotNull GraphicsLayer graphicsLayer) {
        d1(j10, f10, null);
    }

    public abstract void d1(long j10, float f10, @Nullable ed.l<? super InterfaceC2008b2, L0> lVar);

    @Override // androidx.compose.ui.layout.Y
    public /* synthetic */ Object g() {
        return null;
    }

    public final void g1(long j10) {
        if (k0.x.h(this.f102606c, j10)) {
            return;
        }
        this.f102606c = j10;
        b1();
    }

    @Override // androidx.compose.ui.layout.Y
    public int getMeasuredHeight() {
        return (int) (this.f102606c & ZipKt.f225990j);
    }

    @Override // androidx.compose.ui.layout.Y
    public int getMeasuredWidth() {
        return (int) (this.f102606c >> 32);
    }

    public final void h1(long j10) {
        if (C4811b.f(this.f102607d, j10)) {
            return;
        }
        this.f102607d = j10;
        b1();
    }
}
