package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4867i;
import kotlin.jvm.internal.G;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class PersistentHashMapBuilder<K, V> extends AbstractC4867i<K, V> implements PersistentMap.Builder<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public PersistentHashMap<K, V> f218550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public ud.g f218551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public s<K, V> f218552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public V f218553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f218555f;

    public PersistentHashMapBuilder(@NotNull PersistentHashMap<K, V> map) {
        G.p(map, "map");
        this.f218550a = map;
        this.f218551b = new ud.g();
        this.f218552c = map.f218544d;
        this.f218555f = map.getSize();
    }

    @Override // kotlinx.collections.immutable.PersistentMap.Builder
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PersistentHashMap<K, V> build() {
        s<K, V> sVar = this.f218552c;
        PersistentHashMap<K, V> persistentHashMap = this.f218550a;
        if (sVar != persistentHashMap.f218544d) {
            this.f218551b = new ud.g();
            persistentHashMap = new PersistentHashMap<>(this.f218552c, size());
        }
        this.f218550a = persistentHashMap;
        return persistentHashMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        s.f218579e.getClass();
        s<K, V> sVar = s.f218580f;
        G.n(sVar, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f218552c = sVar;
        setSize(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f218552c.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final int d() {
        return this.f218554e;
    }

    @NotNull
    public final s<K, V> e() {
        return this.f218552c;
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
        return map instanceof PersistentHashMap ? this.f218552c.s(((PersistentHashMap) obj).f218544d, new ed.p<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder.equals.1
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(V v10, @Nullable Object obj2) {
                return Boolean.valueOf(G.g(v10, obj2));
            }
        }) : map instanceof PersistentHashMapBuilder ? this.f218552c.s(((PersistentHashMapBuilder) obj).f218552c, new ed.p<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder.equals.2
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(V v10, @Nullable Object obj2) {
                return Boolean.valueOf(G.g(v10, obj2));
            }
        }) : map instanceof PersistentOrderedMap ? this.f218552c.s(((PersistentOrderedMap) obj).f218624f.f218544d, new ed.p<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder.equals.3
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(V v10, @NotNull kotlinx.collections.immutable.implementations.persistentOrderedMap.a<? extends Object> b10) {
                G.p(b10, "b");
                return Boolean.valueOf(G.g(v10, b10.f218637a));
            }
        }) : map instanceof PersistentOrderedMapBuilder ? this.f218552c.s(((PersistentOrderedMapBuilder) obj).f218632d.f218552c, new ed.p<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder.equals.4
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(V v10, @NotNull kotlinx.collections.immutable.implementations.persistentOrderedMap.a<? extends Object> b10) {
                G.p(b10, "b");
                return Boolean.valueOf(G.g(v10, b10.f218637a));
            }
        }) : ud.f.f239703a.b(this, map);
    }

    @Nullable
    public final V f() {
        return this.f218553d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f218552c.t(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new f(this);
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Set<K> getKeys() {
        return new h(this);
    }

    @Override // kotlin.collections.AbstractC4867i
    public int getSize() {
        return this.f218555f;
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Collection<V> getValues() {
        return new j(this);
    }

    @NotNull
    public final ud.g h() {
        return this.f218551b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return ud.f.f239703a.c(this);
    }

    public final void i(int i10) {
        this.f218554e = i10;
    }

    public final void j(@NotNull s<K, V> sVar) {
        G.p(sVar, "<set-?>");
        this.f218552c = sVar;
    }

    public final void m(@Nullable V v10) {
        this.f218553d = v10;
    }

    @Override // kotlin.collections.AbstractC4867i, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        this.f218553d = null;
        this.f218552c = this.f218552c.I(k10 != null ? k10.hashCode() : 0, k10, v10, 0, this);
        return this.f218553d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        G.p(from, "from");
        PersistentHashMap<K, V> persistentHashMapBuild = from instanceof PersistentHashMap ? (PersistentHashMap) from : null;
        if (persistentHashMapBuild == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = from instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) from : null;
            persistentHashMapBuild = persistentHashMapBuilder != null ? persistentHashMapBuilder.build() : null;
        }
        if (persistentHashMapBuild == null) {
            super.putAll(from);
            return;
        }
        ud.b bVar = new ud.b(0, 1, null);
        int size = size();
        s<K, V> sVar = this.f218552c;
        s<K, V> sVar2 = persistentHashMapBuild.f218544d;
        G.n(sVar2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f218552c = sVar.J(sVar2, 0, bVar, this);
        int size2 = (persistentHashMapBuild.getSize() + size) - bVar.f239700a;
        if (size != size2) {
            setSize(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(Object obj) {
        this.f218553d = null;
        s<K, V> sVarL = this.f218552c.L(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (sVarL == null) {
            s.f218579e.getClass();
            sVarL = s.f218580f;
            G.n(sVarL, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f218552c = sVarL;
        return this.f218553d;
    }

    public void setSize(int i10) {
        this.f218555f = i10;
        this.f218554e++;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        s<K, V> sVarM = this.f218552c.M(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (sVarM == null) {
            s.f218579e.getClass();
            sVarM = s.f218580f;
            G.n(sVarM, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f218552c = sVarM;
        return size != size();
    }
}
