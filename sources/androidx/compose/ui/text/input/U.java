package androidx.compose.ui.text.input;

import androidx.activity.C1477d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class U implements InterfaceC2340i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104768c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104770b;

    public U(int i10, int i11) {
        this.f104769a = i10;
        this.f104770b = i11;
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2340i
    public void a(@NotNull C2342k c2342k) {
        if (c2342k.m()) {
            c2342k.b();
        }
        int iK = md.u.K(this.f104769a, 0, c2342k.f104809a.b());
        int iK2 = md.u.K(this.f104770b, 0, c2342k.f104809a.b());
        if (iK != iK2) {
            if (iK < iK2) {
                c2342k.p(iK, iK2);
            } else {
                c2342k.p(iK2, iK);
            }
        }
    }

    public final int b() {
        return this.f104770b;
    }

    public final int c() {
        return this.f104769a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        return this.f104769a == u10.f104769a && this.f104770b == u10.f104770b;
    }

    public int hashCode() {
        return (this.f104769a * 31) + this.f104770b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f104769a);
        sb2.append(", end=");
        return C1477d.a(sb2, this.f104770b, ')');
    }
}
