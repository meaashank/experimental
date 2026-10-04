package s0;

/* JADX INFO: loaded from: classes.dex */
public class t implements s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f238155p = 1.0E-5f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f238156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f238157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f238158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f238159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f238160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f238161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f238162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f238163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f238164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f238165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f238166k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f238168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f238169n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f238167l = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f238170o = false;

    @Override // s0.s
    public float a() {
        return this.f238167l ? -b(this.f238169n) : b(this.f238169n);
    }

    @Override // s0.s
    public float b(float f10) {
        float f11;
        float f12;
        float f13 = this.f238159d;
        if (f10 <= f13) {
            f11 = this.f238156a;
            f12 = this.f238157b;
        } else {
            int i10 = this.f238165j;
            if (i10 == 1) {
                return 0.0f;
            }
            f10 -= f13;
            f13 = this.f238160e;
            if (f10 >= f13) {
                if (i10 == 2) {
                    return this.f238163h;
                }
                float f14 = f10 - f13;
                float f15 = this.f238161f;
                if (f14 >= f15) {
                    return this.f238164i;
                }
                float f16 = this.f238158c;
                return f16 - ((f14 * f16) / f15);
            }
            f11 = this.f238157b;
            f12 = this.f238158c;
        }
        return (((f12 - f11) * f10) / f13) + f11;
    }

    @Override // s0.s
    public String c(String str, float f10) {
        StringBuilder sbA = android.support.v4.media.f.a(android.support.v4.media.e.a(android.support.v4.media.f.a(str, " ===== "), this.f238166k, "\n"), str);
        sbA.append(this.f238167l ? "backwards" : "forward ");
        sbA.append(" time = ");
        sbA.append(f10);
        sbA.append("  stages ");
        String str2 = android.support.v4.media.d.a(sbA, this.f238165j, "\n") + str + " dur " + this.f238159d + " vel " + this.f238156a + " pos " + this.f238162g + "\n";
        if (this.f238165j > 1) {
            str2 = str2 + str + " dur " + this.f238160e + " vel " + this.f238157b + " pos " + this.f238163h + "\n";
        }
        if (this.f238165j > 2) {
            str2 = str2 + str + " dur " + this.f238161f + " vel " + this.f238158c + " pos " + this.f238164i + "\n";
        }
        float f11 = this.f238159d;
        if (f10 <= f11) {
            return androidx.concurrent.futures.a.a(str2, str, "stage 0\n");
        }
        int i10 = this.f238165j;
        if (i10 == 1) {
            return androidx.concurrent.futures.a.a(str2, str, "end stage 0\n");
        }
        float f12 = f10 - f11;
        float f13 = this.f238160e;
        return f12 < f13 ? androidx.concurrent.futures.a.a(str2, str, " stage 1\n") : i10 == 2 ? androidx.concurrent.futures.a.a(str2, str, "end stage 1\n") : f12 - f13 < this.f238161f ? androidx.concurrent.futures.a.a(str2, str, " stage 2\n") : androidx.concurrent.futures.a.a(str2, str, " end stage 2\n");
    }

    public final float d(float f10) {
        this.f238170o = false;
        float f11 = this.f238159d;
        if (f10 <= f11) {
            float f12 = this.f238156a;
            return ((((this.f238157b - f12) * f10) * f10) / (f11 * 2.0f)) + (f12 * f10);
        }
        int i10 = this.f238165j;
        if (i10 == 1) {
            return this.f238162g;
        }
        float f13 = f10 - f11;
        float f14 = this.f238160e;
        if (f13 < f14) {
            float f15 = this.f238162g;
            float f16 = this.f238157b;
            return ((((this.f238158c - f16) * f13) * f13) / (f14 * 2.0f)) + (f16 * f13) + f15;
        }
        if (i10 == 2) {
            return this.f238163h;
        }
        float f17 = f13 - f14;
        float f18 = this.f238161f;
        if (f17 > f18) {
            this.f238170o = true;
            return this.f238164i;
        }
        float f19 = this.f238163h;
        float f20 = this.f238158c;
        return ((f20 * f17) + f19) - (((f20 * f17) * f17) / (f18 * 2.0f));
    }

    public void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f238170o = false;
        this.f238168m = f10;
        boolean z10 = f10 > f11;
        this.f238167l = z10;
        if (z10) {
            f(-f12, f10 - f11, f14, f15, f13);
        } else {
            f(f12, f11 - f10, f14, f15, f13);
        }
    }

    @Override // s0.s
    public boolean e0() {
        return a() < 1.0E-5f && Math.abs(this.f238164i - this.f238169n) < 1.0E-5f;
    }

    public final void f(float f10, float f11, float f12, float f13, float f14) {
        this.f238170o = false;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        this.f238156a = f10;
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f238166k = "backward accelerate, decelerate";
                this.f238165j = 2;
                this.f238156a = f10;
                this.f238157b = fSqrt;
                this.f238158c = 0.0f;
                float f17 = (fSqrt - f10) / f12;
                this.f238159d = f17;
                this.f238160e = fSqrt / f12;
                this.f238162g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f238163h = f11;
                this.f238164i = f11;
                return;
            }
            this.f238166k = "backward accelerate cruse decelerate";
            this.f238165j = 3;
            this.f238156a = f10;
            this.f238157b = f13;
            this.f238158c = f13;
            float f18 = (f13 - f10) / f12;
            this.f238159d = f18;
            float f19 = f13 / f12;
            this.f238161f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f238160e = ((f11 - f20) - f21) / f13;
            this.f238162g = f20;
            this.f238163h = f11 - f21;
            this.f238164i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f238166k = "hard stop";
            this.f238165j = 1;
            this.f238156a = f10;
            this.f238157b = 0.0f;
            this.f238162g = f11;
            this.f238159d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.f238166k = "cruse decelerate";
            this.f238165j = 2;
            this.f238156a = f10;
            this.f238157b = f10;
            this.f238158c = 0.0f;
            this.f238162g = f22;
            this.f238163h = f11;
            this.f238159d = f23;
            this.f238160e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f10 * f10) / 2.0f) + (f12 * f11));
        float f24 = (fSqrt2 - f10) / f12;
        this.f238159d = f24;
        float f25 = fSqrt2 / f12;
        this.f238160e = f25;
        if (fSqrt2 < f13) {
            this.f238166k = "accelerate decelerate";
            this.f238165j = 2;
            this.f238156a = f10;
            this.f238157b = fSqrt2;
            this.f238158c = 0.0f;
            this.f238159d = f24;
            this.f238160e = f25;
            this.f238162g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f238163h = f11;
            return;
        }
        this.f238166k = "accelerate cruse decelerate";
        this.f238165j = 3;
        this.f238156a = f10;
        this.f238157b = f13;
        this.f238158c = f13;
        float f26 = (f13 - f10) / f12;
        this.f238159d = f26;
        float f27 = f13 / f12;
        this.f238161f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f238160e = ((f11 - f28) - f29) / f13;
        this.f238162g = f28;
        this.f238163h = f11 - f29;
        this.f238164i = f11;
    }

    @Override // s0.s
    public float getInterpolation(float f10) {
        float fD = d(f10);
        this.f238169n = f10;
        return this.f238167l ? this.f238168m - fD : this.f238168m + fD;
    }
}
