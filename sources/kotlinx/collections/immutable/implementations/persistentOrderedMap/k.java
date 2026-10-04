package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n<K, V> f218655a;

    public k(@NotNull PersistentOrderedMap<K, V> map) {
        G.p(map, "map");
        this.f218655a = new n<>(map.f218622d, map.f218624f);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        n<K, V> nVar = this.f218655a;
        return new kotlinx.collections.immutable.implementations.immutableMap.b(nVar.f218658a, nVar.next().f218637a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218655a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
