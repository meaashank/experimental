package kotlinx.collections.immutable.implementations.immutableMap;

import fd.InterfaceC4421d;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC4421d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e<K, V, Map.Entry<K, V>> f218572a;

    public g(@NotNull PersistentHashMapBuilder<K, V> builder) {
        G.p(builder, "builder");
        t[] tVarArr = new t[8];
        for (int i10 = 0; i10 < 8; i10++) {
            tVarArr[i10] = new x(this);
        }
        this.f218572a = new e<>(builder, tVarArr);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return this.f218572a.next();
    }

    public final void d(K k10, V v10) {
        this.f218572a.q(k10, v10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218572a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f218572a.remove();
    }
}
