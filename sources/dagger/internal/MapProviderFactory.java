package dagger.internal;

import bc.InterfaceC2854d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class MapProviderFactory<K, V> implements e<Map<K, Provider<V>>>, InterfaceC2854d<Map<K, Provider<V>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, Provider<V>> f194915a;

    public static final class Builder<K, V> {
        private final LinkedHashMap<K, Provider<V>> map;

        public MapProviderFactory<K, V> build() {
            return new MapProviderFactory<>(this.map);
        }

        public Builder<K, V> put(K key, Provider<V> providerOfValue) {
            LinkedHashMap<K, Provider<V>> linkedHashMap = this.map;
            j.b(key, "key");
            j.b(providerOfValue, "provider");
            linkedHashMap.put(key, providerOfValue);
            return this;
        }

        private Builder(int size) {
            this.map = b.d(size);
        }
    }

    public static <K, V> Builder<K, V> a(int size) {
        return new Builder<>(size);
    }

    public Map<K, Provider<V>> b() {
        return this.f194915a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f194915a;
    }

    public MapProviderFactory(Map<K, Provider<V>> contributingMap) {
        this.f194915a = Collections.unmodifiableMap(contributingMap);
    }
}
