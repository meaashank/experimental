package androidx.collection;

import fd.InterfaceC4421d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,50:1\n32#2,5:51\n*S KotlinDebug\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n*L\n43#1:51,5\n*E\n"})
public abstract class C<T> implements Iterator<T>, InterfaceC4421d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86680c;

    public C(int i10) {
        this.f86678a = i10;
    }

    public abstract T b(int i10);

    public abstract void d(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86679b < this.f86678a;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tB = b(this.f86679b);
        this.f86679b++;
        this.f86680c = true;
        return tB;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f86680c) {
            A.f.d("Call next() before removing an element.");
            throw null;
        }
        int i10 = this.f86679b - 1;
        this.f86679b = i10;
        d(i10);
        this.f86678a--;
        this.f86680c = false;
    }
}
