package androidx.compose.ui.layout;

import androidx.compose.ui.node.InterfaceC2213q;
import androidx.compose.ui.p;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.layout.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2172i0 extends p.d implements InterfaceC2213q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public ed.l<? super InterfaceC2188x, L0> f102581o;

    public C2172i0(@NotNull ed.l<? super InterfaceC2188x, L0> lVar) {
        this.f102581o = lVar;
    }

    @NotNull
    public final ed.l<InterfaceC2188x, L0> e3() {
        return this.f102581o;
    }

    public final void f3(@NotNull ed.l<? super InterfaceC2188x, L0> lVar) {
        this.f102581o = lVar;
    }

    @Override // androidx.compose.ui.node.InterfaceC2213q
    public void n0(@NotNull InterfaceC2188x interfaceC2188x) {
        this.f102581o.invoke(interfaceC2188x);
    }
}
