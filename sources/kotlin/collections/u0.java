package kotlin.collections;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class u0<T> extends AbstractC4859d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<T> f217654c;

    public static final class a implements ListIterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListIterator<T> f217655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u0<T> f217656b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(u0<? extends T> u0Var, int i10) {
            this.f217656b = u0Var;
            this.f217655a = u0Var.f217654c.listIterator(O.g1(u0Var, i10));
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final ListIterator<T> b() {
            return this.f217655a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f217655a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f217655a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f217655a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            u0<T> u0Var = this.f217656b;
            return I.L(u0Var) - this.f217655a.previousIndex();
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f217655a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            u0<T> u0Var = this.f217656b;
            return I.L(u0Var) - this.f217655a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u0(@NotNull List<? extends T> delegate) {
        kotlin.jvm.internal.G.p(delegate, "delegate");
        this.f217654c = delegate;
    }

    @Override // kotlin.collections.AbstractC4859d, java.util.List
    public T get(int i10) {
        return this.f217654c.get(O.e1(this, i10));
    }

    @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f217654c.size();
    }

    @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC4859d, java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC4859d, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i10) {
        return new a(this, i10);
    }
}
