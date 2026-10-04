package kotlin.collections;

import ed.InterfaceC4376a;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public class m0 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f217633a = 1073741824;

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @NotNull
    public static <K, V> Map<K, V> d(@NotNull Map<K, V> builder) {
        kotlin.jvm.internal.G.p(builder, "builder");
        return ((MapBuilder) builder).q();
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @Xc.f
    public static final <K, V> Map<K, V> e(int i10, ed.l<? super Map<K, V>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        MapBuilder mapBuilder = new MapBuilder(i10);
        builderAction.invoke(mapBuilder);
        return mapBuilder.q();
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @Xc.f
    public static final <K, V> Map<K, V> f(ed.l<? super Map<K, V>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        MapBuilder mapBuilder = new MapBuilder();
        builderAction.invoke(mapBuilder);
        return mapBuilder.q();
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @NotNull
    public static <K, V> Map<K, V> g() {
        return new MapBuilder();
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @NotNull
    public static <K, V> Map<K, V> h(int i10) {
        return new MapBuilder(i10);
    }

    public static final <K, V> V i(@NotNull ConcurrentMap<K, V> concurrentMap, K k10, @NotNull InterfaceC4376a<? extends V> defaultValue) {
        kotlin.jvm.internal.G.p(concurrentMap, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        V v10 = concurrentMap.get(k10);
        if (v10 != null) {
            return v10;
        }
        V vInvoke = defaultValue.invoke();
        V vPutIfAbsent = concurrentMap.putIfAbsent(k10, vInvoke);
        return vPutIfAbsent == null ? vInvoke : vPutIfAbsent;
    }

    @InterfaceC4850b0
    public static int j(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    public static <K, V> Map<K, V> k(@NotNull Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.G.p(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.f217467a, pair.f217468b);
        kotlin.jvm.internal.G.o(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <K, V> SortedMap<K, V> l(@NotNull Comparator<? super K> comparator, @NotNull Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(pairs, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        n0.y0(treeMap, pairs);
        return treeMap;
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m(@NotNull Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        n0.y0(treeMap, pairs);
        return treeMap;
    }

    @Xc.f
    public static final Properties n(Map<String, String> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @NotNull
    public static final <K, V> Map<K, V> o(@NotNull Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.G.o(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    @Xc.f
    public static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return o(map);
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> q(@NotNull Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return new TreeMap(map);
    }

    @NotNull
    public static final <K, V> SortedMap<K, V> r(@NotNull Map<? extends K, ? extends V> map, @NotNull Comparator<? super K> comparator) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
