package sd;

import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rd.InterfaceC5550a;
import rd.InterfaceC5551b;
import rd.InterfaceC5552c;

/* JADX INFO: loaded from: classes5.dex */
public final class c<K, V> implements InterfaceC5551b<K, V>, Map<K, V>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<K, V> f238619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC5552c<K> f238620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC5550a<V> f238621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC5552c<Map.Entry<K, V>> f238622d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Map<K, ? extends V> impl) {
        G.p(impl, "impl");
        this.f238619a = impl;
        this.f238620b = new d(impl.keySet());
        this.f238621c = new C5593a(impl.values());
        this.f238622d = new d(impl.entrySet());
    }

    public final InterfaceC5552c<Map.Entry<K, V>> b() {
        return this.f238622d;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f238619a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f238619a.containsValue(obj);
    }

    public final InterfaceC5552c<K> d() {
        return this.f238620b;
    }

    public final InterfaceC5550a<V> e() {
        return this.f238621c;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.f238622d;
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return this.f238619a.equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f238619a.get(obj);
    }

    @Override // rd.InterfaceC5551b
    @NotNull
    public InterfaceC5552c<K> getKeys() {
        return this.f238620b;
    }

    public int getSize() {
        return this.f238619a.size();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f238619a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f238619a.isEmpty();
    }

    @Override // rd.InterfaceC5551b
    @NotNull
    public InterfaceC5550a<V> k() {
        return this.f238621c;
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f238620b;
    }

    @Override // java.util.Map
    public V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V putIfAbsent(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V replace(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // rd.InterfaceC5551b
    @NotNull
    public InterfaceC5552c<Map.Entry<K, V>> s() {
        return this.f238622d;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f238619a.size();
    }

    @NotNull
    public String toString() {
        return this.f238619a.toString();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f238621c;
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(K k10, V v10, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
