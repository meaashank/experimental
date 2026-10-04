package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import fd.InterfaceC4419b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4865g;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class h<K, V> extends AbstractC4865g<V> implements Collection<V>, InterfaceC4419b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PersistentOrderedMapBuilder<K, V> f218652a;

    public h(@NotNull PersistentOrderedMapBuilder<K, V> builder) {
        G.p(builder, "builder");
        this.f218652a = builder;
    }

    @Override // kotlin.collections.AbstractC4865g, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f218652a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f218652a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC4865g
    public int getSize() {
        return this.f218652a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return new i(this.f218652a);
    }
}
