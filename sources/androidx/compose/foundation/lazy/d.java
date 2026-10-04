package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.U;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.H0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class d implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91188c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public H0 f91189a = ActualAndroid_androidKt.c(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public H0 f91190b = ActualAndroid_androidKt.c(Integer.MAX_VALUE);

    @Override // androidx.compose.foundation.lazy.c
    @NotNull
    public androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @Nullable U<Float> u10, @Nullable U<k0.t> u11, @Nullable U<Float> u12) {
        return (u10 == null && u11 == null && u12 == null) ? pVar : pVar.P0(new LazyLayoutAnimateItemElement(u10, u11, u12));
    }

    @Override // androidx.compose.foundation.lazy.c
    public androidx.compose.ui.p b(androidx.compose.ui.p pVar, U u10) {
        return a(pVar, null, u10, null);
    }

    @Override // androidx.compose.foundation.lazy.c
    @NotNull
    public androidx.compose.ui.p c(@NotNull androidx.compose.ui.p pVar, float f10) {
        return pVar.P0(new ParentSizeElement(f10, null, this.f91190b, "fillParentMaxHeight", 2, null));
    }

    @Override // androidx.compose.foundation.lazy.c
    @NotNull
    public androidx.compose.ui.p d(@NotNull androidx.compose.ui.p pVar, float f10) {
        return pVar.P0(new ParentSizeElement(f10, this.f91189a, null, "fillParentMaxWidth", 4, null));
    }

    @Override // androidx.compose.foundation.lazy.c
    @NotNull
    public androidx.compose.ui.p e(@NotNull androidx.compose.ui.p pVar, float f10) {
        return pVar.P0(new ParentSizeElement(f10, this.f91189a, this.f91190b, "fillParentMaxSize"));
    }

    public final void f(int i10, int i11) {
        this.f91189a.setIntValue(i10);
        this.f91190b.setIntValue(i11);
    }
}
