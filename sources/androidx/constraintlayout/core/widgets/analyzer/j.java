package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class j extends WidgetRun {
    public j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void u(DependencyNode dependencyNode) {
        this.f106272h.f106263k.add(dependencyNode);
        dependencyNode.f106264l.add(this.f106272h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f106266b;
        int iP2 = aVar.p2();
        Iterator<DependencyNode> it = this.f106272h.f106264l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f106259g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iP2 == 0 || iP2 == 2) {
            this.f106272h.e(aVar.q2() + i11);
        } else {
            this.f106272h.e(aVar.q2() + i10);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidget = this.f106266b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            this.f106272h.f106254b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int iP2 = aVar.p2();
            boolean zO2 = aVar.o2();
            int i10 = 0;
            if (iP2 == 0) {
                this.f106272h.f106257e = DependencyNode.Type.LEFT;
                while (i10 < aVar.f239331B1) {
                    ConstraintWidget constraintWidget2 = aVar.f239330A1[i10];
                    if (zO2 || constraintWidget2.l0() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.f106197e.f106272h;
                        dependencyNode.f106263k.add(this.f106272h);
                        this.f106272h.f106264l.add(dependencyNode);
                    }
                    i10++;
                }
                u(this.f106266b.f106197e.f106272h);
                u(this.f106266b.f106197e.f106273i);
                return;
            }
            if (iP2 == 1) {
                this.f106272h.f106257e = DependencyNode.Type.RIGHT;
                while (i10 < aVar.f239331B1) {
                    ConstraintWidget constraintWidget3 = aVar.f239330A1[i10];
                    if (zO2 || constraintWidget3.l0() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.f106197e.f106273i;
                        dependencyNode2.f106263k.add(this.f106272h);
                        this.f106272h.f106264l.add(dependencyNode2);
                    }
                    i10++;
                }
                u(this.f106266b.f106197e.f106272h);
                u(this.f106266b.f106197e.f106273i);
                return;
            }
            if (iP2 == 2) {
                this.f106272h.f106257e = DependencyNode.Type.TOP;
                while (i10 < aVar.f239331B1) {
                    ConstraintWidget constraintWidget4 = aVar.f239330A1[i10];
                    if (zO2 || constraintWidget4.l0() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.f106199f.f106272h;
                        dependencyNode3.f106263k.add(this.f106272h);
                        this.f106272h.f106264l.add(dependencyNode3);
                    }
                    i10++;
                }
                u(this.f106266b.f106199f.f106272h);
                u(this.f106266b.f106199f.f106273i);
                return;
            }
            if (iP2 != 3) {
                return;
            }
            this.f106272h.f106257e = DependencyNode.Type.BOTTOM;
            while (i10 < aVar.f239331B1) {
                ConstraintWidget constraintWidget5 = aVar.f239330A1[i10];
                if (zO2 || constraintWidget5.l0() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.f106199f.f106273i;
                    dependencyNode4.f106263k.add(this.f106272h);
                    this.f106272h.f106264l.add(dependencyNode4);
                }
                i10++;
            }
            u(this.f106266b.f106199f.f106272h);
            u(this.f106266b.f106199f.f106273i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        ConstraintWidget constraintWidget = this.f106266b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int iP2 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).p2();
            if (iP2 == 0 || iP2 == 1) {
                this.f106266b.f2(this.f106272h.f106259g);
            } else {
                this.f106266b.g2(this.f106272h.f106259g);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f106267c = null;
        this.f106272h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void n() {
        this.f106272h.f106262j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean p() {
        return false;
    }
}
