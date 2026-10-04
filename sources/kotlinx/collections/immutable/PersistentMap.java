package kotlinx.collections.immutable;

import fd.InterfaceC4424g;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import rd.InterfaceC5551b;

/* JADX INFO: loaded from: classes5.dex */
public interface PersistentMap<K, V> extends InterfaceC5551b<K, V> {

    public interface Builder<K, V> extends Map<K, V>, InterfaceC4424g {
        @NotNull
        PersistentMap<K, V> build();
    }

    @NotNull
    Builder<K, V> builder();

    @Override // java.util.Map
    @NotNull
    PersistentMap<K, V> clear();

    @Override // java.util.Map
    @NotNull
    PersistentMap<K, V> put(K k10, V v10);

    @Override // java.util.Map
    @NotNull
    PersistentMap<K, V> putAll(@NotNull Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    @NotNull
    PersistentMap<K, V> remove(K k10);

    @Override // java.util.Map
    @NotNull
    PersistentMap<K, V> remove(K k10, V v10);
}
