package androidx.compose.animation.core;

import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,113:1\n103#1:114\n107#1:120\n103#1:124\n103#1:135\n35#2,2:115\n54#2,3:117\n66#2,3:121\n35#2,2:125\n54#2,3:127\n35#2,2:130\n66#2,3:132\n35#2,2:136\n54#2,3:138\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n88#1:114\n89#1:120\n89#1:124\n107#1:135\n88#1:115,2\n88#1:117,3\n89#1:121,3\n89#1:125,2\n89#1:127,3\n103#1:130,2\n107#1:132,3\n107#1:136,2\n111#1:138,3\n*E\n"})
public final class C1622z {
    @NotNull
    public static final Pair<C1620y, C1620y> a(double d10, double d11, double d12) {
        double d13 = (d11 * d11) - ((4.0d * d10) * d12);
        double d14 = 1.0d / (d10 * 2.0d);
        double d15 = -d11;
        C1620y c1620yB = b(d13);
        c1620yB.f88254a = (c1620yB.f88254a + d15) * d14;
        c1620yB.f88255b *= d14;
        C1620y c1620yB2 = b(d13);
        double d16 = -1;
        double d17 = c1620yB2.f88254a * d16;
        double d18 = c1620yB2.f88255b * d16;
        c1620yB2.f88254a = (d17 + d15) * d14;
        c1620yB2.f88255b = d18 * d14;
        return new Pair<>(c1620yB, c1620yB2);
    }

    @NotNull
    public static final C1620y b(double d10) {
        return d10 < 0.0d ? new C1620y(0.0d, Math.sqrt(Math.abs(d10))) : new C1620y(Math.sqrt(d10), 0.0d);
    }

    @NotNull
    public static final C1620y c(double d10, @NotNull C1620y c1620y) {
        double d11 = -1;
        double d12 = c1620y.f88254a * d11;
        c1620y.f88255b *= d11;
        c1620y.f88254a = d12 + d10;
        return c1620y;
    }

    @NotNull
    public static final C1620y d(double d10, @NotNull C1620y c1620y) {
        c1620y.f88254a += d10;
        return c1620y;
    }

    @NotNull
    public static final C1620y e(double d10, @NotNull C1620y c1620y) {
        c1620y.f88254a *= d10;
        c1620y.f88255b *= d10;
        return c1620y;
    }
}
