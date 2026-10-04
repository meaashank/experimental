package B8;

import B8.e;
import U6.j;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f17394e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f17395f = "ArraySet";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17396g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f17397h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object[] f17398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f17399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Object[] f17400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f17401l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f17402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f17403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e<E, E> f17405d;

    public class a extends e<E, E> {
        public a() {
        }

        @Override // B8.e
        public void a() {
            b.this.clear();
        }

        @Override // B8.e
        public Object b(int i10, int i11) {
            return b.this.f17403b[i10];
        }

        @Override // B8.e
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // B8.e
        public int d() {
            return b.this.f17404c;
        }

        @Override // B8.e
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // B8.e
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // B8.e
        public void g(E e10, E e11) {
            b.this.add(e10);
        }

        @Override // B8.e
        public void h(int i10) {
            b.this.o(i10);
        }

        @Override // B8.e
        public E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this.f17402a = c.f17407a;
        this.f17403b = c.f17409c;
        this.f17404c = 0;
    }

    public static void h(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f17401l < 10) {
                        objArr[0] = f17400k;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f17400k = objArr;
                        f17401l++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f17399j < 10) {
                        objArr[0] = f17398i;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f17398i = objArr;
                        f17399j++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iJ;
        if (e10 == null) {
            iJ = k();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iJ = j(e10, iHashCode);
        }
        if (iJ >= 0) {
            return false;
        }
        int i11 = ~iJ;
        int i12 = this.f17404c;
        int[] iArr = this.f17402a;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f17403b;
            c(i13);
            int[] iArr2 = this.f17402a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f17403b, 0, objArr.length);
            }
            h(iArr, objArr, this.f17404c);
        }
        int i14 = this.f17404c;
        if (i11 < i14) {
            int[] iArr3 = this.f17402a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f17403b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f17404c - i11);
        }
        this.f17402a[i11] = i10;
        this.f17403b[i11] = e10;
        this.f17404c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        g(collection.size() + this.f17404c);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(b<? extends E> bVar) {
        int i10 = bVar.f17404c;
        g(this.f17404c + i10);
        if (this.f17404c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                add(bVar.f17403b[i11]);
            }
        } else if (i10 > 0) {
            System.arraycopy(bVar.f17402a, 0, this.f17402a, 0, i10);
            System.arraycopy(bVar.f17403b, 0, this.f17403b, 0, i10);
            this.f17404c = i10;
        }
    }

    public final void c(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f17400k;
                    if (objArr != null) {
                        this.f17403b = objArr;
                        f17400k = (Object[]) objArr[0];
                        this.f17402a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f17401l--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f17398i;
                    if (objArr2 != null) {
                        this.f17403b = objArr2;
                        f17398i = (Object[]) objArr2[0];
                        this.f17402a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f17399j--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f17402a = new int[i10];
        this.f17403b = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f17404c;
        if (i10 != 0) {
            h(this.f17402a, this.f17403b, i10);
            this.f17402a = c.f17407a;
            this.f17403b = c.f17409c;
            this.f17404c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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
            if (this.f17404c != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f17404c; i10++) {
                try {
                    if (!set.contains(this.f17403b[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public void g(int i10) {
        int[] iArr = this.f17402a;
        if (iArr.length < i10) {
            Object[] objArr = this.f17403b;
            c(i10);
            int i11 = this.f17404c;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f17402a, 0, i11);
                System.arraycopy(objArr, 0, this.f17403b, 0, this.f17404c);
            }
            h(iArr, objArr, this.f17404c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f17402a;
        int i10 = this.f17404c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final e<E, E> i() {
        if (this.f17405d == null) {
            this.f17405d = new a();
        }
        return this.f17405d;
    }

    public int indexOf(Object obj) {
        return obj == null ? k() : j(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f17404c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return ((e.c) i().m()).iterator();
    }

    public final int j(Object obj, int i10) {
        int i11 = this.f17404c;
        if (i11 == 0) {
            return -1;
        }
        int iA = c.a(this.f17402a, i11, i10);
        if (iA < 0 || obj.equals(this.f17403b[iA])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f17402a[i12] == i10) {
            if (obj.equals(this.f17403b[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f17402a[i13] == i10; i13--) {
            if (obj.equals(this.f17403b[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int k() {
        int i10 = this.f17404c;
        if (i10 == 0) {
            return -1;
        }
        int iA = c.a(this.f17402a, i10, 0);
        if (iA < 0 || this.f17403b[iA] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f17402a[i11] == 0) {
            if (this.f17403b[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f17402a[i12] == 0; i12--) {
            if (this.f17403b[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public boolean n(b<? extends E> bVar) {
        int i10 = bVar.f17404c;
        int i11 = this.f17404c;
        for (int i12 = 0; i12 < i10; i12++) {
            remove(bVar.f17403b[i12]);
        }
        return i11 != this.f17404c;
    }

    public E o(int i10) {
        Object[] objArr = this.f17403b;
        E e10 = (E) objArr[i10];
        int i11 = this.f17404c;
        if (i11 <= 1) {
            h(this.f17402a, objArr, i11);
            this.f17402a = c.f17407a;
            this.f17403b = c.f17409c;
            this.f17404c = 0;
            return e10;
        }
        int[] iArr = this.f17402a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.f17404c = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.f17403b;
                System.arraycopy(objArr2, i13, objArr2, i10, this.f17404c - i10);
            }
            this.f17403b[this.f17404c] = null;
            return e10;
        }
        c(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.f17404c--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f17402a, 0, i10);
            System.arraycopy(objArr, 0, this.f17403b, 0, i10);
        }
        int i14 = this.f17404c;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.f17402a, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.f17403b, i10, this.f17404c - i10);
        }
        return e10;
    }

    public E q(int i10) {
        return (E) this.f17403b[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        o(iIndexOf);
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
        for (int i10 = this.f17404c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f17403b[i10])) {
                o(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f17404c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f17404c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f17403b, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return Ib.b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(this.f17404c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f17404c; i10++) {
            if (i10 > 0) {
                sb2.append(j.f68738d);
            }
            Object obj = this.f17403b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f17404c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f17404c));
        }
        System.arraycopy(this.f17403b, 0, tArr, 0, this.f17404c);
        int length = tArr.length;
        int i10 = this.f17404c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f17402a = c.f17407a;
            this.f17403b = c.f17409c;
        } else {
            c(i10);
        }
        this.f17404c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(b<E> bVar) {
        this();
        if (bVar != 0) {
            b(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }
}
