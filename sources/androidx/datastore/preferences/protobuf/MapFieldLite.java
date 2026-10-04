package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.V;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MapFieldLite f112661b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f112662a;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f112661b = mapFieldLite;
        mapFieldLite.f112662a = false;
    }

    private MapFieldLite() {
        this.f112662a = true;
    }

    public static <K, V> int a(Map<K, V> map) {
        int iB = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            return V.m((byte[]) obj);
        }
        if (obj instanceof V.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static void d(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            V.d(obj);
            map.get(obj).getClass();
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> f(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), e(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> MapFieldLite<K, V> i() {
        return f112661b;
    }

    public static boolean l(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static <K, V> boolean m(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !l(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public final void j() {
        if (!this.f112662a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean p() {
        return this.f112662a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        j();
        V.d(k10);
        v10.getClass();
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        j();
        d(map);
        super.putAll(map);
    }

    public void q() {
        this.f112662a = false;
    }

    public void r(MapFieldLite<K, V> mapFieldLite) {
        j();
        if (mapFieldLite.isEmpty()) {
            return;
        }
        putAll(mapFieldLite);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        j();
        return (V) super.remove(obj);
    }

    public MapFieldLite<K, V> t() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    public V u(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    public MapFieldLite(Map<K, V> map) {
        super(map);
        this.f112662a = true;
    }
}
