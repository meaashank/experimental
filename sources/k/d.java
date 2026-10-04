package K;

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
public final class d<K, V> extends AbstractC4867i<K, V> implements PersistentMap.Builder<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58294e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public c<K, V> f58295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Object f58296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Object f58297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final J.f<K, a<V>> f58298d;

    public d(@NotNull c<K, V> cVar) {
        this.f58295a = cVar;
        this.f58296b = cVar.f58291d;
        this.f58297c = cVar.f58292e;
        this.f58298d = cVar.f58293f.builder();
    }

    @Nullable
    public final Object b() {
        return this.f58296b;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    @NotNull
    /* JADX INFO: renamed from: build */
    public PersistentMap<K, V> build2() {
        J.d<K, a<V>> dVarBuild2 = this.f58298d.build2();
        c<K, V> cVar = this.f58295a;
        if (dVarBuild2 == cVar.f58293f) {
            Object obj = cVar.f58291d;
            Object obj2 = cVar.f58292e;
        } else {
            cVar = new c<>(this.f58296b, this.f58297c, dVarBuild2);
        }
        this.f58295a = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f58298d.clear();
        M.c cVar = M.c.f58782a;
        this.f58296b = cVar;
        this.f58297c = cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f58298d.containsKey(obj);
    }

    @NotNull
    public final J.f<K, a<V>> d() {
        return this.f58298d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(Object obj) {
        a<V> aVar = this.f58298d.get(obj);
        if (aVar != null) {
            return aVar.f58283a;
        }
        return null;
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new e(this);
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Set<K> getKeys() {
        return new g(this);
    }

    @Override // kotlin.collections.AbstractC4867i
    public int getSize() {
        return this.f58298d.size();
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Collection<V> getValues() {
        return new j(this);
    }

    @Override // kotlin.collections.AbstractC4867i, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        a<V> aVar = this.f58298d.get(k10);
        if (aVar != null) {
            if (aVar.f58283a == v10) {
                return v10;
            }
            this.f58298d.put(k10, aVar.h(v10));
            return aVar.f58283a;
        }
        if (isEmpty()) {
            this.f58296b = k10;
            this.f58297c = k10;
            this.f58298d.put(k10, new a<>(v10));
            return null;
        }
        Object obj = this.f58297c;
        a<V> aVar2 = this.f58298d.get((K) obj);
        G.m(aVar2);
        a<V> aVar3 = aVar2;
        aVar3.a();
        this.f58298d.put((K) obj, aVar3.f(k10));
        this.f58298d.put(k10, new a<>(v10, obj));
        this.f58297c = k10;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(Object obj) {
        a<V> aVarRemove = this.f58298d.remove(obj);
        if (aVarRemove == null) {
            return null;
        }
        if (aVarRemove.b()) {
            a<V> aVar = this.f58298d.get(aVarRemove.f58284b);
            G.m(aVar);
            this.f58298d.put((K) aVarRemove.f58284b, aVar.f(aVarRemove.f58285c));
        } else {
            this.f58296b = aVarRemove.f58285c;
        }
        if (aVarRemove.a()) {
            a<V> aVar2 = this.f58298d.get(aVarRemove.f58285c);
            G.m(aVar2);
            this.f58298d.put((K) aVarRemove.f58285c, aVar2.g(aVarRemove.f58284b));
        } else {
            this.f58297c = aVarRemove.f58284b;
        }
        return aVarRemove.f58283a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        a<V> aVar = this.f58298d.get(obj);
        if (aVar == null || !G.g(aVar.f58283a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
