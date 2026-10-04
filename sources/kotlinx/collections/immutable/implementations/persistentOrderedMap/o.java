package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.collections.AbstractC4855b;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import rd.InterfaceC5550a;

/* JADX INFO: loaded from: classes5.dex */
public final class o<K, V> extends AbstractC4855b<V> implements InterfaceC5550a<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PersistentOrderedMap<K, V> f218661a;

    public o(@NotNull PersistentOrderedMap<K, V> map) {
        G.p(map, "map");
        this.f218661a = map;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f218661a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f218661a.getSize();
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<V> iterator() {
        return new p(this.f218661a);
    }
}
