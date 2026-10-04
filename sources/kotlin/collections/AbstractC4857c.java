package kotlin.collections;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4857c<T> implements Iterator<T>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f217599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public T f217600b;

    public abstract void b();

    public final void d() {
        this.f217599a = 2;
    }

    public final void e(T t10) {
        this.f217600b = t10;
        this.f217599a = 1;
    }

    public final boolean f() {
        this.f217599a = 3;
        b();
        return this.f217599a == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f217599a;
        if (i10 == 0) {
            return f();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f217599a;
        if (i10 == 1) {
            this.f217599a = 0;
            return this.f217600b;
        }
        if (i10 == 2 || !f()) {
            throw new NoSuchElementException();
        }
        this.f217599a = 0;
        return this.f217600b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
