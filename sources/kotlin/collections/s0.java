package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,111:1\n349#2,6:112\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n*L\n108#1:112,6\n*E\n"})
public final class s0<K, V> implements r0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<K, V> f217647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<K, V> f217648b;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(@NotNull Map<K, V> map, @NotNull ed.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.G.p(map, "map");
        kotlin.jvm.internal.G.p(lVar, "default");
        this.f217647a = map;
        this.f217648b = lVar;
    }

    @Override // kotlin.collections.i0
    public V B1(K k10) {
        Map<K, V> map = this.f217647a;
        V v10 = map.get(k10);
        return (v10 != null || map.containsKey(k10)) ? v10 : this.f217648b.invoke(k10);
    }

    @NotNull
    public Set<Map.Entry<K, V>> b() {
        return this.f217647a.entrySet();
    }

    @Override // java.util.Map
    public void clear() {
        this.f217647a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f217647a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f217647a.containsValue(obj);
    }

    @NotNull
    public Set<K> d() {
        return this.f217647a.keySet();
    }

    @NotNull
    public Collection<V> e() {
        return this.f217647a.values();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f217647a.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return this.f217647a.equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f217647a.get(obj);
    }

    public int getSize() {
        return this.f217647a.size();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f217647a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f217647a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f217647a.keySet();
    }

    @Override // kotlin.collections.r0, kotlin.collections.i0
    @NotNull
    public Map<K, V> n() {
        return this.f217647a;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        return this.f217647a.put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        kotlin.jvm.internal.G.p(from, "from");
        this.f217647a.putAll(from);
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        return this.f217647a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f217647a.size();
    }

    @NotNull
    public String toString() {
        return this.f217647a.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f217647a.values();
    }
}
