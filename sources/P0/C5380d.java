package p0;

import W3.o;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import s0.C5563e;
import s0.F;
import s0.n;
import s0.p;

/* JADX INFO: renamed from: p0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5380d implements Comparable<C5380d> {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f226224D = "MotionPaths";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final boolean f226225E = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f226226F = 1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f226227G = 2;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static String[] f226228H = {o.f76584m, "x", "y", InMobiNetworkValues.WIDTH, InMobiNetworkValues.HEIGHT, "pathRotate"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f226234c;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C5563e f226247p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f226249r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f226250s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f226251t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f226252u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f226253v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f226232a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f226233b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f226235d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f226236e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f226237f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f226238g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f226239h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f226240i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f226241j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f226242k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f226243l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f226244m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f226245n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f226246o = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f226248q = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f226254w = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f226255x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226256y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinkedHashMap<String, C5378b> f226257z = new LinkedHashMap<>();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f226229A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public double[] f226230B = new double[18];

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public double[] f226231C = new double[18];

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, p> map, int i10) {
        for (String str : map.keySet()) {
            p pVar = map.get(str);
            str.getClass();
            byte b10 = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b10 = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b10 = 1;
                    }
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        b10 = 2;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b10 = 3;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b10 = 4;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b10 = 5;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b10 = 6;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        b10 = 7;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        b10 = 8;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b10 = 9;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b10 = 10;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b10 = 11;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        b10 = 12;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    pVar.g(i10, Float.isNaN(this.f226238g) ? 0.0f : this.f226238g);
                    break;
                case 1:
                    pVar.g(i10, Float.isNaN(this.f226239h) ? 0.0f : this.f226239h);
                    break;
                case 2:
                    pVar.g(i10, Float.isNaN(this.f226237f) ? 0.0f : this.f226237f);
                    break;
                case 3:
                    pVar.g(i10, Float.isNaN(this.f226244m) ? 0.0f : this.f226244m);
                    break;
                case 4:
                    pVar.g(i10, Float.isNaN(this.f226245n) ? 0.0f : this.f226245n);
                    break;
                case 5:
                    pVar.g(i10, Float.isNaN(this.f226246o) ? 0.0f : this.f226246o);
                    break;
                case 6:
                    pVar.g(i10, Float.isNaN(this.f226255x) ? 0.0f : this.f226255x);
                    break;
                case 7:
                    pVar.g(i10, Float.isNaN(this.f226242k) ? 0.0f : this.f226242k);
                    break;
                case 8:
                    pVar.g(i10, Float.isNaN(this.f226243l) ? 0.0f : this.f226243l);
                    break;
                case 9:
                    pVar.g(i10, Float.isNaN(this.f226240i) ? 1.0f : this.f226240i);
                    break;
                case 10:
                    pVar.g(i10, Float.isNaN(this.f226241j) ? 1.0f : this.f226241j);
                    break;
                case 11:
                    pVar.g(i10, Float.isNaN(this.f226232a) ? 1.0f : this.f226232a);
                    break;
                case 12:
                    pVar.g(i10, Float.isNaN(this.f226254w) ? 0.0f : this.f226254w);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f226257z.containsKey(str2)) {
                            C5378b c5378b = this.f226257z.get(str2);
                            if (pVar instanceof p.c) {
                                ((p.c) pVar).k(i10, c5378b);
                            } else {
                                F.f("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + c5378b.n() + pVar);
                            }
                        }
                    } else {
                        F.f("MotionPaths", "UNKNOWN spline ".concat(str));
                    }
                    break;
            }
        }
    }

    public void b(C5382f c5382f) {
        this.f226234c = c5382f.B();
        this.f226232a = c5382f.B() != 4 ? 0.0f : c5382f.g();
        this.f226235d = false;
        this.f226237f = c5382f.t();
        this.f226238g = c5382f.r();
        this.f226239h = c5382f.s();
        this.f226240i = c5382f.u();
        this.f226241j = c5382f.v();
        this.f226242k = c5382f.o();
        this.f226243l = c5382f.p();
        this.f226244m = c5382f.x();
        this.f226245n = c5382f.y();
        this.f226246o = c5382f.z();
        for (String str : c5382f.j()) {
            C5378b c5378bI = c5382f.i(str);
            if (c5378bI != null && c5378bI.q()) {
                this.f226257z.put(str, c5378bI);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5380d c5380d) {
        return Float.compare(this.f226249r, c5380d.f226249r);
    }

    public final boolean d(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void e(C5380d c5380d, HashSet<String> hashSet) {
        if (d(this.f226232a, c5380d.f226232a)) {
            hashSet.add("alpha");
        }
        if (d(this.f226236e, c5380d.f226236e)) {
            hashSet.add("translationZ");
        }
        int i10 = this.f226234c;
        int i11 = c5380d.f226234c;
        if (i10 != i11 && this.f226233b == 0 && (i10 == 4 || i11 == 4)) {
            hashSet.add("alpha");
        }
        if (d(this.f226237f, c5380d.f226237f)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f226254w) || !Float.isNaN(c5380d.f226254w)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f226255x) || !Float.isNaN(c5380d.f226255x)) {
            hashSet.add("progress");
        }
        if (d(this.f226238g, c5380d.f226238g)) {
            hashSet.add("rotationX");
        }
        if (d(this.f226239h, c5380d.f226239h)) {
            hashSet.add("rotationY");
        }
        if (d(this.f226242k, c5380d.f226242k)) {
            hashSet.add("pivotX");
        }
        if (d(this.f226243l, c5380d.f226243l)) {
            hashSet.add("pivotY");
        }
        if (d(this.f226240i, c5380d.f226240i)) {
            hashSet.add("scaleX");
        }
        if (d(this.f226241j, c5380d.f226241j)) {
            hashSet.add("scaleY");
        }
        if (d(this.f226244m, c5380d.f226244m)) {
            hashSet.add("translationX");
        }
        if (d(this.f226245n, c5380d.f226245n)) {
            hashSet.add("translationY");
        }
        if (d(this.f226246o, c5380d.f226246o)) {
            hashSet.add("translationZ");
        }
        if (d(this.f226236e, c5380d.f226236e)) {
            hashSet.add("elevation");
        }
    }

    public void f(C5380d c5380d, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | d(this.f226249r, c5380d.f226249r);
        zArr[1] = zArr[1] | d(this.f226250s, c5380d.f226250s);
        zArr[2] = zArr[2] | d(this.f226251t, c5380d.f226251t);
        zArr[3] = zArr[3] | d(this.f226252u, c5380d.f226252u);
        zArr[4] = d(this.f226253v, c5380d.f226253v) | zArr[4];
    }

    public void g(double[] dArr, int[] iArr) {
        int i10 = 0;
        float[] fArr = {this.f226249r, this.f226250s, this.f226251t, this.f226252u, this.f226253v, this.f226232a, this.f226236e, this.f226237f, this.f226238g, this.f226239h, this.f226240i, this.f226241j, this.f226242k, this.f226243l, this.f226244m, this.f226245n, this.f226246o, this.f226254w};
        for (int i11 : iArr) {
            if (i11 < 18) {
                dArr[i10] = fArr[r4];
                i10++;
            }
        }
    }

    public int h(String str, double[] dArr, int i10) {
        C5378b c5378b = this.f226257z.get(str);
        if (c5378b.r() == 1) {
            dArr[i10] = c5378b.n();
            return 1;
        }
        int iR = c5378b.r();
        c5378b.o(new float[iR]);
        int i11 = 0;
        while (i11 < iR) {
            dArr[i10] = r1[i11];
            i11++;
            i10++;
        }
        return iR;
    }

    public int i(String str) {
        return this.f226257z.get(str).r();
    }

    public boolean j(String str) {
        return this.f226257z.containsKey(str);
    }

    public void k(float f10, float f11, float f12, float f13) {
        this.f226250s = f10;
        this.f226251t = f11;
        this.f226252u = f12;
        this.f226253v = f13;
    }

    public void l(C5382f c5382f) {
        k(c5382f.E(), c5382f.F(), c5382f.D(), c5382f.k());
        b(c5382f);
    }

    public void m(n nVar, C5382f c5382f, int i10, float f10) {
        k(nVar.f238120b, nVar.f238122d, nVar.b(), nVar.a());
        b(c5382f);
        this.f226242k = Float.NaN;
        this.f226243l = Float.NaN;
        if (i10 == 1) {
            this.f226237f = f10 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f226237f = f10 + 90.0f;
        }
    }
}
