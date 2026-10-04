package androidx.compose.ui.graphics.colorspace;

import androidx.compose.animation.core.C1618x;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f100946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f100947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f100948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f100949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f100950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f100951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f100952g;

    public C(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f100946a = d10;
        this.f100947b = d11;
        this.f100948c = d12;
        this.f100949d = d13;
        this.f100950e = d14;
        this.f100951f = d15;
        this.f100952g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public static C i(C c10, double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, Object obj) {
        double d17 = (i10 & 1) != 0 ? c10.f100946a : d10;
        double d18 = (i10 & 2) != 0 ? c10.f100947b : d11;
        double d19 = (i10 & 4) != 0 ? c10.f100948c : d12;
        double d20 = (i10 & 8) != 0 ? c10.f100949d : d13;
        double d21 = (i10 & 16) != 0 ? c10.f100950e : d14;
        double d22 = (i10 & 32) != 0 ? c10.f100951f : d15;
        double d23 = (i10 & 64) != 0 ? c10.f100952g : d16;
        c10.getClass();
        return new C(d17, d18, d19, d20, d21, d22, d23);
    }

    public final double a() {
        return this.f100946a;
    }

    public final double b() {
        return this.f100947b;
    }

    public final double c() {
        return this.f100948c;
    }

    public final double d() {
        return this.f100949d;
    }

    public final double e() {
        return this.f100950e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return Double.compare(this.f100946a, c10.f100946a) == 0 && Double.compare(this.f100947b, c10.f100947b) == 0 && Double.compare(this.f100948c, c10.f100948c) == 0 && Double.compare(this.f100949d, c10.f100949d) == 0 && Double.compare(this.f100950e, c10.f100950e) == 0 && Double.compare(this.f100951f, c10.f100951f) == 0 && Double.compare(this.f100952g, c10.f100952g) == 0;
    }

    public final double f() {
        return this.f100951f;
    }

    public final double g() {
        return this.f100952g;
    }

    @NotNull
    public final C h(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        return new C(d10, d11, d12, d13, d14, d15, d16);
    }

    public int hashCode() {
        return C1618x.a(this.f100952g) + ((C1618x.a(this.f100951f) + ((C1618x.a(this.f100950e) + ((C1618x.a(this.f100949d) + ((C1618x.a(this.f100948c) + ((C1618x.a(this.f100947b) + (C1618x.a(this.f100946a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final double j() {
        return this.f100947b;
    }

    public final double k() {
        return this.f100948c;
    }

    public final double l() {
        return this.f100949d;
    }

    public final double m() {
        return this.f100950e;
    }

    public final double n() {
        return this.f100951f;
    }

    public final double o() {
        return this.f100952g;
    }

    public final double p() {
        return this.f100946a;
    }

    @NotNull
    public String toString() {
        return "TransferParameters(gamma=" + this.f100946a + ", a=" + this.f100947b + ", b=" + this.f100948c + ", c=" + this.f100949d + ", d=" + this.f100950e + ", e=" + this.f100951f + ", f=" + this.f100952g + ')';
    }

    public /* synthetic */ C(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, C4969v c4969v) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
