package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import fd.InterfaceC4424g;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b<K, V> extends kotlinx.collections.immutable.implementations.immutableMap.b<K, V> implements Map.Entry<K, V>, InterfaceC4424g.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<K, a<V>> f218640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public a<V> f218641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Map<K, a<V>> mutableMap, K k10, @NotNull a<V> links) {
        super(k10, links.f218637a);
        G.p(mutableMap, "mutableMap");
        G.p(links, "links");
        this.f218640c = mutableMap;
        this.f218641d = links;
    }

    @Override // kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V getValue() {
        return this.f218641d.f218637a;
    }

    @Override // kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V setValue(V v10) {
        a<V> aVar = this.f218641d;
        V v11 = aVar.f218637a;
        a<V> aVarH = aVar.h(v10);
        this.f218641d = aVarH;
        this.f218640c.put(this.f218560a, aVarH);
        return v11;
    }
}
