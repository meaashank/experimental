package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.r;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class g<E> extends a<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f99614e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f99615d;

    public g(E e10, int i10) {
        super(i10, 1);
        this.f99615d = e10;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public E next() {
        b();
        this.f99595a++;
        return this.f99615d;
    }

    @Override // java.util.ListIterator
    public E previous() {
        d();
        this.f99595a--;
        return this.f99615d;
    }
}
