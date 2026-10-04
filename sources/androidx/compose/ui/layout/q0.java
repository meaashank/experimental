package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends p.d implements androidx.compose.ui.node.A {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public ed.l<? super k0.x, L0> f102591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f102592p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f102593q = k0.y.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public q0(@NotNull ed.l<? super k0.x, L0> lVar) {
        this.f102591o = lVar;
    }

    @Override // androidx.compose.ui.node.A
    public /* synthetic */ void D(InterfaceC2188x interfaceC2188x) {
    }

    @Override // androidx.compose.ui.p.d
    public boolean H2() {
        return this.f102592p;
    }

    @Override // androidx.compose.ui.node.A
    public void c0(long j10) {
        if (k0.x.h(this.f102593q, j10)) {
            return;
        }
        this.f102591o.invoke(new k0.x(j10));
        this.f102593q = j10;
    }

    public final void e3(@NotNull ed.l<? super k0.x, L0> lVar) {
        this.f102591o = lVar;
        this.f102593q = k0.y.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
