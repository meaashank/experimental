package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,113:1\n35#1,2:114\n66#1,3:116\n40#1,3:119\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n46#1:114,2\n50#1:116,3\n50#1:119,3\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1620y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88253c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f88254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f88255b;

    public C1620y(double d10, double d11) {
        this.f88254a = d10;
        this.f88255b = d11;
    }

    public static C1620y h(C1620y c1620y, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = c1620y.f88254a;
        }
        if ((i10 & 2) != 0) {
            d11 = c1620y.f88255b;
        }
        c1620y.getClass();
        return new C1620y(d10, d11);
    }

    public final double e() {
        return this.f88254a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1620y)) {
            return false;
        }
        C1620y c1620y = (C1620y) obj;
        return Double.compare(this.f88254a, c1620y.f88254a) == 0 && Double.compare(this.f88255b, c1620y.f88255b) == 0;
    }

    public final double f() {
        return this.f88255b;
    }

    @NotNull
    public final C1620y g(double d10, double d11) {
        return new C1620y(d10, d11);
    }

    public int hashCode() {
        return C1618x.a(this.f88255b) + (C1618x.a(this.f88254a) * 31);
    }

    @NotNull
    public final C1620y i(double d10) {
        this.f88254a /= d10;
        this.f88255b /= d10;
        return this;
    }

    public final double j() {
        return this.f88255b;
    }

    public final double k() {
        return this.f88254a;
    }

    @NotNull
    public final C1620y l(double d10) {
        this.f88254a += -d10;
        return this;
    }

    @NotNull
    public final C1620y m(@NotNull C1620y c1620y) {
        double d10 = -1;
        double d11 = c1620y.f88254a * d10;
        c1620y.f88254a = d11;
        double d12 = c1620y.f88255b * d10;
        c1620y.f88255b = d12;
        this.f88254a += d11;
        this.f88255b += d12;
        return this;
    }

    @NotNull
    public final C1620y n(double d10) {
        this.f88254a += d10;
        return this;
    }

    @NotNull
    public final C1620y o(@NotNull C1620y c1620y) {
        this.f88254a += c1620y.f88254a;
        this.f88255b += c1620y.f88255b;
        return this;
    }

    @NotNull
    public final C1620y p(double d10) {
        this.f88254a *= d10;
        this.f88255b *= d10;
        return this;
    }

    @NotNull
    public final C1620y q(@NotNull C1620y c1620y) {
        double d10 = this.f88254a * c1620y.f88254a;
        double d11 = this.f88255b;
        double d12 = c1620y.f88255b;
        double d13 = d10 - (d11 * d12);
        this.f88254a = d13;
        this.f88255b = (c1620y.f88254a * d11) + (d13 * d12);
        return this;
    }

    @NotNull
    public final C1620y r() {
        double d10 = -1;
        this.f88254a *= d10;
        this.f88255b *= d10;
        return this;
    }

    @NotNull
    public String toString() {
        return "ComplexDouble(_real=" + this.f88254a + ", _imaginary=" + this.f88255b + ')';
    }
}
