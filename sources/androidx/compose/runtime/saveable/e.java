package androidx.compose.runtime.saveable;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface e<Original, Saveable> {
    @Nullable
    Saveable a(@NotNull f fVar, Original original);

    @Nullable
    Original b(@NotNull Saveable saveable);
}
