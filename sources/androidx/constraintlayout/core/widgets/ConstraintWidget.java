package androidx.constraintlayout.core.widgets;

import C4.q;
import U6.j;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.o;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.k;
import androidx.constraintlayout.core.widgets.analyzer.m;
import com.bumptech.glide.load.engine.GlideException;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final boolean f106111U0 = false;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final int f106112V0 = 1;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final int f106113W0 = 2;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final boolean f106114X0 = false;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final int f106115Y0 = 0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final int f106116Z0 = 1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f106117a1 = 2;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f106118b1 = 3;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f106119c1 = 4;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f106120d1 = -1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f106121e1 = 0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f106122f1 = 1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f106123g1 = 2;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f106124h1 = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f106125i1 = 4;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f106126j1 = 8;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int f106127k1 = 0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f106128l1 = 1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f106129m1 = 2;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f106130n1 = 0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int f106131o1 = 1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f106132p1 = 2;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int f106133q1 = 3;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f106134r1 = -2;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int f106135s1 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f106136t1 = 1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final int f106137u1 = 2;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final int f106138v1 = 3;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int f106139w1 = 4;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f106140x1 = 0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f106141y1 = 1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static float f106142z1 = 0.5f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f106143A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f106144A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f106145B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f106146B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f106147C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f106148C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f106149D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f106150D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f106151E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f106152E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f106153F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f106154F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f106155G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f106156G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f106157H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f106158H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f106159I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f106160I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int[] f106161J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f106162J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f106163K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f106164K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f106165L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f106166L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f106167M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f106168M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f106169N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public float[] f106170N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f106171O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public ConstraintWidget[] f106172O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f106173P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public ConstraintWidget[] f106174P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ConstraintAnchor f106175Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public ConstraintWidget f106176Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ConstraintAnchor f106177R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public ConstraintWidget f106178R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ConstraintAnchor f106179S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f106180S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ConstraintAnchor f106181T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f106182T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ConstraintAnchor f106183U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ConstraintAnchor f106184V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ConstraintAnchor f106185W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ConstraintAnchor f106186X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ConstraintAnchor[] f106187Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ArrayList<ConstraintAnchor> f106188Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f106189a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean[] f106190a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WidgetRun[] f106191b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public DimensionBehaviour[] f106192b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f106193c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ConstraintWidget f106194c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f106195d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f106196d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f106197e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f106198e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f106199f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f106200f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f106201g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f106202g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f106203h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f106204h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f106205i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f106206i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f106207j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f106208j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f106209k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f106210k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f106211l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f106212l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f106213m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f106214m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f106215n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f106216n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f106217o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f106218o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f106219p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f106220p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f106221q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f106222q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f106223r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f106224r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f106225s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Object f106226s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f106227t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f106228t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f106229u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f106230u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f106231v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f106232v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f106233w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f106234w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f106235x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f106236x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f106237y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f106238y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f106239z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f106240z0;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f106242b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f106242b = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106242b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106242b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106242b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f106241a = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f106241a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f106241a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f106241a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f106241a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f106241a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f106241a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f106241a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f106241a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        this.f106189a = false;
        this.f106191b = new WidgetRun[2];
        this.f106197e = null;
        this.f106199f = null;
        this.f106201g = new boolean[]{true, true};
        this.f106203h = false;
        this.f106205i = true;
        this.f106207j = false;
        this.f106209k = true;
        this.f106211l = -1;
        this.f106213m = -1;
        this.f106215n = new o(this);
        this.f106219p = false;
        this.f106221q = false;
        this.f106223r = false;
        this.f106225s = false;
        this.f106227t = -1;
        this.f106229u = -1;
        this.f106231v = 0;
        this.f106233w = 0;
        this.f106235x = 0;
        this.f106237y = new int[2];
        this.f106239z = 0;
        this.f106143A = 0;
        this.f106145B = 1.0f;
        this.f106147C = 0;
        this.f106149D = 0;
        this.f106151E = 1.0f;
        this.f106157H = -1;
        this.f106159I = 1.0f;
        this.f106161J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f106163K = 0.0f;
        this.f106165L = false;
        this.f106169N = false;
        this.f106171O = 0;
        this.f106173P = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f106175Q = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f106177R = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f106179S = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f106181T = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f106183U = constraintAnchor5;
        this.f106184V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f106185W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f106186X = constraintAnchor6;
        this.f106187Y = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.f106188Z = new ArrayList<>();
        this.f106190a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f106192b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f106194c0 = null;
        this.f106196d0 = 0;
        this.f106198e0 = 0;
        this.f106200f0 = 0.0f;
        this.f106202g0 = -1;
        this.f106204h0 = 0;
        this.f106206i0 = 0;
        this.f106208j0 = 0;
        this.f106210k0 = 0;
        this.f106212l0 = 0;
        this.f106214m0 = 0;
        this.f106216n0 = 0;
        float f10 = f106142z1;
        this.f106222q0 = f10;
        this.f106224r0 = f10;
        this.f106228t0 = 0;
        this.f106230u0 = 0;
        this.f106232v0 = false;
        this.f106234w0 = null;
        this.f106236x0 = null;
        this.f106160I0 = false;
        this.f106162J0 = 0;
        this.f106164K0 = 0;
        this.f106170N0 = new float[]{-1.0f, -1.0f};
        this.f106172O0 = new ConstraintWidget[]{null, null};
        this.f106174P0 = new ConstraintWidget[]{null, null};
        this.f106176Q0 = null;
        this.f106178R0 = null;
        this.f106180S0 = -1;
        this.f106182T0 = -1;
        d();
    }

    public float A() {
        return this.f106200f0;
    }

    public boolean A0(int i10) {
        return this.f106190a0[i10];
    }

    public void A1(float f10) {
        this.f106222q0 = f10;
    }

    public int B() {
        return this.f106202g0;
    }

    public boolean B0() {
        ConstraintAnchor constraintAnchor = this.f106175Q;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f106106f;
        if (constraintAnchor2 != null && constraintAnchor2.f106106f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f106179S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f106106f;
        return constraintAnchor4 != null && constraintAnchor4.f106106f == constraintAnchor3;
    }

    public void B1(int i10) {
        this.f106162J0 = i10;
    }

    public boolean C() {
        return this.f106165L;
    }

    public boolean C0() {
        return this.f106167M;
    }

    public void C1(int i10, int i11) {
        this.f106204h0 = i10;
        int i12 = i11 - i10;
        this.f106196d0 = i12;
        int i13 = this.f106218o0;
        if (i12 < i13) {
            this.f106196d0 = i13;
        }
    }

    public int D() {
        if (this.f106230u0 == 8) {
            return 0;
        }
        return this.f106198e0;
    }

    public boolean D0() {
        ConstraintAnchor constraintAnchor = this.f106177R;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f106106f;
        if (constraintAnchor2 != null && constraintAnchor2.f106106f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f106181T;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f106106f;
        return constraintAnchor4 != null && constraintAnchor4.f106106f == constraintAnchor3;
    }

    public void D1(DimensionBehaviour dimensionBehaviour) {
        this.f106192b0[0] = dimensionBehaviour;
    }

    public float E() {
        return this.f106222q0;
    }

    public boolean E0() {
        return this.f106169N;
    }

    public void E1(int i10, int i11, int i12, float f10) {
        this.f106233w = i10;
        this.f106239z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f106143A = i12;
        this.f106145B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f106233w = 2;
    }

    public ConstraintWidget F() {
        if (!B0()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor constraintAnchorR = constraintWidget.r(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor constraintAnchorK = constraintAnchorR == null ? null : constraintAnchorR.k();
            ConstraintWidget constraintWidgetI = constraintAnchorK == null ? null : constraintAnchorK.i();
            if (constraintWidgetI == U()) {
                return constraintWidget;
            }
            ConstraintAnchor constraintAnchorK2 = constraintWidgetI == null ? null : constraintWidgetI.r(ConstraintAnchor.Type.RIGHT).k();
            if (constraintAnchorK2 == null || constraintAnchorK2.i() == constraintWidget) {
                constraintWidget = constraintWidgetI;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public boolean F0() {
        return this.f106205i && this.f106230u0 != 8;
    }

    public void F1(float f10) {
        this.f106170N0[0] = f10;
    }

    public int G() {
        return this.f106162J0;
    }

    public boolean G0() {
        if (this.f106219p) {
            return true;
        }
        return this.f106175Q.o() && this.f106179S.o();
    }

    public void G1(int i10, boolean z10) {
        this.f106190a0[i10] = z10;
    }

    public DimensionBehaviour H() {
        return this.f106192b0[0];
    }

    public boolean H0() {
        if (this.f106221q) {
            return true;
        }
        return this.f106177R.o() && this.f106181T.o();
    }

    public void H1(boolean z10) {
        this.f106167M = z10;
    }

    public int I() {
        ConstraintAnchor constraintAnchor = this.f106175Q;
        int i10 = constraintAnchor != null ? constraintAnchor.f106107g : 0;
        ConstraintAnchor constraintAnchor2 = this.f106179S;
        return constraintAnchor2 != null ? i10 + constraintAnchor2.f106107g : i10;
    }

    public boolean I0() {
        return this.f106194c0 == null;
    }

    public void I1(boolean z10) {
        this.f106169N = z10;
    }

    public int J() {
        return this.f106171O;
    }

    public boolean J0() {
        return this.f106235x == 0 && this.f106200f0 == 0.0f && this.f106147C == 0 && this.f106149D == 0 && this.f106192b0[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void J1(int i10, int i11) {
        this.f106171O = i10;
        this.f106173P = i11;
        N1(false);
    }

    public int K() {
        return this.f106173P;
    }

    public boolean K0() {
        return this.f106233w == 0 && this.f106200f0 == 0.0f && this.f106239z == 0 && this.f106143A == 0 && this.f106192b0[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void K1(int i10, int i11) {
        if (i11 == 0) {
            c2(i10);
        } else if (i11 == 1) {
            y1(i10);
        }
    }

    public int L() {
        return o0();
    }

    public boolean L0() {
        return this.f106225s;
    }

    public void L1(int i10) {
        this.f106161J[1] = i10;
    }

    public int M(int i10) {
        if (i10 == 0) {
            return m0();
        }
        if (i10 == 1) {
            return D();
        }
        return 0;
    }

    public boolean M0() {
        return this.f106153F;
    }

    public void M1(int i10) {
        this.f106161J[0] = i10;
    }

    public int N() {
        return this.f106161J[1];
    }

    public void N0() {
        this.f106223r = true;
    }

    public void N1(boolean z10) {
        this.f106205i = z10;
    }

    public int O() {
        return this.f106161J[0];
    }

    public void O0() {
        this.f106225s = true;
    }

    public void O1(int i10) {
        if (i10 < 0) {
            this.f106220p0 = 0;
        } else {
            this.f106220p0 = i10;
        }
    }

    public int P() {
        return this.f106220p0;
    }

    public boolean P0(int i10) {
        char c10 = i10 == 0 ? (char) 1 : (char) 0;
        DimensionBehaviour[] dimensionBehaviourArr = this.f106192b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i10];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c10];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour3 && dimensionBehaviour2 == dimensionBehaviour3;
    }

    public void P1(int i10) {
        if (i10 < 0) {
            this.f106218o0 = 0;
        } else {
            this.f106218o0 = i10;
        }
    }

    public int Q() {
        return this.f106218o0;
    }

    public boolean Q0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.f106192b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public void Q1(int i10, int i11) {
        this.f106212l0 = i10;
        this.f106214m0 = i11;
    }

    public ConstraintWidget R(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.f106181T).f106106f) != null && constraintAnchor2.f106106f == constraintAnchor) {
                return constraintAnchor2.f106104d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f106179S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f106106f;
        if (constraintAnchor4 == null || constraintAnchor4.f106106f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f106104d;
    }

    public void R0() {
        this.f106175Q.x();
        this.f106177R.x();
        this.f106179S.x();
        this.f106181T.x();
        this.f106183U.x();
        this.f106184V.x();
        this.f106185W.x();
        this.f106186X.x();
        this.f106194c0 = null;
        this.f106163K = 0.0f;
        this.f106196d0 = 0;
        this.f106198e0 = 0;
        this.f106200f0 = 0.0f;
        this.f106202g0 = -1;
        this.f106204h0 = 0;
        this.f106206i0 = 0;
        this.f106212l0 = 0;
        this.f106214m0 = 0;
        this.f106216n0 = 0;
        this.f106218o0 = 0;
        this.f106220p0 = 0;
        float f10 = f106142z1;
        this.f106222q0 = f10;
        this.f106224r0 = f10;
        DimensionBehaviour[] dimensionBehaviourArr = this.f106192b0;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f106226s0 = null;
        this.f106228t0 = 0;
        this.f106230u0 = 0;
        this.f106236x0 = null;
        this.f106156G0 = false;
        this.f106158H0 = false;
        this.f106162J0 = 0;
        this.f106164K0 = 0;
        this.f106166L0 = false;
        this.f106168M0 = false;
        float[] fArr = this.f106170N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f106227t = -1;
        this.f106229u = -1;
        int[] iArr = this.f106161J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f106233w = 0;
        this.f106235x = 0;
        this.f106145B = 1.0f;
        this.f106151E = 1.0f;
        this.f106143A = Integer.MAX_VALUE;
        this.f106149D = Integer.MAX_VALUE;
        this.f106239z = 0;
        this.f106147C = 0;
        this.f106203h = false;
        this.f106157H = -1;
        this.f106159I = 1.0f;
        this.f106160I0 = false;
        boolean[] zArr = this.f106201g;
        zArr[0] = true;
        zArr[1] = true;
        this.f106169N = false;
        boolean[] zArr2 = this.f106190a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f106205i = true;
        int[] iArr2 = this.f106237y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f106211l = -1;
        this.f106213m = -1;
    }

    public void R1(int i10, int i11) {
        this.f106204h0 = i10;
        this.f106206i0 = i11;
    }

    public int S() {
        int iMax = this.f106198e0;
        if (this.f106192b0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.f106235x == 1) {
                iMax = Math.max(this.f106147C, iMax);
            } else {
                iMax = this.f106147C;
                if (iMax > 0) {
                    this.f106198e0 = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i10 = this.f106149D;
            if (i10 > 0 && i10 < iMax) {
                return i10;
            }
        }
        return iMax;
    }

    public void S0() {
        U0();
        V1(f106142z1);
        A1(f106142z1);
    }

    public void S1(ConstraintWidget constraintWidget) {
        this.f106194c0 = constraintWidget;
    }

    public int T() {
        int i10 = this.f106196d0;
        int iMax = 0;
        if (this.f106192b0[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i10;
        }
        if (this.f106233w == 1) {
            iMax = Math.max(this.f106239z, i10);
        } else {
            int i11 = this.f106239z;
            if (i11 > 0) {
                this.f106196d0 = i11;
                iMax = i11;
            }
        }
        int i12 = this.f106143A;
        return (i12 <= 0 || i12 >= iMax) ? iMax : i12;
    }

    public void T0(ConstraintAnchor constraintAnchor) {
        if (U() != null && (U() instanceof d)) {
            ((d) U()).getClass();
        }
        ConstraintAnchor constraintAnchorR = r(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorR2 = r(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor constraintAnchorR3 = r(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorR4 = r(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor constraintAnchorR5 = r(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor constraintAnchorR6 = r(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor constraintAnchorR7 = r(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == constraintAnchorR5) {
            if (constraintAnchorR.p() && constraintAnchorR2.p() && constraintAnchorR.k() == constraintAnchorR2.k()) {
                constraintAnchorR.x();
                constraintAnchorR2.x();
            }
            if (constraintAnchorR3.p() && constraintAnchorR4.p() && constraintAnchorR3.k() == constraintAnchorR4.k()) {
                constraintAnchorR3.x();
                constraintAnchorR4.x();
            }
            this.f106222q0 = 0.5f;
            this.f106224r0 = 0.5f;
        } else if (constraintAnchor == constraintAnchorR6) {
            if (constraintAnchorR.p() && constraintAnchorR2.p() && constraintAnchorR.k().i() == constraintAnchorR2.k().i()) {
                constraintAnchorR.x();
                constraintAnchorR2.x();
            }
            this.f106222q0 = 0.5f;
        } else if (constraintAnchor == constraintAnchorR7) {
            if (constraintAnchorR3.p() && constraintAnchorR4.p() && constraintAnchorR3.k().i() == constraintAnchorR4.k().i()) {
                constraintAnchorR3.x();
                constraintAnchorR4.x();
            }
            this.f106224r0 = 0.5f;
        } else if (constraintAnchor == constraintAnchorR || constraintAnchor == constraintAnchorR2) {
            if (constraintAnchorR.p() && constraintAnchorR.k() == constraintAnchorR2.k()) {
                constraintAnchorR5.x();
            }
        } else if ((constraintAnchor == constraintAnchorR3 || constraintAnchor == constraintAnchorR4) && constraintAnchorR3.p() && constraintAnchorR3.k() == constraintAnchorR4.k()) {
            constraintAnchorR5.x();
        }
        constraintAnchor.x();
    }

    public void T1(int i10, int i11) {
        if (i11 == 0) {
            this.f106208j0 = i10;
        } else if (i11 == 1) {
            this.f106210k0 = i10;
        }
    }

    public ConstraintWidget U() {
        return this.f106194c0;
    }

    public void U0() {
        ConstraintWidget constraintWidgetU = U();
        if (constraintWidgetU != null && (constraintWidgetU instanceof d)) {
            ((d) U()).getClass();
        }
        int size = this.f106188Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f106188Z.get(i10).x();
        }
    }

    public void U1(String str) {
        this.f106236x0 = str;
    }

    public ConstraintWidget V(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.f106177R).f106106f) != null && constraintAnchor2.f106106f == constraintAnchor) {
                return constraintAnchor2.f106104d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f106175Q;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f106106f;
        if (constraintAnchor4 == null || constraintAnchor4.f106106f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f106104d;
    }

    public void V0() {
        this.f106219p = false;
        this.f106221q = false;
        this.f106223r = false;
        this.f106225s = false;
        int size = this.f106188Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f106188Z.get(i10).y();
        }
    }

    public void V1(float f10) {
        this.f106224r0 = f10;
    }

    public int W(int i10) {
        if (i10 == 0) {
            return this.f106208j0;
        }
        if (i10 == 1) {
            return this.f106210k0;
        }
        return 0;
    }

    public void W0(androidx.constraintlayout.core.c cVar) {
        this.f106175Q.z(cVar);
        this.f106177R.z(cVar);
        this.f106179S.z(cVar);
        this.f106181T.z(cVar);
        this.f106183U.z(cVar);
        this.f106186X.z(cVar);
        this.f106184V.z(cVar);
        this.f106185W.z(cVar);
    }

    public void W1(int i10) {
        this.f106164K0 = i10;
    }

    public int X() {
        return o0() + this.f106196d0;
    }

    public void X0() {
        this.f106223r = false;
        this.f106225s = false;
    }

    public void X1(int i10, int i11) {
        this.f106206i0 = i10;
        int i12 = i11 - i10;
        this.f106198e0 = i12;
        int i13 = this.f106220p0;
        if (i12 < i13) {
            this.f106198e0 = i13;
        }
    }

    public int Y() {
        return this.f106204h0 + this.f106212l0;
    }

    public StringBuilder Y0(StringBuilder sb2) {
        sb2.append("{\n");
        Z0(sb2, "left", this.f106175Q);
        Z0(sb2, "top", this.f106177R);
        Z0(sb2, "right", this.f106179S);
        Z0(sb2, "bottom", this.f106181T);
        Z0(sb2, "baseline", this.f106183U);
        Z0(sb2, "centerX", this.f106184V);
        Z0(sb2, "centerY", this.f106185W);
        c1(sb2, this.f106186X, this.f106163K);
        e1(sb2, InMobiNetworkValues.WIDTH, this.f106196d0, this.f106218o0, this.f106161J[0], this.f106211l, this.f106239z, this.f106233w, this.f106145B, this.f106170N0[0]);
        e1(sb2, InMobiNetworkValues.HEIGHT, this.f106198e0, this.f106220p0, this.f106161J[1], this.f106213m, this.f106147C, this.f106235x, this.f106151E, this.f106170N0[1]);
        d1(sb2, "dimensionRatio", this.f106200f0, this.f106202g0);
        a1(sb2, "horizontalBias", this.f106222q0, f106142z1);
        a1(sb2, "verticalBias", this.f106224r0, f106142z1);
        sb2.append("}\n");
        return sb2;
    }

    public void Y1(DimensionBehaviour dimensionBehaviour) {
        this.f106192b0[1] = dimensionBehaviour;
    }

    public int Z() {
        return this.f106206i0 + this.f106214m0;
    }

    public final void Z0(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f106106f == null) {
            return;
        }
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.f106106f);
        sb2.append("',");
        sb2.append(constraintAnchor.f106107g);
        sb2.append(",");
        sb2.append(constraintAnchor.f106108h);
        sb2.append(",");
        sb2.append(" ] ,\n");
    }

    public void Z1(int i10, int i11, int i12, float f10) {
        this.f106235x = i10;
        this.f106147C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f106149D = i12;
        this.f106151E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f106235x = 2;
    }

    public WidgetRun a0(int i10) {
        if (i10 == 0) {
            return this.f106197e;
        }
        if (i10 == 1) {
            return this.f106199f;
        }
        return null;
    }

    public final void a1(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public void a2(float f10) {
        this.f106170N0[1] = f10;
    }

    public void b0(StringBuilder sb2) {
        sb2.append(GlideException.a.f139488d + this.f106217o + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.f106196d0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f106198e0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f106204h0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f106206i0);
        sb2.append("\n");
        d0(sb2, "left", this.f106175Q);
        d0(sb2, "top", this.f106177R);
        d0(sb2, "right", this.f106179S);
        d0(sb2, "bottom", this.f106181T);
        d0(sb2, "baseline", this.f106183U);
        d0(sb2, "centerX", this.f106184V);
        d0(sb2, "centerY", this.f106185W);
        c0(sb2, "    width", this.f106196d0, this.f106218o0, this.f106161J[0], this.f106211l, this.f106239z, this.f106233w, this.f106145B, this.f106170N0[0]);
        c0(sb2, "    height", this.f106198e0, this.f106220p0, this.f106161J[1], this.f106213m, this.f106147C, this.f106235x, this.f106151E, this.f106170N0[1]);
        d1(sb2, "    dimensionRatio", this.f106200f0, this.f106202g0);
        a1(sb2, "    horizontalBias", this.f106222q0, f106142z1);
        a1(sb2, "    verticalBias", this.f106224r0, f106142z1);
        b1(sb2, "    horizontalChainStyle", this.f106162J0, 0);
        b1(sb2, "    verticalChainStyle", this.f106164K0, 0);
        sb2.append("  }");
    }

    public final void b1(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public void b2(int i10) {
        this.f106230u0 = i10;
    }

    public final void c0(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        b1(sb2, "      size", i10, 0);
        b1(sb2, "      min", i11, 0);
        b1(sb2, "      max", i12, Integer.MAX_VALUE);
        b1(sb2, "      matchMin", i14, 0);
        b1(sb2, "      matchDef", i15, 0);
        a1(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public final void c1(StringBuilder sb2, ConstraintAnchor constraintAnchor, float f10) {
        if (constraintAnchor.f106106f == null) {
            return;
        }
        sb2.append("circle : [ '");
        sb2.append(constraintAnchor.f106106f);
        sb2.append("',");
        sb2.append(constraintAnchor.f106107g);
        sb2.append(",");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(" ] ,\n");
    }

    public void c2(int i10) {
        this.f106196d0 = i10;
        int i11 = this.f106218o0;
        if (i10 < i11) {
            this.f106196d0 = i11;
        }
    }

    public final void d() {
        this.f106188Z.add(this.f106175Q);
        this.f106188Z.add(this.f106177R);
        this.f106188Z.add(this.f106179S);
        this.f106188Z.add(this.f106181T);
        this.f106188Z.add(this.f106184V);
        this.f106188Z.add(this.f106185W);
        this.f106188Z.add(this.f106186X);
        this.f106188Z.add(this.f106183U);
    }

    public final void d0(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f106106f == null) {
            return;
        }
        androidx.concurrent.futures.b.a(sb2, TextProcessor.f150538k0, str, " : [ '");
        sb2.append(constraintAnchor.f106106f);
        sb2.append("'");
        if (constraintAnchor.f106108h != Integer.MIN_VALUE || constraintAnchor.f106107g != 0) {
            sb2.append(",");
            sb2.append(constraintAnchor.f106107g);
            if (constraintAnchor.f106108h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(constraintAnchor.f106108h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final void d1(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    public void d2(boolean z10) {
        this.f106153F = z10;
    }

    public void e(d dVar, androidx.constraintlayout.core.d dVar2, HashSet<ConstraintWidget> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, dVar2, this);
            hashSet.remove(this);
            g(dVar2, dVar.S2(64));
        }
        if (i10 == 0) {
            HashSet<ConstraintAnchor> hashSetE = this.f106175Q.e();
            if (hashSetE != null) {
                Iterator<ConstraintAnchor> it = hashSetE.iterator();
                while (it.hasNext()) {
                    it.next().f106104d.e(dVar, dVar2, hashSet, i10, true);
                }
            }
            HashSet<ConstraintAnchor> hashSetE2 = this.f106179S.e();
            if (hashSetE2 != null) {
                Iterator<ConstraintAnchor> it2 = hashSetE2.iterator();
                while (it2.hasNext()) {
                    it2.next().f106104d.e(dVar, dVar2, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSetE3 = this.f106177R.e();
        if (hashSetE3 != null) {
            Iterator<ConstraintAnchor> it3 = hashSetE3.iterator();
            while (it3.hasNext()) {
                it3.next().f106104d.e(dVar, dVar2, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSetE4 = this.f106181T.e();
        if (hashSetE4 != null) {
            Iterator<ConstraintAnchor> it4 = hashSetE4.iterator();
            while (it4.hasNext()) {
                it4.next().f106104d.e(dVar, dVar2, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSetE5 = this.f106183U.e();
        if (hashSetE5 != null) {
            Iterator<ConstraintAnchor> it5 = hashSetE5.iterator();
            while (it5.hasNext()) {
                it5.next().f106104d.e(dVar, dVar2, hashSet, i10, true);
            }
        }
    }

    public int e0() {
        return p0();
    }

    public final void e1(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        b1(sb2, X3.i.f76775k, i10, Integer.MIN_VALUE);
        b1(sb2, "min", i11, 0);
        b1(sb2, "max", i12, Integer.MAX_VALUE);
        b1(sb2, "matchMin", i14, 0);
        b1(sb2, "matchDef", i15, 0);
        b1(sb2, "matchPercent", i15, 1);
        sb2.append("},\n");
    }

    public void e2(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f106231v = i10;
    }

    public boolean f() {
        return (this instanceof i) || (this instanceof f);
    }

    public String f0() {
        return this.f106236x0;
    }

    public void f1(boolean z10) {
        this.f106232v0 = z10;
    }

    public void f2(int i10) {
        this.f106204h0 = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(androidx.constraintlayout.core.d r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 1482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.g(androidx.constraintlayout.core.d, boolean):void");
    }

    public float g0() {
        return this.f106224r0;
    }

    public void g1(int i10) {
        this.f106216n0 = i10;
        this.f106165L = i10 > 0;
    }

    public void g2(int i10) {
        this.f106206i0 = i10;
    }

    public boolean h() {
        return this.f106230u0 != 8;
    }

    public ConstraintWidget h0() {
        if (!D0()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor constraintAnchorR = constraintWidget.r(ConstraintAnchor.Type.TOP);
            ConstraintAnchor constraintAnchorK = constraintAnchorR == null ? null : constraintAnchorR.k();
            ConstraintWidget constraintWidgetI = constraintAnchorK == null ? null : constraintAnchorK.i();
            if (constraintWidgetI == U()) {
                return constraintWidget;
            }
            ConstraintAnchor constraintAnchorK2 = constraintWidgetI == null ? null : constraintWidgetI.r(ConstraintAnchor.Type.BOTTOM).k();
            if (constraintAnchorK2 == null || constraintAnchorK2.i() == constraintWidget) {
                constraintWidget = constraintWidgetI;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public void h1(Object obj) {
        this.f106226s0 = obj;
    }

    public void h2(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f106157H == -1) {
            if (z12 && !z13) {
                this.f106157H = 0;
            } else if (!z12 && z13) {
                this.f106157H = 1;
                if (this.f106202g0 == -1) {
                    this.f106159I = 1.0f / this.f106159I;
                }
            }
        }
        if (this.f106157H == 0 && (!this.f106177R.p() || !this.f106181T.p())) {
            this.f106157H = 1;
        } else if (this.f106157H == 1 && (!this.f106175Q.p() || !this.f106179S.p())) {
            this.f106157H = 0;
        }
        if (this.f106157H == -1 && (!this.f106177R.p() || !this.f106181T.p() || !this.f106175Q.p() || !this.f106179S.p())) {
            if (this.f106177R.p() && this.f106181T.p()) {
                this.f106157H = 0;
            } else if (this.f106175Q.p() && this.f106179S.p()) {
                this.f106159I = 1.0f / this.f106159I;
                this.f106157H = 1;
            }
        }
        if (this.f106157H == -1) {
            int i10 = this.f106239z;
            if (i10 > 0 && this.f106147C == 0) {
                this.f106157H = 0;
            } else {
                if (i10 != 0 || this.f106147C <= 0) {
                    return;
                }
                this.f106159I = 1.0f / this.f106159I;
                this.f106157H = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x049c A[PHI: r7
      0x049c: PHI (r7v13 int) = (r7v12 int), (r7v17 int), (r7v17 int), (r7v17 int) binds: [B:301:0x048c, B:303:0x0492, B:304:0x0494, B:306:0x0498] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0513 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:382:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(androidx.constraintlayout.core.d r30, boolean r31, boolean r32, boolean r33, boolean r34, androidx.constraintlayout.core.SolverVariable r35, androidx.constraintlayout.core.SolverVariable r36, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r37, boolean r38, androidx.constraintlayout.core.widgets.ConstraintAnchor r39, androidx.constraintlayout.core.widgets.ConstraintAnchor r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instruction units count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.i(androidx.constraintlayout.core.d, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public int i0() {
        return this.f106164K0;
    }

    public void i1(int i10) {
        if (i10 >= 0) {
            this.f106228t0 = i10;
        } else {
            this.f106228t0 = 0;
        }
    }

    public void i2(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zM = z10 & this.f106197e.m();
        boolean zM2 = z11 & this.f106199f.m();
        k kVar = this.f106197e;
        int i12 = kVar.f106272h.f106259g;
        m mVar = this.f106199f;
        int i13 = mVar.f106272h.f106259g;
        int i14 = kVar.f106273i.f106259g;
        int i15 = mVar.f106273i.f106259g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zM) {
            this.f106204h0 = i12;
        }
        if (zM2) {
            this.f106206i0 = i13;
        }
        if (this.f106230u0 == 8) {
            this.f106196d0 = 0;
            this.f106198e0 = 0;
            return;
        }
        if (zM) {
            if (this.f106192b0[0] == DimensionBehaviour.FIXED && i17 < (i11 = this.f106196d0)) {
                i17 = i11;
            }
            this.f106196d0 = i17;
            int i19 = this.f106218o0;
            if (i17 < i19) {
                this.f106196d0 = i19;
            }
        }
        if (zM2) {
            if (this.f106192b0[1] == DimensionBehaviour.FIXED && i18 < (i10 = this.f106198e0)) {
                i18 = i10;
            }
            this.f106198e0 = i18;
            int i20 = this.f106220p0;
            if (i18 < i20) {
                this.f106198e0 = i20;
            }
        }
    }

    public void j(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        k(type, constraintWidget, type2, 0);
    }

    public DimensionBehaviour j0() {
        return this.f106192b0[1];
    }

    public void j1(String str) {
        this.f106234w0 = str;
    }

    public void j2(androidx.constraintlayout.core.d dVar, boolean z10) {
        m mVar;
        k kVar;
        int iO = dVar.O(this.f106175Q);
        int iO2 = dVar.O(this.f106177R);
        int iO3 = dVar.O(this.f106179S);
        int iO4 = dVar.O(this.f106181T);
        if (z10 && (kVar = this.f106197e) != null) {
            DependencyNode dependencyNode = kVar.f106272h;
            if (dependencyNode.f106262j) {
                DependencyNode dependencyNode2 = kVar.f106273i;
                if (dependencyNode2.f106262j) {
                    iO = dependencyNode.f106259g;
                    iO3 = dependencyNode2.f106259g;
                }
            }
        }
        if (z10 && (mVar = this.f106199f) != null) {
            DependencyNode dependencyNode3 = mVar.f106272h;
            if (dependencyNode3.f106262j) {
                DependencyNode dependencyNode4 = mVar.f106273i;
                if (dependencyNode4.f106262j) {
                    iO2 = dependencyNode3.f106259g;
                    iO4 = dependencyNode4.f106259g;
                }
            }
        }
        int i10 = iO4 - iO2;
        if (iO3 - iO < 0 || i10 < 0 || iO == Integer.MIN_VALUE || iO == Integer.MAX_VALUE || iO2 == Integer.MIN_VALUE || iO2 == Integer.MAX_VALUE || iO3 == Integer.MIN_VALUE || iO3 == Integer.MAX_VALUE || iO4 == Integer.MIN_VALUE || iO4 == Integer.MAX_VALUE) {
            iO = 0;
            iO4 = 0;
            iO2 = 0;
            iO3 = 0;
        }
        v1(iO, iO2, iO3, iO4);
    }

    public void k(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z10;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 != type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                if (type2 == type6 || type2 == ConstraintAnchor.Type.RIGHT) {
                    k(type6, constraintWidget, type2, 0);
                    k(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                    r(type5).a(constraintWidget.r(type2), 0);
                    return;
                }
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
                if (type2 == type7 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    k(type7, constraintWidget, type2, 0);
                    k(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    r(type5).a(constraintWidget.r(type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor constraintAnchorR = r(type8);
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor constraintAnchorR2 = r(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor constraintAnchorR3 = r(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor constraintAnchorR4 = r(type11);
            boolean z11 = true;
            if ((constraintAnchorR == null || !constraintAnchorR.p()) && (constraintAnchorR2 == null || !constraintAnchorR2.p())) {
                k(type8, constraintWidget, type8, 0);
                k(type9, constraintWidget, type9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((constraintAnchorR3 == null || !constraintAnchorR3.p()) && (constraintAnchorR4 == null || !constraintAnchorR4.p())) {
                k(type10, constraintWidget, type10, 0);
                k(type11, constraintWidget, type11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                r(type5).a(constraintWidget.r(type5), 0);
                return;
            }
            if (z10) {
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
                r(type12).a(constraintWidget.r(type12), 0);
                return;
            } else {
                if (z11) {
                    ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                    r(type13).a(constraintWidget.r(type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor constraintAnchorR5 = r(type4);
            ConstraintAnchor constraintAnchorR6 = constraintWidget.r(type2);
            ConstraintAnchor constraintAnchorR7 = r(ConstraintAnchor.Type.RIGHT);
            constraintAnchorR5.a(constraintAnchorR6, 0);
            constraintAnchorR7.a(constraintAnchorR6, 0);
            r(type14).a(constraintAnchorR6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor constraintAnchorR8 = constraintWidget.r(type2);
            r(type3).a(constraintAnchorR8, 0);
            r(ConstraintAnchor.Type.BOTTOM).a(constraintAnchorR8, 0);
            r(type15).a(constraintAnchorR8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            r(type16).a(constraintWidget.r(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            r(type17).a(constraintWidget.r(type17), 0);
            r(type14).a(constraintWidget.r(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            r(type18).a(constraintWidget.r(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            r(type19).a(constraintWidget.r(type19), 0);
            r(type15).a(constraintWidget.r(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorR9 = r(type);
        ConstraintAnchor constraintAnchorR10 = constraintWidget.r(type2);
        if (constraintAnchorR9.v(constraintAnchorR10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor constraintAnchorR11 = r(ConstraintAnchor.Type.TOP);
                ConstraintAnchor constraintAnchorR12 = r(ConstraintAnchor.Type.BOTTOM);
                if (constraintAnchorR11 != null) {
                    constraintAnchorR11.x();
                }
                if (constraintAnchorR12 != null) {
                    constraintAnchorR12.x();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor constraintAnchorR13 = r(type20);
                if (constraintAnchorR13 != null) {
                    constraintAnchorR13.x();
                }
                ConstraintAnchor constraintAnchorR14 = r(type5);
                if (constraintAnchorR14.k() != constraintAnchorR10) {
                    constraintAnchorR14.x();
                }
                ConstraintAnchor constraintAnchorH = r(type).h();
                ConstraintAnchor constraintAnchorR15 = r(type15);
                if (constraintAnchorR15.p()) {
                    constraintAnchorH.x();
                    constraintAnchorR15.x();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor constraintAnchorR16 = r(type5);
                if (constraintAnchorR16.k() != constraintAnchorR10) {
                    constraintAnchorR16.x();
                }
                ConstraintAnchor constraintAnchorH2 = r(type).h();
                ConstraintAnchor constraintAnchorR17 = r(type14);
                if (constraintAnchorR17.p()) {
                    constraintAnchorH2.x();
                    constraintAnchorR17.x();
                }
            }
            constraintAnchorR9.a(constraintAnchorR10, i10);
        }
    }

    public int k0() {
        int i10 = this.f106175Q != null ? this.f106177R.f106107g : 0;
        return this.f106179S != null ? i10 + this.f106181T.f106107g : i10;
    }

    public void k1(androidx.constraintlayout.core.d dVar, String str) {
        this.f106234w0 = str;
        SolverVariable solverVariableU = dVar.u(this.f106175Q);
        SolverVariable solverVariableU2 = dVar.u(this.f106177R);
        SolverVariable solverVariableU3 = dVar.u(this.f106179S);
        SolverVariable solverVariableU4 = dVar.u(this.f106181T);
        solverVariableU.j(str + ".left");
        solverVariableU2.j(str + ".top");
        solverVariableU3.j(str + ".right");
        solverVariableU4.j(str + ".bottom");
        dVar.u(this.f106183U).j(str + ".baseline");
    }

    public void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        if (constraintAnchor.i() == this) {
            k(constraintAnchor.l(), constraintAnchor2.i(), constraintAnchor2.l(), i10);
        }
    }

    public int l0() {
        return this.f106230u0;
    }

    public void l1(int i10, int i11) {
        this.f106196d0 = i10;
        int i12 = this.f106218o0;
        if (i10 < i12) {
            this.f106196d0 = i12;
        }
        this.f106198e0 = i11;
        int i13 = this.f106220p0;
        if (i11 < i13) {
            this.f106198e0 = i13;
        }
    }

    public void m(ConstraintWidget constraintWidget, float f10, int i10) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        v0(type, constraintWidget, type, i10, 0);
        this.f106163K = f10;
    }

    public int m0() {
        if (this.f106230u0 == 8) {
            return 0;
        }
        return this.f106196d0;
    }

    public void m1(float f10, int i10) {
        this.f106200f0 = f10;
        this.f106202g0 = i10;
    }

    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.f106227t = constraintWidget.f106227t;
        this.f106229u = constraintWidget.f106229u;
        this.f106233w = constraintWidget.f106233w;
        this.f106235x = constraintWidget.f106235x;
        int[] iArr = this.f106237y;
        int[] iArr2 = constraintWidget.f106237y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f106239z = constraintWidget.f106239z;
        this.f106143A = constraintWidget.f106143A;
        this.f106147C = constraintWidget.f106147C;
        this.f106149D = constraintWidget.f106149D;
        this.f106151E = constraintWidget.f106151E;
        this.f106153F = constraintWidget.f106153F;
        this.f106155G = constraintWidget.f106155G;
        this.f106157H = constraintWidget.f106157H;
        this.f106159I = constraintWidget.f106159I;
        int[] iArr3 = constraintWidget.f106161J;
        this.f106161J = Arrays.copyOf(iArr3, iArr3.length);
        this.f106163K = constraintWidget.f106163K;
        this.f106165L = constraintWidget.f106165L;
        this.f106167M = constraintWidget.f106167M;
        this.f106175Q.x();
        this.f106177R.x();
        this.f106179S.x();
        this.f106181T.x();
        this.f106183U.x();
        this.f106184V.x();
        this.f106185W.x();
        this.f106186X.x();
        this.f106192b0 = (DimensionBehaviour[]) Arrays.copyOf(this.f106192b0, 2);
        this.f106194c0 = this.f106194c0 == null ? null : map.get(constraintWidget.f106194c0);
        this.f106196d0 = constraintWidget.f106196d0;
        this.f106198e0 = constraintWidget.f106198e0;
        this.f106200f0 = constraintWidget.f106200f0;
        this.f106202g0 = constraintWidget.f106202g0;
        this.f106204h0 = constraintWidget.f106204h0;
        this.f106206i0 = constraintWidget.f106206i0;
        this.f106208j0 = constraintWidget.f106208j0;
        this.f106210k0 = constraintWidget.f106210k0;
        this.f106212l0 = constraintWidget.f106212l0;
        this.f106214m0 = constraintWidget.f106214m0;
        this.f106216n0 = constraintWidget.f106216n0;
        this.f106218o0 = constraintWidget.f106218o0;
        this.f106220p0 = constraintWidget.f106220p0;
        this.f106222q0 = constraintWidget.f106222q0;
        this.f106224r0 = constraintWidget.f106224r0;
        this.f106226s0 = constraintWidget.f106226s0;
        this.f106228t0 = constraintWidget.f106228t0;
        this.f106230u0 = constraintWidget.f106230u0;
        this.f106232v0 = constraintWidget.f106232v0;
        this.f106234w0 = constraintWidget.f106234w0;
        this.f106236x0 = constraintWidget.f106236x0;
        this.f106238y0 = constraintWidget.f106238y0;
        this.f106240z0 = constraintWidget.f106240z0;
        this.f106144A0 = constraintWidget.f106144A0;
        this.f106146B0 = constraintWidget.f106146B0;
        this.f106148C0 = constraintWidget.f106148C0;
        this.f106150D0 = constraintWidget.f106150D0;
        this.f106152E0 = constraintWidget.f106152E0;
        this.f106154F0 = constraintWidget.f106154F0;
        this.f106156G0 = constraintWidget.f106156G0;
        this.f106158H0 = constraintWidget.f106158H0;
        this.f106162J0 = constraintWidget.f106162J0;
        this.f106164K0 = constraintWidget.f106164K0;
        this.f106166L0 = constraintWidget.f106166L0;
        this.f106168M0 = constraintWidget.f106168M0;
        float[] fArr = this.f106170N0;
        float[] fArr2 = constraintWidget.f106170N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.f106172O0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.f106172O0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.f106174P0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.f106174P0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.f106176Q0;
        this.f106176Q0 = constraintWidget2 == null ? null : map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.f106178R0;
        this.f106178R0 = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public int n0() {
        return this.f106231v;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n1(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L90
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L90
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r5
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L86
            int r2 = r9.length()
            if (r2 <= 0) goto L86
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L86:
            r9 = r0
        L87:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8f
            r8.f106200f0 = r9
            r8.f106202g0 = r5
        L8f:
            return
        L90:
            r8.f106200f0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.n1(java.lang.String):void");
    }

    public void o(androidx.constraintlayout.core.d dVar) {
        dVar.u(this.f106175Q);
        dVar.u(this.f106177R);
        dVar.u(this.f106179S);
        dVar.u(this.f106181T);
        if (this.f106216n0 > 0) {
            dVar.u(this.f106183U);
        }
    }

    public int o0() {
        ConstraintWidget constraintWidget = this.f106194c0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f106204h0 : ((d) constraintWidget).f106389I1 + this.f106204h0;
    }

    public void o1(int i10) {
        if (this.f106165L) {
            int i11 = i10 - this.f106216n0;
            int i12 = this.f106198e0 + i11;
            this.f106206i0 = i11;
            this.f106177R.A(i11);
            this.f106181T.A(i12);
            this.f106183U.A(i10);
            this.f106221q = true;
        }
    }

    public void p() {
        this.f106205i = true;
    }

    public int p0() {
        ConstraintWidget constraintWidget = this.f106194c0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f106206i0 : ((d) constraintWidget).f106390J1 + this.f106206i0;
    }

    public void p1(int i10, int i11, int i12, int i13, int i14, int i15) {
        v1(i10, i11, i12, i13);
        g1(i14);
        if (i15 == 0) {
            this.f106219p = true;
            this.f106221q = false;
        } else if (i15 == 1) {
            this.f106219p = false;
            this.f106221q = true;
        } else if (i15 == 2) {
            this.f106219p = true;
            this.f106221q = true;
        } else {
            this.f106219p = false;
            this.f106221q = false;
        }
    }

    public void q() {
        if (this.f106197e == null) {
            this.f106197e = new k(this);
        }
        if (this.f106199f == null) {
            this.f106199f = new m(this);
        }
    }

    public boolean q0() {
        return this.f106165L;
    }

    public void q1(int i10, int i11) {
        if (this.f106219p) {
            return;
        }
        this.f106175Q.A(i10);
        this.f106179S.A(i11);
        this.f106204h0 = i10;
        this.f106196d0 = i11 - i10;
        this.f106219p = true;
    }

    public ConstraintAnchor r(ConstraintAnchor.Type type) {
        switch (a.f106241a[type.ordinal()]) {
            case 1:
                return this.f106175Q;
            case 2:
                return this.f106177R;
            case 3:
                return this.f106179S;
            case 4:
                return this.f106181T;
            case 5:
                return this.f106183U;
            case 6:
                return this.f106186X;
            case 7:
                return this.f106184V;
            case 8:
                return this.f106185W;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public boolean r0(int i10) {
        if (i10 == 0) {
            return (this.f106175Q.f106106f != null ? 1 : 0) + (this.f106179S.f106106f != null ? 1 : 0) < 2;
        }
        return ((this.f106177R.f106106f != null ? 1 : 0) + (this.f106181T.f106106f != null ? 1 : 0)) + (this.f106183U.f106106f != null ? 1 : 0) < 2;
    }

    public void r1(int i10) {
        this.f106175Q.A(i10);
        this.f106204h0 = i10;
    }

    public ArrayList<ConstraintAnchor> s() {
        return this.f106188Z;
    }

    public boolean s0() {
        int size = this.f106188Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f106188Z.get(i10).n()) {
                return true;
            }
        }
        return false;
    }

    public void s1(int i10) {
        this.f106177R.A(i10);
        this.f106206i0 = i10;
    }

    public int t() {
        return this.f106216n0;
    }

    public boolean t0() {
        return (this.f106211l == -1 && this.f106213m == -1) ? false : true;
    }

    public void t1(int i10, int i11) {
        if (this.f106221q) {
            return;
        }
        this.f106177R.A(i10);
        this.f106181T.A(i11);
        this.f106206i0 = i10;
        this.f106198e0 = i11 - i10;
        if (this.f106165L) {
            this.f106183U.A(i10 + this.f106216n0);
        }
        this.f106221q = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f106236x0 != null ? android.support.v4.media.e.a(new StringBuilder("type: "), this.f106236x0, q.f17581a) : "");
        sb2.append(this.f106234w0 != null ? android.support.v4.media.e.a(new StringBuilder("id: "), this.f106234w0, q.f17581a) : "");
        sb2.append("(");
        sb2.append(this.f106204h0);
        sb2.append(j.f68738d);
        sb2.append(this.f106206i0);
        sb2.append(") - (");
        sb2.append(this.f106196d0);
        sb2.append(" x ");
        return android.support.v4.media.d.a(sb2, this.f106198e0, ")");
    }

    public float u(int i10) {
        if (i10 == 0) {
            return this.f106222q0;
        }
        if (i10 == 1) {
            return this.f106224r0;
        }
        return -1.0f;
    }

    public boolean u0(int i10, int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.f106175Q.f106106f;
            if (constraintAnchor3 == null || !constraintAnchor3.o() || (constraintAnchor2 = this.f106179S.f106106f) == null || !constraintAnchor2.o()) {
                return false;
            }
            return (this.f106179S.f106106f.f() - this.f106179S.g()) - (this.f106175Q.g() + this.f106175Q.f106106f.f()) >= i11;
        }
        ConstraintAnchor constraintAnchor4 = this.f106177R.f106106f;
        if (constraintAnchor4 == null || !constraintAnchor4.o() || (constraintAnchor = this.f106181T.f106106f) == null || !constraintAnchor.o()) {
            return false;
        }
        return (this.f106181T.f106106f.f() - this.f106181T.g()) - (this.f106177R.g() + this.f106177R.f106106f.f()) >= i11;
    }

    public void u1(int i10, int i11, int i12) {
        if (i12 == 0) {
            C1(i10, i11);
        } else if (i12 == 1) {
            X1(i10, i11);
        }
    }

    public int v() {
        return p0() + this.f106198e0;
    }

    public void v0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10, int i11) {
        r(type).b(constraintWidget.r(type2), i10, i11, true);
    }

    public void v1(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f106204h0 = i10;
        this.f106206i0 = i11;
        if (this.f106230u0 == 8) {
            this.f106196d0 = 0;
            this.f106198e0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f106192b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i16 < (i15 = this.f106196d0)) {
            i16 = i15;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i17 < (i14 = this.f106198e0)) {
            i17 = i14;
        }
        this.f106196d0 = i16;
        this.f106198e0 = i17;
        int i18 = this.f106220p0;
        if (i17 < i18) {
            this.f106198e0 = i18;
        }
        int i19 = this.f106218o0;
        if (i16 < i19) {
            this.f106196d0 = i19;
        }
        int i20 = this.f106143A;
        if (i20 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f106196d0 = Math.min(this.f106196d0, i20);
        }
        int i21 = this.f106149D;
        if (i21 > 0 && this.f106192b0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f106198e0 = Math.min(this.f106198e0, i21);
        }
        int i22 = this.f106196d0;
        if (i16 != i22) {
            this.f106211l = i22;
        }
        int i23 = this.f106198e0;
        if (i17 != i23) {
            this.f106213m = i23;
        }
    }

    public Object w() {
        return this.f106226s0;
    }

    public boolean w0() {
        return this.f106232v0;
    }

    public void w1(ConstraintAnchor.Type type, int i10) {
        int i11 = a.f106241a[type.ordinal()];
        if (i11 == 1) {
            this.f106175Q.f106108h = i10;
            return;
        }
        if (i11 == 2) {
            this.f106177R.f106108h = i10;
            return;
        }
        if (i11 == 3) {
            this.f106179S.f106108h = i10;
        } else if (i11 == 4) {
            this.f106181T.f106108h = i10;
        } else {
            if (i11 != 5) {
                return;
            }
            this.f106183U.f106108h = i10;
        }
    }

    public int x() {
        return this.f106228t0;
    }

    public final boolean x0(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i11 = i10 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f106187Y;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i11];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f106106f;
        return (constraintAnchor4 == null || constraintAnchor4.f106106f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i11 + 1]).f106106f) == null || constraintAnchor2.f106106f != constraintAnchor) ? false : true;
    }

    public void x1(boolean z10) {
        this.f106165L = z10;
    }

    public String y() {
        return this.f106234w0;
    }

    public boolean y0() {
        return this.f106155G;
    }

    public void y1(int i10) {
        this.f106198e0 = i10;
        int i11 = this.f106220p0;
        if (i10 < i11) {
            this.f106198e0 = i11;
        }
    }

    public DimensionBehaviour z(int i10) {
        if (i10 == 0) {
            return H();
        }
        if (i10 == 1) {
            return j0();
        }
        return null;
    }

    public boolean z0() {
        return this.f106223r;
    }

    public void z1(boolean z10) {
        this.f106155G = z10;
    }

    public ConstraintWidget(String str) {
        this.f106189a = false;
        this.f106191b = new WidgetRun[2];
        this.f106197e = null;
        this.f106199f = null;
        this.f106201g = new boolean[]{true, true};
        this.f106203h = false;
        this.f106205i = true;
        this.f106207j = false;
        this.f106209k = true;
        this.f106211l = -1;
        this.f106213m = -1;
        this.f106215n = new o(this);
        this.f106219p = false;
        this.f106221q = false;
        this.f106223r = false;
        this.f106225s = false;
        this.f106227t = -1;
        this.f106229u = -1;
        this.f106231v = 0;
        this.f106233w = 0;
        this.f106235x = 0;
        this.f106237y = new int[2];
        this.f106239z = 0;
        this.f106143A = 0;
        this.f106145B = 1.0f;
        this.f106147C = 0;
        this.f106149D = 0;
        this.f106151E = 1.0f;
        this.f106157H = -1;
        this.f106159I = 1.0f;
        this.f106161J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f106163K = 0.0f;
        this.f106165L = false;
        this.f106169N = false;
        this.f106171O = 0;
        this.f106173P = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f106175Q = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f106177R = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f106179S = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f106181T = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f106183U = constraintAnchor5;
        this.f106184V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f106185W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f106186X = constraintAnchor6;
        this.f106187Y = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.f106188Z = new ArrayList<>();
        this.f106190a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f106192b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f106194c0 = null;
        this.f106196d0 = 0;
        this.f106198e0 = 0;
        this.f106200f0 = 0.0f;
        this.f106202g0 = -1;
        this.f106204h0 = 0;
        this.f106206i0 = 0;
        this.f106208j0 = 0;
        this.f106210k0 = 0;
        this.f106212l0 = 0;
        this.f106214m0 = 0;
        this.f106216n0 = 0;
        float f10 = f106142z1;
        this.f106222q0 = f10;
        this.f106224r0 = f10;
        this.f106228t0 = 0;
        this.f106230u0 = 0;
        this.f106232v0 = false;
        this.f106234w0 = null;
        this.f106236x0 = null;
        this.f106160I0 = false;
        this.f106162J0 = 0;
        this.f106164K0 = 0;
        this.f106170N0 = new float[]{-1.0f, -1.0f};
        this.f106172O0 = new ConstraintWidget[]{null, null};
        this.f106174P0 = new ConstraintWidget[]{null, null};
        this.f106176Q0 = null;
        this.f106178R0 = null;
        this.f106180S0 = -1;
        this.f106182T0 = -1;
        d();
        j1(str);
    }

    public ConstraintWidget(int i10, int i11, int i12, int i13) {
        this.f106189a = false;
        this.f106191b = new WidgetRun[2];
        this.f106197e = null;
        this.f106199f = null;
        this.f106201g = new boolean[]{true, true};
        this.f106203h = false;
        this.f106205i = true;
        this.f106207j = false;
        this.f106209k = true;
        this.f106211l = -1;
        this.f106213m = -1;
        this.f106215n = new o(this);
        this.f106219p = false;
        this.f106221q = false;
        this.f106223r = false;
        this.f106225s = false;
        this.f106227t = -1;
        this.f106229u = -1;
        this.f106231v = 0;
        this.f106233w = 0;
        this.f106235x = 0;
        this.f106237y = new int[2];
        this.f106239z = 0;
        this.f106143A = 0;
        this.f106145B = 1.0f;
        this.f106147C = 0;
        this.f106149D = 0;
        this.f106151E = 1.0f;
        this.f106157H = -1;
        this.f106159I = 1.0f;
        this.f106161J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f106163K = 0.0f;
        this.f106165L = false;
        this.f106169N = false;
        this.f106171O = 0;
        this.f106173P = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f106175Q = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f106177R = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f106179S = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f106181T = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f106183U = constraintAnchor5;
        this.f106184V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f106185W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f106186X = constraintAnchor6;
        this.f106187Y = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.f106188Z = new ArrayList<>();
        this.f106190a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f106192b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f106194c0 = null;
        this.f106200f0 = 0.0f;
        this.f106202g0 = -1;
        this.f106208j0 = 0;
        this.f106210k0 = 0;
        this.f106212l0 = 0;
        this.f106214m0 = 0;
        this.f106216n0 = 0;
        float f10 = f106142z1;
        this.f106222q0 = f10;
        this.f106224r0 = f10;
        this.f106228t0 = 0;
        this.f106230u0 = 0;
        this.f106232v0 = false;
        this.f106234w0 = null;
        this.f106236x0 = null;
        this.f106160I0 = false;
        this.f106162J0 = 0;
        this.f106164K0 = 0;
        this.f106170N0 = new float[]{-1.0f, -1.0f};
        this.f106172O0 = new ConstraintWidget[]{null, null};
        this.f106174P0 = new ConstraintWidget[]{null, null};
        this.f106176Q0 = null;
        this.f106178R0 = null;
        this.f106180S0 = -1;
        this.f106182T0 = -1;
        this.f106204h0 = i10;
        this.f106206i0 = i11;
        this.f106196d0 = i12;
        this.f106198e0 = i13;
        d();
    }

    public ConstraintWidget(String str, int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13);
        j1(str);
    }

    public ConstraintWidget(int i10, int i11) {
        this(0, 0, i10, i11);
    }

    public ConstraintWidget(String str, int i10, int i11) {
        this(0, 0, i10, i11);
        j1(str);
    }
}
