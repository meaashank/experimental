package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC4850b0;
import kotlin.collections.AbstractC4863f;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rd.InterfaceC5550a;
import rd.InterfaceC5552c;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nkotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,172:1\n53#2:173\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n120#1:173\n*E\n"})
public final class PersistentOrderedMap<K, V> extends AbstractC4863f<K, V> implements PersistentMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f218620g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final PersistentOrderedMap f218621h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Object f218622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Object f218623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PersistentHashMap<K, kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>> f218624f;

    public static final class a {
        public a() {
        }

        @NotNull
        public final <K, V> PersistentOrderedMap<K, V> a() {
            PersistentOrderedMap<K, V> persistentOrderedMap = PersistentOrderedMap.f218621h;
            G.n(persistentOrderedMap, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return persistentOrderedMap;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        ud.c cVar = ud.c.f239701a;
        f218621h = new PersistentOrderedMap(cVar, cVar, PersistentHashMap.f218542f.a());
    }

    public PersistentOrderedMap(@Nullable Object obj, @Nullable Object obj2, @NotNull PersistentHashMap<K, kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>> hashMap) {
        G.p(hashMap, "hashMap");
        this.f218622d = obj;
        this.f218623e = obj2;
        this.f218624f = hashMap;
    }

    private final InterfaceC5552c<Map.Entry<K, V>> r() {
        return new j(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC4863f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public PersistentOrderedMap<K, V> remove(K k10) {
        kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar = this.f218624f.get(k10);
        if (aVar == null) {
            return this;
        }
        PersistentHashMap<K, kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>> persistentHashMapRemove = this.f218624f.remove(k10);
        PersistentHashMap persistentHashMap = persistentHashMapRemove;
        if (aVar.b()) {
            Object obj = persistentHashMapRemove.get(aVar.f218638b);
            G.m(obj);
            persistentHashMap = (PersistentHashMap<K, kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>>) persistentHashMapRemove.put(aVar.f218638b, ((kotlinx.collections.immutable.implementations.persistentOrderedMap.a) obj).f(aVar.f218639c));
        }
        PersistentHashMap persistentHashMapPut = persistentHashMap;
        if (aVar.a()) {
            Object obj2 = persistentHashMap.get(aVar.f218639c);
            G.m(obj2);
            persistentHashMapPut = persistentHashMap.put(aVar.f218639c, ((kotlinx.collections.immutable.implementations.persistentOrderedMap.a) obj2).g(aVar.f218638b));
        }
        return new PersistentOrderedMap<>(!aVar.b() ? aVar.f218639c : this.f218622d, !aVar.a() ? aVar.f218638b : this.f218623e, persistentHashMapPut);
    }

    @Override // java.util.Map, kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public PersistentOrderedMap<K, V> remove(K k10, V v10) {
        kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar = this.f218624f.get(k10);
        return (aVar != null && G.g(aVar.f218637a, v10)) ? remove(k10) : this;
    }

    public final InterfaceC5550a<V> C() {
        return new o(this);
    }

    @Override // kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap.Builder<K, V> builder() {
        return new PersistentOrderedMapBuilder(this);
    }

    @Override // java.util.Map, kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap<K, V> clear() {
        return f218620g.a();
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f218624f.containsKey(obj);
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
        return map instanceof PersistentOrderedMap ? this.f218624f.f218544d.s(((PersistentOrderedMap) obj).f218624f.f218544d, new ed.p<kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.equals.1
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> a10, @NotNull kotlinx.collections.immutable.implementations.persistentOrderedMap.a<? extends Object> b10) {
                G.p(a10, "a");
                G.p(b10, "b");
                return Boolean.valueOf(G.g(a10.f218637a, b10.f218637a));
            }
        }) : map instanceof PersistentOrderedMapBuilder ? this.f218624f.f218544d.s(((PersistentOrderedMapBuilder) obj).f218632d.f218552c, new ed.p<kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.equals.2
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> a10, @NotNull kotlinx.collections.immutable.implementations.persistentOrderedMap.a<? extends Object> b10) {
                G.p(a10, "a");
                G.p(b10, "b");
                return Boolean.valueOf(G.g(a10.f218637a, b10.f218637a));
            }
        }) : map instanceof PersistentHashMap ? this.f218624f.f218544d.s(((PersistentHashMap) obj).f218544d, new ed.p<kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.equals.3
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> a10, @Nullable Object obj2) {
                G.p(a10, "a");
                return Boolean.valueOf(G.g(a10.f218637a, obj2));
            }
        }) : map instanceof PersistentHashMapBuilder ? this.f218624f.f218544d.s(((PersistentHashMapBuilder) obj).f218552c, new ed.p<kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.equals.4
            @Override // ed.p
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> a10, @Nullable Object obj2) {
                G.p(a10, "a");
                return Boolean.valueOf(G.g(a10.f218637a, obj2));
            }
        }) : super.equals(obj);
    }

    @Override // kotlin.collections.AbstractC4863f
    @InterfaceC4850b0
    @NotNull
    public final Set<Map.Entry<K, V>> f() {
        return new j(this);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    @Nullable
    public V get(Object obj) {
        kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar = this.f218624f.get(obj);
        if (aVar != null) {
            return aVar.f218637a;
        }
        return null;
    }

    @Override // rd.InterfaceC5551b
    @NotNull
    public InterfaceC5552c<K> getKeys() {
        return new l(this);
    }

    @Override // kotlin.collections.AbstractC4863f
    public int getSize() {
        return this.f218624f.size();
    }

    @Override // kotlin.collections.AbstractC4863f
    public Set h() {
        return new l(this);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    @Override // kotlin.collections.AbstractC4863f
    public Collection i() {
        return new o(this);
    }

    @Override // rd.InterfaceC5551b
    @NotNull
    public InterfaceC5550a<V> k() {
        return new o(this);
    }

    @Override // java.util.Map, kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap<K, V> putAll(@NotNull Map<? extends K, ? extends V> m10) {
        G.p(m10, "m");
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = new PersistentOrderedMapBuilder(this);
        persistentOrderedMapBuilder.putAll(m10);
        return persistentOrderedMapBuilder.build();
    }

    @Override // rd.InterfaceC5551b
    @NotNull
    public InterfaceC5552c<Map.Entry<K, V>> s() {
        return new j(this);
    }

    public final InterfaceC5552c<Map.Entry<K, V>> t() {
        return new j(this);
    }

    @Nullable
    public final Object u() {
        return this.f218622d;
    }

    @NotNull
    public final PersistentHashMap<K, kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>> v() {
        return this.f218624f;
    }

    @Nullable
    public final Object w() {
        return this.f218623e;
    }

    public final InterfaceC5552c<K> x() {
        return new l(this);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public PersistentOrderedMap<K, V> put(K k10, V v10) {
        if (isEmpty()) {
            return new PersistentOrderedMap<>(k10, k10, this.f218624f.put(k10, new kotlinx.collections.immutable.implementations.persistentOrderedMap.a<>(v10)));
        }
        kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar = this.f218624f.get(k10);
        if (aVar != null) {
            if (aVar.f218637a == v10) {
                return this;
            }
            return new PersistentOrderedMap<>(this.f218622d, this.f218623e, this.f218624f.put(k10, aVar.h(v10)));
        }
        Object obj = this.f218623e;
        kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar2 = this.f218624f.get(obj);
        G.m(aVar2);
        return new PersistentOrderedMap<>(this.f218622d, k10, this.f218624f.put((K) obj, aVar2.f(k10)).put(k10, new kotlinx.collections.immutable.implementations.persistentOrderedMap.a<>(v10, obj)));
    }
}
