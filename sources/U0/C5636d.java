package u0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: renamed from: u0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5636d extends ConstraintWidget {

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f239336A1;

    public C5636d() {
        this.f239336A1 = new ArrayList<>();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Q1(int i10, int i11) {
        this.f106212l0 = i10;
        this.f106214m0 = i11;
        int size = this.f239336A1.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f239336A1.get(i12).Q1(Y(), Z());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void R0() {
        this.f239336A1.clear();
        super.R0();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void W0(androidx.constraintlayout.core.c cVar) {
        super.W0(cVar);
        int size = this.f239336A1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f239336A1.get(i10).W0(cVar);
        }
    }

    public void a(ConstraintWidget constraintWidget) {
        this.f239336A1.add(constraintWidget);
        if (constraintWidget.U() != null) {
            ((C5636d) constraintWidget.U()).o2(constraintWidget);
        }
        constraintWidget.S1(this);
    }

    public void k2(ConstraintWidget... constraintWidgetArr) {
        for (ConstraintWidget constraintWidget : constraintWidgetArr) {
            a(constraintWidget);
        }
    }

    public ArrayList<ConstraintWidget> l2() {
        return this.f239336A1;
    }

    public androidx.constraintlayout.core.widgets.d m2() {
        ConstraintWidget constraintWidgetU = U();
        androidx.constraintlayout.core.widgets.d dVar = this instanceof androidx.constraintlayout.core.widgets.d ? (androidx.constraintlayout.core.widgets.d) this : null;
        while (constraintWidgetU != null) {
            ConstraintWidget constraintWidgetU2 = constraintWidgetU.U();
            if (constraintWidgetU instanceof androidx.constraintlayout.core.widgets.d) {
                dVar = (androidx.constraintlayout.core.widgets.d) constraintWidgetU;
            }
            constraintWidgetU = constraintWidgetU2;
        }
        return dVar;
    }

    public void n2() {
        ArrayList<ConstraintWidget> arrayList = this.f239336A1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f239336A1.get(i10);
            if (constraintWidget instanceof C5636d) {
                ((C5636d) constraintWidget).n2();
            }
        }
    }

    public void o2(ConstraintWidget constraintWidget) {
        this.f239336A1.remove(constraintWidget);
        constraintWidget.R0();
    }

    public void p2() {
        this.f239336A1.clear();
    }

    public C5636d(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.f239336A1 = new ArrayList<>();
    }

    public C5636d(int i10, int i11) {
        super(0, 0, i10, i11);
        this.f239336A1 = new ArrayList<>();
    }
}
