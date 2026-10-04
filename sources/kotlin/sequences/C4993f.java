package kotlin.sequences;

import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4993f<T> implements InterfaceC5000m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<T, Boolean> f218164b;

    /* JADX INFO: renamed from: kotlin.sequences.f$a */
    public static final class a implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f218165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f218166b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f218167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C4993f<T> f218168d;

        public a(C4993f<T> c4993f) {
            this.f218168d = c4993f;
            this.f218165a = c4993f.f218163a.iterator();
        }

        private final void b() {
            while (this.f218165a.hasNext()) {
                T next = this.f218165a.next();
                if (!this.f218168d.f218164b.invoke(next).booleanValue()) {
                    this.f218167c = next;
                    this.f218166b = 1;
                    return;
                }
            }
            this.f218166b = 0;
        }

        public final int d() {
            return this.f218166b;
        }

        public final Iterator<T> e() {
            return this.f218165a;
        }

        public final T f() {
            return this.f218167c;
        }

        public final void g(int i10) {
            this.f218166b = i10;
        }

        public final void h(T t10) {
            this.f218167c = t10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f218166b == -1) {
                b();
            }
            return this.f218166b == 1 || this.f218165a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f218166b == -1) {
                b();
            }
            if (this.f218166b != 1) {
                return this.f218165a.next();
            }
            T t10 = this.f218167c;
            this.f218167c = null;
            this.f218166b = 0;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4993f(@NotNull InterfaceC5000m<? extends T> sequence, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        this.f218163a = sequence;
        this.f218164b = predicate;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
