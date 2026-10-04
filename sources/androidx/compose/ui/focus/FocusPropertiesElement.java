package androidx.compose.ui.focus;

import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusPropertiesElement extends W<z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final A f100576c;

    public FocusPropertiesElement(@NotNull A a10) {
        this.f100576c = a10;
    }

    public static FocusPropertiesElement k(FocusPropertiesElement focusPropertiesElement, A a10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a10 = focusPropertiesElement.f100576c;
        }
        focusPropertiesElement.getClass();
        return new FocusPropertiesElement(a10);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && kotlin.jvm.internal.G.g(this.f100576c, ((FocusPropertiesElement) obj).f100576c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "focusProperties";
        c2278s0.f103929c.c("scope", this.f100576c);
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((z) dVar).f100670o = this.f100576c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f100576c.hashCode();
    }

    @NotNull
    public final A i() {
        return this.f100576c;
    }

    @NotNull
    public final FocusPropertiesElement j(@NotNull A a10) {
        return new FocusPropertiesElement(a10);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public z c() {
        return new z(this.f100576c);
    }

    @NotNull
    public final A m() {
        return this.f100576c;
    }

    public void n(@NotNull z zVar) {
        zVar.f100670o = this.f100576c;
    }

    @NotNull
    public String toString() {
        return "FocusPropertiesElement(scope=" + this.f100576c + ')';
    }
}
