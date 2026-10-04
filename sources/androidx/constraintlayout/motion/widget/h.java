package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.g;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import w0.AbstractC5734c;
import w0.AbstractC5735d;

/* JADX INFO: loaded from: classes2.dex */
public class h extends f {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String f106912X = "KeyCycle";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f106913Y = "KeyCycle";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f106914Z = "wavePeriod";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f106915a0 = "waveOffset";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f106916b0 = "wavePhase";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f106917c0 = "waveShape";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f106918d0 = 0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f106919e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f106920f0 = 2;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f106921g0 = 3;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f106922h0 = 4;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f106923i0 = 5;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f106924j0 = 6;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f106925k0 = 4;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f106926D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f106927E = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f106928F = -1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f106929G = null;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f106930H = Float.NaN;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f106931I = 0.0f;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f106932J = 0.0f;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f106933K = Float.NaN;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f106934L = -1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f106935M = Float.NaN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f106936N = Float.NaN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f106937O = Float.NaN;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f106938P = Float.NaN;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f106939Q = Float.NaN;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f106940R = Float.NaN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f106941S = Float.NaN;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f106942T = Float.NaN;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f106943U = Float.NaN;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f106944V = Float.NaN;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f106945W = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f106946a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f106947b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f106948c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f106949d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f106950e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f106951f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f106952g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f106953h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f106954i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f106955j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f106956k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f106957l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f106958m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f106959n = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f106960o = 15;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f106961p = 16;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f106962q = 17;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f106963r = 18;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f106964s = 19;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f106965t = 20;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f106966u = 21;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static SparseIntArray f106967v;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f106967v = sparseIntArray;
            sparseIntArray.append(g.m.tf, 1);
            f106967v.append(g.m.rf, 2);
            f106967v.append(g.m.uf, 3);
            f106967v.append(g.m.qf, 4);
            f106967v.append(g.m.zf, 5);
            f106967v.append(g.m.xf, 6);
            f106967v.append(g.m.wf, 7);
            f106967v.append(g.m.Af, 8);
            f106967v.append(g.m.ff, 9);
            f106967v.append(g.m.pf, 10);
            f106967v.append(g.m.lf, 11);
            f106967v.append(g.m.mf, 12);
            f106967v.append(g.m.nf, 13);
            f106967v.append(g.m.vf, 14);
            f106967v.append(g.m.jf, 15);
            f106967v.append(g.m.kf, 16);
            f106967v.append(g.m.gf, 17);
            f106967v.append(g.m.hf, 18);
            f106967v.append(g.m.of, 19);
            f106967v.append(g.m.sf, 20);
            f106967v.append(g.m.yf, 21);
        }

        public static void b(h c10, TypedArray a10) {
            int indexCount = a10.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = a10.getIndex(i10);
                switch (f106967v.get(index)) {
                    case 1:
                        if (MotionLayout.f106695O0) {
                            int resourceId = a10.getResourceId(index, c10.f106868b);
                            c10.f106868b = resourceId;
                            if (resourceId == -1) {
                                c10.f106869c = a10.getString(index);
                            }
                        } else if (a10.peekValue(index).type == 3) {
                            c10.f106869c = a10.getString(index);
                        } else {
                            c10.f106868b = a10.getResourceId(index, c10.f106868b);
                        }
                        break;
                    case 2:
                        c10.f106867a = a10.getInt(index, c10.f106867a);
                        break;
                    case 3:
                        c10.f106926D = a10.getString(index);
                        break;
                    case 4:
                        c10.f106927E = a10.getInteger(index, c10.f106927E);
                        break;
                    case 5:
                        if (a10.peekValue(index).type == 3) {
                            c10.f106929G = a10.getString(index);
                            c10.f106928F = 7;
                        } else {
                            c10.f106928F = a10.getInt(index, c10.f106928F);
                        }
                        break;
                    case 6:
                        c10.f106930H = a10.getFloat(index, c10.f106930H);
                        break;
                    case 7:
                        if (a10.peekValue(index).type == 5) {
                            c10.f106931I = a10.getDimension(index, c10.f106931I);
                        } else {
                            c10.f106931I = a10.getFloat(index, c10.f106931I);
                        }
                        break;
                    case 8:
                        c10.f106934L = a10.getInt(index, c10.f106934L);
                        break;
                    case 9:
                        c10.f106935M = a10.getFloat(index, c10.f106935M);
                        break;
                    case 10:
                        c10.f106936N = a10.getDimension(index, c10.f106936N);
                        break;
                    case 11:
                        c10.f106937O = a10.getFloat(index, c10.f106937O);
                        break;
                    case 12:
                        c10.f106939Q = a10.getFloat(index, c10.f106939Q);
                        break;
                    case 13:
                        c10.f106940R = a10.getFloat(index, c10.f106940R);
                        break;
                    case 14:
                        c10.f106938P = a10.getFloat(index, c10.f106938P);
                        break;
                    case 15:
                        c10.f106941S = a10.getFloat(index, c10.f106941S);
                        break;
                    case 16:
                        c10.f106942T = a10.getFloat(index, c10.f106942T);
                        break;
                    case 17:
                        c10.f106943U = a10.getDimension(index, c10.f106943U);
                        break;
                    case 18:
                        c10.f106944V = a10.getDimension(index, c10.f106944V);
                        break;
                    case 19:
                        c10.f106945W = a10.getDimension(index, c10.f106945W);
                        break;
                    case 20:
                        c10.f106933K = a10.getFloat(index, c10.f106933K);
                        break;
                    case 21:
                        c10.f106932J = a10.getFloat(index, c10.f106932J) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f106967v.get(index));
                        break;
                }
            }
        }
    }

    public h() {
        this.f106870d = 4;
        this.f106871e = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, AbstractC5735d> splines) {
        C2377c.n("KeyCycle", "add " + splines.size() + " values", 2);
        for (String str : splines.keySet()) {
            AbstractC5735d abstractC5735d = splines.get(str);
            if (abstractC5735d != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        abstractC5735d.g(this.f106867a, this.f106939Q);
                        break;
                    case "rotationY":
                        abstractC5735d.g(this.f106867a, this.f106940R);
                        break;
                    case "translationX":
                        abstractC5735d.g(this.f106867a, this.f106943U);
                        break;
                    case "translationY":
                        abstractC5735d.g(this.f106867a, this.f106944V);
                        break;
                    case "translationZ":
                        abstractC5735d.g(this.f106867a, this.f106945W);
                        break;
                    case "progress":
                        abstractC5735d.g(this.f106867a, this.f106933K);
                        break;
                    case "scaleX":
                        abstractC5735d.g(this.f106867a, this.f106941S);
                        break;
                    case "scaleY":
                        abstractC5735d.g(this.f106867a, this.f106942T);
                        break;
                    case "rotation":
                        abstractC5735d.g(this.f106867a, this.f106937O);
                        break;
                    case "elevation":
                        abstractC5735d.g(this.f106867a, this.f106936N);
                        break;
                    case "transitionPathRotate":
                        abstractC5735d.g(this.f106867a, this.f106938P);
                        break;
                    case "alpha":
                        abstractC5735d.g(this.f106867a, this.f106935M);
                        break;
                    case "waveOffset":
                        abstractC5735d.g(this.f106867a, this.f106931I);
                        break;
                    case "wavePhase":
                        abstractC5735d.g(this.f106867a, this.f106932J);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  ".concat(str));
                            break;
                        }
                        break;
                }
            }
        }
    }

    public void a0(HashMap<String, AbstractC5734c> oscSet) {
        AbstractC5734c abstractC5734c;
        AbstractC5734c abstractC5734c2;
        for (String str : oscSet.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.f106871e.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.j() == ConstraintAttribute.AttributeType.FLOAT_TYPE && (abstractC5734c = oscSet.get(str)) != null) {
                    abstractC5734c.g(this.f106867a, this.f106928F, this.f106929G, this.f106934L, this.f106930H, this.f106931I, this.f106932J, constraintAttribute.k(), constraintAttribute);
                }
            } else {
                float fB0 = b0(str);
                if (!Float.isNaN(fB0) && (abstractC5734c2 = oscSet.get(str)) != null) {
                    abstractC5734c2.f(this.f106867a, this.f106928F, this.f106929G, this.f106934L, this.f106930H, this.f106931I, this.f106932J, fB0);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        h hVar = new h();
        hVar.c(this);
        return hVar;
    }

    public float b0(String key) {
        key.getClass();
        switch (key) {
            case "rotationX":
                return this.f106939Q;
            case "rotationY":
                return this.f106940R;
            case "translationX":
                return this.f106943U;
            case "translationY":
                return this.f106944V;
            case "translationZ":
                return this.f106945W;
            case "progress":
                return this.f106933K;
            case "scaleX":
                return this.f106941S;
            case "scaleY":
                return this.f106942T;
            case "rotation":
                return this.f106937O;
            case "elevation":
                return this.f106936N;
            case "transitionPathRotate":
                return this.f106938P;
            case "alpha":
                return this.f106935M;
            case "waveOffset":
                return this.f106931I;
            case "wavePhase":
                return this.f106932J;
            default:
                if (key.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  ".concat(key));
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f src) {
        super.c(src);
        h hVar = (h) src;
        this.f106926D = hVar.f106926D;
        this.f106927E = hVar.f106927E;
        this.f106928F = hVar.f106928F;
        this.f106929G = hVar.f106929G;
        this.f106930H = hVar.f106930H;
        this.f106931I = hVar.f106931I;
        this.f106932J = hVar.f106932J;
        this.f106933K = hVar.f106933K;
        this.f106934L = hVar.f106934L;
        this.f106935M = hVar.f106935M;
        this.f106936N = hVar.f106936N;
        this.f106937O = hVar.f106937O;
        this.f106938P = hVar.f106938P;
        this.f106939Q = hVar.f106939Q;
        this.f106940R = hVar.f106940R;
        this.f106941S = hVar.f106941S;
        this.f106942T = hVar.f106942T;
        this.f106943U = hVar.f106943U;
        this.f106944V = hVar.f106944V;
        this.f106945W = hVar.f106945W;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.f106935M)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.f106936N)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.f106937O)) {
            attributes.add(f.f106849i);
        }
        if (!Float.isNaN(this.f106939Q)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.f106940R)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.f106941S)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.f106942T)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.f106938P)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f106943U)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.f106944V)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.f106945W)) {
            attributes.add("translationZ");
        }
        if (this.f106871e.size() > 0) {
            Iterator<String> it = this.f106871e.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attrs) {
        a.b(this, context.obtainStyledAttributes(attrs, g.m.ef));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String tag, Object value) {
        tag.getClass();
        byte b10 = -1;
        switch (tag.hashCode()) {
            case -1913008125:
                if (tag.equals(f.f106843A)) {
                    b10 = 0;
                }
                break;
            case -1812823328:
                if (tag.equals("transitionEasing")) {
                    b10 = 1;
                }
                break;
            case -1249320806:
                if (tag.equals("rotationX")) {
                    b10 = 2;
                }
                break;
            case -1249320805:
                if (tag.equals("rotationY")) {
                    b10 = 3;
                }
                break;
            case -1225497657:
                if (tag.equals("translationX")) {
                    b10 = 4;
                }
                break;
            case -1225497656:
                if (tag.equals("translationY")) {
                    b10 = 5;
                }
                break;
            case -1225497655:
                if (tag.equals("translationZ")) {
                    b10 = 6;
                }
                break;
            case -908189618:
                if (tag.equals("scaleX")) {
                    b10 = 7;
                }
                break;
            case -908189617:
                if (tag.equals("scaleY")) {
                    b10 = 8;
                }
                break;
            case -40300674:
                if (tag.equals(f.f106849i)) {
                    b10 = 9;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    b10 = 10;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    b10 = 11;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
                    b10 = 12;
                }
                break;
            case 156108012:
                if (tag.equals("waveOffset")) {
                    b10 = 13;
                }
                break;
            case 184161818:
                if (tag.equals("wavePeriod")) {
                    b10 = Ascii.SO;
                }
                break;
            case 579057826:
                if (tag.equals("curveFit")) {
                    b10 = Ascii.SI;
                }
                break;
            case 1530034690:
                if (tag.equals("wavePhase")) {
                    b10 = 16;
                }
                break;
            case 1532805160:
                if (tag.equals("waveShape")) {
                    b10 = 17;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.f106933K = m(value);
                break;
            case 1:
                this.f106926D = value.toString();
                break;
            case 2:
                this.f106939Q = m(value);
                break;
            case 3:
                this.f106940R = m(value);
                break;
            case 4:
                this.f106943U = m(value);
                break;
            case 5:
                this.f106944V = m(value);
                break;
            case 6:
                this.f106945W = m(value);
                break;
            case 7:
                this.f106941S = m(value);
                break;
            case 8:
                this.f106942T = m(value);
                break;
            case 9:
                this.f106937O = m(value);
                break;
            case 10:
                this.f106936N = m(value);
                break;
            case 11:
                this.f106938P = m(value);
                break;
            case 12:
                this.f106935M = m(value);
                break;
            case 13:
                this.f106931I = m(value);
                break;
            case 14:
                this.f106930H = m(value);
                break;
            case 15:
                this.f106927E = n(value);
                break;
            case 16:
                this.f106932J = m(value);
                break;
            case 17:
                if (!(value instanceof Integer)) {
                    this.f106928F = 7;
                    this.f106929G = value.toString();
                } else {
                    this.f106928F = n(value);
                }
                break;
        }
    }
}
