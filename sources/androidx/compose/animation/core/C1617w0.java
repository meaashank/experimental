package androidx.compose.animation.core;

import okio.internal.ZipKt;

/* JADX INFO: renamed from: androidx.compose.animation.core.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,243:1\n63#2,3:244\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n*L\n58#1:244,3\n*E\n"})
public final class C1617w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f88247a = 62.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f88248b = Float.MAX_VALUE;

    public static final long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final float b() {
        return f88248b;
    }
}
