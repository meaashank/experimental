package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.P;
import androidx.compose.animation.core.C1589i;
import androidx.compose.animation.core.C1619x0;
import androidx.compose.animation.core.b1;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.InterfaceC2008b2;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Z1;
import androidx.compose.ui.layout.InterfaceC2171i;
import androidx.compose.ui.unit.LayoutDirection;
import ed.InterfaceC4376a;
import k0.InterfaceC4814e;
import kotlin.L0;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1337:1\n863#2:1338\n863#2:1340\n1#3:1339\n1#3:1341\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n*L\n1302#1:1338\n1303#1:1340\n1302#1:1339\n1303#1:1341\n*E\n"})
public final class SharedTransitionScopeKt {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f87476f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4376a<Boolean> f87471a = new InterfaceC4376a<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$DefaultEnabled$1
        @NotNull
        public final Boolean g() {
            return Boolean.TRUE;
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C1619x0<P.j> f87472b = C1589i.r(0.0f, 400.0f, b1.h(P.j.f65508e), 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final P.a f87473c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ed.p<LayoutDirection, InterfaceC4814e, Path> f87474d = new ed.p() { // from class: androidx.compose.animation.SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1
        @Nullable
        public final Void e(@NotNull LayoutDirection layoutDirection, @NotNull InterfaceC4814e interfaceC4814e) {
            return null;
        }

        @Override // ed.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return null;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final InterfaceC1634n f87475e = new Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final kotlin.G f87477g = kotlin.I.c(LazyThreadSafetyMode.NONE, new InterfaceC4376a<SnapshotStateObserver>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionObserver$2
        @Override // ed.InterfaceC4376a
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new ed.l<InterfaceC4376a<? extends L0>, L0>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionObserver$2.1
                public final void e(@NotNull InterfaceC4376a<L0> interfaceC4376a) {
                    interfaceC4376a.invoke();
                }

                @Override // ed.l
                public L0 invoke(InterfaceC4376a<? extends L0> interfaceC4376a) {
                    interfaceC4376a.invoke();
                    return L0.f217464a;
                }
            });
            snapshotStateObserver.v();
            return snapshotStateObserver;
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final MutableScatterMap<InterfaceC2171i, MutableScatterMap<androidx.compose.ui.c, N>> f87478h = new MutableScatterMap<>(0, 1, null);

    public static final class a implements P.a {
        @Override // androidx.compose.animation.P.a
        @Nullable
        public Path a(@NotNull P.d dVar, @NotNull P.j jVar, @NotNull LayoutDirection layoutDirection, @NotNull InterfaceC4814e interfaceC4814e) {
            P.d dVarE = dVar.e();
            if (dVarE != null) {
                return dVarE.d().f87428i;
            }
            return null;
        }
    }

    public static androidx.compose.animation.core.U a(P.j jVar, P.j jVar2) {
        return f87472b;
    }

    public static final androidx.compose.animation.core.U b(P.j jVar, P.j jVar2) {
        return f87472b;
    }

    @InterfaceC1645z
    public static final N c(InterfaceC2171i interfaceC2171i, androidx.compose.ui.c cVar) {
        if (!r(interfaceC2171i) || !q(cVar)) {
            return new N(interfaceC2171i, cVar);
        }
        MutableScatterMap<InterfaceC2171i, MutableScatterMap<androidx.compose.ui.c, N>> mutableScatterMap = f87478h;
        MutableScatterMap<androidx.compose.ui.c, N> mutableScatterMapP = mutableScatterMap.p(interfaceC2171i);
        if (mutableScatterMapP == null) {
            mutableScatterMapP = new MutableScatterMap<>(0, 1, null);
            mutableScatterMap.q0(interfaceC2171i, mutableScatterMapP);
        }
        MutableScatterMap<androidx.compose.ui.c, N> mutableScatterMap2 = mutableScatterMapP;
        N nP = mutableScatterMap2.p(cVar);
        if (nP == null) {
            nP = new N(interfaceC2171i, cVar);
            mutableScatterMap2.q0(cVar, nP);
        }
        return nP;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    @androidx.compose.animation.InterfaceC1645z
    @androidx.compose.runtime.InterfaceC1920j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(@org.jetbrains.annotations.Nullable final androidx.compose.ui.p r5, @org.jetbrains.annotations.NotNull final ed.q<? super androidx.compose.animation.P, ? super androidx.compose.runtime.InterfaceC1946s, ? super java.lang.Integer, kotlin.L0> r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r7, final int r8, final int r9) {
        /*
            r0 = 2043053727(0x79c6869f, float:1.2885065E35)
            androidx.compose.runtime.s r7 = r7.L(r0)
            r1 = r9 & 1
            if (r1 == 0) goto Le
            r2 = r8 | 6
            goto L21
        Le:
            r2 = r8 & 6
            if (r2 != 0) goto L20
            r2 = r7
            androidx.compose.runtime.ComposerImpl r2 = (androidx.compose.runtime.ComposerImpl) r2
            boolean r2 = r2.x(r5)
            if (r2 == 0) goto L1d
            r2 = 4
            goto L1e
        L1d:
            r2 = 2
        L1e:
            r2 = r2 | r8
            goto L21
        L20:
            r2 = r8
        L21:
            r3 = r9 & 2
            if (r3 == 0) goto L28
            r2 = r2 | 48
            goto L3b
        L28:
            r3 = r8 & 48
            if (r3 != 0) goto L3b
            r3 = r7
            androidx.compose.runtime.ComposerImpl r3 = (androidx.compose.runtime.ComposerImpl) r3
            boolean r3 = r3.c0(r6)
            if (r3 == 0) goto L38
            r3 = 32
            goto L3a
        L38:
            r3 = 16
        L3a:
            r2 = r2 | r3
        L3b:
            r3 = r2 & 19
            r4 = 18
            if (r3 != r4) goto L4f
            r3 = r7
            androidx.compose.runtime.ComposerImpl r3 = (androidx.compose.runtime.ComposerImpl) r3
            boolean r4 = r3.c()
            if (r4 != 0) goto L4b
            goto L4f
        L4b:
            r3.o()
            goto L7b
        L4f:
            if (r1 == 0) goto L53
            androidx.compose.ui.p$a r5 = androidx.compose.ui.p.f103112M2
        L53:
            boolean r1 = androidx.compose.runtime.C1968u.c0()
            if (r1 == 0) goto L5f
            r1 = -1
            java.lang.String r3 = "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:111)"
            androidx.compose.runtime.C1968u.p0(r0, r2, r1, r3)
        L5f:
            androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$1 r0 = new androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$1
            r0.<init>()
            r1 = 54
            r2 = -130587847(0xfffffffff8376339, float:-1.4878169E34)
            r3 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.b.e(r2, r3, r0, r7, r1)
            r1 = 6
            e(r0, r7, r1)
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto L7b
            androidx.compose.runtime.C1968u.o0()
        L7b:
            androidx.compose.runtime.ComposerImpl r7 = (androidx.compose.runtime.ComposerImpl) r7
            androidx.compose.runtime.s1 r7 = r7.N()
            if (r7 == 0) goto L8c
            androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$2 r0 = new androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$2
            r0.<init>()
            androidx.compose.runtime.RecomposeScopeImpl r7 = (androidx.compose.runtime.RecomposeScopeImpl) r7
            r7.f99214d = r0
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SharedTransitionScopeKt.d(androidx.compose.ui.p, ed.q, androidx.compose.runtime.s, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @androidx.compose.animation.InterfaceC1645z
    @androidx.compose.runtime.InterfaceC1920j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(@org.jetbrains.annotations.NotNull final ed.r<? super androidx.compose.animation.P, ? super androidx.compose.ui.p, ? super androidx.compose.runtime.InterfaceC1946s, ? super java.lang.Integer, kotlin.L0> r4, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r5, final int r6) {
        /*
            r0 = -2093217917(0xffffffff833c0783, float:-5.5256858E-37)
            androidx.compose.runtime.s r5 = r5.L(r0)
            r1 = r6 & 6
            r2 = 2
            if (r1 != 0) goto L1a
            r1 = r5
            androidx.compose.runtime.ComposerImpl r1 = (androidx.compose.runtime.ComposerImpl) r1
            boolean r1 = r1.c0(r4)
            if (r1 == 0) goto L17
            r1 = 4
            goto L18
        L17:
            r1 = r2
        L18:
            r1 = r1 | r6
            goto L1b
        L1a:
            r1 = r6
        L1b:
            r3 = r1 & 3
            if (r3 != r2) goto L2d
            r2 = r5
            androidx.compose.runtime.ComposerImpl r2 = (androidx.compose.runtime.ComposerImpl) r2
            boolean r3 = r2.c()
            if (r3 != 0) goto L29
            goto L2d
        L29:
            r2.o()
            goto L55
        L2d:
            boolean r2 = androidx.compose.runtime.C1968u.c0()
            if (r2 == 0) goto L39
            r2 = -1
            java.lang.String r3 = "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:138)"
            androidx.compose.runtime.C1968u.p0(r0, r1, r2, r3)
        L39:
            androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1 r0 = new androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1
            r0.<init>()
            r1 = 54
            r2 = -863967934(0xffffffffcc80e542, float:-6.757838E7)
            r3 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.b.e(r2, r3, r0, r5, r1)
            r1 = 6
            androidx.compose.ui.layout.LookaheadScopeKt.a(r0, r5, r1)
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto L55
            androidx.compose.runtime.C1968u.o0()
        L55:
            androidx.compose.runtime.ComposerImpl r5 = (androidx.compose.runtime.ComposerImpl) r5
            androidx.compose.runtime.s1 r5 = r5.N()
            if (r5 == 0) goto L66
            androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$2 r0 = new androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$2
            r0.<init>()
            androidx.compose.runtime.RecomposeScopeImpl r5 = (androidx.compose.runtime.RecomposeScopeImpl) r5
            r5.f99214d = r0
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SharedTransitionScopeKt.e(ed.r, androidx.compose.runtime.s, int):void");
    }

    public static final androidx.compose.ui.p l(androidx.compose.ui.p pVar, N n10, final InterfaceC4376a<Boolean> interfaceC4376a) {
        InterfaceC2171i interfaceC2171i = n10.f87360b;
        InterfaceC2171i.f102572a.getClass();
        return pVar.P0(kotlin.jvm.internal.G.g(interfaceC2171i, InterfaceC2171i.a.f102574b) ? Z1.a(androidx.compose.ui.p.f103112M2, new ed.l<InterfaceC2008b2, L0>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$createContentScaleModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull InterfaceC2008b2 interfaceC2008b2) {
                interfaceC2008b2.L(interfaceC4376a.invoke().booleanValue());
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(InterfaceC2008b2 interfaceC2008b2) {
                e(interfaceC2008b2);
                return L0.f217464a;
            }
        }) : androidx.compose.ui.p.f103112M2).P0(new SkipToLookaheadElement(n10, interfaceC4376a));
    }

    @InterfaceC1645z
    public static /* synthetic */ void m() {
    }

    @InterfaceC1645z
    public static /* synthetic */ void n() {
    }

    @InterfaceC1645z
    public static /* synthetic */ void o() {
    }

    @NotNull
    public static final SnapshotStateObserver p() {
        return (SnapshotStateObserver) f87477g.getValue();
    }

    public static final boolean q(androidx.compose.ui.c cVar) {
        c.a aVar = androidx.compose.ui.c.f100390a;
        aVar.getClass();
        if (cVar == c.a.f100392b) {
            return true;
        }
        aVar.getClass();
        if (cVar == c.a.f100393c) {
            return true;
        }
        aVar.getClass();
        if (cVar == c.a.f100394d) {
            return true;
        }
        aVar.getClass();
        if (cVar == c.a.f100395e) {
            return true;
        }
        aVar.getClass();
        if (cVar == c.a.f100396f) {
            return true;
        }
        aVar.getClass();
        if (cVar == c.a.f100397g) {
            return true;
        }
        aVar.getClass();
        if (cVar == c.a.f100398h) {
            return true;
        }
        aVar.getClass();
        if (cVar == c.a.f100399i) {
            return true;
        }
        aVar.getClass();
        return cVar == c.a.f100400j;
    }

    public static final boolean r(InterfaceC2171i interfaceC2171i) {
        InterfaceC2171i.a aVar = InterfaceC2171i.f102572a;
        aVar.getClass();
        if (interfaceC2171i == InterfaceC2171i.a.f102577e) {
            return true;
        }
        aVar.getClass();
        if (interfaceC2171i == InterfaceC2171i.a.f102576d) {
            return true;
        }
        aVar.getClass();
        if (interfaceC2171i == InterfaceC2171i.a.f102580h) {
            return true;
        }
        aVar.getClass();
        if (interfaceC2171i == InterfaceC2171i.a.f102575c) {
            return true;
        }
        aVar.getClass();
        if (interfaceC2171i == InterfaceC2171i.a.f102574b) {
            return true;
        }
        aVar.getClass();
        if (interfaceC2171i == InterfaceC2171i.a.f102579g) {
            return true;
        }
        aVar.getClass();
        return interfaceC2171i == InterfaceC2171i.a.f102578f;
    }
}
