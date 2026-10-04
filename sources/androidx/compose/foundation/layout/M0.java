package androidx.compose.foundation.layout;

import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public final class M0 extends AbstractC1670b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final P0 f90558b;

    public M0(@NotNull P0 p02) {
        this.f90558b = p02;
    }

    @Override // androidx.compose.foundation.layout.AbstractC1670b0
    @NotNull
    public P0 a(@NotNull P0 p02) {
        return new L0(this.f90558b, p02);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M0) {
            return kotlin.jvm.internal.G.g(((M0) obj).f90558b, this.f90558b);
        }
        return false;
    }

    public int hashCode() {
        return this.f90558b.hashCode();
    }
}
