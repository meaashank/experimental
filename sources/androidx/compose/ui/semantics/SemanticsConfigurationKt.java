package androidx.compose.ui.semantics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsConfigurationKt {
    @Nullable
    public static final <T> T a(@NotNull l lVar, @NotNull SemanticsPropertyKey<T> semanticsPropertyKey) {
        return (T) lVar.t(semanticsPropertyKey, SemanticsConfigurationKt$getOrNull$1.f104023d);
    }
}
