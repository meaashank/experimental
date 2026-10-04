package androidx.compose.material;

import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import k0.InterfaceC4814e;
import kotlin.InterfaceC4982o;
import n0.C5238e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@P
@InterfaceC1924k0
@InterfaceC4982o(message = SwipeableKt.f97668a)
public final class Y implements M0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f98520b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f98521a;

    public Y(float f10) {
        this.f98521a = f10;
    }

    public static Y d(Y y10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = y10.f98521a;
        }
        y10.getClass();
        return new Y(f10);
    }

    @Override // androidx.compose.material.M0
    public float a(@NotNull InterfaceC4814e interfaceC4814e, float f10, float f11) {
        return C5238e.j(f10, f11, this.f98521a);
    }

    public final float b() {
        return this.f98521a;
    }

    @NotNull
    public final Y c(float f10) {
        return new Y(f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y) && Float.compare(this.f98521a, ((Y) obj).f98521a) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f98521a);
    }

    @NotNull
    public String toString() {
        return C1571b.a(new StringBuilder("FractionalThreshold(fraction="), this.f98521a, ')');
    }
}
