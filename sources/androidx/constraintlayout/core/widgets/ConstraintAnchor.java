package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f106099j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f106100k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f106102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f106103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintWidget f106104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Type f106105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ConstraintAnchor f106106f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SolverVariable f106109i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<ConstraintAnchor> f106101a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f106107g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f106108h = Integer.MIN_VALUE;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106110a;

        static {
            int[] iArr = new int[Type.values().length];
            f106110a = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106110a[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106110a[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106110a[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f106110a[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f106110a[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f106110a[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f106110a[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f106110a[Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f106104d = constraintWidget;
        this.f106105e = type;
    }

    public void A(int i10) {
        this.f106102b = i10;
        this.f106103c = true;
    }

    public void B(int i10) {
        if (p()) {
            this.f106108h = i10;
        }
    }

    public void C(int i10) {
        if (p()) {
            this.f106107g = i10;
        }
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i10) {
        return b(constraintAnchor, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor, int i10, int i11, boolean z10) {
        if (constraintAnchor == null) {
            x();
            return true;
        }
        if (!z10 && !v(constraintAnchor)) {
            return false;
        }
        this.f106106f = constraintAnchor;
        if (constraintAnchor.f106101a == null) {
            constraintAnchor.f106101a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f106106f.f106101a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f106107g = i10;
        this.f106108h = i11;
        return true;
    }

    public void c(ConstraintAnchor constraintAnchor, HashMap<ConstraintWidget, ConstraintWidget> map) {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor2 = this.f106106f;
        if (constraintAnchor2 != null && (hashSet = constraintAnchor2.f106101a) != null) {
            hashSet.remove(this);
        }
        ConstraintAnchor constraintAnchor3 = constraintAnchor.f106106f;
        if (constraintAnchor3 != null) {
            this.f106106f = map.get(constraintAnchor.f106106f.f106104d).r(constraintAnchor3.l());
        } else {
            this.f106106f = null;
        }
        ConstraintAnchor constraintAnchor4 = this.f106106f;
        if (constraintAnchor4 != null) {
            if (constraintAnchor4.f106101a == null) {
                constraintAnchor4.f106101a = new HashSet<>();
            }
            this.f106106f.f106101a.add(this);
        }
        this.f106107g = constraintAnchor.f106107g;
        this.f106108h = constraintAnchor.f106108h;
    }

    public void d(int i10, ArrayList<n> arrayList, n nVar) {
        HashSet<ConstraintAnchor> hashSet = this.f106101a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.h.a(it.next().f106104d, i10, arrayList, nVar);
            }
        }
    }

    public HashSet<ConstraintAnchor> e() {
        return this.f106101a;
    }

    public int f() {
        if (this.f106103c) {
            return this.f106102b;
        }
        return 0;
    }

    public int g() {
        ConstraintAnchor constraintAnchor;
        if (this.f106104d.l0() == 8) {
            return 0;
        }
        return (this.f106108h == Integer.MIN_VALUE || (constraintAnchor = this.f106106f) == null || constraintAnchor.f106104d.l0() != 8) ? this.f106107g : this.f106108h;
    }

    public final ConstraintAnchor h() {
        switch (a.f106110a[this.f106105e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f106104d.f106179S;
            case 3:
                return this.f106104d.f106175Q;
            case 4:
                return this.f106104d.f106181T;
            case 5:
                return this.f106104d.f106177R;
            default:
                throw new AssertionError(this.f106105e.name());
        }
    }

    public ConstraintWidget i() {
        return this.f106104d;
    }

    public SolverVariable j() {
        return this.f106109i;
    }

    public ConstraintAnchor k() {
        return this.f106106f;
    }

    public Type l() {
        return this.f106105e;
    }

    public boolean m() {
        HashSet<ConstraintAnchor> hashSet = this.f106101a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<ConstraintAnchor> hashSet = this.f106101a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o() {
        return this.f106103c;
    }

    public boolean p() {
        return this.f106106f != null;
    }

    public boolean q(ConstraintWidget constraintWidget) {
        if (s(constraintWidget, new HashSet<>())) {
            return false;
        }
        ConstraintWidget constraintWidgetU = i().U();
        return constraintWidgetU == constraintWidget || constraintWidget.U() == constraintWidgetU;
    }

    public boolean r(ConstraintWidget constraintWidget, ConstraintAnchor constraintAnchor) {
        return q(constraintWidget);
    }

    public final boolean s(ConstraintWidget constraintWidget, HashSet<ConstraintWidget> hashSet) {
        if (!hashSet.contains(constraintWidget)) {
            hashSet.add(constraintWidget);
            if (constraintWidget == i()) {
                return true;
            }
            ArrayList<ConstraintAnchor> arrayListS = constraintWidget.s();
            int size = arrayListS.size();
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintAnchor constraintAnchor = arrayListS.get(i10);
                if (constraintAnchor.u(this) && constraintAnchor.p() && s(constraintAnchor.k().i(), hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean t() {
        switch (a.f106110a[this.f106105e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f106105e.name());
        }
    }

    public String toString() {
        return this.f106104d.y() + com.prism.gaia.server.accounts.b.f166434b0 + this.f106105e.toString();
    }

    public boolean u(ConstraintAnchor constraintAnchor) {
        Type typeL = constraintAnchor.l();
        Type type = this.f106105e;
        if (typeL == type) {
            return true;
        }
        switch (a.f106110a[type.ordinal()]) {
            case 1:
                return typeL != Type.BASELINE;
            case 2:
            case 3:
            case 7:
                return typeL == Type.LEFT || typeL == Type.RIGHT || typeL == Type.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return typeL == Type.TOP || typeL == Type.BOTTOM || typeL == Type.CENTER_Y || typeL == Type.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f106105e.name());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean v(androidx.constraintlayout.core.widgets.ConstraintAnchor r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L5
            goto L8d
        L5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r6.l()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = r5.f106105e
            r3 = 1
            if (r1 != r2) goto L28
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r2 != r1) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.i()
            boolean r6 = r6.q0()
            if (r6 == 0) goto L8d
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.i()
            boolean r6 = r6.q0()
            if (r6 != 0) goto L8c
            goto L8d
        L28:
            int[] r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.a.f106110a
            int r2 = r2.ordinal()
            r2 = r4[r2]
            switch(r2) {
                case 1: goto L80;
                case 2: goto L64;
                case 3: goto L64;
                case 4: goto L48;
                case 5: goto L48;
                case 6: goto L3f;
                case 7: goto L8d;
                case 8: goto L8d;
                case 9: goto L8d;
                default: goto L33;
            }
        L33:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = r5.f106105e
            java.lang.String r0 = r0.name()
            r6.<init>(r0)
            throw r6
        L3f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r1 == r6) goto L8d
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r1 != r6) goto L8c
            goto L8d
        L48:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r1 == r2) goto L53
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r1 != r2) goto L51
            goto L53
        L51:
            r2 = r0
            goto L54
        L53:
            r2 = r3
        L54:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.i()
            boolean r6 = r6 instanceof androidx.constraintlayout.core.widgets.f
            if (r6 == 0) goto L63
            if (r2 != 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r1 != r6) goto L8d
            goto L8c
        L63:
            return r2
        L64:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r1 == r2) goto L6f
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r1 != r2) goto L6d
            goto L6f
        L6d:
            r2 = r0
            goto L70
        L6f:
            r2 = r3
        L70:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.i()
            boolean r6 = r6 instanceof androidx.constraintlayout.core.widgets.f
            if (r6 == 0) goto L7f
            if (r2 != 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r1 != r6) goto L8d
            goto L8c
        L7f:
            return r2
        L80:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r1 == r6) goto L8d
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r1 == r6) goto L8d
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r1 == r6) goto L8d
        L8c:
            return r3
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintAnchor.v(androidx.constraintlayout.core.widgets.ConstraintAnchor):boolean");
    }

    public boolean w() {
        switch (a.f106110a[this.f106105e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f106105e.name());
        }
    }

    public void x() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f106106f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f106101a) != null) {
            hashSet.remove(this);
            if (this.f106106f.f106101a.size() == 0) {
                this.f106106f.f106101a = null;
            }
        }
        this.f106101a = null;
        this.f106106f = null;
        this.f106107g = 0;
        this.f106108h = Integer.MIN_VALUE;
        this.f106103c = false;
        this.f106102b = 0;
    }

    public void y() {
        this.f106103c = false;
        this.f106102b = 0;
    }

    public void z(androidx.constraintlayout.core.c cVar) {
        SolverVariable solverVariable = this.f106109i;
        if (solverVariable == null) {
            this.f106109i = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.h();
        }
    }
}
