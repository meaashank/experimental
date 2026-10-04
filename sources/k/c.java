package K;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC4850b0;
import kotlin.collections.AbstractC4863f;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,135:1\n53#2:136\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n119#1:136\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class c<K, V> extends AbstractC4863f<K, V> implements PersistentMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f58288g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f58289h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final c f58290i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Object f58291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Object f58292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final J.d<K, K.a<V>> f58293f;

    public static final class a {
        public a() {
        }

        @NotNull
        public final <K, V> c<K, V> a() {
            c<K, V> cVar = c.f58290i;
            G.n(cVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return cVar;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        M.c cVar = M.c.f58782a;
        f58290i = new c(cVar, cVar, J.d.f53059f.a());
    }

    public c(@Nullable Object obj, @Nullable Object obj2, @NotNull J.d<K, K.a<V>> dVar) {
        this.f58291d = obj;
        this.f58292e = obj2;
        this.f58293f = dVar;
    }

    private final H.e<Map.Entry<K, V>> r() {
        return new l(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [J.d, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [J.d, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [J.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // kotlin.collections.AbstractC4863f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c<K, V> remove(K k10) {
        K.a<V> aVar = this.f58293f.get(k10);
        if (aVar == null) {
            return this;
        }
        J.d<K, K.a<V>> dVarRemove = this.f58293f.remove(k10);
        ?? r52 = dVarRemove;
        if (aVar.b()) {
            Object obj = dVarRemove.get(aVar.f58284b);
            G.m(obj);
            r52 = (J.d<K, K.a<V>>) dVarRemove.put(aVar.f58284b, ((K.a) obj).f(aVar.f58285c));
        }
        ?? Put = r52;
        if (aVar.a()) {
            Object obj2 = r52.get(aVar.f58285c);
            G.m(obj2);
            Put = r52.put(aVar.f58285c, ((K.a) obj2).g(aVar.f58284b));
        }
        return new c<>(!aVar.b() ? aVar.f58285c : this.f58291d, !aVar.a() ? aVar.f58284b : this.f58292e, Put);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c<K, V> remove(K k10, V v10) {
        K.a<V> aVar = this.f58293f.get(k10);
        return (aVar != null && G.g(aVar.f58283a, v10)) ? remove(k10) : this;
    }

    public final H.a<V> C() {
        return new q(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap.Builder<K, V> builder() {
        return new d(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap<K, V> clear() {
        return f58288g.a();
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f58293f.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4863f
    @InterfaceC4850b0
    @NotNull
    public final Set<Map.Entry<K, V>> f() {
        return new l(this);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    @Nullable
    public V get(Object obj) {
        K.a<V> aVar = this.f58293f.get(obj);
        if (aVar != null) {
            return aVar.f58283a;
        }
        return null;
    }

    @Override // H.d
    @NotNull
    /* JADX INFO: renamed from: getKeys */
    public H.e<K> h() {
        return new n(this);
    }

    @Override // kotlin.collections.AbstractC4863f
    public int getSize() {
        return this.f58293f.size();
    }

    @Override // kotlin.collections.AbstractC4863f
    public Set h() {
        return new n(this);
    }

    @Override // kotlin.collections.AbstractC4863f
    public Collection i() {
        return new q(this);
    }

    @Override // H.d
    @NotNull
    /* JADX INFO: renamed from: k */
    public H.a<V> i() {
        return new q(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap<K, V> putAll(@NotNull Map<? extends K, ? extends V> map) {
        d dVar = new d(this);
        dVar.putAll(map);
        return dVar.build2();
    }

    @Override // H.d
    @NotNull
    public H.e<Map.Entry<K, V>> s() {
        return new l(this);
    }

    public final H.e<Map.Entry<K, V>> t() {
        return new l(this);
    }

    @Nullable
    public final Object u() {
        return this.f58291d;
    }

    @NotNull
    public final J.d<K, K.a<V>> v() {
        return this.f58293f;
    }

    @Nullable
    public final Object w() {
        return this.f58292e;
    }

    public final H.e<K> x() {
        return new n(this);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c<K, V> put(K k10, V v10) {
        if (isEmpty()) {
            return new c<>(k10, k10, this.f58293f.put(k10, new K.a<>(v10)));
        }
        K.a<V> aVar = this.f58293f.get(k10);
        if (aVar != null) {
            if (aVar.f58283a == v10) {
                return this;
            }
            return new c<>(this.f58291d, this.f58292e, this.f58293f.put(k10, aVar.h(v10)));
        }
        Object obj = this.f58292e;
        K.a<V> aVar2 = this.f58293f.get((K) obj);
        G.m(aVar2);
        return new c<>(this.f58291d, k10, this.f58293f.put((K) obj, aVar2.f(k10)).put(k10, new K.a<>(v10, obj)));
    }
}
