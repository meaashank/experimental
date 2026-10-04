package com.bytedance.adsdk.NOt;

import Ib.b;
import U6.j;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ZRu<E> implements Collection<E>, Set<E> {
    private static int FA;
    private static int Ht;
    private static Object[] Mm;
    private static Object[] TFq;
    private static final int[] mZ = new int[0];
    private static final Object[] uR = new Object[0];
    int NOt;
    private int[] Vor;
    Object[] ZRu;
    private oK<E, E> aT;

    public ZRu() {
        this(0);
    }

    private int ZRu(Object obj, int i10) {
        int i11 = this.NOt;
        if (i11 == 0) {
            return -1;
        }
        int iZRu = NOt.ZRu(this.Vor, i11, i10);
        if (iZRu < 0 || obj.equals(this.ZRu[iZRu])) {
            return iZRu;
        }
        int i12 = iZRu + 1;
        while (i12 < i11 && this.Vor[i12] == i10) {
            if (obj.equals(this.ZRu[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iZRu - 1; i13 >= 0 && this.Vor[i13] == i10; i13--) {
            if (obj.equals(this.ZRu[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    private void uR(int i10) {
        if (i10 == 8) {
            synchronized (ZRu.class) {
                Object[] objArr = Mm;
                if (objArr != null) {
                    this.ZRu = objArr;
                    Mm = (Object[]) objArr[0];
                    this.Vor = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    FA--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (ZRu.class) {
                Object[] objArr2 = TFq;
                if (objArr2 != null) {
                    this.ZRu = objArr2;
                    TFq = (Object[]) objArr2[0];
                    this.Vor = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    Ht--;
                    return;
                }
            }
        }
        this.Vor = new int[i10];
        this.ZRu = new Object[i10];
    }

    public E NOt(int i10) {
        return (E) this.ZRu[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iZRu;
        if (e10 == null) {
            iZRu = ZRu();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iZRu = ZRu(e10, iHashCode);
        }
        if (iZRu >= 0) {
            return false;
        }
        int i11 = ~iZRu;
        int i12 = this.NOt;
        int[] iArr = this.Vor;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.ZRu;
            uR(i13);
            int[] iArr2 = this.Vor;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.ZRu, 0, objArr.length);
            }
            ZRu(iArr, objArr, this.NOt);
        }
        int i14 = this.NOt;
        if (i11 < i14) {
            int[] iArr3 = this.Vor;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.ZRu;
            System.arraycopy(objArr2, i11, objArr2, i15, this.NOt - i11);
        }
        this.Vor[i11] = i10;
        this.ZRu[i11] = e10;
        this.NOt++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        ZRu(collection.size() + this.NOt);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.NOt;
        if (i10 != 0) {
            ZRu(this.Vor, this.ZRu, i10);
            this.Vor = mZ;
            this.ZRu = uR;
            this.NOt = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return ZRu(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.NOt; i10++) {
                try {
                    if (!set.contains(NOt(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.Vor;
        int i10 = this.NOt;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.NOt <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return NOt().uR().iterator();
    }

    public E mZ(int i10) {
        Object[] objArr = this.ZRu;
        E e10 = (E) objArr[i10];
        int i11 = this.NOt;
        if (i11 <= 1) {
            ZRu(this.Vor, objArr, i11);
            this.Vor = mZ;
            this.ZRu = uR;
            this.NOt = 0;
            return e10;
        }
        int[] iArr = this.Vor;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.NOt = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.ZRu;
                System.arraycopy(objArr2, i13, objArr2, i10, this.NOt - i10);
            }
            this.ZRu[this.NOt] = null;
            return e10;
        }
        uR(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.NOt--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.Vor, 0, i10);
            System.arraycopy(objArr, 0, this.ZRu, 0, i10);
        }
        int i14 = this.NOt;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.Vor, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.ZRu, i10, this.NOt - i10);
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iZRu = ZRu(obj);
        if (iZRu < 0) {
            return false;
        }
        mZ(iZRu);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.NOt - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.ZRu[i10])) {
                mZ(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.NOt;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.NOt;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.ZRu, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(this.NOt * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.NOt; i10++) {
            if (i10 > 0) {
                sb2.append(j.f68738d);
            }
            E eNOt = NOt(i10);
            if (eNOt != this) {
                sb2.append(eNOt);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public ZRu(int i10) {
        if (i10 == 0) {
            this.Vor = mZ;
            this.ZRu = uR;
        } else {
            uR(i10);
        }
        this.NOt = 0;
    }

    private oK<E, E> NOt() {
        if (this.aT == null) {
            this.aT = new oK<E, E>() { // from class: com.bytedance.adsdk.NOt.ZRu.1
                @Override // com.bytedance.adsdk.NOt.oK
                public Map<E, E> NOt() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.NOt.oK
                public int ZRu() {
                    return ZRu.this.NOt;
                }

                @Override // com.bytedance.adsdk.NOt.oK
                public void mZ() {
                    ZRu.this.clear();
                }

                @Override // com.bytedance.adsdk.NOt.oK
                public Object ZRu(int i10, int i11) {
                    return ZRu.this.ZRu[i10];
                }

                @Override // com.bytedance.adsdk.NOt.oK
                public int ZRu(Object obj) {
                    return ZRu.this.ZRu(obj);
                }

                @Override // com.bytedance.adsdk.NOt.oK
                public void ZRu(int i10) {
                    ZRu.this.mZ(i10);
                }
            };
        }
        return this.aT;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.NOt) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.NOt));
        }
        System.arraycopy(this.ZRu, 0, tArr, 0, this.NOt);
        int length = tArr.length;
        int i10 = this.NOt;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    private int ZRu() {
        int i10 = this.NOt;
        if (i10 == 0) {
            return -1;
        }
        int iZRu = NOt.ZRu(this.Vor, i10, 0);
        if (iZRu < 0 || this.ZRu[iZRu] == null) {
            return iZRu;
        }
        int i11 = iZRu + 1;
        while (i11 < i10 && this.Vor[i11] == 0) {
            if (this.ZRu[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iZRu - 1; i12 >= 0 && this.Vor[i12] == 0; i12--) {
            if (this.ZRu[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    private static void ZRu(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (ZRu.class) {
                try {
                    if (FA < 10) {
                        objArr[0] = Mm;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        Mm = objArr;
                        FA++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ZRu.class) {
                try {
                    if (Ht < 10) {
                        objArr[0] = TFq;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        TFq = objArr;
                        Ht++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void ZRu(int i10) {
        int[] iArr = this.Vor;
        if (iArr.length < i10) {
            Object[] objArr = this.ZRu;
            uR(i10);
            int i11 = this.NOt;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.Vor, 0, i11);
                System.arraycopy(objArr, 0, this.ZRu, 0, this.NOt);
            }
            ZRu(iArr, objArr, this.NOt);
        }
    }

    public int ZRu(Object obj) {
        return obj == null ? ZRu() : ZRu(obj, obj.hashCode());
    }
}
