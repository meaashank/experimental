package kotlinx.collections.immutable.implementations.immutableMap;

import fd.InterfaceC4419b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4865g;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j<K, V> extends AbstractC4865g<V> implements Collection<V>, InterfaceC4419b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PersistentHashMapBuilder<K, V> f218574a;

    public j(@NotNull PersistentHashMapBuilder<K, V> builder) {
        G.p(builder, "builder");
        this.f218574a = builder;
    }

    @Override // kotlin.collections.AbstractC4865g, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f218574a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f218574a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC4865g
    public int getSize() {
        return this.f218574a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return new k(this.f218574a);
    }
}
