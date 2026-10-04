package dagger.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class h<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, V> f194929a;

    public h(int size) {
        this.f194929a = b.d(size);
    }

    public static <K, V> h<K, V> b(int size) {
        return new h<>(size);
    }

    public Map<K, V> a() {
        return this.f194929a.size() != 0 ? Collections.unmodifiableMap(this.f194929a) : Collections.EMPTY_MAP;
    }

    public h<K, V> c(K key, V value) {
        this.f194929a.put(key, value);
        return this;
    }
}
