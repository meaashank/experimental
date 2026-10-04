package kotlin.sequences;

import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Q<T, R> implements InterfaceC5000m<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.p<Integer, T, R> f218062b;

    public static final class a implements Iterator<R>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f218063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f218064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q<T, R> f218065c;

        public a(Q<T, R> q10) {
            this.f218065c = q10;
            this.f218063a = q10.f218061a.iterator();
        }

        public final int b() {
            return this.f218064b;
        }

        public final Iterator<T> d() {
            return this.f218063a;
        }

        public final void e(int i10) {
            this.f218064b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f218063a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            ed.p<Integer, T, R> pVar = this.f218065c.f218062b;
            int i10 = this.f218064b;
            this.f218064b = i10 + 1;
            if (i10 >= 0) {
                return (R) pVar.invoke(Integer.valueOf(i10), this.f218063a.next());
            }
            kotlin.collections.I.b0();
            throw null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q(@NotNull InterfaceC5000m<? extends T> sequence, @NotNull ed.p<? super Integer, ? super T, ? extends R> transformer) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        kotlin.jvm.internal.G.p(transformer, "transformer");
        this.f218061a = sequence;
        this.f218062b = transformer;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<R> iterator() {
        return new a(this);
    }
}
