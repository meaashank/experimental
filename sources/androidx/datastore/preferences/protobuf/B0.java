package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class B0<E> extends AbstractC2514b<E> implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B0<Object> f112503e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E[] f112504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112505d;

    static {
        B0<Object> b02 = new B0<>(new Object[0], 0);
        f112503e = b02;
        b02.f112824a = false;
    }

    public B0() {
        this(new Object[10], 0);
    }

    public static <E> E[] c(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> B0<E> g() {
        return (B0<E>) f112503e;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f112505d) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        StringBuilder sbA = android.support.v4.media.a.a("Index:", i10, ", Size:");
        sbA.append(this.f112505d);
        return sbA.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        b();
        int i10 = this.f112505d;
        E[] eArr = this.f112504c;
        if (i10 == eArr.length) {
            this.f112504c = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f112504c;
        int i11 = this.f112505d;
        this.f112505d = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        h(i10);
        return this.f112504c[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.V.k
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public B0<E> d(int i10) {
        if (i10 >= this.f112505d) {
            return new B0<>(Arrays.copyOf(this.f112504c, i10), this.f112505d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        b();
        h(i10);
        E[] eArr = this.f112504c;
        E e10 = eArr[i10];
        if (i10 < this.f112505d - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f112505d--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        b();
        h(i10);
        E[] eArr = this.f112504c;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f112505d;
    }

    public B0(E[] eArr, int i10) {
        this.f112504c = eArr;
        this.f112505d = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f112505d)) {
            E[] eArr = this.f112504c;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[C2538n.a(i11, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f112504c, i10, eArr2, i10 + 1, this.f112505d - i10);
                this.f112504c = eArr2;
            }
            this.f112504c[i10] = e10;
            this.f112505d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i10));
    }
}
