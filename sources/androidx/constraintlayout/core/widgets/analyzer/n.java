package androidx.constraintlayout.core.widgets.analyzer;

import C4.q;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f106337g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f106338h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f106340b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f106342d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f106339a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f106341c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<a> f106343e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f106344f = -1;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<ConstraintWidget> f106345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f106346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f106347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f106348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f106349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f106350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f106351g;

        public a(ConstraintWidget constraintWidget, androidx.constraintlayout.core.d dVar, int i10) {
            this.f106345a = new WeakReference<>(constraintWidget);
            this.f106346b = dVar.O(constraintWidget.f106175Q);
            this.f106347c = dVar.O(constraintWidget.f106177R);
            this.f106348d = dVar.O(constraintWidget.f106179S);
            this.f106349e = dVar.O(constraintWidget.f106181T);
            this.f106350f = dVar.O(constraintWidget.f106183U);
            this.f106351g = i10;
        }

        public void a() {
            ConstraintWidget constraintWidget = this.f106345a.get();
            if (constraintWidget != null) {
                constraintWidget.p1(this.f106346b, this.f106347c, this.f106348d, this.f106349e, this.f106350f, this.f106351g);
            }
        }
    }

    public n(int i10) {
        int i11 = f106338h;
        f106338h = i11 + 1;
        this.f106340b = i11;
        this.f106342d = i10;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.f106339a.contains(constraintWidget)) {
            return false;
        }
        this.f106339a.add(constraintWidget);
        return true;
    }

    public void b() {
        if (this.f106343e != null && this.f106341c) {
            for (int i10 = 0; i10 < this.f106343e.size(); i10++) {
                this.f106343e.get(i10).a();
            }
        }
    }

    public void c(ArrayList<n> arrayList) {
        int size = this.f106339a.size();
        if (this.f106344f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                n nVar = arrayList.get(i10);
                if (this.f106344f == nVar.f106340b) {
                    m(this.f106342d, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.f106339a.clear();
    }

    public final boolean e(ConstraintWidget constraintWidget) {
        return this.f106339a.contains(constraintWidget);
    }

    public int f() {
        return this.f106340b;
    }

    public int g() {
        return this.f106342d;
    }

    public final String h() {
        int i10 = this.f106342d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    public boolean i(n nVar) {
        for (int i10 = 0; i10 < this.f106339a.size(); i10++) {
            if (nVar.f106339a.contains(this.f106339a.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f106341c;
    }

    public final int k(int i10, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviourZ = constraintWidget.z(i10);
        if (dimensionBehaviourZ == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviourZ == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviourZ == ConstraintWidget.DimensionBehaviour.FIXED) {
            return i10 == 0 ? constraintWidget.m0() : constraintWidget.D();
        }
        return -1;
    }

    public int l(androidx.constraintlayout.core.d dVar, int i10) {
        if (this.f106339a.size() == 0) {
            return 0;
        }
        return q(dVar, this.f106339a, i10);
    }

    public void m(int i10, n nVar) {
        ArrayList<ConstraintWidget> arrayList = this.f106339a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            ConstraintWidget constraintWidget = arrayList.get(i11);
            i11++;
            ConstraintWidget constraintWidget2 = constraintWidget;
            nVar.a(constraintWidget2);
            if (i10 == 0) {
                constraintWidget2.f106180S0 = nVar.f();
            } else {
                constraintWidget2.f106182T0 = nVar.f();
            }
        }
        this.f106344f = nVar.f106340b;
    }

    public void n(boolean z10) {
        this.f106341c = z10;
    }

    public void o(int i10) {
        this.f106342d = i10;
    }

    public int p() {
        return this.f106339a.size();
    }

    public final int q(androidx.constraintlayout.core.d dVar, ArrayList<ConstraintWidget> arrayList, int i10) {
        int iO;
        int iO2;
        androidx.constraintlayout.core.widgets.d dVar2 = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).U();
        dVar.Y();
        dVar2.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && dVar2.f106393M1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(dVar2, dVar, arrayList, 0);
        }
        if (i10 == 1 && dVar2.f106394N1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(dVar2, dVar, arrayList, 1);
        }
        try {
            dVar.T();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f106343e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f106343e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iO = dVar.O(dVar2.f106175Q);
            iO2 = dVar.O(dVar2.f106179S);
            dVar.Y();
        } else {
            iO = dVar.O(dVar2.f106177R);
            iO2 = dVar.O(dVar2.f106181T);
            dVar.Y();
        }
        return iO2 - iO;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h());
        sb2.append(" [");
        String strA = android.support.v4.media.d.a(sb2, this.f106340b, "] <");
        ArrayList<ConstraintWidget> arrayList = this.f106339a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ConstraintWidget constraintWidget = arrayList.get(i10);
            i10++;
            StringBuilder sbA = android.support.v4.media.f.a(strA, q.f17581a);
            sbA.append(constraintWidget.y());
            strA = sbA.toString();
        }
        return androidx.compose.runtime.changelist.j.a(strA, " >");
    }
}
