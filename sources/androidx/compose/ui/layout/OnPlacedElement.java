package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class OnPlacedElement extends androidx.compose.ui.node.W<m0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.l<InterfaceC2188x, L0> f102489c;

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedElement(@NotNull ed.l<? super InterfaceC2188x, L0> lVar) {
        this.f102489c = lVar;
    }

    public static OnPlacedElement k(OnPlacedElement onPlacedElement, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = onPlacedElement.f102489c;
        }
        onPlacedElement.getClass();
        return new OnPlacedElement(lVar);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && kotlin.jvm.internal.G.g(this.f102489c, ((OnPlacedElement) obj).f102489c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "onPlaced";
        c2278s0.f103929c.c("onPlaced", this.f102489c);
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((m0) dVar).f102589o = this.f102489c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f102489c.hashCode();
    }

    @NotNull
    public final ed.l<InterfaceC2188x, L0> i() {
        return this.f102489c;
    }

    @NotNull
    public final OnPlacedElement j(@NotNull ed.l<? super InterfaceC2188x, L0> lVar) {
        return new OnPlacedElement(lVar);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public m0 c() {
        return new m0(this.f102489c);
    }

    @NotNull
    public final ed.l<InterfaceC2188x, L0> m() {
        return this.f102489c;
    }

    public void n(@NotNull m0 m0Var) {
        m0Var.f102589o = this.f102489c;
    }

    @NotNull
    public String toString() {
        return "OnPlacedElement(onPlaced=" + this.f102489c + ')';
    }
}
