package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MapBuilder<K, V> f217596a;

    public c(@NotNull MapBuilder<K, V> backing) {
        G.p(backing, "backing");
        this.f217596a = backing;
    }

    @Override // kotlin.collections.AbstractC4868j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        i((Map.Entry) obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> elements) {
        G.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f217596a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<?> elements) {
        G.p(elements, "elements");
        return this.f217596a.u(elements);
    }

    @Override // kotlin.collections.builders.a
    public boolean g(@NotNull Map.Entry<? extends K, ? extends V> element) {
        G.p(element, "element");
        return this.f217596a.v(element);
    }

    @Override // kotlin.collections.AbstractC4868j
    public int getSize() {
        return this.f217596a.f217574i;
    }

    @Override // kotlin.collections.builders.a
    public boolean h(@NotNull Map.Entry<K, V> element) {
        G.p(element, "element");
        return this.f217596a.Q(element);
    }

    public boolean i(@NotNull Map.Entry<K, V> element) {
        G.p(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f217596a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        MapBuilder<K, V> mapBuilder = this.f217596a;
        mapBuilder.getClass();
        return new MapBuilder.b(mapBuilder);
    }

    @NotNull
    public final MapBuilder<K, V> j() {
        return this.f217596a;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<?> elements) {
        G.p(elements, "elements");
        this.f217596a.r();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<?> elements) {
        G.p(elements, "elements");
        this.f217596a.r();
        return super.retainAll(elements);
    }
}
