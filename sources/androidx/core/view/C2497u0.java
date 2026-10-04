package androidx.core.view;

import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.core.view.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2497u0<T> implements Iterator<T>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<T, Iterator<T>> f111955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Iterator<T>> f111956b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Iterator<? extends T> f111957c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2497u0(@NotNull Iterator<? extends T> it, @NotNull ed.l<? super T, ? extends Iterator<? extends T>> lVar) {
        this.f111955a = lVar;
        this.f111957c = it;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void b(T t10) {
        Iterator<T> itInvoke = this.f111955a.invoke(t10);
        if (itInvoke != null && itInvoke.hasNext()) {
            this.f111956b.add((Iterator<T>) this.f111957c);
            this.f111957c = itInvoke;
        } else {
            while (!this.f111957c.hasNext() && !this.f111956b.isEmpty()) {
                this.f111957c = (Iterator) kotlin.collections.U.u3(this.f111956b);
                kotlin.collections.N.Q0(this.f111956b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f111957c.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.f111957c.next();
        b(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
