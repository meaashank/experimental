package k0;

import androidx.compose.runtime.T1;
import kotlin.jvm.internal.V;
import n0.C5238e;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,199:1\n100#2:200\n100#2:201\n100#2:203\n26#3:202\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n35#1:200\n166#1:201\n198#1:203\n198#1:202\n*E\n"})
public final class u {
    @T1
    public static final long a(int i10, int i11) {
        return (((long) i11) & ZipKt.f225990j) | (((long) i10) << 32);
    }

    @T1
    public static final long b(long j10, long j11, float f10) {
        return (((long) C5238e.k((int) (j10 >> 32), (int) (j11 >> 32), f10)) << 32) | (((long) C5238e.k((int) (j10 & ZipKt.f225990j), (int) (j11 & ZipKt.f225990j), f10)) & ZipKt.f225990j);
    }

    @T1
    public static final long c(long j10, long j11) {
        return P.h.a(P.g.p(j10) - ((int) (j11 >> 32)), P.g.r(j10) - ((int) (j11 & ZipKt.f225990j)));
    }

    @T1
    public static final long d(long j10, long j11) {
        return P.h.a(((int) (j10 >> 32)) - P.g.p(j11), ((int) (j10 & ZipKt.f225990j)) - P.g.r(j11));
    }

    @T1
    public static final long e(long j10, long j11) {
        return P.h.a(P.g.p(j10) + ((int) (j11 >> 32)), P.g.r(j10) + ((int) (j11 & ZipKt.f225990j)));
    }

    @T1
    public static final long f(long j10, long j11) {
        return P.h.a(P.g.p(j11) + ((int) (j10 >> 32)), P.g.r(j11) + ((int) (j10 & ZipKt.f225990j)));
    }

    @T1
    public static final long g(long j10) {
        int iRound = Math.round(P.g.p(j10));
        return (((long) Math.round(P.g.r(j10))) & ZipKt.f225990j) | (((long) iRound) << 32);
    }

    @T1
    public static final long h(long j10) {
        return P.h.a((int) (j10 >> 32), (int) (j10 & ZipKt.f225990j));
    }
}
