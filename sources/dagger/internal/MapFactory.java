package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class MapFactory<K, V> implements e<Map<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Provider<Map<Object, Object>> f194913b = g.a(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, Provider<V>> f194914a;

    public static final class Builder<K, V> {
        private final LinkedHashMap<K, Provider<V>> map;

        public MapFactory<K, V> build() {
            return new MapFactory<>(this.map);
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

    public static <K, V> Provider<Map<K, V>> b() {
        return (Provider<Map<K, V>>) f194913b;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map<K, V> get() {
        LinkedHashMap linkedHashMapD = b.d(this.f194914a.size());
        for (Map.Entry<K, Provider<V>> entry : this.f194914a.entrySet()) {
            linkedHashMapD.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapD);
    }

    public MapFactory(Map<K, Provider<V>> map) {
        this.f194914a = Collections.unmodifiableMap(map);
    }
}
