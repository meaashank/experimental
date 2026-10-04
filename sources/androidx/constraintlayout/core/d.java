package androidx.constraintlayout.core;

import androidx.collection.N0;
import androidx.compose.runtime.changelist.j;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static boolean f105845A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static int f105846B = 1000;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static o0.b f105847C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static long f105848D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static long f105849E = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f105850r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f105851s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f105852t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f105853u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f105854v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f105855w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f105856x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f105857y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f105858z = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f105862d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.constraintlayout.core.b[] f105865g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f105872n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f105875q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f105859a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f105860b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, SolverVariable> f105861c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f105863e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f105864f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f105866h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f105867i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean[] f105868j = new boolean[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f105869k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f105870l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f105871m = 32;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SolverVariable[] f105873o = new SolverVariable[f105846B];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f105874p = 0;

    public interface a {
        void a(d dVar, SolverVariable solverVariable, boolean z10);

        void b(d dVar, androidx.constraintlayout.core.b bVar, boolean z10);

        SolverVariable c(d dVar, boolean[] zArr);

        void clear();

        void d(d dVar);

        void e(a aVar);

        void f(SolverVariable solverVariable);

        SolverVariable getKey();

        boolean isEmpty();
    }

    public class b extends androidx.constraintlayout.core.b {
        public b(c cVar) {
            this.f105839e = new g(this, cVar);
        }
    }

    public d() {
        this.f105865g = null;
        this.f105865g = new androidx.constraintlayout.core.b[32];
        W();
        c cVar = new c();
        this.f105872n = cVar;
        this.f105862d = new f(cVar);
        if (f105845A) {
            this.f105875q = new b(cVar);
        } else {
            this.f105875q = new androidx.constraintlayout.core.b(cVar);
        }
    }

    public static o0.b L() {
        return f105847C;
    }

    public static androidx.constraintlayout.core.b w(d dVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f10) {
        return dVar.v().m(solverVariable, solverVariable2, f10);
    }

    public final void A() {
        B();
        String strA = "";
        for (int i10 = 0; i10 < this.f105870l; i10++) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strA);
            sbA.append(this.f105865g[i10]);
            strA = j.a(sbA.toString(), "\n");
        }
        StringBuilder sbA2 = androidx.compose.runtime.changelist.a.a(strA);
        sbA2.append(this.f105862d);
        sbA2.append("\n");
        System.out.println(sbA2.toString());
    }

    public final void B() {
        StringBuilder sb2 = new StringBuilder("Display Rows (");
        sb2.append(this.f105870l);
        sb2.append("x");
        System.out.println(android.support.v4.media.d.a(sb2, this.f105869k, ")\n"));
    }

    public void C() {
        int iE = 0;
        for (int i10 = 0; i10 < this.f105863e; i10++) {
            androidx.constraintlayout.core.b bVar = this.f105865g[i10];
            if (bVar != null) {
                iE += bVar.E();
            }
        }
        int iE2 = 0;
        for (int i11 = 0; i11 < this.f105870l; i11++) {
            androidx.constraintlayout.core.b bVar2 = this.f105865g[i11];
            if (bVar2 != null) {
                iE2 += bVar2.E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder("Linear System -> Table size: ");
        sb2.append(this.f105863e);
        sb2.append(" (");
        int i12 = this.f105863e;
        sb2.append(H(i12 * i12));
        sb2.append(") -- row sizes: ");
        sb2.append(H(iE));
        sb2.append(", actual size: ");
        sb2.append(H(iE2));
        sb2.append(" rows: ");
        sb2.append(this.f105870l);
        sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb2.append(this.f105871m);
        sb2.append(" cols: ");
        sb2.append(this.f105869k);
        sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb2.append(this.f105864f);
        sb2.append(" 0 occupied cells, ");
        sb2.append(H(0));
        printStream.println(sb2.toString());
    }

    public void D() {
        B();
        String strA = "";
        for (int i10 = 0; i10 < this.f105870l; i10++) {
            if (this.f105865g[i10].f105835a.f105809j == SolverVariable.Type.UNRESTRICTED) {
                StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strA);
                sbA.append(this.f105865g[i10].F());
                strA = j.a(sbA.toString(), "\n");
            }
        }
        StringBuilder sbA2 = androidx.compose.runtime.changelist.a.a(strA);
        sbA2.append(this.f105862d);
        sbA2.append("\n");
        System.out.println(sbA2.toString());
    }

    public final int E(a aVar) throws Exception {
        float f10;
        long j10;
        for (int i10 = 0; i10 < this.f105870l; i10++) {
            androidx.constraintlayout.core.b bVar = this.f105865g[i10];
            if (bVar.f105835a.f105809j != SolverVariable.Type.UNRESTRICTED) {
                float f11 = 0.0f;
                if (bVar.f105836b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        o0.b bVar2 = f105847C;
                        long j11 = 1;
                        if (bVar2 != null) {
                            bVar2.f223044o++;
                        }
                        i11++;
                        float f12 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f105870l) {
                                break;
                            }
                            androidx.constraintlayout.core.b bVar3 = this.f105865g[i12];
                            if (bVar3.f105835a.f105809j == SolverVariable.Type.UNRESTRICTED || bVar3.f105840f || bVar3.f105836b >= f11) {
                                f10 = f11;
                                j10 = j11;
                            } else if (f105858z) {
                                int iD = bVar3.f105839e.d();
                                int i16 = 0;
                                while (i16 < iD) {
                                    float f13 = f11;
                                    SolverVariable solverVariableG = bVar3.f105839e.g(i16);
                                    long j12 = j11;
                                    float fI = bVar3.f105839e.i(solverVariableG);
                                    if (fI > f13) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f14 = solverVariableG.f105807h[i17] / fI;
                                            if ((f14 < f12 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = solverVariableG.f105802c;
                                                i13 = i12;
                                                f12 = f14;
                                            }
                                        }
                                    }
                                    i16++;
                                    f11 = f13;
                                    j11 = j12;
                                }
                                f10 = f11;
                                j10 = j11;
                            } else {
                                f10 = f11;
                                j10 = j11;
                                for (int i18 = 1; i18 < this.f105869k; i18++) {
                                    SolverVariable solverVariable = this.f105872n.f105844d[i18];
                                    float fI2 = bVar3.f105839e.i(solverVariable);
                                    if (fI2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f15 = solverVariable.f105807h[i19] / fI2;
                                            if ((f15 < f12 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                f12 = f15;
                                                i13 = i12;
                                                i14 = i18;
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            f11 = f10;
                            j11 = j10;
                        }
                        float f16 = f11;
                        long j13 = j11;
                        if (i13 != -1) {
                            androidx.constraintlayout.core.b bVar4 = this.f105865g[i13];
                            bVar4.f105835a.f105803d = -1;
                            o0.b bVar5 = f105847C;
                            if (bVar5 != null) {
                                bVar5.f223043n += j13;
                            }
                            bVar4.C(this.f105872n.f105844d[i14]);
                            SolverVariable solverVariable2 = bVar4.f105835a;
                            solverVariable2.f105803d = i13;
                            solverVariable2.n(this, bVar4);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f105869k / 2) {
                            z10 = true;
                        }
                        f11 = f16;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public void F(o0.b bVar) {
        f105847C = bVar;
    }

    public c G() {
        return this.f105872n;
    }

    public final String H(int i10) {
        int i11 = i10 * 4;
        int i12 = i11 / 1024;
        int i13 = i12 / 1024;
        return i13 > 0 ? N0.a("", i13, " Mb") : i12 > 0 ? N0.a("", i12, " Kb") : N0.a("", i11, " bytes");
    }

    public final String I(int i10) {
        return i10 == 1 ? "LOW" : i10 == 2 ? "MEDIUM" : i10 == 3 ? "HIGH" : i10 == 4 ? "HIGHEST" : i10 == 5 ? "EQUALITY" : i10 == 8 ? "FIXED" : i10 == 6 ? "BARRIER" : "NONE";
    }

    public a J() {
        return this.f105862d;
    }

    public int K() {
        int iE = 0;
        for (int i10 = 0; i10 < this.f105870l; i10++) {
            androidx.constraintlayout.core.b bVar = this.f105865g[i10];
            if (bVar != null) {
                iE = bVar.E() + iE;
            }
        }
        return iE;
    }

    public int M() {
        return this.f105870l;
    }

    public int N() {
        return this.f105860b;
    }

    public int O(Object obj) {
        SolverVariable solverVariableJ = ((ConstraintAnchor) obj).j();
        if (solverVariableJ != null) {
            return (int) (solverVariableJ.f105805f + 0.5f);
        }
        return 0;
    }

    public androidx.constraintlayout.core.b P(int i10) {
        return this.f105865g[i10];
    }

    public float Q(String str) {
        return R(str, SolverVariable.Type.UNRESTRICTED).f105805f;
    }

    public SolverVariable R(String str, SolverVariable.Type type) {
        if (this.f105861c == null) {
            this.f105861c = new HashMap<>();
        }
        SolverVariable solverVariable = this.f105861c.get(str);
        return solverVariable == null ? y(str, type) : solverVariable;
    }

    public final void S() {
        int i10 = this.f105863e * 2;
        this.f105863e = i10;
        this.f105865g = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.f105865g, i10);
        c cVar = this.f105872n;
        cVar.f105844d = (SolverVariable[]) Arrays.copyOf(cVar.f105844d, this.f105863e);
        int i11 = this.f105863e;
        this.f105868j = new boolean[i11];
        this.f105864f = i11;
        this.f105871m = i11;
        o0.b bVar = f105847C;
        if (bVar != null) {
            bVar.f223037h++;
            bVar.f223049t = Math.max(bVar.f223049t, i11);
            o0.b bVar2 = f105847C;
            bVar2.f223022J = bVar2.f223049t;
        }
    }

    public void T() throws Exception {
        o0.b bVar = f105847C;
        if (bVar != null) {
            bVar.f223038i++;
        }
        if (this.f105862d.isEmpty()) {
            r();
            return;
        }
        if (!this.f105866h && !this.f105867i) {
            U(this.f105862d);
            return;
        }
        o0.b bVar2 = f105847C;
        if (bVar2 != null) {
            bVar2.f223051v++;
        }
        for (int i10 = 0; i10 < this.f105870l; i10++) {
            if (!this.f105865g[i10].f105840f) {
                U(this.f105862d);
                return;
            }
        }
        o0.b bVar3 = f105847C;
        if (bVar3 != null) {
            bVar3.f223050u++;
        }
        r();
    }

    public void U(a aVar) throws Exception {
        o0.b bVar = f105847C;
        if (bVar != null) {
            bVar.f223055z++;
            bVar.f223013A = Math.max(bVar.f223013A, this.f105869k);
            o0.b bVar2 = f105847C;
            bVar2.f223014B = Math.max(bVar2.f223014B, this.f105870l);
        }
        E(aVar);
        V(aVar, false);
        r();
    }

    public final int V(a aVar, boolean z10) {
        o0.b bVar = f105847C;
        if (bVar != null) {
            bVar.f223041l++;
        }
        for (int i10 = 0; i10 < this.f105869k; i10++) {
            this.f105868j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            o0.b bVar2 = f105847C;
            if (bVar2 != null) {
                bVar2.f223042m++;
            }
            i11++;
            if (i11 < this.f105869k * 2) {
                if (aVar.getKey() != null) {
                    this.f105868j[aVar.getKey().f105802c] = true;
                }
                SolverVariable solverVariableC = aVar.c(this, this.f105868j);
                if (solverVariableC != null) {
                    boolean[] zArr = this.f105868j;
                    int i12 = solverVariableC.f105802c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (solverVariableC != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f105870l; i14++) {
                        androidx.constraintlayout.core.b bVar3 = this.f105865g[i14];
                        if (bVar3.f105835a.f105809j != SolverVariable.Type.UNRESTRICTED && !bVar3.f105840f && bVar3.y(solverVariableC)) {
                            float fI = bVar3.f105839e.i(solverVariableC);
                            if (fI < 0.0f) {
                                float f11 = (-bVar3.f105836b) / fI;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        androidx.constraintlayout.core.b bVar4 = this.f105865g[i13];
                        bVar4.f105835a.f105803d = -1;
                        o0.b bVar5 = f105847C;
                        if (bVar5 != null) {
                            bVar5.f223043n++;
                        }
                        bVar4.C(solverVariableC);
                        SolverVariable solverVariable = bVar4.f105835a;
                        solverVariable.f105803d = i13;
                        solverVariable.n(this, bVar4);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    public final void W() {
        int i10 = 0;
        if (f105845A) {
            while (i10 < this.f105870l) {
                androidx.constraintlayout.core.b bVar = this.f105865g[i10];
                if (bVar != null) {
                    this.f105872n.f105841a.b(bVar);
                }
                this.f105865g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f105870l) {
            androidx.constraintlayout.core.b bVar2 = this.f105865g[i10];
            if (bVar2 != null) {
                this.f105872n.f105842b.b(bVar2);
            }
            this.f105865g[i10] = null;
            i10++;
        }
    }

    public void X(androidx.constraintlayout.core.b bVar) {
        SolverVariable solverVariable;
        int i10;
        if (!bVar.f105840f || (solverVariable = bVar.f105835a) == null) {
            return;
        }
        int i11 = solverVariable.f105803d;
        if (i11 != -1) {
            while (true) {
                i10 = this.f105870l;
                if (i11 >= i10 - 1) {
                    break;
                }
                androidx.constraintlayout.core.b[] bVarArr = this.f105865g;
                int i12 = i11 + 1;
                androidx.constraintlayout.core.b bVar2 = bVarArr[i12];
                SolverVariable solverVariable2 = bVar2.f105835a;
                if (solverVariable2.f105803d == i12) {
                    solverVariable2.f105803d = i11;
                }
                bVarArr[i11] = bVar2;
                i11 = i12;
            }
            this.f105870l = i10 - 1;
        }
        SolverVariable solverVariable3 = bVar.f105835a;
        if (!solverVariable3.f105806g) {
            solverVariable3.i(this, bVar.f105836b);
        }
        if (f105845A) {
            this.f105872n.f105841a.b(bVar);
        } else {
            this.f105872n.f105842b.b(bVar);
        }
    }

    public void Y() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f105872n;
            SolverVariable[] solverVariableArr = cVar.f105844d;
            if (i10 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i10];
            if (solverVariable != null) {
                solverVariable.h();
            }
            i10++;
        }
        cVar.f105843c.c(this.f105873o, this.f105874p);
        this.f105874p = 0;
        Arrays.fill(this.f105872n.f105844d, (Object) null);
        HashMap<String, SolverVariable> map = this.f105861c;
        if (map != null) {
            map.clear();
        }
        this.f105860b = 0;
        this.f105862d.clear();
        this.f105869k = 1;
        for (int i11 = 0; i11 < this.f105870l; i11++) {
            androidx.constraintlayout.core.b bVar = this.f105865g[i11];
            if (bVar != null) {
                bVar.f105837c = false;
            }
        }
        W();
        this.f105870l = 0;
        if (f105845A) {
            this.f105875q = new b(this.f105872n);
        } else {
            this.f105875q = new androidx.constraintlayout.core.b(this.f105872n);
        }
    }

    public final SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable solverVariableA = this.f105872n.f105843c.a();
        if (solverVariableA == null) {
            solverVariableA = new SolverVariable(type, str);
            solverVariableA.f105809j = type;
        } else {
            solverVariableA.h();
            solverVariableA.l(type, str);
        }
        int i10 = this.f105874p;
        int i11 = f105846B;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f105846B = i12;
            this.f105873o = (SolverVariable[]) Arrays.copyOf(this.f105873o, i12);
        }
        SolverVariable[] solverVariableArr = this.f105873o;
        int i13 = this.f105874p;
        this.f105874p = i13 + 1;
        solverVariableArr[i13] = solverVariableA;
        return solverVariableA;
    }

    public void b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f10, int i10) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableU = u(constraintWidget.r(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableU2 = u(constraintWidget.r(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableU3 = u(constraintWidget.r(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableU4 = u(constraintWidget.r(type4));
        SolverVariable solverVariableU5 = u(constraintWidget2.r(type));
        SolverVariable solverVariableU6 = u(constraintWidget2.r(type2));
        SolverVariable solverVariableU7 = u(constraintWidget2.r(type3));
        SolverVariable solverVariableU8 = u(constraintWidget2.r(type4));
        androidx.constraintlayout.core.b bVarV = v();
        double d10 = f10;
        double d11 = i10;
        bVarV.v(solverVariableU2, solverVariableU4, solverVariableU6, solverVariableU8, (float) (Math.sin(d10) * d11));
        d(bVarV);
        androidx.constraintlayout.core.b bVarV2 = v();
        bVarV2.v(solverVariableU, solverVariableU3, solverVariableU5, solverVariableU7, (float) (Math.cos(d10) * d11));
        d(bVarV2);
    }

    public void c(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11, int i12) {
        androidx.constraintlayout.core.b bVarV = v();
        bVarV.k(solverVariable, solverVariable2, i10, f10, solverVariable3, solverVariable4, i11);
        if (i12 != 8) {
            bVarV.g(this, i12);
        }
        d(bVarV);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(androidx.constraintlayout.core.b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L4
            goto La8
        L4:
            o0.b r0 = androidx.constraintlayout.core.d.f105847C
            r1 = 1
            if (r0 == 0) goto L18
            long r3 = r0.f223039j
            long r3 = r3 + r1
            r0.f223039j = r3
            boolean r3 = r8.f105840f
            if (r3 == 0) goto L18
            long r3 = r0.f223040k
            long r3 = r3 + r1
            r0.f223040k = r3
        L18:
            int r0 = r7.f105870l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f105871m
            if (r0 >= r4) goto L27
            int r0 = r7.f105869k
            int r0 = r0 + r3
            int r4 = r7.f105864f
            if (r0 < r4) goto L2a
        L27:
            r7.S()
        L2a:
            boolean r0 = r8.f105840f
            r4 = 0
            if (r0 != 0) goto La3
            r8.d(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L3a
            goto La8
        L3a:
            r8.w()
            boolean r0 = r8.i(r7)
            if (r0 == 0) goto L9a
            androidx.constraintlayout.core.SolverVariable r0 = r7.t()
            r8.f105835a = r0
            int r5 = r7.f105870l
            r7.m(r8)
            int r6 = r7.f105870l
            int r5 = r5 + r3
            if (r6 != r5) goto L9a
            androidx.constraintlayout.core.d$a r4 = r7.f105875q
            r4.e(r8)
            androidx.constraintlayout.core.d$a r4 = r7.f105875q
            r7.V(r4, r3)
            int r4 = r0.f105803d
            r5 = -1
            if (r4 != r5) goto L9b
            androidx.constraintlayout.core.SolverVariable r4 = r8.f105835a
            if (r4 != r0) goto L78
            androidx.constraintlayout.core.SolverVariable r0 = r8.A(r0)
            if (r0 == 0) goto L78
            o0.b r4 = androidx.constraintlayout.core.d.f105847C
            if (r4 == 0) goto L75
            long r5 = r4.f223043n
            long r5 = r5 + r1
            r4.f223043n = r5
        L75:
            r8.C(r0)
        L78:
            boolean r0 = r8.f105840f
            if (r0 != 0) goto L81
            androidx.constraintlayout.core.SolverVariable r0 = r8.f105835a
            r0.n(r7, r8)
        L81:
            boolean r0 = androidx.constraintlayout.core.d.f105845A
            if (r0 == 0) goto L8d
            androidx.constraintlayout.core.c r0 = r7.f105872n
            androidx.constraintlayout.core.e$a<androidx.constraintlayout.core.b> r0 = r0.f105841a
            r0.b(r8)
            goto L94
        L8d:
            androidx.constraintlayout.core.c r0 = r7.f105872n
            androidx.constraintlayout.core.e$a<androidx.constraintlayout.core.b> r0 = r0.f105842b
            r0.b(r8)
        L94:
            int r0 = r7.f105870l
            int r0 = r0 - r3
            r7.f105870l = r0
            goto L9b
        L9a:
            r3 = r4
        L9b:
            boolean r0 = r8.x()
            if (r0 != 0) goto La2
            goto La8
        La2:
            r4 = r3
        La3:
            if (r4 != 0) goto La8
            r7.m(r8)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.d.d(androidx.constraintlayout.core.b):void");
    }

    public androidx.constraintlayout.core.b e(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        if (f105855w && i11 == 8 && solverVariable2.f105806g && solverVariable.f105803d == -1) {
            solverVariable.i(this, solverVariable2.f105805f + i10);
            return null;
        }
        androidx.constraintlayout.core.b bVarV = v();
        bVarV.r(solverVariable, solverVariable2, i10);
        if (i11 != 8) {
            bVarV.g(this, i11);
        }
        d(bVarV);
        return bVarV;
    }

    public void f(SolverVariable solverVariable, int i10) {
        if (f105855w && solverVariable.f105803d == -1) {
            float f10 = i10;
            solverVariable.i(this, f10);
            for (int i11 = 0; i11 < this.f105860b + 1; i11++) {
                SolverVariable solverVariable2 = this.f105872n.f105844d[i11];
                if (solverVariable2 != null && solverVariable2.f105813n && solverVariable2.f105814o == solverVariable.f105802c) {
                    solverVariable2.i(this, solverVariable2.f105815p + f10);
                }
            }
            return;
        }
        int i12 = solverVariable.f105803d;
        if (i12 == -1) {
            androidx.constraintlayout.core.b bVarV = v();
            bVarV.l(solverVariable, i10);
            d(bVarV);
            return;
        }
        androidx.constraintlayout.core.b bVar = this.f105865g[i12];
        if (bVar.f105840f) {
            bVar.f105836b = i10;
            return;
        }
        if (bVar.f105839e.d() == 0) {
            bVar.f105840f = true;
            bVar.f105836b = i10;
        } else {
            androidx.constraintlayout.core.b bVarV2 = v();
            bVarV2.q(solverVariable, i10);
            d(bVarV2);
        }
    }

    public final void g(androidx.constraintlayout.core.b bVar) {
        bVar.g(this, 0);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, boolean z10) {
        androidx.constraintlayout.core.b bVarV = v();
        SolverVariable solverVariableX = x();
        solverVariableX.f105804e = 0;
        bVarV.t(solverVariable, solverVariable2, solverVariableX, i10);
        d(bVarV);
    }

    public void i(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        androidx.constraintlayout.core.b bVarV = v();
        SolverVariable solverVariableX = x();
        solverVariableX.f105804e = 0;
        bVarV.t(solverVariable, solverVariable2, solverVariableX, i10);
        if (i11 != 8) {
            o(bVarV, (int) (bVarV.f105839e.i(solverVariableX) * (-1.0f)), i11);
        }
        d(bVarV);
    }

    public void j(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, boolean z10) {
        androidx.constraintlayout.core.b bVarV = v();
        SolverVariable solverVariableX = x();
        solverVariableX.f105804e = 0;
        bVarV.u(solverVariable, solverVariable2, solverVariableX, i10);
        d(bVarV);
    }

    public void k(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        androidx.constraintlayout.core.b bVarV = v();
        SolverVariable solverVariableX = x();
        solverVariableX.f105804e = 0;
        bVarV.u(solverVariable, solverVariable2, solverVariableX, i10);
        if (i11 != 8) {
            o(bVarV, (int) (bVarV.f105839e.i(solverVariableX) * (-1.0f)), i11);
        }
        d(bVarV);
    }

    public void l(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10, int i10) {
        androidx.constraintlayout.core.b bVarV = v();
        bVarV.n(solverVariable, solverVariable2, solverVariable3, solverVariable4, f10);
        if (i10 != 8) {
            bVarV.g(this, i10);
        }
        d(bVarV);
    }

    public final void m(androidx.constraintlayout.core.b bVar) {
        int i10;
        if (f105856x && bVar.f105840f) {
            bVar.f105835a.i(this, bVar.f105836b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.f105865g;
            int i11 = this.f105870l;
            bVarArr[i11] = bVar;
            SolverVariable solverVariable = bVar.f105835a;
            solverVariable.f105803d = i11;
            this.f105870l = i11 + 1;
            solverVariable.n(this, bVar);
        }
        if (f105856x && this.f105859a) {
            int i12 = 0;
            while (i12 < this.f105870l) {
                if (this.f105865g[i12] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.f105865g[i12];
                if (bVar2 != null && bVar2.f105840f) {
                    bVar2.f105835a.i(this, bVar2.f105836b);
                    if (f105845A) {
                        this.f105872n.f105841a.b(bVar2);
                    } else {
                        this.f105872n.f105842b.b(bVar2);
                    }
                    this.f105865g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f105870l;
                        if (i13 >= i10) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.f105865g;
                        int i15 = i13 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f105835a;
                        if (solverVariable2.f105803d == i13) {
                            solverVariable2.f105803d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f105865g[i14] = null;
                    }
                    this.f105870l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f105859a = false;
        }
    }

    public final void n(androidx.constraintlayout.core.b bVar, int i10) {
        o(bVar, i10, 0);
    }

    public void o(androidx.constraintlayout.core.b bVar, int i10, int i11) {
        bVar.h(s(i11, null), i10);
    }

    public void p(SolverVariable solverVariable, SolverVariable solverVariable2, int i10) {
        if (solverVariable.f105803d != -1 || i10 != 0) {
            e(solverVariable, solverVariable2, i10, 8);
            return;
        }
        if (solverVariable2.f105813n) {
            solverVariable2 = this.f105872n.f105844d[solverVariable2.f105814o];
        }
        if (solverVariable.f105813n) {
            SolverVariable solverVariable3 = this.f105872n.f105844d[solverVariable.f105814o];
        } else {
            solverVariable.k(this, solverVariable2, 0.0f);
        }
    }

    public final void q() {
        int i10;
        int i11 = 0;
        while (i11 < this.f105870l) {
            androidx.constraintlayout.core.b bVar = this.f105865g[i11];
            if (bVar.f105839e.d() == 0) {
                bVar.f105840f = true;
            }
            if (bVar.f105840f) {
                SolverVariable solverVariable = bVar.f105835a;
                solverVariable.f105805f = bVar.f105836b;
                solverVariable.g(bVar);
                int i12 = i11;
                while (true) {
                    i10 = this.f105870l - 1;
                    if (i12 >= i10) {
                        break;
                    }
                    androidx.constraintlayout.core.b[] bVarArr = this.f105865g;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.f105865g[i10] = null;
                this.f105870l = i10;
                i11--;
                if (f105845A) {
                    this.f105872n.f105841a.b(bVar);
                } else {
                    this.f105872n.f105842b.b(bVar);
                }
            }
            i11++;
        }
    }

    public final void r() {
        for (int i10 = 0; i10 < this.f105870l; i10++) {
            androidx.constraintlayout.core.b bVar = this.f105865g[i10];
            bVar.f105835a.f105805f = bVar.f105836b;
        }
    }

    public SolverVariable s(int i10, String str) {
        o0.b bVar = f105847C;
        if (bVar != null) {
            bVar.f223046q++;
        }
        if (this.f105869k + 1 >= this.f105864f) {
            S();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.ERROR, str);
        int i11 = this.f105860b + 1;
        this.f105860b = i11;
        this.f105869k++;
        solverVariableA.f105802c = i11;
        solverVariableA.f105804e = i10;
        this.f105872n.f105844d[i11] = solverVariableA;
        this.f105862d.f(solverVariableA);
        return solverVariableA;
    }

    public SolverVariable t() {
        o0.b bVar = f105847C;
        if (bVar != null) {
            bVar.f223048s++;
        }
        if (this.f105869k + 1 >= this.f105864f) {
            S();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i10 = this.f105860b + 1;
        this.f105860b = i10;
        this.f105869k++;
        solverVariableA.f105802c = i10;
        this.f105872n.f105844d[i10] = solverVariableA;
        return solverVariableA;
    }

    public SolverVariable u(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f105869k + 1 >= this.f105864f) {
            S();
        }
        if (!(obj instanceof ConstraintAnchor)) {
            return null;
        }
        ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
        SolverVariable solverVariableJ = constraintAnchor.j();
        if (solverVariableJ == null) {
            constraintAnchor.z(this.f105872n);
            solverVariableJ = constraintAnchor.j();
        }
        int i10 = solverVariableJ.f105802c;
        if (i10 != -1 && i10 <= this.f105860b && this.f105872n.f105844d[i10] != null) {
            return solverVariableJ;
        }
        if (i10 != -1) {
            solverVariableJ.h();
        }
        int i11 = this.f105860b + 1;
        this.f105860b = i11;
        this.f105869k++;
        solverVariableJ.f105802c = i11;
        solverVariableJ.f105809j = SolverVariable.Type.UNRESTRICTED;
        this.f105872n.f105844d[i11] = solverVariableJ;
        return solverVariableJ;
    }

    public androidx.constraintlayout.core.b v() {
        androidx.constraintlayout.core.b bVarA;
        if (f105845A) {
            bVarA = this.f105872n.f105841a.a();
            if (bVarA == null) {
                bVarA = new b(this.f105872n);
                f105849E++;
            } else {
                bVarA.D();
            }
        } else {
            bVarA = this.f105872n.f105842b.a();
            if (bVarA == null) {
                bVarA = new androidx.constraintlayout.core.b(this.f105872n);
                f105848D++;
            } else {
                bVarA.D();
            }
        }
        SolverVariable.f();
        return bVarA;
    }

    public SolverVariable x() {
        o0.b bVar = f105847C;
        if (bVar != null) {
            bVar.f223047r++;
        }
        if (this.f105869k + 1 >= this.f105864f) {
            S();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i10 = this.f105860b + 1;
        this.f105860b = i10;
        this.f105869k++;
        solverVariableA.f105802c = i10;
        this.f105872n.f105844d[i10] = solverVariableA;
        return solverVariableA;
    }

    public final SolverVariable y(String str, SolverVariable.Type type) {
        o0.b bVar = f105847C;
        if (bVar != null) {
            bVar.f223045p++;
        }
        if (this.f105869k + 1 >= this.f105864f) {
            S();
        }
        SolverVariable solverVariableA = a(type, null);
        solverVariableA.j(str);
        int i10 = this.f105860b + 1;
        this.f105860b = i10;
        this.f105869k++;
        solverVariableA.f105802c = i10;
        if (this.f105861c == null) {
            this.f105861c = new HashMap<>();
        }
        this.f105861c.put(str, solverVariableA);
        this.f105872n.f105844d[this.f105860b] = solverVariableA;
        return solverVariableA;
    }

    public void z() {
        B();
        String strA = android.support.v4.media.d.a(new StringBuilder(" num vars "), this.f105860b, "\n");
        for (int i10 = 0; i10 < this.f105860b + 1; i10++) {
            SolverVariable solverVariable = this.f105872n.f105844d[i10];
            if (solverVariable != null && solverVariable.f105806g) {
                strA = strA + " $[" + i10 + "] => " + solverVariable + " = " + solverVariable.f105805f + "\n";
            }
        }
        String strA2 = j.a(strA, "\n");
        for (int i11 = 0; i11 < this.f105860b + 1; i11++) {
            SolverVariable[] solverVariableArr = this.f105872n.f105844d;
            SolverVariable solverVariable2 = solverVariableArr[i11];
            if (solverVariable2 != null && solverVariable2.f105813n) {
                strA2 = strA2 + " ~[" + i11 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.f105814o] + " + " + solverVariable2.f105815p + "\n";
            }
        }
        String strA3 = j.a(strA2, "\n\n #  ");
        for (int i12 = 0; i12 < this.f105870l; i12++) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strA3);
            sbA.append(this.f105865g[i12].F());
            strA3 = j.a(sbA.toString(), "\n #  ");
        }
        if (this.f105862d != null) {
            StringBuilder sbA2 = android.support.v4.media.f.a(strA3, "Goal: ");
            sbA2.append(this.f105862d);
            sbA2.append("\n");
            strA3 = sbA2.toString();
        }
        System.out.println(strA3);
    }
}
