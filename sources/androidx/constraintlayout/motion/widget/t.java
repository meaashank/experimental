package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.d;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import i.C4541d;
import java.util.Arrays;
import java.util.LinkedHashMap;
import s0.C5563e;

/* JADX INFO: loaded from: classes2.dex */
public class t implements Comparable<t> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f107216A = 4;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f107217B = 5;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f107218C = 1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f107219D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f107220E = 2;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static String[] f107221F = {W3.o.f76584m, "x", "y", InMobiNetworkValues.WIDTH, InMobiNetworkValues.HEIGHT, "pathRotate"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f107222t = "MotionPaths";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f107223u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f107224v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f107225w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f107226x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f107227y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f107228z = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5563e f107229a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f107231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f107232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f107233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f107234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f107235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f107236h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f107239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f107240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f107241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f107242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap<String, ConstraintAttribute> f107243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f107244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f107245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double[] f107246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double[] f107247s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f107230b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f107237i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f107238j = Float.NaN;

    public t() {
        int i10 = f.f106846f;
        this.f107239k = i10;
        this.f107240l = i10;
        this.f107241m = Float.NaN;
        this.f107242n = null;
        this.f107243o = new LinkedHashMap<>();
        this.f107244p = 0;
        this.f107246r = new double[18];
        this.f107247s = new double[18];
    }

    public static final float y(float sin, float cos, float cx, float cy, float x10, float y10) {
        return (((x10 - cx) * cos) - ((y10 - cy) * sin)) + cx;
    }

    public static final float z(float sin, float cos, float cx, float cy, float x10, float y10) {
        return ((y10 - cy) * cos) + ((x10 - cx) * sin) + cy;
    }

