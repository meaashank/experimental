package androidx.compose.foundation.layout;

import androidx.compose.ui.p;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1685j extends p.d implements androidx.compose.ui.node.n0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public androidx.compose.ui.c f90921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f90922p;

    public C1685j(@NotNull androidx.compose.ui.c cVar, boolean z10) {
        this.f90921o = cVar;
        this.f90922p = z10;
    }

    @NotNull
    public final androidx.compose.ui.c e3() {
        return this.f90921o;
    }

    public final boolean f3() {
        return this.f90922p;
    }

    public final void h3(@NotNull androidx.compose.ui.c cVar) {
        this.f90921o = cVar;
    }

    public final void i3(boolean z10) {
        this.f90922p = z10;
    }

    @NotNull
    public C1685j g3(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj) {
        return this;
    }

    @Override // androidx.compose.ui.node.n0
    public Object h0(InterfaceC4814e interfaceC4814e, Object obj) {
        return this;
    }
}
