package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p0.C5379c;
import p0.C5382f;
import q0.C5413c;
import q0.C5414d;
import q0.C5415e;
import s0.C5563e;
import s0.C5566h;
import s0.v;
import s0.x;

/* JADX INFO: loaded from: classes.dex */
public class n implements x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f106041A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f106042B = -2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f106043q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f106044r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f106045s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f106046t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f106047u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f106048v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f106049w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f106050x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f106051y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f106052z = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap<Integer, HashMap<String, a>> f106053h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap<String, b> f106054i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v f106055j = new v();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f106056k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f106057l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C5563e f106058m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f106059n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f106060o = 400;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f106061p = 0.0f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f106062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f106063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f106064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f106065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f106066e;

        public a(String str, int i10, int i11, float f10, float f11) {
            this.f106063b = str;
            this.f106062a = i10;
            this.f106064c = i11;
            this.f106065d = f10;
            this.f106066e = f11;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C5379c f106070d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C5566h f106074h = new C5566h();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f106075i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f106076j = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f106067a = new o();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o f106068b = new o();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f106069c = new o();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C5382f f106071e = new C5382f(this.f106067a);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public C5382f f106072f = new C5382f(this.f106068b);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C5382f f106073g = new C5382f(this.f106069c);

        public b() {
            C5379c c5379c = new C5379c(this.f106071e);
            this.f106070d = c5379c;
            c5379c.Z(this.f106071e);
            this.f106070d.X(this.f106072f);
        }

        public o a(int i10) {
            return i10 == 0 ? this.f106067a : i10 == 1 ? this.f106068b : this.f106069c;
        }

        public void b(int i10, int i11, float f10, n nVar) {
            this.f106075i = i11;
            this.f106076j = i10;
            this.f106070d.d0(i10, i11, 1.0f, System.nanoTime());
            o.n(i10, i11, this.f106069c, this.f106067a, this.f106068b, nVar, f10);
            this.f106069c.f106095q = f10;
            this.f106070d.Q(this.f106073g, f10, System.nanoTime(), this.f106074h);
        }

        public void c(v vVar) {
            C5413c c5413c = new C5413c();
            vVar.g(c5413c);
            this.f106070d.f(c5413c);
        }

        public void d(v vVar) {
            C5414d c5414d = new C5414d();
            vVar.g(c5414d);
            this.f106070d.f(c5414d);
        }

        public void e(v vVar) {
            C5415e c5415e = new C5415e();
            vVar.g(c5415e);
            this.f106070d.f(c5415e);
        }

        public void f(ConstraintWidget constraintWidget, int i10) {
            if (i10 == 0) {
                this.f106067a.C(constraintWidget);
                this.f106070d.Z(this.f106071e);
            } else if (i10 == 1) {
                this.f106068b.C(constraintWidget);
                this.f106070d.X(this.f106072f);
            }
            this.f106076j = -1;
        }
    }

    public static androidx.constraintlayout.core.state.b E(int i10, final String str) {
        switch (i10) {
            case -1:
                return new androidx.constraintlayout.core.state.b() { // from class: androidx.constraintlayout.core.state.f
                    @Override // androidx.constraintlayout.core.state.b
                    public final float getInterpolation(float f10) {
                        return n.i(str, f10);
                    }
                };
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new i();
            case 3:
                return new j();
            case 4:
                return new m();
            case 5:
                return new l();
            case 6:
                return new k();
            default:
                return null;
        }
    }

    public static /* synthetic */ float f(float f10) {
        return (float) C5563e.c(C5563e.f238015k).a(f10);
    }

    public static /* synthetic */ float g(float f10) {
        return (float) C5563e.c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").a(f10);
    }

    public static /* synthetic */ float h(float f10) {
        return (float) C5563e.c(C5563e.f238017m).a(f10);
    }

    public static /* synthetic */ float i(String str, float f10) {
        return (float) C5563e.c(str).a(f10);
    }

    public static /* synthetic */ float j(float f10) {
        return (float) C5563e.c(C5563e.f238016l).a(f10);
    }

    public static /* synthetic */ float k(float f10) {
        return (float) C5563e.c(C5563e.f238013i).a(f10);
    }

    public static /* synthetic */ float l(float f10) {
        return (float) C5563e.c(C5563e.f238018n).a(f10);
    }

    public static /* synthetic */ float m(float f10) {
        return (float) C5563e.c(C5563e.f238014j).a(f10);
    }

    public o A(String str) {
        b bVar = this.f106054i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f106068b;
    }

    public o B(ConstraintWidget constraintWidget) {
        return M(constraintWidget.f106217o, null, 2).f106069c;
    }

    public o C(String str) {
        b bVar = this.f106054i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f106069c;
    }

    public androidx.constraintlayout.core.state.b D() {
        return E(this.f106056k, this.f106057l);
    }

    public int F(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f106054i.get(str).f106070d.j(fArr, iArr, iArr2);
    }

    public C5379c G(String str) {
        return M(str, null, 0).f106070d;
    }

    public int H(o oVar) {
        int i10 = 0;
        for (int i11 = 0; i11 <= 100; i11++) {
            HashMap<String, a> map = this.f106053h.get(Integer.valueOf(i11));
            if (map != null && map.get(oVar.f106079a.f106217o) != null) {
                i10++;
            }
        }
        return i10;
    }

    public float[] I(String str) {
        float[] fArr = new float[124];
        this.f106054i.get(str).f106070d.k(fArr, 62);
        return fArr;
    }

    public o J(ConstraintWidget constraintWidget) {
        return M(constraintWidget.f106217o, null, 0).f106067a;
    }

    public o K(String str) {
        b bVar = this.f106054i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f106067a;
    }

    public final b L(String str) {
        return this.f106054i.get(str);
    }

    public final b M(String str, ConstraintWidget constraintWidget, int i10) {
        b bVar = this.f106054i.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f106055j.g(bVar.f106070d);
            this.f106054i.put(str, bVar);
            if (constraintWidget != null) {
                bVar.f(constraintWidget, i10);
            }
        }
        return bVar;
    }

    public boolean N() {
        return this.f106053h.size() > 0;
    }

    public void O(int i10, int i11, float f10) {
        C5563e c5563e = this.f106058m;
        if (c5563e != null) {
            f10 = (float) c5563e.a(f10);
        }
        Iterator<String> it = this.f106054i.keySet().iterator();
        while (it.hasNext()) {
            this.f106054i.get(it.next()).b(i10, i11, f10, this);
        }
    }

    public boolean P() {
        return this.f106054i.isEmpty();
    }

    public void Q(v vVar) {
        vVar.f(this.f106055j);
        vVar.g(this);
    }

    public void R(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        ArrayList<ConstraintWidget> arrayListL2 = dVar.l2();
        int size = arrayListL2.size();
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = arrayListL2.get(i11);
            M(constraintWidget.f106217o, null, i10).f(constraintWidget, i10);
        }
    }

    @Override // s0.x
    public boolean a(int i10, int i11) {
        return false;
    }

    @Override // s0.x
    public boolean b(int i10, float f10) {
        if (i10 != 706) {
            return false;
        }
        this.f106061p = f10;
        return false;
    }

    @Override // s0.x
    public boolean c(int i10, boolean z10) {
        return false;
    }

    @Override // s0.x
    public boolean d(int i10, String str) {
        if (i10 != 705) {
            return false;
        }
        this.f106057l = str;
        this.f106058m = C5563e.c(str);
        return false;
    }

    @Override // s0.x
    public int e(String str) {
        return 0;
    }

    public void n(int i10, String str, String str2, int i11) {
        M(str, null, i10).a(i10).c(str2, i11);
    }

    public void o(int i10, String str, String str2, float f10) {
        M(str, null, i10).a(i10).d(str2, f10);
    }

    public void p(String str, v vVar) {
        M(str, null, 0).c(vVar);
    }

    public void q(String str, v vVar) {
        M(str, null, 0).d(vVar);
    }

    public void r(String str, int i10, int i11, float f10, float f11) {
        v vVar = new v();
        vVar.b(x.g.f238396r, 2);
        vVar.b(100, i10);
        vVar.a(506, f10);
        vVar.a(507, f11);
        M(str, null, 0).e(vVar);
        a aVar = new a(str, i10, i11, f10, f11);
        HashMap<String, a> map = this.f106053h.get(Integer.valueOf(i10));
        if (map == null) {
            map = new HashMap<>();
            this.f106053h.put(Integer.valueOf(i10), map);
        }
        map.put(str, aVar);
    }

    public void s(String str, v vVar) {
        M(str, null, 0).e(vVar);
    }

    public void t() {
        this.f106054i.clear();
    }

    public boolean u(String str) {
        return this.f106054i.containsKey(str);
    }

    public void v(o oVar, float[] fArr, float[] fArr2, float[] fArr3) {
        a aVar;
        int i10 = 0;
        for (int i11 = 0; i11 <= 100; i11++) {
            HashMap<String, a> map = this.f106053h.get(Integer.valueOf(i11));
            if (map != null && (aVar = map.get(oVar.f106079a.f106217o)) != null) {
                fArr[i10] = aVar.f106065d;
                fArr2[i10] = aVar.f106066e;
                fArr3[i10] = aVar.f106062a;
                i10++;
            }
        }
    }

    public a w(String str, int i10) {
        a aVar;
        while (i10 <= 100) {
            HashMap<String, a> map = this.f106053h.get(Integer.valueOf(i10));
            if (map != null && (aVar = map.get(str)) != null) {
                return aVar;
            }
            i10++;
        }
        return null;
    }

    public a x(String str, int i10) {
        a aVar;
        while (i10 >= 0) {
            HashMap<String, a> map = this.f106053h.get(Integer.valueOf(i10));
            if (map != null && (aVar = map.get(str)) != null) {
                return aVar;
            }
            i10--;
        }
        return null;
    }

    public int y() {
        return this.f106059n;
    }

    public o z(ConstraintWidget constraintWidget) {
        return M(constraintWidget.f106217o, null, 1).f106068b;
    }
}
