package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1913g1 {
    void a(@NotNull Object obj);

    void d(@NotNull RecomposeScopeImpl recomposeScopeImpl);

    @NotNull
    InvalidationResult g(@NotNull RecomposeScopeImpl recomposeScopeImpl, @Nullable Object obj);
}
