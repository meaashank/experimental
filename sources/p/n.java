package P;

import androidx.collection.C1550p;
import androidx.collection.LruCacheKt;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,285:1\n72#2:286\n86#2:288\n63#2,3:290\n72#2:293\n86#2:295\n72#2:296\n86#2:298\n63#2,3:300\n72#2:303\n86#2:305\n63#2,3:307\n79#2:310\n93#2:312\n79#2:313\n93#2:315\n22#3:287\n22#3:289\n22#3:294\n22#3:297\n22#3:299\n22#3:304\n22#3:306\n22#3:311\n22#3:314\n198#4:316\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n51#1:286\n61#1:288\n77#1:290,3\n76#1:293\n76#1:295\n133#1:296\n134#1:298\n132#1:300,3\n153#1:303\n154#1:305\n152#1:307,3\n168#1:310\n168#1:312\n180#1:313\n180#1:315\n51#1:287\n61#1:289\n76#1:294\n133#1:297\n134#1:299\n153#1:304\n154#1:306\n168#1:311\n180#1:314\n184#1:316\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f65527b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f65528c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f65529d = 9205357640488583168L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65530a;

    public static final class a {
        public a() {
        }

        public final long a() {
            return n.f65529d;
        }

        public final long c() {
            return n.f65528c;
        }

        public a(C4969v c4969v) {
        }

        @T1
        public static /* synthetic */ void b() {
        }

        @T1
        public static /* synthetic */ void d() {
        }
    }

    public /* synthetic */ n(long j10) {
        this.f65530a = j10;
    }

    public static final /* synthetic */ n c(long j10) {
        return new n(j10);
    }

    @T1
    public static final float d(long j10) {
        return t(j10);
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
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (ZipKt.f225990j & j10));
        }
        return g(j10, f10, f11);
    }

    @T1
    public static final long i(long j10, float f10) {
        if (j10 == d.f65493d) {
            d.b("Size is unspecified");
            throw null;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) / f10;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ZipKt.f225990j);
    }

    public static boolean j(long j10, Object obj) {
        return (obj instanceof n) && j10 == ((n) obj).f65530a;
    }

    public static final boolean k(long j10, long j11) {
        return j10 == j11;
    }

    public static final float m(long j10) {
        if (j10 != d.f65493d) {
            return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
        }
        d.b("Size is unspecified");
        throw null;
    }

    public static final float o(long j10) {
        if (j10 != d.f65493d) {
            return Math.max(Float.intBitsToFloat((int) ((j10 >> 32) & LruCacheKt.f86729a)), Float.intBitsToFloat((int) (j10 & LruCacheKt.f86729a)));
        }
        d.b("Size is unspecified");
        throw null;
    }

    public static final float q(long j10) {
        if (j10 != d.f65493d) {
            return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & LruCacheKt.f86729a)), Float.intBitsToFloat((int) (j10 & LruCacheKt.f86729a)));
        }
        d.b("Size is unspecified");
        throw null;
    }

    public static final float t(long j10) {
        if (j10 != d.f65493d) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        d.b("Size is unspecified");
        throw null;
    }

    public static int u(long j10) {
        return C1550p.a(j10);
    }

    @T1
    public static final boolean v(long j10) {
        if (j10 != d.f65493d) {
            long j11 = j10 & (~((((-9223372034707292160L) & j10) >>> 31) * ((long) (-1))));
            return ((j11 & ZipKt.f225990j) & (j11 >>> 32)) == 0;
        }
        d.b("Size is unspecified");
        throw null;
    }

    @T1
    public static final long w(long j10, float f10) {
        if (j10 == d.f65493d) {
            d.b("Size is unspecified");
            throw null;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) * f10;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & ZipKt.f225990j);
    }

    @NotNull
    public static String x(long j10) {
        if (j10 == d.f65493d) {
            return "Size.Unspecified";
        }
        return "Size(" + c.a(t(j10), 1) + U6.j.f68738d + c.a(m(j10), 1) + ')';
    }

    public boolean equals(Object obj) {
        return j(this.f65530a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f65530a);
    }

    @NotNull
    public String toString() {
        return x(this.f65530a);
    }

    public final /* synthetic */ long y() {
        return this.f65530a;
    }

    @T1
    public static /* synthetic */ void l() {
    }

    @T1
    public static /* synthetic */ void n() {
    }

    @T1
    public static /* synthetic */ void p() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void r() {
    }

    @T1
    public static /* synthetic */ void s() {
    }

    public static long f(long j10) {
        return j10;
    }
}
