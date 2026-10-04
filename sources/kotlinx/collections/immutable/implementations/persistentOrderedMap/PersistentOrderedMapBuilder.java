package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4867i;
import kotlin.jvm.internal.G;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class PersistentOrderedMapBuilder<K, V> extends AbstractC4867i<K, V> implements PersistentMap.Builder<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public PersistentOrderedMap<K, V> f218629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Object f218630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Object f218631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PersistentHashMapBuilder<K, a<V>> f218632d;

    public PersistentOrderedMapBuilder(@NotNull PersistentOrderedMap<K, V> map) {
        G.p(map, "map");
        this.f218629a = map;
        this.f218630b = map.f218622d;
        this.f218631c = map.f218623e;
        PersistentHashMap<K, a<V>> persistentHashMap = map.f218624f;
        persistentHashMap.getClass();
        this.f218632d = new PersistentHashMapBuilder<>(persistentHashMap);
    }

    @Nullable
    public final Object b() {
        return this.f218630b;
    }

    @Override // kotlinx.collections.immutable.PersistentMap.Builder
    @NotNull
    public PersistentMap<K, V> build() {
        PersistentHashMap<K, a<V>> persistentHashMapBuild = this.f218632d.build();
        PersistentOrderedMap<K, V> persistentOrderedMap = this.f218629a;
        if (persistentHashMapBuild == persistentOrderedMap.f218624f) {
            Object obj = persistentOrderedMap.f218622d;
            Object obj2 = persistentOrderedMap.f218623e;
        } else {
            persistentOrderedMap = new PersistentOrderedMap<>(this.f218630b, this.f218631c, persistentHashMapBuild);
        }
        this.f218629a = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f218632d.clear();
        ud.c cVar = ud.c.f239701a;
        this.f218630b = cVar;
        this.f218631c = cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f218632d.containsKey(obj);
    }

    @NotNull
    public final PersistentHashMapBuilder<K, a<V>> d() {
        return this.f218632d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map<?, ?> map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        return map instanceof PersistentOrderedMap ? this.f218632d.f218552c.s(((PersistentOrderedMap) obj).f218624f.f218544d, new ed.p<a<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder.equals.1
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull a<V> a10, @NotNull a<? extends Object> b10) {
                G.p(a10, "a");
                G.p(b10, "b");
                return Boolean.valueOf(G.g(a10.f218637a, b10.f218637a));
            }
        }) : map instanceof PersistentOrderedMapBuilder ? this.f218632d.f218552c.s(((PersistentOrderedMapBuilder) obj).f218632d.f218552c, new ed.p<a<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder.equals.2
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull a<V> a10, @NotNull a<? extends Object> b10) {
                G.p(a10, "a");
                G.p(b10, "b");
                return Boolean.valueOf(G.g(a10.f218637a, b10.f218637a));
            }
        }) : map instanceof PersistentHashMap ? this.f218632d.f218552c.s(((PersistentHashMap) obj).f218544d, new ed.p<a<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder.equals.3
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull a<V> a10, @Nullable Object obj2) {
                G.p(a10, "a");
                return Boolean.valueOf(G.g(a10.f218637a, obj2));
            }
        }) : map instanceof PersistentHashMapBuilder ? this.f218632d.f218552c.s(((PersistentHashMapBuilder) obj).f218552c, new ed.p<a<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder.equals.4
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull a<V> a10, @Nullable Object obj2) {
                G.p(a10, "a");
                return Boolean.valueOf(G.g(a10.f218637a, obj2));
            }
        }) : ud.f.f239703a.b(this, map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(Object obj) {
        a<V> aVar = this.f218632d.get(obj);
        if (aVar != null) {
            return aVar.f218637a;
        }
        return null;
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new c(this);
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Set<K> getKeys() {
        return new e(this);
    }

    @Override // kotlin.collections.AbstractC4867i
    public int getSize() {
        return this.f218632d.size();
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Collection<V> getValues() {
        return new h(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return ud.f.f239703a.c(this);
    }

    @Override // kotlin.collections.AbstractC4867i, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        a<V> aVar = this.f218632d.get(k10);
        if (aVar != null) {
            if (aVar.f218637a == v10) {
                return v10;
            }
            this.f218632d.put(k10, aVar.h(v10));
            return aVar.f218637a;
        }
        if (isEmpty()) {
            this.f218630b = k10;
            this.f218631c = k10;
            this.f218632d.put(k10, new a<>(v10));
            return null;
        }
        Object obj = this.f218631c;
        a<V> aVar2 = this.f218632d.get(obj);
        G.m(aVar2);
        a<V> aVar3 = aVar2;
        aVar3.a();
        this.f218632d.put((K) obj, aVar3.f(k10));
        this.f218632d.put(k10, new a<>(v10, obj));
        this.f218631c = k10;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(Object obj) {
        a<V> aVarRemove = this.f218632d.remove(obj);
        if (aVarRemove == null) {
            return null;
        }
        if (aVarRemove.b()) {
            a<V> aVar = this.f218632d.get(aVarRemove.f218638b);
            G.m(aVar);
            this.f218632d.put((K) aVarRemove.f218638b, aVar.f(aVarRemove.f218639c));
        } else {
            this.f218630b = aVarRemove.f218639c;
        }
        if (aVarRemove.a()) {
            a<V> aVar2 = this.f218632d.get(aVarRemove.f218639c);
            G.m(aVar2);
            this.f218632d.put((K) aVarRemove.f218639c, aVar2.g(aVarRemove.f218638b));
        } else {
            this.f218631c = aVarRemove.f218638b;
        }
        return aVarRemove.f218637a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        a<V> aVar = this.f218632d.get(obj);
        if (aVar == null || !G.g(aVar.f218637a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
