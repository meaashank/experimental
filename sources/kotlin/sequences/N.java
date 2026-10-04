package kotlin.sequences;

import androidx.compose.foundation.text.C1758e;
import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,730:1\n1#2:731\n*E\n"})
public final class N<T> implements InterfaceC5000m<T>, InterfaceC4992e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f218046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f218047c;

    public static final class a implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f218048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f218049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N<T> f218050c;

        public a(N<T> n10) {
            this.f218050c = n10;
            this.f218048a = n10.f218045a.iterator();
        }

        private final void b() {
            while (this.f218049b < this.f218050c.f218046b && this.f218048a.hasNext()) {
                this.f218048a.next();
                this.f218049b++;
            }
        }

        public final Iterator<T> d() {
            return this.f218048a;
        }

        public final int e() {
            return this.f218049b;
        }

        public final void f(int i10) {
            this.f218049b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f218049b < this.f218050c.f218047c && this.f218048a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            int i10 = this.f218049b;
            if (i10 >= this.f218050c.f218047c) {
                throw new NoSuchElementException();
            }
            this.f218049b = i10 + 1;
            return this.f218048a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public N(@NotNull InterfaceC5000m<? extends T> sequence, int i10, int i11) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        this.f218045a = sequence;
        this.f218046b = i10;
        this.f218047c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("startIndex should be non-negative, but is ", i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("endIndex should be non-negative, but is ", i11).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(C1758e.a("endIndex should be not less than startIndex, but was ", i11, " < ", i10).toString());
        }
    }

    @Override // kotlin.sequences.InterfaceC4992e
    @NotNull
    public InterfaceC5000m<T> a(int i10) {
        return i10 >= f() ? C4994g.f218169a : new N(this.f218045a, this.f218046b + i10, this.f218047c);
    }

    @Override // kotlin.sequences.InterfaceC4992e
    @NotNull
    public InterfaceC5000m<T> b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        InterfaceC5000m<T> interfaceC5000m = this.f218045a;
        int i11 = this.f218046b;
        return new N(interfaceC5000m, i11, i10 + i11);
    }

    public final int f() {
        return this.f218047c - this.f218046b;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
