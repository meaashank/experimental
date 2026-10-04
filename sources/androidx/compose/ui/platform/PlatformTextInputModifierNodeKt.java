package androidx.compose.ui.platform;

import androidx.compose.runtime.AbstractC1885a1;
import androidx.compose.runtime.Y1;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,256:1\n1#2:257\n77#3:258\n1225#4,6:259\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n*L\n164#1:258\n169#1:259,6\n*E\n"})
public final class PlatformTextInputModifierNodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AbstractC1885a1<ChainedPlatformTextInputInterceptor> f103614a = new Y1(new InterfaceC4376a<ChainedPlatformTextInputInterceptor>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1
        @Nullable
        public final ChainedPlatformTextInputInterceptor g() {
            return null;
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ ChainedPlatformTextInputInterceptor invoke() {
            return null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    @androidx.compose.runtime.InterfaceC1920j(scheme = "[0[0]]")
    @androidx.compose.runtime.InterfaceC1917i
    @androidx.compose.ui.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final androidx.compose.ui.platform.D0 r6, @org.jetbrains.annotations.NotNull final ed.p<? super androidx.compose.runtime.InterfaceC1946s, ? super java.lang.Integer, kotlin.L0> r7, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r8, final int r9) {
        /*
            r0 = 1315007550(0x4e616c3e, float:9.4549184E8)
            androidx.compose.runtime.s r8 = r8.L(r0)
            r1 = r9 & 6
            if (r1 != 0) goto L25
            r1 = r9 & 8
            if (r1 != 0) goto L17
            r1 = r8
            androidx.compose.runtime.ComposerImpl r1 = (androidx.compose.runtime.ComposerImpl) r1
            boolean r1 = r1.x(r6)
            goto L1e
        L17:
            r1 = r8
            androidx.compose.runtime.ComposerImpl r1 = (androidx.compose.runtime.ComposerImpl) r1
            boolean r1 = r1.c0(r6)
        L1e:
            if (r1 == 0) goto L22
            r1 = 4
            goto L23
        L22:
            r1 = 2
        L23:
            r1 = r1 | r9
            goto L26
        L25:
            r1 = r9
        L26:
            r2 = r9 & 48
            if (r2 != 0) goto L39
            r2 = r8
            androidx.compose.runtime.ComposerImpl r2 = (androidx.compose.runtime.ComposerImpl) r2
            boolean r2 = r2.c0(r7)
            if (r2 == 0) goto L36
            r2 = 32
            goto L38
        L36:
            r2 = 16
        L38:
            r1 = r1 | r2
        L39:
            r2 = r1 & 19
            r3 = 18
            if (r2 != r3) goto L4d
            r2 = r8
            androidx.compose.runtime.ComposerImpl r2 = (androidx.compose.runtime.ComposerImpl) r2
            boolean r3 = r2.c()
            if (r3 != 0) goto L49
            goto L4d
        L49:
            r2.o()
            goto L99
        L4d:
            boolean r2 = androidx.compose.runtime.C1968u.c0()
            if (r2 == 0) goto L59
            r2 = -1
            java.lang.String r3 = "androidx.compose.ui.platform.InterceptPlatformTextInput (PlatformTextInputModifierNode.kt:162)"
            androidx.compose.runtime.C1968u.p0(r0, r1, r2, r3)
        L59:
            androidx.compose.runtime.a1<androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor> r0 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.f103614a
            r2 = r8
            androidx.compose.runtime.ComposerImpl r2 = (androidx.compose.runtime.ComposerImpl) r2
            java.lang.Object r3 = r2.Q(r0)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r3 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor) r3
            boolean r4 = r2.x(r3)
            java.lang.Object r5 = r2.p1()
            if (r4 != 0) goto L77
            androidx.compose.runtime.s$a r4 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r4.getClass()
            java.lang.Object r4 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r5 != r4) goto L7f
        L77:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r5 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor
            r5.<init>(r6, r3)
            r2.U1(r5)
        L7f:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r5 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor) r5
            r5.c(r6)
            androidx.compose.runtime.b1 r0 = r0.e(r5)
            int r2 = androidx.compose.runtime.C1888b1.f99415i
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            androidx.compose.runtime.CompositionLocalKt.b(r0, r7, r8, r1)
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto L99
            androidx.compose.runtime.C1968u.o0()
        L99:
            androidx.compose.runtime.ComposerImpl r8 = (androidx.compose.runtime.ComposerImpl) r8
            androidx.compose.runtime.s1 r8 = r8.N()
            if (r8 == 0) goto Laa
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1
            r0.<init>()
            androidx.compose.runtime.RecomposeScopeImpl r8 = (androidx.compose.runtime.RecomposeScopeImpl) r8
            r8.f99214d = r0
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.a(androidx.compose.ui.platform.D0, ed.p, androidx.compose.runtime.s, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull androidx.compose.ui.platform.F0 r4, @org.jetbrains.annotations.NotNull ed.p<? super androidx.compose.ui.platform.H0, ? super kotlin.coroutines.e<?>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1) r0
            int r1 = r0.f103620b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103620b = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f103619a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f103620b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            kotlin.C4885d0.n(r6)
            goto L55
        L2f:
            kotlin.C4885d0.n(r6)
            androidx.compose.ui.p$d r6 = r4.g0()
            boolean r6 = r6.f103127m
            if (r6 == 0) goto L5b
            androidx.compose.ui.node.l0 r6 = androidx.compose.ui.node.C2204h.s(r4)
            androidx.compose.ui.node.LayoutNode r4 = androidx.compose.ui.node.C2204h.r(r4)
            androidx.compose.runtime.D r4 = r4.f102762w
            androidx.compose.runtime.a1<androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor> r2 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.f103614a
            java.lang.Object r4 = r4.b(r2)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r4 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor) r4
            r0.f103620b = r3
            java.lang.Object r4 = d(r6, r4, r5, r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L5b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.c(androidx.compose.ui.platform.F0, ed.p, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r5.n(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r6.d(r5, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(androidx.compose.ui.node.l0 r5, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r6, ed.p<? super androidx.compose.ui.platform.H0, ? super kotlin.coroutines.e<?>, ? extends java.lang.Object> r7, kotlin.coroutines.e<?> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) r0
            int r1 = r0.f103622b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103622b = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f103621a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f103622b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2e:
            kotlin.C4885d0.n(r8)
            goto L53
        L32:
            kotlin.C4885d0.n(r8)
            goto L44
        L36:
            kotlin.C4885d0.n(r8)
            if (r6 != 0) goto L4a
            r0.f103622b = r4
            java.lang.Object r5 = r5.n(r7, r0)
            if (r5 != r1) goto L44
            goto L52
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        L4a:
            r0.f103622b = r3
            java.lang.Object r5 = r6.d(r5, r7, r0)
            if (r5 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.d(androidx.compose.ui.node.l0, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor, ed.p, kotlin.coroutines.e):java.lang.Object");
    }
}
