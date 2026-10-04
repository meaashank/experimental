package K;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class m<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, InterfaceC4418a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58320b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p<K, V> f58321a;

    public m(@NotNull c<K, V> cVar) {
        this.f58321a = new p<>(cVar.f58291d, cVar.f58293f);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        p<K, V> pVar = this.f58321a;
        return new J.b(pVar.f58327a, pVar.next().f58283a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58321a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
