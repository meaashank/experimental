package s0;

import java.util.Arrays;

/* JADX INFO: renamed from: s0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5563e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f238007c = "cubic(0.4, 0.0, 0.2, 1)";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f238008d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f238009e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f238010f = "cubic(1, 1, 0, 0)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f238011g = "cubic(0.36, 0, 0.66, -0.56)";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f238012h = "cubic(0.34, 1.56, 0.64, 1)";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f238017m = "anticipate";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f238018n = "overshoot";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f238020a = "identity";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C5563e f238006b = new C5563e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f238015k = "standard";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f238014j = "accelerate";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f238013i = "decelerate";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f238016l = "linear";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String[] f238019o = {f238015k, f238014j, f238013i, f238016l};

    public static C5563e c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new r(str);
        }
        if (str.startsWith("Schlick")) {
            return new o(str);
        }
        switch (str) {
            case "accelerate":
                return new a(f238008d);
            case "decelerate":
                return new a(f238009e);
            case "anticipate":
                return new a(f238011g);
            case "linear":
                return new a(f238010f);
            case "overshoot":
                return new a(f238012h);
            case "standard":
                return new a(f238007c);
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f238019o));
                return f238006b;
        }
    }

    public double b(double d10) {
        return 1.0d;
    }

    public String toString() {
        return this.f238020a;
    }

    /* JADX INFO: renamed from: s0.e$a */
    public static class a extends C5563e {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static double f238021t = 0.01d;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static double f238022u = 1.0E-4d;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public double f238023p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public double f238024q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public double f238025r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public double f238026s;

        public a(String str) {
            this.f238020a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f238023p = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i10 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i10);
            this.f238024q = Double.parseDouble(str.substring(i10, iIndexOf3).trim());
            int i11 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i11);
            this.f238025r = Double.parseDouble(str.substring(i11, iIndexOf4).trim());
            int i12 = iIndexOf4 + 1;
            this.f238026s = Double.parseDouble(str.substring(i12, str.indexOf(41, i12)).trim());
        }

        @Override // s0.C5563e
        public double a(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > f238021t) {
                d11 *= 0.5d;
                d12 = f(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double dF = f(d13);
            double d14 = d12 + d11;
            double dF2 = f(d14);
            double dG = g(d13);
            return (((d10 - dF) * (g(d14) - dG)) / (dF2 - dF)) + dG;
        }

        @Override // s0.C5563e
        public double b(double d10) {
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > f238022u) {
                d11 *= 0.5d;
                d12 = f(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double d14 = d12 + d11;
            return (g(d14) - g(d13)) / (f(d14) - f(d13));
        }

        public final double d(double d10) {
            double d11 = 1.0d - d10;
            double d12 = this.f238023p;
            double d13 = d11 * 3.0d * d11 * d12;
            double d14 = d11 * 6.0d * d10;
            double d15 = this.f238025r;
            return C5559a.a(1.0d, d15, 3.0d * d10 * d10, C5559a.a(d15, d12, d14, d13));
        }

        public final double e(double d10) {
            double d11 = 1.0d - d10;
            double d12 = this.f238024q;
            double d13 = d11 * 3.0d * d11 * d12;
            double d14 = d11 * 6.0d * d10;
            double d15 = this.f238026s;
            return C5559a.a(1.0d, d15, 3.0d * d10 * d10, C5559a.a(d15, d12, d14, d13));
        }

        public final double f(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            double d13 = d11 * d12 * d10;
            double d14 = d12 * d10 * d10;
            return (this.f238025r * d14) + (this.f238023p * d13) + (d10 * d10 * d10);
        }

        public final double g(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            double d13 = d11 * d12 * d10;
            double d14 = d12 * d10 * d10;
            return (this.f238026s * d14) + (this.f238024q * d13) + (d10 * d10 * d10);
        }

        public void h(double d10, double d11, double d12, double d13) {
            this.f238023p = d10;
            this.f238024q = d11;
            this.f238025r = d12;
            this.f238026s = d13;
        }

        public a(double d10, double d11, double d12, double d13) {
            h(d10, d11, d12, d13);
        }
    }

    public double a(double d10) {
        return d10;
    }
}
