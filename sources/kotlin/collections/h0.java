package kotlin.collections;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@dd.j(name = "MapAccessorsKt")
public final class h0 {
    @Xc.f
    public static final <V, V1 extends V> V1 a(Map<? super String, ? extends V> map, Object obj, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(property, "property");
        return (V1) l0.a(map, property.getName());
    }

    @Xc.f
    @dd.j(name = "getVar")
    public static final <V, V1 extends V> V1 b(Map<? super String, ? extends V> map, Object obj, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(property, "property");
        return (V1) l0.a(map, property.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final <V> void c(Map<? super String, ? super V> map, Object obj, kotlin.reflect.n<?> property, V v10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(property, "property");
        map.put(property.getName(), v10);
    }
}
