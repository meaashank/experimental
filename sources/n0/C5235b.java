package n0;

import androidx.collection.LruCacheKt;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;

/* JADX INFO: renamed from: n0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nInlineClassHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,116:1\n22#2:117\n22#2:118\n22#2:119\n22#2:120\n*S KotlinDebug\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n72#1:117\n79#1:118\n86#1:119\n93#1:120\n*E\n"})
public final class C5235b {
    public static final long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final long b(int i10, int i11) {
        return (((long) i11) & ZipKt.f225990j) | (((long) i10) << 32);
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) ((j10 >> 32) & LruCacheKt.f86729a));
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 & LruCacheKt.f86729a));
    }

    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int h(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }
}
