package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import s0.x;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintReference implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f105972a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f105973a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final State f105974b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f105975b0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Dimension f105979d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Dimension f105981e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Object f105983f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ConstraintWidget f105985g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public HashMap<String, Integer> f105987h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public HashMap<String, Float> f105989i0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f105976c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t0.e f105978d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f105980e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f105982f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f105984g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f105986h = -1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f105988i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f105990j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f105991k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f105992l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f105993m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f105994n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f105995o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f105996p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f105997q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f105998r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f105999s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f106000t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f106001u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f106002v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f106003w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f106004x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f106005y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f106006z = Float.NaN;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f105946A = Float.NaN;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f105947B = Float.NaN;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f105948C = Float.NaN;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f105949D = Float.NaN;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f105950E = Float.NaN;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f105951F = Float.NaN;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f105952G = Float.NaN;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f105953H = Float.NaN;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f105954I = Float.NaN;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f105955J = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Object f105956K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Object f105957L = null;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Object f105958M = null;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Object f105959N = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Object f105960O = null;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Object f105961P = null;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Object f105962Q = null;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Object f105963R = null;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Object f105964S = null;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Object f105965T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Object f105966U = null;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Object f105967V = null;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Object f105968W = null;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Object f105969X = null;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f105970Y = null;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Object f105971Z = null;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public State.Constraint f105977c0 = null;

    public static class IncorrectConstraintException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<String> f106007a;

        public IncorrectConstraintException(ArrayList<String> arrayList) {
            this.f106007a = arrayList;
        }

        public ArrayList<String> d() {
            return this.f106007a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.f106007a.toString();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106008a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            f106008a = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106008a[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106008a[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106008a[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f106008a[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f106008a[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f106008a[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f106008a[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f106008a[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f106008a[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f106008a[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f106008a[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f106008a[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f106008a[State.Constraint.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f106008a[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f106008a[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f106008a[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f106008a[State.Constraint.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public interface b {
        ConstraintReference a(State state);
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.f106010j;
        this.f105979d0 = Dimension.b(obj);
        this.f105981e0 = Dimension.b(obj);
        this.f105987h0 = new HashMap<>();
        this.f105989i0 = new HashMap<>();
        this.f105974b = state;
    }

    public ConstraintReference A(Object obj) {
        this.f105977c0 = State.Constraint.END_TO_START;
        this.f105962Q = obj;
        return this;
    }

    public ConstraintReference A0(Object obj) {
        this.f105977c0 = State.Constraint.START_TO_START;
        this.f105960O = obj;
        return this;
    }

    public final Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof ConstraintReference) ? this.f105974b.r(obj) : obj;
    }

    public ConstraintReference B0() {
        if (this.f105964S != null) {
            this.f105977c0 = State.Constraint.TOP_TO_TOP;
            return this;
        }
        this.f105977c0 = State.Constraint.TOP_TO_BOTTOM;
        return this;
    }

    public float C() {
        return this.f105952G;
    }

    public ConstraintReference C0(Object obj) {
        this.f105977c0 = State.Constraint.TOP_TO_BOTTOM;
        this.f105965T = obj;
        return this;
    }

    public Dimension D() {
        return this.f105981e0;
    }

    public ConstraintReference D0(Object obj) {
        this.f105977c0 = State.Constraint.TOP_TO_TOP;
        this.f105964S = obj;
        return this;
    }

    public int E() {
        return this.f105980e;
    }

    public ConstraintReference E0(float f10) {
        this.f105949D = f10;
        return this;
    }

    public float F() {
        return this.f105984g;
    }

    public ConstraintReference F0(float f10) {
        this.f105950E = f10;
        return this;
    }

    public float G() {
        return this.f106005y;
    }

    public ConstraintReference G0(float f10) {
        this.f105951F = f10;
        return this;
    }

    public float H() {
        return this.f106006z;
    }

    public void H0() throws IncorrectConstraintException {
        ArrayList arrayList = new ArrayList();
        if (this.f105956K != null && this.f105957L != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.f105958M != null && this.f105959N != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.f105960O != null && this.f105961P != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.f105962Q != null && this.f105963R != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.f105956K != null || this.f105957L != null || this.f105958M != null || this.f105959N != null) && (this.f105960O != null || this.f105961P != null || this.f105962Q != null || this.f105963R != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new IncorrectConstraintException(arrayList);
        }
    }

    public float I() {
        return this.f105946A;
    }

    public ConstraintReference I0(float f10) {
        this.f105990j = f10;
        return this;
    }

    public float J() {
        return this.f105947B;
    }

    public ConstraintReference J0(int i10) {
        this.f105955J = i10;
        return this;
    }

    public float K() {
        return this.f105948C;
    }

    public ConstraintReference K0(Dimension dimension) {
        return x0(dimension);
    }

    public float L() {
        return this.f105953H;
    }

    public float M() {
        return this.f105954I;
    }

    public String N() {
        return this.f105976c;
    }

    public final ConstraintWidget O(Object obj) {
        if (obj instanceof c) {
            return ((c) obj).a();
        }
        return null;
    }

    public float P() {
        return this.f105949D;
    }

    public float Q() {
        return this.f105950E;
    }

    public float R() {
        return this.f105951F;
    }

    public int S(int i10) {
        return this.f105982f;
    }

    public float T() {
        return this.f105986h;
    }

    public Object U() {
        return this.f105983f0;
    }

    public Dimension V() {
        return this.f105979d0;
    }

    public ConstraintReference W(Dimension dimension) {
        return q0(dimension);
    }

    public ConstraintReference X(float f10) {
        this.f105988i = f10;
        return this;
    }

    public ConstraintReference Y() {
        if (this.f105956K != null) {
            this.f105977c0 = State.Constraint.LEFT_TO_LEFT;
            return this;
        }
        this.f105977c0 = State.Constraint.LEFT_TO_RIGHT;
        return this;
    }

    public ConstraintReference Z(Object obj) {
        this.f105977c0 = State.Constraint.LEFT_TO_LEFT;
        this.f105956K = obj;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public ConstraintWidget a() {
        if (this.f105985g0 == null) {
            ConstraintWidget constraintWidgetW = w();
            this.f105985g0 = constraintWidgetW;
            constraintWidgetW.f106226s0 = this.f105983f0;
        }
        return this.f105985g0;
    }

    public ConstraintReference a0(Object obj) {
        this.f105977c0 = State.Constraint.LEFT_TO_RIGHT;
        this.f105957L = obj;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public void apply() {
        if (this.f105985g0 == null) {
            return;
        }
        t0.e eVar = this.f105978d;
        if (eVar != null) {
            eVar.apply();
        }
        this.f105979d0.j(this.f105974b, this.f105985g0, 0);
        this.f105981e0.j(this.f105974b, this.f105985g0, 1);
        x();
        h(this.f105985g0, this.f105956K, State.Constraint.LEFT_TO_LEFT);
        h(this.f105985g0, this.f105957L, State.Constraint.LEFT_TO_RIGHT);
        h(this.f105985g0, this.f105958M, State.Constraint.RIGHT_TO_LEFT);
        h(this.f105985g0, this.f105959N, State.Constraint.RIGHT_TO_RIGHT);
        h(this.f105985g0, this.f105960O, State.Constraint.START_TO_START);
        h(this.f105985g0, this.f105961P, State.Constraint.START_TO_END);
        h(this.f105985g0, this.f105962Q, State.Constraint.END_TO_START);
        h(this.f105985g0, this.f105963R, State.Constraint.END_TO_END);
        h(this.f105985g0, this.f105964S, State.Constraint.TOP_TO_TOP);
        h(this.f105985g0, this.f105965T, State.Constraint.TOP_TO_BOTTOM);
        h(this.f105985g0, this.f105966U, State.Constraint.BOTTOM_TO_TOP);
        h(this.f105985g0, this.f105967V, State.Constraint.BOTTOM_TO_BOTTOM);
        h(this.f105985g0, this.f105968W, State.Constraint.BASELINE_TO_BASELINE);
        h(this.f105985g0, this.f105969X, State.Constraint.BASELINE_TO_TOP);
        h(this.f105985g0, this.f105970Y, State.Constraint.BASELINE_TO_BOTTOM);
        h(this.f105985g0, this.f105971Z, State.Constraint.CIRCULAR_CONSTRAINT);
        int i10 = this.f105980e;
        if (i10 != 0) {
            this.f105985g0.B1(i10);
        }
        int i11 = this.f105982f;
        if (i11 != 0) {
            this.f105985g0.W1(i11);
        }
        float f10 = this.f105984g;
        if (f10 != -1.0f) {
            this.f105985g0.F1(f10);
        }
        float f11 = this.f105986h;
        if (f11 != -1.0f) {
            this.f105985g0.a2(f11);
        }
        this.f105985g0.A1(this.f105988i);
        this.f105985g0.V1(this.f105990j);
        ConstraintWidget constraintWidget = this.f105985g0;
        o oVar = constraintWidget.f106215n;
        oVar.f106084f = this.f106005y;
        oVar.f106085g = this.f106006z;
        oVar.f106086h = this.f105946A;
        oVar.f106087i = this.f105947B;
        oVar.f106088j = this.f105948C;
        oVar.f106089k = this.f105949D;
        oVar.f106090l = this.f105950E;
        oVar.f106091m = this.f105951F;
        oVar.f106092n = this.f105953H;
        oVar.f106093o = this.f105954I;
        oVar.f106094p = this.f105952G;
        int i12 = this.f105955J;
        oVar.f106096r = i12;
        constraintWidget.b2(i12);
        HashMap<String, Integer> map = this.f105987h0;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f105985g0.f106215n.w(str, x.b.f238271l, this.f105987h0.get(str).intValue());
            }
        }
        HashMap<String, Float> map2 = this.f105989i0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.f105985g0.f106215n.v(str2, x.b.f238270k, this.f105989i0.get(str2).floatValue());
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.c
    public void b(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.f105985g0 = constraintWidget;
        constraintWidget.h1(this.f105983f0);
    }

    public ConstraintReference b0(int i10) {
        State.Constraint constraint = this.f105977c0;
        if (constraint == null) {
            this.f105991k = i10;
            this.f105992l = i10;
            this.f105993m = i10;
            this.f105994n = i10;
            this.f105995o = i10;
            this.f105996p = i10;
            return this;
        }
        switch (a.f106008a[constraint.ordinal()]) {
            case 1:
            case 2:
                this.f105991k = i10;
                break;
            case 3:
            case 4:
                this.f105992l = i10;
                break;
            case 5:
            case 6:
                this.f105993m = i10;
                break;
            case 7:
            case 8:
                this.f105994n = i10;
                break;
            case 9:
            case 10:
                this.f105995o = i10;
                break;
            case 11:
            case 12:
                this.f105996p = i10;
                break;
            case 13:
            case 14:
            case 15:
                this.f106003w = i10;
                break;
            case 16:
                this.f105975b0 = i10;
                break;
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public void c(Object obj) {
        this.f105972a = obj;
    }

    public ConstraintReference c0(Object obj) {
        return b0(this.f105974b.f(obj));
    }

    @Override // androidx.constraintlayout.core.state.c
    public t0.e d() {
        return this.f105978d;
    }

    public ConstraintReference d0(int i10) {
        State.Constraint constraint = this.f105977c0;
        if (constraint == null) {
            this.f105997q = i10;
            this.f105998r = i10;
            this.f105999s = i10;
            this.f106000t = i10;
            this.f106001u = i10;
            this.f106002v = i10;
            return this;
        }
        switch (a.f106008a[constraint.ordinal()]) {
            case 1:
            case 2:
                this.f105997q = i10;
                break;
            case 3:
            case 4:
                this.f105998r = i10;
                break;
            case 5:
            case 6:
                this.f105999s = i10;
                break;
            case 7:
            case 8:
                this.f106000t = i10;
                break;
            case 9:
            case 10:
                this.f106001u = i10;
                break;
            case 11:
            case 12:
                this.f106002v = i10;
                break;
            case 13:
            case 14:
            case 15:
                this.f106004x = i10;
                break;
        }
        return this;
    }

    public void e(String str, int i10) {
        this.f105987h0.put(str, Integer.valueOf(i10));
    }

    public ConstraintReference e0(Object obj) {
        return d0(this.f105974b.f(obj));
    }

    public void f(String str, float f10) {
        if (this.f105989i0 == null) {
            this.f105989i0 = new HashMap<>();
        }
        this.f105989i0.put(str, Float.valueOf(f10));
    }

    public ConstraintReference f0(float f10) {
        this.f106005y = f10;
        return this;
    }

    public ConstraintReference g(float f10) {
        this.f105952G = f10;
        return this;
    }

    public ConstraintReference g0(float f10) {
        this.f106006z = f10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public Object getKey() {
        return this.f105972a;
    }

    public final void h(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget constraintWidgetO = O(obj);
        if (constraintWidgetO == null) {
            return;
        }
        int[] iArr = a.f106008a;
        int i10 = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                constraintWidget.r(type).b(constraintWidgetO.r(type), this.f105991k, this.f105997q, false);
                break;
            case 2:
                constraintWidget.r(ConstraintAnchor.Type.LEFT).b(constraintWidgetO.r(ConstraintAnchor.Type.RIGHT), this.f105991k, this.f105997q, false);
                break;
            case 3:
                constraintWidget.r(ConstraintAnchor.Type.RIGHT).b(constraintWidgetO.r(ConstraintAnchor.Type.LEFT), this.f105992l, this.f105998r, false);
                break;
            case 4:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.r(type2).b(constraintWidgetO.r(type2), this.f105992l, this.f105998r, false);
                break;
            case 5:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                constraintWidget.r(type3).b(constraintWidgetO.r(type3), this.f105993m, this.f105999s, false);
                break;
            case 6:
                constraintWidget.r(ConstraintAnchor.Type.LEFT).b(constraintWidgetO.r(ConstraintAnchor.Type.RIGHT), this.f105993m, this.f105999s, false);
                break;
            case 7:
                constraintWidget.r(ConstraintAnchor.Type.RIGHT).b(constraintWidgetO.r(ConstraintAnchor.Type.LEFT), this.f105994n, this.f106000t, false);
                break;
            case 8:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.r(type4).b(constraintWidgetO.r(type4), this.f105994n, this.f106000t, false);
                break;
            case 9:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                constraintWidget.r(type5).b(constraintWidgetO.r(type5), this.f105995o, this.f106001u, false);
                break;
            case 10:
                constraintWidget.r(ConstraintAnchor.Type.TOP).b(constraintWidgetO.r(ConstraintAnchor.Type.BOTTOM), this.f105995o, this.f106001u, false);
                break;
            case 11:
                constraintWidget.r(ConstraintAnchor.Type.BOTTOM).b(constraintWidgetO.r(ConstraintAnchor.Type.TOP), this.f105996p, this.f106002v, false);
                break;
            case 12:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.r(type6).b(constraintWidgetO.r(type6), this.f105996p, this.f106002v, false);
                break;
            case 13:
                constraintWidget.v0(ConstraintAnchor.Type.BASELINE, constraintWidgetO, ConstraintAnchor.Type.BOTTOM, this.f106003w, this.f106004x);
                break;
            case 14:
                constraintWidget.v0(ConstraintAnchor.Type.BASELINE, constraintWidgetO, ConstraintAnchor.Type.TOP, this.f106003w, this.f106004x);
                break;
            case 15:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.v0(type7, constraintWidgetO, type7, this.f106003w, this.f106004x);
                break;
            case 16:
                constraintWidget.m(constraintWidgetO, this.f105973a0, (int) this.f105975b0);
                break;
        }
    }

    public ConstraintReference h0() {
        if (this.f105958M != null) {
            this.f105977c0 = State.Constraint.RIGHT_TO_LEFT;
            return this;
        }
        this.f105977c0 = State.Constraint.RIGHT_TO_RIGHT;
        return this;
    }

    public ConstraintReference i() {
        this.f105977c0 = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference i0(Object obj) {
        this.f105977c0 = State.Constraint.RIGHT_TO_LEFT;
        this.f105958M = obj;
        return this;
    }

    public ConstraintReference j(Object obj) {
        this.f105977c0 = State.Constraint.BASELINE_TO_BASELINE;
        this.f105968W = obj;
        return this;
    }

    public ConstraintReference j0(Object obj) {
        this.f105977c0 = State.Constraint.RIGHT_TO_RIGHT;
        this.f105959N = obj;
        return this;
    }

    public ConstraintReference k(Object obj) {
        this.f105977c0 = State.Constraint.BASELINE_TO_BOTTOM;
        this.f105970Y = obj;
        return this;
    }

    public ConstraintReference k0(float f10) {
        this.f105946A = f10;
        return this;
    }

    public ConstraintReference l(Object obj) {
        this.f105977c0 = State.Constraint.BASELINE_TO_TOP;
        this.f105969X = obj;
        return this;
    }

    public ConstraintReference l0(float f10) {
        this.f105947B = f10;
        return this;
    }

    public ConstraintReference m(float f10) {
        State.Constraint constraint = this.f105977c0;
        if (constraint != null) {
            int i10 = a.f106008a[constraint.ordinal()];
            if (i10 != 17) {
                if (i10 != 18) {
                    switch (i10) {
                    }
                }
                this.f105990j = f10;
                return this;
            }
            this.f105988i = f10;
            return this;
        }
        return this;
    }

    public ConstraintReference m0(float f10) {
        this.f105948C = f10;
        return this;
    }

    public ConstraintReference n() {
        if (this.f105966U != null) {
            this.f105977c0 = State.Constraint.BOTTOM_TO_TOP;
            return this;
        }
        this.f105977c0 = State.Constraint.BOTTOM_TO_BOTTOM;
        return this;
    }

    public ConstraintReference n0(float f10) {
        this.f105953H = f10;
        return this;
    }

    public ConstraintReference o(Object obj) {
        this.f105977c0 = State.Constraint.BOTTOM_TO_BOTTOM;
        this.f105967V = obj;
        return this;
    }

    public ConstraintReference o0(float f10) {
        this.f105954I = f10;
        return this;
    }

    public ConstraintReference p(Object obj) {
        this.f105977c0 = State.Constraint.BOTTOM_TO_TOP;
        this.f105966U = obj;
        return this;
    }

    public void p0(t0.e eVar) {
        this.f105978d = eVar;
        if (eVar != null) {
            b(eVar.a());
        }
    }

    public ConstraintReference q(Object obj) {
        Object objB = B(obj);
        this.f105960O = objB;
        this.f105963R = objB;
        this.f105977c0 = State.Constraint.CENTER_HORIZONTALLY;
        this.f105988i = 0.5f;
        return this;
    }

    public ConstraintReference q0(Dimension dimension) {
        this.f105981e0 = dimension;
        return this;
    }

    public ConstraintReference r(Object obj) {
        Object objB = B(obj);
        this.f105964S = objB;
        this.f105967V = objB;
        this.f105977c0 = State.Constraint.CENTER_VERTICALLY;
        this.f105990j = 0.5f;
        return this;
    }

    public void r0(int i10) {
        this.f105980e = i10;
    }

    public ConstraintReference s(Object obj, float f10, float f11) {
        this.f105971Z = B(obj);
        this.f105973a0 = f10;
        this.f105975b0 = f11;
        this.f105977c0 = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    public void s0(float f10) {
        this.f105984g = f10;
    }

    public ConstraintReference t() {
        State.Constraint constraint = this.f105977c0;
        if (constraint == null) {
            this.f105956K = null;
            this.f105957L = null;
            this.f105991k = 0;
            this.f105958M = null;
            this.f105959N = null;
            this.f105992l = 0;
            this.f105960O = null;
            this.f105961P = null;
            this.f105993m = 0;
            this.f105962Q = null;
            this.f105963R = null;
            this.f105994n = 0;
            this.f105964S = null;
            this.f105965T = null;
            this.f105995o = 0;
            this.f105966U = null;
            this.f105967V = null;
            this.f105996p = 0;
            this.f105968W = null;
            this.f105971Z = null;
            this.f105988i = 0.5f;
            this.f105990j = 0.5f;
            this.f105997q = 0;
            this.f105998r = 0;
            this.f105999s = 0;
            this.f106000t = 0;
            this.f106001u = 0;
            this.f106002v = 0;
            return this;
        }
        switch (a.f106008a[constraint.ordinal()]) {
            case 1:
            case 2:
                this.f105956K = null;
                this.f105957L = null;
                this.f105991k = 0;
                this.f105997q = 0;
                break;
            case 3:
            case 4:
                this.f105958M = null;
                this.f105959N = null;
                this.f105992l = 0;
                this.f105998r = 0;
                break;
            case 5:
            case 6:
                this.f105960O = null;
                this.f105961P = null;
                this.f105993m = 0;
                this.f105999s = 0;
                break;
            case 7:
            case 8:
                this.f105962Q = null;
                this.f105963R = null;
                this.f105994n = 0;
                this.f106000t = 0;
                break;
            case 9:
            case 10:
                this.f105964S = null;
                this.f105965T = null;
                this.f105995o = 0;
                this.f106001u = 0;
                break;
            case 11:
            case 12:
                this.f105966U = null;
                this.f105967V = null;
                this.f105996p = 0;
                this.f106002v = 0;
                break;
            case 15:
                this.f105968W = null;
                break;
            case 16:
                this.f105971Z = null;
                break;
        }
        return this;
    }

    public void t0(String str) {
        this.f105976c = str;
    }

    public ConstraintReference u() {
        y0().t();
        y().t();
        Y().t();
        h0().t();
        return this;
    }

    public void u0(int i10) {
        this.f105982f = i10;
    }

    public ConstraintReference v() {
        B0().t();
        i().t();
        n().t();
        return this;
    }

    public void v0(float f10) {
        this.f105986h = f10;
    }

    public ConstraintWidget w() {
        return new ConstraintWidget(0, 0, V().n(), D().n());
    }

    public void w0(Object obj) {
        this.f105983f0 = obj;
        ConstraintWidget constraintWidget = this.f105985g0;
        if (constraintWidget != null) {
            constraintWidget.h1(obj);
        }
    }

    public final void x() {
        this.f105956K = B(this.f105956K);
        this.f105957L = B(this.f105957L);
        this.f105958M = B(this.f105958M);
        this.f105959N = B(this.f105959N);
        this.f105960O = B(this.f105960O);
        this.f105961P = B(this.f105961P);
        this.f105962Q = B(this.f105962Q);
        this.f105963R = B(this.f105963R);
        this.f105964S = B(this.f105964S);
        this.f105965T = B(this.f105965T);
        this.f105966U = B(this.f105966U);
        this.f105967V = B(this.f105967V);
        this.f105968W = B(this.f105968W);
        this.f105969X = B(this.f105969X);
        this.f105970Y = B(this.f105970Y);
    }

    public ConstraintReference x0(Dimension dimension) {
        this.f105979d0 = dimension;
        return this;
    }

    public ConstraintReference y() {
        if (this.f105962Q != null) {
            this.f105977c0 = State.Constraint.END_TO_START;
            return this;
        }
        this.f105977c0 = State.Constraint.END_TO_END;
        return this;
    }

    public ConstraintReference y0() {
        if (this.f105960O != null) {
            this.f105977c0 = State.Constraint.START_TO_START;
            return this;
        }
        this.f105977c0 = State.Constraint.START_TO_END;
        return this;
    }

    public ConstraintReference z(Object obj) {
        this.f105977c0 = State.Constraint.END_TO_END;
        this.f105963R = obj;
        return this;
    }

    public ConstraintReference z0(Object obj) {
        this.f105977c0 = State.Constraint.START_TO_END;
        this.f105961P = obj;
        return this;
    }
}