    public void a(d.a c10) {
        this.f107229a = C5563e.c(c10.f107983d.f108161d);
        d.c cVar = c10.f107983d;
        this.f107239k = cVar.f108162e;
        this.f107240l = cVar.f108159b;
        this.f107237i = cVar.f108166i;
        this.f107230b = cVar.f108163f;
        this.f107245q = cVar.f108160c;
        this.f107238j = c10.f107982c.f108176e;
        this.f107241m = c10.f107984e.f108078D;
        for (String str : c10.f107986g.keySet()) {
            ConstraintAttribute constraintAttribute = c10.f107986g.get(str);
            if (constraintAttribute != null && constraintAttribute.n()) {
                this.f107243o.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull t o10) {
        return Float.compare(this.f107232d, o10.f107232d);
    }

    public void c(o toOrbit) {
        toOrbit.A(this.f107238j);
    }

    public final boolean d(float a10, float b10) {
        return (Float.isNaN(a10) || Float.isNaN(b10)) ? Float.isNaN(a10) != Float.isNaN(b10) : Math.abs(a10 - b10) > 1.0E-6f;
    }

    public void e(t points, boolean[] mask, String[] custom, boolean arcMode) {
        boolean zD = d(this.f107233e, points.f107233e);
        boolean zD2 = d(this.f107234f, points.f107234f);
        mask[0] = mask[0] | d(this.f107232d, points.f107232d);
        boolean z10 = zD | zD2 | arcMode;
        mask[1] = mask[1] | z10;
        mask[2] = z10 | mask[2];
        mask[3] = mask[3] | d(this.f107235g, points.f107235g);
        mask[4] = d(this.f107236h, points.f107236h) | mask[4];
    }

    public void f(double[] data, int[] toUse) {
        float[] fArr = {this.f107232d, this.f107233e, this.f107234f, this.f107235g, this.f107236h, this.f107237i};
        int i10 = 0;
        for (int i11 : toUse) {
            if (i11 < 6) {
                data[i10] = fArr[r1];
                i10++;
            }
        }
    }

    public void g(int[] toUse, double[] data, float[] point, int offset) {
        float f10 = this.f107235g;
        float f11 = this.f107236h;
        for (int i10 = 0; i10 < toUse.length; i10++) {
            float f12 = (float) data[i10];
            int i11 = toUse[i10];
            if (i11 == 3) {
                f10 = f12;
            } else if (i11 == 4) {
                f11 = f12;
            }
        }
        point[offset] = f10;
        point[offset + 1] = f11;
    }

    public void h(double p10, int[] toUse, double[] data, float[] point, int offset) {
        float fSin = this.f107233e;
        float fCos = this.f107234f;
        float f10 = this.f107235g;
        float f11 = this.f107236h;
        for (int i10 = 0; i10 < toUse.length; i10++) {
            float f12 = (float) data[i10];
            int i11 = toUse[i10];
            if (i11 == 1) {
                fSin = f12;
            } else if (i11 == 2) {
                fCos = f12;
            } else if (i11 == 3) {
                f10 = f12;
            } else if (i11 == 4) {
                f11 = f12;
            }
        }
        o oVar = this.f107242n;
        if (oVar != null) {
            float[] fArr = new float[2];
            oVar.m(p10, fArr, new float[2]);
            float f13 = fArr[0];
            float f14 = fArr[1];
            double d10 = f13;
            double d11 = fSin;
            double d12 = fCos;
            fSin = (float) (((Math.sin(d12) * d11) + d10) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (Math.cos(d12) * d11)) - ((double) (f11 / 2.0f)));
        }
        point[offset] = (f10 / 2.0f) + fSin + 0.0f;
        point[offset + 1] = (f11 / 2.0f) + fCos + 0.0f;
    }

    public void i(double p10, int[] toUse, double[] data, float[] point, double[] vdata, float[] velocity) {
        float f10;
        float fSin = this.f107233e;
        float fCos = this.f107234f;
        float f11 = this.f107235g;
        float f12 = this.f107236h;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i10 = 0; i10 < toUse.length; i10++) {
            float f17 = (float) data[i10];
            float f18 = (float) vdata[i10];
            int i11 = toUse[i10];
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
        o oVar = this.f107242n;
        if (oVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            oVar.m(p10, fArr, fArr2);
            float f20 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            f10 = 2.0f;
            double d10 = fSin;
            double d11 = fCos;
            fSin = (float) (((Math.sin(d11) * d10) + ((double) f20)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f21) - (Math.cos(d11) * d10)) - ((double) (f12 / 2.0f)));
            double d12 = f13;
            double dSin = (Math.sin(d11) * d12) + ((double) f22);
            double d13 = f15;
            float fCos2 = (float) ((Math.cos(d11) * d13) + dSin);
            fSin2 = (float) ((Math.sin(d11) * d13) + (((double) f23) - (Math.cos(d11) * d12)));
            f19 = fCos2;
        } else {
            f10 = 2.0f;
        }
        point[0] = (f11 / f10) + fSin + 0.0f;
        point[1] = (f12 / f10) + fCos + 0.0f;
        velocity[0] = f19;
        velocity[1] = fSin2;
    }

