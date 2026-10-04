package org.javia.arity;

import U6.j;

/* JADX INFO: loaded from: classes6.dex */
public class Complex {
    public double im;
    public double re;

    public Complex() {
    }

    private final Complex normalizeInfinity() {
        if (!Double.isInfinite(this.im)) {
            this.im = 0.0d;
            return this;
        }
        if (!Double.isInfinite(this.re)) {
            this.re = 0.0d;
        }
        return this;
    }

    private final Complex sqrt1z() {
        double d10 = this.re;
        double d11 = 1.0d - (d10 * d10);
        double d12 = this.im;
        return set((d12 * d12) + d11, d10 * (-2.0d) * d12).sqrt();
    }

    private final Complex swap() {
        return set(this.im, this.re);
    }

    public final double abs() {
        double dAbs = Math.abs(this.re);
        double dAbs2 = Math.abs(this.im);
        if (dAbs == 0.0d || dAbs2 == 0.0d) {
            return dAbs + dAbs2;
        }
        boolean z10 = dAbs > dAbs2;
        double d10 = z10 ? dAbs2 / dAbs : dAbs / dAbs2;
        if (!z10) {
            dAbs = dAbs2;
        }
        return Math.sqrt((d10 * d10) + 1.0d) * dAbs;
    }

    public final double abs2() {
        double d10 = this.re;
        double d11 = this.im;
        return (d11 * d11) + (d10 * d10);
    }

    public final Complex acos() {
        if (this.im == 0.0d && Math.abs(this.re) <= 1.0d) {
            return set(Math.acos(this.re), 0.0d);
        }
        return sqrt1z().set(this.re - this.im, this.im + this.re).log().set(this.im, -this.re);
    }

    public final Complex acosh() {
        double d10 = this.im;
        if (d10 == 0.0d) {
            double d11 = this.re;
            if (d11 >= 1.0d) {
                return set(MoreMath.acosh(d11), 0.0d);
            }
        }
        double d12 = this.re;
        return set(((d12 * d12) - (d10 * d10)) - 1.0d, 2.0d * d12 * d10).sqrt().set(this.re + d12, this.im + d10).log();
    }

    public final Complex add(Complex complex) {
        double dUlp = Math.ulp(this.re);
        double d10 = this.re + complex.re;
        this.re = d10;
        this.im += complex.im;
        if (Math.abs(d10) < dUlp * 1024.0d) {
            this.re = 0.0d;
        }
        return this;
    }

    public final double arg() {
        return Math.atan2(this.im, this.re);
    }

    public double asReal() {
        if (this.im == 0.0d) {
            return this.re;
        }
        return Double.NaN;
    }

    public final Complex asin() {
        if (this.im == 0.0d && Math.abs(this.re) <= 1.0d) {
            return set(Math.asin(this.re), 0.0d);
        }
        double d10 = this.re;
        return sqrt1z().set(this.re - this.im, this.im + d10).log().set(this.im, -this.re);
    }

    public final Complex asinh() {
        double d10 = this.im;
        if (d10 == 0.0d) {
            return set(MoreMath.asinh(this.re), 0.0d);
        }
        double d11 = this.re;
        return set(((d11 * d11) - (d10 * d10)) + 1.0d, 2.0d * d11 * d10).sqrt().set(this.re + d11, this.im + d10).log();
    }

    public final Complex atan() {
        double d10 = this.im;
        if (d10 == 0.0d) {
            return set(Math.atan(this.re), 0.0d);
        }
        double d11 = this.re;
        double d12 = (d10 * d10) + (d11 * d11);
        double d13 = ((d12 - d10) - d10) + 1.0d;
        return set((-(d12 - 1.0d)) / d13, (-(d11 + d11)) / d13).log().set((-this.im) / 2.0d, this.re / 2.0d);
    }

    public final Complex atanh() {
        double d10 = this.im;
        if (d10 == 0.0d) {
            return set(MoreMath.atanh(this.re), 0.0d);
        }
        double d11 = this.re;
        double d12 = d11 * d11;
        double d13 = ((d12 + 1.0d) - d11) - d11;
        return set(((1.0d - d12) - (d10 * d10)) / d13, (d10 + d10) / d13).log().set(this.re / 2.0d, this.im / 2.0d);
    }

