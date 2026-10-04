package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import fd.InterfaceC4421d;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC4421d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g<K, V> f218643a;

    public d(@NotNull PersistentOrderedMapBuilder<K, V> map) {
        G.p(map, "map");
        this.f218643a = new g<>(map.f218630b, map);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        a<V> next = this.f218643a.next();
        g<K, V> gVar = this.f218643a;
        return new b(gVar.f218647b.f218632d, gVar.f218648c, next);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218643a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f218643a.remove();
    }
}
