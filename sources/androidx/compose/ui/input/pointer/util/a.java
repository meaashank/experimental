package androidx.compose.ui.input.pointer.util;

import P.g;
import V.c;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import k0.E;
import k0.F;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,734:1\n42#2,7:735\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n*L\n105#1:735,7\n*E\n"})
@r(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f102342f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final VelocityTracker1D.Strategy f102343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final VelocityTracker1D f102344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final VelocityTracker1D f102345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f102346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f102347e;

    public a() {
        VelocityTracker1D.Strategy strategy = c.f74452f ? VelocityTracker1D.Strategy.Impulse : VelocityTracker1D.Strategy.Lsq2;
        this.f102343a = strategy;
        boolean z10 = false;
        int i10 = 1;
        C4969v c4969v = null;
        this.f102344b = new VelocityTracker1D(z10, strategy, i10, c4969v);
        this.f102345c = new VelocityTracker1D(z10, strategy, i10, c4969v);
        g.f65503b.getClass();
        this.f102346d = g.f65504c;
    }

    public static /* synthetic */ void f() {
    }

    public final void a(long j10, long j11) {
        this.f102344b.a(j10, g.p(j11));
        this.f102345c.a(j10, g.r(j11));
    }

    public final long b() {
        return c(F.a(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long c(long j10) {
        if (E.l(j10) > 0.0f && E.n(j10) > 0.0f) {
            return F.a(this.f102344b.d(E.l(j10)), this.f102345c.d(E.n(j10)));
        }
        W.a.g("maximumVelocity should be a positive value. You specified=" + ((Object) E.t(j10)));
        throw null;
    }

    public final long d() {
        return this.f102346d;
    }

    public final long e() {
        return this.f102347e;
    }

    public final void g() {
        this.f102344b.f();
        this.f102345c.f();
        this.f102347e = 0L;
    }

    public final void h(long j10) {
        this.f102346d = j10;
    }

    public final void i(long j10) {
        this.f102347e = j10;
    }
}
