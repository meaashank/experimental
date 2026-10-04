package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class p<K, V> implements Iterator<V>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n<K, V> f218662a;

    public p(@NotNull PersistentOrderedMap<K, V> map) {
        G.p(map, "map");
        this.f218662a = new n<>(map.f218622d, map.f218624f);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218662a.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.f218662a.next().f218637a;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
