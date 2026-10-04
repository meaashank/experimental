package kotlinx.collections.immutable.implementations.immutableMap;

/* JADX INFO: loaded from: classes5.dex */
public final class y<K, V> extends t<K, V, V> {
    @Override // java.util.Iterator
    public V next() {
        int i10 = this.f218589c;
        this.f218589c = i10 + 2;
        return (V) this.f218587a[i10 + 1];
    }
}
