package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.j2;
import kotlin.collections.C4875q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class A<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100033d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f100035b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public j2<T>[] f100036c = new j2[16];

    public final boolean a(@NotNull T t10) {
        int iB;
        int i10 = this.f100034a;
        int iIdentityHashCode = System.identityHashCode(t10);
        if (i10 > 0) {
            iB = b(t10, iIdentityHashCode);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i11 = -(iB + 1);
        j2<T>[] j2VarArr = this.f100036c;
        int length = j2VarArr.length;
        if (i10 == length) {
            int i12 = length * 2;
            j2<T>[] j2VarArr2 = new j2[i12];
            int[] iArr = new int[i12];
            int i13 = i11 + 1;
            C4875q.B0(j2VarArr, j2VarArr2, i13, i11, i10);
            C4875q.K0(this.f100036c, j2VarArr2, 0, 0, i11, 6, null);
            C4875q.z0(this.f100035b, iArr, i13, i11, i10);
            C4875q.I0(this.f100035b, iArr, 0, 0, i11, 6, null);
            this.f100036c = j2VarArr2;
            this.f100035b = iArr;
        } else {
            int i14 = i11 + 1;
            C4875q.B0(j2VarArr, j2VarArr, i14, i11, i10);
            int[] iArr2 = this.f100035b;
            C4875q.z0(iArr2, iArr2, i14, i11, i10);
        }
        this.f100036c[i11] = new j2<>(t10);
        this.f100035b[i11] = iIdentityHashCode;
        this.f100034a++;
        return true;
    }

    public final int b(T t10, int i10) {
        int i11 = this.f100034a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f100035b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    j2<T> j2Var = this.f100036c[i13];
                    return t10 == (j2Var != null ? j2Var.get() : null) ? i13 : c(i13, t10, i10);
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.f100034a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.f100035b[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.f100036c[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.f100034a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.f100035b
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            androidx.compose.runtime.j2<T>[] r2 = r3.f100036c
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.f100034a
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.f100035b
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            androidx.compose.runtime.j2<T>[] r2 = r3.f100036c
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.f100034a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.A.c(int, java.lang.Object, int):int");
    }

    @NotNull
    public final int[] d() {
        return this.f100035b;
    }

    public final int e() {
        return this.f100034a;
    }

    @NotNull
    public final j2<T>[] f() {
        return this.f100036c;
    }

    @TestOnly
    public final boolean g() {
        j2<T> j2Var;
        int i10 = this.f100034a;
        j2<T>[] j2VarArr = this.f100036c;
        int[] iArr = this.f100035b;
        int length = j2VarArr.length;
        if (i10 > length) {
            return false;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = iArr[i12];
            if (i13 < i11 || (j2Var = j2VarArr[i12]) == null) {
                return false;
            }
            T t10 = j2Var.get();
            if (t10 != null && i13 != System.identityHashCode(t10)) {
                return false;
            }
            i12++;
            i11 = i13;
        }
        while (i10 < length) {
            if (iArr[i10] != 0 || j2VarArr[i10] != null) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final void h(@NotNull ed.l<? super T, Boolean> lVar) {
        int i10 = this.f100034a;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            j2<T> j2Var = this.f100036c[i11];
            T t10 = j2Var != null ? j2Var.get() : null;
            if (t10 != null && !lVar.invoke(t10).booleanValue()) {
                if (i12 != i11) {
                    this.f100036c[i12] = j2Var;
                    int[] iArr = this.f100035b;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            this.f100036c[i13] = null;
            this.f100035b[i13] = 0;
        }
        if (i12 != i10) {
            this.f100034a = i12;
        }
    }

    public final void i(@NotNull int[] iArr) {
        this.f100035b = iArr;
    }

    public final void j(int i10) {
        this.f100034a = i10;
    }

    public final void k(@NotNull j2<T>[] j2VarArr) {
        this.f100036c = j2VarArr;
    }
}
