package P;

import androidx.compose.runtime.T1;
import kotlin.jvm.internal.V;
import n0.C5238e;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n63#2,3:165\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n33#1:165,3\n*E\n"})
public final class b {
    @T1
    public static final long a(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j) | (Float.floatToRawIntBits(f10) << 32);
        a.e(jFloatToRawIntBits);
        return jFloatToRawIntBits;
    }

    public static /* synthetic */ long b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return a(f10, f11);
    }

    @T1
    public static final long c(long j10, long j11, float f10) {
        return a(C5238e.j(a.m(j10), a.m(j11), f10), C5238e.j(a.o(j10), a.o(j11), f10));
    }
}
