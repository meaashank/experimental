package kotlin.sequences;

import androidx.compose.animation.core.C1610t;
import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,730:1\n1#2:731\n*E\n"})
public final class C4991d<T> implements InterfaceC5000m<T>, InterfaceC4992e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f218160b;

    /* JADX INFO: renamed from: kotlin.sequences.d$a */
    public static final class a implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f218161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f218162b;

        public a(C4991d<T> c4991d) {
            this.f218161a = c4991d.f218159a.iterator();
            this.f218162b = c4991d.f218160b;
        }

        private final void b() {
            while (this.f218162b > 0 && this.f218161a.hasNext()) {
                this.f218161a.next();
                this.f218162b--;
            }
        }

        public final Iterator<T> d() {
            return this.f218161a;
        }

        public final int e() {
            return this.f218162b;
        }

        public final void f(int i10) {
            this.f218162b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f218161a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            return this.f218161a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4991d(@NotNull InterfaceC5000m<? extends T> sequence, int i10) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        this.f218159a = sequence;
        this.f218160b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("count must be non-negative, but was ", i10, '.').toString());
        }
    }

    @Override // kotlin.sequences.InterfaceC4992e
    @NotNull
    public InterfaceC5000m<T> a(int i10) {
        int i11 = this.f218160b + i10;
        return i11 < 0 ? new C4991d(this, i10) : new C4991d(this.f218159a, i11);
    }

    @Override // kotlin.sequences.InterfaceC4992e
    @NotNull
    public InterfaceC5000m<T> b(int i10) {
        int i11 = this.f218160b;
        int i12 = i11 + i10;
        return i12 < 0 ? new O(this, i10) : new N(this.f218159a, i11, i12);
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
