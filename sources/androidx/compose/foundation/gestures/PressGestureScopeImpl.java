package androidx.compose.foundation.gestures;

import androidx.compose.runtime.T1;
import k0.InterfaceC4814e;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class PressGestureScopeImpl implements u, InterfaceC4814e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f89672e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4814e f89673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f89674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.sync.a f89676d = new MutexImpl(false);

    public PressGestureScopeImpl(@NotNull InterfaceC4814e interfaceC4814e) {
        this.f89673a = interfaceC4814e;
    }

    @Override // k0.InterfaceC4814e
    @T1
    @NotNull
    public P.j A0(@NotNull k0.l lVar) {
        return this.f89673a.A0(lVar);
    }

    @Override // k0.InterfaceC4814e
    @T1
    public long C(long j10) {
        return this.f89673a.C(j10);
    }

    public final void D() {
        this.f89674b = true;
        a.C0832a.d(this.f89676d, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.f89683d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89683d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f89681b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89683d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f89680a
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.C4885d0.n(r5)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C4885d0.n(r5)
            kotlinx.coroutines.sync.a r5 = r4.f89676d
            r0.f89680a = r4
            r0.f89683d = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.a.C0832a.b(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L44
            return r1
        L44:
            r0 = r4
        L45:
            r5 = 0
            r0.f89674b = r5
            r0.f89675c = r5
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.E(kotlin.coroutines.e):java.lang.Object");
    }

    @Override // k0.InterfaceC4814e
    @T1
    public long G(int i10) {
        return this.f89673a.G(i10);
    }

    @Override // k0.InterfaceC4814e
    @T1
    public long I(float f10) {
        return this.f89673a.I(f10);
    }

    @Override // k0.InterfaceC4814e
    @T1
    public int I1(float f10) {
        return this.f89673a.I1(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.u
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object J1(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.f89687d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89687d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f89685b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89687d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.f89684a
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.C4885d0.n(r6)
            goto L4d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.C4885d0.n(r6)
            boolean r6 = r5.f89674b
            if (r6 != 0) goto L53
            boolean r6 = r5.f89675c
            if (r6 != 0) goto L53
            kotlinx.coroutines.sync.a r6 = r5.f89676d
            r0.f89684a = r5
            r0.f89687d = r4
            java.lang.Object r6 = kotlinx.coroutines.sync.a.C0832a.b(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            kotlinx.coroutines.sync.a r6 = r0.f89676d
            kotlinx.coroutines.sync.a.C0832a.d(r6, r3, r4, r3)
            goto L54
        L53:
            r0 = r5
        L54:
            boolean r6 = r0.f89674b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.J1(kotlin.coroutines.e):java.lang.Object");
    }

    @Override // k0.InterfaceC4814e
    @T1
    public float M1(long j10) {
        return this.f89673a.M1(j10);
    }

    @Override // k0.InterfaceC4814e
    @T1
    public float V(int i10) {
        return this.f89673a.V(i10);
    }

    @Override // k0.InterfaceC4814e
    @T1
    public float W(float f10) {
        return this.f89673a.W(f10);
    }

    @Override // k0.InterfaceC4814e
    @T1
    public long Z(long j10) {
        return this.f89673a.Z(j10);
    }

    @Override // k0.InterfaceC4814e
    public float a() {
        return this.f89673a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.u
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b2(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.f89679c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89679c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f89677a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89679c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C4885d0.n(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.C4885d0.n(r5)
            r0.f89679c = r3
            java.lang.Object r5 = r4.J1(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L46
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        L46:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.b2(kotlin.coroutines.e):java.lang.Object");
    }

    public final void g() {
        this.f89675c = true;
        a.C0832a.d(this.f89676d, null, 1, null);
    }

    @Override // k0.p
    @T1
    public float k(long j10) {
        return this.f89673a.k(j10);
    }

    @Override // k0.InterfaceC4814e
    @T1
    public float l2(float f10) {
        return this.f89673a.l2(f10);
    }

    @Override // k0.p
    public float m0() {
        return this.f89673a.m0();
    }

    @Override // k0.InterfaceC4814e
    @T1
    public int p2(long j10) {
        return this.f89673a.p2(j10);
    }

    @Override // k0.p
    @T1
    public long s(float f10) {
        return this.f89673a.s(f10);
    }
}
