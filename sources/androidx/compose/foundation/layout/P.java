package androidx.compose.foundation.layout;

import androidx.compose.animation.C1571b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90606b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f90607a;

    public P(float f10) {
        this.f90607a = f10;
    }

    public static P c(P p10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = p10.f90607a;
        }
        p10.getClass();
        return new P(f10);
    }

    public final float a() {
        return this.f90607a;
    }

    @NotNull
    public final P b(float f10) {
        return new P(f10);
    }

    public final float d() {
        return this.f90607a;
    }

    public final void e(float f10) {
        this.f90607a = f10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && Float.compare(this.f90607a, ((P) obj).f90607a) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f90607a);
    }

    @NotNull
    public String toString() {
        return C1571b.a(new StringBuilder("FlowLayoutData(fillCrossAxisFraction="), this.f90607a, ')');
    }
}
