package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    @NotNull
    public static final c a(@NotNull Transition<Boolean> transition) {
        String str = transition.f87902c;
        if (str == null) {
            str = AnimationSearch_androidKt.f105241c;
        }
        return new c(transition, str);
    }
}
