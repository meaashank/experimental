package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends p.d implements androidx.compose.ui.node.A {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public ed.l<? super InterfaceC2188x, L0> f102589o;

    public m0(@NotNull ed.l<? super InterfaceC2188x, L0> lVar) {
        this.f102589o = lVar;
    }

    @Override // androidx.compose.ui.node.A
    public void D(@NotNull InterfaceC2188x interfaceC2188x) {
        this.f102589o.invoke(interfaceC2188x);
    }

    @Override // androidx.compose.ui.node.A
    public /* synthetic */ void c0(long j10) {
    }

    @NotNull
    public final ed.l<InterfaceC2188x, L0> e3() {
        return this.f102589o;
    }

    public final void f3(@NotNull ed.l<? super InterfaceC2188x, L0> lVar) {
        this.f102589o = lVar;
    }
}
