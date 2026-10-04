package androidx.constraintlayout.core.widgets;

import androidx.compose.runtime.changelist.j;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import u0.C5634b;

/* JADX INFO: loaded from: classes.dex */
public class a extends C5634b {

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public static final int f106243G1 = 0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public static final int f106244H1 = 1;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public static final int f106245I1 = 2;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public static final int f106246J1 = 3;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public static final boolean f106247K1 = true;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public static final boolean f106248L1 = false;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public int f106249C1 = 0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public boolean f106250D1 = true;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public int f106251E1 = 0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public boolean f106252F1 = false;

    public a() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean G0() {
        return this.f106252F1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean H0() {
        return this.f106252F1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.d dVar, boolean z10) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        ConstraintAnchor[] constraintAnchorArr2 = this.f106187Y;
        constraintAnchorArr2[0] = this.f106175Q;
        constraintAnchorArr2[2] = this.f106177R;
        constraintAnchorArr2[1] = this.f106179S;
        constraintAnchorArr2[3] = this.f106181T;
        int i13 = 0;
        while (true) {
            constraintAnchorArr = this.f106187Y;
            if (i13 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i13];
            constraintAnchor.f106109i = dVar.u(constraintAnchor);
            i13++;
        }
        int i14 = this.f106249C1;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i14];
        if (!this.f106252F1) {
            m2();
        }
        if (this.f106252F1) {
            this.f106252F1 = false;
            int i15 = this.f106249C1;
            if (i15 == 0 || i15 == 1) {
                dVar.f(this.f106175Q.f106109i, this.f106204h0);
                dVar.f(this.f106179S.f106109i, this.f106204h0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    dVar.f(this.f106177R.f106109i, this.f106206i0);
                    dVar.f(this.f106181T.f106109i, this.f106206i0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f239331B1; i16++) {
            ConstraintWidget constraintWidget = this.f239330A1[i16];
            if ((this.f106250D1 || constraintWidget.h()) && ((((i11 = this.f106249C1) == 0 || i11 == 1) && constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f106175Q.f106106f != null && constraintWidget.f106179S.f106106f != null) || (((i12 = this.f106249C1) == 2 || i12 == 3) && constraintWidget.j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f106177R.f106106f != null && constraintWidget.f106181T.f106106f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.f106175Q.m() || this.f106179S.m();
        boolean z13 = this.f106177R.m() || this.f106181T.m();
        int i17 = !(!z11 && (((i10 = this.f106249C1) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.f239331B1; i18++) {
            ConstraintWidget constraintWidget2 = this.f239330A1[i18];
            if (this.f106250D1 || constraintWidget2.h()) {
                SolverVariable solverVariableU = dVar.u(constraintWidget2.f106187Y[this.f106249C1]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f106187Y;
                int i19 = this.f106249C1;
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i19];
                constraintAnchor3.f106109i = solverVariableU;
                ConstraintAnchor constraintAnchor4 = constraintAnchor3.f106106f;
                int i20 = (constraintAnchor4 == null || constraintAnchor4.f106104d != this) ? 0 : constraintAnchor3.f106107g;
                if (i19 == 0 || i19 == 2) {
                    dVar.j(constraintAnchor2.f106109i, solverVariableU, this.f106251E1 - i20, z11);
                } else {
                    dVar.h(constraintAnchor2.f106109i, solverVariableU, this.f106251E1 + i20, z11);
                }
                dVar.e(constraintAnchor2.f106109i, solverVariableU, this.f106251E1 + i20, i17);
            }
        }
        int i21 = this.f106249C1;
        if (i21 == 0) {
            dVar.e(this.f106179S.f106109i, this.f106175Q.f106109i, 0, 8);
            dVar.e(this.f106175Q.f106109i, this.f106194c0.f106179S.f106109i, 0, 4);
            dVar.e(this.f106175Q.f106109i, this.f106194c0.f106175Q.f106109i, 0, 0);
            return;
        }
        if (i21 == 1) {
            dVar.e(this.f106175Q.f106109i, this.f106179S.f106109i, 0, 8);
            dVar.e(this.f106175Q.f106109i, this.f106194c0.f106175Q.f106109i, 0, 4);
            dVar.e(this.f106175Q.f106109i, this.f106194c0.f106179S.f106109i, 0, 0);
        } else if (i21 == 2) {
            dVar.e(this.f106181T.f106109i, this.f106177R.f106109i, 0, 8);
            dVar.e(this.f106177R.f106109i, this.f106194c0.f106181T.f106109i, 0, 4);
            dVar.e(this.f106177R.f106109i, this.f106194c0.f106177R.f106109i, 0, 0);
        } else if (i21 == 3) {
            dVar.e(this.f106177R.f106109i, this.f106181T.f106109i, 0, 8);
            dVar.e(this.f106177R.f106109i, this.f106194c0.f106177R.f106109i, 0, 4);
            dVar.e(this.f106177R.f106109i, this.f106194c0.f106181T.f106109i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    public boolean m2() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f239331B1;
            if (i13 >= i10) {
                break;
            }
            ConstraintWidget constraintWidget = this.f239330A1[i13];
            if ((this.f106250D1 || constraintWidget.h()) && ((((i11 = this.f106249C1) == 0 || i11 == 1) && !constraintWidget.G0()) || (((i12 = this.f106249C1) == 2 || i12 == 3) && !constraintWidget.H0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f239331B1; i14++) {
            ConstraintWidget constraintWidget2 = this.f239330A1[i14];
            if (this.f106250D1 || constraintWidget2.h()) {
                if (!z11) {
                    int i15 = this.f106249C1;
                    if (i15 == 0) {
                        iMax = constraintWidget2.r(ConstraintAnchor.Type.LEFT).f();
                    } else if (i15 == 1) {
                        iMax = constraintWidget2.r(ConstraintAnchor.Type.RIGHT).f();
                    } else if (i15 == 2) {
                        iMax = constraintWidget2.r(ConstraintAnchor.Type.TOP).f();
                    } else if (i15 == 3) {
                        iMax = constraintWidget2.r(ConstraintAnchor.Type.BOTTOM).f();
                    }
                    z11 = true;
                }
                int i16 = this.f106249C1;
                if (i16 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.r(ConstraintAnchor.Type.LEFT).f());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.r(ConstraintAnchor.Type.RIGHT).f());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.r(ConstraintAnchor.Type.TOP).f());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.r(ConstraintAnchor.Type.BOTTOM).f());
                }
            }
        }
        int i17 = iMax + this.f106251E1;
        int i18 = this.f106249C1;
        if (i18 == 0 || i18 == 1) {
            q1(i17, i17);
        } else {
            t1(i17, i17);
        }
        this.f106252F1 = true;
        return true;
    }

    @Override // u0.C5634b, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.n(constraintWidget, map);
        a aVar = (a) constraintWidget;
        this.f106249C1 = aVar.f106249C1;
        this.f106250D1 = aVar.f106250D1;
        this.f106251E1 = aVar.f106251E1;
    }

    @Deprecated
    public boolean n2() {
        return this.f106250D1;
    }

    public boolean o2() {
        return this.f106250D1;
    }

    public int p2() {
        return this.f106249C1;
    }

    public int q2() {
        return this.f106251E1;
    }

    public int r2() {
        int i10 = this.f106249C1;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    public void s2() {
        for (int i10 = 0; i10 < this.f239331B1; i10++) {
            ConstraintWidget constraintWidget = this.f239330A1[i10];
            if (this.f106250D1 || constraintWidget.h()) {
                int i11 = this.f106249C1;
                if (i11 == 0 || i11 == 1) {
                    constraintWidget.G1(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    constraintWidget.G1(1, true);
                }
            }
        }
    }

    public void t2(boolean z10) {
        this.f106250D1 = z10;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String string = "[Barrier] " + y() + " {";
        for (int i10 = 0; i10 < this.f239331B1; i10++) {
            ConstraintWidget constraintWidget = this.f239330A1[i10];
            if (i10 > 0) {
                string = j.a(string, U6.j.f68738d);
            }
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(string);
            sbA.append(constraintWidget.y());
            string = sbA.toString();
        }
        return j.a(string, "}");
    }

    public void u2(int i10) {
        this.f106249C1 = i10;
    }

    public void v2(int i10) {
        this.f106251E1 = i10;
    }

    public a(String str) {
        j1(str);
    }
}
