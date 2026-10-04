package k0;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,171:1\n72#2:172\n86#2:174\n63#2,3:176\n72#2:179\n86#2:181\n72#2:182\n86#2:184\n63#2,3:186\n72#2:189\n86#2:191\n63#2,3:193\n72#2:196\n86#2:198\n63#2,3:200\n72#2:203\n86#2:205\n63#2,3:207\n72#2:210\n86#2:212\n63#2,3:214\n22#3:173\n22#3:175\n22#3:180\n22#3:183\n22#3:185\n22#3:190\n22#3:192\n22#3:197\n22#3:199\n22#3:204\n22#3:206\n22#3:211\n22#3:213\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n46#1:172\n52#1:174\n71#1:176,3\n70#1:179\n70#1:181\n104#1:182\n105#1:184\n103#1:186,3\n119#1:189\n120#1:191\n118#1:193,3\n134#1:196\n135#1:198\n133#1:200,3\n149#1:203\n150#1:205\n148#1:207,3\n164#1:210\n165#1:212\n163#1:214,3\n46#1:173\n52#1:175\n70#1:180\n104#1:183\n105#1:185\n119#1:190\n120#1:192\n134#1:197\n135#1:199\n149#1:204\n150#1:206\n164#1:211\n165#1:213\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f214279b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f214280c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214281a;

    public static final class a {
        public a() {
        }

        public final long a() {
            return E.f214280c;
        }

        public a(C4969v c4969v) {
        }

        @T1
        public static /* synthetic */ void b() {
        }
    }

    public /* synthetic */ E(long j10) {
        this.f214281a = j10;
    }

    public static final /* synthetic */ E b(long j10) {
        return new E(j10);
    }

    @T1
    public static final float c(long j10) {
        return l(j10);
    }

    @T1
    public static final float d(long j10) {
        return n(j10);
    }

    public static final long f(long j10, float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j);
    }

    public static /* synthetic */ long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (ZipKt.f225990j & j10));
        }
        return f(j10, f10, f11);
    }

    @T1
    public static final long h(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) / f10;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ZipKt.f225990j);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof E) && j10 == ((E) obj).f214281a;
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    public static final float l(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float n(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static int o(long j10) {
        return C1550p.a(j10);
    }

    @T1
    public static final long p(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) - Float.intBitsToFloat((int) (j11 & ZipKt.f225990j));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ZipKt.f225990j);
    }

    @T1
    public static final long q(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & ZipKt.f225990j)) + Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)))) & ZipKt.f225990j) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @T1
    public static final long r(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) % f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) % f10;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ZipKt.f225990j);
    }

    @T1
    public static final long s(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) * f10;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ZipKt.f225990j);
    }

    @NotNull
    public static String t(long j10) {
        return "(" + l(j10) + U6.j.f68738d + n(j10) + ") px/sec";
    }

    @T1
    public static final long u(long j10) {
        return j10 ^ (-9223372034707292160L);
    }

    public boolean equals(Object obj) {
        return i(this.f214281a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f214281a);
    }

    @NotNull
    public String toString() {
        return t(this.f214281a);
    }

    public final /* synthetic */ long v() {
        return this.f214281a;
    }

    @T1
    public static /* synthetic */ void k() {
    }

    @T1
    public static /* synthetic */ void m() {
    }

    public static long e(long j10) {
        return j10;
    }
}
