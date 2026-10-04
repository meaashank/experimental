package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.V;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2519d0 extends AbstractC2514b<Long> implements V.i, RandomAccess, InterfaceC2562z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2519d0 f112835e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f112836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112837d;

    static {
        C2519d0 c2519d0 = new C2519d0(new long[0], 0);
        f112835e = c2519d0;
        c2519d0.f112824a = false;
    }

    public C2519d0() {
        this(new long[10], 0);
    }

    public static C2519d0 i() {
        return f112835e;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f112837d) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        StringBuilder sbA = android.support.v4.media.a.a("Index:", i10, ", Size:");
        sbA.append(this.f112837d);
        return sbA.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.V.i
    public void G1(long j10) {
        b();
        int i10 = this.f112837d;
        long[] jArr = this.f112836c;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[C2538n.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f112836c = jArr2;
        }
        long[] jArr3 = this.f112836c;
        int i11 = this.f112837d;
        this.f112837d = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        b();
        V.d(collection);
        if (!(collection instanceof C2519d0)) {
            return super.addAll(collection);
        }
        C2519d0 c2519d0 = (C2519d0) collection;
        int i10 = c2519d0.f112837d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f112837d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f112836c;
        if (i12 > jArr.length) {
            this.f112836c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c2519d0.f112836c, 0, this.f112836c, this.f112837d, c2519d0.f112837d);
        this.f112837d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        h(i10, l10.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2519d0)) {
            return super.equals(obj);
        }
        C2519d0 c2519d0 = (C2519d0) obj;
        if (this.f112837d != c2519d0.f112837d) {
            return false;
        }
        long[] jArr = c2519d0.f112836c;
        for (int i10 = 0; i10 < this.f112837d; i10++) {
            if (this.f112836c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public boolean g(Long l10) {
        G1(l10.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.i
    public long getLong(int i10) {
        j(i10);
        return this.f112836c[i10];
    }

    public final void h(int i10, long j10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f112837d)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        long[] jArr = this.f112836c;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[C2538n.a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f112836c, i10, jArr2, i10 + 1, this.f112837d - i10);
            this.f112836c = jArr2;
        }
        this.f112836c[i10] = j10;
        this.f112837d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iS = 1;
        for (int i10 = 0; i10 < this.f112837d; i10++) {
            iS = (iS * 31) + V.s(this.f112836c[i10]);
        }
        return iS;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        b();
        j(i10);
        long[] jArr = this.f112836c;
        long j10 = jArr[i10];
        if (i10 < this.f112837d - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f112837d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(u(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f112836c;
        System.arraycopy(jArr, i11, jArr, i10, this.f112837d - i11);
        this.f112837d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f112837d;
    }

    @Override // androidx.datastore.preferences.protobuf.V.i
    public long u(int i10, long j10) {
        b();
        j(i10);
        long[] jArr = this.f112836c;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    public C2519d0(long[] jArr, int i10) {
        this.f112836c = jArr;
        this.f112837d = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        g((Long) obj);
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.k
    /* JADX INFO: renamed from: d */
    public V.k<Long> d2(int i10) {
        if (i10 >= this.f112837d) {
            return new C2519d0(Arrays.copyOf(this.f112836c, i10), this.f112837d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f112837d; i10++) {
            if (obj.equals(Long.valueOf(this.f112836c[i10]))) {
                long[] jArr = this.f112836c;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f112837d - i10) - 1);
                this.f112837d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
