package androidx.compose.animation.core;

import androidx.compose.runtime.M1;
import androidx.compose.runtime.X1;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n1208#2:365\n1187#2,2:366\n81#3:368\n107#3,2:369\n81#3:371\n107#3,2:372\n1225#4,6:374\n1225#4,6:380\n460#5,11:386\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n150#1:365\n150#1:366,2\n151#1:368\n151#1:369,2\n153#1:371\n153#1:372,2\n173#1:374,6\n177#1:380,6\n217#1:386,11\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class InfiniteTransition {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f87675f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f87676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<a<?, ?>> f87677b = new androidx.compose.runtime.collection.c<>(new a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f87678c = M1.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f87679d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f87680e = M1.g(Boolean.TRUE, null, 2, null);

    @kotlin.jvm.internal.V({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n81#2:365\n107#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"})
    public final class a<T, V extends AbstractC1603p> implements X1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f87681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f87682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final H0<T, V> f87683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f87684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final androidx.compose.runtime.L0 f87685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public InterfaceC1587h<T> f87686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public C0<T, V> f87687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f87688h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f87689i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f87690j;

        public a(T t10, T t11, @NotNull H0<T, V> h02, @NotNull InterfaceC1587h<T> interfaceC1587h, @NotNull String str) {
            this.f87681a = t10;
            this.f87682b = t11;
            this.f87683c = h02;
            this.f87684d = str;
            this.f87685e = M1.g(t10, null, 2, null);
            this.f87686f = interfaceC1587h;
            this.f87687g = new C0<>(interfaceC1587h, h02, this.f87681a, this.f87682b, (AbstractC1603p) null, 16, (C4969v) null);
        }

        @NotNull
        public final C0<T, V> d() {
            return this.f87687g;
        }

        @Override // androidx.compose.runtime.X1
        public T getValue() {
            return this.f87685e.getValue();
        }

        @NotNull
        public final InterfaceC1587h<T> h() {
            return this.f87686f;
        }

        public final T i() {
            return this.f87681a;
        }

        @NotNull
        public final String j() {
            return this.f87684d;
        }

        public final T k() {
            return this.f87682b;
        }

        @NotNull
        public final H0<T, V> l() {
            return this.f87683c;
        }

        public final boolean m() {
            return this.f87688h;
        }

        public final void n(long j10) {
            InfiniteTransition.this.n(false);
            if (this.f87689i) {
                this.f87689i = false;
                this.f87690j = j10;
            }
            long j11 = j10 - this.f87690j;
            t(this.f87687g.e(j11));
            C0<T, V> c02 = this.f87687g;
            c02.getClass();
            this.f87688h = C1577c.a(c02, j11);
        }

        public final void o() {
            this.f87689i = true;
        }

        public final void p(@NotNull C0<T, V> c02) {
            this.f87687g = c02;
        }

        public final void q(boolean z10) {
            this.f87688h = z10;
        }

        public final void r(T t10) {
            this.f87681a = t10;
        }

        public final void s(T t10) {
            this.f87682b = t10;
        }

        public void t(T t10) {
            this.f87685e.setValue(t10);
        }

        public final void u() {
            t(this.f87687g.f87647c);
            this.f87689i = true;
        }

        public final void v(T t10, T t11, @NotNull InterfaceC1587h<T> interfaceC1587h) {
            this.f87681a = t10;
            this.f87682b = t11;
            this.f87686f = interfaceC1587h;
            this.f87687g = new C0<>(interfaceC1587h, this.f87683c, t10, t11, (AbstractC1603p) null, 16, (C4969v) null);
            InfiniteTransition.this.n(true);
            this.f87688h = false;
            this.f87689i = true;
        }
    }

    public InfiniteTransition(@NotNull String str) {
        this.f87676a = str;
    }

    public final void f(@NotNull a<?, ?> aVar) {
        this.f87677b.b(aVar);
        n(true);
    }

    @NotNull
    public final List<a<?, ?>> g() {
        return this.f87677b.o();
    }

    @NotNull
    public final String h() {
        return this.f87676a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        return ((Boolean) this.f87678c.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j() {
        return ((Boolean) this.f87680e.getValue()).booleanValue();
    }

    public final void k(long j10) {
        boolean z10;
        androidx.compose.runtime.collection.c<a<?, ?>> cVar = this.f87677b;
        int i10 = cVar.f99566c;
        if (i10 > 0) {
            a<?, ?>[] aVarArr = cVar.f99564a;
            z10 = true;
            int i11 = 0;
            do {
                a<?, ?> aVar = aVarArr[i11];
                if (!aVar.f87688h) {
                    aVar.n(j10);
                }
                if (!aVar.f87688h) {
                    z10 = false;
                }
                i11++;
            } while (i11 < i10);
        } else {
            z10 = true;
        }
        o(!z10);
    }

    public final void l(@NotNull a<?, ?> aVar) {
        this.f87677b.h0(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @androidx.compose.runtime.InterfaceC1917i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(@org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r9, final int r10) {
        /*
            r8 = this;
            r0 = -318043801(0xffffffffed0b0967, float:-2.6893614E27)
            androidx.compose.runtime.s r9 = r9.L(r0)
            r1 = r10 & 6
            r2 = 2
            if (r1 != 0) goto L1a
            r1 = r9
            androidx.compose.runtime.ComposerImpl r1 = (androidx.compose.runtime.ComposerImpl) r1
            boolean r1 = r1.c0(r8)
            if (r1 == 0) goto L17
            r1 = 4
            goto L18
        L17:
            r1 = r2
        L18:
            r1 = r1 | r10
            goto L1b
        L1a:
            r1 = r10
        L1b:
            r3 = r1 & 3
            if (r3 != r2) goto L2d
            r3 = r9
            androidx.compose.runtime.ComposerImpl r3 = (androidx.compose.runtime.ComposerImpl) r3
            boolean r4 = r3.c()
            if (r4 != 0) goto L29
            goto L2d
        L29:
            r3.o()
            goto L98
        L2d:
            boolean r3 = androidx.compose.runtime.C1968u.c0()
            if (r3 == 0) goto L39
            r3 = -1
            java.lang.String r4 = "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)"
            androidx.compose.runtime.C1968u.p0(r0, r1, r3, r4)
        L39:
            r0 = r9
            androidx.compose.runtime.ComposerImpl r0 = (androidx.compose.runtime.ComposerImpl) r0
            java.lang.Object r3 = r0.p1()
            androidx.compose.runtime.s$a r4 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r4.getClass()
            java.lang.Object r4 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            r5 = 0
            if (r3 != r4) goto L51
            androidx.compose.runtime.L0 r3 = androidx.compose.runtime.M1.g(r5, r5, r2, r5)
            r0.U1(r3)
        L51:
            androidx.compose.runtime.L0 r3 = (androidx.compose.runtime.L0) r3
            boolean r2 = r8.j()
            r6 = 0
            if (r2 != 0) goto L6b
            boolean r2 = r8.i()
            if (r2 == 0) goto L61
            goto L6b
        L61:
            r1 = 1721436120(0x669b07d8, float:3.6605575E23)
            r0.y(r1)
            r0.L0(r6)
            goto L8f
        L6b:
            r2 = 1719915818(0x6683d52a, float:3.112811E23)
            r0.y(r2)
            boolean r2 = r0.c0(r8)
            java.lang.Object r7 = r0.p1()
            if (r2 != 0) goto L7d
            if (r7 != r4) goto L85
        L7d:
            androidx.compose.animation.core.InfiniteTransition$run$1$1 r7 = new androidx.compose.animation.core.InfiniteTransition$run$1$1
            r7.<init>(r3, r8, r5)
            r0.U1(r7)
        L85:
            ed.p r7 = (ed.p) r7
            r1 = r1 & 14
            androidx.compose.runtime.EffectsKt.g(r8, r7, r9, r1)
            r0.L0(r6)
        L8f:
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto L98
            androidx.compose.runtime.C1968u.o0()
        L98:
            androidx.compose.runtime.ComposerImpl r9 = (androidx.compose.runtime.ComposerImpl) r9
            androidx.compose.runtime.s1 r9 = r9.N()
            if (r9 == 0) goto La9
            androidx.compose.animation.core.InfiniteTransition$run$2 r0 = new androidx.compose.animation.core.InfiniteTransition$run$2
            r0.<init>()
            androidx.compose.runtime.RecomposeScopeImpl r9 = (androidx.compose.runtime.RecomposeScopeImpl) r9
            r9.f99214d = r0
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition.m(androidx.compose.runtime.s, int):void");
    }

    public final void n(boolean z10) {
        this.f87678c.setValue(Boolean.valueOf(z10));
    }

    public final void o(boolean z10) {
        this.f87680e.setValue(Boolean.valueOf(z10));
    }
}
