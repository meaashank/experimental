package androidx.compose.foundation.layout;

import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public final class C1696o0 extends AbstractC1670b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC1694n0 f90940b;

    public C1696o0(@NotNull InterfaceC1694n0 interfaceC1694n0) {
        this.f90940b = interfaceC1694n0;
    }

    @Override // androidx.compose.foundation.layout.AbstractC1670b0
    @NotNull
    public P0 a(@NotNull P0 p02) {
        return new C1667a(new C1700q0(this.f90940b), p02);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1696o0) {
            return kotlin.jvm.internal.G.g(((C1696o0) obj).f90940b, this.f90940b);
        }
        return false;
    }

    public int hashCode() {
        return this.f90940b.hashCode();
    }
}
