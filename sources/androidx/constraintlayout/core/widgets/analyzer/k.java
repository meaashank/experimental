package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import u0.InterfaceC5633a;

/* JADX INFO: loaded from: classes.dex */
public class k extends WidgetRun {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f106321k = new int[2];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106322a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f106322a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106322a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106322a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f106272h.f106257e = DependencyNode.Type.LEFT;
        this.f106273i.f106257e = DependencyNode.Type.RIGHT;
        this.f106270f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02c5  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(androidx.constraintlayout.core.widgets.analyzer.d r14) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.k.a(androidx.constraintlayout.core.widgets.analyzer.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidgetU;
        ConstraintWidget constraintWidgetU2;
        ConstraintWidget constraintWidget = this.f106266b;
        if (constraintWidget.f106189a) {
            this.f106269e.e(constraintWidget.m0());
        }
        if (this.f106269e.f106262j) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f106268d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (constraintWidgetU = this.f106266b.U()) != null && (constraintWidgetU.H() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetU.H() == dimensionBehaviour2)) {
                b(this.f106272h, constraintWidgetU.f106197e.f106272h, this.f106266b.f106175Q.g());
                b(this.f106273i, constraintWidgetU.f106197e.f106273i, -this.f106266b.f106179S.g());
                return;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourH = this.f106266b.H();
            this.f106268d = dimensionBehaviourH;
            if (dimensionBehaviourH != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviourH == dimensionBehaviour3 && (constraintWidgetU2 = this.f106266b.U()) != null && (constraintWidgetU2.H() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetU2.H() == dimensionBehaviour3)) {
                    int iM0 = (constraintWidgetU2.m0() - this.f106266b.f106175Q.g()) - this.f106266b.f106179S.g();
                    b(this.f106272h, constraintWidgetU2.f106197e.f106272h, this.f106266b.f106175Q.g());
                    b(this.f106273i, constraintWidgetU2.f106197e.f106273i, -this.f106266b.f106179S.g());
                    this.f106269e.e(iM0);
                    return;
                }
                if (this.f106268d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f106269e.e(this.f106266b.m0());
                }
            }
        }
        f fVar = this.f106269e;
        if (fVar.f106262j) {
            ConstraintWidget constraintWidget2 = this.f106266b;
            if (constraintWidget2.f106189a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f106187Y;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f106106f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f106106f != null) {
                    if (constraintWidget2.B0()) {
                        this.f106272h.f106258f = this.f106266b.f106187Y[0].g();
                        this.f106273i.f106258f = -this.f106266b.f106187Y[1].g();
                        return;
                    }
                    DependencyNode dependencyNodeH = h(this.f106266b.f106187Y[0]);
                    if (dependencyNodeH != null) {
                        b(this.f106272h, dependencyNodeH, this.f106266b.f106187Y[0].g());
                    }
                    DependencyNode dependencyNodeH2 = h(this.f106266b.f106187Y[1]);
                    if (dependencyNodeH2 != null) {
                        b(this.f106273i, dependencyNodeH2, -this.f106266b.f106187Y[1].g());
                    }
                    this.f106272h.f106254b = true;
                    this.f106273i.f106254b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        b(this.f106272h, dependencyNodeH3, this.f106266b.f106187Y[0].g());
                        b(this.f106273i, this.f106272h, this.f106269e.f106259g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f106106f != null) {
                    DependencyNode dependencyNodeH4 = h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        b(this.f106273i, dependencyNodeH4, -this.f106266b.f106187Y[1].g());
                        b(this.f106272h, this.f106273i, -this.f106269e.f106259g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof InterfaceC5633a) || constraintWidget2.U() == null || this.f106266b.r(ConstraintAnchor.Type.CENTER).f106106f != null) {
                    return;
                }
                b(this.f106272h, this.f106266b.U().f106197e.f106272h, this.f106266b.o0());
                b(this.f106273i, this.f106272h, this.f106269e.f106259g);
                return;
            }
        }
        if (this.f106268d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f106266b;
            int i10 = constraintWidget3.f106233w;
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
            } else if (i10 == 3) {
                if (constraintWidget3.f106235x == 3) {
                    this.f106272h.f106253a = this;
                    this.f106273i.f106253a = this;
                    m mVar = constraintWidget3.f106199f;
                    mVar.f106272h.f106253a = this;
                    mVar.f106273i.f106253a = this;
                    fVar.f106253a = this;
                    if (constraintWidget3.D0()) {
                        this.f106269e.f106264l.add(this.f106266b.f106199f.f106269e);
                        this.f106266b.f106199f.f106269e.f106263k.add(this.f106269e);
                        m mVar2 = this.f106266b.f106199f;
                        mVar2.f106269e.f106253a = this;
                        this.f106269e.f106264l.add(mVar2.f106272h);
                        this.f106269e.f106264l.add(this.f106266b.f106199f.f106273i);
                        this.f106266b.f106199f.f106272h.f106263k.add(this.f106269e);
                        this.f106266b.f106199f.f106273i.f106263k.add(this.f106269e);
                    } else if (this.f106266b.B0()) {
                        this.f106266b.f106199f.f106269e.f106264l.add(this.f106269e);
                        this.f106269e.f106263k.add(this.f106266b.f106199f.f106269e);
                    } else {
                        this.f106266b.f106199f.f106269e.f106264l.add(this.f106269e);
                    }
                } else {
                    f fVar4 = constraintWidget3.f106199f.f106269e;
                    fVar.f106264l.add(fVar4);
                    fVar4.f106263k.add(this.f106269e);
                    this.f106266b.f106199f.f106272h.f106263k.add(this.f106269e);
                    this.f106266b.f106199f.f106273i.f106263k.add(this.f106269e);
                    f fVar5 = this.f106269e;
                    fVar5.f106254b = true;
                    fVar5.f106263k.add(this.f106272h);
                    this.f106269e.f106263k.add(this.f106273i);
                    this.f106272h.f106264l.add(this.f106269e);
                    this.f106273i.f106264l.add(this.f106269e);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f106266b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.f106187Y;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f106106f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f106106f != null) {
            if (constraintWidget4.B0()) {
                this.f106272h.f106258f = this.f106266b.f106187Y[0].g();
                this.f106273i.f106258f = -this.f106266b.f106187Y[1].g();
                return;
            }
            DependencyNode dependencyNodeH5 = h(this.f106266b.f106187Y[0]);
            DependencyNode dependencyNodeH6 = h(this.f106266b.f106187Y[1]);
            if (dependencyNodeH5 != null) {
                dependencyNodeH5.b(this);
            }
            if (dependencyNodeH6 != null) {
                dependencyNodeH6.b(this);
            }
            this.f106274j = WidgetRun.RunType.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode dependencyNodeH7 = h(constraintAnchor4);
            if (dependencyNodeH7 != null) {
                b(this.f106272h, dependencyNodeH7, this.f106266b.f106187Y[0].g());
                c(this.f106273i, this.f106272h, 1, this.f106269e);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f106106f != null) {
            DependencyNode dependencyNodeH8 = h(constraintAnchor6);
            if (dependencyNodeH8 != null) {
                b(this.f106273i, dependencyNodeH8, -this.f106266b.f106187Y[1].g());
                c(this.f106272h, this.f106273i, -1, this.f106269e);
                return;
            }
            return;
        }
        if ((constraintWidget4 instanceof InterfaceC5633a) || constraintWidget4.U() == null) {
            return;
        }
        b(this.f106272h, this.f106266b.U().f106197e.f106272h, this.f106266b.o0());
        c(this.f106273i, this.f106272h, 1, this.f106269e);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.f106272h;
        if (dependencyNode.f106262j) {
            this.f106266b.f2(dependencyNode.f106259g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f106267c = null;
        this.f106272h.c();
        this.f106273i.c();
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
        this.f106269e.f106262j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean p() {
        return this.f106268d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f106266b.f106233w == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f106266b.y();
    }

    public final void u(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }
}
