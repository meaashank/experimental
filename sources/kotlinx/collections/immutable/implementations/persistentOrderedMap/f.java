package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import fd.InterfaceC4421d;
import java.util.Iterator;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f<K, V> implements Iterator<K>, InterfaceC4421d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g<K, V> f218645a;

    public f(@NotNull PersistentOrderedMapBuilder<K, V> map) {
        G.p(map, "map");
        this.f218645a = new g<>(map.f218630b, map);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218645a.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        this.f218645a.next();
        return (K) this.f218645a.f218648c;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f218645a.remove();
    }
}
