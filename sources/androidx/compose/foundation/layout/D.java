package androidx.compose.foundation.layout;

import androidx.compose.runtime.T1;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public final class D implements P0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final P0 f90351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final P0 f90352c;

    public D(@NotNull P0 p02, @NotNull P0 p03) {
        this.f90351b = p02;
        this.f90352c = p03;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int a(@NotNull InterfaceC4814e interfaceC4814e) {
        int iA = this.f90351b.a(interfaceC4814e) - this.f90352c.a(interfaceC4814e);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int b(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        int iB = this.f90351b.b(interfaceC4814e, layoutDirection) - this.f90352c.b(interfaceC4814e, layoutDirection);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int c(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        int iC = this.f90351b.c(interfaceC4814e, layoutDirection) - this.f90352c.c(interfaceC4814e, layoutDirection);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int d(@NotNull InterfaceC4814e interfaceC4814e) {
        int iD = this.f90351b.d(interfaceC4814e) - this.f90352c.d(interfaceC4814e);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return kotlin.jvm.internal.G.g(d10.f90351b, this.f90351b) && kotlin.jvm.internal.G.g(d10.f90352c, this.f90352c);
    }

    public int hashCode() {
        return this.f90352c.hashCode() + (this.f90351b.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "(" + this.f90351b + " - " + this.f90352c + ')';
    }
}
