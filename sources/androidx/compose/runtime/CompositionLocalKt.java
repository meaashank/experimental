package androidx.compose.runtime;

import ed.InterfaceC4376a;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,424:1\n125#2:425\n152#2,3:426\n37#3,2:429\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n420#1:425\n420#1:426,3\n420#1:429,2\n*E\n"})
public final class CompositionLocalKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @androidx.compose.runtime.InterfaceC1920j(scheme = "[0[0]]")
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final androidx.compose.runtime.C r5, @org.jetbrains.annotations.NotNull final ed.p<? super androidx.compose.runtime.InterfaceC1946s, ? super java.lang.Integer, kotlin.L0> r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r7, final int r8) {
        /*
            r0 = 1853897736(0x6e803c08, float:1.9843327E28)
            androidx.compose.runtime.s r7 = r7.L(r0)
            r1 = r8 & 6
            if (r1 != 0) goto L19
            r1 = r7
            androidx.compose.runtime.ComposerImpl r1 = (androidx.compose.runtime.ComposerImpl) r1
            boolean r1 = r1.x(r5)
            if (r1 == 0) goto L16
            r1 = 4
            goto L17
        L16:
            r1 = 2
        L17:
            r1 = r1 | r8
            goto L1a
        L19:
            r1 = r8
        L1a:
            r2 = r8 & 48
            if (r2 != 0) goto L2d
            r2 = r7
            androidx.compose.runtime.ComposerImpl r2 = (androidx.compose.runtime.ComposerImpl) r2
            boolean r2 = r2.c0(r6)
            if (r2 == 0) goto L2a
            r2 = 32
            goto L2c
        L2a:
            r2 = 16
        L2c:
            r1 = r1 | r2
        L2d:
            r2 = r1 & 19
            r3 = 18
            if (r2 != r3) goto L41
            r2 = r7
            androidx.compose.runtime.ComposerImpl r2 = (androidx.compose.runtime.ComposerImpl) r2
            boolean r3 = r2.c()
            if (r3 != 0) goto L3d
            goto L41
        L3d:
            r2.o()
            goto L9e
        L41:
            boolean r2 = androidx.compose.runtime.C1968u.c0()
            if (r2 == 0) goto L4d
            r2 = -1
            java.lang.String r3 = "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:417)"
            androidx.compose.runtime.C1968u.p0(r0, r1, r2, r3)
        L4d:
            androidx.compose.runtime.PersistentCompositionLocalMap r0 = r5.f99002a
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L60:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.compose.runtime.i2 r4 = (androidx.compose.runtime.i2) r4
            java.lang.Object r3 = r3.getKey()
            androidx.compose.runtime.A r3 = (androidx.compose.runtime.A) r3
            androidx.compose.runtime.b1 r3 = r4.a(r3)
            r2.add(r3)
            goto L60
        L80:
            r0 = 0
            androidx.compose.runtime.b1[] r0 = new androidx.compose.runtime.C1888b1[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            androidx.compose.runtime.b1[] r0 = (androidx.compose.runtime.C1888b1[]) r0
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            androidx.compose.runtime.b1[] r0 = (androidx.compose.runtime.C1888b1[]) r0
            r1 = r1 & 112(0x70, float:1.57E-43)
            c(r0, r6, r7, r1)
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto L9e
            androidx.compose.runtime.C1968u.o0()
        L9e:
            androidx.compose.runtime.ComposerImpl r7 = (androidx.compose.runtime.ComposerImpl) r7
            androidx.compose.runtime.s1 r7 = r7.N()
            if (r7 == 0) goto Laf
            androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$4 r0 = new androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$4
            r0.<init>()
            androidx.compose.runtime.RecomposeScopeImpl r7 = (androidx.compose.runtime.RecomposeScopeImpl) r7
            r7.f99214d = r0
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionLocalKt.a(androidx.compose.runtime.C, ed.p, androidx.compose.runtime.s, int):void");
    }

    @InterfaceC1920j(scheme = "[0[0]]")
    @InterfaceC1917i
    public static final void b(@NotNull final C1888b1<?> c1888b1, @NotNull final ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0> pVar, @Nullable InterfaceC1946s interfaceC1946s, final int i10) {
        InterfaceC1946s interfaceC1946sL = interfaceC1946s.L(-1350970552);
        if (C1968u.c0()) {
            C1968u.p0(-1350970552, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)");
        }
        ComposerImpl composerImpl = (ComposerImpl) interfaceC1946sL;
        composerImpl.h0(c1888b1);
        pVar.invoke(interfaceC1946sL, Integer.valueOf((i10 >> 3) & 14));
        composerImpl.i();
        if (C1968u.c0()) {
            C1968u.o0();
        }
        InterfaceC1948s1 interfaceC1948s1N = composerImpl.N();
        if (interfaceC1948s1N != null) {
            ((RecomposeScopeImpl) interfaceC1948s1N).f99214d = new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void e(@Nullable InterfaceC1946s interfaceC1946s2, int i11) {
                    CompositionLocalKt.b(c1888b1, pVar, interfaceC1946s2, C1910f1.b(i10 | 1));
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(InterfaceC1946s interfaceC1946s2, Integer num) {
                    e(interfaceC1946s2, num.intValue());
                    return kotlin.L0.f217464a;
                }
            };
        }
    }

    @InterfaceC1920j(scheme = "[0[0]]")
    @InterfaceC1917i
    public static final void c(@NotNull final C1888b1<?>[] c1888b1Arr, @NotNull final ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0> pVar, @Nullable InterfaceC1946s interfaceC1946s, final int i10) {
        InterfaceC1946s interfaceC1946sL = interfaceC1946s.L(-1390796515);
        if (C1968u.c0()) {
            C1968u.p0(-1390796515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        ComposerImpl composerImpl = (ComposerImpl) interfaceC1946sL;
        composerImpl.z(c1888b1Arr);
        pVar.invoke(interfaceC1946sL, Integer.valueOf((i10 >> 3) & 14));
        composerImpl.i0();
        if (C1968u.c0()) {
            C1968u.o0();
        }
        InterfaceC1948s1 interfaceC1948s1N = composerImpl.N();
        if (interfaceC1948s1N != null) {
            ((RecomposeScopeImpl) interfaceC1948s1N).f99214d = new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void e(@Nullable InterfaceC1946s interfaceC1946s2, int i11) {
                    C1888b1<?>[] c1888b1Arr2 = c1888b1Arr;
                    CompositionLocalKt.c((C1888b1[]) Arrays.copyOf(c1888b1Arr2, c1888b1Arr2.length), pVar, interfaceC1946s2, C1910f1.b(i10 | 1));
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(InterfaceC1946s interfaceC1946s2, Integer num) {
                    e(interfaceC1946s2, num.intValue());
                    return kotlin.L0.f217464a;
                }
            };
        }
    }

    @NotNull
    public static final <T> AbstractC1885a1<T> d(@NotNull H1<T> h12, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        return new X(h12, interfaceC4376a);
    }

    public static AbstractC1885a1 e(H1 h12, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h12 = L1.c();
        }
        return new X(h12, interfaceC4376a);
    }

    @NotNull
    public static final <T> AbstractC1885a1<T> f(@NotNull ed.l<? super B, ? extends T> lVar) {
        return new ComputedProvidableCompositionLocal(lVar);
    }

    @NotNull
    public static final <T> AbstractC1885a1<T> g(@NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        return new Y1(interfaceC4376a);
    }
}
