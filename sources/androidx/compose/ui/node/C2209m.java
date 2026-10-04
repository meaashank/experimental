package androidx.compose.ui.node;

import androidx.collection.C1550p;
import okio.internal.ZipKt;

/* JADX INFO: renamed from: androidx.compose.ui.node.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,347:1\n72#2:348\n114#2:350\n22#3:349\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n*L\n326#1:348\n329#1:350\n326#1:349\n*E\n"})
@dd.h
public final class C2209m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f103073a;

    public /* synthetic */ C2209m(long j10) {
        this.f103073a = j10;
    }

    public static final /* synthetic */ C2209m a(long j10) {
        return new C2209m(j10);
    }

    public static final int b(long j10, long j11) {
        boolean zI = i(j10);
        return zI != i(j11) ? zI ? -1 : 1 : (int) Math.signum(f(j10) - f(j11));
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof C2209m) && j10 == ((C2209m) obj).f103073a;
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int h(long j10) {
        return C1550p.a(j10);
    }

    public static final boolean i(long j10) {
        return ((int) (j10 & ZipKt.f225990j)) != 0;
    }

    public static String j(long j10) {
        return "DistanceAndInLayer(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f103073a, obj);
    }

    public final long g() {
        return this.f103073a;
    }

    public int hashCode() {
        return C1550p.a(this.f103073a);
    }

    public final /* synthetic */ long k() {
        return this.f103073a;
    }

    public String toString() {
        return j(this.f103073a);
    }
}
