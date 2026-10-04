package androidx.compose.foundation.layout;

import androidx.compose.runtime.T1;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public final class L0 implements P0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final P0 f90553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final P0 f90554c;

    public L0(@NotNull P0 p02, @NotNull P0 p03) {
        this.f90553b = p02;
        this.f90554c = p03;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int a(@NotNull InterfaceC4814e interfaceC4814e) {
        return Math.max(this.f90553b.a(interfaceC4814e), this.f90554c.a(interfaceC4814e));
    }

    @Override // androidx.compose.foundation.layout.P0
    public int b(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return Math.max(this.f90553b.b(interfaceC4814e, layoutDirection), this.f90554c.b(interfaceC4814e, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.P0
    public int c(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return Math.max(this.f90553b.c(interfaceC4814e, layoutDirection), this.f90554c.c(interfaceC4814e, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.P0
    public int d(@NotNull InterfaceC4814e interfaceC4814e) {
        return Math.max(this.f90553b.d(interfaceC4814e), this.f90554c.d(interfaceC4814e));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        return kotlin.jvm.internal.G.g(l02.f90553b, this.f90553b) && kotlin.jvm.internal.G.g(l02.f90554c, this.f90554c);
    }

    public int hashCode() {
        return (this.f90554c.hashCode() * 31) + this.f90553b.hashCode();
    }

    @NotNull
    public String toString() {
        return "(" + this.f90553b + " ∪ " + this.f90554c + ')';
    }
}
