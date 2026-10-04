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
import w0.AbstractC5735d;
import w0.AbstractC5737f;

/* JADX INFO: loaded from: classes2.dex */
public class l extends f {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f107014V = "KeyTimeCycle";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f107015W = "KeyTimeCycle";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String f107016X = "wavePeriod";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f107017Y = "waveOffset";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f107018Z = "waveShape";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f107019a0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f107020b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f107021c0 = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f107022d0 = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f107023e0 = 4;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f107024f0 = 5;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f107025g0 = 6;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f107026h0 = 3;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f107027D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f107028E = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f107029F = Float.NaN;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f107030G = Float.NaN;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f107031H = Float.NaN;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f107032I = Float.NaN;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f107033J = Float.NaN;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f107034K = Float.NaN;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f107035L = Float.NaN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f107036M = Float.NaN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f107037N = Float.NaN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f107038O = Float.NaN;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f107039P = Float.NaN;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f107040Q = Float.NaN;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f107041R = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f107042S = null;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f107043T = Float.NaN;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f107044U = 0.0f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f107045a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f107046b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f107047c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f107048d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f107049e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f107050f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f107051g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f107052h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f107053i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f107054j = 12;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f107055k = 13;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f107056l = 14;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f107057m = 15;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f107058n = 16;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f107059o = 17;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f107060p = 18;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f107061q = 19;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f107062r = 20;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f107063s = 21;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static SparseIntArray f107064t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f107064t = sparseIntArray;
            sparseIntArray.append(g.m.Sf, 1);
            f107064t.append(g.m.bg, 2);
            f107064t.append(g.m.Xf, 4);
            f107064t.append(g.m.Yf, 5);
            f107064t.append(g.m.Zf, 6);
            f107064t.append(g.m.Vf, 7);
            f107064t.append(g.m.hg, 8);
            f107064t.append(g.m.gg, 9);
            f107064t.append(g.m.fg, 10);
            f107064t.append(g.m.dg, 12);
            f107064t.append(g.m.cg, 13);
            f107064t.append(g.m.Wf, 14);
            f107064t.append(g.m.Tf, 15);
            f107064t.append(g.m.Uf, 16);
            f107064t.append(g.m.ag, 17);
            f107064t.append(g.m.eg, 18);
            f107064t.append(g.m.kg, 20);
            f107064t.append(g.m.jg, 21);
            f107064t.append(g.m.mg, 19);
        }

        public static void a(l c10, TypedArray a10) {
            int indexCount = a10.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = a10.getIndex(i10);
                switch (f107064t.get(index)) {
                    case 1:
                        c10.f107029F = a10.getFloat(index, c10.f107029F);
                        break;
                    case 2:
                        c10.f107030G = a10.getDimension(index, c10.f107030G);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f107064t.get(index));
                        break;
                    case 4:
                        c10.f107031H = a10.getFloat(index, c10.f107031H);
                        break;
                    case 5:
                        c10.f107032I = a10.getFloat(index, c10.f107032I);
                        break;
                    case 6:
                        c10.f107033J = a10.getFloat(index, c10.f107033J);
                        break;
                    case 7:
                        c10.f107035L = a10.getFloat(index, c10.f107035L);
                        break;
                    case 8:
                        c10.f107034K = a10.getFloat(index, c10.f107034K);
                        break;
                    case 9:
                        c10.f107027D = a10.getString(index);
                        break;
                    case 10:
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
                    case 12:
                        c10.f106867a = a10.getInt(index, c10.f106867a);
                        break;
                    case 13:
                        c10.f107028E = a10.getInteger(index, c10.f107028E);
                        break;
                    case 14:
                        c10.f107036M = a10.getFloat(index, c10.f107036M);
                        break;
                    case 15:
                        c10.f107037N = a10.getDimension(index, c10.f107037N);
                        break;
                    case 16:
                        c10.f107038O = a10.getDimension(index, c10.f107038O);
                        break;
                    case 17:
                        c10.f107039P = a10.getDimension(index, c10.f107039P);
                        break;
                    case 18:
                        c10.f107040Q = a10.getFloat(index, c10.f107040Q);
                        break;
                    case 19:
                        if (a10.peekValue(index).type == 3) {
                            c10.f107042S = a10.getString(index);
                            c10.f107041R = 7;
                        } else {
                            c10.f107041R = a10.getInt(index, c10.f107041R);
                        }
                        break;
                    case 20:
                        c10.f107043T = a10.getFloat(index, c10.f107043T);
                        break;
                    case 21:
                        if (a10.peekValue(index).type == 5) {
                            c10.f107044U = a10.getDimension(index, c10.f107044U);
                        } else {
                            c10.f107044U = a10.getFloat(index, c10.f107044U);
                        }
                        break;
                }
            }
        }
    }

    public l() {
        this.f106870d = 3;
        this.f106871e = new HashMap<>();
    }

    public void W(HashMap<String, AbstractC5737f> splines) {
        for (String str : splines.keySet()) {
            AbstractC5737f abstractC5737f = splines.get(str);
            if (abstractC5737f != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f107032I)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107032I, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f107033J)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107033J, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f107037N)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107037N, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f107038O)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107038O, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f107039P)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107039P, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f107040Q)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107040Q, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f107035L)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107035L, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f107036M)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107036M, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f107031H)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107031H, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f107030G)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107030G, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f107034K)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107034K, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f107029F)) {
                                break;
                            } else {
                                abstractC5737f.c(this.f106867a, this.f107029F, this.f107043T, this.f107041R, this.f107044U);
                                break;
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f106871e.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((AbstractC5737f.b) abstractC5737f).k(this.f106867a, constraintAttribute, this.f107043T, this.f107041R, this.f107044U);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, AbstractC5735d> splines) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        l lVar = new l();
        lVar.c(this);
        return lVar;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f src) {
        super.c(src);
        l lVar = (l) src;
        this.f107027D = lVar.f107027D;
        this.f107028E = lVar.f107028E;
        this.f107041R = lVar.f107041R;
        this.f107043T = lVar.f107043T;
        this.f107044U = lVar.f107044U;
        this.f107040Q = lVar.f107040Q;
        this.f107029F = lVar.f107029F;
        this.f107030G = lVar.f107030G;
        this.f107031H = lVar.f107031H;
        this.f107034K = lVar.f107034K;
        this.f107032I = lVar.f107032I;
        this.f107033J = lVar.f107033J;
        this.f107035L = lVar.f107035L;
        this.f107036M = lVar.f107036M;
        this.f107037N = lVar.f107037N;
        this.f107038O = lVar.f107038O;
        this.f107039P = lVar.f107039P;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.f107029F)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.f107030G)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.f107031H)) {
            attributes.add(f.f106849i);
        }
        if (!Float.isNaN(this.f107032I)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.f107033J)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.f107037N)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.f107038O)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.f107039P)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.f107034K)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f107035L)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.f107036M)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.f107040Q)) {
            attributes.add("progress");
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
        a.a(this, context.obtainStyledAttributes(attrs, g.m.Rf));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void i(HashMap<String, Integer> interpolation) {
        if (this.f107028E == -1) {
            return;
        }
        if (!Float.isNaN(this.f107029F)) {
            interpolation.put("alpha", Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107030G)) {
            interpolation.put("elevation", Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107031H)) {
            interpolation.put(f.f106849i, Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107032I)) {
            interpolation.put("rotationX", Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107033J)) {
            interpolation.put("rotationY", Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107037N)) {
            interpolation.put("translationX", Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107038O)) {
            interpolation.put("translationY", Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107039P)) {
            interpolation.put("translationZ", Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107034K)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107035L)) {
            interpolation.put("scaleX", Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107035L)) {
            interpolation.put("scaleY", Integer.valueOf(this.f107028E));
        }
        if (!Float.isNaN(this.f107040Q)) {
            interpolation.put("progress", Integer.valueOf(this.f107028E));
        }
        if (this.f106871e.size() > 0) {
            Iterator<String> it = this.f106871e.keySet().iterator();
            while (it.hasNext()) {
                interpolation.put(w.y.a("CUSTOM,", it.next()), Integer.valueOf(this.f107028E));
            }
        }
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
            case 1532805160:
                if (tag.equals("waveShape")) {
                    b10 = 16;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.f107040Q = m(value);
                break;
            case 1:
                this.f107027D = value.toString();
                break;
            case 2:
                this.f107032I = m(value);
                break;
            case 3:
                this.f107033J = m(value);
                break;
            case 4:
                this.f107037N = m(value);
                break;
            case 5:
                this.f107038O = m(value);
                break;
            case 6:
                this.f107039P = m(value);
                break;
            case 7:
                this.f107035L = m(value);
                break;
            case 8:
                this.f107036M = m(value);
                break;
            case 9:
                this.f107031H = m(value);
                break;
            case 10:
                this.f107030G = m(value);
                break;
            case 11:
                this.f107034K = m(value);
                break;
            case 12:
                this.f107029F = m(value);
                break;
            case 13:
                this.f107044U = m(value);
                break;
            case 14:
                this.f107043T = m(value);
                break;
            case 15:
                this.f107028E = n(value);
                break;
            case 16:
                if (!(value instanceof Integer)) {
                    this.f107041R = 7;
                    this.f107042S = value.toString();
                } else {
                    this.f107041R = n(value);
                }
                break;
        }
    }
}
