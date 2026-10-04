package androidx.compose.ui.input.nestedscroll;

import P.g;
import androidx.compose.runtime.internal.r;
import ed.InterfaceC4376a;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class NestedScrollDispatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102108d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public NestedScrollNode f102109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public InterfaceC4376a<? extends L> f102110b = new InterfaceC4376a<L>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // ed.InterfaceC4376a
        public L invoke() {
            return this.f102112d.f102111c;
        }

        @Override // ed.InterfaceC4376a
        @Nullable
        public final L invoke() {
            return this.f102112d.f102111c;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public L f102111c;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super k0.E> r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.f102115c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f102115c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f102113a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.f102115c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.C4885d0.n(r12)
            goto L48
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.C4885d0.n(r12)
            androidx.compose.ui.input.nestedscroll.b r12 = r7.h()
            if (r12 == 0) goto L4d
            r6.f102115c = r2
            r1 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r1
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.s0(r2, r4, r6)
            if (r12 != r0) goto L48
            return r0
        L48:
            k0.E r12 = (k0.E) r12
            long r8 = r12.f214281a
            goto L54
        L4d:
            k0.E$a r8 = k0.E.f214279b
            r8.getClass()
            long r8 = k0.E.f214280c
        L54:
            k0.E r10 = new k0.E
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.a(long, long, kotlin.coroutines.e):java.lang.Object");
    }

    public final long b(long j10, long j11, int i10) {
        b bVarH = h();
        if (bVarH != null) {
            return ((NestedScrollNode) bVarH).H0(j10, j11, i10);
        }
        g.f65503b.getClass();
        return g.f65504c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super k0.E> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.f102118c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f102118c = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f102116a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f102118c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C4885d0.n(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.C4885d0.n(r7)
            androidx.compose.ui.input.nestedscroll.b r7 = r4.h()
            if (r7 == 0) goto L48
            r0.f102118c = r3
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r7 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r7
            java.lang.Object r7 = r7.m1(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            k0.E r7 = (k0.E) r7
            long r5 = r7.f214281a
            goto L4f
        L48:
            k0.E$a r5 = k0.E.f214279b
            r5.getClass()
            long r5 = k0.E.f214280c
        L4f:
            k0.E r7 = new k0.E
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.c(long, kotlin.coroutines.e):java.lang.Object");
    }

    public final long d(long j10, int i10) {
        b bVarH = h();
        if (bVarH != null) {
            return ((NestedScrollNode) bVarH).j2(j10, i10);
        }
        g.f65503b.getClass();
        return g.f65504c;
    }

    @NotNull
    public final InterfaceC4376a<L> e() {
        return this.f102110b;
    }

    @NotNull
    public final L f() {
        L lInvoke = this.f102110b.invoke();
        if (lInvoke != null) {
            return lInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Nullable
    public final NestedScrollNode g() {
        return this.f102109a;
    }

    @Nullable
    public final b h() {
        NestedScrollNode nestedScrollNode = this.f102109a;
        if (nestedScrollNode != null) {
            return nestedScrollNode.i3();
        }
        return null;
    }

    @Nullable
    public final L i() {
        return this.f102111c;
    }

    public final void j(@NotNull InterfaceC4376a<? extends L> interfaceC4376a) {
        this.f102110b = interfaceC4376a;
    }

    public final void k(@Nullable NestedScrollNode nestedScrollNode) {
        this.f102109a = nestedScrollNode;
    }

    public final void l(@Nullable L l10) {
        this.f102111c = l10;
    }
}
