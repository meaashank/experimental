package K;

import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class r<K, V> implements Iterator<V>, InterfaceC4418a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58332b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p<K, V> f58333a;

    public r(@NotNull c<K, V> cVar) {
        this.f58333a = new p<>(cVar.f58291d, cVar.f58293f);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58333a.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.f58333a.next().f58283a;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
