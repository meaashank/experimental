package kotlin.sequences;

import androidx.compose.animation.core.C1610t;
import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,730:1\n1#2:731\n*E\n"})
public final class O<T> implements InterfaceC5000m<T>, InterfaceC4992e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f218052b;

    public static final class a implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f218053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f218054b;

        public a(O<T> o10) {
            this.f218053a = o10.f218052b;
            this.f218054b = o10.f218051a.iterator();
        }

        public final Iterator<T> b() {
            return this.f218054b;
        }

        public final int d() {
            return this.f218053a;
        }

        public final void e(int i10) {
            this.f218053a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f218053a > 0 && this.f218054b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f218053a;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f218053a = i10 - 1;
            return this.f218054b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public O(@NotNull InterfaceC5000m<? extends T> sequence, int i10) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        this.f218051a = sequence;
        this.f218052b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("count must be non-negative, but was ", i10, '.').toString());
        }
    }

    @Override // kotlin.sequences.InterfaceC4992e
    @NotNull
    public InterfaceC5000m<T> a(int i10) {
        int i11 = this.f218052b;
        return i10 >= i11 ? C4994g.f218169a : new N(this.f218051a, i10, i11);
    }

    @Override // kotlin.sequences.InterfaceC4992e
    @NotNull
    public InterfaceC5000m<T> b(int i10) {
        return i10 >= this.f218052b ? this : new O(this.f218051a, i10);
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
