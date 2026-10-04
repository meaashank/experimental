package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class Dimension {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f106009i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f106010j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f106011k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f106012l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f106013m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f106014n = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f106015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f106016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f106017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f106018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f106019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f106020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f106021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f106022h;

    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public Dimension() {
        this.f106015a = -2;
        this.f106016b = 0;
        this.f106017c = Integer.MAX_VALUE;
        this.f106018d = 1.0f;
        this.f106019e = 0;
        this.f106020f = null;
        this.f106021g = f106010j;
        this.f106022h = false;
    }

    public static Dimension a(int i10) {
        Dimension dimension = new Dimension(f106009i);
        dimension.l(i10);
        return dimension;
    }

    public static Dimension b(Object obj) {
        Dimension dimension = new Dimension(f106009i);
        dimension.m(obj);
        return dimension;
    }

    public static Dimension c() {
        return new Dimension(f106012l);
    }

    public static Dimension d(Object obj, float f10) {
        Dimension dimension = new Dimension(f106013m);
        dimension.f106018d = f10;
        return dimension;
    }

    public static Dimension e(String str) {
        Dimension dimension = new Dimension(f106014n);
        dimension.f106020f = str;
        return dimension;
    }

    public static Dimension f() {
        return new Dimension(f106011k);
    }

    public static Dimension g(int i10) {
        Dimension dimension = new Dimension();
        dimension.v(i10);
        return dimension;
    }

    public static Dimension h(Object obj) {
        Dimension dimension = new Dimension();
        dimension.w(obj);
        return dimension;
    }

    public static Dimension i() {
        return new Dimension(f106010j);
    }

    public void j(State state, ConstraintWidget constraintWidget, int i10) {
        String str = this.f106020f;
        if (str != null) {
            constraintWidget.n1(str);
        }
        int i11 = 2;
        if (i10 == 0) {
            if (this.f106022h) {
                constraintWidget.D1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.f106021g;
                if (obj == f106010j) {
                    i11 = 1;
                } else if (obj != f106013m) {
                    i11 = 0;
                }
                constraintWidget.E1(i11, this.f106016b, this.f106017c, this.f106018d);
                return;
            }
            int i12 = this.f106016b;
            if (i12 > 0) {
                constraintWidget.P1(i12);
            }
            int i13 = this.f106017c;
            if (i13 < Integer.MAX_VALUE) {
                constraintWidget.M1(i13);
            }
            Object obj2 = this.f106021g;
            if (obj2 == f106010j) {
                constraintWidget.D1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == f106012l) {
                constraintWidget.D1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.D1(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.c2(this.f106019e);
                    return;
                }
                return;
            }
        }
        if (this.f106022h) {
            constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.f106021g;
            if (obj3 == f106010j) {
                i11 = 1;
            } else if (obj3 != f106013m) {
                i11 = 0;
            }
            constraintWidget.Z1(i11, this.f106016b, this.f106017c, this.f106018d);
            return;
        }
        int i14 = this.f106016b;
        if (i14 > 0) {
            constraintWidget.O1(i14);
        }
        int i15 = this.f106017c;
        if (i15 < Integer.MAX_VALUE) {
            constraintWidget.L1(i15);
        }
        Object obj4 = this.f106021g;
        if (obj4 == f106010j) {
            constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == f106012l) {
            constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.y1(this.f106019e);
        }
    }

    public boolean k(int i10) {
        return this.f106021g == null && this.f106019e == i10;
    }

    public Dimension l(int i10) {
        this.f106021g = null;
        this.f106019e = i10;
        return this;
    }

    public Dimension m(Object obj) {
        this.f106021g = obj;
        if (obj instanceof Integer) {
            this.f106019e = ((Integer) obj).intValue();
            this.f106021g = null;
        }
        return this;
    }

    public int n() {
        return this.f106019e;
    }

    public Dimension o(int i10) {
        if (this.f106017c >= 0) {
            this.f106017c = i10;
        }
        return this;
    }

    public Dimension p(Object obj) {
        Object obj2 = f106010j;
        if (obj == obj2 && this.f106022h) {
            this.f106021g = obj2;
            this.f106017c = Integer.MAX_VALUE;
        }
        return this;
    }

    public Dimension q(int i10) {
        if (i10 >= 0) {
            this.f106016b = i10;
        }
        return this;
    }

    public Dimension r(Object obj) {
        if (obj == f106010j) {
            this.f106016b = -2;
        }
        return this;
    }

    public Dimension s(Object obj, float f10) {
        this.f106018d = f10;
        return this;
    }

    public Dimension t(String str) {
        this.f106020f = str;
        return this;
    }

    public void u(int i10) {
        this.f106022h = false;
        this.f106021g = null;
        this.f106019e = i10;
    }

    public Dimension v(int i10) {
        this.f106022h = true;
        if (i10 >= 0) {
            this.f106017c = i10;
        }
        return this;
    }

    public Dimension w(Object obj) {
        this.f106021g = obj;
        this.f106022h = true;
        return this;
    }

    public Dimension(Object obj) {
        this.f106015a = -2;
        this.f106016b = 0;
        this.f106017c = Integer.MAX_VALUE;
        this.f106018d = 1.0f;
        this.f106019e = 0;
        this.f106020f = null;
        this.f106022h = false;
        this.f106021g = obj;
    }
}
