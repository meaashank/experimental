package k0;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,577:1\n72#2:578\n86#2:581\n63#2,3:584\n63#2,3:589\n63#2,3:594\n63#2,3:599\n63#2,3:604\n63#2,3:609\n63#2,3:614\n22#3:579\n22#3:582\n169#4:580\n169#4:583\n483#4:617\n57#5:587\n57#5:588\n51#5:592\n51#5:593\n87#5:597\n87#5:598\n84#5:602\n84#5:603\n72#5:607\n72#5:608\n69#5:612\n69#5:613\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n377#1:578\n383#1:581\n390#1:584,3\n399#1:589,3\n411#1:594,3\n425#1:599,3\n433#1:604,3\n441#1:609,3\n449#1:614,3\n377#1:579\n383#1:582\n377#1:580\n383#1:583\n457#1:617\n400#1:587\n401#1:588\n412#1:592\n413#1:593\n426#1:597\n427#1:598\n434#1:602\n435#1:603\n442#1:607\n443#1:608\n450#1:612\n451#1:613\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f214323b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f214324c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f214325d = 9205357640488583168L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214326a;

    public static final class a {
        public a() {
        }

        public final long a() {
            return m.f214325d;
        }

        public final long b() {
            return m.f214324c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ m(long j10) {
        this.f214326a = j10;
    }

    public static final /* synthetic */ m c(long j10) {
        return new m(j10);
    }

    @T1
    public static final float d(long j10) {
        return p(j10);
    }

    @T1
    public static final float e(long j10) {
        return m(j10);
    }

    public static final long g(long j10, float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j);
    }

    public static /* synthetic */ long h(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = p(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m(j10);
        }
        return g(j10, f10, f11);
    }

    @T1
    public static final long i(long j10, float f10) {
        float fP = p(j10) / f10;
        float fM = m(j10) / f10;
        return (((long) Float.floatToRawIntBits(fP)) << 32) | (((long) Float.floatToRawIntBits(fM)) & ZipKt.f225990j);
    }

    @T1
    public static final long j(long j10, int i10) {
        float f10 = i10;
        return (((long) Float.floatToRawIntBits(p(j10) / f10)) << 32) | (((long) Float.floatToRawIntBits(m(j10) / f10)) & ZipKt.f225990j);
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof m) && j10 == ((m) obj).f214326a;
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    public static final float m(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static final float p(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int r(long j10) {
        return C1550p.a(j10);
    }

    @T1
    public static final long s(long j10, long j11) {
        float fP = p(j10) - p(j11);
        float fM = m(j10) - m(j11);
        return (((long) Float.floatToRawIntBits(fP)) << 32) | (ZipKt.f225990j & ((long) Float.floatToRawIntBits(fM)));
    }

    @T1
    public static final long t(long j10, long j11) {
        float fP = p(j11) + p(j10);
        return (((long) Float.floatToRawIntBits(m(j11) + m(j10))) & ZipKt.f225990j) | (Float.floatToRawIntBits(fP) << 32);
    }

    @T1
    public static final long u(long j10, float f10) {
        float fP = p(j10) * f10;
        float fM = m(j10) * f10;
        return (((long) Float.floatToRawIntBits(fP)) << 32) | (((long) Float.floatToRawIntBits(fM)) & ZipKt.f225990j);
    }

    @T1
    public static final long v(long j10, int i10) {
        float f10 = i10;
        return (((long) Float.floatToRawIntBits(p(j10) * f10)) << 32) | (((long) Float.floatToRawIntBits(m(j10) * f10)) & ZipKt.f225990j);
    }

    @T1
    @NotNull
    public static String w(long j10) {
        if (j10 == P.d.f65493d) {
            return "DpSize.Unspecified";
        }
        return ((Object) i.u(p(j10))) + " x " + ((Object) i.u(m(j10)));
    }

    public boolean equals(Object obj) {
        return k(this.f214326a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f214326a);
    }

    @T1
    @NotNull
    public String toString() {
        return w(this.f214326a);
    }

    public final /* synthetic */ long x() {
        return this.f214326a;
    }

    @T1
    public static /* synthetic */ void n() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void o() {
    }

    @T1
    public static /* synthetic */ void q() {
    }

    public static long f(long j10) {
        return j10;
    }
}
