package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC4850b0;
import kotlin.collections.AbstractC4863f;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.immutableMap.s;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rd.InterfaceC5550a;
import rd.InterfaceC5552c;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nkotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,119:1\n53#2:120\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n71#1:120\n*E\n"})
public final class PersistentHashMap<K, V> extends AbstractC4863f<K, V> implements PersistentMap<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f218542f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final PersistentHashMap f218543g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final s<K, V> f218544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f218545e;

    public static final class a {
        public a() {
        }

        @NotNull
        public final <K, V> PersistentHashMap<K, V> a() {
            PersistentHashMap<K, V> persistentHashMap = PersistentHashMap.f218543g;
            G.n(persistentHashMap, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return persistentHashMap;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        s.f218579e.getClass();
        f218543g = new PersistentHashMap(s.f218580f, 0);
    }

    public PersistentHashMap(@NotNull s<K, V> node, int i10) {
        G.p(node, "node");
        this.f218544d = node;
        this.f218545e = i10;
    }

    @Override // java.util.Map, kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public PersistentHashMap<K, V> remove(K k10, V v10) {
        s<K, V> sVarW = this.f218544d.W(k10 != null ? k10.hashCode() : 0, k10, v10, 0);
        return this.f218544d == sVarW ? this : sVarW == null ? f218542f.a() : new PersistentHashMap<>(sVarW, getSize() - 1);
    }

    public final InterfaceC5550a<V> B() {
        return new q(this);
    }

    @Override // kotlinx.collections.immutable.PersistentMap
    public PersistentMap.Builder builder() {
        return new PersistentHashMapBuilder(this);
    }

    @Override // java.util.Map, kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap<K, V> clear() {
        return f218542f.a();
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f218544d.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (getSize() != map.size()) {
            return false;
        }
        return map instanceof PersistentOrderedMap ? this.f218544d.s(((PersistentOrderedMap) obj).f218624f.f218544d, new ed.p<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.equals.1
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(V v10, @NotNull kotlinx.collections.immutable.implementations.persistentOrderedMap.a<? extends Object> b10) {
                G.p(b10, "b");
                return Boolean.valueOf(G.g(v10, b10.f218637a));
            }
        }) : map instanceof PersistentOrderedMapBuilder ? this.f218544d.s(((PersistentOrderedMapBuilder) obj).f218632d.f218552c, new ed.p<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.equals.2
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(V v10, @NotNull kotlinx.collections.immutable.implementations.persistentOrderedMap.a<? extends Object> b10) {
                G.p(b10, "b");
                return Boolean.valueOf(G.g(v10, b10.f218637a));
            }
        }) : map instanceof PersistentHashMap ? this.f218544d.s(((PersistentHashMap) obj).f218544d, new ed.p<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.equals.3
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(V v10, @Nullable Object obj2) {
                return Boolean.valueOf(G.g(v10, obj2));
            }
        }) : map instanceof PersistentHashMapBuilder ? this.f218544d.s(((PersistentHashMapBuilder) obj).f218552c, new ed.p<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.equals.4
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(V v10, @Nullable Object obj2) {
                return Boolean.valueOf(G.g(v10, obj2));
            }
        }) : super.equals(obj);
    }

    @Override // kotlin.collections.AbstractC4863f
    @InterfaceC4850b0
    @NotNull
    public final Set<Map.Entry<K, V>> f() {
        return new m(this);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.f218544d.t(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // rd.InterfaceC5551b
    @NotNull
    public InterfaceC5552c<K> getKeys() {
        return new o(this);
    }

    @Override // kotlin.collections.AbstractC4863f
    public int getSize() {
        return this.f218545e;
    }

    @Override // kotlin.collections.AbstractC4863f
    public Set h() {
        return new o(this);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    @Override // kotlin.collections.AbstractC4863f
    public Collection i() {
        return new q(this);
    }

    @Override // rd.InterfaceC5551b
    @NotNull
    public InterfaceC5550a<V> k() {
        return new q(this);
    }

    @Override // java.util.Map, kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap<K, V> putAll(@NotNull Map<? extends K, ? extends V> m10) {
        G.p(m10, "m");
        PersistentHashMapBuilder persistentHashMapBuilder = new PersistentHashMapBuilder(this);
        persistentHashMapBuilder.putAll(m10);
        return persistentHashMapBuilder.build();
    }

    @NotNull
    public PersistentHashMapBuilder<K, V> r() {
        return new PersistentHashMapBuilder<>(this);
    }

    @Override // rd.InterfaceC5551b
    @NotNull
    public InterfaceC5552c<Map.Entry<K, V>> s() {
        return new m(this);
    }

    public final InterfaceC5552c<Map.Entry<K, V>> t() {
        return new m(this);
    }

    public final InterfaceC5552c<Map.Entry<K, V>> u() {
        return new m(this);
    }

    @NotNull
    public final s<K, V> v() {
        return this.f218544d;
    }

    public final InterfaceC5552c<K> w() {
        return new o(this);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public PersistentHashMap<K, V> put(K k10, V v10) {
        s.b<K, V> bVarU = this.f218544d.U(k10 != null ? k10.hashCode() : 0, k10, v10, 0);
        return bVarU == null ? this : new PersistentHashMap<>(bVarU.f218585a, getSize() + bVarU.f218586b);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public PersistentHashMap<K, V> remove(K k10) {
        s<K, V> sVarV = this.f218544d.V(k10 != null ? k10.hashCode() : 0, k10, 0);
        return this.f218544d == sVarV ? this : sVarV == null ? f218542f.a() : new PersistentHashMap<>(sVarV, getSize() - 1);
    }
}
