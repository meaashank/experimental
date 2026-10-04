package androidx.compose.ui.focus;

import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends W<C1988c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.l<H, L0> f100541c;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(@NotNull ed.l<? super H, L0> lVar) {
        this.f100541c = lVar;
    }

    public static FocusChangedElement k(FocusChangedElement focusChangedElement, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = focusChangedElement.f100541c;
        }
        focusChangedElement.getClass();
        return new FocusChangedElement(lVar);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && kotlin.jvm.internal.G.g(this.f100541c, ((FocusChangedElement) obj).f100541c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "onFocusChanged";
        c2278s0.f103929c.c("onFocusChanged", this.f100541c);
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((C1988c) dVar).f100649o = this.f100541c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f100541c.hashCode();
    }

    @NotNull
    public final ed.l<H, L0> i() {
        return this.f100541c;
    }

    @NotNull
    public final FocusChangedElement j(@NotNull ed.l<? super H, L0> lVar) {
        return new FocusChangedElement(lVar);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1988c c() {
        return new C1988c(this.f100541c);
    }

    @NotNull
    public final ed.l<H, L0> m() {
        return this.f100541c;
    }

    public void n(@NotNull C1988c c1988c) {
        c1988c.f100649o = this.f100541c;
    }

    @NotNull
    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f100541c + ')';
    }
}
