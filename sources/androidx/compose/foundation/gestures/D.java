package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Orientation f89294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f89295b;

    /* JADX WARN: Multi-variable type inference failed */
    public D() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final P.g a(@NotNull androidx.compose.ui.input.pointer.A a10, float f10) {
        long jV = P.g.v(this.f89295b, P.g.u(a10.f102148c, a10.f102152g));
        this.f89295b = jV;
        if ((this.f89294a == null ? P.g.m(jV) : Math.abs(e(jV))) >= f10) {
            return new P.g(b(f10));
        }
        return null;
    }

    public final long b(float f10) {
        if (this.f89294a == null) {
            long j10 = this.f89295b;
            return P.g.u(this.f89295b, P.g.x(P.g.j(j10, P.g.m(j10)), f10));
        }
        float fE = e(this.f89295b) - (Math.signum(e(this.f89295b)) * f10);
        float fC = c(this.f89295b);
        return this.f89294a == Orientation.Horizontal ? P.h.a(fE, fC) : P.h.a(fC, fE);
    }

    public final float c(long j10) {
        return this.f89294a == Orientation.Horizontal ? P.g.r(j10) : P.g.p(j10);
    }

    @Nullable
    public final Orientation d() {
        return this.f89294a;
    }

    public final float e(long j10) {
        return this.f89294a == Orientation.Horizontal ? P.g.p(j10) : P.g.r(j10);
    }

    public final void f() {
        P.g.f65503b.getClass();
        this.f89295b = P.g.f65504c;
    }

    public D(@Nullable Orientation orientation) {
        this.f89294a = orientation;
        P.g.f65503b.getClass();
        this.f89295b = P.g.f65504c;
    }

    public /* synthetic */ D(Orientation orientation, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : orientation);
    }
}
