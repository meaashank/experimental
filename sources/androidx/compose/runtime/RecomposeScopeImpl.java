package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.DerivedSnapshotState;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,449:1\n89#2:450\n1#3:451\n254#4,2:452\n228#4,4:454\n198#4,7:458\n209#4,3:466\n212#4,9:470\n232#4:479\n256#4:480\n1956#5:465\n1820#5:469\n1956#5:491\n1820#5:495\n1956#5:518\n1820#5:522\n402#6,4:481\n374#6,6:485\n384#6,3:492\n387#6,2:496\n407#6,2:498\n390#6,6:500\n409#6:506\n450#6:507\n402#6,4:508\n374#6,6:512\n384#6,3:519\n387#6,2:523\n407#6:525\n451#6,2:526\n408#6:528\n390#6,6:529\n409#6:535\n453#6:536\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n197#1:450\n359#1:452,2\n359#1:454,4\n359#1:458,7\n359#1:466,3\n359#1:470,9\n359#1:479\n359#1:480\n359#1:465\n359#1:469\n381#1:491\n381#1:495\n404#1:518\n404#1:522\n381#1:481,4\n381#1:485,6\n381#1:492,3\n381#1:496,2\n381#1:498,2\n381#1:500,6\n381#1:506\n404#1:507\n404#1:508,4\n404#1:512,6\n404#1:519,3\n404#1:523,2\n404#1:525\n404#1:526,2\n404#1:528\n404#1:529,6\n404#1:535\n404#1:536\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class RecomposeScopeImpl implements InterfaceC1948s1, InterfaceC1906e1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f99209i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f99210j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InterfaceC1913g1 f99212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public C1889c f99213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0> f99214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public androidx.compose.runtime.tooling.h f99215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f99216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public androidx.collection.F0<Object> f99217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public MutableScatterMap<N<?>, Object> f99218h;

    @kotlin.jvm.internal.V({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,449:1\n33#2,6:450\n93#2,2:456\n33#2,4:458\n95#2,2:462\n38#2:464\n97#2:465\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n434#1:450,6\n444#1:456,2\n444#1:458,4\n444#1:462,2\n444#1:464\n444#1:465\n*E\n"})
    public static final class a {
        public a() {
        }

        public final void a(@NotNull C1982y1 c1982y1, @NotNull List<C1889c> list, @NotNull InterfaceC1913g1 interfaceC1913g1) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objU1 = c1982y1.u1(list.get(i10), 0);
                RecomposeScopeImpl recomposeScopeImpl = objU1 instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) objU1 : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.f99212b = interfaceC1913g1;
                }
            }
        }

        public final boolean b(@NotNull C1973v1 c1973v1, @NotNull List<C1889c> list) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C1889c c1889c = list.get(i10);
                    if (c1973v1.R(c1889c) && (c1973v1.Z(c1973v1.i(c1889c), 0) instanceof RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public a(C4969v c4969v) {
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$observe$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,449:1\n89#2:450\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$observe$2\n*L\n202#1:450\n*E\n"})
    public static final class b implements androidx.compose.runtime.tooling.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.tooling.h f99220b;

        public b(androidx.compose.runtime.tooling.h hVar) {
            this.f99220b = hVar;
        }

        @Override // androidx.compose.runtime.tooling.f
        public void dispose() {
            Object obj = C1910f1.f99676k;
            RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
            androidx.compose.runtime.tooling.h hVar = this.f99220b;
            synchronized (obj) {
                if (kotlin.jvm.internal.G.g(recomposeScopeImpl.f99215e, hVar)) {
                    recomposeScopeImpl.f99215e = null;
                }
            }
        }
    }

    public RecomposeScopeImpl(@Nullable InterfaceC1913g1 interfaceC1913g1) {
        this.f99212b = interfaceC1913g1;
    }

    @InterfaceC1884a0
    public static /* synthetic */ void p() {
    }

    public final boolean A(@NotNull Object obj) {
        int i10 = 0;
        if (r()) {
            return false;
        }
        androidx.collection.F0<Object> f02 = this.f99217g;
        int i11 = 1;
        if (f02 == null) {
            f02 = new androidx.collection.F0<>(i10, i11, null);
            this.f99217g = f02;
        }
        return f02.d0(obj, this.f99216f, -1) == this.f99216f;
    }

    public final void B() {
        InterfaceC1913g1 interfaceC1913g1 = this.f99212b;
        if (interfaceC1913g1 != null) {
            interfaceC1913g1.d(this);
        }
        this.f99212b = null;
        this.f99217g = null;
        this.f99218h = null;
        androidx.compose.runtime.tooling.h hVar = this.f99215e;
        if (hVar != null) {
            hVar.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            r17 = this;
            r1 = r17
            androidx.compose.runtime.g1 r0 = r1.f99212b
            if (r0 == 0) goto L60
            androidx.collection.F0<java.lang.Object> r2 = r1.f99217g
            if (r2 == 0) goto L60
            r3 = 1
            r1.J(r3)
            r3 = 0
            java.lang.Object[] r4 = r2.f86723b     // Catch: java.lang.Throwable -> L4b
            int[] r5 = r2.f86724c     // Catch: java.lang.Throwable -> L4b
            long[] r2 = r2.f86722a     // Catch: java.lang.Throwable -> L4b
            int r6 = r2.length     // Catch: java.lang.Throwable -> L4b
            int r6 = r6 + (-2)
            if (r6 < 0) goto L58
            r7 = r3
        L1b:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L4b
            long r10 = ~r8     // Catch: java.lang.Throwable -> L4b
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L53
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L4b
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L35:
            if (r12 >= r10) goto L51
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L4b
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L4b
            r0.a(r14)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r0 = move-exception
            goto L5c
        L4d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L35
        L51:
            if (r10 != r11) goto L58
        L53:
            if (r7 == r6) goto L58
            int r7 = r7 + 1
            goto L1b
        L58:
            r1.J(r3)
            return
        L5c:
            r1.J(r3)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.C():void");
    }

    public final void D() {
        K(true);
    }

    public final void E(@Nullable C1889c c1889c) {
        this.f99213c = c1889c;
    }

    public final void F(boolean z10) {
        if (z10) {
            this.f99211a |= 2;
        } else {
            this.f99211a &= -3;
        }
    }

    public final void G(boolean z10) {
        if (z10) {
            this.f99211a |= 4;
        } else {
            this.f99211a &= -5;
        }
    }

    public final void H(boolean z10) {
        if (z10) {
            this.f99211a |= 64;
        } else {
            this.f99211a &= -65;
        }
    }

    public final void I(boolean z10) {
        if (z10) {
            this.f99211a |= 8;
        } else {
            this.f99211a &= -9;
        }
    }

    public final void J(boolean z10) {
        if (z10) {
            this.f99211a |= 32;
        } else {
            this.f99211a &= -33;
        }
    }

    public final void K(boolean z10) {
        if (z10) {
            this.f99211a |= 16;
        } else {
            this.f99211a &= -17;
        }
    }

    public final void L(boolean z10) {
        if (z10) {
            this.f99211a |= 1;
        } else {
            this.f99211a &= -2;
        }
    }

    public final void M(int i10) {
        this.f99216f = i10;
        K(false);
    }

    @Override // androidx.compose.runtime.InterfaceC1948s1
    public void a(@NotNull ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0> pVar) {
        this.f99214d = pVar;
    }

    public final void g(@NotNull InterfaceC1913g1 interfaceC1913g1) {
        this.f99212b = interfaceC1913g1;
    }

    public final boolean h(N<?> n10, MutableScatterMap<N<?>, Object> mutableScatterMap) {
        kotlin.jvm.internal.G.n(n10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        H1<?> policy = n10.getPolicy();
        if (policy == null) {
            policy = L1.c();
        }
        return !policy.a(((DerivedSnapshotState.a) n10.g()).f99106g, mutableScatterMap.p(n10));
    }

    public final void i(@NotNull InterfaceC1946s interfaceC1946s) {
        kotlin.L0 l02;
        ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0> pVar = this.f99214d;
        androidx.compose.runtime.tooling.h hVar = this.f99215e;
        if (hVar != null && pVar != null) {
            hVar.c(this);
            try {
                pVar.invoke(interfaceC1946s, 1);
                return;
            } finally {
                hVar.a(this);
            }
        }
        if (pVar != null) {
            pVar.invoke(interfaceC1946s, 1);
            l02 = kotlin.L0.f217464a;
        } else {
            l02 = null;
        }
        if (l02 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1906e1
    public void invalidate() {
        InterfaceC1913g1 interfaceC1913g1 = this.f99212b;
        if (interfaceC1913g1 != null) {
            interfaceC1913g1.g(this, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ed.l<androidx.compose.runtime.InterfaceC1971v, kotlin.L0> j(final int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            androidx.collection.F0<java.lang.Object> r2 = r0.f99217g
            r3 = 0
            if (r2 == 0) goto L5b
            boolean r4 = r0.s()
            if (r4 != 0) goto L5b
            java.lang.Object[] r4 = r2.f86723b
            int[] r5 = r2.f86724c
            long[] r6 = r2.f86722a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L5b
            r8 = 0
            r9 = r8
        L1c:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L56
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L36:
            if (r14 >= r12) goto L54
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L50
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r4[r15]
            r15 = r5[r15]
            if (r15 == r1) goto L50
            androidx.compose.runtime.RecomposeScopeImpl$end$1$2 r3 = new androidx.compose.runtime.RecomposeScopeImpl$end$1$2
            r3.<init>()
            return r3
        L50:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L36
        L54:
            if (r12 != r13) goto L5b
        L56:
            if (r9 == r7) goto L5b
            int r9 = r9 + 1
            goto L1c
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.j(int):ed.l");
    }

    @Nullable
    public final C1889c k() {
        return this.f99213c;
    }

    public final boolean l() {
        return this.f99214d != null;
    }

    public final boolean m() {
        return (this.f99211a & 2) != 0;
    }

    public final boolean n() {
        return (this.f99211a & 4) != 0;
    }

    public final boolean o() {
        return (this.f99211a & 64) != 0;
    }

    public final boolean q() {
        return (this.f99211a & 8) != 0;
    }

    public final boolean r() {
        return (this.f99211a & 32) != 0;
    }

    public final boolean s() {
        return (this.f99211a & 16) != 0;
    }

    public final boolean t() {
        return (this.f99211a & 1) != 0;
    }

    public final boolean u() {
        if (this.f99212b != null) {
            C1889c c1889c = this.f99213c;
            if (c1889c != null ? c1889c.b() : false) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final InvalidationResult v(@Nullable Object obj) {
        InvalidationResult invalidationResultG;
        InterfaceC1913g1 interfaceC1913g1 = this.f99212b;
        return (interfaceC1913g1 == null || (invalidationResultG = interfaceC1913g1.g(this, obj)) == null) ? InvalidationResult.IGNORED : invalidationResultG;
    }

    public final boolean w() {
        return this.f99218h != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(@org.jetbrains.annotations.Nullable java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != 0) goto L8
            return r2
        L8:
            androidx.collection.MutableScatterMap<androidx.compose.runtime.N<?>, java.lang.Object> r3 = r0.f99218h
            if (r3 != 0) goto Ld
            return r2
        Ld:
            boolean r4 = r1 instanceof androidx.compose.runtime.N
            if (r4 == 0) goto L18
            androidx.compose.runtime.N r1 = (androidx.compose.runtime.N) r1
            boolean r1 = r0.h(r1, r3)
            return r1
        L18:
            boolean r4 = r1 instanceof androidx.collection.ScatterSet
            if (r4 == 0) goto L72
            androidx.collection.ScatterSet r1 = (androidx.collection.ScatterSet) r1
            boolean r4 = r1.s()
            r5 = 0
            if (r4 == 0) goto L71
            java.lang.Object[] r4 = r1.f86877b
            long[] r1 = r1.f86876a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L71
            r7 = r5
        L2f:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L49:
            if (r12 >= r10) goto L6a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L66
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            boolean r14 = r13 instanceof androidx.compose.runtime.N
            if (r14 == 0) goto L65
            androidx.compose.runtime.N r13 = (androidx.compose.runtime.N) r13
            boolean r13 = r0.h(r13, r3)
            if (r13 == 0) goto L66
        L65:
            return r2
        L66:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L49
        L6a:
            if (r10 != r11) goto L71
        L6c:
            if (r7 == r6) goto L71
            int r7 = r7 + 1
            goto L2f
        L71:
            return r5
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.x(java.lang.Object):boolean");
    }

    @InterfaceC1884a0
    @NotNull
    public final androidx.compose.runtime.tooling.f y(@NotNull androidx.compose.runtime.tooling.h hVar) {
        synchronized (C1910f1.f99676k) {
            this.f99215e = hVar;
        }
        return new b(hVar);
    }

    public final void z(@NotNull N<?> n10, @Nullable Object obj) {
        MutableScatterMap<N<?>, Object> mutableScatterMap = this.f99218h;
        if (mutableScatterMap == null) {
            mutableScatterMap = new MutableScatterMap<>(0, 1, null);
            this.f99218h = mutableScatterMap;
        }
        mutableScatterMap.q0(n10, obj);
    }
}
