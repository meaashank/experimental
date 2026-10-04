package kotlinx.collections.immutable.implementations.immutableMap;

import fd.InterfaceC4424g;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c<K, V> extends b<K, V> implements Map.Entry<K, V>, InterfaceC4424g.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final g<K, V> f218562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f218563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull g<K, V> parentIterator, K k10, V v10) {
        super(k10, v10);
        G.p(parentIterator, "parentIterator");
        this.f218562c = parentIterator;
        this.f218563d = v10;
    }

    public void b(V v10) {
        this.f218563d = v10;
    }

    @Override // kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V getValue() {
        return this.f218563d;
    }

    @Override // kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V setValue(V v10) {
        V v11 = this.f218563d;
        this.f218563d = v10;
        this.f218562c.d(this.f218560a, v10);
        return v11;
    }
}
