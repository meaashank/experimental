package androidx.compose.runtime.external.kotlinx.collections.immutable;

import H.d;
import fd.InterfaceC4424g;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface PersistentMap<K, V> extends d<K, V> {

    public interface Builder<K, V> extends Map<K, V>, InterfaceC4424g {
        @NotNull
        PersistentMap<K, V> build();
    }

    @NotNull
    Builder<K, V> builder();

    @NotNull
    PersistentMap<K, V> clear();

    @NotNull
    PersistentMap<K, V> put(K k10, V v10);

    @NotNull
    PersistentMap<K, V> putAll(@NotNull Map<? extends K, ? extends V> map);

    @NotNull
    PersistentMap<K, V> remove(K k10);

    @NotNull
    PersistentMap<K, V> remove(K k10, V v10);
}
