package androidx.compose.ui.input.pointer;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2153u {
    public static final int a() {
        return 0;
    }

    public static final boolean b(int i10) {
        return i10 != 0;
    }

    public static final int c(int i10) {
        if (i10 == 0) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = (i10 & (-97)) | ((i10 & 96) >>> 5); (i12 & 1) == 0; i12 >>>= 1) {
            i11++;
        }
        return i11;
    }

    public static final int d(int i10) {
        int i11 = -1;
        for (int i12 = (i10 & (-97)) | ((i10 & 96) >>> 5); i12 != 0; i12 >>>= 1) {
            i11++;
        }
        return i11;
    }

    public static final boolean e(int i10) {
        return false;
    }

    public static final boolean f(int i10) {
        return (i10 & 2) != 0;
    }

    public static final boolean g(int i10) {
        return (i10 & 8) != 0;
    }

    public static final boolean h(int i10) {
        return (i10 & 1048576) != 0;
    }

    public static final boolean i(int i10) {
        return (i10 & 4096) != 0;
    }

    public static final boolean j(int i10) {
        return (i10 & 16) != 0;
    }

    public static final boolean k(int i10) {
        return (i10 & 8) != 0;
    }

    public static final boolean l(int i10) {
        return (i10 & 65536) != 0;
    }

    public static final boolean m(int i10) {
        return (i10 & 2097152) != 0;
    }

    public static final boolean n(int i10, int i11) {
        return i11 != 0 ? i11 != 1 ? (i11 == 2 || i11 == 3 || i11 == 4) ? (i10 & (1 << i11)) != 0 : (i10 & (1 << (i11 + 2))) != 0 : q(i10) : o(i10);
    }

    public static final boolean o(int i10) {
        return (i10 & 33) != 0;
    }

    public static final boolean p(int i10) {
        return (i10 & 4194304) != 0;
    }

    public static final boolean q(int i10) {
        return (i10 & 66) != 0;
    }

    public static final boolean r(int i10) {
        return (i10 & 1) != 0;
    }

    public static final boolean s(int i10) {
        return (i10 & 4) != 0;
    }

    public static final boolean t(int i10) {
        return (i10 & 4) != 0;
    }
}
