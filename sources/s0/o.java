package s0;

/* JADX INFO: loaded from: classes.dex */
public class o extends C5563e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f238123s = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f238124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f238125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f238126r;

    public o(String str) {
        this.f238020a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f238124p = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i10 = iIndexOf2 + 1;
        this.f238125q = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    @Override // s0.C5563e
    public double a(double d10) {
        return e(d10);
    }

    @Override // s0.C5563e
    public double b(double d10) {
        return d(d10);
    }

    public final double d(double d10) {
        double d11;
        double dA;
        double d12 = this.f238125q;
        if (d10 < d12) {
            double d13 = this.f238124p;
            d11 = d13 * d12 * d12;
            dA = (((d12 - d10) * d13) + d10) * C5559a.a(d12, d10, d13, d10);
        } else {
            double d14 = this.f238124p;
            d11 = (d12 - 1.0d) * (d12 - 1.0d) * d14;
            dA = ((((d12 - d10) * (-d14)) - d10) + 1.0d) * ((((d12 - d10) * (-d14)) - d10) + 1.0d);
        }
        return d11 / dA;
    }

    public final double e(double d10) {
        double d11 = this.f238125q;
        if (d10 < d11) {
            return (d11 * d10) / (((d11 - d10) * this.f238124p) + d10);
        }
        return ((d10 - 1.0d) * (1.0d - d11)) / ((1.0d - d10) - ((d11 - d10) * this.f238124p));
    }
}
