package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintWidget f106355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintWidget f106356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConstraintWidget f106357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConstraintWidget f106358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConstraintWidget f106359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ConstraintWidget f106360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ConstraintWidget f106361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f106362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f106363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f106364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f106365k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f106366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f106367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f106368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f106369o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f106370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f106371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f106372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f106373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f106374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f106375u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f106376v;

    public c(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.f106355a = constraintWidget;
        this.f106370p = i10;
        this.f106371q = z10;
    }

    public static boolean k(ConstraintWidget constraintWidget, int i10) {
        if (constraintWidget.l0() == 8 || constraintWidget.f106192b0[i10] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = constraintWidget.f106237y[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f106376v) {
            b();
        }
        this.f106376v = true;
    }

    public final void b() {
        int i10 = this.f106370p * 2;
        ConstraintWidget constraintWidget = this.f106355a;
        this.f106369o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z10 = false;
        while (!z10) {
            this.f106363i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.f106174P0;
            int i11 = this.f106370p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i11] = null;
            constraintWidget.f106172O0[i11] = null;
            if (constraintWidget.l0() != 8) {
                this.f106366l++;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourZ = constraintWidget.z(this.f106370p);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourZ != dimensionBehaviour) {
                    this.f106367m = constraintWidget.M(this.f106370p) + this.f106367m;
                }
                int iG = constraintWidget.f106187Y[i10].g() + this.f106367m;
                this.f106367m = iG;
                int i12 = i10 + 1;
                this.f106367m = constraintWidget.f106187Y[i12].g() + iG;
                int iG2 = constraintWidget.f106187Y[i10].g() + this.f106368n;
                this.f106368n = iG2;
                this.f106368n = constraintWidget.f106187Y[i12].g() + iG2;
                if (this.f106356b == null) {
                    this.f106356b = constraintWidget;
                }
                this.f106358d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f106192b0;
                int i13 = this.f106370p;
                if (dimensionBehaviourArr[i13] == dimensionBehaviour) {
                    int i14 = constraintWidget.f106237y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f106364j++;
                        float f10 = constraintWidget.f106170N0[i13];
                        if (f10 > 0.0f) {
                            this.f106365k += f10;
                        }
                        if (k(constraintWidget, i13)) {
                            if (f10 < 0.0f) {
                                this.f106372r = true;
                            } else {
                                this.f106373s = true;
                            }
                            if (this.f106362h == null) {
                                this.f106362h = new ArrayList<>();
                            }
                            this.f106362h.add(constraintWidget);
                        }
                        if (this.f106360f == null) {
                            this.f106360f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f106361g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.f106172O0[this.f106370p] = constraintWidget;
                        }
                        this.f106361g = constraintWidget;
                    }
                    if (this.f106370p == 0) {
                        if (constraintWidget.f106233w != 0 || constraintWidget.f106239z != 0 || constraintWidget.f106143A != 0) {
                            this.f106369o = false;
                        }
                    } else if (constraintWidget.f106235x != 0 || constraintWidget.f106147C != 0 || constraintWidget.f106149D != 0) {
                        this.f106369o = false;
                    }
                    if (constraintWidget.f106200f0 != 0.0f) {
                        this.f106369o = false;
                        this.f106375u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.f106174P0[this.f106370p] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.f106187Y[i10 + 1].f106106f;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f106104d;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.f106187Y[i10].f106106f;
                if (constraintAnchor2 != null && constraintAnchor2.f106104d == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z10 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f106356b;
        if (constraintWidget6 != null) {
            this.f106367m -= constraintWidget6.f106187Y[i10].g();
        }
        ConstraintWidget constraintWidget7 = this.f106358d;
        if (constraintWidget7 != null) {
            this.f106367m -= constraintWidget7.f106187Y[i10 + 1].g();
        }
        this.f106357c = constraintWidget;
        if (this.f106370p == 0 && this.f106371q) {
            this.f106359e = constraintWidget;
        } else {
            this.f106359e = this.f106355a;
        }
        this.f106374t = this.f106373s && this.f106372r;
    }

    public ConstraintWidget c() {
        return this.f106355a;
    }

    public ConstraintWidget d() {
        return this.f106360f;
    }

    public ConstraintWidget e() {
        return this.f106356b;
    }

    public ConstraintWidget f() {
        return this.f106359e;
    }

    public ConstraintWidget g() {
        return this.f106357c;
    }

    public ConstraintWidget h() {
        return this.f106361g;
    }

    public ConstraintWidget i() {
        return this.f106358d;
    }

    public float j() {
        return this.f106365k;
    }
}
