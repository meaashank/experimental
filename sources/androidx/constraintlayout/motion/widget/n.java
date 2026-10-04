package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.d;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import s0.C5563e;
import w0.AbstractC5735d;

/* JADX INFO: loaded from: classes2.dex */
public class n implements Comparable<n> {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f107115D = "MotionPaths";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final boolean f107116E = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f107117F = 1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f107118G = 2;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static String[] f107119H = {W3.o.f76584m, "x", "y", InMobiNetworkValues.WIDTH, InMobiNetworkValues.HEIGHT, "pathRotate"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107125c;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C5563e f107138p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f107140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f107141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f107142t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f107143u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f107144v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f107123a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f107124b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f107126d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f107127e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f107128f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f107129g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f107130h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f107131i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f107132j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f107133k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f107134l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f107135m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f107136n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f107137o = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f107139q = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f107145w = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f107146x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f107147y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinkedHashMap<String, ConstraintAttribute> f107148z = new LinkedHashMap<>();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f107120A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public double[] f107121B = new double[18];

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public double[] f107122C = new double[18];

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, AbstractC5735d> splines, int mFramePosition) {
        for (String str : splines.keySet()) {
            AbstractC5735d abstractC5735d = splines.get(str);
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
                case -1225497657:
                    if (str.equals("translationX")) {
                        b10 = 2;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b10 = 3;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b10 = 4;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b10 = 5;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b10 = 6;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b10 = 7;
                    }
                    break;
                case -760884510:
                    if (str.equals(f.f106852l)) {
                        b10 = 8;
                    }
                    break;
                case -760884509:
                    if (str.equals(f.f106853m)) {
                        b10 = 9;
                    }
                    break;
                case -40300674:
                    if (str.equals(f.f106849i)) {
                        b10 = 10;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        b10 = 11;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b10 = 12;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b10 = 13;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107129g) ? 0.0f : this.f107129g);
                    break;
                case 1:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107130h) ? 0.0f : this.f107130h);
                    break;
                case 2:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107135m) ? 0.0f : this.f107135m);
                    break;
                case 3:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107136n) ? 0.0f : this.f107136n);
                    break;
                case 4:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107137o) ? 0.0f : this.f107137o);
                    break;
                case 5:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107146x) ? 0.0f : this.f107146x);
                    break;
                case 6:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107131i) ? 1.0f : this.f107131i);
                    break;
                case 7:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107132j) ? 1.0f : this.f107132j);
                    break;
                case 8:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107133k) ? 0.0f : this.f107133k);
                    break;
                case 9:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107134l) ? 0.0f : this.f107134l);
                    break;
                case 10:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107128f) ? 0.0f : this.f107128f);
                    break;
                case 11:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107127e) ? 0.0f : this.f107127e);
                    break;
                case 12:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107145w) ? 0.0f : this.f107145w);
                    break;
                case 13:
                    abstractC5735d.g(mFramePosition, Float.isNaN(this.f107123a) ? 1.0f : this.f107123a);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f107148z.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = this.f107148z.get(str2);
                            if (abstractC5735d instanceof AbstractC5735d.b) {
                                ((AbstractC5735d.b) abstractC5735d).n(mFramePosition, constraintAttribute);
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + mFramePosition + ", value" + constraintAttribute.k() + abstractC5735d);
                            }
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                    }
                    break;
            }
        }
    }

    public void b(View view) {
        this.f107125c = view.getVisibility();
        this.f107123a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f107126d = false;
        this.f107127e = view.getElevation();
        this.f107128f = view.getRotation();
        this.f107129g = view.getRotationX();
        this.f107130h = view.getRotationY();
        this.f107131i = view.getScaleX();
        this.f107132j = view.getScaleY();
        this.f107133k = view.getPivotX();
        this.f107134l = view.getPivotY();
        this.f107135m = view.getTranslationX();
        this.f107136n = view.getTranslationY();
        this.f107137o = view.getTranslationZ();
    }

    public void c(d.a c10) {
        d.C0274d c0274d = c10.f107982c;
        int i10 = c0274d.f108174c;
        this.f107124b = i10;
        int i11 = c0274d.f108173b;
        this.f107125c = i11;
        this.f107123a = (i11 == 0 || i10 != 0) ? c0274d.f108175d : 0.0f;
        d.e eVar = c10.f107985f;
        this.f107126d = eVar.f108202m;
        this.f107127e = eVar.f108203n;
        this.f107128f = eVar.f108191b;
        this.f107129g = eVar.f108192c;
        this.f107130h = eVar.f108193d;
        this.f107131i = eVar.f108194e;
        this.f107132j = eVar.f108195f;
        this.f107133k = eVar.f108196g;
        this.f107134l = eVar.f108197h;
        this.f107135m = eVar.f108199j;
        this.f107136n = eVar.f108200k;
        this.f107137o = eVar.f108201l;
        this.f107138p = C5563e.c(c10.f107983d.f108161d);
        d.c cVar = c10.f107983d;
        this.f107145w = cVar.f108166i;
        this.f107139q = cVar.f108163f;
        this.f107147y = cVar.f108159b;
        this.f107146x = c10.f107982c.f108176e;
        for (String str : c10.f107986g.keySet()) {
            ConstraintAttribute constraintAttribute = c10.f107986g.get(str);
            if (constraintAttribute.n()) {
                this.f107148z.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(n o10) {
        return Float.compare(this.f107140r, o10.f107140r);
    }

    public final boolean e(float a10, float b10) {
        return (Float.isNaN(a10) || Float.isNaN(b10)) ? Float.isNaN(a10) != Float.isNaN(b10) : Math.abs(a10 - b10) > 1.0E-6f;
    }

    public void f(n points, HashSet<String> keySet) {
        if (e(this.f107123a, points.f107123a)) {
            keySet.add("alpha");
        }
        if (e(this.f107127e, points.f107127e)) {
            keySet.add("elevation");
        }
        int i10 = this.f107125c;
        int i11 = points.f107125c;
        if (i10 != i11 && this.f107124b == 0 && (i10 == 0 || i11 == 0)) {
            keySet.add("alpha");
        }
        if (e(this.f107128f, points.f107128f)) {
            keySet.add(f.f106849i);
        }
        if (!Float.isNaN(this.f107145w) || !Float.isNaN(points.f107145w)) {
            keySet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f107146x) || !Float.isNaN(points.f107146x)) {
            keySet.add("progress");
        }
        if (e(this.f107129g, points.f107129g)) {
            keySet.add("rotationX");
        }
        if (e(this.f107130h, points.f107130h)) {
            keySet.add("rotationY");
        }
        if (e(this.f107133k, points.f107133k)) {
            keySet.add(f.f106852l);
        }
        if (e(this.f107134l, points.f107134l)) {
            keySet.add(f.f106853m);
        }
        if (e(this.f107131i, points.f107131i)) {
            keySet.add("scaleX");
        }
        if (e(this.f107132j, points.f107132j)) {
            keySet.add("scaleY");
        }
        if (e(this.f107135m, points.f107135m)) {
            keySet.add("translationX");
        }
        if (e(this.f107136n, points.f107136n)) {
            keySet.add("translationY");
        }
        if (e(this.f107137o, points.f107137o)) {
            keySet.add("translationZ");
        }
    }

    public void g(n points, boolean[] mask, String[] custom) {
        mask[0] = mask[0] | e(this.f107140r, points.f107140r);
        mask[1] = mask[1] | e(this.f107141s, points.f107141s);
        mask[2] = mask[2] | e(this.f107142t, points.f107142t);
        mask[3] = mask[3] | e(this.f107143u, points.f107143u);
        mask[4] = e(this.f107144v, points.f107144v) | mask[4];
    }

    public void h(double[] data, int[] toUse) {
        int i10 = 0;
        float[] fArr = {this.f107140r, this.f107141s, this.f107142t, this.f107143u, this.f107144v, this.f107123a, this.f107127e, this.f107128f, this.f107129g, this.f107130h, this.f107131i, this.f107132j, this.f107133k, this.f107134l, this.f107135m, this.f107136n, this.f107137o, this.f107145w};
        for (int i11 : toUse) {
            if (i11 < 18) {
                data[i10] = fArr[r4];
                i10++;
            }
        }
    }

    public int i(String name, double[] value, int offset) {
        ConstraintAttribute constraintAttribute = this.f107148z.get(name);
        if (constraintAttribute.p() == 1) {
            value[offset] = constraintAttribute.k();
            return 1;
        }
        int iP = constraintAttribute.p();
        constraintAttribute.l(new float[iP]);
        int i10 = 0;
        while (i10 < iP) {
            value[offset] = r1[i10];
            i10++;
            offset++;
        }
        return iP;
    }

    public int j(String name) {
        return this.f107148z.get(name).p();
    }

    public boolean k(String name) {
        return this.f107148z.containsKey(name);
    }

    public void l(float x10, float y10, float w10, float h10) {
        this.f107141s = x10;
        this.f107142t = y10;
        this.f107143u = w10;
        this.f107144v = h10;
    }

    public void m(Rect rect, View view, int rotation, float prevous) {
        l(rect.left, rect.top, rect.width(), rect.height());
        b(view);
        this.f107133k = Float.NaN;
        this.f107134l = Float.NaN;
        if (rotation == 1) {
            this.f107128f = prevous - 90.0f;
        } else {
            if (rotation != 2) {
                return;
            }
            this.f107128f = prevous + 90.0f;
        }
    }

    public void n(Rect cw, androidx.constraintlayout.widget.d constraintSet, int rotation, int viewId) {
        l(cw.left, cw.top, cw.width(), cw.height());
        c(constraintSet.q0(viewId));
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    if (rotation != 4) {
                        return;
                    }
                }
            }
            float f10 = this.f107128f + 90.0f;
            this.f107128f = f10;
            if (f10 > 180.0f) {
                this.f107128f = f10 - 360.0f;
                return;
            }
            return;
        }
        this.f107128f -= 90.0f;
    }

    public void p(View view) {
        l(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }
}
