package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import fd.InterfaceC4421d;
import java.util.Iterator;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i<K, V> implements Iterator<V>, InterfaceC4421d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g<K, V> f218653a;

    public i(@NotNull PersistentOrderedMapBuilder<K, V> map) {
        G.p(map, "map");
        this.f218653a = new g<>(map.f218630b, map);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218653a.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.f218653a.next().f218637a;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f218653a.remove();
    }
}
