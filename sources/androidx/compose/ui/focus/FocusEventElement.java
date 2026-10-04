package androidx.compose.ui.focus;

import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusEventElement extends W<C1995j> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.l<H, L0> f100542c;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusEventElement(@NotNull ed.l<? super H, L0> lVar) {
        this.f100542c = lVar;
    }

    public static FocusEventElement k(FocusEventElement focusEventElement, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = focusEventElement.f100542c;
        }
        focusEventElement.getClass();
        return new FocusEventElement(lVar);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && kotlin.jvm.internal.G.g(this.f100542c, ((FocusEventElement) obj).f100542c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "onFocusEvent";
        c2278s0.f103929c.c("onFocusEvent", this.f100542c);
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((C1995j) dVar).f100662o = this.f100542c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f100542c.hashCode();
    }

    @NotNull
    public final ed.l<H, L0> i() {
        return this.f100542c;
    }

    @NotNull
    public final FocusEventElement j(@NotNull ed.l<? super H, L0> lVar) {
        return new FocusEventElement(lVar);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1995j c() {
        return new C1995j(this.f100542c);
    }

    @NotNull
    public final ed.l<H, L0> m() {
        return this.f100542c;
    }

    public void n(@NotNull C1995j c1995j) {
        c1995j.f100662o = this.f100542c;
    }

    @NotNull
    public String toString() {
        return "FocusEventElement(onFocusEvent=" + this.f100542c + ')';
    }
}
