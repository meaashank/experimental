package androidx.collection;

import fd.InterfaceC4418a;
import java.util.Map;

/* JADX INFO: renamed from: androidx.collection.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1537i0<K, V> implements Map.Entry<K, V>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f86973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f86974b;

    public C1537i0(K k10, V v10) {
        this.f86973a = k10;
        this.f86974b = v10;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f86973a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f86974b;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
