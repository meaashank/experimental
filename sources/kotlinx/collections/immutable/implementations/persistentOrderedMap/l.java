package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.collections.AbstractC4869k;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import rd.InterfaceC5552c;

/* JADX INFO: loaded from: classes5.dex */
public final class l<K, V> extends AbstractC4869k<K> implements InterfaceC5552c<K> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PersistentOrderedMap<K, V> f218656b;

    public l(@NotNull PersistentOrderedMap<K, V> map) {
        G.p(map, "map");
        this.f218656b = map;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f218656b.f218624f.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f218656b.getSize();
    }

    @Override // kotlin.collections.AbstractC4869k, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<K> iterator() {
        return new m(this.f218656b);
    }
}
