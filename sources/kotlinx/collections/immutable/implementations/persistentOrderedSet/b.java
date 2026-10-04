package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import fd.InterfaceC4418a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class b<E> implements Iterator<E>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Object f218678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<E, a> f218679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218680c;

    public b(@Nullable Object obj, @NotNull Map<E, a> map) {
        G.p(map, "map");
        this.f218678a = obj;
        this.f218679b = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int d() {
        return this.f218680c;
    }

    @NotNull
    public final Map<E, a> e() {
        return this.f218679b;
    }

    public final void f(int i10) {
        this.f218680c = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218680c < this.f218679b.size();
    }

    @Override // java.util.Iterator
    public E next() {
        b();
        E e10 = (E) this.f218678a;
        this.f218680c++;
        a aVar = this.f218679b.get(e10);
        if (aVar != null) {
            this.f218678a = aVar.f218677b;
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
