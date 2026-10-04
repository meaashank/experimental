package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.collections.AbstractC4869k;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import rd.InterfaceC5552c;

/* JADX INFO: loaded from: classes5.dex */
public final class o<K, V> extends AbstractC4869k<K> implements InterfaceC5552c<K> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PersistentHashMap<K, V> f218577b;

    public o(@NotNull PersistentHashMap<K, V> map) {
        G.p(map, "map");
        this.f218577b = map;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f218577b.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f218577b.getSize();
    }

    @Override // kotlin.collections.AbstractC4869k, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<K> iterator() {
        return new p(this.f218577b.f218544d);
    }
}
