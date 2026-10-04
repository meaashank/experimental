package J;

import fd.InterfaceC4421d;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC4421d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53075b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g<K, V, Map.Entry<K, V>> f53076a;

    public i(@NotNull f<K, V> fVar) {
        v[] vVarArr = new v[8];
        for (int i10 = 0; i10 < 8; i10++) {
            vVarArr[i10] = new z(this);
        }
        this.f53076a = new g<>(fVar, vVarArr);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return this.f53076a.next();
    }

    public final void d(K k10, V v10) {
        this.f53076a.q(k10, v10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53076a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f53076a.remove();
    }
}