    public final Complex combinations(Complex complex) {
        double d10 = this.im;
        if (d10 == 0.0d && complex.im == 0.0d) {
            return set(MoreMath.combinations(this.re, complex.re), 0.0d);
        }
        double d11 = this.re;
        lgamma();
        double d12 = this.re;
        double d13 = this.im;
        set(complex).lgamma();
        double d14 = this.re;
        double d15 = this.im;
        set(d11 - complex.re, d10 - complex.im).lgamma();
        return set((d12 - d14) - this.re, (d13 - d15) - this.im).exp();
    }

    public final Complex conjugate() {
        return set(this.re, -this.im);
    }

    public final Complex cos() {
        if (this.im == 0.0d) {
            return set(MoreMath.cos(this.re), 0.0d);
        }
        return set(Math.cosh(this.im) * MoreMath.cos(this.re), Math.sinh(this.im) * (-MoreMath.sin(this.re)));
    }

    public final Complex cosh() {
        return this.im == 0.0d ? set(Math.cosh(this.re), 0.0d) : swap().cos().conjugate();
    }

    public final Complex div(Complex complex) {
        double d10 = complex.re;
        double d11 = complex.im;
        if (this.im == 0.0d && d11 == 0.0d) {
            return set(this.re / d10, 0.0d);
        }
        if (complex.isInfinite() && isFinite()) {
            return set(0.0d, 0.0d);
        }
        if (d11 == 0.0d) {
            double d12 = this.re;
            return d12 == 0.0d ? set(0.0d, this.im / d10) : set(d12 / d10, this.im / d10);
        }
        if (d10 == 0.0d) {
            return set(this.im / d11, (-this.re) / d11);
        }
        if (Math.abs(d10) > Math.abs(d11)) {
            double d13 = d11 / d10;
            double d14 = (d11 * d13) + d10;
            double d15 = this.re;
            double d16 = this.im;
            return set(((d16 * d13) + d15) / d14, (d16 - (d15 * d13)) / d14);
        }
        double d17 = d10 / d11;
        double d18 = (d10 * d17) + d11;
        double d19 = this.re;
        double d20 = this.im;
        return set(((d19 * d17) + d20) / d18, ((d20 * d17) - d19) / d18);
    }

    public final boolean equals(Complex complex) {
        double d10 = this.re;
        double d11 = complex.re;
        if (d10 != d11 && (d10 == d10 || d11 == d11)) {
            return false;
        }
        double d12 = this.im;
        double d13 = complex.im;
        if (d12 != d13) {
            return (d12 == d12 || d13 == d13) ? false : true;
        }
        return true;
    }

    public final Complex exp() {
        double dExp = Math.exp(this.re);
        double d10 = this.im;
        return d10 == 0.0d ? set(dExp, 0.0d) : set(MoreMath.cos(d10) * dExp, dExp * MoreMath.sin(this.im));
    }

    public final Complex factorial() {
        return this.im == 0.0d ? set(MoreMath.factorial(this.re), 0.0d) : lgamma().exp();
    }

    public final Complex gcd(Complex complex) {
        if (this.im == 0.0d && complex.im == 0.0d) {
            return set(MoreMath.gcd(this.re, complex.re), 0.0d);
        }
        Complex complex2 = new Complex(complex);
        double dAbs2 = abs2();
        double dAbs22 = complex2.abs2();
        while (dAbs2 < 1.0E30d * dAbs22) {
            double d10 = complex2.re;
            double d11 = complex2.im;
            complex2.set(mod(complex2));
            set(d10, d11);
            double d12 = dAbs22;
            dAbs22 = complex2.abs2();
            dAbs2 = d12;
        }
        if (Math.abs(this.re) < Math.abs(this.im)) {
            set(-this.im, this.re);
        }
        if (this.re < 0.0d) {
            negate();
        }
        return this;
    }

    public final boolean isFinite() {
        return (isInfinite() || isNaN()) ? false : true;
    }

