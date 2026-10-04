package J;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4867i;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public class f<K, V> extends AbstractC4867i<K, V> implements PersistentMap.Builder<K, V> {
    public static final int $stable = 8;

    @NotNull
    private d<K, V> map;
    private int modCount;

    @NotNull
    private u<K, V> node;

    @Nullable
    private V operationResult;

    @NotNull
    private M.f ownership = new M.f();
    private int size;

    public f(@NotNull d<K, V> dVar) {
        this.map = dVar;
        this.node = dVar.f53062d;
        this.size = dVar.getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        u.f53093e.getClass();
        u<K, V> uVar = u.f53095g;
        G.n(uVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = uVar;
        setSize(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k10) {
        return this.node.n(k10 != null ? k10.hashCode() : 0, k10, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(K k10) {
        return this.node.r(k10 != null ? k10.hashCode() : 0, k10, 0);
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new h(this);
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Set<K> getKeys() {
        return new j(this);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    @NotNull
    public final u<K, V> getNode$runtime_release() {
        return this.node;
    }

    @Nullable
    public final V getOperationResult$runtime_release() {
        return this.operationResult;
    }

    @NotNull
    public final M.f getOwnership() {
        return this.ownership;
    }

    @Override // kotlin.collections.AbstractC4867i
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Collection<V> getValues() {
        return new l(this);
    }

    @Override // kotlin.collections.AbstractC4867i, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        this.operationResult = null;
        this.node = this.node.G(k10 != null ? k10.hashCode() : 0, k10, v10, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        d<K, V> dVarBuild = map instanceof d ? (d) map : null;
        if (dVarBuild == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarBuild = fVar != null ? fVar.build2() : null;
        }
        if (dVarBuild == null) {
            super.putAll(map);
            return;
        }
        M.b bVar = new M.b(0, 1, null);
        int size = size();
        u<K, V> uVar = this.node;
        u<K, V> uVar2 = dVarBuild.f53062d;
        G.n(uVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = uVar.H(uVar2, 0, bVar, this);
        int size2 = (dVarBuild.getSize() + size) - bVar.f58781a;
        if (size != size2) {
            setSize(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(K k10) {
        this.operationResult = null;
        u<K, V> uVarJ = this.node.J(k10 != null ? k10.hashCode() : 0, k10, 0, this);
        if (uVarJ == null) {
            u.f53093e.getClass();
            uVarJ = u.f53095g;
            G.n(uVarJ, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = uVarJ;
        return this.operationResult;
    }

    public final void setModCount$runtime_release(int i10) {
        this.modCount = i10;
    }

    public final void setNode$runtime_release(@NotNull u<K, V> uVar) {
        this.node = uVar;
    }

    public final void setOperationResult$runtime_release(@Nullable V v10) {
        this.operationResult = v10;
    }

    public final void setOwnership(@NotNull M.f fVar) {
        this.ownership = fVar;
    }

    public void setSize(int i10) {
        this.size = i10;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    @NotNull
    /* JADX INFO: renamed from: build */
    public d<K, V> build2() {
        u<K, V> uVar = this.node;
        d<K, V> dVar = this.map;
        if (uVar != dVar.f53062d) {
            this.ownership = new M.f();
            dVar = new d<>(this.node, size());
        }
        this.map = dVar;
        return dVar;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        u<K, V> uVarK = this.node.K(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (uVarK == null) {
            u.f53093e.getClass();
            uVarK = u.f53095g;
            G.n(uVarK, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = uVarK;
        return size != size();
    }
}
