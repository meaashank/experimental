package K;

import fd.InterfaceC4421d;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class k<K, V> implements Iterator<V>, InterfaceC4421d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58316b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<K, V> f58317a;

    public k(@NotNull d<K, V> dVar) {
        this.f58317a = new i<>(dVar.f58296b, dVar);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58317a.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.f58317a.next().f58283a;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f58317a.remove();
    }
}
