package androidx.compose.foundation.layout;

import androidx.compose.animation.C1635o;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class LayoutWeightElement extends androidx.compose.ui.node.W<C1686j0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90555e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f90556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f90557d;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f90556c = f10;
        this.f90557d = z10;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f90556c == layoutWeightElement.f90556c && this.f90557d == layoutWeightElement.f90557d;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "weight";
        c2278s0.f103928b = Float.valueOf(this.f90556c);
        c2278s0.f103929c.c("weight", Float.valueOf(this.f90556c));
        c2278s0.f103929c.c("fill", Boolean.valueOf(this.f90557d));
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return C1635o.a(this.f90557d) + (Float.floatToIntBits(this.f90556c) * 31);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1686j0 c() {
        return new C1686j0(this.f90556c, this.f90557d);
    }

    public final boolean j() {
        return this.f90557d;
    }

    public final float k() {
        return this.f90556c;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull C1686j0 c1686j0) {
        c1686j0.f90924o = this.f90556c;
        c1686j0.f90925p = this.f90557d;
    }
}
