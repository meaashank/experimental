package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PersistentHashMapBuilder<K, V> f218571a;

    public f(@NotNull PersistentHashMapBuilder<K, V> builder) {
        G.p(builder, "builder");
        this.f218571a = builder;
    }

    @Override // kotlin.collections.AbstractC4868j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        j((Map.Entry) obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f218571a.clear();
    }

    @Override // kotlinx.collections.immutable.implementations.immutableMap.a
    public boolean g(@NotNull Map.Entry<? extends K, ? extends V> element) {
        G.p(element, "element");
        return ud.f.f239703a.a(this.f218571a, element);
    }

    @Override // kotlin.collections.AbstractC4868j
    public int getSize() {
        return this.f218571a.size();
    }

    @Override // kotlinx.collections.immutable.implementations.immutableMap.a
    public boolean i(@NotNull Map.Entry<? extends K, ? extends V> element) {
        G.p(element, "element");
        return this.f218571a.remove(element.getKey(), element.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new g(this.f218571a);
    }

    public boolean j(@NotNull Map.Entry<K, V> element) {
        G.p(element, "element");
        throw new UnsupportedOperationException();
    }
}
