package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.HashSet;
import u0.C5634b;

/* JADX INFO: loaded from: classes.dex */
public class i extends C5634b {

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public int f106499C1 = 0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public int f106500D1 = 0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public int f106501E1 = 0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public int f106502F1 = 0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public int f106503G1 = 0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public int f106504H1 = 0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public int f106505I1 = 0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public int f106506J1 = 0;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public boolean f106507K1 = false;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public int f106508L1 = 0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public int f106509M1 = 0;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public b.a f106510N1 = new b.a();

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public b.InterfaceC0270b f106511O1 = null;

    public void A2(int i10, int i11) {
        this.f106508L1 = i10;
        this.f106509M1 = i11;
    }

    public void B2(int i10) {
        this.f106501E1 = i10;
        this.f106499C1 = i10;
        this.f106502F1 = i10;
        this.f106500D1 = i10;
        this.f106503G1 = i10;
        this.f106504H1 = i10;
    }

    public void C2(int i10) {
        this.f106500D1 = i10;
    }

    public void D2(int i10) {
        this.f106504H1 = i10;
    }

    public void E2(int i10) {
        this.f106501E1 = i10;
        this.f106505I1 = i10;
    }

    public void F2(int i10) {
        this.f106502F1 = i10;
        this.f106506J1 = i10;
    }

    public void G2(int i10) {
        this.f106503G1 = i10;
        this.f106505I1 = i10;
        this.f106506J1 = i10;
    }

    public void H2(int i10) {
        this.f106499C1 = i10;
    }

    @Override // u0.C5634b, u0.InterfaceC5633a
    public void c(d dVar) {
        n2();
    }

    public void m2(boolean z10) {
        int i10 = this.f106503G1;
        if (i10 > 0 || this.f106504H1 > 0) {
            if (z10) {
                this.f106505I1 = this.f106504H1;
                this.f106506J1 = i10;
            } else {
                this.f106505I1 = i10;
                this.f106506J1 = this.f106504H1;
            }
        }
    }

    public void n2() {
        for (int i10 = 0; i10 < this.f239331B1; i10++) {
            ConstraintWidget constraintWidget = this.f239330A1[i10];
            if (constraintWidget != null) {
                constraintWidget.I1(true);
            }
        }
    }

    public boolean o2(HashSet<ConstraintWidget> hashSet) {
        for (int i10 = 0; i10 < this.f239331B1; i10++) {
            if (hashSet.contains(this.f239330A1[i10])) {
                return true;
            }
        }
        return false;
    }

    public int p2() {
        return this.f106509M1;
    }

    public int q2() {
        return this.f106508L1;
    }

    public int r2() {
        return this.f106500D1;
    }

    public int s2() {
        return this.f106505I1;
    }

    public int t2() {
        return this.f106506J1;
    }

    public int u2() {
        return this.f106499C1;
    }

    public void v2(int i10, int i11, int i12, int i13) {
    }

    public void w2(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        while (this.f106511O1 == null && U() != null) {
            this.f106511O1 = ((d) U()).G2();
        }
        b.a aVar = this.f106510N1;
        aVar.f106290a = dimensionBehaviour;
        aVar.f106291b = dimensionBehaviour2;
        aVar.f106292c = i10;
        aVar.f106293d = i11;
        this.f106511O1.b(constraintWidget, aVar);
        constraintWidget.c2(this.f106510N1.f106294e);
        constraintWidget.y1(this.f106510N1.f106295f);
        constraintWidget.x1(this.f106510N1.f106297h);
        constraintWidget.g1(this.f106510N1.f106296g);
    }

    public boolean x2() {
        ConstraintWidget constraintWidget = this.f106194c0;
        b.InterfaceC0270b interfaceC0270bG2 = constraintWidget != null ? ((d) constraintWidget).G2() : null;
        if (interfaceC0270bG2 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f239331B1; i10++) {
            ConstraintWidget constraintWidget2 = this.f239330A1[i10];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof f)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourZ = constraintWidget2.z(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourZ2 = constraintWidget2.z(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourZ != dimensionBehaviour || constraintWidget2.f106233w == 1 || dimensionBehaviourZ2 != dimensionBehaviour || constraintWidget2.f106235x == 1) {
                    if (dimensionBehaviourZ == dimensionBehaviour) {
                        dimensionBehaviourZ = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviourZ2 == dimensionBehaviour) {
                        dimensionBehaviourZ2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    b.a aVar = this.f106510N1;
                    aVar.f106290a = dimensionBehaviourZ;
                    aVar.f106291b = dimensionBehaviourZ2;
                    aVar.f106292c = constraintWidget2.m0();
                    this.f106510N1.f106293d = constraintWidget2.D();
                    interfaceC0270bG2.b(constraintWidget2, this.f106510N1);
                    constraintWidget2.c2(this.f106510N1.f106294e);
                    constraintWidget2.y1(this.f106510N1.f106295f);
                    constraintWidget2.g1(this.f106510N1.f106296g);
                }
            }
        }
        return true;
    }

    public boolean y2() {
        return this.f106507K1;
    }

    public void z2(boolean z10) {
        this.f106507K1 = z10;
    }
}
