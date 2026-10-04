package androidx.compose.ui.graphics.drawscope;

import androidx.collection.C1550p;
import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.C0;
import androidx.compose.ui.graphics.C2113u2;
import androidx.compose.ui.graphics.InterfaceC2025e2;
import androidx.compose.ui.graphics.InterfaceC2105s2;
import androidx.compose.ui.graphics.InterfaceC2121w2;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.L0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.X;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.graphics.drawscope.h;
import androidx.compose.ui.graphics.g3;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import e.InterfaceC4348w;
import java.util.List;
import k0.C4813d;
import k0.InterfaceC4814e;
import kotlin.B0;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,791:1\n1#2:792\n*E\n"})
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C0251a f101067a = new C0251a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f101068b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC2105s2 f101069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC2105s2 f101070d;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.a$a, reason: collision with other inner class name */
    @InterfaceC4850b0
    public static final class C0251a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public InterfaceC4814e f101071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public LayoutDirection f101072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public C0 f101073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f101074d;

        public /* synthetic */ C0251a(InterfaceC4814e interfaceC4814e, LayoutDirection layoutDirection, C0 c02, long j10, C4969v c4969v) {
            this(interfaceC4814e, layoutDirection, c02, j10);
        }

        public static C0251a f(C0251a c0251a, InterfaceC4814e interfaceC4814e, LayoutDirection layoutDirection, C0 c02, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC4814e = c0251a.f101071a;
            }
            if ((i10 & 2) != 0) {
                layoutDirection = c0251a.f101072b;
            }
            if ((i10 & 4) != 0) {
                c02 = c0251a.f101073c;
            }
            if ((i10 & 8) != 0) {
                j10 = c0251a.f101074d;
            }
            long j11 = j10;
            c0251a.getClass();
            C0 c03 = c02;
            return new C0251a(interfaceC4814e, layoutDirection, c03, j11);
        }

        @NotNull
        public final InterfaceC4814e a() {
            return this.f101071a;
        }

        @NotNull
        public final LayoutDirection b() {
            return this.f101072b;
        }

        @NotNull
        public final C0 c() {
            return this.f101073c;
        }

        public final long d() {
            return this.f101074d;
        }

        @NotNull
        public final C0251a e(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection, @NotNull C0 c02, long j10) {
            return new C0251a(interfaceC4814e, layoutDirection, c02, j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0251a)) {
                return false;
            }
            C0251a c0251a = (C0251a) obj;
            return G.g(this.f101071a, c0251a.f101071a) && this.f101072b == c0251a.f101072b && G.g(this.f101073c, c0251a.f101073c) && P.n.k(this.f101074d, c0251a.f101074d);
        }

        @NotNull
        public final C0 g() {
            return this.f101073c;
        }

        @NotNull
        public final InterfaceC4814e h() {
            return this.f101071a;
        }

        public int hashCode() {
            return C1550p.a(this.f101074d) + ((this.f101073c.hashCode() + ((this.f101072b.hashCode() + (this.f101071a.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public final LayoutDirection i() {
            return this.f101072b;
        }

        public final long j() {
            return this.f101074d;
        }

        public final void k(@NotNull C0 c02) {
            this.f101073c = c02;
        }

        public final void l(@NotNull InterfaceC4814e interfaceC4814e) {
            this.f101071a = interfaceC4814e;
        }

        public final void m(@NotNull LayoutDirection layoutDirection) {
            this.f101072b = layoutDirection;
        }

        public final void n(long j10) {
            this.f101074d = j10;
        }

        @NotNull
        public String toString() {
            return "DrawParams(density=" + this.f101071a + ", layoutDirection=" + this.f101072b + ", canvas=" + this.f101073c + ", size=" + ((Object) P.n.x(this.f101074d)) + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public C0251a(InterfaceC4814e interfaceC4814e, LayoutDirection layoutDirection, C0 c02, long j10, int i10, C4969v c4969v) {
            interfaceC4814e = (i10 & 1) != 0 ? g.f101079a : interfaceC4814e;
            layoutDirection = (i10 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection;
            c02 = (i10 & 4) != 0 ? new o() : c02;
            if ((i10 & 8) != 0) {
                P.n.f65527b.getClass();
                j10 = P.n.f65528c;
            }
            this(interfaceC4814e, layoutDirection, c02, j10);
        }

        public C0251a(InterfaceC4814e interfaceC4814e, LayoutDirection layoutDirection, C0 c02, long j10) {
            this.f101071a = interfaceC4814e;
            this.f101072b = layoutDirection;
            this.f101073c = c02;
            this.f101074d = j10;
        }
    }

    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final m f101075a = new b.a(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public GraphicsLayer f101076b;

        public b() {
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        @NotNull
        public InterfaceC4814e a() {
            return a.this.f101067a.f101071a;
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        public void d(@NotNull LayoutDirection layoutDirection) {
            a.this.f101067a.f101072b = layoutDirection;
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        public long e() {
            return a.this.f101067a.f101074d;
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        public void f(@NotNull InterfaceC4814e interfaceC4814e) {
            a.this.f101067a.f101071a = interfaceC4814e;
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        @NotNull
        public C0 g() {
            return a.this.f101067a.f101073c;
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        @NotNull
        public LayoutDirection getLayoutDirection() {
            return a.this.f101067a.f101072b;
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        public void h(long j10) {
            a.this.f101067a.f101074d = j10;
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        @Nullable
        public GraphicsLayer i() {
            return this.f101076b;
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        @NotNull
        public m j() {
            return this.f101075a;
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        public void k(@Nullable GraphicsLayer graphicsLayer) {
            this.f101076b = graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.f
        public void l(@NotNull C0 c02) {
            a.this.f101067a.f101073c = c02;
        }
    }

    public static InterfaceC2105s2 D(a aVar, long j10, k kVar, float f10, L0 l02, int i10, int i11, int i12, Object obj) {
        int i13;
        if ((i12 & 32) != 0) {
            h.f101080P2.getClass();
            i13 = h.a.f101083c;
        } else {
            i13 = i11;
        }
        return aVar.g(j10, kVar, f10, l02, i10, i13);
    }

    public static InterfaceC2105s2 H(a aVar, AbstractC2131z0 abstractC2131z0, k kVar, float f10, L0 l02, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            h.f101080P2.getClass();
            i11 = h.a.f101083c;
        }
        return aVar.E(abstractC2131z0, kVar, f10, l02, i10, i11);
    }

    public static InterfaceC2105s2 M(a aVar, long j10, float f10, float f11, int i10, int i11, InterfaceC2121w2 interfaceC2121w2, float f12, L0 l02, int i12, int i13, int i14, Object obj) {
        int i15;
        if ((i14 & 512) != 0) {
            h.f101080P2.getClass();
            i15 = h.a.f101083c;
        } else {
            i15 = i13;
        }
        return aVar.K(j10, f10, f11, i10, i11, interfaceC2121w2, f12, l02, i12, i15);
    }

    public static InterfaceC2105s2 O(a aVar, AbstractC2131z0 abstractC2131z0, float f10, float f11, int i10, int i11, InterfaceC2121w2 interfaceC2121w2, float f12, L0 l02, int i12, int i13, int i14, Object obj) {
        int i15;
        if ((i14 & 512) != 0) {
            h.f101080P2.getClass();
            i15 = h.a.f101083c;
        } else {
            i15 = i13;
        }
        return aVar.N(abstractC2131z0, f10, f11, i10, i11, interfaceC2121w2, f12, l02, i12, i15);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void U() {
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ P.j A0(k0.l lVar) {
        return C4813d.h(this, lVar);
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ long C(long j10) {
        return C4813d.e(this, j10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public /* synthetic */ void C1(GraphicsLayer graphicsLayer, long j10, ed.l lVar) {
        DrawScope$CC.d(this, graphicsLayer, j10, lVar);
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void D0(@NotNull Path path, @NotNull AbstractC2131z0 abstractC2131z0, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.C(path, H(this, abstractC2131z0, kVar, f10, l02, i10, 0, 32, null));
    }

    public final InterfaceC2105s2 E(AbstractC2131z0 abstractC2131z0, k kVar, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, L0 l02, int i10, int i11) {
        InterfaceC2105s2 interfaceC2105s2D0 = d0(kVar);
        if (abstractC2131z0 != null) {
            abstractC2131z0.a(DrawScope$CC.c(this), interfaceC2105s2D0, f10);
        } else {
            if (interfaceC2105s2D0.C() != null) {
                interfaceC2105s2D0.L(null);
            }
            long jA = interfaceC2105s2D0.a();
            K0.f100733b.getClass();
            long j10 = K0.f100734c;
            if (!B0.p(jA, j10)) {
                interfaceC2105s2D0.y(j10);
            }
            if (interfaceC2105s2D0.f() != f10) {
                interfaceC2105s2D0.h(f10);
            }
        }
        if (!G.g(interfaceC2105s2D0.c(), l02)) {
            interfaceC2105s2D0.s(l02);
        }
        if (interfaceC2105s2D0.g() != i10) {
            interfaceC2105s2D0.b(i10);
        }
        if (interfaceC2105s2D0.M() == i11) {
            return interfaceC2105s2D0;
        }
        interfaceC2105s2D0.v(i11);
        return interfaceC2105s2D0;
    }

    @Override // k0.InterfaceC4814e
    public long G(int i10) {
        return s(V(i10));
    }

    @Override // k0.InterfaceC4814e
    public long I(float f10) {
        return s(W(f10));
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ int I1(float f10) {
        return C4813d.b(this, f10);
    }

    public final InterfaceC2105s2 K(long j10, float f10, float f11, int i10, int i11, InterfaceC2121w2 interfaceC2121w2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f12, L0 l02, int i12, int i13) {
        InterfaceC2105s2 interfaceC2105s2C0 = c0();
        long jX = X(j10, f12);
        if (!K0.y(interfaceC2105s2C0.a(), jX)) {
            interfaceC2105s2C0.y(jX);
        }
        if (interfaceC2105s2C0.C() != null) {
            interfaceC2105s2C0.L(null);
        }
        if (!G.g(interfaceC2105s2C0.c(), l02)) {
            interfaceC2105s2C0.s(l02);
        }
        if (interfaceC2105s2C0.g() != i12) {
            interfaceC2105s2C0.b(i12);
        }
        if (interfaceC2105s2C0.H() != f10) {
            interfaceC2105s2C0.G(f10);
        }
        if (interfaceC2105s2C0.A() != f11) {
            interfaceC2105s2C0.D(f11);
        }
        if (interfaceC2105s2C0.w() != i10) {
            interfaceC2105s2C0.u(i10);
        }
        if (interfaceC2105s2C0.z() != i11) {
            interfaceC2105s2C0.x(i11);
        }
        if (!G.g(interfaceC2105s2C0.K(), interfaceC2121w2)) {
            interfaceC2105s2C0.J(interfaceC2121w2);
        }
        if (interfaceC2105s2C0.M() == i13) {
            return interfaceC2105s2C0;
        }
        interfaceC2105s2C0.v(i13);
        return interfaceC2105s2C0;
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void K1(long j10, long j11, long j12, long j13, @NotNull k kVar, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.E(P.g.p(j11), P.g.r(j11), P.n.t(j12) + P.g.p(j11), P.n.m(j12) + P.g.r(j11), P.a.m(j13), P.a.o(j13), D(this, j10, kVar, f10, l02, i10, 0, 32, null));
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ float M1(long j10) {
        return C4813d.f(this, j10);
    }

    public final InterfaceC2105s2 N(AbstractC2131z0 abstractC2131z0, float f10, float f11, int i10, int i11, InterfaceC2121w2 interfaceC2121w2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f12, L0 l02, int i12, int i13) {
        InterfaceC2105s2 interfaceC2105s2C0 = c0();
        if (abstractC2131z0 != null) {
            abstractC2131z0.a(DrawScope$CC.c(this), interfaceC2105s2C0, f12);
        } else if (interfaceC2105s2C0.f() != f12) {
            interfaceC2105s2C0.h(f12);
        }
        if (!G.g(interfaceC2105s2C0.c(), l02)) {
            interfaceC2105s2C0.s(l02);
        }
        if (interfaceC2105s2C0.g() != i12) {
            interfaceC2105s2C0.b(i12);
        }
        if (interfaceC2105s2C0.H() != f10) {
            interfaceC2105s2C0.G(f10);
        }
        if (interfaceC2105s2C0.A() != f11) {
            interfaceC2105s2C0.D(f11);
        }
        if (interfaceC2105s2C0.w() != i10) {
            interfaceC2105s2C0.u(i10);
        }
        if (interfaceC2105s2C0.z() != i11) {
            interfaceC2105s2C0.x(i11);
        }
        if (!G.g(interfaceC2105s2C0.K(), interfaceC2121w2)) {
            interfaceC2105s2C0.J(interfaceC2121w2);
        }
        if (interfaceC2105s2C0.M() == i13) {
            return interfaceC2105s2C0;
        }
        interfaceC2105s2C0.v(i13);
        return interfaceC2105s2C0;
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void Q0(@NotNull InterfaceC2025e2 interfaceC2025e2, long j10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.q(interfaceC2025e2, j10, H(this, null, kVar, f10, l02, i10, 0, 32, null));
    }

    public final void R(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection, @NotNull C0 c02, long j10, @NotNull ed.l<? super h, kotlin.L0> lVar) {
        C0251a c0251a = this.f101067a;
        InterfaceC4814e interfaceC4814e2 = c0251a.f101071a;
        LayoutDirection layoutDirection2 = c0251a.f101072b;
        C0 c03 = c0251a.f101073c;
        long j11 = c0251a.f101074d;
        c0251a.f101071a = interfaceC4814e;
        c0251a.f101072b = layoutDirection;
        c0251a.f101073c = c02;
        c0251a.f101074d = j10;
        c02.A();
        lVar.invoke(this);
        c02.r();
        C0251a c0251a2 = this.f101067a;
        c0251a2.f101071a = interfaceC4814e2;
        c0251a2.f101072b = layoutDirection2;
        c0251a2.f101073c = c03;
        c0251a2.f101074d = j11;
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @InterfaceC4852c0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public void R1(InterfaceC2025e2 interfaceC2025e2, long j10, long j11, long j12, long j13, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, k kVar, L0 l02, int i10) {
        this.f101067a.f101073c.f(interfaceC2025e2, j10, j11, j12, j13, H(this, null, kVar, f10, l02, i10, 0, 32, null));
    }

    @NotNull
    public final C0251a S() {
        return this.f101067a;
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void S0(@NotNull AbstractC2131z0 abstractC2131z0, long j10, long j11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.o(P.g.p(j10), P.g.r(j10), P.n.t(j11) + P.g.p(j10), P.n.m(j11) + P.g.r(j10), H(this, abstractC2131z0, kVar, f10, l02, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void U0(long j10, long j11, long j12, float f10, int i10, @Nullable InterfaceC2121w2 interfaceC2121w2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @Nullable L0 l02, int i11) {
        C0 c02 = this.f101067a.f101073c;
        g3.f101118b.getClass();
        c02.w(j11, j12, M(this, j10, f10, 4.0f, i10, g3.f101119c, interfaceC2121w2, f11, l02, i11, 0, 512, null));
    }

    @Override // k0.InterfaceC4814e
    public float V(int i10) {
        return i10 / a();
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void V0(@NotNull AbstractC2131z0 abstractC2131z0, float f10, float f11, boolean z10, long j10, long j11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f12, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.k(P.g.p(j10), P.g.r(j10), P.n.t(j11) + P.g.p(j10), P.n.m(j11) + P.g.r(j10), f10, f11, z10, H(this, abstractC2131z0, kVar, f12, l02, i10, 0, 32, null));
    }

    @Override // k0.InterfaceC4814e
    public float W(float f10) {
        return f10 / a();
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void W0(@NotNull Path path, long j10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.C(path, D(this, j10, kVar, f10, l02, i10, 0, 32, null));
    }

    public final long X(long j10, float f10) {
        return f10 == 1.0f ? j10 : K0.w(j10, K0.A(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public /* synthetic */ long Y() {
        return DrawScope$CC.b(this);
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void Y1(long j10, long j11, long j12, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.o(P.g.p(j11), P.g.r(j11), P.n.t(j12) + P.g.p(j11), P.n.m(j12) + P.g.r(j11), D(this, j10, kVar, f10, l02, i10, 0, 32, null));
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ long Z(long j10) {
        return C4813d.i(this, j10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void Z0(long j10, float f10, long j11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.D(j11, f10, D(this, j10, kVar, f11, l02, i10, 0, 32, null));
    }

    @Override // k0.InterfaceC4814e
    public float a() {
        return this.f101067a.f101071a.a();
    }

    public final InterfaceC2105s2 a0() {
        InterfaceC2105s2 interfaceC2105s2 = this.f101069c;
        if (interfaceC2105s2 != null) {
            return interfaceC2105s2;
        }
        X x10 = new X();
        C2113u2.f101431b.getClass();
        x10.F(C2113u2.f101432c);
        this.f101069c = x10;
        return x10;
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void a1(long j10, long j11, long j12, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.p(P.g.p(j11), P.g.r(j11), P.n.t(j12) + P.g.p(j11), P.n.m(j12) + P.g.r(j11), D(this, j10, kVar, f10, l02, i10, 0, 32, null));
    }

    public final InterfaceC2105s2 c0() {
        InterfaceC2105s2 interfaceC2105s2 = this.f101070d;
        if (interfaceC2105s2 != null) {
            return interfaceC2105s2;
        }
        X x10 = new X();
        C2113u2.f101431b.getClass();
        x10.F(C2113u2.f101433d);
        this.f101070d = x10;
        return x10;
    }

    public final InterfaceC2105s2 d0(k kVar) {
        if (G.g(kVar, p.f101084a)) {
            return a0();
        }
        if (!(kVar instanceof q)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC2105s2 interfaceC2105s2C0 = c0();
        float fH = interfaceC2105s2C0.H();
        q qVar = (q) kVar;
        float f10 = qVar.f101090a;
        if (fH != f10) {
            interfaceC2105s2C0.G(f10);
        }
        int iW = interfaceC2105s2C0.w();
        int i10 = qVar.f101092c;
        if (iW != i10) {
            interfaceC2105s2C0.u(i10);
        }
        float fA = interfaceC2105s2C0.A();
        float f11 = qVar.f101091b;
        if (fA != f11) {
            interfaceC2105s2C0.D(f11);
        }
        int iZ = interfaceC2105s2C0.z();
        int i11 = qVar.f101093d;
        if (iZ != i11) {
            interfaceC2105s2C0.x(i11);
        }
        if (!G.g(interfaceC2105s2C0.K(), qVar.f101094e)) {
            interfaceC2105s2C0.J(qVar.f101094e);
        }
        return interfaceC2105s2C0;
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public /* synthetic */ long e() {
        return DrawScope$CC.c(this);
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void e1(long j10, float f10, float f11, boolean z10, long j11, long j12, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f12, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.k(P.g.p(j11), P.g.r(j11), P.n.t(j12) + P.g.p(j11), P.n.m(j12) + P.g.r(j11), f10, f11, z10, D(this, j10, kVar, f12, l02, i10, 0, 32, null));
    }

    public final InterfaceC2105s2 g(long j10, k kVar, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, L0 l02, int i10, int i11) {
        InterfaceC2105s2 interfaceC2105s2D0 = d0(kVar);
        long jX = X(j10, f10);
        if (!K0.y(interfaceC2105s2D0.a(), jX)) {
            interfaceC2105s2D0.y(jX);
        }
        if (interfaceC2105s2D0.C() != null) {
            interfaceC2105s2D0.L(null);
        }
        if (!G.g(interfaceC2105s2D0.c(), l02)) {
            interfaceC2105s2D0.s(l02);
        }
        if (interfaceC2105s2D0.g() != i10) {
            interfaceC2105s2D0.b(i10);
        }
        if (interfaceC2105s2D0.M() == i11) {
            return interfaceC2105s2D0;
        }
        interfaceC2105s2D0.v(i11);
        return interfaceC2105s2D0;
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.f101067a.f101072b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void h2(@NotNull AbstractC2131z0 abstractC2131z0, long j10, long j11, long j12, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.E(P.g.p(j10), P.g.r(j10), P.n.t(j11) + P.g.p(j10), P.n.m(j11) + P.g.r(j10), P.a.m(j12), P.a.o(j12), H(this, abstractC2131z0, kVar, f10, l02, i10, 0, 32, null));
    }

    @Override // k0.p
    public /* synthetic */ float k(long j10) {
        return k0.o.a(this, j10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void k2(@NotNull AbstractC2131z0 abstractC2131z0, long j10, long j11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.p(P.g.p(j10), P.g.r(j10), P.n.t(j11) + P.g.p(j10), P.n.m(j11) + P.g.r(j10), H(this, abstractC2131z0, kVar, f10, l02, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    @NotNull
    public f l1() {
        return this.f101068b;
    }

    @Override // k0.InterfaceC4814e
    public float l2(float f10) {
        return a() * f10;
    }

    @Override // k0.p
    public float m0() {
        return this.f101067a.f101071a.m0();
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void n2(@NotNull List<P.g> list, int i10, long j10, float f10, int i11, @Nullable InterfaceC2121w2 interfaceC2121w2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @Nullable L0 l02, int i12) {
        C0 c02 = this.f101067a.f101073c;
        g3.f101118b.getClass();
        c02.e(i10, list, M(this, j10, f10, 4.0f, i11, g3.f101119c, interfaceC2121w2, f11, l02, i12, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void o2(@NotNull AbstractC2131z0 abstractC2131z0, long j10, long j11, float f10, int i10, @Nullable InterfaceC2121w2 interfaceC2121w2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @Nullable L0 l02, int i11) {
        C0 c02 = this.f101067a.f101073c;
        g3.f101118b.getClass();
        c02.w(j10, j11, O(this, abstractC2131z0, f10, 4.0f, i10, g3.f101119c, interfaceC2121w2, f11, l02, i11, 0, 512, null));
    }

    @Override // k0.InterfaceC4814e
    public int p2(long j10) {
        return Math.round(M1(j10));
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void r2(@NotNull AbstractC2131z0 abstractC2131z0, float f10, long j10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @NotNull k kVar, @Nullable L0 l02, int i10) {
        this.f101067a.f101073c.D(j10, f10, H(this, abstractC2131z0, kVar, f11, l02, i10, 0, 32, null));
    }

    @Override // k0.p
    public /* synthetic */ long s(float f10) {
        return k0.o.b(this, f10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void s2(@NotNull InterfaceC2025e2 interfaceC2025e2, long j10, long j11, long j12, long j13, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10, int i11) {
        this.f101067a.f101073c.f(interfaceC2025e2, j10, j11, j12, j13, E(null, kVar, f10, l02, i10, i11));
    }

    @Override // androidx.compose.ui.graphics.drawscope.h
    public void v0(@NotNull List<P.g> list, int i10, @NotNull AbstractC2131z0 abstractC2131z0, float f10, int i11, @Nullable InterfaceC2121w2 interfaceC2121w2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @Nullable L0 l02, int i12) {
        C0 c02 = this.f101067a.f101073c;
        g3.f101118b.getClass();
        c02.e(i10, list, O(this, abstractC2131z0, f10, 4.0f, i11, g3.f101119c, interfaceC2121w2, f11, l02, i12, 0, 512, null));
    }
}
