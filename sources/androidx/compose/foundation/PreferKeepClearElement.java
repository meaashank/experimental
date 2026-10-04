package androidx.compose.foundation;

import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(33)
final class PreferKeepClearElement extends androidx.compose.ui.node.W<s0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ed.l<InterfaceC2188x, P.j> f88845c;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferKeepClearElement(@Nullable ed.l<? super InterfaceC2188x, P.j> lVar) {
        this.f88845c = lVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof s0) && this.f88845c == ((s0) obj).f95068o;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "preferKeepClearBounds";
        ed.l<InterfaceC2188x, P.j> lVar = this.f88845c;
        if (lVar != null) {
            c2278s0.f103929c.c("clearRect", lVar);
        }
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((s0) dVar).f95068o = this.f88845c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        ed.l<InterfaceC2188x, P.j> lVar = this.f88845c;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s0 c() {
        return new s0(this.f88845c);
    }

    @Nullable
    public final ed.l<InterfaceC2188x, P.j> j() {
        return this.f88845c;
    }

    public void k(@NotNull s0 s0Var) {
        s0Var.f95068o = this.f88845c;
    }
}
