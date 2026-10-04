package s0;

/* JADX INFO: renamed from: s0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5561c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f238001a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f238002b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f238003c = 2;

    /* JADX INFO: renamed from: s0.c$a */
    public static class a extends AbstractC5561c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f238004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double[] f238005e;

        public a(double d10, double[] dArr) {
            this.f238004d = d10;
            this.f238005e = dArr;
        }

        @Override // s0.AbstractC5561c
        public double c(double d10, int i10) {
            return this.f238005e[i10];
        }

        @Override // s0.AbstractC5561c
        public void d(double d10, double[] dArr) {
            double[] dArr2 = this.f238005e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // s0.AbstractC5561c
        public void e(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f238005e;
                if (i10 >= dArr.length) {
                    return;
                }
                fArr[i10] = (float) dArr[i10];
                i10++;
            }
        }

        @Override // s0.AbstractC5561c
        public double f(double d10, int i10) {
            return 0.0d;
        }

        @Override // s0.AbstractC5561c
        public void g(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f238005e.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        @Override // s0.AbstractC5561c
        public double[] h() {
            return new double[]{this.f238004d};
        }
    }

    public static AbstractC5561c a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        return i10 != 0 ? i10 != 2 ? new k(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new l(dArr, dArr2);
    }

    public static AbstractC5561c b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C5560b(iArr, dArr, dArr2);
    }

    public abstract double c(double d10, int i10);

    public abstract void d(double d10, double[] dArr);

    public abstract void e(double d10, float[] fArr);

    public abstract double f(double d10, int i10);

    public abstract void g(double d10, double[] dArr);

    public abstract double[] h();
}
