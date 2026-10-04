package androidx.compose.foundation.layout;

import androidx.compose.runtime.T1;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public final class C1674d0 implements InterfaceC1694n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final P0 f90898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4814e f90899b;

    public C1674d0(@NotNull P0 p02, @NotNull InterfaceC4814e interfaceC4814e) {
        this.f90898a = p02;
        this.f90899b = interfaceC4814e;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1694n0
    public float a() {
        InterfaceC4814e interfaceC4814e = this.f90899b;
        return interfaceC4814e.V(this.f90898a.d(interfaceC4814e));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1694n0
    public float b(@NotNull LayoutDirection layoutDirection) {
        InterfaceC4814e interfaceC4814e = this.f90899b;
        return interfaceC4814e.V(this.f90898a.c(interfaceC4814e, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1694n0
    public float c(@NotNull LayoutDirection layoutDirection) {
        InterfaceC4814e interfaceC4814e = this.f90899b;
        return interfaceC4814e.V(this.f90898a.b(interfaceC4814e, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1694n0
    public float d() {
        InterfaceC4814e interfaceC4814e = this.f90899b;
        return interfaceC4814e.V(this.f90898a.a(interfaceC4814e));
    }

    @NotNull
    public final P0 e() {
        return this.f90898a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674d0)) {
            return false;
        }
        C1674d0 c1674d0 = (C1674d0) obj;
        return kotlin.jvm.internal.G.g(this.f90898a, c1674d0.f90898a) && kotlin.jvm.internal.G.g(this.f90899b, c1674d0.f90899b);
    }

    public int hashCode() {
        return this.f90899b.hashCode() + (this.f90898a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f90898a + ", density=" + this.f90899b + ')';
    }
}
