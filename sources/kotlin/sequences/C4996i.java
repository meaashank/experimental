package kotlin.sequences;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4996i<T, R, E> implements InterfaceC5000m<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<T, R> f218178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.l<R, Iterator<E>> f218179c;

    /* JADX INFO: renamed from: kotlin.sequences.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f218180a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f218181b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f218182c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f218183d = 2;
    }

    /* JADX INFO: renamed from: kotlin.sequences.i$b */
    public static final class b implements Iterator<E>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f218184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<? extends E> f218185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f218186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C4996i<T, R, E> f218187d;

        public b(C4996i<T, R, E> c4996i) {
            this.f218187d = c4996i;
            this.f218184a = c4996i.f218177a.iterator();
        }

        public final boolean b() {
            Iterator<? extends E> it = this.f218185b;
            if (it != null && it.hasNext()) {
                this.f218186c = 1;
                return true;
            }
            while (this.f218184a.hasNext()) {
                T next = this.f218184a.next();
                C4996i<T, R, E> c4996i = this.f218187d;
                Iterator<? extends E> it2 = (Iterator) c4996i.f218179c.invoke(c4996i.f218178b.invoke(next));
                if (it2.hasNext()) {
                    this.f218185b = it2;
                    this.f218186c = 1;
                    return true;
                }
            }
            this.f218186c = 2;
            this.f218185b = null;
            return false;
        }

        public final Iterator<E> d() {
            return this.f218185b;
        }

        public final Iterator<T> e() {
            return this.f218184a;
        }

        public final int f() {
            return this.f218186c;
        }

        public final void g(Iterator<? extends E> it) {
            this.f218185b = it;
        }

        public final void h(int i10) {
            this.f218186c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f218186c;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public E next() {
            int i10 = this.f218186c;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !b()) {
                throw new NoSuchElementException();
            }
            this.f218186c = 0;
            Iterator<? extends E> it = this.f218185b;
            kotlin.jvm.internal.G.m(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4996i(@NotNull InterfaceC5000m<? extends T> sequence, @NotNull ed.l<? super T, ? extends R> transformer, @NotNull ed.l<? super R, ? extends Iterator<? extends E>> iterator) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        kotlin.jvm.internal.G.p(transformer, "transformer");
        kotlin.jvm.internal.G.p(iterator, "iterator");
        this.f218177a = sequence;
        this.f218178b = transformer;
        this.f218179c = iterator;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<E> iterator() {
        return new b(this);
    }
}
