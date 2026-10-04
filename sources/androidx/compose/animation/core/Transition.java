package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.K1;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.T1;
import androidx.compose.runtime.X1;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import ed.InterfaceC4376a;
import java.util.List;
import jd.C4806d;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,2185:1\n81#2:2186\n107#2,2:2187\n81#2:2189\n107#2,2:2190\n81#2:2198\n107#2,2:2199\n81#2:2201\n107#2,2:2202\n81#2:2222\n78#3:2192\n111#3,2:2193\n78#3:2195\n111#3,2:2196\n101#4,2:2204\n33#4,6:2206\n103#4:2212\n101#4,2:2213\n33#4,6:2215\n103#4:2221\n33#4,6:2223\n33#4,6:2229\n33#4,6:2235\n33#4,6:2241\n33#4,6:2247\n33#4,6:2253\n33#4,6:2259\n33#4,6:2265\n33#4,6:2271\n33#4,6:2298\n33#4,6:2304\n33#4,6:2310\n33#4,6:2316\n33#4,6:2322\n33#4,6:2328\n33#4,6:2334\n33#4,6:2340\n33#4,6:2346\n33#4,6:2352\n256#4,3:2358\n33#4,4:2361\n259#4,2:2365\n38#4:2367\n261#4:2368\n33#4,6:2369\n481#5:2277\n480#5,4:2278\n484#5,2:2285\n488#5:2291\n1225#6,3:2282\n1228#6,3:2288\n1225#6,6:2292\n480#7:2287\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n934#1:2186\n934#1:2187,2\n941#1:2189\n941#1:2190,2\n973#1:2198\n973#1:2199,2\n993#1:2201\n993#1:2202,2\n1020#1:2222\n950#1:2192\n950#1:2193,2\n970#1:2195\n970#1:2196,2\n1009#1:2204,2\n1009#1:2206,6\n1009#1:2212\n1010#1:2213,2\n1010#1:2215,6\n1010#1:2221\n1024#1:2223,6\n1027#1:2229,6\n1062#1:2235,6\n1071#1:2241,6\n1109#1:2247,6\n1147#1:2253,6\n1160#1:2259,6\n1203#1:2265,6\n1204#1:2271,6\n1255#1:2298,6\n1258#1:2304,6\n1274#1:2310,6\n1277#1:2316,6\n1287#1:2322,6\n1288#1:2328,6\n1295#1:2334,6\n1298#1:2340,6\n1310#1:2346,6\n1311#1:2352,6\n1315#1:2358,3\n1315#1:2361,4\n1315#1:2365,2\n1315#1:2367\n1315#1:2368\n1324#1:2369,6\n1220#1:2277\n1220#1:2278,4\n1220#1:2285,2\n1220#1:2291\n1220#1:2282,3\n1220#1:2288,3\n1221#1:2292,6\n1220#1:2287\n*E\n"})
@T1
public final class Transition<S> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f87899n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final F0<S> f87900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Transition<?> f87901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f87902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f87903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f87904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.J0 f87905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.J0 f87906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f87907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<Transition<S>.d<?, ?>> f87908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<Transition<?>> f87909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f87910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f87911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final X1 f87912m;

    @kotlin.jvm.internal.V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2185:1\n81#2:2186\n107#2,2:2187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n1669#1:2186\n1669#1:2187,2\n*E\n"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class a<T, V extends AbstractC1603p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final H0<T, V> f87913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f87914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final androidx.compose.runtime.L0 f87915c = M1.g(null, null, 2, null);

        /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$a$a, reason: collision with other inner class name */
        public final class C0176a<T, V extends AbstractC1603p> implements X1<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Transition<S>.d<T, V> f87917a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public ed.l<? super b<S>, ? extends U<T>> f87918b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public ed.l<? super S, ? extends T> f87919c;

            public C0176a(@NotNull Transition<S>.d<T, V> dVar, @NotNull ed.l<? super b<S>, ? extends U<T>> lVar, @NotNull ed.l<? super S, ? extends T> lVar2) {
                this.f87917a = dVar;
                this.f87918b = lVar;
                this.f87919c = lVar2;
            }

            @NotNull
            public final Transition<S>.d<T, V> d() {
                return this.f87917a;
            }

            @Override // androidx.compose.runtime.X1
            public T getValue() {
                l(Transition.this.p());
                return this.f87917a.f87945l.getValue();
            }

            @NotNull
            public final ed.l<S, T> h() {
                return this.f87919c;
            }

            @NotNull
            public final ed.l<b<S>, U<T>> i() {
                return this.f87918b;
            }

            public final void j(@NotNull ed.l<? super S, ? extends T> lVar) {
                this.f87919c = lVar;
            }

            public final void k(@NotNull ed.l<? super b<S>, ? extends U<T>> lVar) {
                this.f87918b = lVar;
            }

            public final void l(@NotNull b<S> bVar) {
                T tInvoke = this.f87919c.invoke(bVar.d());
                if (!Transition.this.x()) {
                    this.f87917a.H(tInvoke, this.f87918b.invoke(bVar));
                } else {
                    this.f87917a.F(this.f87919c.invoke(bVar.h()), tInvoke, this.f87918b.invoke(bVar));
                }
            }
        }

        public a(@NotNull H0<T, V> h02, @NotNull String str) {
            this.f87913a = h02;
            this.f87914b = str;
        }

        @NotNull
        public final X1<T> a(@NotNull ed.l<? super b<S>, ? extends U<T>> lVar, @NotNull ed.l<? super S, ? extends T> lVar2) {
            Transition<S>.C0176a<T, V>.a<T, V> c0176aB = b();
            if (c0176aB == null) {
                Transition<S> transition = Transition.this;
                Transition<S>.d<?, ?> dVar = transition.new d<>(lVar2.invoke(transition.f87900a.a()), C1593k.i(this.f87913a, lVar2.invoke(Transition.this.f87900a.a())), this.f87913a, this.f87914b);
                c0176aB = new C0176a<>(dVar, lVar, lVar2);
                Transition<S> transition2 = Transition.this;
                e(c0176aB);
                transition2.c(dVar);
            }
            Transition<S> transition3 = Transition.this;
            c0176aB.f87919c = lVar2;
            c0176aB.f87918b = lVar;
            c0176aB.l(transition3.p());
            return c0176aB;
        }

        @Nullable
        public final Transition<S>.C0176a<T, V>.a<T, V> b() {
            return (C0176a) this.f87915c.getValue();
        }

        @NotNull
        public final String c() {
            return this.f87914b;
        }

        @NotNull
        public final H0<T, V> d() {
            return this.f87913a;
        }

        public final void e(@Nullable Transition<S>.C0176a<T, V>.a<T, V> c0176a) {
            this.f87915c.setValue(c0176a);
        }

        public final void f() {
            Transition<S>.C0176a<T, V>.a<T, V> c0176aB = b();
            if (c0176aB != null) {
                Transition<S> transition = Transition.this;
                c0176aB.f87917a.F(c0176aB.f87919c.invoke(transition.p().h()), c0176aB.f87919c.invoke(transition.p().d()), c0176aB.f87918b.invoke(transition.p()));
            }
        }
    }

    public interface b<S> {

        public static final class a {
            @Deprecated
            public static <S> boolean a(@NotNull b<S> bVar, S s10, S s11) {
                return D0.a(bVar, s10, s11);
            }
        }

        boolean a(S s10, S s11);

        S d();

        S h();
    }

    public static final class c<S> implements b<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f87932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S f87933b;

        public c(S s10, S s11) {
            this.f87932a = s10;
            this.f87933b = s11;
        }

        @Override // androidx.compose.animation.core.Transition.b
        public /* synthetic */ boolean a(Object obj, Object obj2) {
            return D0.a(this, obj, obj2);
        }

        @Override // androidx.compose.animation.core.Transition.b
        public S d() {
            return this.f87933b;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.G.g(this.f87932a, bVar.h()) && kotlin.jvm.internal.G.g(this.f87933b, bVar.d());
        }

        @Override // androidx.compose.animation.core.Transition.b
        public S h() {
            return this.f87932a;
        }

        public int hashCode() {
            S s10 = this.f87932a;
            int iHashCode = (s10 != null ? s10.hashCode() : 0) * 31;
            S s11 = this.f87933b;
            return iHashCode + (s11 != null ? s11.hashCode() : 0);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,2185:1\n81#2:2186\n107#2,2:2187\n81#2:2189\n107#2,2:2190\n81#2:2192\n107#2,2:2193\n81#2:2195\n107#2,2:2196\n81#2:2201\n107#2,2:2202\n79#3:2198\n112#3,2:2199\n78#4:2204\n111#4,2:2205\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n1347#1:2186\n1347#1:2187,2\n1355#1:2189\n1355#1:2190,2\n1362#1:2192\n1362#1:2193,2\n1373#1:2195\n1373#1:2196,2\n1387#1:2201\n1387#1:2202,2\n1374#1:2198\n1374#1:2199,2\n1390#1:2204\n1390#1:2205,2\n*E\n"})
    @T1
    public final class d<T, V extends AbstractC1603p> implements X1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final H0<T, V> f87934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f87935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final androidx.compose.runtime.L0 f87936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final C1619x0<T> f87937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final androidx.compose.runtime.L0 f87938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final androidx.compose.runtime.L0 f87939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public SeekableTransitionState.b f87940g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public C0<T, V> f87941h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final androidx.compose.runtime.L0 f87942i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final androidx.compose.runtime.F0 f87943j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f87944k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final androidx.compose.runtime.L0 f87945l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public V f87946m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final androidx.compose.runtime.J0 f87947n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f87948o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final U<T> f87949p;

        public d(T t10, @NotNull V v10, @NotNull H0<T, V> h02, @NotNull String str) {
            T tInvoke;
            this.f87934a = h02;
            this.f87935b = str;
            androidx.compose.runtime.L0 l0G = M1.g(t10, null, 2, null);
            this.f87936c = l0G;
            C1619x0<T> c1619x0R = C1589i.r(0.0f, 0.0f, null, 7, null);
            this.f87937d = c1619x0R;
            this.f87938e = M1.g(c1619x0R, null, 2, null);
            this.f87939f = M1.g(new C0(i(), h02, t10, l0G.getValue(), v10), null, 2, null);
            this.f87942i = M1.g(Boolean.TRUE, null, 2, null);
            this.f87943j = new ParcelableSnapshotMutableFloatState(-1.0f);
            this.f87945l = M1.g(t10, null, 2, null);
            this.f87946m = v10;
            this.f87947n = new ParcelableSnapshotMutableLongState(h().c());
            Float f10 = b1.i().get(h02);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                V vInvoke = h02.a().invoke(t10);
                int iB = vInvoke.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    vInvoke.e(i10, fFloatValue);
                }
                tInvoke = this.f87934a.b().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.f87949p = C1589i.r(0.0f, 0.0f, tInvoke, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void E(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.f87945l.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.D(obj, z10);
        }

        public final void A(float f10) {
            this.f87943j.setFloatValue(f10);
        }

        public final void B(T t10) {
            this.f87936c.setValue(t10);
        }

        public void C(T t10) {
            this.f87945l.setValue(t10);
        }

        public final void D(T t10, boolean z10) {
            C0<T, V> c02 = this.f87941h;
            if (kotlin.jvm.internal.G.g(c02 != null ? c02.f87647c : null, this.f87936c.getValue())) {
                u(new C0<>(this.f87949p, this.f87934a, t10, t10, this.f87946m.c()));
                this.f87944k = true;
                w(h().c());
            } else {
                U<T> uI = (!z10 || this.f87948o || (i() instanceof C1619x0)) ? i() : this.f87949p;
                u(new C0<>(Transition.this.o() <= 0 ? uI : new C1621y0(uI, Transition.this.o()), this.f87934a, t10, this.f87936c.getValue(), this.f87946m));
                w(h().c());
                this.f87944k = false;
                Transition.this.y();
            }
        }

        public final void F(T t10, T t11, @NotNull U<T> u10) {
            B(t11);
            v(u10);
            if (kotlin.jvm.internal.G.g(h().f87648d, t10) && kotlin.jvm.internal.G.g(h().f87647c, t11)) {
                return;
            }
            E(this, t10, false, 2, null);
        }

        public final void G() {
            C0<T, V> c02;
            SeekableTransitionState.b bVar = this.f87940g;
            if (bVar == null || (c02 = this.f87941h) == null) {
                return;
            }
            long jM0 = C4806d.M0(bVar.f87830g * ((double) bVar.f87827d));
            T tE = c02.e(jM0);
            if (this.f87944k) {
                h().n(tE);
            }
            h().m(tE);
            w(h().c());
            if (this.f87943j.getFloatValue() == -2.0f || this.f87944k) {
                C(tE);
            } else {
                t(Transition.this.o());
            }
            if (jM0 < bVar.f87830g) {
                bVar.f87826c = false;
            } else {
                this.f87940g = null;
                this.f87941h = null;
            }
        }

        public final void H(T t10, @NotNull U<T> u10) {
            if (this.f87944k) {
                C0<T, V> c02 = this.f87941h;
                if (kotlin.jvm.internal.G.g(t10, c02 != null ? c02.f87647c : null)) {
                    return;
                }
            }
            if (kotlin.jvm.internal.G.g(this.f87936c.getValue(), t10) && this.f87943j.getFloatValue() == -1.0f) {
                return;
            }
            B(t10);
            v(u10);
            D(this.f87943j.getFloatValue() == -3.0f ? t10 : this.f87945l.getValue(), !p());
            x(this.f87943j.getFloatValue() == -3.0f);
            if (this.f87943j.getFloatValue() >= 0.0f) {
                C(h().e((long) (this.f87943j.getFloatValue() * h().c())));
            } else if (this.f87943j.getFloatValue() == -3.0f) {
                C(t10);
            }
            this.f87944k = false;
            A(-1.0f);
        }

        public final void d() {
            this.f87941h = null;
            this.f87940g = null;
            this.f87944k = false;
        }

        @Override // androidx.compose.runtime.X1
        public T getValue() {
            return this.f87945l.getValue();
        }

        @NotNull
        public final C0<T, V> h() {
            return (C0) this.f87939f.getValue();
        }

        @NotNull
        public final U<T> i() {
            return (U) this.f87938e.getValue();
        }

        public final long j() {
            return this.f87947n.getLongValue();
        }

        @Nullable
        public final SeekableTransitionState.b k() {
            return this.f87940g;
        }

        @NotNull
        public final String l() {
            return this.f87935b;
        }

        public final float m() {
            return this.f87943j.getFloatValue();
        }

        public final T n() {
            return this.f87936c.getValue();
        }

        @NotNull
        public final H0<T, V> o() {
            return this.f87934a;
        }

        public final boolean p() {
            return ((Boolean) this.f87942i.getValue()).booleanValue();
        }

        public final void q(long j10, boolean z10) {
            if (z10) {
                j10 = h().c();
            }
            C(h().e(j10));
            this.f87946m = (V) h().g(j10);
            C0<T, V> c0H = h();
            c0H.getClass();
            if (C1577c.a(c0H, j10)) {
                x(true);
            }
        }

        public final void r() {
            A(-2.0f);
        }

        public final void s(float f10) {
            if (f10 != -4.0f && f10 != -5.0f) {
                A(f10);
                return;
            }
            C0<T, V> c02 = this.f87941h;
            if (c02 != null) {
                h().m(c02.f87647c);
                this.f87940g = null;
                this.f87941h = null;
            }
            T t10 = f10 == -4.0f ? h().f87648d : h().f87647c;
            h().m(t10);
            h().n(t10);
            C(t10);
            w(h().c());
        }

        public final void t(long j10) {
            if (this.f87943j.getFloatValue() == -1.0f) {
                this.f87948o = true;
                if (kotlin.jvm.internal.G.g(h().f87647c, h().f87648d)) {
                    C(h().f87647c);
                } else {
                    C(h().e(j10));
                    this.f87946m = (V) h().g(j10);
                }
            }
        }

        @NotNull
        public String toString() {
            return "current value: " + this.f87945l.getValue() + ", target: " + this.f87936c.getValue() + ", spec: " + i();
        }

        public final void u(C0<T, V> c02) {
            this.f87939f.setValue(c02);
        }

        public final void v(U<T> u10) {
            this.f87938e.setValue(u10);
        }

        public final void w(long j10) {
            this.f87947n.setLongValue(j10);
        }

        public final void x(boolean z10) {
            this.f87942i.setValue(Boolean.valueOf(z10));
        }

        public final void y(@NotNull SeekableTransitionState.b bVar) {
            if (!kotlin.jvm.internal.G.g(h().f87647c, h().f87648d)) {
                this.f87941h = h();
                this.f87940g = bVar;
            }
            u(new C0<>(this.f87949p, this.f87934a, this.f87945l.getValue(), this.f87945l.getValue(), this.f87946m.c()));
            w(h().c());
            this.f87944k = true;
        }

        public final void z(@Nullable SeekableTransitionState.b bVar) {
            this.f87940g = bVar;
        }
    }

    public Transition(@NotNull F0<S> f02, @Nullable Transition<?> transition, @Nullable String str) {
        this.f87900a = f02;
        this.f87901b = transition;
        this.f87902c = str;
        this.f87903d = M1.g(f02.a(), null, 2, null);
        this.f87904e = M1.g(new c(f02.a(), f02.a()), null, 2, null);
        this.f87905f = new ParcelableSnapshotMutableLongState(0L);
        this.f87906g = new ParcelableSnapshotMutableLongState(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f87907h = M1.g(bool, null, 2, null);
        this.f87908i = new SnapshotStateList<>();
        this.f87909j = new SnapshotStateList<>();
        this.f87910k = M1.g(bool, null, 2, null);
        this.f87912m = K1.d(new InterfaceC4376a<Long>(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Transition<S> f87951d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f87951d = this;
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                return Long.valueOf(this.f87951d.f());
            }
        });
        f02.g(this);
    }

    @InterfaceC1582e0
    public static /* synthetic */ void k() {
    }

    public final void A(long j10, float f10) {
        if (this.f87906g.getLongValue() == Long.MIN_VALUE) {
            D(j10);
        }
        long longValue = j10 - this.f87906g.getLongValue();
        if (f10 != 0.0f) {
            longValue = C4806d.M0(longValue / ((double) f10));
        }
        N(longValue);
        B(longValue, f10 == 0.0f);
    }

    public final void B(long j10, boolean z10) {
        boolean z11 = true;
        if (this.f87906g.getLongValue() == Long.MIN_VALUE) {
            D(j10);
        } else if (!this.f87900a.c()) {
            this.f87900a.e(true);
        }
        S(false);
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
        int size = snapshotStateList.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Transition<S>.d<?, ?> dVar = snapshotStateList.get(i10);
            if (!dVar.p()) {
                dVar.q(j10, z10);
            }
            if (!dVar.p()) {
                z11 = false;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.f87909j;
        int size2 = snapshotStateList2.getSize();
        for (int i11 = 0; i11 < size2; i11++) {
            Transition<?> transition = snapshotStateList2.get(i11);
            if (!kotlin.jvm.internal.G.g(transition.f87903d.getValue(), transition.f87900a.a())) {
                transition.B(j10, z10);
            }
            if (!kotlin.jvm.internal.G.g(transition.f87903d.getValue(), transition.f87900a.a())) {
                z11 = false;
            }
        }
        if (z11) {
            C();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void C() {
        Q(Long.MIN_VALUE);
        F0<S> f02 = this.f87900a;
        if (f02 instanceof C1596l0) {
            f02.d(this.f87903d.getValue());
        }
        N(0L);
        this.f87900a.e(false);
        SnapshotStateList<Transition<?>> snapshotStateList = this.f87909j;
        int size = snapshotStateList.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).C();
        }
    }

    public final void D(long j10) {
        Q(j10);
        this.f87900a.e(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(@NotNull Transition<S>.a<?, ?> aVar) {
        X1 x12;
        Transition<S>.C0176a<?, ?>.a<?, V> c0176aB = aVar.b();
        if (c0176aB == 0 || (x12 = c0176aB.f87917a) == null) {
            return;
        }
        F(x12);
    }

    public final void F(@NotNull Transition<S>.d<?, ?> dVar) {
        this.f87908i.remove(dVar);
    }

    public final boolean G(@NotNull Transition<?> transition) {
        return this.f87909j.remove(transition);
    }

    public final void H(float f10) {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).s(f10);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.f87909j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).H(f10);
        }
    }

    public final void I() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).r();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.f87909j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).I();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @dd.j(name = "seek")
    public final void J(S s10, S s11, long j10) {
        Q(Long.MIN_VALUE);
        this.f87900a.e(false);
        if (!x() || !kotlin.jvm.internal.G.g(this.f87900a.a(), s10) || !kotlin.jvm.internal.G.g(this.f87903d.getValue(), s11)) {
            if (!kotlin.jvm.internal.G.g(this.f87900a.a(), s10)) {
                F0<S> f02 = this.f87900a;
                if (f02 instanceof C1596l0) {
                    f02.d(s10);
                }
            }
            R(s11);
            O(true);
            P(new c(s10, s11));
        }
        SnapshotStateList<Transition<?>> snapshotStateList = this.f87909j;
        int size = snapshotStateList.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Transition<?> transition = snapshotStateList.get(i10);
            kotlin.jvm.internal.G.n(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.x()) {
                transition.J(transition.f87900a.a(), transition.f87903d.getValue(), j10);
            }
        }
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList2 = this.f87908i;
        int size2 = snapshotStateList2.getSize();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).t(j10);
        }
        this.f87911l = j10;
    }

    public final void K(long j10) {
        if (this.f87906g.getLongValue() == Long.MIN_VALUE) {
            Q(j10);
        }
        N(j10);
        S(false);
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
        int size = snapshotStateList.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).t(j10);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.f87909j;
        int size2 = snapshotStateList2.getSize();
        for (int i11 = 0; i11 < size2; i11++) {
            Transition<?> transition = snapshotStateList2.get(i11);
            if (!kotlin.jvm.internal.G.g(transition.f87903d.getValue(), transition.f87900a.a())) {
                transition.K(j10);
            }
        }
    }

    public final void L(@NotNull SeekableTransitionState.b bVar) {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).y(bVar);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.f87909j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).L(bVar);
        }
    }

    public final void M(long j10) {
        this.f87911l = j10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void N(long j10) {
        if (this.f87901b == null) {
            T(j10);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void O(boolean z10) {
        this.f87910k.setValue(Boolean.valueOf(z10));
    }

    public final void P(b<S> bVar) {
        this.f87904e.setValue(bVar);
    }

    public final void Q(long j10) {
        this.f87906g.setLongValue(j10);
    }

    public final void R(S s10) {
        this.f87903d.setValue(s10);
    }

    public final void S(boolean z10) {
        this.f87907h.setValue(Boolean.valueOf(z10));
    }

    public final void T(long j10) {
        this.f87905f.setLongValue(j10);
    }

    public final void U() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).G();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.f87909j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).U();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void V(S s10) {
        if (kotlin.jvm.internal.G.g(this.f87903d.getValue(), s10)) {
            return;
        }
        P(new c(this.f87903d.getValue(), s10));
        if (!kotlin.jvm.internal.G.g(this.f87900a.a(), this.f87903d.getValue())) {
            this.f87900a.d(this.f87903d.getValue());
        }
        R(s10);
        if (!w()) {
            S(true);
        }
        I();
    }

    public final boolean c(@NotNull Transition<S>.d<?, ?> dVar) {
        return this.f87908i.add(dVar);
    }

    public final boolean d(@NotNull Transition<?> transition) {
        return this.f87909j.add(transition);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(final S r8, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r9, final int r10) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.Transition.e(java.lang.Object, androidx.compose.runtime.s, int):void");
    }

    public final long f() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, snapshotStateList.get(i10).f87947n.getLongValue());
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.f87909j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i11).f());
        }
        return jMax;
    }

    public final void g() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).d();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.f87909j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).g();
        }
    }

    @NotNull
    public final List<Transition<S>.d<?, ?>> h() {
        return this.f87908i;
    }

    public final S i() {
        return this.f87900a.a();
    }

    @InterfaceC1582e0
    public final boolean j() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (snapshotStateList.get(i10).f87940g != null) {
                return true;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.f87909j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (snapshotStateList2.get(i11).j()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String l() {
        return this.f87902c;
    }

    public final long m() {
        return this.f87911l;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public final Transition<?> n() {
        return this.f87901b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final long o() {
        Transition<?> transition = this.f87901b;
        return transition != null ? transition.o() : this.f87905f.getLongValue();
    }

    @NotNull
    public final b<S> p() {
        return (b) this.f87904e.getValue();
    }

    public final long q() {
        return this.f87906g.getLongValue();
    }

    public final S r() {
        return (S) this.f87903d.getValue();
    }

    public final long s() {
        return ((Number) this.f87912m.getValue()).longValue();
    }

    @NotNull
    public final List<Transition<?>> t() {
        return this.f87909j;
    }

    @NotNull
    public String toString() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + snapshotStateList.get(i10) + U6.j.f68738d;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.f87907h.getValue()).booleanValue();
    }

    public final long v() {
        return this.f87905f.getLongValue();
    }

    public final boolean w() {
        return this.f87906g.getLongValue() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean x() {
        return ((Boolean) this.f87910k.getValue()).booleanValue();
    }

    public final void y() {
        S(true);
        if (x()) {
            SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f87908i;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Transition<S>.d<?, ?> dVar = snapshotStateList.get(i10);
                jMax = Math.max(jMax, dVar.f87947n.getLongValue());
                dVar.t(this.f87911l);
            }
            S(false);
        }
    }

    public final void z() {
        C();
        this.f87900a.h();
    }

    public /* synthetic */ Transition(F0 f02, Transition transition, String str, int i10, C4969v c4969v) {
        this(f02, transition, (i10 & 4) != 0 ? null : str);
    }

    @InterfaceC4850b0
    public Transition(@NotNull F0<S> f02, @Nullable String str) {
        this(f02, null, str);
    }

    public Transition(F0 f02, String str, int i10, C4969v c4969v) {
        this(f02, null, (i10 & 2) != 0 ? null : str);
    }

    public Transition(S s10, @Nullable String str) {
        this(new C1596l0(s10), null, str);
    }

    public /* synthetic */ Transition(C1596l0 c1596l0, String str, int i10, C4969v c4969v) {
        this(c1596l0, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC4850b0
    public Transition(@NotNull C1596l0<S> c1596l0, @Nullable String str) {
        this(c1596l0, null, str);
        kotlin.jvm.internal.G.n(c1596l0, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }
}
