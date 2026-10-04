package u0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.h;
import androidx.constraintlayout.core.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: u0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5634b extends ConstraintWidget implements InterfaceC5633a {

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public ConstraintWidget[] f239330A1 = new ConstraintWidget[4];

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public int f239331B1 = 0;

    @Override // u0.InterfaceC5633a
    public void a(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i10 = this.f239331B1 + 1;
        ConstraintWidget[] constraintWidgetArr = this.f239330A1;
        if (i10 > constraintWidgetArr.length) {
            this.f239330A1 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f239330A1;
        int i11 = this.f239331B1;
        constraintWidgetArr2[i11] = constraintWidget;
        this.f239331B1 = i11 + 1;
    }

    @Override // u0.InterfaceC5633a
    public void b() {
        this.f239331B1 = 0;
        Arrays.fill(this.f239330A1, (Object) null);
    }

    public void k2(ArrayList<n> arrayList, int i10, n nVar) {
        for (int i11 = 0; i11 < this.f239331B1; i11++) {
            nVar.a(this.f239330A1[i11]);
        }
        for (int i12 = 0; i12 < this.f239331B1; i12++) {
            h.a(this.f239330A1[i12], i10, arrayList, nVar);
        }
    }

    public int l2(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f239331B1; i13++) {
            ConstraintWidget constraintWidget = this.f239330A1[i13];
            if (i10 == 0 && (i12 = constraintWidget.f106180S0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = constraintWidget.f106182T0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.n(constraintWidget, map);
        C5634b c5634b = (C5634b) constraintWidget;
        this.f239331B1 = 0;
        int i10 = c5634b.f239331B1;
        for (int i11 = 0; i11 < i10; i11++) {
            a(map.get(c5634b.f239330A1[i11]));
        }
    }

    public void c(androidx.constraintlayout.core.widgets.d dVar) {
    }
}
