package K;

import fd.InterfaceC4421d;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class h<K, V> implements Iterator<K>, InterfaceC4421d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58305b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<K, V> f58306a;

    public h(@NotNull d<K, V> dVar) {
        this.f58306a = new i<>(dVar.f58296b, dVar);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58306a.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        this.f58306a.next();
        return (K) this.f58306a.f58310c;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f58306a.remove();
    }
}
