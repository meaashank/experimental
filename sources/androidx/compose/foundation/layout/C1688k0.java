package androidx.compose.foundation.layout;

import androidx.compose.runtime.T1;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public final class C1688k0 implements P0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final P0 f90926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90927c;

    public /* synthetic */ C1688k0(P0 p02, int i10, C4969v c4969v) {
        this(p02, i10);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int a(@NotNull InterfaceC4814e interfaceC4814e) {
        int i10 = this.f90927c;
        b1.f90872b.getClass();
        if (b1.q(i10, b1.f90879i)) {
            return this.f90926b.a(interfaceC4814e);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int b(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        int i10;
        if (layoutDirection == LayoutDirection.Ltr) {
            b1.f90872b.getClass();
            i10 = b1.f90874d;
        } else {
            b1.f90872b.getClass();
            i10 = b1.f90876f;
        }
        if (b1.q(this.f90927c, i10)) {
            return this.f90926b.b(interfaceC4814e, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int c(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        int i10;
        if (layoutDirection == LayoutDirection.Ltr) {
            b1.f90872b.getClass();
            i10 = b1.f90873c;
        } else {
            b1.f90872b.getClass();
            i10 = b1.f90875e;
        }
        if (b1.q(this.f90927c, i10)) {
            return this.f90926b.c(interfaceC4814e, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int d(@NotNull InterfaceC4814e interfaceC4814e) {
        int i10 = this.f90927c;
        b1.f90872b.getClass();
        if (b1.q(i10, b1.f90880j)) {
            return this.f90926b.d(interfaceC4814e);
        }
        return 0;
    }

    @NotNull
    public final P0 e() {
        return this.f90926b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1688k0)) {
            return false;
        }
        C1688k0 c1688k0 = (C1688k0) obj;
        return kotlin.jvm.internal.G.g(this.f90926b, c1688k0.f90926b) && this.f90927c == c1688k0.f90927c;
    }

    public final int f() {
        return this.f90927c;
    }

    public int hashCode() {
        return (this.f90926b.hashCode() * 31) + this.f90927c;
    }

    @NotNull
    public String toString() {
        return "(" + this.f90926b + " only " + ((Object) b1.t(this.f90927c)) + ')';
    }

    public C1688k0(P0 p02, int i10) {
        this.f90926b = p02;
        this.f90927c = i10;
    }
}
