package androidx.compose.ui.layout;

import androidx.compose.ui.platform.C2278s0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class OnSizeChangedModifier extends androidx.compose.ui.node.W<q0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.l<k0.x, L0> f102490c;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(@NotNull ed.l<? super k0.x, L0> lVar) {
        this.f102490c = lVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnSizeChangedModifier) && this.f102490c == ((OnSizeChangedModifier) obj).f102490c;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "onSizeChanged";
        c2278s0.f103929c.c("onSizeChanged", this.f102490c);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f102490c.hashCode();
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public q0 c() {
        return new q0(this.f102490c);
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull q0 q0Var) {
        q0Var.e3(this.f102490c);
    }
}
