package androidx.compose.ui.input.pointer;

import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    @InterfaceC4982o(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @InterfaceC4852c0(expression = "isConsumed", imports = {}))
    public static final boolean a(@NotNull A a10) {
        return a10.D();
    }

    public static final boolean b(@NotNull A a10) {
        return (a10.D() || a10.f102153h || !a10.f102149d) ? false : true;
    }

    public static final boolean c(@NotNull A a10) {
        return !a10.f102153h && a10.f102149d;
    }

    public static final boolean d(@NotNull A a10) {
        return (a10.D() || !a10.f102153h || a10.f102149d) ? false : true;
    }

    public static final boolean e(@NotNull A a10) {
        return a10.f102153h && !a10.f102149d;
    }

    @InterfaceC4982o(message = "Use consume() instead", replaceWith = @InterfaceC4852c0(expression = "consume()", imports = {}))
    public static final void f(@NotNull A a10) {
        a10.a();
    }

    @InterfaceC4982o(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @InterfaceC4852c0(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void g(@NotNull A a10) {
        if (a10.f102149d != a10.f102153h) {
            a10.a();
        }
    }

    @InterfaceC4982o(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @InterfaceC4852c0(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void h(@NotNull A a10) {
        long jN = n(a10, false);
        P.g.f65503b.getClass();
        if (P.g.l(jN, P.g.f65504c)) {
            return;
        }
        a10.a();
    }

    @InterfaceC4982o(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @InterfaceC4852c0(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    public static final boolean i(@NotNull A a10, long j10) {
        long j11 = a10.f102148c;
        float fP = P.g.p(j11);
        float fR = P.g.r(j11);
        return fP < 0.0f || fP > ((float) ((int) (j10 >> 32))) || fR < 0.0f || fR > ((float) ((int) (j10 & ZipKt.f225990j)));
    }

    public static final boolean j(@NotNull A a10, long j10, long j11) {
        int i10 = a10.f102154i;
        O.f102192b.getClass();
        if (i10 != O.f102194d) {
            return i(a10, j10);
        }
        long j12 = a10.f102148c;
        float fP = P.g.p(j12);
        float fR = P.g.r(j12);
        return fP < (-P.n.t(j11)) || fP > P.n.t(j11) + ((float) ((int) (j10 >> 32))) || fR < (-P.n.m(j11)) || fR > P.n.m(j11) + ((float) ((int) (j10 & ZipKt.f225990j)));
    }

    public static final long k(@NotNull A a10) {
        return n(a10, false);
    }

    @InterfaceC4982o(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @InterfaceC4852c0(expression = "isConsumed", imports = {}))
    public static final boolean l(@NotNull A a10) {
        return a10.D();
    }

    public static final long m(@NotNull A a10) {
        return n(a10, true);
    }

    public static final long n(A a10, boolean z10) {
        long jU = P.g.u(a10.f102148c, a10.f102152g);
        if (z10 || !a10.D()) {
            return jU;
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    public static /* synthetic */ long o(A a10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return n(a10, z10);
    }

    public static final boolean p(@NotNull A a10) {
        long jN = n(a10, false);
        P.g.f65503b.getClass();
        return !P.g.l(jN, P.g.f65504c);
    }

    public static final boolean q(@NotNull A a10) {
        long jN = n(a10, true);
        P.g.f65503b.getClass();
        return !P.g.l(jN, P.g.f65504c);
    }
}
