package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static I f85359d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f85360e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f85361f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f85362g = 0.017453292f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f85363h = 9.0E-4f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f85364i = -0.10471976f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f85365j = 0.0334196f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f85366k = 3.49066E-4f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f85367l = 5.236E-6f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f85368m = 0.4092797f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f85369n = 946728000000L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f85370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85372c;

    public static I b() {
        if (f85359d == null) {
            f85359d = new I();
        }
        return f85359d;
    }

    public void a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * ((j10 - f85369n) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d11) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d13 = 0.01745329238474369d * d10;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d13))) / (Math.cos(dAsin) * Math.cos(d13));
        if (dSin3 >= 1.0d) {
            this.f85372c = 1;
            this.f85370a = -1L;
            this.f85371b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f85372c = 0;
                this.f85370a = -1L;
                this.f85371b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f85370a = Math.round((dSin2 + dAcos) * 8.64E7d) + f85369n;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + f85369n;
            this.f85371b = jRound;
            if (jRound >= j10 || this.f85370a <= j10) {
                this.f85372c = 1;
            } else {
                this.f85372c = 0;
            }
        }
    }
}
