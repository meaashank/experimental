package kotlin.sequences;

import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4999l<T1, T2, V> implements InterfaceC5000m<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T1> f218196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T2> f218197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.p<T1, T2, V> f218198c;

    /* JADX INFO: renamed from: kotlin.sequences.l$a */
    public static final class a implements Iterator<V>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T1> f218199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T2> f218200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4999l<T1, T2, V> f218201c;

        public a(C4999l<T1, T2, V> c4999l) {
            this.f218201c = c4999l;
            this.f218199a = c4999l.f218196a.iterator();
            this.f218200b = c4999l.f218197b.iterator();
        }

        public final Iterator<T1> b() {
            return this.f218199a;
        }

        public final Iterator<T2> d() {
            return this.f218200b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f218199a.hasNext() && this.f218200b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.f218201c.f218198c.invoke(this.f218199a.next(), this.f218200b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4999l(@NotNull InterfaceC5000m<? extends T1> sequence1, @NotNull InterfaceC5000m<? extends T2> sequence2, @NotNull ed.p<? super T1, ? super T2, ? extends V> transform) {
        kotlin.jvm.internal.G.p(sequence1, "sequence1");
        kotlin.jvm.internal.G.p(sequence2, "sequence2");
        kotlin.jvm.internal.G.p(transform, "transform");
        this.f218196a = sequence1;
        this.f218197b = sequence2;
        this.f218198c = transform;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<V> iterator() {
        return new a(this);
    }
}
