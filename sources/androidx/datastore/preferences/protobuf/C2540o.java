package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.V;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2540o extends AbstractC2514b<Boolean> implements V.a, RandomAccess, InterfaceC2562z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2540o f112901e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean[] f112902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112903d;

    static {
        C2540o c2540o = new C2540o(new boolean[0], 0);
        f112901e = c2540o;
        c2540o.f112824a = false;
    }

    public C2540o() {
        this(new boolean[10], 0);
    }

    public static C2540o i() {
        return f112901e;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        b();
        V.d(collection);
        if (!(collection instanceof C2540o)) {
            return super.addAll(collection);
        }
        C2540o c2540o = (C2540o) collection;
        int i10 = c2540o.f112903d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f112903d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f112902c;
        if (i12 > zArr.length) {
            this.f112902c = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c2540o.f112902c, 0, this.f112902c, this.f112903d, c2540o.f112903d);
        this.f112903d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.a
    public void addBoolean(boolean z10) {
        b();
        int i10 = this.f112903d;
        boolean[] zArr = this.f112902c;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[C2538n.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f112902c = zArr2;
        }
        boolean[] zArr3 = this.f112902c;
        int i11 = this.f112903d;
        this.f112903d = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        h(i10, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.V.a
    public boolean e(int i10, boolean z10) {
        b();
        j(i10);
        boolean[] zArr = this.f112902c;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2540o)) {
            return super.equals(obj);
        }
        C2540o c2540o = (C2540o) obj;
        if (this.f112903d != c2540o.f112903d) {
            return false;
        }
        boolean[] zArr = c2540o.f112902c;
        for (int i10 = 0; i10 < this.f112903d; i10++) {
            if (this.f112902c[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public boolean g(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    public final void h(int i10, boolean z10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f112903d)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        boolean[] zArr = this.f112902c;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[C2538n.a(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f112902c, i10, zArr2, i10 + 1, this.f112903d - i10);
            this.f112902c = zArr2;
        }
        this.f112902c[i10] = z10;
        this.f112903d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iK = 1;
        for (int i10 = 0; i10 < this.f112903d; i10++) {
            iK = (iK * 31) + V.k(this.f112902c[i10]);
        }
        return iK;
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.f112903d) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(r(i10));
    }

    public final String n(int i10) {
        StringBuilder sbA = android.support.v4.media.a.a("Index:", i10, ", Size:");
        sbA.append(this.f112903d);
        return sbA.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        b();
        j(i10);
        boolean[] zArr = this.f112902c;
        boolean z10 = zArr[i10];
        if (i10 < this.f112903d - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f112903d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(e(i10, bool.booleanValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.V.a
    public boolean r(int i10) {
        j(i10);
        return this.f112902c[i10];
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f112902c;
        System.arraycopy(zArr, i11, zArr, i10, this.f112903d - i11);
        this.f112903d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f112903d;
    }

    public C2540o(boolean[] zArr, int i10) {
        this.f112902c = zArr;
        this.f112903d = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        g((Boolean) obj);
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.k
    /* JADX INFO: renamed from: d */
    public V.k<Boolean> d2(int i10) {
        if (i10 >= this.f112903d) {
            return new C2540o(Arrays.copyOf(this.f112902c, i10), this.f112903d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f112903d; i10++) {
            if (obj.equals(Boolean.valueOf(this.f112902c[i10]))) {
                boolean[] zArr = this.f112902c;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f112903d - i10) - 1);
                this.f112903d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
