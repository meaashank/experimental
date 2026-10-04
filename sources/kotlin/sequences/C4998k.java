package kotlin.sequences;

import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.collections.C4858c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4998k<T> implements InterfaceC5000m<C4858c0<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218193a;

    /* JADX INFO: renamed from: kotlin.sequences.k$a */
    public static final class a implements Iterator<C4858c0<? extends T>>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f218194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f218195b;

        public a(C4998k<T> c4998k) {
            this.f218194a = c4998k.f218193a.iterator();
        }

        public final int b() {
            return this.f218195b;
        }

        public final Iterator<T> d() {
            return this.f218194a;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C4858c0<T> next() {
            int i10 = this.f218195b;
            this.f218195b = i10 + 1;
            if (i10 >= 0) {
                return new C4858c0<>(i10, this.f218194a.next());
            }
            kotlin.collections.I.b0();
            throw null;
        }

        public final void f(int i10) {
            this.f218195b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f218194a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4998k(@NotNull InterfaceC5000m<? extends T> sequence) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        this.f218193a = sequence;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<C4858c0<T>> iterator() {
        return new a(this);
    }
}
