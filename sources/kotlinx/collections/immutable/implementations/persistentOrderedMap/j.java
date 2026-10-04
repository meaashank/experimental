package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC4869k;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import rd.InterfaceC5552c;

/* JADX INFO: loaded from: classes5.dex */
public final class j<K, V> extends AbstractC4869k<Map.Entry<? extends K, ? extends V>> implements InterfaceC5552c<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PersistentOrderedMap<K, V> f218654b;

    public j(@NotNull PersistentOrderedMap<K, V> map) {
        G.p(map, "map");
        this.f218654b = map;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return h((Map.Entry) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f218654b.getSize();
    }

    public boolean h(@NotNull Map.Entry<? extends K, ? extends V> element) {
        G.p(element, "element");
        return ud.f.f239703a.a(this.f218654b, element);
    }

    @Override // kotlin.collections.AbstractC4869k, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new k(this.f218654b);
    }
}
