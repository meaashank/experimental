package B8;

import U6.j;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes6.dex */
public class f<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f17428d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17429e = "asdf-".concat(f.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17430f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17431g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object[] f17432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f17433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Object[] f17434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f17435k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f17436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f17437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17438c;

    public f() {
        this.f17436a = c.f17407a;
        this.f17437b = c.f17409c;
        this.f17438c = 0;
    }

    public static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (a.class) {
                try {
                    if (f17435k < 10) {
                        objArr[0] = f17434j;
                        objArr[1] = iArr;
                        for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f17434j = objArr;
                        f17435k++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (a.class) {
                try {
                    if (f17433i < 10) {
                        objArr[0] = f17432h;
                        objArr[1] = iArr;
                        for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f17432h = objArr;
                        f17433i++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 8) {
            synchronized (a.class) {
                try {
                    Object[] objArr = f17434j;
                    if (objArr != null) {
                        this.f17437b = objArr;
                        f17434j = (Object[]) objArr[0];
                        this.f17436a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f17435k--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i10 == 4) {
            synchronized (a.class) {
                try {
                    Object[] objArr2 = f17432h;
                    if (objArr2 != null) {
                        this.f17437b = objArr2;
                        f17432h = (Object[]) objArr2[0];
                        this.f17436a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f17433i--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f17436a = new int[i10];
        this.f17437b = new Object[i10 << 1];
    }

    public void b(int i10) {
        int[] iArr = this.f17436a;
        if (iArr.length < i10) {
            Object[] objArr = this.f17437b;
            a(i10);
            int i11 = this.f17438c;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f17436a, 0, i11);
                System.arraycopy(objArr, 0, this.f17437b, 0, this.f17438c << 1);
            }
            d(iArr, objArr, this.f17438c);
        }
    }

    public void clear() {
        int i10 = this.f17438c;
        if (i10 != 0) {
            d(this.f17436a, this.f17437b, i10);
            this.f17436a = c.f17407a;
            this.f17437b = c.f17409c;
            this.f17438c = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public int e(Object obj, int i10) {
        int i11 = this.f17438c;
        if (i11 == 0) {
            return -1;
        }
        int iA = c.a(this.f17436a, i11, i10);
        if (iA < 0 || obj.equals(this.f17437b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f17436a[i12] == i10) {
            if (obj.equals(this.f17437b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f17436a[i13] == i10; i13--) {
            if (obj.equals(this.f17437b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() == map.size()) {
                for (0; i10 < this.f17438c; i10 + 1) {
                    try {
                        K kJ = j(i10);
                        V vP = p(i10);
                        Object obj2 = map.get(kJ);
                        if (vP == null) {
                            i10 = (obj2 == null && map.containsKey(kJ)) ? i10 + 1 : 0;
                        } else if (vP.equals(obj2)) {
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? h() : e(obj, obj.hashCode());
    }

    public V get(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return (V) this.f17437b[(iF << 1) + 1];
        }
        return null;
    }

    public int h() {
        int i10 = this.f17438c;
        if (i10 == 0) {
            return -1;
        }
        int iA = c.a(this.f17436a, i10, 0);
        if (iA < 0 || this.f17437b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f17436a[i11] == 0) {
            if (this.f17437b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f17436a[i12] == 0; i12--) {
            if (this.f17437b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public int hashCode() {
        int[] iArr = this.f17436a;
        Object[] objArr = this.f17437b;
        int i10 = this.f17438c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public int i(Object obj) {
        int i10 = this.f17438c * 2;
        Object[] objArr = this.f17437b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f17438c <= 0;
    }

    public K j(int i10) {
        return (K) this.f17437b[i10 << 1];
    }

    public void l(f<? extends K, ? extends V> fVar) {
        int i10 = fVar.f17438c;
        b(this.f17438c + i10);
        if (this.f17438c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(fVar.j(i11), fVar.p(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(fVar.f17436a, 0, this.f17436a, 0, i10);
            System.arraycopy(fVar.f17437b, 0, this.f17437b, 0, i10 << 1);
            this.f17438c = i10;
        }
    }

    public V m(int i10) {
        Object[] objArr = this.f17437b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f17438c;
        if (i12 <= 1) {
            d(this.f17436a, objArr, i12);
            this.f17436a = c.f17407a;
            this.f17437b = c.f17409c;
            this.f17438c = 0;
            return v10;
        }
        int[] iArr = this.f17436a;
        if (iArr.length > 8 && i12 < iArr.length / 3) {
            a(i12 > 8 ? i12 + (i12 >> 1) : 8);
            this.f17438c--;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f17436a, 0, i10);
                System.arraycopy(objArr, 0, this.f17437b, 0, i11);
            }
            int i13 = this.f17438c;
            if (i10 < i13) {
                int i14 = i10 + 1;
                System.arraycopy(iArr, i14, this.f17436a, i10, i13 - i10);
                System.arraycopy(objArr, i14 << 1, this.f17437b, i11, (this.f17438c - i10) << 1);
            }
            return v10;
        }
        int i15 = i12 - 1;
        this.f17438c = i15;
        if (i10 < i15) {
            int i16 = i10 + 1;
            System.arraycopy(iArr, i16, iArr, i10, i15 - i10);
            Object[] objArr2 = this.f17437b;
            System.arraycopy(objArr2, i16 << 1, objArr2, i11, (this.f17438c - i10) << 1);
        }
        Object[] objArr3 = this.f17437b;
        int i17 = this.f17438c;
        objArr3[i17 << 1] = null;
        objArr3[(i17 << 1) + 1] = null;
        return v10;
    }

    public V o(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f17437b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V p(int i10) {
        return (V) this.f17437b[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int iE;
        if (k10 == null) {
            iE = h();
            i10 = 0;
        } else {
            int iHashCode = k10.hashCode();
            i10 = iHashCode;
            iE = e(k10, iHashCode);
        }
        if (iE >= 0) {
            int i11 = (iE << 1) + 1;
            Object[] objArr = this.f17437b;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iE;
        int i13 = this.f17438c;
        int[] iArr = this.f17436a;
        if (i13 >= iArr.length) {
            int i14 = 8;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f17437b;
            a(i14);
            int[] iArr2 = this.f17436a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f17437b, 0, objArr2.length);
            }
            d(iArr, objArr2, this.f17438c);
        }
        int i15 = this.f17438c;
        if (i12 < i15) {
            int[] iArr3 = this.f17436a;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr3 = this.f17437b;
            System.arraycopy(objArr3, i12 << 1, objArr3, i16 << 1, (this.f17438c - i12) << 1);
        }
        this.f17436a[i12] = i10;
        Object[] objArr4 = this.f17437b;
        int i17 = i12 << 1;
        objArr4[i17] = k10;
        objArr4[i17 + 1] = v10;
        this.f17438c++;
        return null;
    }

    public V remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return m(iF);
        }
        return null;
    }

    public int size() {
        return this.f17438c;
    }

    public String toString() {
        if (isEmpty()) {
            return Ib.b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(this.f17438c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f17438c; i10++) {
            if (i10 > 0) {
                sb2.append(j.f68738d);
            }
            K kJ = j(i10);
            if (kJ != this) {
                sb2.append(kJ);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append(SignatureVisitor.INSTANCEOF);
            V vP = p(i10);
            if (vP != this) {
                sb2.append(vP);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public f(int i10) {
        if (i10 == 0) {
            this.f17436a = c.f17407a;
            this.f17437b = c.f17409c;
        } else {
            a(i10);
        }
        this.f17438c = 0;
    }

    public f(f fVar) {
        this();
        if (fVar != null) {
            l(fVar);
        }
    }
}
