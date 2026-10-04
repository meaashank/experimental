package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface PersistentCompositionLocalMap extends PersistentMap<A<Object>, i2<Object>>, D, B {

    public interface Builder extends PersistentMap.Builder<A<Object>, i2<Object>> {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        @NotNull
        PersistentMap<A<Object>, i2<Object>> build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    PersistentMap.Builder<A<Object>, i2<Object>> builder();

    @Override // androidx.compose.runtime.B
    <T> T c(@NotNull A<T> a10);

    @NotNull
    PersistentCompositionLocalMap y(@NotNull A<Object> a10, @NotNull i2<Object> i2Var);
}
