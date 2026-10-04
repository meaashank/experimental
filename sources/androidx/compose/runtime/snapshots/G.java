package androidx.compose.runtime.snapshots;

import fd.InterfaceC4421d;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class G<K, V> extends F<K, V> implements Iterator<K>, InterfaceC4421d {
    public G(@NotNull x<K, V> xVar, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(xVar, it);
    }

    @Override // java.util.Iterator
    public K next() {
        Map.Entry<? extends K, ? extends V> entry = this.f100049e;
        if (entry == null) {
            throw new IllegalStateException();
        }
        e();
        return entry.getKey();
    }
}
