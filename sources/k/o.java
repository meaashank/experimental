package K;

import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class o<K, V> implements Iterator<K>, InterfaceC4418a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58324b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p<K, V> f58325a;

    public o(@NotNull c<K, V> cVar) {
        this.f58325a = new p<>(cVar.f58291d, cVar.f58293f);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58325a.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        p<K, V> pVar = this.f58325a;
        K k10 = (K) pVar.f58327a;
        pVar.next();
        return k10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
