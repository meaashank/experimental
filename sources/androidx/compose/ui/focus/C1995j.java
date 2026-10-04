package androidx.compose.ui.focus;

import androidx.compose.ui.p;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.focus.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1995j extends p.d implements InterfaceC1993h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public ed.l<? super H, L0> f100662o;

    public C1995j(@NotNull ed.l<? super H, L0> lVar) {
        this.f100662o = lVar;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1993h
    public void a0(@NotNull H h10) {
        this.f100662o.invoke(h10);
    }

    @NotNull
    public final ed.l<H, L0> e3() {
        return this.f100662o;
    }

    public final void f3(@NotNull ed.l<? super H, L0> lVar) {
        this.f100662o = lVar;
    }
}
