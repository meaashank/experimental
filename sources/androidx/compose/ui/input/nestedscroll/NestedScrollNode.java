package androidx.compose.ui.input.nestedscroll;

import P.g;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.p;
import ed.InterfaceC4376a;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class NestedScrollNode extends p.d implements TraversableNode, b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f102121r = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public b f102122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public NestedScrollDispatcher f102123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Object f102124q;

    public NestedScrollNode(@NotNull b bVar, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        this.f102122o = bVar;
        this.f102123p = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.f102124q = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long H0(long j10, long j11, int i10) {
        long jH0;
        long jH02 = this.f102122o.H0(j10, j11, i10);
        b bVarH3 = h3();
        if (bVarH3 != null) {
            jH0 = ((NestedScrollNode) bVarH3).H0(g.v(j10, jH02), g.u(j11, jH02), i10);
        } else {
            g.f65503b.getClass();
            jH0 = g.f65504c;
        }
        return g.v(jH02, jH0);
    }

    @Override // androidx.compose.ui.p.d
    public void O2() {
        m3();
    }

    @Override // androidx.compose.ui.p.d
    public void P2() {
        j3();
    }

    @NotNull
    public final b f3() {
        return this.f102122o;
    }

    public final L g3() {
        L lG3;
        NestedScrollNode nestedScrollNodeI3 = i3();
        if (nestedScrollNodeI3 != null && (lG3 = nestedScrollNodeI3.g3()) != null) {
            return lG3;
        }
        L l10 = this.f102123p.f102111c;
        if (l10 != null) {
            return l10;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final b h3() {
        if (this.f103127m) {
            return i3();
        }
        return null;
    }

    @Nullable
    public final NestedScrollNode i3() {
        if (this.f103127m) {
            return (NestedScrollNode) B0.b(this);
        }
        return null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long j2(long j10, int i10) {
        long jJ2;
        b bVarH3 = h3();
        if (bVarH3 != null) {
            jJ2 = ((NestedScrollNode) bVarH3).j2(j10, i10);
        } else {
            g.f65503b.getClass();
            jJ2 = g.f65504c;
        }
        return g.v(jJ2, this.f102122o.j2(g.u(j10, jJ2), i10));
    }

    public final void j3() {
        NestedScrollDispatcher nestedScrollDispatcher = this.f102123p;
        if (nestedScrollDispatcher.f102109a == this) {
            nestedScrollDispatcher.f102109a = null;
        }
    }

    public final void k3(@NotNull b bVar) {
        this.f102122o = bVar;
    }

    public final void l3(NestedScrollDispatcher nestedScrollDispatcher) {
        j3();
        if (nestedScrollDispatcher == null) {
            this.f102123p = new NestedScrollDispatcher();
        } else if (!nestedScrollDispatcher.equals(this.f102123p)) {
            this.f102123p = nestedScrollDispatcher;
        }
        if (this.f103127m) {
            m3();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m1(long r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super k0.E> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.f102135e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f102135e = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f102133c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f102135e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r9 = r0.f102132b
            kotlin.C4885d0.n(r11)
            goto L7c
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            long r9 = r0.f102132b
            java.lang.Object r2 = r0.f102131a
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r2
            kotlin.C4885d0.n(r11)
            goto L57
        L3e:
            kotlin.C4885d0.n(r11)
            androidx.compose.ui.input.nestedscroll.b r11 = r8.h3()
            if (r11 == 0) goto L5f
            r0.f102131a = r8
            r0.f102132b = r9
            r0.f102135e = r4
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r11 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r11
            java.lang.Object r11 = r11.m1(r9, r0)
            if (r11 != r1) goto L56
            goto L7b
        L56:
            r2 = r8
        L57:
            k0.E r11 = (k0.E) r11
            long r4 = r11.f214281a
        L5b:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L68
        L5f:
            k0.E$a r11 = k0.E.f214279b
            r11.getClass()
            long r4 = k0.E.f214280c
            r2 = r8
            goto L5b
        L68:
            androidx.compose.ui.input.nestedscroll.b r11 = r2.f102122o
            long r4 = k0.E.p(r4, r9)
            r2 = 0
            r0.f102131a = r2
            r0.f102132b = r9
            r0.f102135e = r3
            java.lang.Object r11 = r11.m1(r4, r0)
            if (r11 != r1) goto L7c
        L7b:
            return r1
        L7c:
            k0.E r11 = (k0.E) r11
            long r0 = r11.f214281a
            long r9 = k0.E.q(r9, r0)
            k0.E r11 = new k0.E
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.m1(long, kotlin.coroutines.e):java.lang.Object");
    }

    public final void m3() {
        NestedScrollDispatcher nestedScrollDispatcher = this.f102123p;
        nestedScrollDispatcher.f102109a = this;
        nestedScrollDispatcher.f102110b = new InterfaceC4376a<L>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public L invoke() {
                return this.f102136d.g3();
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            public final L invoke() {
                return this.f102136d.g3();
            }
        };
        nestedScrollDispatcher.f102111c = B2();
    }

    public final void n3(@NotNull b bVar, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        this.f102122o = bVar;
        l3(nestedScrollDispatcher);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s0(long r11, long r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super k0.E> r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r15 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r0
            int r1 = r0.f102130f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f102130f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f102128d
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.f102130f
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 == r2) goto L36
            if (r1 != r7) goto L2e
            long r11 = r6.f102126b
            kotlin.C4885d0.n(r15)
            goto L7f
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            long r13 = r6.f102127c
            long r11 = r6.f102126b
            java.lang.Object r1 = r6.f102125a
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r1
            kotlin.C4885d0.n(r15)
            goto L5b
        L42:
            kotlin.C4885d0.n(r15)
            androidx.compose.ui.input.nestedscroll.b r1 = r10.f102122o
            r6.f102125a = r10
            r6.f102126b = r11
            r6.f102127c = r13
            r6.f102130f = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.s0(r2, r4, r6)
            if (r15 != r0) goto L58
            goto L7d
        L58:
            r1 = r10
            r11 = r2
            r13 = r4
        L5b:
            k0.E r15 = (k0.E) r15
            long r8 = r15.f214281a
            androidx.compose.ui.input.nestedscroll.b r15 = r1.h3()
            if (r15 == 0) goto L85
            long r2 = k0.E.q(r11, r8)
            long r4 = k0.E.p(r13, r8)
            r11 = 0
            r6.f102125a = r11
            r6.f102126b = r8
            r6.f102130f = r7
            r1 = r15
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r1
            java.lang.Object r15 = r1.s0(r2, r4, r6)
            if (r15 != r0) goto L7e
        L7d:
            return r0
        L7e:
            r11 = r8
        L7f:
            k0.E r15 = (k0.E) r15
            long r13 = r15.f214281a
            r8 = r11
            goto L8c
        L85:
            k0.E$a r11 = k0.E.f214279b
            r11.getClass()
            long r13 = k0.E.f214280c
        L8c:
            long r11 = k0.E.q(r8, r13)
            k0.E r13 = new k0.E
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.s0(long, long, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object v1() {
        return this.f102124q;
    }
}
