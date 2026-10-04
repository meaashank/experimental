package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.V;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends AbstractC2514b<Float> implements V.f, RandomAccess, InterfaceC2562z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O f112669e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f112670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112671d;

    static {
        O o10 = new O(new float[0], 0);
        f112669e = o10;
        o10.f112824a = false;
    }

    public O() {
        this(new float[10], 0);
    }

    public static O i() {
        return f112669e;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f112671d) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        StringBuilder sbA = android.support.v4.media.a.a("Index:", i10, ", Size:");
        sbA.append(this.f112671d);
        return sbA.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        b();
        V.d(collection);
        if (!(collection instanceof O)) {
            return super.addAll(collection);
        }
        O o10 = (O) collection;
        int i10 = o10.f112671d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f112671d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f112670c;
        if (i12 > fArr.length) {
            this.f112670c = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(o10.f112670c, 0, this.f112670c, this.f112671d, o10.f112671d);
        this.f112671d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        h(i10, f10.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return super.equals(obj);
        }
        O o10 = (O) obj;
        if (this.f112671d != o10.f112671d) {
            return false;
        }
        float[] fArr = o10.f112670c;
        for (int i10 = 0; i10 < this.f112671d; i10++) {
            if (Float.floatToIntBits(this.f112670c[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public boolean g(Float f10) {
        m2(f10.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.f
    public float getFloat(int i10) {
        j(i10);
        return this.f112670c[i10];
    }

    public final void h(int i10, float f10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f112671d)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        float[] fArr = this.f112670c;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[C2538n.a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f112670c, i10, fArr2, i10 + 1, this.f112671d - i10);
            this.f112670c = fArr2;
        }
        this.f112670c[i10] = f10;
        this.f112671d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f112671d; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f112670c[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.V.f
    public float m(int i10, float f10) {
        b();
        j(i10);
        float[] fArr = this.f112670c;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // androidx.datastore.preferences.protobuf.V.f
    public void m2(float f10) {
        b();
        int i10 = this.f112671d;
        float[] fArr = this.f112670c;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[C2538n.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f112670c = fArr2;
        }
        float[] fArr3 = this.f112670c;
        int i11 = this.f112671d;
        this.f112671d = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        b();
        j(i10);
        float[] fArr = this.f112670c;
        float f10 = fArr[i10];
        if (i10 < this.f112671d - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f112671d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(m(i10, f10.floatValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f112670c;
        System.arraycopy(fArr, i11, fArr, i10, this.f112671d - i11);
        this.f112671d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f112671d;
    }

    public O(float[] fArr, int i10) {
        this.f112670c = fArr;
        this.f112671d = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        g((Float) obj);
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public V.k<Float> d2(int i10) {
        if (i10 >= this.f112671d) {
            return new O(Arrays.copyOf(this.f112670c, i10), this.f112671d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2514b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f112671d; i10++) {
            if (obj.equals(Float.valueOf(this.f112670c[i10]))) {
                float[] fArr = this.f112670c;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f112671d - i10) - 1);
                this.f112671d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
