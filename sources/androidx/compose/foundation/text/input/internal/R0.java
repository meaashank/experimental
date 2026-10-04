package androidx.compose.foundation.text.input.internal;

import java.util.Arrays;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f93791b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f93792c = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final int[] f93793a;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ R0(int[] iArr) {
        this.f93793a = iArr;
    }

    public static final /* synthetic */ R0 a(int[] iArr) {
        return new R0(iArr);
    }

    @NotNull
    public static int[] b(int i10) {
        return new int[i10 * 3];
    }

    public static int[] c(int[] iArr) {
        return iArr;
    }

    @NotNull
    public static final int[] d(int[] iArr, int i10) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10 * 3);
        kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }

    public static boolean e(int[] iArr, Object obj) {
        return (obj instanceof R0) && kotlin.jvm.internal.G.g(iArr, ((R0) obj).f93793a);
    }

    public static final boolean f(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.G.g(iArr, iArr2);
    }

    public static final void g(int[] iArr, int i10, boolean z10, @NotNull ed.q<? super Integer, ? super Integer, ? super Integer, kotlin.L0> qVar) {
        if (i10 < 0) {
            return;
        }
        if (!z10) {
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 3;
                qVar.invoke(Integer.valueOf(iArr[i12]), Integer.valueOf(iArr[i12 + 1]), Integer.valueOf(iArr[i12 + 2]));
            }
            return;
        }
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            int i13 = i10 * 3;
            qVar.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr[i13 + 1]), Integer.valueOf(iArr[i13 + 2]));
        }
    }

    public static /* synthetic */ void h(int[] iArr, int i10, boolean z10, ed.q qVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (i10 < 0) {
            return;
        }
        if (!z10) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 * 3;
                qVar.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr[i13 + 1]), Integer.valueOf(iArr[i13 + 2]));
            }
            return;
        }
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            int i14 = i10 * 3;
            qVar.invoke(Integer.valueOf(iArr[i14]), Integer.valueOf(iArr[i14 + 1]), Integer.valueOf(iArr[i14 + 2]));
        }
    }

    public static final int i(int[] iArr) {
        return iArr.length / 3;
    }

    public static int j(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void k(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = i10 * 3;
        iArr[i14] = i11;
        iArr[i14 + 1] = i12;
        iArr[i14 + 2] = i13;
    }

    public static String l(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f93793a, obj);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f93793a);
    }

    public final /* synthetic */ int[] m() {
        return this.f93793a;
    }

    public String toString() {
        return l(this.f93793a);
    }
}
