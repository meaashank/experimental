package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.V;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends AbstractC2514b<Integer> implements V.g, RandomAccess, InterfaceC2562z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final U f112707e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f112708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112709d;

    static {
        U u10 = new U(new int[0], 0);
        f112707e = u10;
        u10.f112824a = false;
    }

    public U() {
        this(new int[10], 0);
    }

    public static U i() {
        return f112707e;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f112709d) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        StringBuilder sbA = android.support.v4.media.a.a("Index:", i10, ", Size:");
        sbA.append(this.f112709d);
        return sbA.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        b();
        V.d(collection);
        if (!(collection instanceof U)) {
            return super.addAll(collection);
        }
        U u10 = (U) collection;
        int i10 = u10.f112709d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f112709d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f112708c;
        if (i12 > iArr.length) {
            this.f112708c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(u10.f112708c, 0, this.f112708c, this.f112709d, u10.f112709d);
        this.f112709d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        h(i10, num.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return super.equals(obj);
        }
        U u10 = (U) obj;
        if (this.f112709d != u10.f112709d) {
            return false;
        }
        int[] iArr = u10.f112708c;
        for (int i10 = 0; i10 < this.f112709d; i10++) {
            if (this.f112708c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.g
    public int f(int i10, int i11) {
        b();
        j(i10);
        int[] iArr = this.f112708c;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public boolean g(Integer num) {
        q3(num.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.g
    public int getInt(int i10) {
        j(i10);
        return this.f112708c[i10];
    }

    public final void h(int i10, int i11) {
        int i12;
        b();
        if (i10 < 0 || i10 > (i12 = this.f112709d)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int[] iArr = this.f112708c;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[C2538n.a(i12, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f112708c, i10, iArr2, i10 + 1, this.f112709d - i10);
            this.f112708c = iArr2;
        }
        this.f112708c[i10] = i11;
        this.f112709d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f112709d; i11++) {
            i10 = (i10 * 31) + this.f112708c[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        b();
        j(i10);
        int[] iArr = this.f112708c;
        int i11 = iArr[i10];
        if (i10 < this.f112709d - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f112709d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(f(i10, num.intValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.V.g
    public void q3(int i10) {
        b();
        int i11 = this.f112709d;
        int[] iArr = this.f112708c;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[C2538n.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f112708c = iArr2;
        }
        int[] iArr3 = this.f112708c;
        int i12 = this.f112709d;
        this.f112709d = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f112708c;
        System.arraycopy(iArr, i11, iArr, i10, this.f112709d - i11);
        this.f112709d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f112709d;
    }

    public U(int[] iArr, int i10) {
        this.f112708c = iArr;
        this.f112709d = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        g((Integer) obj);
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.k
    /* JADX INFO: renamed from: d */
    public V.k<Integer> d2(int i10) {
        if (i10 >= this.f112709d) {
            return new U(Arrays.copyOf(this.f112708c, i10), this.f112709d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f112709d; i10++) {
            if (obj.equals(Integer.valueOf(this.f112708c[i10]))) {
                int[] iArr = this.f112708c;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f112709d - i10) - 1);
                this.f112709d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
