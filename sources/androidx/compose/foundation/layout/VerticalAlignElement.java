package androidx.compose.foundation.layout;

import androidx.compose.ui.c;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class VerticalAlignElement extends androidx.compose.ui.node.W<O0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90709d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c.InterfaceC0245c f90710c;

    public VerticalAlignElement(@NotNull c.InterfaceC0245c interfaceC0245c) {
        this.f90710c = interfaceC0245c;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return kotlin.jvm.internal.G.g(this.f90710c, verticalAlignElement.f90710c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "align";
        c2278s0.f103928b = this.f90710c;
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((O0) dVar).f90581o = this.f90710c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f90710c.hashCode();
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public O0 c() {
        return new O0(this.f90710c);
    }

    @NotNull
    public final c.InterfaceC0245c j() {
        return this.f90710c;
    }

    public void k(@NotNull O0 o02) {
        o02.f90581o = this.f90710c;
    }
}
