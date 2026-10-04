package J;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 4)
public final class x<K, V> extends v<K, V, K> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f53108e = 0;

    @Override // java.util.Iterator
    public K next() {
        int i10 = this.f53106c;
        this.f53106c = i10 + 2;
        return (K) this.f53104a[i10];
    }
}
