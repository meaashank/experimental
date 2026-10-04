package kotlin.sequences;

import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4997j<T> implements InterfaceC5000m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<T> f218188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<T, T> f218189b;

    /* JADX INFO: renamed from: kotlin.sequences.j$a */
    public static final class a implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f218190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f218191b = -2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4997j<T> f218192c;

        public a(C4997j<T> c4997j) {
            this.f218192c = c4997j;
        }

        private final void b() {
            T tInvoke;
            if (this.f218191b == -2) {
                tInvoke = this.f218192c.f218188a.invoke();
            } else {
                ed.l<T, T> lVar = this.f218192c.f218189b;
                T t10 = this.f218190a;
                kotlin.jvm.internal.G.m(t10);
                tInvoke = lVar.invoke(t10);
            }
            this.f218190a = tInvoke;
            this.f218191b = tInvoke == null ? 0 : 1;
        }

        public final T d() {
            return this.f218190a;
        }

        public final int e() {
            return this.f218191b;
        }

        public final void f(T t10) {
            this.f218190a = t10;
        }

        public final void g(int i10) {
            this.f218191b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f218191b < 0) {
                b();
            }
            return this.f218191b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f218191b < 0) {
                b();
            }
            if (this.f218191b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f218190a;
            kotlin.jvm.internal.G.n(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f218191b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4997j(@NotNull InterfaceC4376a<? extends T> getInitialValue, @NotNull ed.l<? super T, ? extends T> getNextValue) {
        kotlin.jvm.internal.G.p(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.G.p(getNextValue, "getNextValue");
        this.f218188a = getInitialValue;
        this.f218189b = getNextValue;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
