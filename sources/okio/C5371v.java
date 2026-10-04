package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5371v extends g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public g0 f226101f;

    public C5371v(@NotNull g0 delegate) {
        kotlin.jvm.internal.G.p(delegate, "delegate");
        this.f226101f = delegate;
    }

    @Override // okio.g0
    @NotNull
    public g0 a() {
        return this.f226101f.a();
    }

    @Override // okio.g0
    @NotNull
    public g0 b() {
        return this.f226101f.b();
    }

    @Override // okio.g0
    public long d() {
        return this.f226101f.d();
    }

    @Override // okio.g0
    @NotNull
    public g0 e(long j10) {
        return this.f226101f.e(j10);
    }

    @Override // okio.g0
    public boolean f() {
        return this.f226101f.f();
    }

    @Override // okio.g0
    public void h() throws IOException {
        this.f226101f.h();
    }

    @Override // okio.g0
    @NotNull
    public g0 i(long j10, @NotNull TimeUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        return this.f226101f.i(j10, unit);
    }

    @Override // okio.g0
    public long j() {
        return this.f226101f.j();
    }

    @dd.j(name = "delegate")
    @NotNull
    public final g0 l() {
        return this.f226101f;
    }

    @NotNull
    public final C5371v m(@NotNull g0 delegate) {
        kotlin.jvm.internal.G.p(delegate, "delegate");
        this.f226101f = delegate;
        return this;
    }

    public final /* synthetic */ void n(g0 g0Var) {
        kotlin.jvm.internal.G.p(g0Var, "<set-?>");
        this.f226101f = g0Var;
    }
}
