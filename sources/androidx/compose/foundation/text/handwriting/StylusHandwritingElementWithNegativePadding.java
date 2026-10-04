package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends W<StylusHandwritingNodeWithNegativePadding> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<Boolean> f93583c;

    public StylusHandwritingElementWithNegativePadding(@NotNull InterfaceC4376a<Boolean> interfaceC4376a) {
        this.f93583c = interfaceC4376a;
    }

    public static StylusHandwritingElementWithNegativePadding k(StylusHandwritingElementWithNegativePadding stylusHandwritingElementWithNegativePadding, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC4376a = stylusHandwritingElementWithNegativePadding.f93583c;
        }
        stylusHandwritingElementWithNegativePadding.getClass();
        return new StylusHandwritingElementWithNegativePadding(interfaceC4376a);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && G.g(this.f93583c, ((StylusHandwritingElementWithNegativePadding) obj).f93583c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "stylusHandwriting";
        c2278s0.f103929c.c("onHandwritingSlopExceeded", this.f93583c);
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((StylusHandwritingNodeWithNegativePadding) dVar).f93585r = this.f93583c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f93583c.hashCode();
    }

    @NotNull
    public final InterfaceC4376a<Boolean> i() {
        return this.f93583c;
    }

    @NotNull
    public final StylusHandwritingElementWithNegativePadding j(@NotNull InterfaceC4376a<Boolean> interfaceC4376a) {
        return new StylusHandwritingElementWithNegativePadding(interfaceC4376a);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public StylusHandwritingNodeWithNegativePadding c() {
        return new StylusHandwritingNodeWithNegativePadding(this.f93583c);
    }

    @NotNull
    public final InterfaceC4376a<Boolean> m() {
        return this.f93583c;
    }

    public void n(@NotNull StylusHandwritingNodeWithNegativePadding stylusHandwritingNodeWithNegativePadding) {
        stylusHandwritingNodeWithNegativePadding.f93585r = this.f93583c;
    }

    @NotNull
    public String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f93583c + ')';
    }
}
