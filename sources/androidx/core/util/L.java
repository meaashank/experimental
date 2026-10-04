package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int f111390a = 19;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111391b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111392c = 3600;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f111393d = 86400;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f111394e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static char[] f111395f = new char[24];

    public static int a(int i10, int i11, boolean z10, int i12) {
        if (i10 > 99 || (z10 && i12 >= 3)) {
            return i11 + 3;
        }
        if (i10 > 9 || (z10 && i12 >= 2)) {
            return i11 + 2;
        }
        if (z10 || i10 > 0) {
            return i11 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void b(long j10, long j11, PrintWriter printWriter) {
        if (j10 == 0) {
            printWriter.print("--");
        } else {
            d(j10 - j11, printWriter, 0);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void c(long j10, PrintWriter printWriter) {
        d(j10, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void d(long j10, PrintWriter printWriter, int i10) {
        synchronized (f111394e) {
            printWriter.print(new String(f111395f, 0, f(j10, i10)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void e(long j10, StringBuilder sb2) {
        synchronized (f111394e) {
            sb2.append(f111395f, 0, f(j10, 0));
        }
    }

    public static int f(long j10, int i10) {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j11 = j10;
        if (f111395f.length < i10) {
            f111395f = new char[i10];
        }
        char[] cArr = f111395f;
        if (j11 == 0) {
            int i15 = i10 - 1;
            while (i15 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j11 > 0) {
            c10 = SignatureVisitor.EXTENDS;
        } else {
            j11 = -j11;
            c10 = SignatureVisitor.SUPER;
        }
        int i16 = (int) (j11 % 1000);
        int iFloor = (int) Math.floor(j11 / 1000);
        if (iFloor > 86400) {
            i11 = iFloor / 86400;
            iFloor -= 86400 * i11;
        } else {
            i11 = 0;
        }
        if (iFloor > 3600) {
            i12 = iFloor / 3600;
            iFloor -= i12 * 3600;
        } else {
            i12 = 0;
        }
        if (iFloor > 60) {
            int i17 = iFloor / 60;
            iFloor -= i17 * 60;
            i13 = i17;
        } else {
            i13 = 0;
        }
        if (i10 != 0) {
            int iA = a(i11, 1, false, 0);
            int iA2 = a(i12, 1, iA > 0, 2) + iA;
            int iA3 = a(i13, 1, iA2 > 0, 2) + iA2;
            int iA4 = a(iFloor, 1, iA3 > 0, 2) + iA3;
            i14 = 0;
            for (int iA5 = a(i16, 2, true, iA4 > 0 ? 3 : 0) + 1 + iA4; iA5 < i10; iA5++) {
                cArr[i14] = ' ';
                i14++;
            }
        } else {
            i14 = 0;
        }
        cArr[i14] = c10;
        int i18 = i14 + 1;
        boolean z10 = i10 != 0;
        int iG = g(cArr, i11, 'd', i18, false, 0);
        int iG2 = g(cArr, i12, androidx.compose.ui.graphics.vector.f.f101675g, iG, iG != i18, z10 ? 2 : 0);
        int iG3 = g(cArr, i13, androidx.compose.ui.graphics.vector.f.f101671c, iG2, iG2 != i18, z10 ? 2 : 0);
        int iG4 = g(cArr, iFloor, androidx.compose.ui.graphics.vector.f.f101681m, iG3, iG3 != i18, z10 ? 2 : 0);
        int iG5 = g(cArr, i16, androidx.compose.ui.graphics.vector.f.f101671c, iG4, true, (!z10 || iG4 == i18) ? 0 : 3);
        cArr[iG5] = androidx.compose.ui.graphics.vector.f.f101681m;
        return iG5 + 1;
    }

    public static int g(char[] cArr, int i10, char c10, int i11, boolean z10, int i12) {
        int i13;
        if (!z10 && i10 <= 0) {
            return i11;
        }
        if ((!z10 || i12 < 3) && i10 <= 99) {
            i13 = i11;
        } else {
            int i14 = i10 / 100;
            cArr[i11] = (char) (i14 + 48);
            i13 = i11 + 1;
            i10 -= i14 * 100;
        }
        if ((z10 && i12 >= 2) || i10 > 9 || i11 != i13) {
            int i15 = i10 / 10;
            cArr[i13] = (char) (i15 + 48);
            i13++;
            i10 -= i15 * 10;
        }
        cArr[i13] = (char) (i10 + 48);
        cArr[i13 + 1] = c10;
        return i13 + 2;
    }
}
