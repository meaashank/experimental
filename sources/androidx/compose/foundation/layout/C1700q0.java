package androidx.compose.foundation.layout;

import androidx.compose.runtime.T1;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public final class C1700q0 implements P0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC1694n0 f90948b;

    public C1700q0(@NotNull InterfaceC1694n0 interfaceC1694n0) {
        this.f90948b = interfaceC1694n0;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int a(@NotNull InterfaceC4814e interfaceC4814e) {
        return interfaceC4814e.I1(this.f90948b.d());
    }

    @Override // androidx.compose.foundation.layout.P0
    public int b(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return interfaceC4814e.I1(this.f90948b.c(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.P0
    public int c(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return interfaceC4814e.I1(this.f90948b.b(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.P0
    public int d(@NotNull InterfaceC4814e interfaceC4814e) {
        return interfaceC4814e.I1(this.f90948b.a());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1700q0) {
            return kotlin.jvm.internal.G.g(((C1700q0) obj).f90948b, this.f90948b);
        }
        return false;
    }

    public int hashCode() {
        return this.f90948b.hashCode();
    }

    @NotNull
    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return "PaddingValues(" + ((Object) k0.i.u(this.f90948b.b(layoutDirection))) + U6.j.f68738d + ((Object) k0.i.u(this.f90948b.d())) + U6.j.f68738d + ((Object) k0.i.u(this.f90948b.c(layoutDirection))) + U6.j.f68738d + ((Object) k0.i.u(this.f90948b.a())) + ')';
    }
}
