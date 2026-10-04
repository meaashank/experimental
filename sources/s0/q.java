package s0;

/* JADX INFO: loaded from: classes.dex */
public class q implements s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final double f238141l = Double.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f238144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f238145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f238146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f238147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f238148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f238149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f238150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f238151j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f238142a = 0.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f238143b = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f238152k = 0;

    @Override // s0.s
    public float a() {
        return 0.0f;
    }

    @Override // s0.s
    public float b(float f10) {
        return this.f238149h;
    }

    @Override // s0.s
    public String c(String str, float f10) {
        return null;
    }

    public final void d(double d10) {
        double d11 = this.f238144c;
        double d12 = this.f238142a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.f238150i)) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / ((double) iSqrt);
        int i10 = 0;
        while (i10 < iSqrt) {
            float f10 = this.f238148g;
            double d14 = this.f238145d;
            float f11 = this.f238149h;
            double d15 = d11;
            double d16 = ((-d11) * (((double) f10) - d14)) - (((double) f11) * d12);
            float f12 = this.f238150i;
            double d17 = d12;
            double d18 = (((d16 / ((double) f12)) * d13) / 2.0d) + ((double) f11);
            double d19 = ((((-((((d13 * d18) / 2.0d) + ((double) f10)) - d14)) * d15) - (d18 * d17)) / ((double) f12)) * d13;
            float f13 = (float) (((double) f11) + d19);
            this.f238149h = f13;
            float f14 = (float) ((((d19 / 2.0d) + ((double) f11)) * d13) + ((double) f10));
            this.f238148g = f14;
            int i11 = this.f238152k;
            if (i11 > 0) {
                if (f14 < 0.0f && (i11 & 1) == 1) {
                    this.f238148g = -f14;
                    this.f238149h = -f13;
                }
                float f15 = this.f238148g;
                if (f15 > 1.0f && (i11 & 2) == 2) {
                    this.f238148g = 2.0f - f15;
                    this.f238149h = -this.f238149h;
                }
            }
            i10++;
            d11 = d15;
            d12 = d17;
        }
    }

    public float e() {
        double d10 = this.f238144c;
        return ((float) (((-d10) * (((double) this.f238148g) - this.f238145d)) - (this.f238142a * ((double) this.f238149h)))) / this.f238150i;
    }

    @Override // s0.s
    public boolean e0() {
        double d10 = ((double) this.f238148g) - this.f238145d;
        double d11 = this.f238144c;
        double d12 = this.f238149h;
        return Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * ((double) this.f238150i))) / d11) <= ((double) this.f238151j);
    }

    public void f(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    public void g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        this.f238145d = f11;
        this.f238142a = f15;
        this.f238143b = false;
        this.f238148g = f10;
        this.f238146e = f12;
        this.f238144c = f14;
        this.f238150i = f13;
        this.f238151j = f16;
        this.f238152k = i10;
        this.f238147f = 0.0f;
    }

    @Override // s0.s
    public float getInterpolation(float f10) {
        d(f10 - this.f238147f);
        this.f238147f = f10;
        return this.f238148g;
    }
}
