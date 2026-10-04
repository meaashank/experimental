package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintWidget f106266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f106267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f106268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f106269e = new f(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f106270f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f106271g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DependencyNode f106272h = new DependencyNode(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DependencyNode f106273i = new DependencyNode(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RunType f106274j = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106275a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f106275a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106275a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106275a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106275a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f106275a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f106266b = constraintWidget;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
    }

    public final void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10) {
        dependencyNode.f106264l.add(dependencyNode2);
        dependencyNode.f106258f = i10;
        dependencyNode2.f106263k.add(dependencyNode);
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10, f fVar) {
        dependencyNode.f106264l.add(dependencyNode2);
        dependencyNode.f106264l.add(this.f106269e);
        dependencyNode.f106260h = i10;
        dependencyNode.f106261i = fVar;
        dependencyNode2.f106263k.add(dependencyNode);
        fVar.f106263k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            ConstraintWidget constraintWidget = this.f106266b;
            int i12 = constraintWidget.f106143A;
            int iMax = Math.max(constraintWidget.f106239z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f106266b;
            int i13 = constraintWidget2.f106149D;
            int iMax2 = Math.max(constraintWidget2.f106147C, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public final DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f106106f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f106104d;
        int i10 = a.f106275a[constraintAnchor2.f106105e.ordinal()];
        if (i10 == 1) {
            return constraintWidget.f106197e.f106272h;
        }
        if (i10 == 2) {
            return constraintWidget.f106197e.f106273i;
        }
        if (i10 == 3) {
            return constraintWidget.f106199f.f106272h;
        }
        if (i10 == 4) {
            return constraintWidget.f106199f.f106334k;
        }
        if (i10 != 5) {
            return null;
        }
        return constraintWidget.f106199f.f106273i;
    }

    public final DependencyNode i(ConstraintAnchor constraintAnchor, int i10) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f106106f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f106104d;
        WidgetRun widgetRun = i10 == 0 ? constraintWidget.f106197e : constraintWidget.f106199f;
        int i11 = a.f106275a[constraintAnchor2.f106105e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f106273i;
        }
        return widgetRun.f106272h;
    }

    public long j() {
        if (this.f106269e.f106262j) {
            return r0.f106259g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.f106272h.f106264l.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f106272h.f106264l.get(i11).f106256d != this) {
                i10++;
            }
        }
        int size2 = this.f106273i.f106264l.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (this.f106273i.f106264l.get(i12).f106256d != this) {
                i10++;
            }
        }
        return i10 >= 2;
    }

    public boolean l() {
        return this.f106269e.f106262j;
    }

    public boolean m() {
        return this.f106271g;
    }

    public abstract void n();

    public final void o(int i10, int i11) {
        int i12 = this.f106265a;
        if (i12 == 0) {
            this.f106269e.e(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f106269e.e(Math.min(g(this.f106269e.f106312m, i10), i11));
            return;
        }
        if (i12 == 2) {
            ConstraintWidget constraintWidgetU = this.f106266b.U();
            if (constraintWidgetU != null) {
                if ((i10 == 0 ? constraintWidgetU.f106197e : constraintWidgetU.f106199f).f106269e.f106262j) {
                    ConstraintWidget constraintWidget = this.f106266b;
                    this.f106269e.e(g((int) ((r9.f106259g * (i10 == 0 ? constraintWidget.f106145B : constraintWidget.f106151E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        ConstraintWidget constraintWidget2 = this.f106266b;
        WidgetRun widgetRun = constraintWidget2.f106197e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.f106268d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.f106265a == 3) {
            m mVar = constraintWidget2.f106199f;
            if (mVar.f106268d == dimensionBehaviour2 && mVar.f106265a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            widgetRun = constraintWidget2.f106199f;
        }
        if (widgetRun.f106269e.f106262j) {
            float fA = constraintWidget2.A();
            this.f106269e.e(i10 == 1 ? (int) ((widgetRun.f106269e.f106259g / fA) + 0.5f) : (int) ((fA * widgetRun.f106269e.f106259g) + 0.5f));
        }
    }

    public abstract boolean p();

    public void q(d dVar, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        DependencyNode dependencyNodeH = h(constraintAnchor);
        DependencyNode dependencyNodeH2 = h(constraintAnchor2);
        if (dependencyNodeH.f106262j && dependencyNodeH2.f106262j) {
            int iG = constraintAnchor.g() + dependencyNodeH.f106259g;
            int iG2 = dependencyNodeH2.f106259g - constraintAnchor2.g();
            int i11 = iG2 - iG;
            if (!this.f106269e.f106262j && this.f106268d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                o(i10, i11);
            }
            f fVar = this.f106269e;
            if (fVar.f106262j) {
                if (fVar.f106259g == i11) {
                    this.f106272h.e(iG);
                    this.f106273i.e(iG2);
                    return;
                }
                ConstraintWidget constraintWidget = this.f106266b;
                float fE = i10 == 0 ? constraintWidget.E() : constraintWidget.g0();
                if (dependencyNodeH == dependencyNodeH2) {
                    iG = dependencyNodeH.f106259g;
                    iG2 = dependencyNodeH2.f106259g;
                    fE = 0.5f;
                }
                this.f106272h.e((int) ((((iG2 - iG) - this.f106269e.f106259g) * fE) + iG + 0.5f));
                this.f106273i.e(this.f106272h.f106259g + this.f106269e.f106259g);
            }
        }
    }

    public void r(d dVar) {
    }

    public void s(d dVar) {
    }

    public long t(int i10) {
        f fVar = this.f106269e;
        if (!fVar.f106262j) {
            return 0L;
        }
        long j10 = fVar.f106259g;
        return k() ? j10 + ((long) (this.f106272h.f106258f - this.f106273i.f106258f)) : i10 == 0 ? j10 + ((long) this.f106272h.f106258f) : j10 - ((long) this.f106273i.f106258f);
    }
}
