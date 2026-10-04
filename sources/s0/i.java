package s0;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p0.C5382f;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f238042h = "KeyCycleOscillator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC5561c f238043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f238044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f238045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f238046d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f238047e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f238048f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<g> f238049g = new ArrayList<>();

    public class a implements Comparator<g> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            return Integer.compare(gVar.f238073a, gVar2.f238073a);
        }
    }

    public static class b extends i {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f238051i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f238052j;

        public b(String str) {
            this.f238051i = str;
            this.f238052j = z.a(str);
        }

        @Override // s0.i
        public void h(C5382f c5382f, float f10) {
            c5382f.b(this.f238052j, a(f10));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f238053q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f238054r = "CycleOscillator";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f238055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m f238056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f238057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f238058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f238059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float[] f238060f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double[] f238061g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float[] f238062h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f238063i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float[] f238064j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float[] f238065k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f238066l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public AbstractC5561c f238067m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public double[] f238068n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double[] f238069o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f238070p;

        public c(int i10, String str, int i11, int i12) {
            m mVar = new m();
            this.f238056b = mVar;
            this.f238057c = 0;
            this.f238058d = 1;
            this.f238059e = 2;
            this.f238066l = i10;
            this.f238055a = i11;
            mVar.g(i10, str);
            this.f238060f = new float[i12];
            this.f238061g = new double[i12];
            this.f238062h = new float[i12];
            this.f238063i = new float[i12];
            this.f238064j = new float[i12];
            this.f238065k = new float[i12];
        }

        public double a() {
            return this.f238068n[1];
        }

        public double b(float f10) {
            AbstractC5561c abstractC5561c = this.f238067m;
            if (abstractC5561c != null) {
                double d10 = f10;
                abstractC5561c.g(d10, this.f238069o);
                this.f238067m.d(d10, this.f238068n);
            } else {
                double[] dArr = this.f238069o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d11 = f10;
            double dE = this.f238056b.e(d11, this.f238068n[1]);
            double d12 = this.f238056b.d(d11, this.f238068n[1], this.f238069o[1]);
            double[] dArr2 = this.f238069o;
            return (d12 * this.f238068n[2]) + (dE * dArr2[2]) + dArr2[0];
        }

        public double c(float f10) {
            AbstractC5561c abstractC5561c = this.f238067m;
            if (abstractC5561c != null) {
                abstractC5561c.d(f10, this.f238068n);
            } else {
                double[] dArr = this.f238068n;
                dArr[0] = this.f238063i[0];
                dArr[1] = this.f238064j[0];
                dArr[2] = this.f238060f[0];
            }
            double[] dArr2 = this.f238068n;
            return (this.f238056b.e(f10, dArr2[1]) * this.f238068n[2]) + dArr2[0];
        }

        public void d(int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f238061g[i10] = ((double) i11) / 100.0d;
            this.f238062h[i10] = f10;
            this.f238063i[i10] = f11;
            this.f238064j[i10] = f12;
            this.f238060f[i10] = f13;
        }

        public void e(float f10) {
            this.f238070p = f10;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f238061g.length, 3);
            float[] fArr = this.f238060f;
            this.f238068n = new double[fArr.length + 2];
            this.f238069o = new double[fArr.length + 2];
            if (this.f238061g[0] > 0.0d) {
                this.f238056b.a(0.0d, this.f238062h[0]);
            }
            double[] dArr2 = this.f238061g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f238056b.a(1.0d, this.f238062h[length]);
            }
            for (int i10 = 0; i10 < dArr.length; i10++) {
                double[] dArr3 = dArr[i10];
                dArr3[0] = this.f238063i[i10];
                dArr3[1] = this.f238064j[i10];
                dArr3[2] = this.f238060f[i10];
                this.f238056b.a(this.f238061g[i10], this.f238062h[i10]);
            }
            this.f238056b.f();
            double[] dArr4 = this.f238061g;
            if (dArr4.length > 1) {
                this.f238067m = AbstractC5561c.a(0, dArr4, dArr);
            } else {
                this.f238067m = null;
            }
        }
    }

    public static class d {
        public static int a(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, i13, i11);
            return i13;
        }

        public static void b(int[] iArr, float[] fArr, int i10, int i11) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i11;
            iArr2[1] = i10;
            int i12 = 2;
            while (i12 > 0) {
                int i13 = iArr2[i12 - 1];
                int i14 = i12 - 2;
                int i15 = iArr2[i14];
                if (i13 < i15) {
                    int iA = a(iArr, fArr, i13, i15);
                    iArr2[i14] = iA - 1;
                    iArr2[i12 - 1] = i13;
                    int i16 = i12 + 1;
                    iArr2[i12] = i15;
                    i12 += 2;
                    iArr2[i16] = iA + 1;
                } else {
                    i12 = i14;
                }
            }
        }

        public static void c(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
        }
    }

    public static class e {
        public static int a(int[] iArr, float[] fArr, float[] fArr2, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, fArr2, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, fArr2, i13, i11);
            return i13;
        }

        public static void b(int[] iArr, float[] fArr, float[] fArr2, int i10, int i11) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i11;
            iArr2[1] = i10;
            int i12 = 2;
            while (i12 > 0) {
                int i13 = iArr2[i12 - 1];
                int i14 = i12 - 2;
                int i15 = iArr2[i14];
                if (i13 < i15) {
                    int iA = a(iArr, fArr, fArr2, i13, i15);
                    iArr2[i14] = iA - 1;
                    iArr2[i12 - 1] = i13;
                    int i16 = i12 + 1;
                    iArr2[i12] = i15;
                    i12 += 2;
                    iArr2[i16] = iA + 1;
                } else {
                    i12 = i14;
                }
            }
        }

        public static void c(int[] iArr, float[] fArr, float[] fArr2, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
            float f11 = fArr2[i10];
            fArr2[i10] = fArr2[i11];
            fArr2[i11] = f11;
        }
    }

    public static class f extends i {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f238071i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f238072j;

        public f(String str) {
            this.f238071i = str;
            this.f238072j = z.a(str);
        }

        @Override // s0.i
        public void h(C5382f c5382f, float f10) {
            c5382f.b(this.f238072j, a(f10));
        }

        public void l(C5382f c5382f, float f10, double d10, double d11) {
            c5382f.R(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f238073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f238074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f238075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f238076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f238077e;

        public g(int i10, float f10, float f11, float f12, float f13) {
            this.f238073a = i10;
            this.f238074b = f13;
            this.f238075c = f11;
            this.f238076d = f10;
            this.f238077e = f12;
        }
    }

    public static i d(String str) {
        return str.equals("pathRotate") ? new f(str) : new b(str);
    }

    public float a(float f10) {
        return (float) this.f238044b.c(f10);
    }

    public AbstractC5561c b() {
        return this.f238043a;
    }

    public float c(float f10) {
        return (float) this.f238044b.b(f10);
    }

    public void f(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13) {
        this.f238049g.add(new g(i10, f10, f11, f12, f13));
        if (i12 != -1) {
            this.f238048f = i12;
        }
        this.f238046d = i11;
        this.f238047e = str;
    }

    public void g(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13, Object obj) {
        this.f238049g.add(new g(i10, f10, f11, f12, f13));
        if (i12 != -1) {
            this.f238048f = i12;
        }
        this.f238046d = i11;
        e(obj);
        this.f238047e = str;
    }

    public void i(String str) {
        this.f238045c = str;
    }

    public void j(float f10) {
        int size = this.f238049g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f238049g, new a());
        double[] dArr = new double[size];
        char c10 = 2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f238044b = new c(this.f238046d, this.f238047e, this.f238048f, size);
        ArrayList<g> arrayList = this.f238049g;
        int size2 = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size2) {
            int i12 = i10 + 1;
            g gVar = arrayList.get(i10);
            float f11 = gVar.f238076d;
            dArr[i11] = ((double) f11) * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f12 = gVar.f238074b;
            dArr3[0] = f12;
            float f13 = gVar.f238075c;
            char c11 = c10;
            dArr3[1] = f13;
            float f14 = gVar.f238077e;
            dArr3[c11] = f14;
            this.f238044b.d(i11, gVar.f238073a, f11, f13, f14, f12);
            i11++;
            i10 = i12;
            c10 = c11;
            dArr2 = dArr2;
        }
        this.f238044b.e(f10);
        this.f238043a = AbstractC5561c.a(0, dArr, dArr2);
    }

    public boolean k() {
        return this.f238048f == 1;
    }

    public String toString() {
        String string = this.f238045c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList<g> arrayList = this.f238049g;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            g gVar = arrayList.get(i10);
            i10++;
            StringBuilder sbA = android.support.v4.media.f.a(string, "[");
            sbA.append(gVar.f238073a);
            sbA.append(" , ");
            sbA.append(decimalFormat.format(r5.f238074b));
            sbA.append("] ");
            string = sbA.toString();
        }
        return string;
    }

    public void e(Object obj) {
    }

    public void h(C5382f c5382f, float f10) {
    }
}
