package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.U;
import androidx.compose.foundation.L;
import androidx.compose.runtime.T1;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
@s
public interface j {
    @NotNull
    androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @Nullable U<Float> u10, @Nullable U<k0.t> u11, @Nullable U<Float> u12);

    @L
    @InterfaceC4982o(message = "Use Modifier.animateItem() instead", replaceWith = @InterfaceC4852c0(expression = "Modifier.animateItem(fadeInSpec = null, fadeOutSpec = null, placementSpec = animationSpec)", imports = {}))
    @NotNull
    androidx.compose.ui.p b(@NotNull androidx.compose.ui.p pVar, @NotNull U<k0.t> u10);
}
