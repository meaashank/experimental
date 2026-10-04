package androidx.compose.ui.text.input;

import androidx.activity.C1477d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class W implements InterfaceC2340i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104774c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104776b;

    public W(int i10, int i11) {
        this.f104775a = i10;
        this.f104776b = i11;
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2340i
    public void a(@NotNull C2342k c2342k) {
        int iK = md.u.K(this.f104775a, 0, c2342k.f104809a.b());
        int iK2 = md.u.K(this.f104776b, 0, c2342k.f104809a.b());
        if (iK < iK2) {
            c2342k.r(iK, iK2);
        } else {
            c2342k.r(iK2, iK);
        }
    }

    public final int b() {
        return this.f104776b;
    }

    public final int c() {
        return this.f104775a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return this.f104775a == w10.f104775a && this.f104776b == w10.f104776b;
    }

    public int hashCode() {
        return (this.f104775a * 31) + this.f104776b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f104775a);
        sb2.append(", end=");
        return C1477d.a(sb2, this.f104776b, ')');
    }
}
