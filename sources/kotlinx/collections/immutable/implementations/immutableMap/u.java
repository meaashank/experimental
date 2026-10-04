package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class u<K, V> extends t<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        int i10 = this.f218589c;
        this.f218589c = i10 + 2;
        Object[] objArr = this.f218587a;
        return new b(objArr[i10], objArr[i10 + 1]);
    }
}
