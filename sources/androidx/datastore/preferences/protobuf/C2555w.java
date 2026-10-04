package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.V;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2555w extends AbstractC2514b<Double> implements V.b, RandomAccess, InterfaceC2562z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2555w f113009e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f113010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113011d;

    static {
        C2555w c2555w = new C2555w(new double[0], 0);
        f113009e = c2555w;
        c2555w.f112824a = false;
    }

    public C2555w() {
        this(new double[10], 0);
    }

    public static C2555w i() {
        return f113009e;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f113011d) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        StringBuilder sbA = android.support.v4.media.a.a("Index:", i10, ", Size:");
        sbA.append(this.f113011d);
        return sbA.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.V.b
    public void N1(double d10) {
        b();
        int i10 = this.f113011d;
        double[] dArr = this.f113010c;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[C2538n.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f113010c = dArr2;
        }
        double[] dArr3 = this.f113010c;
        int i11 = this.f113011d;
        this.f113011d = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        b();
        V.d(collection);
        if (!(collection instanceof C2555w)) {
            return super.addAll(collection);
        }
        C2555w c2555w = (C2555w) collection;
        int i10 = c2555w.f113011d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f113011d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f113010c;
        if (i12 > dArr.length) {
            this.f113010c = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2555w.f113010c, 0, this.f113010c, this.f113011d, c2555w.f113011d);
        this.f113011d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        h(i10, d10.doubleValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2555w)) {
            return super.equals(obj);
        }
        C2555w c2555w = (C2555w) obj;
        if (this.f113011d != c2555w.f113011d) {
            return false;
        }
        double[] dArr = c2555w.f113010c;
        for (int i10 = 0; i10 < this.f113011d; i10++) {
            if (Double.doubleToLongBits(this.f113010c[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public boolean g(Double d10) {
        N1(d10.doubleValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.b
    public double getDouble(int i10) {
        j(i10);
        return this.f113010c[i10];
    }

    public final void h(int i10, double d10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f113011d)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        double[] dArr = this.f113010c;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[C2538n.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f113010c, i10, dArr2, i10 + 1, this.f113011d - i10);
            this.f113010c = dArr2;
        }
        this.f113010c[i10] = d10;
        this.f113011d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iS = 1;
        for (int i10 = 0; i10 < this.f113011d; i10++) {
            iS = (iS * 31) + V.s(Double.doubleToLongBits(this.f113010c[i10]));
        }
        return iS;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        b();
        j(i10);
        double[] dArr = this.f113010c;
        double d10 = dArr[i10];
        if (i10 < this.f113011d - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f113011d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.V.b
    public double p(int i10, double d10) {
        b();
        j(i10);
        double[] dArr = this.f113010c;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(p(i10, d10.doubleValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f113010c;
        System.arraycopy(dArr, i11, dArr, i10, this.f113011d - i11);
        this.f113011d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f113011d;
    }

    public C2555w(double[] dArr, int i10) {
        this.f113010c = dArr;
        this.f113011d = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        g((Double) obj);
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.k
    /* JADX INFO: renamed from: d */
    public V.k<Double> d2(int i10) {
        if (i10 >= this.f113011d) {
            return new C2555w(Arrays.copyOf(this.f113010c, i10), this.f113011d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f113011d; i10++) {
            if (obj.equals(Double.valueOf(this.f113010c[i10]))) {
                double[] dArr = this.f113010c;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f113011d - i10) - 1);
                this.f113011d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
