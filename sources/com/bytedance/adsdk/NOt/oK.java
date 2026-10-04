package com.bytedance.adsdk.NOt;

import androidx.collection.C1522b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class oK<K, V> {
    oK<K, V>.NOt NOt;

    public final class NOt implements Set<K> {
        public NOt() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            oK.this.mZ();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return oK.this.ZRu(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return oK.ZRu(oK.this.NOt(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return oK.ZRu(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iZRu = oK.this.ZRu() - 1; iZRu >= 0; iZRu--) {
                Object objZRu = oK.this.ZRu(iZRu, 0);
                iHashCode += objZRu == null ? 0 : objZRu.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return oK.this.ZRu() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new ZRu(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iZRu = oK.this.ZRu(obj);
            if (iZRu < 0) {
                return false;
            }
            oK.this.ZRu(iZRu);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return oK.NOt(oK.this.NOt(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return oK.mZ(oK.this.NOt(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return oK.this.ZRu();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return oK.this.NOt(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) oK.this.ZRu(tArr, 0);
        }
    }

    public final class ZRu<T> implements Iterator<T> {
        int NOt;
        final int ZRu;
        int mZ;
        boolean uR = false;

        public ZRu(int i10) {
            this.ZRu = i10;
            this.NOt = oK.this.ZRu();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mZ < this.NOt;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) oK.this.ZRu(this.mZ, this.ZRu);
            this.mZ++;
            this.uR = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.uR) {
                throw new IllegalStateException();
            }
            int i10 = this.mZ - 1;
            this.mZ = i10;
            this.NOt--;
            this.uR = false;
            oK.this.ZRu(i10);
        }
    }

    public static <K, V> boolean NOt(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean ZRu(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean mZ(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract Map<K, V> NOt();

    public abstract int ZRu();

    public abstract int ZRu(Object obj);

    public abstract Object ZRu(int i10, int i11);

    public abstract void ZRu(int i10);

    public abstract void mZ();

    public Set<K> uR() {
        if (this.NOt == null) {
            this.NOt = new NOt();
        }
        return this.NOt;
    }

    public <T> T[] ZRu(T[] tArr, int i10) {
        int iZRu = ZRu();
        if (tArr.length < iZRu) {
            tArr = (T[]) ((Object[]) C1522b.a(tArr, iZRu));
        }
        for (int i11 = 0; i11 < iZRu; i11++) {
            tArr[i11] = ZRu(i11, i10);
        }
        if (tArr.length > iZRu) {
            tArr[iZRu] = null;
        }
        return tArr;
    }

    public Object[] NOt(int i10) {
        int iZRu = ZRu();
        Object[] objArr = new Object[iZRu];
        for (int i11 = 0; i11 < iZRu; i11++) {
            objArr[i11] = ZRu(i11, i10);
        }
        return objArr;
    }

    public static <T> boolean ZRu(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
