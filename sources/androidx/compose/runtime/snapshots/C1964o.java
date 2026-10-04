package androidx.compose.runtime.snapshots;

import kotlin.collections.C4875q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1964o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100189f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f100191b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public int[] f100192c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public int[] f100193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f100194e;

    public C1964o() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f100193d = iArr;
    }

    public static /* synthetic */ int g(C1964o c1964o, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return c1964o.f(i10);
    }

    public final int a(int i10) {
        c(this.f100190a + 1);
        int i11 = this.f100190a;
        this.f100190a = i11 + 1;
        int iB = b();
        this.f100191b[i11] = i10;
        this.f100192c[i11] = iB;
        this.f100193d[iB] = i11;
        j(i11);
        return iB;
    }

    public final int b() {
        int length = this.f100193d.length;
        if (this.f100194e >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            C4875q.I0(this.f100193d, iArr, 0, 0, 0, 14, null);
            this.f100193d = iArr;
        }
        int i13 = this.f100194e;
        this.f100194e = this.f100193d[i13];
        return i13;
    }

    public final void c(int i10) {
        int[] iArr = this.f100191b;
        int length = iArr.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        C4875q.I0(iArr, iArr2, 0, 0, 0, 14, null);
        C4875q.I0(this.f100192c, iArr3, 0, 0, 0, 14, null);
        this.f100191b = iArr2;
        this.f100192c = iArr3;
    }

    public final void d(int i10) {
        this.f100193d[i10] = this.f100194e;
        this.f100194e = i10;
    }

    public final int e() {
        return this.f100190a;
    }

    public final int f(int i10) {
        return this.f100190a > 0 ? this.f100191b[0] : i10;
    }

    public final void h(int i10) {
        int i11 = this.f100193d[i10];
        k(i11, this.f100190a - 1);
        this.f100190a--;
        j(i11);
        i(i11);
        d(i10);
    }

    public final void i(int i10) {
        int i11;
        int[] iArr = this.f100191b;
        int i12 = this.f100190a >> 1;
        while (i10 < i12) {
            int i13 = (i10 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 >= this.f100190a || (i11 = iArr[i13]) >= iArr[i14]) {
                if (iArr[i14] >= iArr[i10]) {
                    return;
                }
                k(i14, i10);
                i10 = i14;
            } else {
                if (i11 >= iArr[i10]) {
                    return;
                }
                k(i13, i10);
                i10 = i13;
            }
        }
    }

    public final void j(int i10) {
        int[] iArr = this.f100191b;
        int i11 = iArr[i10];
        while (i10 > 0) {
            int i12 = ((i10 + 1) >> 1) - 1;
            if (iArr[i12] <= i11) {
                return;
            }
            k(i12, i10);
            i10 = i12;
        }
    }

    public final void k(int i10, int i11) {
        int[] iArr = this.f100191b;
        int[] iArr2 = this.f100192c;
        int[] iArr3 = this.f100193d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }

    @TestOnly
    public final void l() {
        int i10 = this.f100190a;
        int i11 = 1;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int[] iArr = this.f100191b;
            if (iArr[(i12 >> 1) - 1] > iArr[i11]) {
                throw new IllegalStateException(("Index " + i11 + " is out of place").toString());
            }
            i11 = i12;
        }
    }

    @TestOnly
    public final void m(int i10, int i11) {
        int i12 = this.f100193d[i10];
        if (this.f100192c[i12] != i10) {
            throw new IllegalStateException(("Index for handle " + i10 + " is corrupted").toString());
        }
        if (this.f100191b[i12] == i11) {
            return;
        }
        StringBuilder sbA = android.support.v4.media.a.a("Value for handle ", i10, " was ");
        sbA.append(this.f100191b[i12]);
        sbA.append(" but was supposed to be ");
        sbA.append(i11);
        throw new IllegalStateException(sbA.toString().toString());
    }
}
