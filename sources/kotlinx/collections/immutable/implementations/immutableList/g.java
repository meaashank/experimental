package kotlinx.collections.immutable.implementations.immutableList;

/* JADX INFO: loaded from: classes5.dex */
public final class g<E> extends a<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f218531c;

    public g(E e10, int i10) {
        super(i10, 1);
        this.f218531c = e10;
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public E next() {
        b();
        this.f218517a++;
        return this.f218531c;
    }

    @Override // java.util.ListIterator
    public E previous() {
        d();
        this.f218517a--;
        return this.f218531c;
    }
}
