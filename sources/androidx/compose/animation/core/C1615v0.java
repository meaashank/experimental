package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1615v0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f88239h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f88240a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f88243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f88244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f88245f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f88241b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f88246g = 1.0f;

    public C1615v0(float f10) {
        this.f88240a = f10;
    }

    public final float a(float f10, float f11) {
        float f12 = f10 - this.f88240a;
        double d10 = this.f88241b;
        return (float) (((-(d10 * d10)) * ((double) f12)) - (((d10 * 2.0d) * ((double) this.f88246g)) * ((double) f11)));
    }

    public final float b() {
        return this.f88246g;
    }

    public final float c() {
        return this.f88240a;
    }

    public final float d() {
        double d10 = this.f88241b;
        return (float) (d10 * d10);
    }

    public final void e() {
        if (this.f88242c) {
            return;
        }
        if (this.f88240a == C1617w0.f88248b) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f10 = this.f88246g;
        double d10 = ((double) f10) * ((double) f10);
        if (f10 > 1.0f) {
            double d11 = this.f88241b;
            double d12 = d10 - ((double) 1);
            this.f88243d = (Math.sqrt(d12) * d11) + (((double) (-f10)) * d11);
            double d13 = -this.f88246g;
            double d14 = this.f88241b;
            this.f88244e = (d13 * d14) - (Math.sqrt(d12) * d14);
        } else if (f10 >= 0.0f && f10 < 1.0f) {
            this.f88245f = Math.sqrt(((double) 1) - d10) * this.f88241b;
        }
        this.f88242c = true;
    }

    public final void f(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f88246g = f10;
        this.f88242c = false;
    }

    public final void g(float f10) {
        this.f88240a = f10;
    }

    public final void h(float f10) {
        double d10 = this.f88241b;
        if (((float) (d10 * d10)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f88241b = Math.sqrt(f10);
        this.f88242c = false;
    }

    public final long i(float f10, float f11, long j10) {
        double dCos;
        double dExp;
        double dExp2;
        double dExp3;
        e();
        float f12 = f10 - this.f88240a;
        double d10 = j10 / 1000.0d;
        float f13 = this.f88246g;
        if (f13 > 1.0f) {
            double d11 = f12;
            double d12 = this.f88244e;
            double d13 = f11;
            double d14 = this.f88243d;
            double d15 = d11 - (((d12 * d11) - d13) / (d12 - d14));
            double d16 = ((d11 * d12) - d13) / (d12 - d14);
            dExp = (Math.exp(this.f88243d * d10) * d16) + (Math.exp(d12 * d10) * d15);
            double d17 = this.f88244e;
            dExp2 = Math.exp(d17 * d10) * d15 * d17;
            double d18 = this.f88243d;
            dExp3 = Math.exp(d18 * d10) * d16 * d18;
        } else {
            if (f13 != 1.0f) {
                double d19 = ((double) 1) / this.f88245f;
                double d20 = this.f88241b;
                double d21 = f12;
                double d22 = ((((double) f13) * d20 * d21) + ((double) f11)) * d19;
                double dExp4 = Math.exp(((double) (-f13)) * d20 * d10) * ((Math.sin(this.f88245f * d10) * d22) + (Math.cos(this.f88245f * d10) * d21));
                double d23 = this.f88241b;
                float f14 = this.f88246g;
                double d24 = (-d23) * dExp4 * ((double) f14);
                double dExp5 = Math.exp(((double) (-f14)) * d23 * d10);
                double d25 = this.f88245f;
                double dSin = Math.sin(d25 * d10) * (-d25) * d21;
                double d26 = this.f88245f;
                dCos = (((Math.cos(d26 * d10) * d22 * d26) + dSin) * dExp5) + d24;
                dExp = dExp4;
                return C1617w0.a((float) (dExp + ((double) this.f88240a)), (float) dCos);
            }
            double d27 = this.f88241b;
            double d28 = f12;
            double d29 = (d27 * d28) + ((double) f11);
            double d30 = (d29 * d10) + d28;
            dExp = Math.exp((-d27) * d10) * d30;
            double dExp6 = Math.exp((-this.f88241b) * d10) * d30;
            double d31 = this.f88241b;
            dExp2 = dExp6 * (-d31);
            dExp3 = Math.exp((-d31) * d10) * d29;
        }
        dCos = dExp3 + dExp2;
        return C1617w0.a((float) (dExp + ((double) this.f88240a)), (float) dCos);
    }
}
