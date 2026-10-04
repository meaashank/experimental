package kotlin.sequences;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class P<T> implements InterfaceC5000m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<T, Boolean> f218056b;

    public static final class a implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f218057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f218058b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f218059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ P<T> f218060d;

        public a(P<T> p10) {
            this.f218060d = p10;
            this.f218057a = p10.f218055a.iterator();
        }

        private final void b() {
            if (this.f218057a.hasNext()) {
                T next = this.f218057a.next();
                if (this.f218060d.f218056b.invoke(next).booleanValue()) {
                    this.f218058b = 1;
                    this.f218059c = next;
                    return;
                }
            }
            this.f218058b = 0;
        }

        public final Iterator<T> d() {
            return this.f218057a;
        }

        public final T e() {
            return this.f218059c;
        }

        public final int f() {
            return this.f218058b;
        }

        public final void g(T t10) {
            this.f218059c = t10;
        }

        public final void h(int i10) {
            this.f218058b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f218058b == -1) {
                b();
            }
            return this.f218058b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f218058b == -1) {
                b();
            }
            if (this.f218058b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f218059c;
            this.f218059c = null;
            this.f218058b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P(@NotNull InterfaceC5000m<? extends T> sequence, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        this.f218055a = sequence;
        this.f218056b = predicate;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
