package androidx.compose.runtime;

import androidx.compose.runtime.InterfaceC1946s;
import ed.InterfaceC4376a;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.InterfaceC5123z;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,490:1\n1225#2,6:491\n1225#2,6:497\n1225#2,6:503\n1225#2,6:513\n1225#2,6:519\n1225#2,6:525\n1225#2,6:531\n1225#2,6:541\n1225#2,6:547\n86#3,4:509\n86#3,4:537\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n157#1:491,6\n197#1:497,6\n238#1:503,6\n278#1:513,6\n340#1:519,6\n363#1:525,6\n387#1:531,6\n413#1:541,6\n483#1:547,6\n278#1:509,4\n413#1:537,4\n*E\n"})
public final class EffectsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final T f99112a = new T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f99113b = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f99114c = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = f99113b)
    @InterfaceC1917i
    public static final void a(@NotNull ed.l<? super T, ? extends S> lVar, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
        if (C1968u.c0()) {
            C1968u.p0(-904483903, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:119)");
        }
        throw new IllegalStateException(f99113b);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull ed.l<? super androidx.compose.runtime.T, ? extends androidx.compose.runtime.S> r4, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r5, int r6) {
        /*
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.runtime.DisposableEffect (Effects.kt:155)"
            r2 = -1371986847(0xffffffffae392461, float:-4.209644E-11)
            androidx.compose.runtime.C1968u.p0(r2, r6, r0, r1)
        Lf:
            boolean r3 = r5.x(r3)
            java.lang.Object r6 = r5.a0()
            if (r3 != 0) goto L22
            androidx.compose.runtime.s$a r3 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r3.getClass()
            java.lang.Object r3 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r6 != r3) goto L2a
        L22:
            androidx.compose.runtime.Q r6 = new androidx.compose.runtime.Q
            r6.<init>(r4)
            r5.S(r6)
        L2a:
            androidx.compose.runtime.Q r6 = (androidx.compose.runtime.Q) r6
            boolean r3 = androidx.compose.runtime.C1968u.c0()
            if (r3 == 0) goto L35
            androidx.compose.runtime.C1968u.o0()
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.EffectsKt.b(java.lang.Object, ed.l, androidx.compose.runtime.s, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull ed.l<? super androidx.compose.runtime.T, ? extends androidx.compose.runtime.S> r5, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r6, int r7) {
        /*
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.runtime.DisposableEffect (Effects.kt:195)"
            r2 = 1429097729(0x552e4d01, float:1.197786E13)
            androidx.compose.runtime.C1968u.p0(r2, r7, r0, r1)
        Lf:
            boolean r3 = r6.x(r3)
            boolean r4 = r6.x(r4)
            r3 = r3 | r4
            java.lang.Object r4 = r6.a0()
            if (r3 != 0) goto L27
            androidx.compose.runtime.s$a r3 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r3.getClass()
            java.lang.Object r3 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r4 != r3) goto L2f
        L27:
            androidx.compose.runtime.Q r4 = new androidx.compose.runtime.Q
            r4.<init>(r5)
            r6.S(r4)
        L2f:
            androidx.compose.runtime.Q r4 = (androidx.compose.runtime.Q) r4
            boolean r3 = androidx.compose.runtime.C1968u.c0()
            if (r3 == 0) goto L3a
            androidx.compose.runtime.C1968u.o0()
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.EffectsKt.c(java.lang.Object, java.lang.Object, ed.l, androidx.compose.runtime.s, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull ed.l<? super androidx.compose.runtime.T, ? extends androidx.compose.runtime.S> r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r7, int r8) {
        /*
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.runtime.DisposableEffect (Effects.kt:236)"
            r2 = -1239538271(0xffffffffb61e25a1, float:-2.3565738E-6)
            androidx.compose.runtime.C1968u.p0(r2, r8, r0, r1)
        Lf:
            boolean r3 = r7.x(r3)
            boolean r4 = r7.x(r4)
            r3 = r3 | r4
            boolean r4 = r7.x(r5)
            r3 = r3 | r4
            java.lang.Object r4 = r7.a0()
            if (r3 != 0) goto L2c
            androidx.compose.runtime.s$a r3 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r3.getClass()
            java.lang.Object r3 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r4 != r3) goto L34
        L2c:
            androidx.compose.runtime.Q r4 = new androidx.compose.runtime.Q
            r4.<init>(r6)
            r7.S(r4)
        L34:
            androidx.compose.runtime.Q r4 = (androidx.compose.runtime.Q) r4
            boolean r3 = androidx.compose.runtime.C1968u.c0()
            if (r3 == 0) goto L3f
            androidx.compose.runtime.C1968u.o0()
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.EffectsKt.d(java.lang.Object, java.lang.Object, java.lang.Object, ed.l, androidx.compose.runtime.s, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(@org.jetbrains.annotations.NotNull java.lang.Object[] r3, @org.jetbrains.annotations.NotNull ed.l<? super androidx.compose.runtime.T, ? extends androidx.compose.runtime.S> r4, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r5, int r6) {
        /*
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.runtime.DisposableEffect (Effects.kt:276)"
            r2 = -1307627122(0xffffffffb20f318e, float:-8.334963E-9)
            androidx.compose.runtime.C1968u.p0(r2, r6, r0, r1)
        Lf:
            int r6 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r6)
            int r6 = r3.length
            r0 = 0
            r1 = r0
        L17:
            if (r0 >= r6) goto L23
            r2 = r3[r0]
            boolean r2 = r5.x(r2)
            r1 = r1 | r2
            int r0 = r0 + 1
            goto L17
        L23:
            java.lang.Object r3 = r5.a0()
            if (r1 != 0) goto L32
            androidx.compose.runtime.s$a r6 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r6.getClass()
            java.lang.Object r6 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r3 != r6) goto L3a
        L32:
            androidx.compose.runtime.Q r3 = new androidx.compose.runtime.Q
            r3.<init>(r4)
            r5.S(r3)
        L3a:
            boolean r3 = androidx.compose.runtime.C1968u.c0()
            if (r3 == 0) goto L43
            androidx.compose.runtime.C1968u.o0()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.EffectsKt.e(java.lang.Object[], ed.l, androidx.compose.runtime.s, int):void");
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = f99114c)
    @InterfaceC1917i
    public static final void f(@NotNull final ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends Object> pVar, @Nullable InterfaceC1946s interfaceC1946s, final int i10) {
        InterfaceC1946s interfaceC1946sL = interfaceC1946s.L(-805415771);
        if ((i10 & 1) == 0) {
            ComposerImpl composerImpl = (ComposerImpl) interfaceC1946sL;
            if (composerImpl.c()) {
                composerImpl.o();
                InterfaceC1948s1 interfaceC1948s1N = composerImpl.N();
                if (interfaceC1948s1N != null) {
                    ((RecomposeScopeImpl) interfaceC1948s1N).f99214d = new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.EffectsKt$LaunchedEffect$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void e(@Nullable InterfaceC1946s interfaceC1946s2, int i11) {
                            EffectsKt.f(pVar, interfaceC1946s2, C1910f1.b(i10 | 1));
                        }

                        @Override // ed.p
                        public /* bridge */ /* synthetic */ kotlin.L0 invoke(InterfaceC1946s interfaceC1946s2, Integer num) {
                            e(interfaceC1946s2, num.intValue());
                            return kotlin.L0.f217464a;
                        }
                    };
                    return;
                }
                return;
            }
        }
        if (C1968u.c0()) {
            C1968u.p0(-805415771, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:318)");
        }
        throw new IllegalStateException(f99114c);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r4, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r5, int r6) {
        /*
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)"
            r2 = 1179185413(0x4648f105, float:12860.255)
            androidx.compose.runtime.C1968u.p0(r2, r6, r0, r1)
        Lf:
            kotlin.coroutines.i r6 = r5.R()
            boolean r3 = r5.x(r3)
            java.lang.Object r0 = r5.a0()
            if (r3 != 0) goto L26
            androidx.compose.runtime.s$a r3 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r3.getClass()
            java.lang.Object r3 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r0 != r3) goto L2e
        L26:
            androidx.compose.runtime.t0 r0 = new androidx.compose.runtime.t0
            r0.<init>(r6, r4)
            r5.S(r0)
        L2e:
            androidx.compose.runtime.t0 r0 = (androidx.compose.runtime.C1966t0) r0
            boolean r3 = androidx.compose.runtime.C1968u.c0()
            if (r3 == 0) goto L39
            androidx.compose.runtime.C1968u.o0()
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.EffectsKt.g(java.lang.Object, ed.p, androidx.compose.runtime.s, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r6, int r7) {
        /*
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)"
            r2 = 590241125(0x232e5d65, float:9.452336E-18)
            androidx.compose.runtime.C1968u.p0(r2, r7, r0, r1)
        Lf:
            kotlin.coroutines.i r7 = r6.R()
            boolean r3 = r6.x(r3)
            boolean r4 = r6.x(r4)
            r3 = r3 | r4
            java.lang.Object r4 = r6.a0()
            if (r3 != 0) goto L2b
            androidx.compose.runtime.s$a r3 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r3.getClass()
            java.lang.Object r3 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r4 != r3) goto L33
        L2b:
            androidx.compose.runtime.t0 r4 = new androidx.compose.runtime.t0
            r4.<init>(r7, r5)
            r6.S(r4)
        L33:
            androidx.compose.runtime.t0 r4 = (androidx.compose.runtime.C1966t0) r4
            boolean r3 = androidx.compose.runtime.C1968u.c0()
            if (r3 == 0) goto L3e
            androidx.compose.runtime.C1968u.o0()
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.EffectsKt.h(java.lang.Object, java.lang.Object, ed.p, androidx.compose.runtime.s, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r7, int r8) {
        /*
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)"
            r2 = -54093371(0xfffffffffcc699c5, float:-8.249549E36)
            androidx.compose.runtime.C1968u.p0(r2, r8, r0, r1)
        Lf:
            kotlin.coroutines.i r8 = r7.R()
            boolean r3 = r7.x(r3)
            boolean r4 = r7.x(r4)
            r3 = r3 | r4
            boolean r4 = r7.x(r5)
            r3 = r3 | r4
            java.lang.Object r4 = r7.a0()
            if (r3 != 0) goto L30
            androidx.compose.runtime.s$a r3 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r3.getClass()
            java.lang.Object r3 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r4 != r3) goto L38
        L30:
            androidx.compose.runtime.t0 r4 = new androidx.compose.runtime.t0
            r4.<init>(r8, r6)
            r7.S(r4)
        L38:
            androidx.compose.runtime.t0 r4 = (androidx.compose.runtime.C1966t0) r4
            boolean r3 = androidx.compose.runtime.C1968u.c0()
            if (r3 == 0) goto L43
            androidx.compose.runtime.C1968u.o0()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.EffectsKt.i(java.lang.Object, java.lang.Object, java.lang.Object, ed.p, androidx.compose.runtime.s, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(@org.jetbrains.annotations.NotNull java.lang.Object[] r4, @org.jetbrains.annotations.NotNull ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r6, int r7) {
        /*
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.runtime.LaunchedEffect (Effects.kt:410)"
            r2 = -139560008(0xfffffffff7ae7bb8, float:-7.0778826E33)
            androidx.compose.runtime.C1968u.p0(r2, r7, r0, r1)
        Lf:
            kotlin.coroutines.i r7 = r6.R()
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L1b:
            if (r1 >= r0) goto L27
            r3 = r4[r1]
            boolean r3 = r6.x(r3)
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L1b
        L27:
            java.lang.Object r4 = r6.a0()
            if (r2 != 0) goto L36
            androidx.compose.runtime.s$a r0 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r0.getClass()
            java.lang.Object r0 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r4 != r0) goto L3e
        L36:
            androidx.compose.runtime.t0 r4 = new androidx.compose.runtime.t0
            r4.<init>(r7, r5)
            r6.S(r4)
        L3e:
            boolean r4 = androidx.compose.runtime.C1968u.c0()
            if (r4 == 0) goto L47
            androidx.compose.runtime.C1968u.o0()
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.EffectsKt.j(java.lang.Object[], ed.p, androidx.compose.runtime.s, int):void");
    }

    @InterfaceC1917i
    public static final void k(@NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
        if (C1968u.c0()) {
            C1968u.p0(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        interfaceC1946s.d0(interfaceC4376a);
        if (C1968u.c0()) {
            C1968u.o0();
        }
    }

    @InterfaceC4850b0
    @NotNull
    public static final kotlinx.coroutines.L m(@NotNull kotlin.coroutines.i iVar, @NotNull InterfaceC1946s interfaceC1946s) {
        A0.b bVar = kotlinx.coroutines.A0.f218690A3;
        if (iVar.get(bVar) == null) {
            kotlin.coroutines.i iVarR = interfaceC1946s.R();
            return kotlinx.coroutines.M.a(iVarR.plus(new kotlinx.coroutines.C0((kotlinx.coroutines.A0) iVarR.get(bVar))).plus(iVar));
        }
        InterfaceC5123z interfaceC5123zC = JobKt__JobKt.c(null, 1, null);
        ((kotlinx.coroutines.C0) interfaceC5123zC).b(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return kotlinx.coroutines.M.a(interfaceC5123zC);
    }

    @InterfaceC1917i
    @NotNull
    public static final kotlinx.coroutines.L n(@Nullable InterfaceC4376a<? extends kotlin.coroutines.i> interfaceC4376a, @Nullable InterfaceC1946s interfaceC1946s, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC4376a = new InterfaceC4376a<EmptyCoroutineContext>() { // from class: androidx.compose.runtime.EffectsKt$rememberCoroutineScope$1
                @NotNull
                public final EmptyCoroutineContext g() {
                    return EmptyCoroutineContext.f217673a;
                }

                @Override // ed.InterfaceC4376a
                public EmptyCoroutineContext invoke() {
                    return EmptyCoroutineContext.f217673a;
                }
            };
        }
        Object objA0 = interfaceC1946s.a0();
        InterfaceC1946s.f99968a.getClass();
        if (objA0 == InterfaceC1946s.a.f99970b) {
            objA0 = new G(m(interfaceC4376a.invoke(), interfaceC1946s));
            interfaceC1946s.S(objA0);
        }
        return ((G) objA0).f99123a;
    }
}
