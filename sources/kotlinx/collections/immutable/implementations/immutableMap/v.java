package kotlinx.collections.immutable.implementations.immutableMap;

/* JADX INFO: loaded from: classes5.dex */
public final class v<K, V> extends t<K, V, K> {
    @Override // java.util.Iterator
    public K next() {
        int i10 = this.f218589c;
        this.f218589c = i10 + 2;
        return (K) this.f218587a[i10];
    }
}
