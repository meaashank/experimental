package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(28)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class o0 implements n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final o0 f92213b = new o0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f92214c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f92215d = 0;

    @e.T(28)
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static class a implements m0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f92216b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Magnifier f92217a;

        public a(@NotNull Magnifier magnifier) {
            this.f92217a = magnifier;
        }

        @NotNull
        public final Magnifier a() {
            return this.f92217a;
        }

        @Override // androidx.compose.foundation.m0
        public long b() {
            return k0.y.a(this.f92217a.getWidth(), this.f92217a.getHeight());
        }

        @Override // androidx.compose.foundation.m0
        public void c(long j10, long j11, float f10) {
            this.f92217a.show(P.g.p(j10), P.g.r(j10));
        }

        @Override // androidx.compose.foundation.m0
        public void d() {
            this.f92217a.update();
        }

        @Override // androidx.compose.foundation.m0
        public void dismiss() {
            this.f92217a.dismiss();
        }
    }

    @Override // androidx.compose.foundation.n0
    public boolean b() {
        return f92214c;
    }

    @Override // androidx.compose.foundation.n0
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(@NotNull View view, boolean z10, long j10, float f10, float f11, boolean z11, @NotNull InterfaceC4814e interfaceC4814e, float f12) {
        return new a(new Magnifier(view));
    }
}
