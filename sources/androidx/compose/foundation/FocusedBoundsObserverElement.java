package androidx.compose.foundation;

import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusedBoundsObserverElement extends androidx.compose.ui.node.W<S> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.l<InterfaceC2188x, L0> f88697c;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusedBoundsObserverElement(@NotNull ed.l<? super InterfaceC2188x, L0> lVar) {
        this.f88697c = lVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        FocusedBoundsObserverElement focusedBoundsObserverElement = obj instanceof FocusedBoundsObserverElement ? (FocusedBoundsObserverElement) obj : null;
        return focusedBoundsObserverElement != null && this.f88697c == focusedBoundsObserverElement.f88697c;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "onFocusedBoundsChanged";
        c2278s0.f103929c.c("onPositioned", this.f88697c);
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((S) dVar).f88857o = this.f88697c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f88697c.hashCode();
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public S c() {
        return new S(this.f88697c);
    }

    @NotNull
    public final ed.l<InterfaceC2188x, L0> j() {
        return this.f88697c;
    }

    public void k(@NotNull S s10) {
        s10.f88857o = this.f88697c;
    }
}
