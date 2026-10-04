package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DependencyNode implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WidgetRun f106256d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f106258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f106259g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f106253a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f106254b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f106255c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Type f106257e = Type.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f106260h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f106261i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f106262j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<d> f106263k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<DependencyNode> f106264l = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f106256d = widgetRun;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        Iterator<DependencyNode> it = this.f106264l.iterator();
        while (it.hasNext()) {
            if (!it.next().f106262j) {
                return;
            }
        }
        this.f106255c = true;
        d dVar2 = this.f106253a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f106254b) {
            this.f106256d.a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i10 = 0;
        for (DependencyNode dependencyNode2 : this.f106264l) {
            if (!(dependencyNode2 instanceof f)) {
                i10++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i10 == 1 && dependencyNode.f106262j) {
            f fVar = this.f106261i;
            if (fVar != null) {
                if (!fVar.f106262j) {
                    return;
                } else {
                    this.f106258f = this.f106260h * fVar.f106259g;
                }
            }
            e(dependencyNode.f106259g + this.f106258f);
        }
        d dVar3 = this.f106253a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f106263k.add(dVar);
        if (this.f106262j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f106264l.clear();
        this.f106263k.clear();
        this.f106262j = false;
        this.f106259g = 0;
        this.f106255c = false;
        this.f106254b = false;
    }

    public String d() {
        String strY = this.f106256d.f106266b.y();
        Type type = this.f106257e;
        StringBuilder sbA = android.support.v4.media.f.a((type == Type.LEFT || type == Type.RIGHT) ? androidx.compose.runtime.changelist.j.a(strY, "_HORIZONTAL") : androidx.compose.runtime.changelist.j.a(strY, "_VERTICAL"), com.prism.gaia.server.accounts.b.f166434b0);
        sbA.append(this.f106257e.name());
        return sbA.toString();
    }

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

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f106256d.f106266b.y());
        sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
        sb2.append(this.f106257e);
        sb2.append("(");
        sb2.append(this.f106262j ? Integer.valueOf(this.f106259g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f106264l.size());
        sb2.append(":d=");
        sb2.append(this.f106263k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
