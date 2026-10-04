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
@V({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,577:1\n72#2:578\n86#2:581\n63#2,3:584\n63#2,3:589\n63#2,3:594\n22#3:579\n22#3:582\n169#4:580\n169#4:583\n325#4:597\n57#5:587\n57#5:588\n51#5:592\n51#5:593\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n261#1:578\n267#1:581\n273#1:584,3\n280#1:589,3\n291#1:594,3\n261#1:579\n267#1:582\n261#1:580\n267#1:583\n299#1:597\n281#1:587\n282#1:588\n292#1:592\n293#1:593\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f214313b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f214314c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f214315d = 9205357640488583168L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214316a;

    public static final class a {
        public a() {
        }

        public final long a() {
            return k.f214315d;
        }

        public final long b() {
            return k.f214314c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ k(long j10) {
        this.f214316a = j10;
    }

    public static final /* synthetic */ k c(long j10) {
        return new k(j10);
    }

    public static final long e(long j10, float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j);
    }

    public static /* synthetic */ long f(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = l(j10);
        }
        return e(j10, f10, f11);
    }

    public static boolean g(long j10, Object obj) {
        return (obj instanceof k) && j10 == ((k) obj).f214316a;
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    public static final float j(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float l(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static int n(long j10) {
        return C1550p.a(j10);
    }

    @T1
    public static final long o(long j10, long j11) {
        float fJ = j(j10) - j(j11);
        float fL = l(j10) - l(j11);
        return (((long) Float.floatToRawIntBits(fJ)) << 32) | (ZipKt.f225990j & ((long) Float.floatToRawIntBits(fL)));
    }

    @T1
    public static final long p(long j10, long j11) {
        float fJ = j(j11) + j(j10);
        return (((long) Float.floatToRawIntBits(l(j11) + l(j10))) & ZipKt.f225990j) | (Float.floatToRawIntBits(fJ) << 32);
    }

    @T1
    @NotNull
    public static String q(long j10) {
        if (j10 == P.d.f65493d) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) i.u(j(j10))) + U6.j.f68738d + ((Object) i.u(l(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return g(this.f214316a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f214316a);
    }

    public final /* synthetic */ long r() {
        return this.f214316a;
    }

    @T1
    @NotNull
    public String toString() {
        return q(this.f214316a);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void i() {
    }

    @T1
    public static /* synthetic */ void k() {
    }

    @T1
    public static /* synthetic */ void m() {
    }

    public static long d(long j10) {
        return j10;
    }
}
