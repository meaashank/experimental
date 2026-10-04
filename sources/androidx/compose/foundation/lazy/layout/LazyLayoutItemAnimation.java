package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1595l;
import androidx.compose.animation.core.C1597m;
import androidx.compose.animation.core.U;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.M1;
import androidx.compose.ui.graphics.X1;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import ed.InterfaceC4376a;
import k0.t;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5092j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyLayoutItemAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n81#2:305\n107#2,2:306\n81#2:308\n107#2,2:309\n81#2:311\n107#2,2:312\n81#2:314\n107#2,2:315\n81#2:317\n107#2,2:318\n1#3:320\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation\n*L\n56#1:305\n56#1:306,2\n62#1:308\n62#1:309,2\n68#1:311\n68#1:312,2\n74#1:314\n74#1:315,2\n106#1:317\n106#1:318,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class LazyLayoutItemAnimation {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f91596t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.L f91598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final X1 f91599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<L0> f91600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public U<Float> f91601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public U<k0.t> f91602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public U<Float> f91603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f91605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f91606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f91607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f91608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f91609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f91610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public GraphicsLayer f91611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Animatable<k0.t, C1597m> f91612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, C1595l> f91613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f91614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f91615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final a f91595s = new a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f91597u = k0.u.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    public static final class a {
        public a() {
        }

        public final long a() {
            return LazyLayoutItemAnimation.f91597u;
        }

        public a(C4969v c4969v) {
        }
    }

    public LazyLayoutItemAnimation(@NotNull kotlinx.coroutines.L l10, @Nullable X1 x12, @NotNull InterfaceC4376a<L0> interfaceC4376a) {
        this.f91598a = l10;
        this.f91599b = x12;
        this.f91600c = interfaceC4376a;
        Boolean bool = Boolean.FALSE;
        this.f91605h = M1.g(bool, null, 2, null);
        this.f91606i = M1.g(bool, null, 2, null);
        this.f91607j = M1.g(bool, null, 2, null);
        this.f91608k = M1.g(bool, null, 2, null);
        long j10 = f91597u;
        this.f91609l = j10;
        t.a aVar = k0.t.f214328b;
        aVar.getClass();
        long j11 = k0.t.f214329c;
        this.f91610m = j11;
        this.f91611n = x12 != null ? x12.a() : null;
        aVar.getClass();
        String str = null;
        this.f91612o = new Animatable<>(new k0.t(j11), VectorConvertersKt.g(aVar), null, str, 12, null);
        this.f91613p = new Animatable<>(Float.valueOf(1.0f), VectorConvertersKt.f88012a, str, null, 12, null);
        aVar.getClass();
        this.f91614q = M1.g(new k0.t(j11), null, 2, null);
        this.f91615r = j10;
    }

    public final boolean A() {
        return this.f91604g;
    }

    public final void B() {
        X1 x12;
        if (z()) {
            J(false);
            C5092j.f(this.f91598a, null, null, new LazyLayoutItemAnimation$release$1(this, null), 3, null);
        }
        if (w()) {
            C(false);
            C5092j.f(this.f91598a, null, null, new LazyLayoutItemAnimation$release$2(this, null), 3, null);
        }
        if (y()) {
            E(false);
            C5092j.f(this.f91598a, null, null, new LazyLayoutItemAnimation$release$3(this, null), 3, null);
        }
        this.f91604g = false;
        k0.t.f214328b.getClass();
        K(k0.t.f214329c);
        this.f91609l = f91597u;
        GraphicsLayer graphicsLayer = this.f91611n;
        if (graphicsLayer != null && (x12 = this.f91599b) != null) {
            x12.b(graphicsLayer);
        }
        this.f91611n = null;
        this.f91601d = null;
        this.f91603f = null;
        this.f91602e = null;
    }

    public final void C(boolean z10) {
        this.f91606i.setValue(Boolean.valueOf(z10));
    }

    public final void D(boolean z10) {
        this.f91608k.setValue(Boolean.valueOf(z10));
    }

    public final void E(boolean z10) {
        this.f91607j.setValue(Boolean.valueOf(z10));
    }

    public final void F(@Nullable U<Float> u10) {
        this.f91601d = u10;
    }

    public final void G(@Nullable U<Float> u10) {
        this.f91603f = u10;
    }

    public final void H(long j10) {
        this.f91610m = j10;
    }

    public final void I(long j10) {
        this.f91615r = j10;
    }

    public final void J(boolean z10) {
        this.f91605h.setValue(Boolean.valueOf(z10));
    }

    public final void K(long j10) {
        this.f91614q.setValue(new k0.t(j10));
    }

    public final void L(@Nullable U<k0.t> u10) {
        this.f91602e = u10;
    }

    public final void M(long j10) {
        this.f91609l = j10;
    }

    public final void k() {
        GraphicsLayer graphicsLayer = this.f91611n;
        U<Float> u10 = this.f91601d;
        if (w() || u10 == null || graphicsLayer == null) {
            if (y()) {
                if (graphicsLayer != null) {
                    graphicsLayer.U(1.0f);
                }
                C5092j.f(this.f91598a, null, null, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3, null);
                return;
            }
            return;
        }
        C(true);
        boolean zY = y();
        boolean z10 = !zY;
        if (!zY) {
            graphicsLayer.U(0.0f);
        }
        C5092j.f(this.f91598a, null, null, new LazyLayoutItemAnimation$animateAppearance$2(z10, this, u10, graphicsLayer, null), 3, null);
    }

    public final void l() {
        GraphicsLayer graphicsLayer = this.f91611n;
        U<Float> u10 = this.f91603f;
        if (graphicsLayer == null || y() || u10 == null) {
            return;
        }
        E(true);
        C5092j.f(this.f91598a, null, null, new LazyLayoutItemAnimation$animateDisappearance$1(this, u10, graphicsLayer, null), 3, null);
    }

    public final void m(long j10, boolean z10) {
        U<k0.t> u10 = this.f91602e;
        if (u10 == null) {
            return;
        }
        long jQ = k0.t.q(t(), j10);
        K(jQ);
        J(true);
        this.f91604g = z10;
        C5092j.f(this.f91598a, null, null, new LazyLayoutItemAnimation$animatePlacementDelta$1(this, u10, jQ, null), 3, null);
    }

    public final void n() {
        if (z()) {
            C5092j.f(this.f91598a, null, null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3, null);
        }
    }

    @Nullable
    public final U<Float> o() {
        return this.f91601d;
    }

    @Nullable
    public final U<Float> p() {
        return this.f91603f;
    }

    public final long q() {
        return this.f91610m;
    }

    @Nullable
    public final GraphicsLayer r() {
        return this.f91611n;
    }

    public final long s() {
        return this.f91615r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long t() {
        return ((k0.t) this.f91614q.getValue()).f214330a;
    }

    @Nullable
    public final U<k0.t> u() {
        return this.f91602e;
    }

    public final long v() {
        return this.f91609l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        return ((Boolean) this.f91606i.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x() {
        return ((Boolean) this.f91608k.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        return ((Boolean) this.f91607j.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        return ((Boolean) this.f91605h.getValue()).booleanValue();
    }

    public /* synthetic */ LazyLayoutItemAnimation(kotlinx.coroutines.L l10, X1 x12, InterfaceC4376a interfaceC4376a, int i10, C4969v c4969v) {
        this(l10, (i10 & 2) != 0 ? null : x12, (i10 & 4) != 0 ? new InterfaceC4376a<L0>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                return L0.f217464a;
            }
        } : interfaceC4376a);
    }
}
