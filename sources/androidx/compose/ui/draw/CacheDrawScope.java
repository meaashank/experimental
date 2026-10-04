package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.C0;
import androidx.compose.ui.graphics.X1;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import ed.InterfaceC4376a;
import k0.C4813d;
import k0.InterfaceC4814e;
import k0.y;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class CacheDrawScope implements InterfaceC4814e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100478e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public c f100479a = n.f100521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public l f100480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.graphics.drawscope.d f100481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<? extends X1> f100482d;

    public static void R(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, InterfaceC4814e interfaceC4814e, LayoutDirection layoutDirection, long j10, ed.l lVar, int i10, Object obj) {
        InterfaceC4814e interfaceC4814e2 = interfaceC4814e;
        if ((i10 & 1) != 0) {
            interfaceC4814e2 = cacheDrawScope;
        }
        if ((i10 & 2) != 0) {
            layoutDirection = cacheDrawScope.f100479a.getLayoutDirection();
        }
        if ((i10 & 4) != 0) {
            j10 = y.g(cacheDrawScope.f100479a.e());
        }
        cacheDrawScope.O(graphicsLayer, interfaceC4814e2, layoutDirection, j10, lVar);
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ P.j A0(k0.l lVar) {
        return C4813d.h(this, lVar);
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ long C(long j10) {
        return C4813d.e(this, j10);
    }

    @Nullable
    public final androidx.compose.ui.graphics.drawscope.d D() {
        return this.f100481c;
    }

    @Nullable
    public final l E() {
        return this.f100480b;
    }

    @Override // k0.InterfaceC4814e
    public long G(int i10) {
        return s(V(i10));
    }

    @Nullable
    public final InterfaceC4376a<X1> H() {
        return this.f100482d;
    }

    @Override // k0.InterfaceC4814e
    public long I(float f10) {
        return s(W(f10));
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ int I1(float f10) {
        return C4813d.b(this, f10);
    }

    @NotNull
    public final GraphicsLayer K() {
        InterfaceC4376a<? extends X1> interfaceC4376a = this.f100482d;
        G.m(interfaceC4376a);
        return interfaceC4376a.invoke().a();
    }

    @NotNull
    public final l M(@NotNull final ed.l<? super androidx.compose.ui.graphics.drawscope.h, L0> lVar) {
        return N(new ed.l<androidx.compose.ui.graphics.drawscope.d, L0>() { // from class: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void e(@NotNull androidx.compose.ui.graphics.drawscope.d dVar) {
                lVar.invoke(dVar);
                dVar.s1();
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                e(dVar);
                return L0.f217464a;
            }
        });
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ float M1(long j10) {
        return C4813d.f(this, j10);
    }

    @NotNull
    public final l N(@NotNull ed.l<? super androidx.compose.ui.graphics.drawscope.d, L0> lVar) {
        l lVar2 = new l(lVar);
        this.f100480b = lVar2;
        return lVar2;
    }

    public final void O(@NotNull GraphicsLayer graphicsLayer, @NotNull final InterfaceC4814e interfaceC4814e, @NotNull final LayoutDirection layoutDirection, final long j10, @NotNull final ed.l<? super androidx.compose.ui.graphics.drawscope.d, L0> lVar) {
        graphicsLayer.O(interfaceC4814e, layoutDirection, j10, new ed.l<androidx.compose.ui.graphics.drawscope.h, L0>() { // from class: androidx.compose.ui.draw.CacheDrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void e(@NotNull androidx.compose.ui.graphics.drawscope.h hVar) {
                androidx.compose.ui.graphics.drawscope.d dVar = this.f100484d.f100481c;
                G.m(dVar);
                InterfaceC4814e interfaceC4814e2 = interfaceC4814e;
                LayoutDirection layoutDirection2 = layoutDirection;
                long j11 = j10;
                ed.l<androidx.compose.ui.graphics.drawscope.d, L0> lVar2 = lVar;
                C0 c0G = hVar.l1().g();
                long jA = P.o.a((int) (j11 >> 32), (int) (j11 & ZipKt.f225990j));
                InterfaceC4814e interfaceC4814eA = dVar.l1().a();
                LayoutDirection layoutDirection3 = dVar.l1().getLayoutDirection();
                C0 c0G2 = dVar.l1().g();
                long jE = dVar.l1().e();
                GraphicsLayer graphicsLayerI = dVar.l1().i();
                androidx.compose.ui.graphics.drawscope.f fVarL1 = dVar.l1();
                fVarL1.f(interfaceC4814e2);
                fVarL1.d(layoutDirection2);
                fVarL1.l(c0G);
                fVarL1.h(jA);
                fVarL1.k(null);
                c0G.A();
                try {
                    lVar2.invoke(dVar);
                } finally {
                    c0G.r();
                    androidx.compose.ui.graphics.drawscope.f fVarL12 = dVar.l1();
                    fVarL12.f(interfaceC4814eA);
                    fVarL12.d(layoutDirection3);
                    fVarL12.l(c0G2);
                    fVarL12.h(jE);
                    fVarL12.k(graphicsLayerI);
                }
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.graphics.drawscope.h hVar) {
                e(hVar);
                return L0.f217464a;
            }
        });
    }

    public final void S(@NotNull c cVar) {
        this.f100479a = cVar;
    }

    public final void U(@Nullable androidx.compose.ui.graphics.drawscope.d dVar) {
        this.f100481c = dVar;
    }

    @Override // k0.InterfaceC4814e
    public float V(int i10) {
        return i10 / a();
    }

    @Override // k0.InterfaceC4814e
    public float W(float f10) {
        return f10 / a();
    }

    public final void X(@Nullable l lVar) {
        this.f100480b = lVar;
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ long Z(long j10) {
        return C4813d.i(this, j10);
    }

    @Override // k0.InterfaceC4814e
    public float a() {
        return this.f100479a.a().a();
    }

    public final void a0(@Nullable InterfaceC4376a<? extends X1> interfaceC4376a) {
        this.f100482d = interfaceC4376a;
    }

    public final long e() {
        return this.f100479a.e();
    }

    @NotNull
    public final c g() {
        return this.f100479a;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.f100479a.getLayoutDirection();
    }

    @Override // k0.p
    public /* synthetic */ float k(long j10) {
        return k0.o.a(this, j10);
    }

    @Override // k0.InterfaceC4814e
    public float l2(float f10) {
        return a() * f10;
    }

    @Override // k0.p
    public float m0() {
        return this.f100479a.a().m0();
    }

    @Override // k0.InterfaceC4814e
    public int p2(long j10) {
        return Math.round(M1(j10));
    }

    @Override // k0.p
    public /* synthetic */ long s(float f10) {
        return k0.o.b(this, f10);
    }
}
