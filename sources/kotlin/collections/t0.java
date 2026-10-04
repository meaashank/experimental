package kotlin.collections;

import fd.InterfaceC4423f;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class t0<T> extends AbstractC4866h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<T> f217650a;

    public static final class a implements ListIterator<T>, InterfaceC4423f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListIterator<T> f217651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t0<T> f217652b;

        public a(t0<T> t0Var, int i10) {
            this.f217652b = t0Var;
            this.f217651a = t0Var.f217650a.listIterator(O.g1(t0Var, i10));
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            this.f217651a.add(t10);
            this.f217651a.previous();
        }

        public final ListIterator<T> b() {
            return this.f217651a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f217651a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f217651a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f217651a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            t0<T> t0Var = this.f217652b;
            return I.L(t0Var) - this.f217651a.previousIndex();
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f217651a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            t0<T> t0Var = this.f217652b;
            return I.L(t0Var) - this.f217651a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f217651a.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.f217651a.set(t10);
        }
    }

    public t0(@NotNull List<T> delegate) {
        kotlin.jvm.internal.G.p(delegate, "delegate");
        this.f217650a = delegate;
    }

    @Override // kotlin.collections.AbstractC4866h, java.util.AbstractList, java.util.List
    public void add(int i10, T t10) {
        this.f217650a.add(O.g1(this, i10), t10);
    }

    @Override // kotlin.collections.AbstractC4866h
    public T b(int i10) {
        return this.f217650a.remove(O.e1(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f217650a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.f217650a.get(O.e1(this, i10));
    }

    @Override // kotlin.collections.AbstractC4866h
    public int getSize() {
        return this.f217650a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // kotlin.collections.AbstractC4866h, java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        return this.f217650a.set(O.e1(this, i10), t10);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i10) {
        return new a(this, i10);
    }
}