    public final boolean isInfinite() {
        if (Double.isInfinite(this.re)) {
            return true;
        }
        return Double.isInfinite(this.im) && !isNaN();
    }

    public final boolean isNaN() {
        return Double.isNaN(this.re) || Double.isNaN(this.im);
    }

    public final Complex lgamma() {
        double d10 = this.re;
        double d11 = this.im;
        double d12 = (d11 * d11) + (d10 * d10);
        double d13 = 0.9999999999999971d;
        double d14 = 0.0d;
        for (double d15 : MoreMath.GAMMA) {
            d10 += 1.0d;
            d12 += (d10 + d10) - 1.0d;
            d13 += (d15 * d10) / d12;
            d14 -= (d15 * this.im) / d12;
        }
        double d16 = this.re;
        double d17 = 0.5d + d16;
        double d18 = d16 + 5.2421875d;
        double d19 = this.im;
        this.re = d18;
        log();
        double d20 = this.re;
        double d21 = this.im;
        set(d13, d14).log();
        this.re += (((d17 * d20) - (d19 * d21)) + 0.9189385332046728d) - d18;
        this.im += ((d20 * d19) + (d17 * d21)) - d19;
        return this;
    }

    public final Complex log() {
        double d10 = this.im;
        if (d10 == 0.0d) {
            double d11 = this.re;
            if (d11 >= 0.0d) {
                return set(Math.log(d11), 0.0d);
            }
        }
        return set(Math.log(abs()), Math.atan2(d10, this.re));
    }

    public final Complex mod(Complex complex) {
        double d10 = this.re;
        double d11 = this.im;
        return (d11 == 0.0d && complex.im == 0.0d) ? set(d10 % complex.re, 0.0d) : div(complex).set(Math.rint(this.re), Math.rint(this.im)).mul(complex).set(d10 - this.re, d11 - this.im);
    }

    public Complex mul(double d10) {
        this.re *= d10;
        this.im *= d10;
        return this;
    }

    public final Complex negate() {
        return set(-this.re, -this.im);
    }

    public final Complex permutations(Complex complex) {
        double d10 = this.im;
        if (d10 == 0.0d && complex.im == 0.0d) {
            return set(MoreMath.permutations(this.re, complex.re), 0.0d);
        }
        double d11 = this.re;
        lgamma();
        double d12 = this.re;
        double d13 = this.im;
        set(d11 - complex.re, d10 - complex.im).lgamma();
        return set(d12 - this.re, d13 - this.im).exp();
    }

    public final Complex pow(Complex complex) {
        if (complex.im != 0.0d) {
            if (this.im == 0.0d) {
                double d10 = this.re;
                if (d10 > 0.0d) {
                    double dPow = Math.pow(d10, complex.re);
                    return set(0.0d, Math.log(this.re) * complex.im).exp().set(this.re * dPow, dPow * this.im);
                }
            }
            Complex complexLog = log();
            double d11 = complex.re;
            double d12 = this.re;
            double d13 = complex.im;
            double d14 = this.im;
            return complexLog.set((d11 * d12) - (d13 * d14), (d13 * d12) + (d11 * d14)).exp();
        }
        double d15 = complex.re;
        if (d15 == 0.0d) {
            return set(1.0d, 0.0d);
        }
        if (this.im == 0.0d) {
            double dPow2 = Math.pow(this.re, d15);
            if (dPow2 == dPow2) {
                return set(dPow2, 0.0d);
            }
        }
        double d16 = complex.re;
        if (d16 == 2.0d) {
            return square();
        }
        if (d16 == 0.5d) {
            return sqrt();
        }
        double dPow3 = Math.pow(abs2(), complex.re / 2.0d);
        double dArg = arg() * complex.re;
        return set(MoreMath.cos(dArg) * dPow3, dPow3 * MoreMath.sin(dArg));
    }

    public Complex set(double d10, double d11) {
        this.re = d10;
        this.im = d11;
        return this;
    }

    public final Complex sin() {
        if (this.im == 0.0d) {
            return set(MoreMath.sin(this.re), 0.0d);
        }
        return set(Math.cosh(this.im) * MoreMath.sin(this.re), Math.sinh(this.im) * MoreMath.cos(this.re));
    }

