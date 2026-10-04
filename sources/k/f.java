package K;

import fd.InterfaceC4421d;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class f<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC4421d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58301b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i<K, V> f58302a;

    public f(@NotNull d<K, V> dVar) {
        this.f58302a = new i<>(dVar.f58296b, dVar);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        a<V> next = this.f58302a.next();
        i<K, V> iVar = this.f58302a;
        return new b(iVar.f58309b.f58298d, iVar.f58310c, next);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58302a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f58302a.remove();
    }
}
