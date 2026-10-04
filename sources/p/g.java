package P;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,311:1\n72#2:312\n86#2:314\n63#2,3:316\n72#2:319\n86#2:321\n72#2:322\n86#2:324\n72#2:326\n86#2:328\n72#2:330\n86#2:332\n63#2,3:334\n72#2:337\n86#2:339\n63#2,3:341\n72#2:344\n86#2:346\n63#2,3:348\n72#2:351\n86#2:353\n63#2,3:355\n72#2:358\n86#2:360\n63#2,3:362\n22#3:313\n22#3:315\n22#3:320\n22#3:323\n22#3:325\n22#3:327\n22#3:329\n22#3:331\n22#3:333\n22#3:338\n22#3:340\n22#3:345\n22#3:347\n22#3:352\n22#3:354\n22#3:359\n22#3:361\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n64#1:312\n67#1:314\n80#1:316,3\n79#1:319\n79#1:321\n129#1:322\n130#1:324\n141#1:326\n142#1:328\n170#1:330\n171#1:332\n169#1:334,3\n187#1:337\n188#1:339\n186#1:341,3\n204#1:344\n205#1:346\n203#1:348,3\n221#1:351\n222#1:353\n220#1:355,3\n238#1:358\n239#1:360\n237#1:362,3\n64#1:313\n67#1:315\n79#1:320\n129#1:323\n130#1:325\n141#1:327\n142#1:329\n170#1:331\n171#1:333\n187#1:338\n188#1:340\n204#1:345\n205#1:347\n221#1:352\n222#1:354\n238#1:359\n239#1:361\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f65503b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f65504c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f65505d = 9187343241974906880L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f65506e = 9205357640488583168L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65507a;

    public static final class a {
        public a() {
        }

        public final long a() {
            return g.f65505d;
        }

        public final long c() {
            return g.f65506e;
        }

        public final long e() {
            return g.f65504c;
        }

        public a(C4969v c4969v) {
        }

        @T1
        public static /* synthetic */ void b() {
        }

        @T1
        public static /* synthetic */ void d() {
        }

        @T1
        public static /* synthetic */ void f() {
        }
    }

    public /* synthetic */ g(long j10) {
        this.f65507a = j10;
    }

    public static final /* synthetic */ g d(long j10) {
        return new g(j10);
    }

    @T1
    public static final float e(long j10) {
        return p(j10);
    }

    @T1
    public static final float f(long j10) {
        return r(j10);
    }

    public static final long h(long j10, float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j);
    }

    public static /* synthetic */ long i(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (ZipKt.f225990j & j10));
        }
        return h(j10, f10, f11);
    }

    @T1
    public static final long j(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) / f10;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ZipKt.f225990j);
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof g) && j10 == ((g) obj).f65507a;
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    @T1
    public static final float m(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    @T1
    public static final float n(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
        return (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
    }

    public static final float p(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float r(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static int s(long j10) {
        return C1550p.a(j10);
    }

    @T1
    public static final boolean t(long j10) {
        long j11 = j10 & d.f65490a;
        return (((~j11) & (j11 - d.f65497h)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    @T1
    public static final long u(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) - Float.intBitsToFloat((int) (j11 & ZipKt.f225990j));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ZipKt.f225990j);
    }

    @T1
    public static final long v(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & ZipKt.f225990j)) + Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)))) & ZipKt.f225990j) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @T1
    public static final long w(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) % f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) % f10;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ZipKt.f225990j);
    }

    @T1
    public static final long x(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) * f10;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ZipKt.f225990j);
    }

    @NotNull
    public static String y(long j10) {
        if (!h.d(j10)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + c.a(p(j10), 1) + U6.j.f68738d + c.a(r(j10), 1) + ')';
    }

    @T1
    public static final long z(long j10) {
        return j10 ^ (-9223372034707292160L);
    }

    public final /* synthetic */ long A() {
        return this.f65507a;
    }

    public boolean equals(Object obj) {
        return k(this.f65507a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f65507a);
    }

    @NotNull
    public String toString() {
        return y(this.f65507a);
    }

    @T1
    public static /* synthetic */ void o() {
    }

    @T1
    public static /* synthetic */ void q() {
    }

    public static long g(long j10) {
        return j10;
    }
}