    public void j(double p10, int[] toUse, double[] data, float[] point, int offset) {
        float fSin = this.f107233e;
        float fCos = this.f107234f;
        float f10 = this.f107235g;
        float f11 = this.f107236h;
        for (int i10 = 0; i10 < toUse.length; i10++) {
            float f12 = (float) data[i10];
            int i11 = toUse[i10];
            if (i11 == 1) {
                fSin = f12;
            } else if (i11 == 2) {
                fCos = f12;
            } else if (i11 == 3) {
                f10 = f12;
            } else if (i11 == 4) {
                f11 = f12;
            }
        }
        o oVar = this.f107242n;
        if (oVar != null) {
            float[] fArr = new float[2];
            oVar.m(p10, fArr, new float[2]);
            float f13 = fArr[0];
            float f14 = fArr[1];
            double d10 = f13;
            double d11 = fSin;
            double d12 = fCos;
            fSin = (float) (((Math.sin(d12) * d11) + d10) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (Math.cos(d12) * d11)) - ((double) (f11 / 2.0f)));
        }
        point[offset] = (f10 / 2.0f) + fSin + 0.0f;
        point[offset + 1] = (f11 / 2.0f) + fCos + 0.0f;
    }

    public int k(String name, double[] value, int offset) {
        ConstraintAttribute constraintAttribute = this.f107243o.get(name);
        int i10 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.p() == 1) {
            value[offset] = constraintAttribute.k();
            return 1;
        }
        int iP = constraintAttribute.p();
        constraintAttribute.l(new float[iP]);
        while (i10 < iP) {
            value[offset] = r2[i10];
            i10++;
            offset++;
        }
        return iP;
    }

    public int l(String name) {
        ConstraintAttribute constraintAttribute = this.f107243o.get(name);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.p();
    }

    public void m(int[] toUse, double[] data, float[] path, int offset) {
        float f10 = this.f107233e;
        float fCos = this.f107234f;
        float f11 = this.f107235g;
        float f12 = this.f107236h;
        for (int i10 = 0; i10 < toUse.length; i10++) {
            float f13 = (float) data[i10];
            int i11 = toUse[i10];
            if (i11 == 1) {
                f10 = f13;
            } else if (i11 == 2) {
                fCos = f13;
            } else if (i11 == 3) {
                f11 = f13;
            } else if (i11 == 4) {
                f12 = f13;
            }
        }
        o oVar = this.f107242n;
        if (oVar != null) {
            float fN = oVar.n();
            float fO = this.f107242n.o();
            double d10 = f10;
            double d11 = fCos;
            float fSin = (float) (((Math.sin(d11) * d10) + ((double) fN)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) fO) - (Math.cos(d11) * d10)) - ((double) (f12 / 2.0f)));
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
        path[offset] = f16;
        path[offset + 1] = f17;
        path[offset + 2] = f18;
        path[offset + 3] = f17;
        path[offset + 4] = f18;
        path[offset + 5] = f19;
        path[offset + 6] = f16;
        path[offset + 7] = f19;
    }

    public boolean n(String name) {
        return this.f107243o.containsKey(name);
    }

    public void p(j c10, t startTimePoint, t endTimePoint) {
        float f10 = c10.f106867a / 100.0f;
        this.f107231c = f10;
        this.f107230b = c10.f106989H;
        float f11 = Float.isNaN(c10.f106990I) ? f10 : c10.f106990I;
        float f12 = Float.isNaN(c10.f106991J) ? f10 : c10.f106991J;
        float f13 = endTimePoint.f107235g;
        float f14 = startTimePoint.f107235g;
        float f15 = f13 - f14;
        float f16 = endTimePoint.f107236h;
        float f17 = startTimePoint.f107236h;
        float f18 = f16 - f17;
        this.f107232d = this.f107231c;
        float f19 = startTimePoint.f107233e;
        float f20 = startTimePoint.f107234f;
        float f21 = f10;
        float f22 = ((f13 / 2.0f) + endTimePoint.f107233e) - ((f14 / 2.0f) + f19);
        float f23 = ((f16 / 2.0f) + endTimePoint.f107234f) - ((f17 / 2.0f) + f20);
        float f24 = (f15 * f11) / 2.0f;
        this.f107233e = (int) (((f22 * f21) + f19) - f24);
        float f25 = (f18 * f12) / 2.0f;
        this.f107234f = (int) (((f23 * f21) + f20) - f25);
        this.f107235g = (int) (f14 + r9);
        this.f107236h = (int) (f17 + r12);
        float f26 = Float.isNaN(c10.f106992K) ? f21 : c10.f106992K;
        float f27 = Float.isNaN(c10.f106995N) ? 0.0f : c10.f106995N;
        if (!Float.isNaN(c10.f106993L)) {
            f21 = c10.f106993L;
        }
        float f28 = Float.isNaN(c10.f106994M) ? 0.0f : c10.f106994M;
        this.f107244p = 0;
        this.f107233e = (int) (((f28 * f23) + ((f26 * f22) + startTimePoint.f107233e)) - f24);
        this.f107234f = (int) (((f23 * f21) + ((f22 * f27) + startTimePoint.f107234f)) - f25);
        this.f107229a = C5563e.c(c10.f106987F);
        this.f107239k = c10.f106988G;
    }

    public void r(j c10, t startTimePoint, t endTimePoint) {
        float f10 = c10.f106867a / 100.0f;
        this.f107231c = f10;
        this.f107230b = c10.f106989H;
        float f11 = Float.isNaN(c10.f106990I) ? f10 : c10.f106990I;
        float f12 = Float.isNaN(c10.f106991J) ? f10 : c10.f106991J;
        float f13 = endTimePoint.f107235g - startTimePoint.f107235g;
        float f14 = endTimePoint.f107236h - startTimePoint.f107236h;
        this.f107232d = this.f107231c;
        if (!Float.isNaN(c10.f106992K)) {
            f10 = c10.f106992K;
        }
        float f15 = startTimePoint.f107233e;
        float f16 = startTimePoint.f107235g;
        float f17 = startTimePoint.f107234f;
        float f18 = startTimePoint.f107236h;
        float f19 = f10;
        float f20 = ((endTimePoint.f107235g / 2.0f) + endTimePoint.f107233e) - ((f16 / 2.0f) + f15);
        float f21 = ((endTimePoint.f107236h / 2.0f) + endTimePoint.f107234f) - ((f18 / 2.0f) + f17);
        float f22 = f20 * f19;
        float f23 = (f13 * f11) / 2.0f;
        this.f107233e = (int) ((f15 + f22) - f23);
        float f24 = f21 * f19;
        float f25 = (f14 * f12) / 2.0f;
        this.f107234f = (int) ((f17 + f24) - f25);
        this.f107235g = (int) (f16 + r7);
        this.f107236h = (int) (f18 + r8);
        float f26 = Float.isNaN(c10.f106993L) ? 0.0f : c10.f106993L;
        this.f107244p = 1;
        float f27 = (int) ((startTimePoint.f107233e + f22) - f23);
        float f28 = (int) ((startTimePoint.f107234f + f24) - f25);
        this.f107233e = f27 + ((-f21) * f26);
        this.f107234f = f28 + (f20 * f26);
        this.f107240l = this.f107240l;
        this.f107229a = C5563e.c(c10.f106987F);
        this.f107239k = c10.f106988G;
    }

    public void s(int parentWidth, int parentHeight, j c10, t s10, t e10) {
        float fMin;
        float fA;
        float f10 = c10.f106867a / 100.0f;
        this.f107231c = f10;
        this.f107230b = c10.f106989H;
        this.f107244p = c10.f106996O;
        float f11 = Float.isNaN(c10.f106990I) ? f10 : c10.f106990I;
        float f12 = Float.isNaN(c10.f106991J) ? f10 : c10.f106991J;
        float f13 = e10.f107235g;
        float f14 = s10.f107235g;
        float f15 = e10.f107236h;
        float f16 = s10.f107236h;
        this.f107232d = this.f107231c;
        this.f107235g = (int) (((f13 - f14) * f11) + f14);
        this.f107236h = (int) (((f15 - f16) * f12) + f16);
        int i10 = c10.f106996O;
        if (i10 == 1) {
            float f17 = Float.isNaN(c10.f106992K) ? f10 : c10.f106992K;
            float f18 = e10.f107233e;
            float f19 = s10.f107233e;
            this.f107233e = C4541d.a(f18, f19, f17, f19);
            if (!Float.isNaN(c10.f106993L)) {
                f10 = c10.f106993L;
            }
            float f20 = e10.f107234f;
            float f21 = s10.f107234f;
            this.f107234f = C4541d.a(f20, f21, f10, f21);
        } else if (i10 != 2) {
            float f22 = Float.isNaN(c10.f106992K) ? f10 : c10.f106992K;
            float f23 = e10.f107233e;
            float f24 = s10.f107233e;
            this.f107233e = C4541d.a(f23, f24, f22, f24);
            if (!Float.isNaN(c10.f106993L)) {
                f10 = c10.f106993L;
            }
            float f25 = e10.f107234f;
            float f26 = s10.f107234f;
            this.f107234f = C4541d.a(f25, f26, f10, f26);
        } else {
            if (Float.isNaN(c10.f106992K)) {
                float f27 = e10.f107233e;
                float f28 = s10.f107233e;
                fMin = C4541d.a(f27, f28, f10, f28);
            } else {
                fMin = Math.min(f12, f11) * c10.f106992K;
            }
            this.f107233e = fMin;
            if (Float.isNaN(c10.f106993L)) {
                float f29 = e10.f107234f;
                float f30 = s10.f107234f;
                fA = C4541d.a(f29, f30, f10, f30);
            } else {
                fA = c10.f106993L;
            }
            this.f107234f = fA;
        }
        this.f107240l = s10.f107240l;
        this.f107229a = C5563e.c(c10.f106987F);
        this.f107239k = c10.f106988G;
    }

    public void t(int parentWidth, int parentHeight, j c10, t startTimePoint, t endTimePoint) {
        float f10 = c10.f106867a / 100.0f;
        this.f107231c = f10;
        this.f107230b = c10.f106989H;
        float f11 = Float.isNaN(c10.f106990I) ? f10 : c10.f106990I;
        float f12 = Float.isNaN(c10.f106991J) ? f10 : c10.f106991J;
        float f13 = endTimePoint.f107235g;
        float f14 = f13 - startTimePoint.f107235g;
        float f15 = endTimePoint.f107236h;
        float f16 = f15 - startTimePoint.f107236h;
        this.f107232d = this.f107231c;
        float f17 = startTimePoint.f107233e;
        float f18 = startTimePoint.f107234f;
        float f19 = (f13 / 2.0f) + endTimePoint.f107233e;
        float f20 = (f15 / 2.0f) + endTimePoint.f107234f;
        float f21 = f14 * f11;
        this.f107233e = (int) ((((f19 - ((r8 / 2.0f) + f17)) * f10) + f17) - (f21 / 2.0f));
        float f22 = f16 * f12;
        this.f107234f = (int) ((((f20 - ((r11 / 2.0f) + f18)) * f10) + f18) - (f22 / 2.0f));
        this.f107235g = (int) (r8 + f21);
        this.f107236h = (int) (r11 + f22);
        this.f107244p = 2;
        if (!Float.isNaN(c10.f106992K)) {
            this.f107233e = (int) (c10.f106992K * ((int) (parentWidth - this.f107235g)));
        }
        if (!Float.isNaN(c10.f106993L)) {
            this.f107234f = (int) (c10.f106993L * ((int) (parentHeight - this.f107236h)));
        }
        this.f107240l = this.f107240l;
        this.f107229a = C5563e.c(c10.f106987F);
        this.f107239k = c10.f106988G;
    }

    public void u(float x10, float y10, float w10, float h10) {
        this.f107233e = x10;
        this.f107234f = y10;
        this.f107235g = w10;
        this.f107236h = h10;
    }

    public void v(float locationX, float locationY, float[] mAnchorDpDt, int[] toUse, double[] deltaData, double[] data) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i10 = 0; i10 < toUse.length; i10++) {
            float f14 = (float) deltaData[i10];
            double d10 = data[i10];
            int i11 = toUse[i10];
            if (i11 == 1) {
                f10 = f14;
            } else if (i11 == 2) {
                f12 = f14;
            } else if (i11 == 3) {
                f11 = f14;
            } else if (i11 == 4) {
                f13 = f14;
            }
        }
        float f15 = f10 - ((0.0f * f11) / 2.0f);
        float f16 = f12 - ((0.0f * f13) / 2.0f);
        mAnchorDpDt[0] = (((f11 * 1.0f) + f15) * locationX) + ((1.0f - locationX) * f15) + 0.0f;
        mAnchorDpDt[1] = (((f13 * 1.0f) + f16) * locationY) + ((1.0f - locationY) * f16) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(float position, View view, int[] toUse, double[] data, double[] slope, double[] cycle, boolean mForceMeasure) {
        float f10;
        float fSin = this.f107233e;
        float fCos = this.f107234f;
        float f11 = this.f107235g;
        float f12 = this.f107236h;
        if (toUse.length != 0 && this.f107246r.length <= toUse[toUse.length - 1]) {
            int i10 = toUse[toUse.length - 1] + 1;
            this.f107246r = new double[i10];
            this.f107247s = new double[i10];
        }
        Arrays.fill(this.f107246r, Double.NaN);
        for (int i11 = 0; i11 < toUse.length; i11++) {
            double[] dArr = this.f107246r;
            int i12 = toUse[i11];
            dArr[i12] = data[i11];
            this.f107247s[i12] = slope[i11];
        }
        float f13 = Float.NaN;
        int i13 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (true) {
            double[] dArr2 = this.f107246r;
            if (i13 >= dArr2.length) {
                break;
            }
            if (Double.isNaN(dArr2[i13]) && (cycle == null || cycle[i13] == 0.0d)) {
                f10 = f13;
            } else {
                double d10 = cycle != null ? cycle[i13] : 0.0d;
                if (!Double.isNaN(this.f107246r[i13])) {
                    d10 = this.f107246r[i13] + d10;
                }
                f10 = f13;
                float f18 = (float) d10;
                float f19 = (float) this.f107247s[i13];
                if (i13 == 1) {
                    f13 = f10;
                    f14 = f19;
                    fSin = f18;
                } else if (i13 == 2) {
                    f13 = f10;
                    f15 = f19;
                    fCos = f18;
                } else if (i13 == 3) {
                    f13 = f10;
                    f16 = f19;
                    f11 = f18;
                } else if (i13 == 4) {
                    f13 = f10;
                    f17 = f19;
                    f12 = f18;
                } else if (i13 == 5) {
                    f13 = f18;
                }
                i13++;
            }
            f13 = f10;
            i13++;
        }
        float f20 = f13;
        o oVar = this.f107242n;
        if (oVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            oVar.m(position, fArr, fArr2);
            float f21 = fArr[0];
            float f22 = fArr[1];
            float f23 = fArr2[0];
            float f24 = fArr2[1];
            double d11 = f21;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f22) - (Math.cos(d13) * d12)) - ((double) (f12 / 2.0f)));
            double d14 = f23;
            double d15 = f14;
            double dSin = (Math.sin(d13) * d15) + d14;
            double dCos = Math.cos(d13) * d12;
            double d16 = f15;
            float f25 = (float) ((dCos * d16) + dSin);
            float fSin2 = (float) ((Math.sin(d13) * d12 * d16) + (((double) f24) - (Math.cos(d13) * d15)));
            if (slope.length >= 2) {
                slope[0] = f25;
                slope[1] = fSin2;
            }
            if (!Float.isNaN(f20)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, f25)) + ((double) f20)));
            }
        } else if (!Float.isNaN(f20)) {
            view.setRotation((float) (Math.toDegrees(Math.atan2((f17 / 2.0f) + f15, (f16 / 2.0f) + f14)) + ((double) f20) + ((double) 0.0f)));
        }
        if (view instanceof e) {
            ((e) view).a(fSin, fCos, f11 + fSin, f12 + fCos);
            return;
        }
        float f26 = fSin + 0.5f;
        int i14 = (int) f26;
        float f27 = fCos + 0.5f;
        int i15 = (int) f27;
        int i16 = (int) (f26 + f11);
        int i17 = (int) (f27 + f12);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight() || mForceMeasure) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view.layout(i14, i15, i16, i17);
    }

    public void x(o mc2, t relative) {
        double d10 = (((this.f107235g / 2.0f) + this.f107233e) - relative.f107233e) - (relative.f107235g / 2.0f);
        double d11 = (((this.f107236h / 2.0f) + this.f107234f) - relative.f107234f) - (relative.f107236h / 2.0f);
        this.f107242n = mc2;
        this.f107233e = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f107241m)) {
            this.f107234f = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f107234f = (float) Math.toRadians(this.f107241m);
        }
    }

    public t(int parentWidth, int parentHeight, j c10, t startTimePoint, t endTimePoint) {
        int i10 = f.f106846f;
        this.f107239k = i10;
        this.f107240l = i10;
        this.f107241m = Float.NaN;
        this.f107242n = null;
        this.f107243o = new LinkedHashMap<>();
        this.f107244p = 0;
        this.f107246r = new double[18];
        this.f107247s = new double[18];
        if (startTimePoint.f107240l != f.f106846f) {
            s(parentWidth, parentHeight, c10, startTimePoint, endTimePoint);
            return;
        }
        int i11 = c10.f106996O;
        if (i11 == 1) {
            r(c10, startTimePoint, endTimePoint);
        } else if (i11 != 2) {
            p(c10, startTimePoint, endTimePoint);
        } else {
            t(parentWidth, parentHeight, c10, startTimePoint, endTimePoint);
        }
    }
}
