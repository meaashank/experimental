package androidx.compose.runtime.snapshots;

import fd.InterfaceC4421d;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class H<K, V> extends F<K, V> implements Iterator<V>, InterfaceC4421d {
    public H(@NotNull x<K, V> xVar, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(xVar, it);
    }

    @Override // java.util.Iterator
    public V next() {
        Map.Entry<? extends K, ? extends V> entry = this.f100049e;
        if (entry == null) {
            throw new IllegalStateException();
        }
        e();
        return entry.getValue();
    }
}
