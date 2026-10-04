package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.U;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f92107a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f92108b = 0;

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    @NotNull
    public androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @Nullable U<Float> u10, @Nullable U<k0.t> u11, @Nullable U<Float> u12) {
        return (u10 == null && u11 == null && u12 == null) ? pVar : pVar.P0(new LazyLayoutAnimateItemElement(u10, u11, u12));
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    public androidx.compose.ui.p b(androidx.compose.ui.p pVar, U u10) {
        return a(pVar, null, u10, null);
    }
}
