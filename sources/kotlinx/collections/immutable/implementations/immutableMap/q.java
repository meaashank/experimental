package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.collections.AbstractC4855b;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import rd.InterfaceC5550a;

/* JADX INFO: loaded from: classes5.dex */
public final class q<K, V> extends AbstractC4855b<V> implements InterfaceC5550a<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PersistentHashMap<K, V> f218578a;

    public q(@NotNull PersistentHashMap<K, V> map) {
        G.p(map, "map");
        this.f218578a = map;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f218578a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f218578a.getSize();
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<V> iterator() {
        return new r(this.f218578a.f218544d);
    }
}
