package androidx.compose.foundation.layout;

import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class FillCrossAxisSizeElement extends androidx.compose.ui.node.W<F> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90372d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f90373c;

    public FillCrossAxisSizeElement(float f10) {
        this.f90373c = f10;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        F f10 = obj instanceof F ? (F) obj : null;
        return f10 != null && this.f90373c == f10.f90366o;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "fraction";
        c2278s0.f103928b = Float.valueOf(this.f90373c);
        c2278s0.f103929c.c("fraction", Float.valueOf(this.f90373c));
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((F) dVar).f90366o = this.f90373c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return Float.floatToIntBits(this.f90373c) * 31;
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public F c() {
        return new F(this.f90373c);
    }

    public final float j() {
        return this.f90373c;
    }

    public void k(@NotNull F f10) {
        f10.f90366o = this.f90373c;
    }
}
