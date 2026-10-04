package ud;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nMapImplementation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapImplementation.kt\nkotlinx/collections/immutable/internal/MapImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,27:1\n1#2:28\n167#3,3:29\n*S KotlinDebug\n*F\n+ 1 MapImplementation.kt\nkotlinx/collections/immutable/internal/MapImplementation\n*L\n22#1:29,3\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f239703a = new f();

    public final <K, V> boolean a(@NotNull Map<K, ? extends V> map, @NotNull Map.Entry<? extends K, ? extends V> element) {
        G.p(map, "map");
        G.p(element, "element");
        V v10 = map.get(element.getKey());
        return v10 != null ? v10.equals(element.getValue()) : element.getValue() == null && map.containsKey(element.getKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> boolean b(@NotNull Map<K, ? extends V> thisMap, @NotNull Map<?, ?> otherMap) {
        G.p(thisMap, "thisMap");
        G.p(otherMap, "otherMap");
        if (thisMap.size() != otherMap.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (otherMap.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<?, ?>> it = otherMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!f239703a.a(thisMap, it.next())) {
                return false;
            }
        }
        return true;
    }

    public final <K, V> int c(@NotNull Map<K, ? extends V> map) {
        G.p(map, "map");
        return map.entrySet().hashCode();
    }
}
