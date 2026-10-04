package androidx.compose.animation.core;

import androidx.collection.C1550p;
import okio.internal.ZipKt;

/* JADX INFO: renamed from: androidx.compose.animation.core.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,243:1\n72#2:244\n86#2:246\n22#3:245\n22#3:247\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n47#1:244\n49#1:246\n47#1:245\n49#1:247\n*E\n"})
@dd.h
public final class C1594k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88146a;

    public /* synthetic */ C1594k0(long j10) {
        this.f88146a = j10;
    }

    public static final /* synthetic */ C1594k0 a(long j10) {
        return new C1594k0(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static final long c(long j10, float f10, float f11) {
        return C1617w0.a(f10, f11);
    }

    public static long d(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = i(j10);
        }
        return C1617w0.a(f10, f11);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof C1594k0) && j10 == ((C1594k0) obj).f88146a;
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float i(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static int j(long j10) {
        return C1550p.a(j10);
    }

    public static String k(long j10) {
        return "Motion(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f88146a, obj);
    }

    public final long g() {
        return this.f88146a;
    }

    public int hashCode() {
        return C1550p.a(this.f88146a);
    }

    public final /* synthetic */ long l() {
        return this.f88146a;
    }

    public String toString() {
        return k(this.f88146a);
    }
}
