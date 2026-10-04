package androidx.compose.foundation.layout;

import androidx.compose.runtime.T1;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public final class C1667a implements P0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final P0 f90864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final P0 f90865c;

    public C1667a(@NotNull P0 p02, @NotNull P0 p03) {
        this.f90864b = p02;
        this.f90865c = p03;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int a(@NotNull InterfaceC4814e interfaceC4814e) {
        return this.f90865c.a(interfaceC4814e) + this.f90864b.a(interfaceC4814e);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int b(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return this.f90865c.b(interfaceC4814e, layoutDirection) + this.f90864b.b(interfaceC4814e, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int c(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return this.f90865c.c(interfaceC4814e, layoutDirection) + this.f90864b.c(interfaceC4814e, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int d(@NotNull InterfaceC4814e interfaceC4814e) {
        return this.f90865c.d(interfaceC4814e) + this.f90864b.d(interfaceC4814e);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1667a)) {
            return false;
        }
        C1667a c1667a = (C1667a) obj;
        return kotlin.jvm.internal.G.g(c1667a.f90864b, this.f90864b) && kotlin.jvm.internal.G.g(c1667a.f90865c, this.f90865c);
    }

    public int hashCode() {
        return (this.f90865c.hashCode() * 31) + this.f90864b.hashCode();
    }

    @NotNull
    public String toString() {
        return "(" + this.f90864b + " + " + this.f90865c + ')';
    }
}
