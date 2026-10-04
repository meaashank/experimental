package androidx.constraintlayout.core.state;

import androidx.activity.D;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import t0.C5595a;
import u0.C5634b;

/* JADX INFO: loaded from: classes.dex */
public class State {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f106023f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f106024g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f106025h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f106026i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Integer f106027j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Object, c> f106028a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<Object, androidx.constraintlayout.core.state.a> f106029b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, ArrayList<String>> f106030c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintReference f106031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f106032e;

    public enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106033a;

        static {
            int[] iArr = new int[Helper.values().length];
            f106033a = iArr;
            try {
                iArr[Helper.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106033a[Helper.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106033a[Helper.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106033a[Helper.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f106033a[Helper.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public State() {
        ConstraintReference constraintReference = new ConstraintReference(this);
        this.f106031d = constraintReference;
        this.f106032e = 0;
        this.f106028a.put(f106027j, constraintReference);
    }

    public t0.f A(Object obj) {
        return k(obj, 1);
    }

    public State B(Dimension dimension) {
        return x(dimension);
    }

    public void a(androidx.constraintlayout.core.widgets.d dVar) {
        androidx.constraintlayout.core.state.a aVar;
        C5634b c5634bM0;
        C5634b c5634bM02;
        dVar.p2();
        this.f106031d.V().j(this, dVar, 0);
        this.f106031d.D().j(this, dVar, 1);
        for (Object obj : this.f106029b.keySet()) {
            C5634b c5634bM03 = this.f106029b.get(obj).M0();
            if (c5634bM03 != null) {
                c cVarE = this.f106028a.get(obj);
                if (cVarE == null) {
                    cVarE = e(obj);
                }
                cVarE.b(c5634bM03);
            }
        }
        for (Object obj2 : this.f106028a.keySet()) {
            c cVar = this.f106028a.get(obj2);
            if (cVar != this.f106031d && (cVar.d() instanceof androidx.constraintlayout.core.state.a) && (c5634bM02 = ((androidx.constraintlayout.core.state.a) cVar.d()).M0()) != null) {
                c cVarE2 = this.f106028a.get(obj2);
                if (cVarE2 == null) {
                    cVarE2 = e(obj2);
                }
                cVarE2.b(c5634bM02);
            }
        }
        Iterator<Object> it = this.f106028a.keySet().iterator();
        while (it.hasNext()) {
            c cVar2 = this.f106028a.get(it.next());
            if (cVar2 != this.f106031d) {
                ConstraintWidget constraintWidgetA = cVar2.a();
                constraintWidgetA.j1(cVar2.getKey().toString());
                constraintWidgetA.S1(null);
                if (cVar2.d() instanceof t0.f) {
                    cVar2.apply();
                }
                dVar.a(constraintWidgetA);
            } else {
                cVar2.b(dVar);
            }
        }
        Iterator<Object> it2 = this.f106029b.keySet().iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.a aVar2 = this.f106029b.get(it2.next());
            if (aVar2.M0() != null) {
                ArrayList<Object> arrayList = aVar2.f106036l0;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    aVar2.M0().a(this.f106028a.get(obj3).a());
                }
                aVar2.apply();
            } else {
                aVar2.apply();
            }
        }
        Iterator<Object> it3 = this.f106028a.keySet().iterator();
        while (it3.hasNext()) {
            c cVar3 = this.f106028a.get(it3.next());
            if (cVar3 != this.f106031d && (cVar3.d() instanceof androidx.constraintlayout.core.state.a) && (c5634bM0 = (aVar = (androidx.constraintlayout.core.state.a) cVar3.d()).M0()) != null) {
                ArrayList<Object> arrayList2 = aVar.f106036l0;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj4 = arrayList2.get(i11);
                    i11++;
                    c cVar4 = this.f106028a.get(obj4);
                    if (cVar4 != null) {
                        c5634bM0.a(cVar4.a());
                    } else if (obj4 instanceof c) {
                        c5634bM0.a(((c) obj4).a());
                    } else {
                        System.out.println("couldn't find reference for " + obj4);
                    }
                }
                cVar3.apply();
            }
        }
        for (Object obj5 : this.f106028a.keySet()) {
            c cVar5 = this.f106028a.get(obj5);
            cVar5.apply();
            ConstraintWidget constraintWidgetA2 = cVar5.a();
            if (constraintWidgetA2 != null && obj5 != null) {
                constraintWidgetA2.f106217o = obj5.toString();
            }
        }
    }

    public t0.c b(Object obj, Direction direction) {
        ConstraintReference constraintReferenceE = e(obj);
        if (constraintReferenceE.d() == null || !(constraintReferenceE.d() instanceof t0.c)) {
            t0.c cVar = new t0.c(this);
            cVar.f238643n0 = direction;
            constraintReferenceE.p0(cVar);
        }
        return (t0.c) constraintReferenceE.d();
    }

    public C5595a c(Object... objArr) {
        C5595a c5595a = (C5595a) m(null, Helper.ALIGN_HORIZONTALLY);
        c5595a.L0(objArr);
        return c5595a;
    }

    public t0.b d(Object... objArr) {
        t0.b bVar = (t0.b) m(null, Helper.ALIGN_VERTICALLY);
        bVar.L0(objArr);
        return bVar;
    }

    public ConstraintReference e(Object obj) {
        c cVar = this.f106028a.get(obj);
        c cVar2 = cVar;
        if (cVar == null) {
            ConstraintReference constraintReferenceG = g(obj);
            this.f106028a.put(obj, constraintReferenceG);
            constraintReferenceG.f105972a = obj;
            cVar2 = constraintReferenceG;
        }
        if (cVar2 instanceof ConstraintReference) {
            return (ConstraintReference) cVar2;
        }
        return null;
    }

    public int f(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public ConstraintReference g(Object obj) {
        return new ConstraintReference(this);
    }

    public final String h() {
        StringBuilder sb2 = new StringBuilder("__HELPER_KEY_");
        int i10 = this.f106032e;
        this.f106032e = i10 + 1;
        return android.support.v4.media.d.a(sb2, i10, "__");
    }

    public void i() {
        for (Object obj : this.f106028a.keySet()) {
            ConstraintReference constraintReferenceE = e(obj);
            if (D.a(constraintReferenceE)) {
                constraintReferenceE.w0(obj);
            }
        }
    }

    public ArrayList<String> j(String str) {
        if (this.f106030c.containsKey(str)) {
            return this.f106030c.get(str);
        }
        return null;
    }

    public t0.f k(Object obj, int i10) {
        ConstraintReference constraintReferenceE = e(obj);
        if (constraintReferenceE.d() == null || !(constraintReferenceE.d() instanceof t0.f)) {
            t0.f fVar = new t0.f(this);
            fVar.f238650b = i10;
            fVar.f238655g = obj;
            constraintReferenceE.p0(fVar);
        }
        return (t0.f) constraintReferenceE.d();
    }

    public State l(Dimension dimension) {
        return v(dimension);
    }

    public androidx.constraintlayout.core.state.a m(Object obj, Helper helper) {
        if (obj == null) {
            obj = h();
        }
        androidx.constraintlayout.core.state.a aVar = this.f106029b.get(obj);
        if (aVar == null) {
            int i10 = a.f106033a[helper.ordinal()];
            aVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new androidx.constraintlayout.core.state.a(this, helper) : new t0.c(this) : new t0.b(this) : new C5595a(this) : new t0.h(this) : new t0.g(this);
            aVar.c(obj);
            this.f106029b.put(obj, aVar);
        }
        return aVar;
    }

    public t0.g n() {
        return (t0.g) m(null, Helper.HORIZONTAL_CHAIN);
    }

    public t0.g o(Object... objArr) {
        t0.g gVar = (t0.g) m(null, Helper.HORIZONTAL_CHAIN);
        gVar.L0(objArr);
        return gVar;
    }

    public t0.f p(Object obj) {
        return k(obj, 0);
    }

    public void q(Object obj, Object obj2) {
        ConstraintReference constraintReferenceE = e(obj);
        if (D.a(constraintReferenceE)) {
            constraintReferenceE.w0(obj2);
        }
    }

    public c r(Object obj) {
        return this.f106028a.get(obj);
    }

    public void s() {
        this.f106029b.clear();
        this.f106030c.clear();
    }

    public boolean t(int i10) {
        return this.f106031d.D().k(i10);
    }

    public boolean u(int i10) {
        return this.f106031d.V().k(i10);
    }

    public State v(Dimension dimension) {
        this.f106031d.q0(dimension);
        return this;
    }

    public void w(String str, String str2) {
        ArrayList<String> arrayList;
        ConstraintReference constraintReferenceE = e(str);
        if (constraintReferenceE != null) {
            constraintReferenceE.t0(str2);
            if (this.f106030c.containsKey(str2)) {
                arrayList = this.f106030c.get(str2);
            } else {
                arrayList = new ArrayList<>();
                this.f106030c.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public State x(Dimension dimension) {
        this.f106031d.x0(dimension);
        return this;
    }

    public t0.h y() {
        return (t0.h) m(null, Helper.VERTICAL_CHAIN);
    }

    public t0.h z(Object... objArr) {
        t0.h hVar = (t0.h) m(null, Helper.VERTICAL_CHAIN);
        hVar.L0(objArr);
        return hVar;
    }
}
