package K;

import fd.InterfaceC4418a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public class p<K, V> implements Iterator<a<V>>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58326d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Object f58327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<K, a<V>> f58328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58329c;

    public p(@Nullable Object obj, @NotNull Map<K, a<V>> map) {
        this.f58327a = obj;
        this.f58328b = map;
    }

    public final int b() {
        return this.f58329c;
    }

    @Nullable
    public final Object d() {
        return this.f58327a;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        a<V> aVar = this.f58328b.get(this.f58327a);
        if (aVar != null) {
            a<V> aVar2 = aVar;
            this.f58329c++;
            this.f58327a = aVar2.f58285c;
            return aVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f58327a + ") has changed after it was added to the persistent map.");
    }

    public final void f(int i10) {
        this.f58329c = i10;
    }

    public final void g(@Nullable Object obj) {
        this.f58327a = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58329c < this.f58328b.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
