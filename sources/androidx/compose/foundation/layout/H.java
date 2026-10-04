package androidx.compose.foundation.layout;

import androidx.activity.C1477d;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class H implements P0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90522e;

    public H(int i10, int i11, int i12, int i13) {
        this.f90519b = i10;
        this.f90520c = i11;
        this.f90521d = i12;
        this.f90522e = i13;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int a(@NotNull InterfaceC4814e interfaceC4814e) {
        return this.f90520c;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int b(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return this.f90521d;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int c(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return this.f90519b;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int d(@NotNull InterfaceC4814e interfaceC4814e) {
        return this.f90522e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return this.f90519b == h10.f90519b && this.f90520c == h10.f90520c && this.f90521d == h10.f90521d && this.f90522e == h10.f90522e;
    }

    public int hashCode() {
        return (((((this.f90519b * 31) + this.f90520c) * 31) + this.f90521d) * 31) + this.f90522e;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        sb2.append(this.f90519b);
        sb2.append(", top=");
        sb2.append(this.f90520c);
        sb2.append(", right=");
        sb2.append(this.f90521d);
        sb2.append(", bottom=");
        return C1477d.a(sb2, this.f90522e, ')');
    }
}
