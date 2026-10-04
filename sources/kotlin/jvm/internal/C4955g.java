package kotlin.jvm.internal;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4955g<T> implements Iterator<T>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T[] f217943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217944b;

    public C4955g(@NotNull T[] array) {
        G.p(array, "array");
        this.f217943a = array;
    }

    @NotNull
    public final T[] b() {
        return this.f217943a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f217944b < this.f217943a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f217943a;
            int i10 = this.f217944b;
            this.f217944b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f217944b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
