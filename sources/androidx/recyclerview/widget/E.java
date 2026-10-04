package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class E<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f116280j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f116281k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f116282l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f116283m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f116284n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f116285o = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f116286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T[] f116287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f116291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f116292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f116293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class<T> f116294i;

    public static class a<T2> extends b<T2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<T2> f116295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2642e f116296b;

        public a(b<T2> bVar) {
            this.f116295a = bVar;
            this.f116296b = new C2642e(bVar);
        }

        @Override // androidx.recyclerview.widget.E.b, androidx.recyclerview.widget.t
        public void a(int i10, int i11, Object obj) {
            this.f116296b.a(i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.t
        public void b(int i10, int i11) {
            this.f116296b.b(i10, i11);
        }

        @Override // androidx.recyclerview.widget.t
        public void c(int i10, int i11) {
            this.f116296b.c(i10, i11);
        }

        @Override // androidx.recyclerview.widget.E.b, java.util.Comparator
        public int compare(T2 t22, T2 t23) {
            return this.f116295a.compare(t22, t23);
        }

        @Override // androidx.recyclerview.widget.t
        public void d(int i10, int i11) {
            this.f116296b.d(i10, i11);
        }

        @Override // androidx.recyclerview.widget.E.b
        public boolean e(T2 t22, T2 t23) {
            return this.f116295a.e(t22, t23);
        }

        @Override // androidx.recyclerview.widget.E.b
        public boolean f(T2 t22, T2 t23) {
            return this.f116295a.f(t22, t23);
        }

        @Override // androidx.recyclerview.widget.E.b
        @Nullable
        public Object g(T2 t22, T2 t23) {
            return this.f116295a.g(t22, t23);
        }

        @Override // androidx.recyclerview.widget.E.b
        public void h(int i10, int i11) {
            this.f116296b.a(i10, i11, null);
        }

        public void i() {
            this.f116296b.e();
        }
    }

    public static abstract class b<T2> implements Comparator<T2>, t {
        public void a(int i10, int i11, Object obj) {
            h(i10, i11);
        }

        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        public abstract boolean e(T2 t22, T2 t23);

        public abstract boolean f(T2 t22, T2 t23);

        @Nullable
        public Object g(T2 t22, T2 t23) {
            return null;
        }

        public abstract void h(int i10, int i11);
    }

    public E(@NonNull Class<T> cls, @NonNull b<T> bVar) {
        this(cls, bVar, 10);
    }

    public final void A(@NonNull T[] tArr) {
        boolean z10 = this.f116291f instanceof a;
        if (!z10) {
            h();
        }
        this.f116288c = 0;
        this.f116289d = this.f116293h;
        this.f116287b = this.f116286a;
        this.f116290e = 0;
        int iD = D(tArr);
        this.f116286a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f116294i, iD));
        while (true) {
            int i10 = this.f116290e;
            if (i10 >= iD && this.f116288c >= this.f116289d) {
                break;
            }
            int i11 = this.f116288c;
            int i12 = this.f116289d;
            if (i11 >= i12) {
                int i13 = iD - i10;
                System.arraycopy(tArr, i10, this.f116286a, i10, i13);
                this.f116290e += i13;
                this.f116293h += i13;
                this.f116291f.b(i10, i13);
                break;
            }
            if (i10 >= iD) {
                int i14 = i12 - i11;
                this.f116293h -= i14;
                this.f116291f.c(i10, i14);
                break;
            }
            T t10 = this.f116287b[i11];
            T t11 = tArr[i10];
            int iCompare = this.f116291f.compare(t10, t11);
            if (iCompare < 0) {
                B();
            } else if (iCompare > 0) {
                z(t11);
            } else if (this.f116291f.f(t10, t11)) {
                T[] tArr2 = this.f116286a;
                int i15 = this.f116290e;
                tArr2[i15] = t11;
                this.f116288c++;
                this.f116290e = i15 + 1;
                if (!this.f116291f.e(t10, t11)) {
                    b bVar = this.f116291f;
                    bVar.a(this.f116290e - 1, 1, bVar.g(t10, t11));
                }
            } else {
                B();
                z(t11);
            }
        }
        this.f116287b = null;
        if (z10) {
            return;
        }
        k();
    }

    public final void B() {
        this.f116293h--;
        this.f116288c++;
        this.f116291f.c(this.f116290e, 1);
    }

    public int C() {
        return this.f116293h;
    }

    public final int D(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f116291f);
        int i10 = 0;
        int i11 = 1;
        for (int i12 = 1; i12 < tArr.length; i12++) {
            T t10 = tArr[i12];
            if (this.f116291f.compare(tArr[i10], t10) == 0) {
                int iM = m(t10, tArr, i10, i11);
                if (iM != -1) {
                    tArr[iM] = t10;
                } else {
                    if (i11 != i12) {
                        tArr[i11] = t10;
                    }
                    i11++;
                }
            } else {
                if (i11 != i12) {
                    tArr[i11] = t10;
                }
                i10 = i11;
                i11++;
            }
        }
        return i11;
    }

    public final void E() {
        if (this.f116287b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public void F(int i10, T t10) {
        E();
        T tN = n(i10);
        boolean z10 = tN == t10 || !this.f116291f.e(tN, t10);
        if (tN != t10 && this.f116291f.compare(tN, t10) == 0) {
            this.f116286a[i10] = t10;
            if (z10) {
                b bVar = this.f116291f;
                bVar.a(i10, 1, bVar.g(tN, t10));
                return;
            }
            return;
        }
        if (z10) {
            b bVar2 = this.f116291f;
            bVar2.a(i10, 1, bVar2.g(tN, t10));
        }
        v(i10, false);
        int iB = b(t10, false);
        if (i10 != iB) {
            this.f116291f.d(i10, iB);
        }
    }

    public int a(T t10) {
        E();
        return b(t10, true);
    }

    public final int b(T t10, boolean z10) {
        int iL = l(t10, this.f116286a, 0, this.f116293h, 1);
        if (iL == -1) {
            iL = 0;
        } else if (iL < this.f116293h) {
            T t11 = this.f116286a[iL];
            if (this.f116291f.f(t11, t10)) {
                if (this.f116291f.e(t11, t10)) {
                    this.f116286a[iL] = t10;
                    return iL;
                }
                this.f116286a[iL] = t10;
                b bVar = this.f116291f;
                bVar.a(iL, 1, bVar.g(t11, t10));
                return iL;
            }
        }
        g(iL, t10);
        if (z10) {
            this.f116291f.b(iL, 1);
        }
        return iL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(@NonNull Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f116294i, collection.size())), true);
    }

    public void d(@NonNull T... tArr) {
        e(tArr, false);
    }

    public void e(@NonNull T[] tArr, boolean z10) {
        E();
        if (tArr.length == 0) {
            return;
        }
        if (z10) {
            f(tArr);
        } else {
            f(j(tArr));
        }
    }

    public final void f(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int iD = D(tArr);
        if (this.f116293h != 0) {
            q(tArr, iD);
            return;
        }
        this.f116286a = tArr;
        this.f116293h = iD;
        this.f116291f.b(0, iD);
    }

    public final void g(int i10, T t10) {
        int i11 = this.f116293h;
        if (i10 > i11) {
            StringBuilder sbA = android.support.v4.media.a.a("cannot add item to ", i10, " because size is ");
            sbA.append(this.f116293h);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        T[] tArr = this.f116286a;
        if (i11 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f116294i, tArr.length + 10));
            System.arraycopy(this.f116286a, 0, tArr2, 0, i10);
            tArr2[i10] = t10;
            System.arraycopy(this.f116286a, i10, tArr2, i10 + 1, this.f116293h - i10);
            this.f116286a = tArr2;
        } else {
            System.arraycopy(tArr, i10, tArr, i10 + 1, i11 - i10);
            this.f116286a[i10] = t10;
        }
        this.f116293h++;
    }

    public void h() {
        E();
        b bVar = this.f116291f;
        if (bVar instanceof a) {
            return;
        }
        if (this.f116292g == null) {
            this.f116292g = new a(bVar);
        }
        this.f116291f = this.f116292g;
    }

    public void i() {
        E();
        int i10 = this.f116293h;
        if (i10 == 0) {
            return;
        }
        Arrays.fill(this.f116286a, 0, i10, (Object) null);
        this.f116293h = 0;
        this.f116291f.c(0, i10);
    }

    public final T[] j(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f116294i, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    public void k() {
        E();
        b bVar = this.f116291f;
        if (bVar instanceof a) {
            ((a) bVar).i();
        }
        b bVar2 = this.f116291f;
        a aVar = this.f116292g;
        if (bVar2 == aVar) {
            this.f116291f = aVar.f116295a;
        }
    }

    public final int l(T t10, T[] tArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int i13 = (i10 + i11) / 2;
            T t11 = tArr[i13];
            int iCompare = this.f116291f.compare(t11, t10);
            if (iCompare < 0) {
                i10 = i13 + 1;
            } else {
                if (iCompare == 0) {
                    if (!this.f116291f.f(t11, t10)) {
                        int iP = p(t10, i13, i10, i11);
                        if (i12 != 1 || iP != -1) {
                            return iP;
                        }
                    }
                    return i13;
                }
                i11 = i13;
            }
        }
        if (i12 == 1) {
            return i10;
        }
        return -1;
    }

    public final int m(T t10, T[] tArr, int i10, int i11) {
        while (i10 < i11) {
            if (this.f116291f.f(tArr[i10], t10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public T n(int i10) throws IndexOutOfBoundsException {
        int i11;
        if (i10 < this.f116293h && i10 >= 0) {
            T[] tArr = this.f116287b;
            return (tArr == null || i10 < (i11 = this.f116290e)) ? this.f116286a[i10] : tArr[(i10 - i11) + this.f116288c];
        }
        StringBuilder sbA = android.support.v4.media.a.a("Asked to get item at ", i10, " but size is ");
        sbA.append(this.f116293h);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public int o(T t10) {
        if (this.f116287b == null) {
            return l(t10, this.f116286a, 0, this.f116293h, 4);
        }
        int iL = l(t10, this.f116286a, 0, this.f116290e, 4);
        if (iL != -1) {
            return iL;
        }
        int iL2 = l(t10, this.f116287b, this.f116288c, this.f116289d, 4);
        if (iL2 != -1) {
            return (iL2 - this.f116288c) + this.f116290e;
        }
        return -1;
    }

    public final int p(T t10, int i10, int i11, int i12) {
        T t11;
        for (int i13 = i10 - 1; i13 >= i11; i13--) {
            T t12 = this.f116286a[i13];
            if (this.f116291f.compare(t12, t10) != 0) {
                break;
            }
            if (this.f116291f.f(t12, t10)) {
                return i13;
            }
        }
        do {
            i10++;
            if (i10 >= i12) {
                return -1;
            }
            t11 = this.f116286a[i10];
            if (this.f116291f.compare(t11, t10) != 0) {
                return -1;
            }
        } while (!this.f116291f.f(t11, t10));
        return i10;
    }

    public final void q(T[] tArr, int i10) {
        boolean z10 = this.f116291f instanceof a;
        if (!z10) {
            h();
        }
        this.f116287b = this.f116286a;
        int i11 = 0;
        this.f116288c = 0;
        int i12 = this.f116293h;
        this.f116289d = i12;
        this.f116286a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f116294i, i12 + i10 + 10));
        this.f116290e = 0;
        while (true) {
            int i13 = this.f116288c;
            int i14 = this.f116289d;
            if (i13 >= i14 && i11 >= i10) {
                break;
            }
            if (i13 == i14) {
                int i15 = i10 - i11;
                System.arraycopy(tArr, i11, this.f116286a, this.f116290e, i15);
                int i16 = this.f116290e + i15;
                this.f116290e = i16;
                this.f116293h += i15;
                this.f116291f.b(i16 - i15, i15);
                break;
            }
            if (i11 == i10) {
                int i17 = i14 - i13;
                System.arraycopy(this.f116287b, i13, this.f116286a, this.f116290e, i17);
                this.f116290e += i17;
                break;
            }
            T t10 = this.f116287b[i13];
            T t11 = tArr[i11];
            int iCompare = this.f116291f.compare(t10, t11);
            if (iCompare > 0) {
                T[] tArr2 = this.f116286a;
                int i18 = this.f116290e;
                this.f116290e = i18 + 1;
                tArr2[i18] = t11;
                this.f116293h++;
                i11++;
                this.f116291f.b(i18, 1);
            } else if (iCompare == 0 && this.f116291f.f(t10, t11)) {
                T[] tArr3 = this.f116286a;
                int i19 = this.f116290e;
                this.f116290e = i19 + 1;
                tArr3[i19] = t11;
                i11++;
                this.f116288c++;
                if (!this.f116291f.e(t10, t11)) {
                    b bVar = this.f116291f;
                    bVar.a(this.f116290e - 1, 1, bVar.g(t10, t11));
                }
            } else {
                T[] tArr4 = this.f116286a;
                int i20 = this.f116290e;
                this.f116290e = i20 + 1;
                tArr4[i20] = t10;
                this.f116288c++;
            }
        }
        this.f116287b = null;
        if (z10) {
            return;
        }
        k();
    }

    public void r(int i10) {
        E();
        T tN = n(i10);
        v(i10, false);
        int iB = b(tN, false);
        if (i10 != iB) {
            this.f116291f.d(i10, iB);
        }
    }

    public boolean s(T t10) {
        E();
        return t(t10, true);
    }

    public final boolean t(T t10, boolean z10) {
        int iL = l(t10, this.f116286a, 0, this.f116293h, 2);
        if (iL == -1) {
            return false;
        }
        v(iL, z10);
        return true;
    }

    public T u(int i10) {
        E();
        T tN = n(i10);
        v(i10, true);
        return tN;
    }

    public final void v(int i10, boolean z10) {
        T[] tArr = this.f116286a;
        System.arraycopy(tArr, i10 + 1, tArr, i10, (this.f116293h - i10) - 1);
        int i11 = this.f116293h - 1;
        this.f116293h = i11;
        this.f116286a[i11] = null;
        if (z10) {
            this.f116291f.c(i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(@NonNull Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f116294i, collection.size())), true);
    }

    public void x(@NonNull T... tArr) {
        y(tArr, false);
    }

    public void y(@NonNull T[] tArr, boolean z10) {
        E();
        if (z10) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }

    public final void z(T t10) {
        T[] tArr = this.f116286a;
        int i10 = this.f116290e;
        tArr[i10] = t10;
        this.f116290e = i10 + 1;
        this.f116293h++;
        this.f116291f.b(i10, 1);
    }

    public E(@NonNull Class<T> cls, @NonNull b<T> bVar, int i10) {
        this.f116294i = cls;
        this.f116286a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
        this.f116291f = bVar;
        this.f116293h = 0;
    }
}
