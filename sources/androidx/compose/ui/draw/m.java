package androidx.compose.ui.draw;

import androidx.compose.ui.node.InterfaceC2211o;
import androidx.compose.ui.p;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p.d implements InterfaceC2211o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public ed.l<? super androidx.compose.ui.graphics.drawscope.d, L0> f100520o;

    public m(@NotNull ed.l<? super androidx.compose.ui.graphics.drawscope.d, L0> lVar) {
        this.f100520o = lVar;
    }

    @Override // androidx.compose.ui.node.InterfaceC2211o
    public void N(@NotNull androidx.compose.ui.graphics.drawscope.d dVar) {
        this.f100520o.invoke(dVar);
    }

    @NotNull
    public final ed.l<androidx.compose.ui.graphics.drawscope.d, L0> e3() {
        return this.f100520o;
    }

    public final void f3(@NotNull ed.l<? super androidx.compose.ui.graphics.drawscope.d, L0> lVar) {
        this.f100520o = lVar;
    }

    @Override // androidx.compose.ui.node.InterfaceC2211o
    public /* synthetic */ void g1() {
    }
}
