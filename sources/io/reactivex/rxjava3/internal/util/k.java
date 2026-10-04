package io.reactivex.rxjava3.internal.util;

/* JADX INFO: loaded from: classes7.dex */
public final class k<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f211949f = -1640531527;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f211950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f211951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f211952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f211953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T[] f211954e;

    public k() {
        this(16, 0.75f);
    }

    public static int c(int x10) {
        int i10 = x10 * (-1640531527);
        return i10 ^ (i10 >>> 16);
    }

    public boolean a(T value) {
        T t10;
        T[] tArr = this.f211954e;
        int i10 = this.f211951b;
        int iC = c(value.hashCode()) & i10;
        T t11 = tArr[iC];
        if (t11 != null) {
            if (t11.equals(value)) {
                return false;
            }
            do {
                iC = (iC + 1) & i10;
                t10 = tArr[iC];
                if (t10 == null) {
                }
            } while (!t10.equals(value));
            return false;
        }
        tArr[iC] = value;
        int i11 = this.f211952c + 1;
        this.f211952c = i11;
        if (i11 >= this.f211953d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f211954e;
    }

    public void d() {
        T t10;
        T[] tArr = this.f211954e;
        int length = tArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        T[] tArr2 = (T[]) new Object[i10];
        int i12 = this.f211952c;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.f211951b = i11;
                this.f211953d = (int) (i10 * this.f211950a);
                this.f211954e = tArr2;
                return;
            }
            do {
                length--;
                t10 = tArr[length];
            } while (t10 == null);
            int iC = c(t10.hashCode()) & i11;
            if (tArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i11;
                } while (tArr2[iC] != null);
            }
            tArr2[iC] = tArr[length];
            i12 = i13;
        }
    }

    public boolean e(T value) {
        T t10;
        T[] tArr = this.f211954e;
        int i10 = this.f211951b;
        int iC = c(value.hashCode()) & i10;
        T t11 = tArr[iC];
        if (t11 == null) {
            return false;
        }
        if (t11.equals(value)) {
            f(iC, tArr, i10);
            return true;
        }
        do {
            iC = (iC + 1) & i10;
            t10 = tArr[iC];
            if (t10 == null) {
                return false;
            }
        } while (!t10.equals(value));
        f(iC, tArr, i10);
        return true;
    }

    public boolean f(int pos, T[] a10, int m10) {
        int i10;
        T t10;
        this.f211952c--;
        while (true) {
            int i11 = pos + 1;
            while (true) {
                i10 = i11 & m10;
                t10 = a10[i10];
                if (t10 == null) {
                    a10[pos] = null;
                    return true;
                }
                int iC = c(t10.hashCode()) & m10;
                if (pos <= i10) {
                    if (pos >= iC || iC > i10) {
                        break;
                    }
                    i11 = i10 + 1;
                } else if (pos < iC || iC <= i10) {
                    i11 = i10 + 1;
                }
            }
            a10[pos] = t10;
            pos = i10;
        }
    }

    public int g() {
        return this.f211952c;
    }

    public k(int capacity) {
        this(capacity, 0.75f);
    }

    public k(int i10, float f10) {
        this.f211950a = f10;
        int iB = l.b(i10);
        this.f211951b = iB - 1;
        this.f211953d = (int) (f10 * iB);
        this.f211954e = (T[]) new Object[iB];
    }
}
