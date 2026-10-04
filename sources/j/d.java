package J;

import J.u;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
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
@V({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public class d<K, V> extends AbstractC4863f<K, V> implements PersistentMap<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f53059f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f53060g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final d f53061h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final u<K, V> f53062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53063e;

    public static final class a {
        public a() {
        }

        @NotNull
        public final <K, V> d<K, V> a() {
            d<K, V> dVar = d.f53061h;
            G.n(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        u.f53093e.getClass();
        f53061h = new d(u.f53095g, 0);
    }

    public d(@NotNull u<K, V> uVar, int i10) {
        this.f53062d = uVar;
        this.f53063e = i10;
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public d<K, V> remove(K k10, V v10) {
        u<K, V> uVarU = this.f53062d.U(k10 != null ? k10.hashCode() : 0, k10, v10, 0);
        return this.f53062d == uVarU ? this : uVarU == null ? f53059f.a() : new d<>(uVarU, getSize() - 1);
    }

    public final /* bridge */ H.a<V> B() {
        return i();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap<K, V> clear() {
        return f53059f.a();
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    public boolean containsKey(K k10) {
        return this.f53062d.n(k10 != null ? k10.hashCode() : 0, k10, 0);
    }

    @Override // kotlin.collections.AbstractC4863f
    @InterfaceC4850b0
    @NotNull
    public final Set<Map.Entry<K, V>> f() {
        return new o(this);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    @Nullable
    public V get(K k10) {
        return this.f53062d.r(k10 != null ? k10.hashCode() : 0, k10, 0);
    }

    @Override // kotlin.collections.AbstractC4863f
    @NotNull
    /* JADX INFO: renamed from: getKeys, reason: merged with bridge method [inline-methods] */
    public H.e<K> h() {
        return new q(this);
    }

    @Override // kotlin.collections.AbstractC4863f
    public int getSize() {
        return this.f53063e;
    }

    @Override // kotlin.collections.AbstractC4863f
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public H.a<V> i() {
        return new s(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap<K, V> putAll(@NotNull Map<? extends K, ? extends V> map) {
        PersistentMap.Builder<K, V> builder = builder();
        builder.putAll(map);
        return builder.build2();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public f<K, V> builder() {
        return new f<>(this);
    }

    @Override // H.d
    @NotNull
    public H.e<Map.Entry<K, V>> s() {
        return new o(this);
    }

    public final H.e<Map.Entry<K, V>> t() {
        return new o(this);
    }

    public final /* bridge */ H.e<Map.Entry<K, V>> u() {
        return s();
    }

    @NotNull
    public final u<K, V> v() {
        return this.f53062d;
    }

    public final /* bridge */ H.e<K> w() {
        return h();
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public d<K, V> put(K k10, V v10) {
        u.b<K, V> bVarS = this.f53062d.S(k10 != null ? k10.hashCode() : 0, k10, v10, 0);
        return bVarS == null ? this : new d<>(bVarS.f53101a, getSize() + bVarS.f53102b);
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public d<K, V> remove(K k10) {
        u<K, V> uVarT = this.f53062d.T(k10 != null ? k10.hashCode() : 0, k10, 0);
        return this.f53062d == uVarT ? this : uVarT == null ? f53059f.a() : new d<>(uVarT, getSize() - 1);
    }
}
