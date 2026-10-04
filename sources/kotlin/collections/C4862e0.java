package kotlin.collections;

import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4862e0<T> implements Iterator<C4858c0<? extends T>>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Iterator<T> f217613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217614b;

    /* JADX WARN: Multi-variable type inference failed */
    public C4862e0(@NotNull Iterator<? extends T> iterator) {
        kotlin.jvm.internal.G.p(iterator, "iterator");
        this.f217613a = iterator;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4858c0<T> next() {
        int i10 = this.f217614b;
        this.f217614b = i10 + 1;
        if (i10 >= 0) {
            return new C4858c0<>(i10, this.f217613a.next());
        }
        I.b0();
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f217613a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
