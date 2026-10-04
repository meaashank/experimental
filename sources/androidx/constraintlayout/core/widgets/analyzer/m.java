package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import u0.InterfaceC5633a;

/* JADX INFO: loaded from: classes.dex */
public class m extends WidgetRun {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DependencyNode f106334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f106335l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106336a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f106336a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106336a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106336a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f106334k = dependencyNode;
        this.f106335l = null;
        this.f106272h.f106257e = DependencyNode.Type.TOP;
        this.f106273i.f106257e = DependencyNode.Type.BOTTOM;
        dependencyNode.f106257e = DependencyNode.Type.BASELINE;
        this.f106270f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        float f10;
        float fA;
        int iA;
        int i10 = a.f106336a[this.f106274j.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 == 3) {
            ConstraintWidget constraintWidget = this.f106266b;
            q(dVar, constraintWidget.f106177R, constraintWidget.f106181T, 1);
            return;
        }
        f fVar = this.f106269e;
        if (fVar.f106255c && !fVar.f106262j && this.f106268d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f106266b;
            int i11 = constraintWidget2.f106235x;
            if (i11 == 2) {
                ConstraintWidget constraintWidgetU = constraintWidget2.U();
                if (constraintWidgetU != null) {
                    if (constraintWidgetU.f106199f.f106269e.f106262j) {
                        this.f106269e.e((int) ((r7.f106259g * this.f106266b.f106151E) + 0.5f));
                    }
                }
            } else if (i11 == 3 && constraintWidget2.f106197e.f106269e.f106262j) {
                int iB = constraintWidget2.B();
                if (iB != -1) {
                    if (iB == 0) {
                        iA = (int) ((this.f106266b.A() * r7.f106197e.f106269e.f106259g) + 0.5f);
                    } else if (iB != 1) {
                        iA = 0;
                    } else {
                        ConstraintWidget constraintWidget3 = this.f106266b;
                        f10 = constraintWidget3.f106197e.f106269e.f106259g;
                        fA = constraintWidget3.A();
                    }
                    this.f106269e.e(iA);
                } else {
                    ConstraintWidget constraintWidget4 = this.f106266b;
                    f10 = constraintWidget4.f106197e.f106269e.f106259g;
                    fA = constraintWidget4.A();
                }
                iA = (int) ((f10 / fA) + 0.5f);
                this.f106269e.e(iA);
            }
        }
        DependencyNode dependencyNode = this.f106272h;
        if (dependencyNode.f106255c) {
            DependencyNode dependencyNode2 = this.f106273i;
            if (dependencyNode2.f106255c) {
                if (dependencyNode.f106262j && dependencyNode2.f106262j && this.f106269e.f106262j) {
                    return;
                }
                if (!this.f106269e.f106262j && this.f106268d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget5 = this.f106266b;
                    if (constraintWidget5.f106233w == 0 && !constraintWidget5.D0()) {
                        DependencyNode dependencyNode3 = this.f106272h.f106264l.get(0);
                        DependencyNode dependencyNode4 = this.f106273i.f106264l.get(0);
                        int i12 = dependencyNode3.f106259g;
                        DependencyNode dependencyNode5 = this.f106272h;
                        int i13 = i12 + dependencyNode5.f106258f;
                        int i14 = dependencyNode4.f106259g + this.f106273i.f106258f;
                        dependencyNode5.e(i13);
                        this.f106273i.e(i14);
                        this.f106269e.e(i14 - i13);
                        return;
                    }
                }
                if (!this.f106269e.f106262j && this.f106268d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f106265a == 1 && this.f106272h.f106264l.size() > 0 && this.f106273i.f106264l.size() > 0) {
                    DependencyNode dependencyNode6 = this.f106272h.f106264l.get(0);
                    int i15 = (this.f106273i.f106264l.get(0).f106259g + this.f106273i.f106258f) - (dependencyNode6.f106259g + this.f106272h.f106258f);
                    f fVar2 = this.f106269e;
                    int i16 = fVar2.f106312m;
                    if (i15 < i16) {
                        fVar2.e(i15);
                    } else {
                        fVar2.e(i16);
                    }
                }
                if (this.f106269e.f106262j && this.f106272h.f106264l.size() > 0 && this.f106273i.f106264l.size() > 0) {
                    DependencyNode dependencyNode7 = this.f106272h.f106264l.get(0);
                    DependencyNode dependencyNode8 = this.f106273i.f106264l.get(0);
                    int i17 = dependencyNode7.f106259g + this.f106272h.f106258f;
                    int i18 = dependencyNode8.f106259g + this.f106273i.f106258f;
                    float fG0 = this.f106266b.g0();
                    if (dependencyNode7 == dependencyNode8) {
                        i17 = dependencyNode7.f106259g;
                        i18 = dependencyNode8.f106259g;
                        fG0 = 0.5f;
                    }
                    this.f106272h.e((int) ((((i18 - i17) - this.f106269e.f106259g) * fG0) + i17 + 0.5f));
                    this.f106273i.e(this.f106272h.f106259g + this.f106269e.f106259g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidgetU;
        ConstraintWidget constraintWidgetU2;
        ConstraintWidget constraintWidget = this.f106266b;
        if (constraintWidget.f106189a) {
            this.f106269e.e(constraintWidget.D());
        }
        if (!this.f106269e.f106262j) {
            this.f106268d = this.f106266b.j0();
            if (this.f106266b.q0()) {
                this.f106335l = new androidx.constraintlayout.core.widgets.analyzer.a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f106268d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetU2 = this.f106266b.U()) != null && constraintWidgetU2.j0() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int iD = (constraintWidgetU2.D() - this.f106266b.f106177R.g()) - this.f106266b.f106181T.g();
                    b(this.f106272h, constraintWidgetU2.f106199f.f106272h, this.f106266b.f106177R.g());
                    b(this.f106273i, constraintWidgetU2.f106199f.f106273i, -this.f106266b.f106181T.g());
                    this.f106269e.e(iD);
                    return;
                }
                if (this.f106268d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f106269e.e(this.f106266b.D());
                }
            }
        } else if (this.f106268d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetU = this.f106266b.U()) != null && constraintWidgetU.j0() == ConstraintWidget.DimensionBehaviour.FIXED) {
            b(this.f106272h, constraintWidgetU.f106199f.f106272h, this.f106266b.f106177R.g());
            b(this.f106273i, constraintWidgetU.f106199f.f106273i, -this.f106266b.f106181T.g());
            return;
        }
        f fVar = this.f106269e;
        boolean z10 = fVar.f106262j;
        if (z10) {
            ConstraintWidget constraintWidget2 = this.f106266b;
            if (constraintWidget2.f106189a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f106187Y;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f106106f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f106106f != null) {
                    if (constraintWidget2.D0()) {
                        this.f106272h.f106258f = this.f106266b.f106187Y[2].g();
                        this.f106273i.f106258f = -this.f106266b.f106187Y[3].g();
                    } else {
                        DependencyNode dependencyNodeH = h(this.f106266b.f106187Y[2]);
                        if (dependencyNodeH != null) {
                            b(this.f106272h, dependencyNodeH, this.f106266b.f106187Y[2].g());
                        }
                        DependencyNode dependencyNodeH2 = h(this.f106266b.f106187Y[3]);
                        if (dependencyNodeH2 != null) {
                            b(this.f106273i, dependencyNodeH2, -this.f106266b.f106187Y[3].g());
                        }
                        this.f106272h.f106254b = true;
                        this.f106273i.f106254b = true;
                    }
                    if (this.f106266b.q0()) {
                        b(this.f106334k, this.f106272h, this.f106266b.t());
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        b(this.f106272h, dependencyNodeH3, this.f106266b.f106187Y[2].g());
                        b(this.f106273i, this.f106272h, this.f106269e.f106259g);
                        if (this.f106266b.q0()) {
                            b(this.f106334k, this.f106272h, this.f106266b.t());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f106106f != null) {
                    DependencyNode dependencyNodeH4 = h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        b(this.f106273i, dependencyNodeH4, -this.f106266b.f106187Y[3].g());
                        b(this.f106272h, this.f106273i, -this.f106269e.f106259g);
                    }
                    if (this.f106266b.q0()) {
                        b(this.f106334k, this.f106272h, this.f106266b.t());
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f106106f != null) {
                    DependencyNode dependencyNodeH5 = h(constraintAnchor4);
                    if (dependencyNodeH5 != null) {
                        b(this.f106334k, dependencyNodeH5, 0);
                        b(this.f106272h, this.f106334k, -this.f106266b.t());
                        b(this.f106273i, this.f106272h, this.f106269e.f106259g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof InterfaceC5633a) || constraintWidget2.U() == null || this.f106266b.r(ConstraintAnchor.Type.CENTER).f106106f != null) {
                    return;
                }
                b(this.f106272h, this.f106266b.U().f106199f.f106272h, this.f106266b.p0());
                b(this.f106273i, this.f106272h, this.f106269e.f106259g);
                if (this.f106266b.q0()) {
                    b(this.f106334k, this.f106272h, this.f106266b.t());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f106268d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            fVar.b(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f106266b;
            int i10 = constraintWidget3.f106235x;
            if (i10 == 2) {
                ConstraintWidget constraintWidgetU3 = constraintWidget3.U();
                if (constraintWidgetU3 != null) {
                    f fVar2 = constraintWidgetU3.f106199f.f106269e;
                    this.f106269e.f106264l.add(fVar2);
                    fVar2.f106263k.add(this.f106269e);
                    f fVar3 = this.f106269e;
                    fVar3.f106254b = true;
                    fVar3.f106263k.add(this.f106272h);
                    this.f106269e.f106263k.add(this.f106273i);
                }
            } else if (i10 == 3 && !constraintWidget3.D0()) {
                ConstraintWidget constraintWidget4 = this.f106266b;
                if (constraintWidget4.f106233w != 3) {
                    f fVar4 = constraintWidget4.f106197e.f106269e;
                    this.f106269e.f106264l.add(fVar4);
                    fVar4.f106263k.add(this.f106269e);
                    f fVar5 = this.f106269e;
                    fVar5.f106254b = true;
                    fVar5.f106263k.add(this.f106272h);
                    this.f106269e.f106263k.add(this.f106273i);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f106266b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.f106187Y;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f106106f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f106106f != null) {
            if (constraintWidget5.D0()) {
                this.f106272h.f106258f = this.f106266b.f106187Y[2].g();
                this.f106273i.f106258f = -this.f106266b.f106187Y[3].g();
            } else {
                DependencyNode dependencyNodeH6 = h(this.f106266b.f106187Y[2]);
                DependencyNode dependencyNodeH7 = h(this.f106266b.f106187Y[3]);
                if (dependencyNodeH6 != null) {
                    dependencyNodeH6.b(this);
                }
                if (dependencyNodeH7 != null) {
                    dependencyNodeH7.b(this);
                }
                this.f106274j = WidgetRun.RunType.CENTER;
            }
            if (this.f106266b.q0()) {
                c(this.f106334k, this.f106272h, 1, this.f106335l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode dependencyNodeH8 = h(constraintAnchor5);
            if (dependencyNodeH8 != null) {
                b(this.f106272h, dependencyNodeH8, this.f106266b.f106187Y[2].g());
                c(this.f106273i, this.f106272h, 1, this.f106269e);
                if (this.f106266b.q0()) {
                    c(this.f106334k, this.f106272h, 1, this.f106335l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f106268d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f106266b.A() > 0.0f) {
                    k kVar = this.f106266b.f106197e;
                    if (kVar.f106268d == dimensionBehaviour3) {
                        kVar.f106269e.f106263k.add(this.f106269e);
                        this.f106269e.f106264l.add(this.f106266b.f106197e.f106269e);
                        this.f106269e.f106253a = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f106106f != null) {
                DependencyNode dependencyNodeH9 = h(constraintAnchor7);
                if (dependencyNodeH9 != null) {
                    b(this.f106273i, dependencyNodeH9, -this.f106266b.f106187Y[3].g());
                    c(this.f106272h, this.f106273i, -1, this.f106269e);
                    if (this.f106266b.q0()) {
                        c(this.f106334k, this.f106272h, 1, this.f106335l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f106106f != null) {
                    DependencyNode dependencyNodeH10 = h(constraintAnchor8);
                    if (dependencyNodeH10 != null) {
                        b(this.f106334k, dependencyNodeH10, 0);
                        c(this.f106272h, this.f106334k, -1, this.f106335l);
                        c(this.f106273i, this.f106272h, 1, this.f106269e);
                    }
                } else if (!(constraintWidget5 instanceof InterfaceC5633a) && constraintWidget5.U() != null) {
                    b(this.f106272h, this.f106266b.U().f106199f.f106272h, this.f106266b.p0());
                    c(this.f106273i, this.f106272h, 1, this.f106269e);
                    if (this.f106266b.q0()) {
                        c(this.f106334k, this.f106272h, 1, this.f106335l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f106268d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f106266b.A() > 0.0f) {
                        k kVar2 = this.f106266b.f106197e;
                        if (kVar2.f106268d == dimensionBehaviour5) {
                            kVar2.f106269e.f106263k.add(this.f106269e);
                            this.f106269e.f106264l.add(this.f106266b.f106197e.f106269e);
                            this.f106269e.f106253a = this;
                        }
                    }
                }
            }
        }
        if (this.f106269e.f106264l.size() == 0) {
            this.f106269e.f106255c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.f106272h;
        if (dependencyNode.f106262j) {
            this.f106266b.g2(dependencyNode.f106259g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f106267c = null;
        this.f106272h.c();
        this.f106273i.c();
        this.f106334k.c();
        this.f106269e.c();
        this.f106271g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void n() {
        this.f106271g = false;
        this.f106272h.c();
        this.f106272h.f106262j = false;
        this.f106273i.c();
        this.f106273i.f106262j = false;
        this.f106334k.c();
        this.f106334k.f106262j = false;
        this.f106269e.f106262j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean p() {
        return this.f106268d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f106266b.f106235x == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f106266b.y();
    }
}
