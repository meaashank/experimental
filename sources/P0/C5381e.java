package p0;

import W3.o;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import i.C4541d;
import java.util.Arrays;
import java.util.HashMap;
import p0.C5382f;
import q0.C5415e;
import s0.C5563e;

/* JADX INFO: renamed from: p0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5381e implements Comparable<C5381e> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f226258A = 4;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f226259B = 5;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f226260C = 1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f226261D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f226262E = 2;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static String[] f226263F = {o.f76584m, "x", "y", InMobiNetworkValues.WIDTH, InMobiNetworkValues.HEIGHT, "pathRotate"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f226264t = "MotionPaths";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f226265u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f226266v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f226267w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f226268x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f226269y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f226270z = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5563e f226271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f226272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f226273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f226274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f226275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f226276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f226277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f226278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f226279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f226280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f226281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f226282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f226283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C5379c f226284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap<String, C5378b> f226285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f226286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f226287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double[] f226288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double[] f226289s;

    public C5381e() {
        this.f226272b = 0;
        this.f226279i = Float.NaN;
        this.f226280j = Float.NaN;
        this.f226281k = -1;
        this.f226282l = -1;
        this.f226283m = Float.NaN;
        this.f226284n = null;
        this.f226285o = new HashMap<>();
        this.f226286p = 0;
        this.f226288r = new double[18];
        this.f226289s = new double[18];
    }

    public static final float y(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (((f14 - f12) * f11) - ((f15 - f13) * f10)) + f12;
    }

    public static final float z(float f10, float f11, float f12, float f13, float f14, float f15) {
        return ((f15 - f13) * f11) + ((f14 - f12) * f10) + f13;
    }

    public void a(C5382f c5382f) {
        this.f226271a = C5563e.c(c5382f.f226312i.f226321c);
        C5382f.a aVar = c5382f.f226312i;
        this.f226281k = aVar.f226322d;
        this.f226282l = aVar.f226319a;
        this.f226279i = aVar.f226326h;
        this.f226272b = aVar.f226323e;
        this.f226287q = aVar.f226320b;
        this.f226280j = c5382f.f226313j.f226335d;
        this.f226283m = 0.0f;
        for (String str : c5382f.j()) {
            C5378b c5378bI = c5382f.i(str);
            if (c5378bI != null && c5378bI.q()) {
                this.f226285o.put(str, c5378bI);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5381e c5381e) {
        return Float.compare(this.f226274d, c5381e.f226274d);
    }

    public void c(C5379c c5379c) {
        c5379c.F(this.f226280j);
    }

    public final boolean d(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void e(C5381e c5381e, boolean[] zArr, String[] strArr, boolean z10) {
        boolean zD = d(this.f226275e, c5381e.f226275e);
        boolean zD2 = d(this.f226276f, c5381e.f226276f);
        zArr[0] = zArr[0] | d(this.f226274d, c5381e.f226274d);
        boolean z11 = zD | zD2 | z10;
        zArr[1] = zArr[1] | z11;
        zArr[2] = z11 | zArr[2];
        zArr[3] = zArr[3] | d(this.f226277g, c5381e.f226277g);
        zArr[4] = d(this.f226278h, c5381e.f226278h) | zArr[4];
    }

    public void f(double[] dArr, int[] iArr) {
        float[] fArr = {this.f226274d, this.f226275e, this.f226276f, this.f226277g, this.f226278h, this.f226279i};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = fArr[r1];
                i10++;
            }
        }
    }

    public void g(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f226277g;
        float f11 = this.f226278h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
    }

    public void h(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f226275e;
        float fCos = this.f226276f;
        float f10 = this.f226277g;
        float f11 = this.f226278h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        C5379c c5379c = this.f226284n;
        if (c5379c != null) {
            float[] fArr2 = new float[2];
            c5379c.r(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (Math.cos(d13) * d12)) - ((double) (f11 / 2.0f)));
        }
        fArr[i10] = (f10 / 2.0f) + fSin + 0.0f;
        fArr[i10 + 1] = (f11 / 2.0f) + fCos + 0.0f;
    }

    public void i(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        float fSin = this.f226275e;
        float fCos = this.f226276f;
        float f11 = this.f226277g;
        float f12 = this.f226278h;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f17 = (float) dArr[i10];
            float f18 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                fSin = f17;
                f13 = f18;
            } else if (i11 == 2) {
                fCos = f17;
                f15 = f18;
            } else if (i11 == 3) {
                f11 = f17;
                f14 = f18;
            } else if (i11 == 4) {
                f12 = f17;
                f16 = f18;
            }
        }
        float f19 = (f14 / 2.0f) + f13;
        float fSin2 = (f16 / 2.0f) + f15;
        C5379c c5379c = this.f226284n;
        if (c5379c != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            c5379c.r(d10, fArr3, fArr4);
            float f20 = fArr3[0];
            float f21 = fArr3[1];
            float f22 = fArr4[0];
            float f23 = fArr4[1];
            f10 = 2.0f;
            double d11 = fSin;
            double d12 = fCos;
            fSin = (float) (((Math.sin(d12) * d11) + ((double) f20)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f21) - (Math.cos(d12) * d11)) - ((double) (f12 / 2.0f)));
            double d13 = f13;
            double dSin = (Math.sin(d12) * d13) + ((double) f22);
            double d14 = f15;
            float fCos2 = (float) ((Math.cos(d12) * d14) + dSin);
            fSin2 = (float) ((Math.sin(d12) * d14) + (((double) f23) - (Math.cos(d12) * d13)));
            f19 = fCos2;
        } else {
            f10 = 2.0f;
        }
        fArr[0] = (f11 / f10) + fSin + 0.0f;
        fArr[1] = (f12 / f10) + fCos + 0.0f;
        fArr2[0] = f19;
        fArr2[1] = fSin2;
    }

    public void j(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f226275e;
        float fCos = this.f226276f;
        float f10 = this.f226277g;
        float f11 = this.f226278h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        C5379c c5379c = this.f226284n;
        if (c5379c != null) {
            float[] fArr2 = new float[2];
            c5379c.r(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (Math.cos(d13) * d12)) - ((double) (f11 / 2.0f)));
        }
        fArr[i10] = (f10 / 2.0f) + fSin + 0.0f;
        fArr[i10 + 1] = (f11 / 2.0f) + fCos + 0.0f;
    }

    public int k(String str, double[] dArr, int i10) {
        C5378b c5378b = this.f226285o.get(str);
        int i11 = 0;
        if (c5378b == null) {
            return 0;
        }
        if (c5378b.r() == 1) {
            dArr[i10] = c5378b.n();
            return 1;
        }
        int iR = c5378b.r();
        c5378b.o(new float[iR]);
        while (i11 < iR) {
            dArr[i10] = r2[i11];
            i11++;
            i10++;
        }
        return iR;
    }

    public int l(String str) {
        C5378b c5378b = this.f226285o.get(str);
        if (c5378b == null) {
            return 0;
        }
        return c5378b.r();
    }

    public void m(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f226275e;
        float fCos = this.f226276f;
        float f11 = this.f226277g;
        float f12 = this.f226278h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f13;
            } else if (i12 == 2) {
                fCos = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        C5379c c5379c = this.f226284n;
        if (c5379c != null) {
            float fS = c5379c.s();
            float fT = this.f226284n.t();
            double d10 = f10;
            double d11 = fCos;
            float fSin = (float) (((Math.sin(d11) * d10) + ((double) fS)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) fT) - (Math.cos(d11) * d10)) - ((double) (f12 / 2.0f)));
            f10 = fSin;
        }
        float f14 = f11 + f10;
        float f15 = f12 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f16 = f10 + 0.0f;
        float f17 = fCos + 0.0f;
        float f18 = f14 + 0.0f;
        float f19 = f15 + 0.0f;
        fArr[i10] = f16;
        fArr[i10 + 1] = f17;
        fArr[i10 + 2] = f18;
        fArr[i10 + 3] = f17;
        fArr[i10 + 4] = f18;
        fArr[i10 + 5] = f19;
        fArr[i10 + 6] = f16;
        fArr[i10 + 7] = f19;
    }

    public boolean n(String str) {
        return this.f226285o.containsKey(str);
    }

    public void p(C5415e c5415e, C5381e c5381e, C5381e c5381e2) {
        float f10 = c5415e.f226555h / 100.0f;
        this.f226273c = f10;
        this.f226272b = c5415e.f226621B;
        float f11 = Float.isNaN(c5415e.f226622C) ? f10 : c5415e.f226622C;
        float f12 = Float.isNaN(c5415e.f226623D) ? f10 : c5415e.f226623D;
        float f13 = c5381e2.f226277g;
        float f14 = c5381e.f226277g;
        float f15 = f13 - f14;
        float f16 = c5381e2.f226278h;
        float f17 = c5381e.f226278h;
        float f18 = f16 - f17;
        this.f226274d = this.f226273c;
        float f19 = c5381e.f226275e;
        float f20 = c5381e.f226276f;
        float f21 = f10;
        float f22 = ((f13 / 2.0f) + c5381e2.f226275e) - ((f14 / 2.0f) + f19);
        float f23 = ((f16 / 2.0f) + c5381e2.f226276f) - ((f17 / 2.0f) + f20);
        float f24 = (f15 * f11) / 2.0f;
        this.f226275e = (int) (((f22 * f21) + f19) - f24);
        float f25 = (f18 * f12) / 2.0f;
        this.f226276f = (int) (((f23 * f21) + f20) - f25);
        this.f226277g = (int) (f14 + r9);
        this.f226278h = (int) (f17 + r12);
        float f26 = Float.isNaN(c5415e.f226624E) ? f21 : c5415e.f226624E;
        float f27 = Float.isNaN(c5415e.f226627H) ? 0.0f : c5415e.f226627H;
        if (!Float.isNaN(c5415e.f226625F)) {
            f21 = c5415e.f226625F;
        }
        float f28 = Float.isNaN(c5415e.f226626G) ? 0.0f : c5415e.f226626G;
        this.f226286p = 0;
        this.f226275e = (int) (((f28 * f23) + ((f26 * f22) + c5381e.f226275e)) - f24);
        this.f226276f = (int) (((f23 * f21) + ((f22 * f27) + c5381e.f226276f)) - f25);
        this.f226271a = C5563e.c(c5415e.f226632z);
        this.f226281k = c5415e.f226620A;
    }

    public void r(C5415e c5415e, C5381e c5381e, C5381e c5381e2) {
        float f10 = c5415e.f226555h / 100.0f;
        this.f226273c = f10;
        this.f226272b = c5415e.f226621B;
        float f11 = Float.isNaN(c5415e.f226622C) ? f10 : c5415e.f226622C;
        float f12 = Float.isNaN(c5415e.f226623D) ? f10 : c5415e.f226623D;
        float f13 = c5381e2.f226277g - c5381e.f226277g;
        float f14 = c5381e2.f226278h - c5381e.f226278h;
        this.f226274d = this.f226273c;
        if (!Float.isNaN(c5415e.f226624E)) {
            f10 = c5415e.f226624E;
        }
        float f15 = c5381e.f226275e;
        float f16 = c5381e.f226277g;
        float f17 = c5381e.f226276f;
        float f18 = c5381e.f226278h;
        float f19 = f10;
        float f20 = ((c5381e2.f226277g / 2.0f) + c5381e2.f226275e) - ((f16 / 2.0f) + f15);
        float f21 = ((c5381e2.f226278h / 2.0f) + c5381e2.f226276f) - ((f18 / 2.0f) + f17);
        float f22 = f20 * f19;
        float f23 = (f13 * f11) / 2.0f;
        this.f226275e = (int) ((f15 + f22) - f23);
        float f24 = f21 * f19;
        float f25 = (f14 * f12) / 2.0f;
        this.f226276f = (int) ((f17 + f24) - f25);
        this.f226277g = (int) (f16 + r7);
        this.f226278h = (int) (f18 + r8);
        float f26 = Float.isNaN(c5415e.f226625F) ? 0.0f : c5415e.f226625F;
        this.f226286p = 1;
        float f27 = (int) ((c5381e.f226275e + f22) - f23);
        float f28 = (int) ((c5381e.f226276f + f24) - f25);
        this.f226275e = f27 + ((-f21) * f26);
        this.f226276f = f28 + (f20 * f26);
        this.f226282l = this.f226282l;
        this.f226271a = C5563e.c(c5415e.f226632z);
        this.f226281k = c5415e.f226620A;
    }

    public void s(int i10, int i11, C5415e c5415e, C5381e c5381e, C5381e c5381e2) {
        float fMin;
        float fA;
        float f10 = c5415e.f226555h / 100.0f;
        this.f226273c = f10;
        this.f226272b = c5415e.f226621B;
        this.f226286p = c5415e.f226628I;
        float f11 = Float.isNaN(c5415e.f226622C) ? f10 : c5415e.f226622C;
        float f12 = Float.isNaN(c5415e.f226623D) ? f10 : c5415e.f226623D;
        float f13 = c5381e2.f226277g;
        float f14 = c5381e.f226277g;
        float f15 = c5381e2.f226278h;
        float f16 = c5381e.f226278h;
        this.f226274d = this.f226273c;
        this.f226277g = (int) (((f13 - f14) * f11) + f14);
        this.f226278h = (int) (((f15 - f16) * f12) + f16);
        int i12 = c5415e.f226628I;
        if (i12 == 1) {
            float f17 = Float.isNaN(c5415e.f226624E) ? f10 : c5415e.f226624E;
            float f18 = c5381e2.f226275e;
            float f19 = c5381e.f226275e;
            this.f226275e = C4541d.a(f18, f19, f17, f19);
            if (!Float.isNaN(c5415e.f226625F)) {
                f10 = c5415e.f226625F;
            }
            float f20 = c5381e2.f226276f;
            float f21 = c5381e.f226276f;
            this.f226276f = C4541d.a(f20, f21, f10, f21);
        } else if (i12 != 2) {
            float f22 = Float.isNaN(c5415e.f226624E) ? f10 : c5415e.f226624E;
            float f23 = c5381e2.f226275e;
            float f24 = c5381e.f226275e;
            this.f226275e = C4541d.a(f23, f24, f22, f24);
            if (!Float.isNaN(c5415e.f226625F)) {
                f10 = c5415e.f226625F;
            }
            float f25 = c5381e2.f226276f;
            float f26 = c5381e.f226276f;
            this.f226276f = C4541d.a(f25, f26, f10, f26);
        } else {
            if (Float.isNaN(c5415e.f226624E)) {
                float f27 = c5381e2.f226275e;
                float f28 = c5381e.f226275e;
                fMin = C4541d.a(f27, f28, f10, f28);
            } else {
                fMin = Math.min(f12, f11) * c5415e.f226624E;
            }
            this.f226275e = fMin;
            if (Float.isNaN(c5415e.f226625F)) {
                float f29 = c5381e2.f226276f;
                float f30 = c5381e.f226276f;
                fA = C4541d.a(f29, f30, f10, f30);
            } else {
                fA = c5415e.f226625F;
            }
            this.f226276f = fA;
        }
        this.f226282l = c5381e.f226282l;
        this.f226271a = C5563e.c(c5415e.f226632z);
        this.f226281k = c5415e.f226620A;
    }

    public void t(int i10, int i11, C5415e c5415e, C5381e c5381e, C5381e c5381e2) {
        float f10 = c5415e.f226555h / 100.0f;
        this.f226273c = f10;
        this.f226272b = c5415e.f226621B;
        float f11 = Float.isNaN(c5415e.f226622C) ? f10 : c5415e.f226622C;
        float f12 = Float.isNaN(c5415e.f226623D) ? f10 : c5415e.f226623D;
        float f13 = c5381e2.f226277g;
        float f14 = f13 - c5381e.f226277g;
        float f15 = c5381e2.f226278h;
        float f16 = f15 - c5381e.f226278h;
        this.f226274d = this.f226273c;
        float f17 = c5381e.f226275e;
        float f18 = c5381e.f226276f;
        float f19 = (f13 / 2.0f) + c5381e2.f226275e;
        float f20 = (f15 / 2.0f) + c5381e2.f226276f;
        float f21 = f14 * f11;
        this.f226275e = (int) ((((f19 - ((r8 / 2.0f) + f17)) * f10) + f17) - (f21 / 2.0f));
        float f22 = f16 * f12;
        this.f226276f = (int) ((((f20 - ((r11 / 2.0f) + f18)) * f10) + f18) - (f22 / 2.0f));
        this.f226277g = (int) (r8 + f21);
        this.f226278h = (int) (r11 + f22);
        this.f226286p = 2;
        if (!Float.isNaN(c5415e.f226624E)) {
            this.f226275e = (int) (c5415e.f226624E * ((int) (i10 - this.f226277g)));
        }
        if (!Float.isNaN(c5415e.f226625F)) {
            this.f226276f = (int) (c5415e.f226625F * ((int) (i11 - this.f226278h)));
        }
        this.f226282l = this.f226282l;
        this.f226271a = C5563e.c(c5415e.f226632z);
        this.f226281k = c5415e.f226620A;
    }

    public void u(float f10, float f11, float f12, float f13) {
        this.f226275e = f10;
        this.f226276f = f11;
        this.f226277g = f12;
        this.f226278h = f13;
    }

    public void v(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (((f13 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
        fArr[1] = (((f15 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + 0.0f;
    }

    public void w(float f10, C5382f c5382f, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f11;
        float fSin = this.f226275e;
        float fCos = this.f226276f;
        float f12 = this.f226277g;
        float f13 = this.f226278h;
        if (iArr.length != 0 && this.f226288r.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.f226288r = new double[i10];
            this.f226289s = new double[i10];
        }
        Arrays.fill(this.f226288r, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.f226288r;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.f226289s[i12] = dArr2[i11];
        }
        float f14 = Float.NaN;
        int i13 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (true) {
            double[] dArr5 = this.f226288r;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f11 = f14;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f226288r[i13])) {
                    d10 = this.f226288r[i13] + d10;
                }
                f11 = f14;
                float f19 = (float) d10;
                float f20 = (float) this.f226289s[i13];
                if (i13 == 1) {
                    f14 = f11;
                    f15 = f20;
                    fSin = f19;
                } else if (i13 == 2) {
                    f14 = f11;
                    f16 = f20;
                    fCos = f19;
                } else if (i13 == 3) {
                    f14 = f11;
                    f17 = f20;
                    f12 = f19;
                } else if (i13 == 4) {
                    f14 = f11;
                    f18 = f20;
                    f13 = f19;
                } else if (i13 == 5) {
                    f14 = f19;
                }
                i13++;
            }
            f14 = f11;
            i13++;
        }
        float f21 = f14;
        C5379c c5379c = this.f226284n;
        if (c5379c != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            c5379c.r(f10, fArr, fArr2);
            float f22 = fArr[0];
            float f23 = fArr[1];
            float f24 = fArr2[0];
            float f25 = fArr2[1];
            double d11 = f22;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f12 / 2.0f)));
            fCos = (float) ((((double) f23) - (Math.cos(d13) * d12)) - ((double) (f13 / 2.0f)));
            double d14 = f24;
            double d15 = f15;
            double dSin = (Math.sin(d13) * d15) + d14;
            double dCos = Math.cos(d13) * d12;
            double d16 = f16;
            float f26 = (float) ((dCos * d16) + dSin);
            float fSin2 = (float) ((Math.sin(d13) * d12 * d16) + (((double) f25) - (Math.cos(d13) * d15)));
            if (dArr2.length >= 2) {
                dArr2[0] = f26;
                dArr2[1] = fSin2;
            }
            if (!Float.isNaN(f21)) {
                c5382f.R((float) (Math.toDegrees(Math.atan2(fSin2, f26)) + ((double) f21)));
            }
        } else if (!Float.isNaN(f21)) {
            c5382f.R((float) (Math.toDegrees(Math.atan2((f18 / 2.0f) + f16, (f17 / 2.0f) + f15)) + ((double) f21) + ((double) 0.0f)));
        }
        float f27 = fSin + 0.5f;
        float f28 = fCos + 0.5f;
        c5382f.G((int) f27, (int) f28, (int) (f27 + f12), (int) (f28 + f13));
    }

    public void x(C5379c c5379c, C5381e c5381e) {
        double d10 = (((this.f226277g / 2.0f) + this.f226275e) - c5381e.f226275e) - (c5381e.f226277g / 2.0f);
        double d11 = (((this.f226278h / 2.0f) + this.f226276f) - c5381e.f226276f) - (c5381e.f226278h / 2.0f);
        this.f226284n = c5379c;
        this.f226275e = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f226283m)) {
            this.f226276f = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f226276f = (float) Math.toRadians(this.f226283m);
        }
    }

    public C5381e(int i10, int i11, C5415e c5415e, C5381e c5381e, C5381e c5381e2) {
        this.f226272b = 0;
        this.f226279i = Float.NaN;
        this.f226280j = Float.NaN;
        this.f226281k = -1;
        this.f226282l = -1;
        this.f226283m = Float.NaN;
        this.f226284n = null;
        this.f226285o = new HashMap<>();
        this.f226286p = 0;
        this.f226288r = new double[18];
        this.f226289s = new double[18];
        if (c5381e.f226282l != -1) {
            s(i10, i11, c5415e, c5381e, c5381e2);
            return;
        }
        int i12 = c5415e.f226628I;
        if (i12 == 1) {
            r(c5415e, c5381e, c5381e2);
        } else if (i12 != 2) {
            p(c5415e, c5381e, c5381e2);
        } else {
            t(i10, i11, c5415e, c5381e, c5381e2);
        }
    }
}