    public final Complex sinh() {
        return this.im == 0.0d ? set(Math.sinh(this.re), 0.0d) : swap().sin().swap();
    }

    public final Complex sqrt() {
        if (this.im == 0.0d) {
            double d10 = this.re;
            if (d10 >= 0.0d) {
                set(Math.sqrt(d10), 0.0d);
                return this;
            }
            set(0.0d, Math.sqrt(-d10));
            return this;
        }
        double dSqrt = Math.sqrt((abs() + Math.abs(this.re)) / 2.0d);
        if (this.re >= 0.0d) {
            set(dSqrt, this.im / (dSqrt + dSqrt));
            return this;
        }
        double dAbs = Math.abs(this.im) / (dSqrt + dSqrt);
        if (this.im < 0.0d) {
            dSqrt = -dSqrt;
        }
        set(dAbs, dSqrt);
        return this;
    }

    public final Complex square() {
        double d10 = this.re;
        double d11 = this.im;
        return set((d10 * d10) - (d11 * d11), d10 * 2.0d * d11);
    }

    public final Complex sub(Complex complex) {
        double dUlp = Math.ulp(this.re);
        double d10 = this.re - complex.re;
        this.re = d10;
        this.im -= complex.im;
        if (Math.abs(d10) < dUlp * 1024.0d) {
            this.re = 0.0d;
        }
        return this;
    }

    public final Complex tan() {
        double d10 = this.im;
        if (d10 == 0.0d) {
            return set(MoreMath.tan(this.re), 0.0d);
        }
        double d11 = this.re;
        double d12 = d11 + d11;
        double d13 = d10 + d10;
        double dCosh = Math.cosh(d13) + MoreMath.cos(d12);
        return set(MoreMath.sin(d12) / dCosh, Math.sinh(d13) / dCosh);
    }

    public final Complex tanh() {
        return this.im == 0.0d ? set(Math.tanh(this.re), 0.0d) : swap().tan().swap();
    }

    public String toString() {
        StringBuilder sb2;
        if (this.im == 0.0d) {
            sb2 = new StringBuilder("");
            sb2.append(this.re);
        } else {
            sb2 = new StringBuilder("(");
            sb2.append(this.re);
            sb2.append(j.f68738d);
            sb2.append(this.im);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public Complex(double d10, double d11) {
        set(d10, d11);
    }

    public final Complex mul(Complex complex) {
        double d10 = this.re;
        double d11 = this.im;
        double d12 = complex.re;
        double d13 = complex.im;
        if (d11 == 0.0d && d13 == 0.0d) {
            return set(d10 * d12, 0.0d);
        }
        double d14 = (d10 * d12) - (d11 * d13);
        double d15 = (d11 * d12) + (d10 * d13);
        if (!set(d14, d15).isNaN()) {
            return this;
        }
        if (set(d10, d11).isInfinite()) {
            normalizeInfinity();
            d10 = this.re;
            d11 = this.im;
        }
        if (complex.isInfinite()) {
            set(d12, d13).normalizeInfinity();
            d12 = this.re;
            d13 = this.im;
        }
        if (d11 == 0.0d) {
            if (d13 == 0.0d) {
                return set(d10 * d12, 0.0d);
            }
            if (d12 == 0.0d) {
                return set(0.0d, d10 * d13);
            }
            return set(d12 * d10, d10 * d13);
        }
        if (d10 == 0.0d) {
            if (d12 == 0.0d) {
                return set((-d11) * d13, 0.0d);
            }
            if (d13 == 0.0d) {
                return set(0.0d, d11 * d12);
            }
            return set((-d11) * d13, d11 * d12);
        }
        if (d13 == 0.0d) {
            return set(d10 * d12, d11 * d12);
        }
        if (d12 == 0.0d) {
            return set((-d11) * d13, d10 * d13);
        }
        return set(d14, d15);
    }

    public Complex set(Complex complex) {
        this.re = complex.re;
        this.im = complex.im;
        return this;
    }

    public Complex(Complex complex) {
        set(complex);
    }
}
