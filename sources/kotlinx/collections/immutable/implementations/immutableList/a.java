package kotlinx.collections.immutable.implementations.immutableList;

import fd.InterfaceC4418a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<E> implements ListIterator<E>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f218517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218518b;

    public a(int i10, int i11) {
        this.f218517a = i10;
        this.f218518b = i11;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void d() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int e() {
        return this.f218517a;
    }

    public final void f(int i10) {
        this.f218517a = i10;
    }

    public final void g(int i10) {
        this.f218518b = i10;
    }

    public final int getSize() {
        return this.f218518b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f218517a < this.f218518b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f218517a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f218517a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f218517a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
