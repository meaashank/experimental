package P;

import androidx.compose.runtime.T1;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.V;
import n0.C5238e;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,311:1\n63#2,3:312\n72#2:315\n86#2:317\n63#2,3:319\n22#3:316\n22#3:318\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:312,3\n272#1:315\n273#1:317\n271#1:319,3\n272#1:316\n273#1:318\n*E\n"})
public final class h {
    @T1
    public static final long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final boolean b(long j10) {
        long j11 = (j10 & d.f65492c) ^ d.f65492c;
        return (((~j11) & (j11 - d.f65496g)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean d(long j10) {
        return (j10 & d.f65490a) != d.f65493d;
    }

    public static final boolean f(long j10) {
        return (j10 & d.f65490a) == d.f65493d;
    }

    @T1
    public static final long h(long j10, long j11, float f10) {
        float fJ = C5238e.j(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fJ2 = C5238e.j(Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)), Float.intBitsToFloat((int) (j11 & ZipKt.f225990j)), f10);
        return (((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fJ2)) & ZipKt.f225990j);
    }

    public static final long i(long j10, @NotNull InterfaceC4376a<g> interfaceC4376a) {
        return d(j10) ? j10 : interfaceC4376a.invoke().f65507a;
    }

    @T1
    public static /* synthetic */ void c(long j10) {
    }

    @T1
    public static /* synthetic */ void e(long j10) {
    }

    @T1
    public static /* synthetic */ void g(long j10) {
    }
}
