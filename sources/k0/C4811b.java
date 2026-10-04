package k0;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.T1;
import androidx.compose.ui.graphics.J2;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,707:1\n69#1:708\n69#1:711\n69#1:714\n69#1:718\n69#1:722\n69#1:725\n69#1:729\n69#1:732\n69#1:736\n686#2:709\n700#2:710\n686#2:712\n700#2:713\n686#2:715\n706#2:716\n694#2:717\n686#2:719\n706#2:720\n694#2:721\n686#2:723\n700#2:724\n686#2:726\n706#2:727\n694#2:728\n686#2:730\n700#2:731\n686#2:733\n706#2:734\n694#2:735\n686#2:737\n700#2:738\n694#2:739\n706#2:740\n37#3,7:741\n37#3,7:748\n37#3,7:755\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n76#1:708\n86#1:711\n96#1:714\n108#1:718\n121#1:722\n131#1:725\n142#1:729\n155#1:732\n171#1:736\n76#1:709\n76#1:710\n86#1:712\n86#1:713\n96#1:715\n97#1:716\n98#1:717\n108#1:719\n109#1:720\n110#1:721\n121#1:723\n121#1:724\n131#1:726\n132#1:727\n133#1:728\n142#1:730\n142#1:731\n155#1:733\n156#1:734\n157#1:735\n171#1:737\n175#1:738\n179#1:739\n180#1:740\n196#1:741,7\n200#1:748,7\n204#1:755,7\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class C4811b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f214282b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f214283c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214284a;

    /* JADX INFO: renamed from: k0.b$a */
    @V({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,707:1\n37#2,7:708\n37#2,7:715\n37#2,7:722\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n*L\n235#1:708,7\n248#1:715,7\n266#1:722,7\n*E\n"})
    public static final class a {
        public a() {
        }

        public static /* synthetic */ long g(a aVar, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
            if ((i14 & 16) != 0) {
                z10 = true;
            }
            return aVar.f(i10, i11, i12, i13, z10);
        }

        @T1
        public final long a(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i12, C4812c.f214301q);
            int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, C4812c.f214301q);
            int iP = C4812c.p(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return C4812c.a(Math.min(iP, i10), i11 != Integer.MAX_VALUE ? Math.min(iP, i11) : Integer.MAX_VALUE, iMin, iMin2);
        }

        @T1
        public final long b(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i10, C4812c.f214301q);
            int iMin2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, C4812c.f214301q);
            int iP = C4812c.p(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return C4812c.a(iMin, iMin2, Math.min(iP, i12), i13 != Integer.MAX_VALUE ? Math.min(iP, i13) : Integer.MAX_VALUE);
        }

        @T1
        public final long c(int i10, int i11) {
            if (i10 >= 0 && i11 >= 0) {
                return C4812c.j(i10, i10, i11, i11);
            }
            s.c("width(" + i10 + ") and height(" + i11 + ") must be >= 0");
            throw null;
        }

        @T1
        public final long d(int i10) {
            if (i10 >= 0) {
                return C4812c.j(0, Integer.MAX_VALUE, i10, i10);
            }
            s.c("height(" + i10 + ") must be >= 0");
            throw null;
        }

        @T1
        public final long e(int i10) {
            if (i10 >= 0) {
                return C4812c.j(i10, i10, 0, Integer.MAX_VALUE);
            }
            s.c("width(" + i10 + ") must be >= 0");
            throw null;
        }

        @T1
        @InterfaceC4982o(message = "Replace with fitPrioritizingWidth", replaceWith = @InterfaceC4852c0(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        @androidx.compose.ui.i
        public final long f(int i10, int i11, int i12, int i13, boolean z10) {
            return z10 ? b(i10, i11, i12, i13) : a(i10, i11, i12, i13);
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C4811b(long j10) {
        this.f214284a = j10;
    }

    public static final /* synthetic */ C4811b a(long j10) {
        return new C4811b(j10);
    }

    public static final long c(long j10, int i10, int i11, int i12, int i13) {
        if (!(i12 >= 0 && i10 >= 0)) {
            s.c("minHeight(" + i12 + ") and minWidth(" + i10 + ") must be >= 0");
            throw null;
        }
        if (!(i11 >= i10)) {
            s.c("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')');
            throw null;
        }
        if (i13 >= i12) {
            return C4812c.j(i10, i11, i12, i13);
        }
        s.c("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')');
        throw null;
    }

    public static /* synthetic */ long d(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = q(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = o(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = p(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = n(j10);
        }
        return c(j10, i15, i16, i17, i13);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof C4811b) && j10 == ((C4811b) obj).f214284a;
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final int g(long j10) {
        return (int) (j10 & 3);
    }

    public static final boolean h(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean i(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> 33)) & ((1 << J2.a((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1)) != 0;
    }

    public static final boolean k(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    public static final boolean m(long j10) {
        int i10 = (int) (3 & j10);
        int iA = (1 << J2.a((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1;
        int i11 = ((int) (j10 >> 2)) & iA;
        int i12 = ((int) (j10 >> 33)) & iA;
        return i11 == (i12 == 0 ? Integer.MAX_VALUE : i12 - 1);
    }

    public static final int n(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int o(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (int) (j10 >> 33);
        int iA = i11 & ((1 << J2.a((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1);
        if (iA == 0) {
            return Integer.MAX_VALUE;
        }
        return iA - 1;
    }

    public static final int p(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int q(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << J2.a((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1);
    }

    public static int s(long j10) {
        return C1550p.a(j10);
    }

    public static final boolean u(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j10 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0 || (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0;
    }

    @NotNull
    public static String v(long j10) {
        int iO = o(j10);
        String strValueOf = kotlin.time.j.f218437k;
        String strValueOf2 = iO == Integer.MAX_VALUE ? kotlin.time.j.f218437k : String.valueOf(iO);
        int iN = n(j10);
        if (iN != Integer.MAX_VALUE) {
            strValueOf = String.valueOf(iN);
        }
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(q(j10));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf2);
        sb2.append(", minHeight = ");
        sb2.append(p(j10));
        sb2.append(", maxHeight = ");
        return R0.a(sb2, strValueOf, ')');
    }

    public boolean equals(Object obj) {
        return e(this.f214284a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f214284a);
    }

    @NotNull
    public String toString() {
        return v(this.f214284a);
    }

    public final /* synthetic */ long w() {
        return this.f214284a;
    }

    @T1
    public static /* synthetic */ void j() {
    }

    @T1
    public static /* synthetic */ void l() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void r() {
    }

    @T1
    public static /* synthetic */ void t() {
    }

    public static long b(long j10) {
        return j10;
    }
}
