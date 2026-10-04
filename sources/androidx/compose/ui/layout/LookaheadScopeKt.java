package androidx.compose.ui.layout;

import androidx.compose.ui.layout.v0;
import k0.C4811b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,284:1\n1225#2,6:285\n368#3,12:291\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n*L\n52#1:285,6\n53#1:291,12\n*E\n"})
public final class LookaheadScopeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ed.p<v0.a, InterfaceC2188x, Boolean> f102474a = new ed.p<v0.a, InterfaceC2188x, Boolean>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
        @NotNull
        public final Boolean e(@NotNull v0.a aVar, @NotNull InterfaceC2188x interfaceC2188x) {
            return Boolean.FALSE;
        }

        @Override // ed.p
        public /* bridge */ /* synthetic */ Boolean invoke(v0.a aVar, InterfaceC2188x interfaceC2188x) {
            return Boolean.FALSE;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @androidx.compose.ui.v
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final ed.q<? super androidx.compose.ui.layout.M, ? super androidx.compose.runtime.InterfaceC1946s, ? super java.lang.Integer, kotlin.L0> r7, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r8, final int r9) {
        /*
            r0 = -1078066484(0xffffffffbfbe02cc, float:-1.4844604)
            androidx.compose.runtime.s r8 = r8.L(r0)
            r1 = r9 & 6
            r2 = 2
            if (r1 != 0) goto L1a
            r1 = r8
            androidx.compose.runtime.ComposerImpl r1 = (androidx.compose.runtime.ComposerImpl) r1
            boolean r1 = r1.c0(r7)
            if (r1 == 0) goto L17
            r1 = 4
            goto L18
        L17:
            r1 = r2
        L18:
            r1 = r1 | r9
            goto L1b
        L1a:
            r1 = r9
        L1b:
            r3 = r1 & 3
            if (r3 != r2) goto L2d
            r2 = r8
            androidx.compose.runtime.ComposerImpl r2 = (androidx.compose.runtime.ComposerImpl) r2
            boolean r3 = r2.c()
            if (r3 != 0) goto L29
            goto L2d
        L29:
            r2.o()
            goto L8a
        L2d:
            boolean r2 = androidx.compose.runtime.C1968u.c0()
            if (r2 == 0) goto L39
            r2 = -1
            java.lang.String r3 = "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:50)"
            androidx.compose.runtime.C1968u.p0(r0, r1, r2, r3)
        L39:
            r0 = r8
            androidx.compose.runtime.ComposerImpl r0 = (androidx.compose.runtime.ComposerImpl) r0
            java.lang.Object r2 = r0.p1()
            androidx.compose.runtime.s$a r3 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r3.getClass()
            java.lang.Object r3 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L53
            androidx.compose.ui.layout.N r2 = new androidx.compose.ui.layout.N
            r2.<init>(r5, r4, r5)
            r0.U1(r2)
        L53:
            androidx.compose.ui.layout.N r2 = (androidx.compose.ui.layout.N) r2
            androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1 r3 = new ed.InterfaceC4376a<androidx.compose.ui.node.LayoutNode>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1
                static {
                    /*
                        androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1 r0 = new androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1) androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1.d androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1.<init>():void");
                }

                @Override // ed.InterfaceC4376a
                @org.jetbrains.annotations.NotNull
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.ui.node.LayoutNode invoke() {
                    /*
                        r5 = this;
                        androidx.compose.ui.node.LayoutNode r0 = new androidx.compose.ui.node.LayoutNode
                        r1 = 2
                        r2 = 0
                        r3 = 1
                        r4 = 0
                        r0.<init>(r3, r4, r1, r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1.invoke():androidx.compose.ui.node.LayoutNode");
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ androidx.compose.ui.node.LayoutNode invoke() {
                    /*
                        r1 = this;
                        androidx.compose.ui.node.LayoutNode r0 = r1.invoke()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1.invoke():java.lang.Object");
                }
            }
            androidx.compose.runtime.f<?> r6 = r0.f99033b
            if (r6 == 0) goto L9c
            r0.k()
            boolean r5 = r0.f99031R
            if (r5 == 0) goto L66
            r0.p(r3)
            goto L69
        L66:
            r0.h()
        L69:
            androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1 r3 = new ed.l<androidx.compose.ui.node.LayoutNode, kotlin.L0>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                static {
                    /*
                        androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1 r0 = new androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1) androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1.d androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1.<init>():void");
                }

                public final void e(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.LayoutNode r2) {
                    /*
                        r1 = this;
                        r0 = 1
                        r2.f102743d = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1.e(androidx.compose.ui.node.LayoutNode):void");
                }

                @Override // ed.l
                public kotlin.L0 invoke(androidx.compose.ui.node.LayoutNode r2) {
                    /*
                        r1 = this;
                        androidx.compose.ui.node.LayoutNode r2 = (androidx.compose.ui.node.LayoutNode) r2
                        r0 = 1
                        r2.f102743d = r0
                        kotlin.L0 r2 = kotlin.L0.f217464a
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            androidx.compose.runtime.Updater.g(r8, r3)
            androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2 r3 = new ed.p<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.N, kotlin.L0>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2


                static {
                    /*
                        androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2 r0 = new androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2) androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.d androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 2
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.<init>():void");
                }

                public final void e(@org.jetbrains.annotations.NotNull final androidx.compose.ui.node.LayoutNode r2, @org.jetbrains.annotations.NotNull androidx.compose.ui.layout.N r3) {
                    /*
                        r1 = this;
                        androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2$1 r0 = new androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2$1
                        r0.<init>()
                        r3.f102487a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.e(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.N):void");
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(androidx.compose.ui.node.LayoutNode r1, androidx.compose.ui.layout.N r2) {
                    /*
                        r0 = this;
                        androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
                        androidx.compose.ui.layout.N r2 = (androidx.compose.ui.layout.N) r2
                        r0.e(r1, r2)
                        kotlin.L0 r1 = kotlin.L0.f217464a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }
            androidx.compose.runtime.Updater.j(r8, r2, r3)
            int r1 = r1 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.invoke(r2, r8, r1)
            r0.L0(r4)
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto L8a
            androidx.compose.runtime.C1968u.o0()
        L8a:
            androidx.compose.runtime.ComposerImpl r8 = (androidx.compose.runtime.ComposerImpl) r8
            androidx.compose.runtime.s1 r8 = r8.N()
            if (r8 == 0) goto L9b
            androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4 r0 = new androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4
            r0.<init>()
            androidx.compose.runtime.RecomposeScopeImpl r8 = (androidx.compose.runtime.RecomposeScopeImpl) r8
            r8.f99214d = r0
        L9b:
            return
        L9c:
            androidx.compose.runtime.C1932n.n()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LookaheadScopeKt.a(ed.q, androidx.compose.runtime.s, int):void");
    }

    @NotNull
    public static final androidx.compose.ui.p c(@NotNull androidx.compose.ui.p pVar, @NotNull ed.l<? super k0.x, Boolean> lVar, @NotNull ed.p<? super v0.a, ? super InterfaceC2188x, Boolean> pVar2, @NotNull ed.q<? super InterfaceC2165f, ? super O, ? super C4811b, ? extends T> qVar) {
        return pVar.P0(new ApproachLayoutElement(qVar, lVar, pVar2));
    }

    public static /* synthetic */ androidx.compose.ui.p d(androidx.compose.ui.p pVar, ed.l lVar, ed.p pVar2, ed.q qVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar2 = f102474a;
        }
        return c(pVar, lVar, pVar2, qVar);
    }

    public static final long e(@NotNull M m10, @NotNull InterfaceC2188x interfaceC2188x, @NotNull InterfaceC2188x interfaceC2188x2, long j10, boolean z10) {
        InterfaceC2188x interfaceC2188xM = m10.M(interfaceC2188x);
        InterfaceC2188x interfaceC2188xM2 = m10.M(interfaceC2188x2);
        return interfaceC2188xM instanceof J ? ((J) interfaceC2188xM).R(interfaceC2188xM2, j10, z10) : interfaceC2188xM2 instanceof J ? ((J) interfaceC2188xM2).R(interfaceC2188xM, j10, z10) ^ (-9223372034707292160L) : interfaceC2188xM.R(interfaceC2188xM, j10, z10);
    }
}
