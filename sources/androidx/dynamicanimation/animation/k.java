package androidx.dynamicanimation.animation;

import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.b;
import e.InterfaceC4348w;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f113227k = 10000.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f113228l = 1500.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f113229m = 200.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f113230n = 50.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f113231o = 0.2f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f113232p = 0.5f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f113233q = 0.75f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f113234r = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final double f113235s = 62.5d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final double f113236t = Double.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f113237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f113238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f113239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f113240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f113241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f113242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f113243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f113244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f113245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b.p f113246j;

    public k() {
        this.f113237a = Math.sqrt(1500.0d);
        this.f113238b = 0.5d;
        this.f113239c = false;
        this.f113245i = Double.MAX_VALUE;
        this.f113246j = new b.p();
    }

    @Override // androidx.dynamicanimation.animation.i
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float a(float f10, float f11) {
        float f12 = f10 - ((float) this.f113245i);
        double d10 = this.f113237a;
        return (float) (((-(d10 * d10)) * ((double) f12)) - (((d10 * 2.0d) * this.f113238b) * ((double) f11)));
    }

    @Override // androidx.dynamicanimation.animation.i
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean b(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f113241e && ((double) Math.abs(f10 - ((float) this.f113245i))) < this.f113240d;
    }

    public float c() {
        return (float) this.f113238b;
    }

    public float d() {
        return (float) this.f113245i;
    }

    public float e() {
        double d10 = this.f113237a;
        return (float) (d10 * d10);
    }

    public final void f() {
        if (this.f113239c) {
            return;
        }
        if (this.f113245i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f113238b;
        if (d10 > 1.0d) {
            double d11 = this.f113237a;
            this.f113242f = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
            double d12 = this.f113238b;
            double d13 = this.f113237a;
            this.f113243g = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f113244h = Math.sqrt(1.0d - (d10 * d10)) * this.f113237a;
        }
        this.f113239c = true;
    }

    public k g(@InterfaceC4348w(from = 0.0d) float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f113238b = f10;
        this.f113239c = false;
        return this;
    }

    public k h(float f10) {
        this.f113245i = f10;
        return this;
    }

    public k i(@InterfaceC4348w(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f113237a = Math.sqrt(f10);
        this.f113239c = false;
        return this;
    }

    public void j(double d10) {
        double dAbs = Math.abs(d10);
        this.f113240d = dAbs;
        this.f113241e = dAbs * 62.5d;
    }

    public b.p k(double d10, double d11, long j10) {
        double dSin;
        double dCos;
        f();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f113245i;
        double d14 = this.f113238b;
        if (d14 > 1.0d) {
            double d15 = this.f113243g;
            double d16 = this.f113242f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dSin = (Math.pow(2.718281828459045d, this.f113242f * d12) * d18) + (Math.pow(2.718281828459045d, d15 * d12) * d17);
            double d19 = this.f113243g;
            double dPow = Math.pow(2.718281828459045d, d19 * d12) * d17 * d19;
            double d20 = this.f113242f;
            dCos = (Math.pow(2.718281828459045d, d20 * d12) * d18 * d20) + dPow;
        } else if (d14 == 1.0d) {
            double d21 = this.f113237a;
            double d22 = (d21 * d13) + d11;
            double d23 = (d22 * d12) + d13;
            double dPow2 = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f113237a) * d12) * d23;
            double d24 = this.f113237a;
            dCos = (Math.pow(2.718281828459045d, (-d24) * d12) * d22) + (dPow3 * (-d24));
            dSin = dPow2;
        } else {
            double d25 = 1.0d / this.f113244h;
            double d26 = this.f113237a;
            double d27 = ((d14 * d26 * d13) + d11) * d25;
            dSin = ((Math.sin(this.f113244h * d12) * d27) + (Math.cos(this.f113244h * d12) * d13)) * Math.pow(2.718281828459045d, (-d14) * d26 * d12);
            double d28 = this.f113237a;
            double d29 = this.f113238b;
            double d30 = (-d28) * dSin * d29;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d31 = this.f113244h;
            double dSin2 = Math.sin(d31 * d12) * (-d31) * d13;
            double d32 = this.f113244h;
            dCos = (((Math.cos(d32 * d12) * d27 * d32) + dSin2) * dPow4) + d30;
        }
        b.p pVar = this.f113246j;
        pVar.f113213a = (float) (dSin + this.f113245i);
        pVar.f113214b = (float) dCos;
        return pVar;
    }

    public k(float f10) {
        this.f113237a = Math.sqrt(1500.0d);
        this.f113238b = 0.5d;
        this.f113239c = false;
        this.f113246j = new b.p();
        this.f113245i = f10;
    }
}
