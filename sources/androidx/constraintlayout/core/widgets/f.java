package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class f extends ConstraintWidget {

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public static final int f106467I1 = 0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public static final int f106468J1 = 1;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public static final int f106469K1 = 0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public static final int f106470L1 = 1;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public static final int f106471M1 = 2;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public static final int f106472N1 = -1;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public float f106473A1 = -1.0f;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public int f106474B1 = -1;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public int f106475C1 = -1;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public boolean f106476D1 = true;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public ConstraintAnchor f106477E1 = this.f106177R;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public int f106478F1 = 0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public int f106479G1 = 0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public boolean f106480H1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106481a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f106481a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106481a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106481a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106481a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f106481a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f106481a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f106481a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f106481a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f106481a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public f() {
        this.f106188Z.clear();
        this.f106188Z.add(this.f106477E1);
        int length = this.f106187Y.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f106187Y[i10] = this.f106477E1;
        }
    }

    public void A2(int i10) {
        this.f106479G1 = i10;
    }

    public void B2(int i10) {
        if (this.f106478F1 == i10) {
            return;
        }
        this.f106478F1 = i10;
        this.f106188Z.clear();
        if (this.f106478F1 == 1) {
            this.f106477E1 = this.f106175Q;
        } else {
            this.f106477E1 = this.f106177R;
        }
        this.f106188Z.add(this.f106477E1);
        int length = this.f106187Y.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f106187Y[i11] = this.f106477E1;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean G0() {
        return this.f106480H1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean H0() {
        return this.f106480H1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String f0() {
        return "Guideline";
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.d dVar, boolean z10) {
        d dVar2 = (d) U();
        if (dVar2 == null) {
            return;
        }
        ConstraintAnchor constraintAnchorR = dVar2.r(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorR2 = dVar2.r(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f106194c0;
        boolean z11 = constraintWidget != null && constraintWidget.f106192b0[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.f106478F1 == 0) {
            constraintAnchorR = dVar2.r(ConstraintAnchor.Type.TOP);
            constraintAnchorR2 = dVar2.r(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f106194c0;
            z11 = constraintWidget2 != null && constraintWidget2.f106192b0[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.f106480H1 && this.f106477E1.o()) {
            SolverVariable solverVariableU = dVar.u(this.f106477E1);
            dVar.f(solverVariableU, this.f106477E1.f());
            if (this.f106474B1 != -1) {
                if (z11) {
                    dVar.i(dVar.u(constraintAnchorR2), solverVariableU, 0, 5);
                }
            } else if (this.f106475C1 != -1 && z11) {
                SolverVariable solverVariableU2 = dVar.u(constraintAnchorR2);
                dVar.i(solverVariableU, dVar.u(constraintAnchorR), 0, 5);
                dVar.i(solverVariableU2, solverVariableU, 0, 5);
            }
            this.f106480H1 = false;
            return;
        }
        if (this.f106474B1 != -1) {
            SolverVariable solverVariableU3 = dVar.u(this.f106477E1);
            dVar.e(solverVariableU3, dVar.u(constraintAnchorR), this.f106474B1, 8);
            if (z11) {
                dVar.i(dVar.u(constraintAnchorR2), solverVariableU3, 0, 5);
                return;
            }
            return;
        }
        if (this.f106475C1 == -1) {
            if (this.f106473A1 != -1.0f) {
                dVar.d(dVar.v().m(dVar.u(this.f106477E1), dVar.u(constraintAnchorR2), this.f106473A1));
                return;
            }
            return;
        }
        SolverVariable solverVariableU4 = dVar.u(this.f106477E1);
        SolverVariable solverVariableU5 = dVar.u(constraintAnchorR2);
        dVar.e(solverVariableU4, solverVariableU5, -this.f106475C1, 8);
        if (z11) {
            dVar.i(solverVariableU4, dVar.u(constraintAnchorR), 0, 5);
            dVar.i(solverVariableU5, solverVariableU4, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void j2(androidx.constraintlayout.core.d dVar, boolean z10) {
        if (U() == null) {
            return;
        }
        int iO = dVar.O(this.f106477E1);
        if (this.f106478F1 == 1) {
            f2(iO);
            g2(0);
            y1(U().D());
            c2(0);
            return;
        }
        f2(0);
        g2(iO);
        c2(U().m0());
        y1(0);
    }

    public void k2() {
        if (this.f106474B1 != -1) {
            t2();
        } else if (this.f106473A1 != -1.0f) {
            s2();
        } else if (this.f106475C1 != -1) {
            r2();
        }
    }

    public ConstraintAnchor l2() {
        return this.f106477E1;
    }

    public int m2() {
        return this.f106478F1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.n(constraintWidget, map);
        f fVar = (f) constraintWidget;
        this.f106473A1 = fVar.f106473A1;
        this.f106474B1 = fVar.f106474B1;
        this.f106475C1 = fVar.f106475C1;
        this.f106476D1 = fVar.f106476D1;
        B2(fVar.f106478F1);
    }

    public int n2() {
        return this.f106474B1;
    }

    public int o2() {
        if (this.f106473A1 != -1.0f) {
            return 0;
        }
        if (this.f106474B1 != -1) {
            return 1;
        }
        return this.f106475C1 != -1 ? 2 : -1;
    }

    public int p2() {
        return this.f106475C1;
    }

    public float q2() {
        return this.f106473A1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor r(ConstraintAnchor.Type type) {
        int i10 = a.f106481a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f106478F1 == 1) {
                return this.f106477E1;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f106478F1 == 0) {
            return this.f106477E1;
        }
        return null;
    }

    public void r2() {
        int iO0 = o0();
        if (this.f106478F1 == 0) {
            iO0 = p0();
        }
        w2(iO0);
    }

    public void s2() {
        int iM0 = U().m0() - o0();
        if (this.f106478F1 == 0) {
            iM0 = U().D() - p0();
        }
        x2(iM0);
    }

    public void t2() {
        float fO0 = o0() / U().m0();
        if (this.f106478F1 == 0) {
            fO0 = p0() / U().D();
        }
        y2(fO0);
    }

    public boolean u2() {
        return this.f106473A1 != -1.0f && this.f106474B1 == -1 && this.f106475C1 == -1;
    }

    public void v2(int i10) {
        this.f106477E1.A(i10);
        this.f106480H1 = true;
    }

    public void w2(int i10) {
        if (i10 > -1) {
            this.f106473A1 = -1.0f;
            this.f106474B1 = i10;
            this.f106475C1 = -1;
        }
    }

    public void x2(int i10) {
        if (i10 > -1) {
            this.f106473A1 = -1.0f;
            this.f106474B1 = -1;
            this.f106475C1 = i10;
        }
    }

    public void y2(float f10) {
        if (f10 > -1.0f) {
            this.f106473A1 = f10;
            this.f106474B1 = -1;
            this.f106475C1 = -1;
        }
    }

    public void z2(int i10) {
        y2(i10 / 100.0f);
    }
}
