package kotlin.collections;

import ed.InterfaceC4376a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC4849b;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,823:1\n415#1:833\n427#1:838\n525#1,6:843\n551#1,6:849\n1#2:824\n1266#3,4:825\n1266#3,4:829\n1266#3,4:834\n1266#3,4:839\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n466#1:833\n481#1:838\n540#1:843,6\n566#1:849,6\n415#1:825,4\n427#1:829,4\n466#1:834,4\n481#1:839,4\n*E\n"})
public class n0 extends m0 {
    @NotNull
    public static final <K, V> Map<K, V> A(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final <K, V> void A0(Map<K, V> map, K k10, V v10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        map.put(k10, v10);
    }

    @NotNull
    public static final <K, V> Map<K, V> B(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super K, Boolean> predicate) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static <K, V> Map<K, V> B0(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0(iterable, linkedHashMap);
            return k0(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z();
        }
        if (size == 1) {
            return m0.k((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m0.j(collection.size()));
        C0(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    @NotNull
    public static final <K, V> Map<K, V> C(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable, @NotNull M destination) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        w0(destination, iterable);
        return destination;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@NotNull Map<? extends K, ? extends V> map, @NotNull M destination, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static <K, V> Map<K, V> D0(@NotNull Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? J0(map) : m0.o(map) : z();
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@NotNull Map<? extends K, ? extends V> map, @NotNull M destination, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.1")
    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@NotNull Map<? extends K, ? extends V> map, @NotNull M destination) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        destination.putAll(map);
        return destination;
    }

    @NotNull
    public static final <K, V> Map<K, V> F(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super V, Boolean> predicate) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> F0(@NotNull InterfaceC5000m<? extends Pair<? extends K, ? extends V>> interfaceC5000m) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        G0(interfaceC5000m, linkedHashMap);
        return k0(linkedHashMap);
    }

    @Xc.f
    public static final <K, V> V G(Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return map.get(k10);
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@NotNull InterfaceC5000m<? extends Pair<? extends K, ? extends V>> interfaceC5000m, @NotNull M destination) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        x0(destination, interfaceC5000m);
        return destination;
    }

    @Xc.f
    public static final <K, V> V H(Map<K, ? extends V> map, K k10, InterfaceC4376a<? extends V> defaultValue) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        return v10 == null ? defaultValue.invoke() : v10;
    }

    @NotNull
    public static <K, V> Map<K, V> H0(@NotNull Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.G.p(pairArr, "<this>");
        int length = pairArr.length;
        if (length == 0) {
            return z();
        }
        if (length == 1) {
            return m0.k(pairArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m0.j(pairArr.length));
        I0(pairArr, linkedHashMap);
        return linkedHashMap;
    }

    public static final <K, V> V I(@NotNull Map<K, ? extends V> map, K k10, @NotNull InterfaceC4376a<? extends V> defaultValue) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        return (v10 != null || map.containsKey(k10)) ? v10 : defaultValue.invoke();
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@NotNull Pair<? extends K, ? extends V>[] pairArr, @NotNull M destination) {
        kotlin.jvm.internal.G.p(pairArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        y0(destination, pairArr);
        return destination;
    }

    public static final <K, V> V J(@NotNull Map<K, V> map, K k10, @NotNull InterfaceC4376a<? extends V> defaultValue) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        if (v10 != null) {
            return v10;
        }
        V vInvoke = defaultValue.invoke();
        map.put(k10, vInvoke);
        return vInvoke;
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static <K, V> Map<K, V> J0(@NotNull Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return new LinkedHashMap(map);
    }

    @InterfaceC4887e0(version = "1.1")
    public static <K, V> V K(@NotNull Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return (V) l0.a(map, k10);
    }

    @Xc.f
    public static final <K, V> Pair<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.G.p(entry, "<this>");
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @NotNull
    public static <K, V> HashMap<K, V> M(@NotNull Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(m0.j(pairs.length));
        y0(map, pairs);
        return map;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Led/a<+TR;>;)TR; */
    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final Object N(Map map, InterfaceC4376a defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return map.isEmpty() ? defaultValue.invoke() : map;
    }

    @Xc.f
    public static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return !map.isEmpty();
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @Xc.f
    public static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @NotNull
    public static final <K, V> LinkedHashMap<K, V> S(@NotNull Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>(m0.j(pairs.length));
        I0(pairs, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<R, V> T(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m0.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(transform.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.C
    @NotNull
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@NotNull Map<? extends K, ? extends V> map, @NotNull M destination, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(transform.invoke(entry), entry.getValue());
        }
        return destination;
    }

    @Xc.f
    public static final <K, V> Map<K, V> V() {
        return z();
    }

    @NotNull
    public static <K, V> Map<K, V> W(@NotNull Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        if (pairs.length <= 0) {
            return z();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m0.j(pairs.length));
        I0(pairs, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<K, R> X(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m0.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), transform.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.C
    @NotNull
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@NotNull Map<? extends K, ? extends V> map, @NotNull M destination, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(entry.getKey(), transform.invoke(entry));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> Z(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends K> keys) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(keys, "keys");
        Map mapJ0 = J0(map);
        N.J0(((LinkedHashMap) mapJ0).keySet(), keys);
        return k0(mapJ0);
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> a0(@NotNull Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        Map mapJ0 = J0(map);
        mapJ0.remove(k10);
        return k0(mapJ0);
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> b0(@NotNull Map<? extends K, ? extends V> map, @NotNull InterfaceC5000m<? extends K> keys) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(keys, "keys");
        Map mapJ0 = J0(map);
        N.L0(((LinkedHashMap) mapJ0).keySet(), keys);
        return k0(mapJ0);
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> c0(@NotNull Map<? extends K, ? extends V> map, @NotNull K[] keys) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(keys, "keys");
        Map mapJ0 = J0(map);
        N.M0(((LinkedHashMap) mapJ0).keySet(), keys);
        return k0(mapJ0);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <K, V> void d0(Map<K, V> map, Iterable<? extends K> keys) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(keys, "keys");
        N.J0(map.keySet(), keys);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <K, V> void e0(Map<K, V> map, K k10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        map.remove(k10);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <K, V> void f0(Map<K, V> map, InterfaceC5000m<? extends K> keys) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(keys, "keys");
        N.L0(map.keySet(), keys);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <K, V> void g0(Map<K, V> map, K[] keys) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(keys, "keys");
        N.M0(map.keySet(), keys);
    }

    @Xc.f
    @dd.j(name = "mutableIterator")
    public static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @NotNull
    public static <K, V> Map<K, V> j0(@NotNull Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m0.j(pairs.length));
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> k0(@NotNull Map<K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : m0.o(map) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        return map == 0 ? z() : map;
    }

    @NotNull
    public static final <K, V> Map<K, V> m0(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pairs, "pairs");
        if (map.isEmpty()) {
            return B0(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @NotNull
    public static <K, V> Map<K, V> n0(@NotNull Map<? extends K, ? extends V> map, @NotNull Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0(@NotNull Map<? extends K, ? extends V> map, @NotNull Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pair, "pair");
        if (map.isEmpty()) {
            return m0.k(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.f217467a, pair.f217468b);
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> p0(@NotNull Map<? extends K, ? extends V> map, @NotNull InterfaceC5000m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, pairs);
        return k0(linkedHashMap);
    }

    @NotNull
    public static final <K, V> Map<K, V> q0(@NotNull Map<? extends K, ? extends V> map, @NotNull Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pairs, "pairs");
        if (map.isEmpty()) {
            return H0(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @Xc.f
    public static final <K, V> void r0(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pairs, "pairs");
        w0(map, pairs);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final <K, V> Map<K, V> s(int i10, @InterfaceC4849b ed.l<? super Map<K, V>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        MapBuilder mapBuilder = new MapBuilder(i10);
        builderAction.invoke(mapBuilder);
        return mapBuilder.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final <K, V> void s0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(map2, "map");
        map.putAll(map2);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final <K, V> Map<K, V> t(@InterfaceC4849b ed.l<? super Map<K, V>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        MapBuilder mapBuilder = new MapBuilder();
        builderAction.invoke(mapBuilder);
        return mapBuilder.q();
    }

    @Xc.f
    public static final <K, V> void t0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pair, "pair");
        map.put((Object) pair.f217467a, (Object) pair.f217468b);
    }

    @Xc.f
    public static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.G.p(entry, "<this>");
        return entry.getKey();
    }

    @Xc.f
    public static final <K, V> void u0(Map<? super K, ? super V> map, InterfaceC5000m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pairs, "pairs");
        x0(map, pairs);
    }

    @Xc.f
    public static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.G.p(entry, "<this>");
        return entry.getValue();
    }

    @Xc.f
    public static final <K, V> void v0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pairs, "pairs");
        y0(map, pairs);
    }

    @Xc.f
    public static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return map.containsKey(k10);
    }

    public static <K, V> void w0(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put((Object) pair.f217467a, (Object) pair.f217468b);
        }
    }

    @Xc.f
    public static final <K> boolean x(Map<? extends K, ?> map, K k10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return map.containsKey(k10);
    }

    public static <K, V> void x0(@NotNull Map<? super K, ? super V> map, @NotNull InterfaceC5000m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put((Object) pair.f217467a, (Object) pair.f217468b);
        }
    }

    @Xc.f
    public static final <K, V> boolean y(Map<K, ? extends V> map, V v10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return map.containsValue(v10);
    }

    public static <K, V> void y0(@NotNull Map<? super K, ? super V> map, @NotNull Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put((Object) pair.f217467a, (Object) pair.f217468b);
        }
    }

    @NotNull
    public static <K, V> Map<K, V> z() {
        EmptyMap emptyMap = EmptyMap.f217511a;
        kotlin.jvm.internal.G.n(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    @kotlin.C
    @Xc.f
    public static final <K, V> V z0(Map<? extends K, V> map, K k10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return (V) kotlin.jvm.internal.Y.k(map).remove(k10);
    }
}
