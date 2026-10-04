package kotlin.collections.builders;

import fd.InterfaceC4419b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4865g;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e<V> extends AbstractC4865g<V> implements Collection<V>, InterfaceC4419b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MapBuilder<?, V> f217598a;

    public e(@NotNull MapBuilder<?, V> backing) {
        G.p(backing, "backing");
        this.f217598a = backing;
    }

    @Override // kotlin.collections.AbstractC4865g, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends V> elements) {
        G.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final MapBuilder<?, V> b() {
        return this.f217598a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f217598a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f217598a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC4865g
    public int getSize() {
        return this.f217598a.f217574i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f217598a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        MapBuilder<?, V> mapBuilder = this.f217598a;
        mapBuilder.getClass();
        return new MapBuilder.f(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f217598a.U(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> elements) {
        G.p(elements, "elements");
        this.f217598a.r();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> elements) {
        G.p(elements, "elements");
        this.f217598a.r();
        return super.retainAll(elements);
    }
}
