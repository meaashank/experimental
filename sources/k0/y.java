package k0;

import androidx.compose.runtime.T1;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,146:1\n100#2:147\n100#2:148\n100#2:151\n26#3:149\n26#3:150\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n33#1:147\n133#1:148\n141#1:151\n142#1:149\n143#1:150\n*E\n"})
public final class y {
    @T1
    public static final long a(int i10, int i11) {
        return (((long) i11) & ZipKt.f225990j) | (((long) i10) << 32);
    }

    public static final long b(long j10) {
        return (((j10 << 32) >> 33) & ZipKt.f225990j) | ((j10 >> 33) << 32);
    }

    @T1
    public static final long d(long j10) {
        int iRound = Math.round(P.n.t(j10));
        return (((long) Math.round(P.n.m(j10))) & ZipKt.f225990j) | (((long) iRound) << 32);
    }

    @T1
    public static final long e(int i10, long j10) {
        return x.o(j10, i10);
    }

    @T1
    @NotNull
    public static final v f(long j10) {
        t.f214328b.getClass();
        return w.b(t.f214329c, j10);
    }

    @T1
    public static final long g(long j10) {
        int iT = (int) P.n.t(j10);
        return (((long) ((int) P.n.m(j10))) & ZipKt.f225990j) | (((long) iT) << 32);
    }

    @T1
    public static final long h(long j10) {
        return P.o.a((int) (j10 >> 32), (int) (j10 & ZipKt.f225990j));
    }

    @T1
    public static /* synthetic */ void c(long j10) {
    }
}
