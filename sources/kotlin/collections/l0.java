package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,111:1\n349#2,6:112\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:112,6\n*E\n"})
public class l0 {
    @InterfaceC4850b0
    @dd.j(name = "getOrImplicitDefaultNullable")
    public static final <K, V> V a(@NotNull Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        if (map instanceof i0) {
            return (V) ((i0) map).B1(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }

    @NotNull
    public static final <K, V> Map<K, V> b(@NotNull Map<K, ? extends V> map, @NotNull ed.l<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return map instanceof i0 ? b(((i0) map).n(), defaultValue) : new j0(map, defaultValue);
    }

    @dd.j(name = "withDefaultMutable")
    @NotNull
    public static final <K, V> Map<K, V> c(@NotNull Map<K, V> map, @NotNull ed.l<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return map instanceof r0 ? c(((r0) map).n(), defaultValue) : new s0(map, defaultValue);
    }
}
