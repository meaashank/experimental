package k0;

import androidx.collection.M0;
import androidx.collection.N0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;

/* JADX INFO: renamed from: k0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,707:1\n686#1,9:708\n37#2,7:717\n37#2,7:724\n37#2,7:731\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n506#1:708,9\n549#1:717,7\n552#1:724,7\n555#1:731,7\n*E\n"})
public final class C4812c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f214285a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f214286b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f214287c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f214288d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f214289e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f214290f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f214291g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f214292h = 32766;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f214293i = 65535;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f214294j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f214295k = 65534;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f214296l = 32767;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f214297m = 18;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f214298n = 8190;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f214299o = 262143;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f214300p = 13;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f214301q = 262142;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f214302r = 8191;

    @T1
    public static final long a(int i10, int i11, int i12, int i13) {
        boolean z10 = false;
        if (!(i11 >= i10)) {
            s.c("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')');
            throw null;
        }
        if (!(i13 >= i12)) {
            s.c("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')');
            throw null;
        }
        if (i10 >= 0 && i12 >= 0) {
            z10 = true;
        }
        if (z10) {
            return j(i10, i11, i12, i13);
        }
        s.c("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0");
        throw null;
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    public static final int d(int i10, int i11) {
        if (i10 == Integer.MAX_VALUE) {
            return i10;
        }
        int i12 = i10 + i11;
        if (i12 < 0) {
            return 0;
        }
        return i12;
    }

    public static final int e(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    @T1
    public static final long f(long j10, long j11) {
        return y.a(md.u.K((int) (j11 >> 32), C4811b.q(j10), C4811b.o(j10)), md.u.K((int) (j11 & ZipKt.f225990j), C4811b.p(j10), C4811b.n(j10)));
    }

    public static final long g(long j10, long j11) {
        return a(md.u.K(C4811b.q(j11), C4811b.q(j10), C4811b.o(j10)), md.u.K(C4811b.o(j11), C4811b.q(j10), C4811b.o(j10)), md.u.K(C4811b.p(j11), C4811b.p(j10), C4811b.n(j10)), md.u.K(C4811b.n(j11), C4811b.p(j10), C4811b.n(j10)));
    }

    @T1
    public static final int h(long j10, int i10) {
        return md.u.K(i10, C4811b.p(j10), C4811b.n(j10));
    }

    @T1
    public static final int i(long j10, int i10) {
        return md.u.K(i10, C4811b.q(j10), C4811b.o(j10));
    }

    public static final long j(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iE = e(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iE2 = e(i15);
        if (iE + iE2 > 31) {
            m(i15, i14);
            throw null;
        }
        int i16 = i11 + 1;
        int i17 = i16 & (~(i16 >> 31));
        int i18 = i13 + 1;
        int i19 = i18 & (~(i18 >> 31));
        int i20 = 0;
        if (iE2 != 13) {
            if (iE2 == 18) {
                i20 = 3;
            } else if (iE2 == 15) {
                i20 = 1;
            } else if (iE2 == 16) {
                i20 = 2;
            }
        }
        int i21 = (((i20 & 2) >> 1) * 3) + ((i20 & 1) << 1);
        return (((long) i17) << 33) | ((long) i20) | (((long) i10) << 2) | (((long) i12) << (i21 + 15)) | (((long) i19) << (i21 + 46));
    }

    public static final int k(int i10) {
        return (1 << (18 - i10)) - 1;
    }

    public static final int l(int i10) {
        return (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
    }

    public static final void m(int i10, int i11) {
        throw new IllegalArgumentException(M0.a("Can't represent a width of ", i10, " and height of ", i11, " in Constraints"));
    }

    public static final Void n(int i10) {
        throw new IllegalArgumentException(N0.a("Can't represent a size of ", i10, " in Constraints"));
    }

    @T1
    public static final boolean o(long j10, long j11) {
        int iQ = C4811b.q(j10);
        int iO = C4811b.o(j10);
        int i10 = (int) (j11 >> 32);
        if (iQ > i10 || i10 > iO) {
            return false;
        }
        int iP = C4811b.p(j10);
        int iN = C4811b.n(j10);
        int i11 = (int) (j11 & ZipKt.f225990j);
        return iP <= i11 && i11 <= iN;
    }

    public static final int p(int i10) {
        if (i10 < 8191) {
            return f214301q;
        }
        if (i10 < 32767) {
            return f214295k;
        }
        if (i10 < 65535) {
            return f214292h;
        }
        if (i10 < 262143) {
            return f214298n;
        }
        n(i10);
        throw null;
    }

    public static final int q(int i10) {
        return i10 + 15;
    }

    @T1
    public static final long r(long j10, int i10, int i11) {
        int iQ = C4811b.q(j10) + i10;
        if (iQ < 0) {
            iQ = 0;
        }
        int iD = d(C4811b.o(j10), i10);
        int iP = C4811b.p(j10) + i11;
        return a(iQ, iD, iP >= 0 ? iP : 0, d(C4811b.n(j10), i11));
    }

    public static /* synthetic */ long s(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return r(j10, i10, i11);
    }

    public static final int t(int i10) {
        return (1 << (i10 + 13)) - 1;
    }
}
