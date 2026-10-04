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

/* JADX INFO: loaded from: classes2.dex */
public class g extends f {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f106872U = "KeyAttribute";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f106873V = "KeyAttributes";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final boolean f106874W = false;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f106875X = 1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f106876D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f106877E = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f106878F = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f106879G = Float.NaN;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f106880H = Float.NaN;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f106881I = Float.NaN;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f106882J = Float.NaN;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f106883K = Float.NaN;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f106884L = Float.NaN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f106885M = Float.NaN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f106886N = Float.NaN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f106887O = Float.NaN;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f106888P = Float.NaN;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f106889Q = Float.NaN;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f106890R = Float.NaN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f106891S = Float.NaN;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f106892T = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f106893a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f106894b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f106895c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f106896d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f106897e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f106898f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f106899g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f106900h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f106901i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f106902j = 12;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f106903k = 13;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f106904l = 14;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f106905m = 15;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f106906n = 16;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f106907o = 17;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f106908p = 18;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f106909q = 19;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f106910r = 20;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static SparseIntArray f106911s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f106911s = sparseIntArray;
            sparseIntArray.append(g.m.Le, 1);
            f106911s.append(g.m.We, 2);
            f106911s.append(g.m.Se, 4);
            f106911s.append(g.m.Te, 5);
            f106911s.append(g.m.Ue, 6);
            f106911s.append(g.m.Me, 19);
            f106911s.append(g.m.Ne, 20);
            f106911s.append(g.m.Qe, 7);
            f106911s.append(g.m.df, 8);
            f106911s.append(g.m.cf, 9);
            f106911s.append(g.m.af, 10);
            f106911s.append(g.m.Ye, 12);
            f106911s.append(g.m.Xe, 13);
            f106911s.append(g.m.Re, 14);
            f106911s.append(g.m.Oe, 15);
            f106911s.append(g.m.Pe, 16);
            f106911s.append(g.m.Ve, 17);
            f106911s.append(g.m.Ze, 18);
        }

        public static void a(g c10, TypedArray a10) {
            int indexCount = a10.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = a10.getIndex(i10);
                switch (f106911s.get(index)) {
                    case 1:
                        c10.f106879G = a10.getFloat(index, c10.f106879G);
                        break;
                    case 2:
                        c10.f106880H = a10.getDimension(index, c10.f106880H);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f106911s.get(index));
                        break;
                    case 4:
                        c10.f106881I = a10.getFloat(index, c10.f106881I);
                        break;
                    case 5:
                        c10.f106882J = a10.getFloat(index, c10.f106882J);
                        break;
                    case 6:
                        c10.f106883K = a10.getFloat(index, c10.f106883K);
                        break;
                    case 7:
                        c10.f106887O = a10.getFloat(index, c10.f106887O);
                        break;
                    case 8:
                        c10.f106886N = a10.getFloat(index, c10.f106886N);
                        break;
                    case 9:
                        c10.f106876D = a10.getString(index);
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
                        c10.f106877E = a10.getInteger(index, c10.f106877E);
                        break;
                    case 14:
                        c10.f106888P = a10.getFloat(index, c10.f106888P);
                        break;
                    case 15:
                        c10.f106889Q = a10.getDimension(index, c10.f106889Q);
                        break;
                    case 16:
                        c10.f106890R = a10.getDimension(index, c10.f106890R);
                        break;
                    case 17:
                        c10.f106891S = a10.getDimension(index, c10.f106891S);
                        break;
                    case 18:
                        c10.f106892T = a10.getFloat(index, c10.f106892T);
                        break;
                    case 19:
                        c10.f106884L = a10.getDimension(index, c10.f106884L);
                        break;
                    case 20:
                        c10.f106885M = a10.getDimension(index, c10.f106885M);
                        break;
                }
            }
        }
    }

    public g() {
        this.f106870d = 1;
        this.f106871e = new HashMap<>();
    }

    public int T() {
        return this.f106877E;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, AbstractC5735d> splines) {
        for (String str : splines.keySet()) {
            AbstractC5735d abstractC5735d = splines.get(str);
            if (abstractC5735d != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f106882J)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106882J);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f106883K)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106883K);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f106889Q)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106889Q);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f106890R)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106890R);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f106891S)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106891S);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f106892T)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106892T);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f106887O)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106887O);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f106888P)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106888P);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f106882J)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106884L);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f106883K)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106885M);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f106881I)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106881I);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f106880H)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106880H);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f106886N)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106886N);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f106879G)) {
                                break;
                            } else {
                                abstractC5735d.g(this.f106867a, this.f106879G);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f106871e.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((AbstractC5735d.b) abstractC5735d).n(this.f106867a, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        g gVar = new g();
        gVar.c(this);
        return gVar;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f src) {
        super.c(src);
        g gVar = (g) src;
        this.f106877E = gVar.f106877E;
        this.f106878F = gVar.f106878F;
        this.f106879G = gVar.f106879G;
        this.f106880H = gVar.f106880H;
        this.f106881I = gVar.f106881I;
        this.f106882J = gVar.f106882J;
        this.f106883K = gVar.f106883K;
        this.f106884L = gVar.f106884L;
        this.f106885M = gVar.f106885M;
        this.f106886N = gVar.f106886N;
        this.f106887O = gVar.f106887O;
        this.f106888P = gVar.f106888P;
        this.f106889Q = gVar.f106889Q;
        this.f106890R = gVar.f106890R;
        this.f106891S = gVar.f106891S;
        this.f106892T = gVar.f106892T;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.f106879G)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.f106880H)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.f106881I)) {
            attributes.add(f.f106849i);
        }
        if (!Float.isNaN(this.f106882J)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.f106883K)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.f106884L)) {
            attributes.add(f.f106852l);
        }
        if (!Float.isNaN(this.f106885M)) {
            attributes.add(f.f106853m);
        }
        if (!Float.isNaN(this.f106889Q)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.f106890R)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.f106891S)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.f106886N)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f106887O)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.f106888P)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.f106892T)) {
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
        a.a(this, context.obtainStyledAttributes(attrs, g.m.Ke));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void i(HashMap<String, Integer> interpolation) {
        if (this.f106877E == -1) {
            return;
        }
        if (!Float.isNaN(this.f106879G)) {
            interpolation.put("alpha", Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106880H)) {
            interpolation.put("elevation", Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106881I)) {
            interpolation.put(f.f106849i, Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106882J)) {
            interpolation.put("rotationX", Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106883K)) {
            interpolation.put("rotationY", Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106884L)) {
            interpolation.put(f.f106852l, Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106885M)) {
            interpolation.put(f.f106853m, Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106889Q)) {
            interpolation.put("translationX", Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106890R)) {
            interpolation.put("translationY", Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106891S)) {
            interpolation.put("translationZ", Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106886N)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106887O)) {
            interpolation.put("scaleX", Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106888P)) {
            interpolation.put("scaleY", Integer.valueOf(this.f106877E));
        }
        if (!Float.isNaN(this.f106892T)) {
            interpolation.put("progress", Integer.valueOf(this.f106877E));
        }
        if (this.f106871e.size() > 0) {
            Iterator<String> it = this.f106871e.keySet().iterator();
            while (it.hasNext()) {
                interpolation.put(w.y.a("CUSTOM,", it.next()), Integer.valueOf(this.f106877E));
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
            case -760884510:
                if (tag.equals(f.f106852l)) {
                    b10 = 9;
                }
                break;
            case -760884509:
                if (tag.equals(f.f106853m)) {
                    b10 = 10;
                }
                break;
            case -40300674:
                if (tag.equals(f.f106849i)) {
                    b10 = 11;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    b10 = 12;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    b10 = 13;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
                    b10 = Ascii.SO;
                }
                break;
            case 579057826:
                if (tag.equals("curveFit")) {
                    b10 = Ascii.SI;
                }
                break;
            case 1941332754:
                if (tag.equals("visibility")) {
                    b10 = 16;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.f106892T = m(value);
                break;
            case 1:
                this.f106876D = value.toString();
                break;
            case 2:
                this.f106882J = m(value);
                break;
            case 3:
                this.f106883K = m(value);
                break;
            case 4:
                this.f106889Q = m(value);
                break;
            case 5:
                this.f106890R = m(value);
                break;
            case 6:
                this.f106891S = m(value);
                break;
            case 7:
                this.f106887O = m(value);
                break;
            case 8:
                this.f106888P = m(value);
                break;
            case 9:
                this.f106884L = m(value);
                break;
            case 10:
                this.f106885M = m(value);
                break;
            case 11:
                this.f106881I = m(value);
                break;
            case 12:
                this.f106880H = m(value);
                break;
            case 13:
                this.f106886N = m(value);
                break;
            case 14:
                this.f106879G = m(value);
                break;
            case 15:
                this.f106877E = n(value);
                break;
            case 16:
                this.f106878F = l(value);
                break;
        }
    }
}
