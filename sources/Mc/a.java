package Mc;

import Xc.f;
import dd.j;
import java.util.Map;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Y;

/* JADX INFO: loaded from: classes7.dex */
@j(name = "CollectionsJDK8Kt")
public final class a {
    @InterfaceC4887e0(version = "1.2")
    @f
    public static final <K, V> V a(Map<? extends K, ? extends V> map, K k10, V v10) {
        G.p(map, "<this>");
        return (V) map.getOrDefault(k10, v10);
    }

    @InterfaceC4887e0(version = "1.2")
    @f
    public static final <K, V> boolean b(Map<? extends K, ? extends V> map, K k10, V v10) {
        G.p(map, "<this>");
        return Y.k(map).remove(k10, v10);
    }
}
