package kotlin.sequences;

import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class S<T, R> implements InterfaceC5000m<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<T, R> f218067b;

    public static final class a implements Iterator<R>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f218068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ S<T, R> f218069b;

        public a(S<T, R> s10) {
            this.f218069b = s10;
            this.f218068a = s10.f218066a.iterator();
        }

        public final Iterator<T> b() {
            return this.f218068a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f218068a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f218069b.f218067b.invoke(this.f218068a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S(@NotNull InterfaceC5000m<? extends T> sequence, @NotNull ed.l<? super T, ? extends R> transformer) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        kotlin.jvm.internal.G.p(transformer, "transformer");
        this.f218066a = sequence;
        this.f218067b = transformer;
    }

    @NotNull
    public final <E> InterfaceC5000m<E> e(@NotNull ed.l<? super R, ? extends Iterator<? extends E>> iterator) {
        kotlin.jvm.internal.G.p(iterator, "iterator");
        return new C4996i(this.f218066a, this.f218067b, iterator);
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<R> iterator() {
        return new a(this);
    }
}
