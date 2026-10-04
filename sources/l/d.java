package L;

import androidx.compose.runtime.internal.r;
import fd.InterfaceC4418a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public class d<E> implements Iterator<E>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58613d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Object f58614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<E, a> f58615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58616c;

    public d(@Nullable Object obj, @NotNull Map<E, a> map) {
        this.f58614a = obj;
        this.f58615b = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int d() {
        return this.f58616c;
    }

    @NotNull
    public final Map<E, a> e() {
        return this.f58615b;
    }

    public final void f(int i10) {
        this.f58616c = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58616c < this.f58615b.size();
    }

    @Override // java.util.Iterator
    public E next() {
        b();
        E e10 = (E) this.f58614a;
        this.f58616c++;
        a aVar = this.f58615b.get(e10);
        if (aVar != null) {
            this.f58614a = aVar.f58601b;
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
