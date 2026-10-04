package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class i extends WidgetRun {
    public i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f106197e.f();
        constraintWidget.f106199f.f();
        this.f106270f = ((androidx.constraintlayout.core.widgets.f) constraintWidget).m2();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        DependencyNode dependencyNode = this.f106272h;
        if (dependencyNode.f106255c && !dependencyNode.f106262j) {
            DependencyNode dependencyNode2 = dependencyNode.f106264l.get(0);
            this.f106272h.e((int) ((((androidx.constraintlayout.core.widgets.f) this.f106266b).q2() * dependencyNode2.f106259g) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) this.f106266b;
        int iN2 = fVar.n2();
        int iP2 = fVar.p2();
        if (fVar.m2() == 1) {
            if (iN2 != -1) {
                this.f106272h.f106264l.add(this.f106266b.f106194c0.f106197e.f106272h);
                this.f106266b.f106194c0.f106197e.f106272h.f106263k.add(this.f106272h);
                this.f106272h.f106258f = iN2;
            } else if (iP2 != -1) {
                this.f106272h.f106264l.add(this.f106266b.f106194c0.f106197e.f106273i);
                this.f106266b.f106194c0.f106197e.f106273i.f106263k.add(this.f106272h);
                this.f106272h.f106258f = -iP2;
            } else {
                DependencyNode dependencyNode = this.f106272h;
                dependencyNode.f106254b = true;
                dependencyNode.f106264l.add(this.f106266b.f106194c0.f106197e.f106273i);
                this.f106266b.f106194c0.f106197e.f106273i.f106263k.add(this.f106272h);
            }
            u(this.f106266b.f106197e.f106272h);
            u(this.f106266b.f106197e.f106273i);
            return;
        }
        if (iN2 != -1) {
            this.f106272h.f106264l.add(this.f106266b.f106194c0.f106199f.f106272h);
            this.f106266b.f106194c0.f106199f.f106272h.f106263k.add(this.f106272h);
            this.f106272h.f106258f = iN2;
        } else if (iP2 != -1) {
            this.f106272h.f106264l.add(this.f106266b.f106194c0.f106199f.f106273i);
            this.f106266b.f106194c0.f106199f.f106273i.f106263k.add(this.f106272h);
            this.f106272h.f106258f = -iP2;
        } else {
            DependencyNode dependencyNode2 = this.f106272h;
            dependencyNode2.f106254b = true;
            dependencyNode2.f106264l.add(this.f106266b.f106194c0.f106199f.f106273i);
            this.f106266b.f106194c0.f106199f.f106273i.f106263k.add(this.f106272h);
        }
        u(this.f106266b.f106199f.f106272h);
        u(this.f106266b.f106199f.f106273i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        if (((androidx.constraintlayout.core.widgets.f) this.f106266b).m2() == 1) {
            this.f106266b.f2(this.f106272h.f106259g);
        } else {
            this.f106266b.g2(this.f106272h.f106259g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f106272h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void n() {
        this.f106272h.f106262j = false;
        this.f106273i.f106262j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean p() {
        return false;
    }

    public final void u(DependencyNode dependencyNode) {
        this.f106272h.f106263k.add(dependencyNode);
        dependencyNode.f106264l.add(this.f106272h);
    }
}
