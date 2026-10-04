package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends androidx.compose.ui.node.W<C2172i0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.l<InterfaceC2188x, L0> f102488c;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(@NotNull ed.l<? super InterfaceC2188x, L0> lVar) {
        this.f102488c = lVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnGloballyPositionedElement) && this.f102488c == ((OnGloballyPositionedElement) obj).f102488c;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "onGloballyPositioned";
        c2278s0.f103929c.c("onGloballyPositioned", this.f102488c);
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((C2172i0) dVar).f102581o = this.f102488c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f102488c.hashCode();
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C2172i0 c() {
        return new C2172i0(this.f102488c);
    }

    @NotNull
    public final ed.l<InterfaceC2188x, L0> j() {
        return this.f102488c;
    }

    public void k(@NotNull C2172i0 c2172i0) {
        c2172i0.f102581o = this.f102488c;
    }
}
