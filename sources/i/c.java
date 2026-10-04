package I;

import H.e;
import androidx.compose.runtime.internal.r;
import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class c<K, V> implements H.d<K, V>, Map<K, V>, InterfaceC4418a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f50904e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<K, V> f50905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e<K> f50906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final H.a<V> f50907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final e<Map.Entry<K, V>> f50908d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Map<K, ? extends V> map) {
        this.f50905a = map;
        this.f50906b = new d((Collection) map.keySet());
        this.f50907c = new a(map.values());
        this.f50908d = new d((Collection) map.entrySet());
    }

    public final e<Map.Entry<K, V>> b() {
        return this.f50908d;
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
        return this.f50905a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f50905a.containsValue(obj);
    }

    public final e<K> d() {
        return this.f50906b;
    }

    public final H.a<V> e() {
        return this.f50907c;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.f50908d;
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return this.f50905a.equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f50905a.get(obj);
    }

    @Override // H.d
    @NotNull
    /* JADX INFO: renamed from: getKeys */
    public e<K> h() {
        return this.f50906b;
    }

    public int getSize() {
        return this.f50905a.size();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f50905a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f50905a.isEmpty();
    }

    @Override // H.d
    @NotNull
    /* JADX INFO: renamed from: k */
    public H.a<V> i() {
        return this.f50907c;
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f50906b;
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

    @Override // H.d
    @NotNull
    public e<Map.Entry<K, V>> s() {
        return this.f50908d;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f50905a.size();
    }

    @NotNull
    public String toString() {
        return this.f50905a.toString();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f50907c;
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
