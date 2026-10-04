package kotlin.sequences;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4995h<T> implements InterfaceC5000m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f218171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.l<T, Boolean> f218172c;

    /* JADX INFO: renamed from: kotlin.sequences.h$a */
    public static final class a implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f218173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f218174b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f218175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C4995h<T> f218176d;

        public a(C4995h<T> c4995h) {
            this.f218176d = c4995h;
            this.f218173a = c4995h.f218170a.iterator();
        }

        public final void b() {
            while (this.f218173a.hasNext()) {
                T next = this.f218173a.next();
                if (this.f218176d.f218172c.invoke(next).booleanValue() == this.f218176d.f218171b) {
                    this.f218175c = next;
                    this.f218174b = 1;
                    return;
                }
            }
            this.f218174b = 0;
        }

        public final Iterator<T> d() {
            return this.f218173a;
        }

        public final T e() {
            return this.f218175c;
        }

        public final int f() {
            return this.f218174b;
        }

        public final void g(T t10) {
            this.f218175c = t10;
        }

        public final void h(int i10) {
            this.f218174b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f218174b == -1) {
                b();
            }
            return this.f218174b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f218174b == -1) {
                b();
            }
            if (this.f218174b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f218175c;
            this.f218175c = null;
            this.f218174b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4995h(@NotNull InterfaceC5000m<? extends T> sequence, boolean z10, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        this.f218170a = sequence;
        this.f218171b = z10;
        this.f218172c = predicate;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ C4995h(InterfaceC5000m interfaceC5000m, boolean z10, ed.l lVar, int i10, C4969v c4969v) {
        this(interfaceC5000m, (i10 & 2) != 0 ? true : z10, lVar);
    }
}
