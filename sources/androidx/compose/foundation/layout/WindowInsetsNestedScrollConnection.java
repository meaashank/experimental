package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import k0.InterfaceC4814e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C5102o;
import kotlinx.coroutines.InterfaceC5100n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(30)
@kotlin.jvm.internal.V({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,725:1\n314#2,11:726\n26#3:737\n26#3:738\n26#3:739\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n213#1:726,11\n272#1:737\n273#1:738\n391#1:739\n*E\n"})
public final class WindowInsetsNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.b, WindowInsetsAnimationControlListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1677f f90758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final View f90759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final I0 f90760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC4814e f90761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public WindowInsetsAnimationController f90762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f90763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CancellationSignal f90764g = new CancellationSignal();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f90765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.A0 f90766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public InterfaceC5100n<? super WindowInsetsAnimationController> f90767j;

    public WindowInsetsNestedScrollConnection(@NotNull C1677f c1677f, @NotNull View view, @NotNull I0 i02, @NotNull InterfaceC4814e interfaceC4814e) {
        this.f90758a = c1677f;
        this.f90759b = view;
        this.f90760c = i02;
        this.f90761d = interfaceC4814e;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long H0(long j10, long j11, int i10) {
        return s(j11, this.f90760c.a(P.g.p(j11), P.g.r(j11)));
    }

    public final void i(float f10) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.f90762e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.f90760c.e(windowInsetsAnimationController.getCurrentInsets(), Math.round(f10)), 1.0f, 0.0f);
        }
    }

    public final void j() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.f90762e;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.f90762e) != null) {
            windowInsetsAnimationController.finish(this.f90758a.g());
        }
        this.f90762e = null;
        InterfaceC5100n<? super WindowInsetsAnimationController> interfaceC5100n = this.f90767j;
        if (interfaceC5100n != null) {
            interfaceC5100n.X(null, new ed.l<Throwable, kotlin.L0>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1
                public final void e(@NotNull Throwable th) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Throwable th) {
                    return kotlin.L0.f217464a;
                }
            });
        }
        this.f90767j = null;
        kotlinx.coroutines.A0 a02 = this.f90766i;
        if (a02 != null) {
            a02.a(new WindowInsetsAnimationCancelledException());
        }
        this.f90766i = null;
        this.f90765h = 0.0f;
        this.f90763f = false;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long j2(long j10, int i10) {
        return s(j10, this.f90760c.b(P.g.p(j10), P.g.r(j10)));
    }

    public final void k() {
        InterfaceC5100n<? super WindowInsetsAnimationController> interfaceC5100n = this.f90767j;
        if (interfaceC5100n != null) {
            interfaceC5100n.X(null, new ed.l<Throwable, kotlin.L0>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$dispose$1
                public final void e(@NotNull Throwable th) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Throwable th) {
                    return kotlin.L0.f217464a;
                }
            });
        }
        kotlinx.coroutines.A0 a02 = this.f90766i;
        if (a02 != null) {
            A0.a.b(a02, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f90762e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!kotlin.jvm.internal.G.g(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(long r26, float r28, boolean r29, kotlin.coroutines.e<? super k0.E> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.l(long, float, boolean, kotlin.coroutines.e):java.lang.Object");
    }

    public final Object m(kotlin.coroutines.e<? super WindowInsetsAnimationController> eVar) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.f90762e;
        if (windowInsetsAnimationController != null) {
            return windowInsetsAnimationController;
        }
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        this.f90767j = c5102o;
        r();
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    @Nullable
    public Object m1(long j10, @NotNull kotlin.coroutines.e<? super k0.E> eVar) {
        return l(j10, this.f90760c.b(k0.E.l(j10), k0.E.n(j10)), false, eVar);
    }

    @NotNull
    public final InterfaceC4814e n() {
        return this.f90761d;
    }

    @NotNull
    public final I0 o() {
        return this.f90760c;
    }

    public void onCancelled(@Nullable WindowInsetsAnimationController windowInsetsAnimationController) {
        j();
    }

    public void onFinished(@NotNull WindowInsetsAnimationController windowInsetsAnimationController) {
        j();
    }

    public void onReady(@NotNull WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
        this.f90762e = windowInsetsAnimationController;
        this.f90763f = false;
        InterfaceC5100n<? super WindowInsetsAnimationController> interfaceC5100n = this.f90767j;
        if (interfaceC5100n != null) {
            interfaceC5100n.X(windowInsetsAnimationController, new ed.l<Throwable, kotlin.L0>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1
                public final void e(@NotNull Throwable th) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Throwable th) {
                    return kotlin.L0.f217464a;
                }
            });
        }
        this.f90767j = null;
    }

    @NotNull
    public final View p() {
        return this.f90759b;
    }

    @NotNull
    public final C1677f q() {
        return this.f90758a;
    }

    public final void r() {
        if (this.f90763f) {
            return;
        }
        this.f90763f = true;
        WindowInsetsController windowInsetsController = this.f90759b.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.f90758a.f90911b, -1L, null, this.f90764g, U0.a(this));
        }
    }

    public final long s(long j10, float f10) {
        kotlinx.coroutines.A0 a02 = this.f90766i;
        if (a02 != null) {
            a02.a(new WindowInsetsAnimationCancelledException());
            this.f90766i = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f90762e;
        if (f10 != 0.0f) {
            if (this.f90758a.g() != (f10 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.f90765h = 0.0f;
                    r();
                    return this.f90760c.c(j10);
                }
                int iF = this.f90760c.f(windowInsetsAnimationController.getHiddenStateInsets());
                int iF2 = this.f90760c.f(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iF3 = this.f90760c.f(currentInsets);
                if (iF3 == (f10 > 0.0f ? iF2 : iF)) {
                    this.f90765h = 0.0f;
                    P.g.f65503b.getClass();
                    return P.g.f65504c;
                }
                float f11 = iF3 + f10 + this.f90765h;
                int iK = md.u.K(Math.round(f11), iF, iF2);
                this.f90765h = f11 - Math.round(f11);
                if (iK != iF3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f90760c.e(currentInsets, iK), 1.0f, 0.0f);
                }
                return this.f90760c.c(j10);
            }
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    @Nullable
    public Object s0(long j10, long j11, @NotNull kotlin.coroutines.e<? super k0.E> eVar) {
        return l(j11, this.f90760c.a(k0.E.l(j11), k0.E.n(j11)), true, eVar);
    }
}
