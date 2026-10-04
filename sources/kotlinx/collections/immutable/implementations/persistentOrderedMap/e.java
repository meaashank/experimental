package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import fd.InterfaceC4425h;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC4868j;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e<K, V> extends AbstractC4868j<K> implements Set<K>, InterfaceC4425h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PersistentOrderedMapBuilder<K, V> f218644a;

    public e(@NotNull PersistentOrderedMapBuilder<K, V> builder) {
        G.p(builder, "builder");
        this.f218644a = builder;
    }

    @Override // kotlin.collections.AbstractC4868j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f218644a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f218644a.f218632d.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4868j
    public int getSize() {
        return this.f218644a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<K> iterator() {
        return new f(this.f218644a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f218644a.f218632d.containsKey(obj)) {
            return false;
        }
        this.f218644a.remove(obj);
        return true;
    }
}
