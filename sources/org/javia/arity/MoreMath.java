package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
class MoreMath {
    private static final double LOG2E = 1.4426950408889634d;
    static final double[] GAMMA = {57.15623566586292d, -59.59796035547549d, 14.136097974741746d, -0.4919138160976202d, 3.399464998481189E-5d, 4.652362892704858E-5d, -9.837447530487956E-5d, 1.580887032249125E-4d, -2.1026444172410488E-4d, 2.1743961811521265E-4d, -1.643181065367639E-4d, 8.441822398385275E-5d, -2.6190838401581408E-5d, 3.6899182659531625E-6d};
    static final double[] FACT = {1.0d, 40320.0d, 2.0922789888E13d, 6.204484017332394E23d, 2.631308369336935E35d, 8.159152832478977E47d, 1.2413915592536073E61d, 7.109985878048635E74d, 1.2688693218588417E89d, 6.1234458376886085E103d, 7.156945704626381E118d, 1.8548264225739844E134d, 9.916779348709496E149d, 1.0299016745145628E166d, 1.974506857221074E182d, 6.689502913449127E198d, 3.856204823625804E215d, 3.659042881952549E232d, 5.5502938327393044E249d, 1.3113358856834524E267d, 4.7147236359920616E284d, 2.5260757449731984E302d};

    public static final double acosh(double d10) {
        return Math.log((d10 + d10) - (1.0d / (Math.sqrt((d10 * d10) - 1.0d) + d10)));
    }

    public static final double asinh(double d10) {
        if (d10 < 0.0d) {
            return -asinh(-d10);
        }
        return Math.log((1.0d / (Math.sqrt((d10 * d10) + 1.0d) + d10)) + d10 + d10);
    }

    public static final double atanh(double d10) {
        return d10 < 0.0d ? -atanh(-d10) : Math.log(((d10 + d10) / (1.0d - d10)) + 1.0d) * 0.5d;
    }

    public static final double combinations(double d10, double d11) {
        if (d10 < 0.0d || d11 < 0.0d) {
            return Double.NaN;
        }
        if (d10 < d11) {
            return 0.0d;
        }
        if (Math.floor(d10) != d10 || Math.floor(d11) != d11) {
            return Math.exp((lgamma(d10) - lgamma(d11)) - lgamma(d10 - d11));
        }
        double dMin = Math.min(d11, d10 - d11);
        if (d10 <= 170.0d && 12.0d < dMin && dMin <= 170.0d) {
            return (factorial(d10) / factorial(dMin)) / factorial(d10 - dMin);
        }
        double d12 = d10 - dMin;
        double d13 = 1.0d;
        while (dMin > 0.5d && d13 < Double.POSITIVE_INFINITY) {
            d13 *= (d12 + dMin) / dMin;
            dMin -= 1.0d;
        }
        return d13;
    }

    public static final double cos(double d10) {
        if (isPiMultiple(d10 - 1.5707963267948966d)) {
            return 0.0d;
        }
        return Math.cos(d10);
    }

