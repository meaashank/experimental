package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.U;
import androidx.compose.foundation.L;
import androidx.compose.runtime.T1;
import e.InterfaceC4348w;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
@B
public interface c {

    public static final class a {
        @Deprecated
        @NotNull
        public static androidx.compose.ui.p a(@NotNull c cVar, @NotNull androidx.compose.ui.p pVar, @Nullable U<Float> u10, @Nullable U<k0.t> u11, @Nullable U<Float> u12) {
            return pVar;
        }

        @L
        @Deprecated
        @NotNull
        @InterfaceC4982o(message = "Use Modifier.animateItem() instead", replaceWith = @InterfaceC4852c0(expression = "Modifier.animateItem(fadeInSpec = null, fadeOutSpec = null, placementSpec = animationSpec)", imports = {}))
        public static androidx.compose.ui.p c(@NotNull c cVar, @NotNull androidx.compose.ui.p pVar, @NotNull U<k0.t> u10) {
            return cVar.a(pVar, null, u10, null);
        }
    }

    @NotNull
    androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @Nullable U<Float> u10, @Nullable U<k0.t> u11, @Nullable U<Float> u12);

    @L
    @InterfaceC4982o(message = "Use Modifier.animateItem() instead", replaceWith = @InterfaceC4852c0(expression = "Modifier.animateItem(fadeInSpec = null, fadeOutSpec = null, placementSpec = animationSpec)", imports = {}))
    @NotNull
    androidx.compose.ui.p b(@NotNull androidx.compose.ui.p pVar, @NotNull U<k0.t> u10);

    @NotNull
    androidx.compose.ui.p c(@NotNull androidx.compose.ui.p pVar, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10);

    @NotNull
    androidx.compose.ui.p d(@NotNull androidx.compose.ui.p pVar, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10);

    @NotNull
    androidx.compose.ui.p e(@NotNull androidx.compose.ui.p pVar, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10);
}
