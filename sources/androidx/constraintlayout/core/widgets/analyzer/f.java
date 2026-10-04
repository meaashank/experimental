package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* JADX INFO: loaded from: classes.dex */
public class f extends DependencyNode {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f106312m;

    public f(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof k) {
            this.f106257e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f106257e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void e(int i10) {
        if (this.f106262j) {
            return;
        }
        this.f106262j = true;
        this.f106259g = i10;
        for (d dVar : this.f106263k) {
            dVar.a(dVar);
        }
    }
}