    public static final double factorial(double d10) {
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        if (d10 < 0.0d) {
            return Double.NaN;
        }
        if (d10 <= 170.0d && Math.floor(d10) == d10) {
            int i10 = (int) d10;
            switch (i10 & 7) {
                case 0:
                    return FACT[i10 >> 3];
                case 1:
                    return FACT[i10 >> 3] * d10;
                case 2:
                    d11 = d10;
                    d10 *= d11 - 1.0d;
                    return FACT[i10 >> 3] * d10;
                case 3:
                    d12 = d10;
                    d11 = d12 - 1.0d;
                    d10 *= d11;
                    d10 *= d11 - 1.0d;
                    return FACT[i10 >> 3] * d10;
                case 4:
                    d13 = d10;
                    d12 = d13 - 1.0d;
                    d10 *= d12;
                    d11 = d12 - 1.0d;
                    d10 *= d11;
                    d10 *= d11 - 1.0d;
                    return FACT[i10 >> 3] * d10;
                case 5:
                    d14 = d10;
                    d13 = d14 - 1.0d;
                    d10 *= d13;
                    d12 = d13 - 1.0d;
                    d10 *= d12;
                    d11 = d12 - 1.0d;
                    d10 *= d11;
                    d10 *= d11 - 1.0d;
                    return FACT[i10 >> 3] * d10;
                case 6:
                    d15 = d10;
                    d14 = d15 - 1.0d;
                    d10 *= d14;
                    d13 = d14 - 1.0d;
                    d10 *= d13;
                    d12 = d13 - 1.0d;
                    d10 *= d12;
                    d11 = d12 - 1.0d;
                    d10 *= d11;
                    d10 *= d11 - 1.0d;
                    return FACT[i10 >> 3] * d10;
                case 7:
                    d15 = d10 - 1.0d;
                    d10 *= d15;
                    d14 = d15 - 1.0d;
                    d10 *= d14;
                    d13 = d14 - 1.0d;
                    d10 *= d13;
                    d12 = d13 - 1.0d;
                    d10 *= d12;
                    d11 = d12 - 1.0d;
                    d10 *= d11;
                    d10 *= d11 - 1.0d;
                    return FACT[i10 >> 3] * d10;
            }
        }
        return Math.exp(lgamma(d10));
    }

    public static final double gcd(double d10, double d11) {
        if (Double.isNaN(d10) || Double.isNaN(d11) || Double.isInfinite(d10) || Double.isInfinite(d11)) {
            return Double.NaN;
        }
        double dAbs = Math.abs(d10);
        double dAbs2 = Math.abs(d11);
        while (dAbs < 1.0E15d * dAbs2) {
            double d12 = dAbs2;
            dAbs2 = dAbs % dAbs2;
            dAbs = d12;
        }
        return dAbs;
    }

    public static final double intExp10(int i10) {
        return Double.parseDouble("1E" + i10);
    }

    public static final int intLog10(double d10) {
        return (int) Math.floor(Math.log10(d10));
    }

    private static final boolean isPiMultiple(double d10) {
        double d11 = d10 / 3.141592653589793d;
        return d11 == Math.floor(d11);
    }

    public static final double lgamma(double d10) {
        double d11 = 5.2421875d + d10;
        double d12 = 0.9999999999999971d;
        int i10 = 0;
        while (true) {
            double[] dArr = GAMMA;
            if (i10 >= dArr.length) {
                return ((Math.log(d11) * (d11 - 4.7421875d)) + (Math.log(d12) + 0.9189385332046728d)) - d11;
            }
            d10 += 1.0d;
            d12 += dArr[i10] / d10;
            i10++;
        }
    }

    public static final double log2(double d10) {
        return Math.log(d10) * LOG2E;
    }

    public static final double permutations(double d10, double d11) {
        if (d10 < 0.0d || d11 < 0.0d) {
            return Double.NaN;
        }
        if (d10 < d11) {
            return 0.0d;
        }
        if (Math.floor(d10) != d10 || Math.floor(d11) != d11) {
            return Math.exp(lgamma(d10) - lgamma(d10 - d11));
        }
        if (d10 <= 170.0d && 10.0d < d11 && d11 <= 170.0d) {
            return factorial(d10) / factorial(d10 - d11);
        }
        double d12 = (d10 - d11) + 0.5d;
        double d13 = 1.0d;
        while (d10 > d12 && d13 < Double.POSITIVE_INFINITY) {
            d13 *= d10;
            d10 -= 1.0d;
        }
        return d13;
    }

    public static final double sin(double d10) {
        if (isPiMultiple(d10)) {
            return 0.0d;
        }
        return Math.sin(d10);
    }

    public static final double tan(double d10) {
        if (isPiMultiple(d10)) {
            return 0.0d;
        }
        return Math.tan(d10);
    }

    public static final double trunc(double d10) {
        return d10 >= 0.0d ? Math.floor(d10) : Math.ceil(d10);
    }
}
