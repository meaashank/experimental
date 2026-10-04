package androidx.compose.animation;

import androidx.compose.animation.P;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.InterfaceC1934n1;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.ui.graphics.J0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.C2057d;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.InterfaceC2188x;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,254:1\n79#2:255\n112#2,2:256\n81#3:258\n107#3,2:259\n81#3:261\n107#3,2:262\n81#3:264\n107#3,2:265\n81#3:267\n107#3,2:268\n81#3:270\n107#3,2:271\n81#3:273\n107#3,2:274\n81#3:276\n107#3,2:277\n81#3:315\n107#3,2:316\n70#4,4:279\n244#5,5:283\n272#5,9:288\n128#5,7:297\n282#5,4:304\n128#5,7:308\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n*L\n180#1:255\n180#1:256,2\n182#1:258\n182#1:259,2\n183#1:261\n183#1:262,2\n184#1:264\n184#1:265,2\n185#1:267\n185#1:268,2\n186#1:270\n186#1:271,2\n187#1:273\n187#1:274,2\n188#1:276\n188#1:277,2\n230#1:315\n230#1:316,2\n199#1:279,4\n201#1:283,5\n201#1:288,9\n202#1:297,7\n201#1:304,4\n206#1:308,7\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class SharedElementInternalState implements F, InterfaceC1934n1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f87419m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final F0 f87420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final L0 f87421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final L0 f87422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final L0 f87423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final L0 f87424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final L0 f87425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final L0 f87426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final L0 f87427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Path f87428i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public SharedElementInternalState f87430k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public InterfaceC4376a<? extends InterfaceC2188x> f87429j = new InterfaceC4376a() { // from class: androidx.compose.animation.SharedElementInternalState$lookaheadCoords$1
        @Nullable
        public final Void g() {
            return null;
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final L0 f87431l = M1.g(null, null, 2, null);

    public SharedElementInternalState(@NotNull SharedElement sharedElement, @NotNull BoundsAnimation boundsAnimation, @NotNull P.b bVar, boolean z10, @NotNull P.a aVar, boolean z11, @NotNull P.d dVar, float f10) {
        this.f87420a = ActualAndroid_androidKt.b(f10);
        this.f87421b = M1.g(Boolean.valueOf(z11), null, 2, null);
        this.f87422c = M1.g(sharedElement, null, 2, null);
        this.f87423d = M1.g(boundsAnimation, null, 2, null);
        this.f87424e = M1.g(bVar, null, 2, null);
        this.f87425f = M1.g(Boolean.valueOf(z10), null, 2, null);
        this.f87426g = M1.g(aVar, null, 2, null);
        this.f87427h = M1.g(dVar, null, 2, null);
    }

    public final void A(@NotNull P.a aVar) {
        this.f87426g.setValue(aVar);
    }

    public void B(@Nullable SharedElementInternalState sharedElementInternalState) {
        this.f87430k = sharedElementInternalState;
    }

    public final void C(@NotNull P.b bVar) {
        this.f87424e.setValue(bVar);
    }

    public final void D(boolean z10) {
        this.f87421b.setValue(Boolean.valueOf(z10));
    }

    public final void E(boolean z10) {
        this.f87425f.setValue(Boolean.valueOf(z10));
    }

    public final void F(@NotNull SharedElement sharedElement) {
        this.f87422c.setValue(sharedElement);
    }

    public final void G(@NotNull P.d dVar) {
        this.f87427h.setValue(dVar);
    }

    public void H(float f10) {
        this.f87420a.setFloatValue(f10);
    }

    @Override // androidx.compose.animation.F
    @Nullable
    public SharedElementInternalState a() {
        return this.f87430k;
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void b() {
        q().f87409b.m(this);
        q().t();
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void c() {
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void d() {
        q().f87409b.n(this);
        q().t();
    }

    @Override // androidx.compose.animation.F
    public float e() {
        return this.f87420a.getFloatValue();
    }

    @Override // androidx.compose.animation.F
    public void f(@NotNull androidx.compose.ui.graphics.drawscope.h hVar) {
        GraphicsLayer graphicsLayerJ = j();
        if (graphicsLayerJ != null && s()) {
            if (q().c() == null) {
                throw new IllegalArgumentException("Error: current bounds not set yet.");
            }
            P.j jVarC = q().c();
            kotlin.L0 l02 = null;
            P.g gVar = jVarC != null ? new P.g(jVarC.E()) : null;
            kotlin.jvm.internal.G.m(gVar);
            long j10 = gVar.f65507a;
            float fP = P.g.p(j10);
            float fR = P.g.r(j10);
            Path path = this.f87428i;
            if (path != null) {
                J0.f100729b.getClass();
                int i10 = J0.f100731d;
                androidx.compose.ui.graphics.drawscope.f fVarL1 = hVar.l1();
                long jE = fVarL1.e();
                fVarL1.g().A();
                try {
                    fVarL1.j().d(path, i10);
                    hVar.l1().j().c(fP, fR);
                    try {
                        C2057d.a(hVar, graphicsLayerJ);
                        L.a(fVarL1, jE);
                        l02 = kotlin.L0.f217464a;
                    } finally {
                    }
                } catch (Throwable th) {
                    L.a(fVarL1, jE);
                    throw th;
                }
            }
            if (l02 == null) {
                hVar.l1().j().c(fP, fR);
                try {
                    C2057d.a(hVar, graphicsLayerJ);
                } finally {
                }
            }
        }
    }

    public final long g() {
        InterfaceC2188x interfaceC2188xInvoke = this.f87429j.invoke();
        if (interfaceC2188xInvoke == null) {
            throw new IllegalArgumentException("Error: lookahead coordinates is null.");
        }
        InterfaceC2188x interfaceC2188xH = q().f87409b.h();
        P.g.f65503b.getClass();
        return interfaceC2188xH.k0(interfaceC2188xInvoke, P.g.f65504c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final BoundsAnimation h() {
        return (BoundsAnimation) this.f87423d.getValue();
    }

    @Nullable
    public final Path i() {
        return this.f87428i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final GraphicsLayer j() {
        return (GraphicsLayer) this.f87431l.getValue();
    }

    @NotNull
    public final InterfaceC4376a<InterfaceC2188x> k() {
        return this.f87429j;
    }

    public final long l() {
        InterfaceC2188x interfaceC2188xInvoke = this.f87429j.invoke();
        if (interfaceC2188xInvoke != null) {
            return k0.y.h(interfaceC2188xInvoke.b());
        }
        throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + q().f87408a + '.').toString());
    }

    @NotNull
    public final P.a m() {
        return (P.a) this.f87426g.getValue();
    }

    @NotNull
    public final P.b n() {
        return (P.b) this.f87424e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o() {
        return ((Boolean) this.f87421b.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return ((Boolean) this.f87425f.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final SharedElement q() {
        return (SharedElement) this.f87422c.getValue();
    }

    public final boolean r() {
        return kotlin.jvm.internal.G.g(q().f87413f, this) || !p();
    }

    public final boolean s() {
        return r() && q().d() && o();
    }

    public final boolean t() {
        if (q().d()) {
            return !s() && r();
        }
        return true;
    }

    public final boolean u() {
        return h().f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final P.d v() {
        return (P.d) this.f87427h.getValue();
    }

    public final void w(@NotNull BoundsAnimation boundsAnimation) {
        this.f87423d.setValue(boundsAnimation);
    }

    public final void x(@Nullable Path path) {
        this.f87428i = path;
    }

    public final void y(@Nullable GraphicsLayer graphicsLayer) {
        this.f87431l.setValue(graphicsLayer);
    }

    public final void z(@NotNull InterfaceC4376a<? extends InterfaceC2188x> interfaceC4376a) {
        this.f87429j = interfaceC4376a;
    }
}
