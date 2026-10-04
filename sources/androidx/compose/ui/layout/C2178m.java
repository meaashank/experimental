package androidx.compose.ui.layout;

import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.layout.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C2178m implements InterfaceC2171i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102587c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f102588b;

    public C2178m(float f10) {
        this.f102588b = f10;
    }

    public static C2178m d(C2178m c2178m, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c2178m.f102588b;
        }
        c2178m.getClass();
        return new C2178m(f10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC2171i
    public long a(long j10, long j11) {
        float f10 = this.f102588b;
        return D0.a(f10, f10);
    }

    public final float b() {
        return this.f102588b;
    }

    @NotNull
    public final C2178m c(float f10) {
        return new C2178m(f10);
    }

    public final float e() {
        return this.f102588b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2178m) && Float.compare(this.f102588b, ((C2178m) obj).f102588b) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f102588b);
    }

    @NotNull
    public String toString() {
        return C1571b.a(new StringBuilder("FixedScale(value="), this.f102588b, ')');
    }
}
