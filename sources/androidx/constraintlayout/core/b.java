package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f105833g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f105834h = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f105839e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SolverVariable f105835a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f105836b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f105837c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<SolverVariable> f105838d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f105840f = false;

    public interface a {
        void clear();

        int d();

        int e(SolverVariable solverVariable);

        boolean f(SolverVariable solverVariable);

        SolverVariable g(int i10);

        void h(SolverVariable solverVariable, float f10);

        float i(SolverVariable solverVariable);

        void j(float f10);

        void k(SolverVariable solverVariable, float f10, boolean z10);

        void l();

        float m(SolverVariable solverVariable, boolean z10);

        int n();

        void o();

        float p(b bVar, boolean z10);

        float q(int i10);
    }

    public b() {
    }

    public SolverVariable A(SolverVariable solverVariable) {
        return B(null, solverVariable);
    }

    public final SolverVariable B(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iD = this.f105839e.d();
        SolverVariable solverVariable2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iD; i10++) {
            float fQ = this.f105839e.q(i10);
            if (fQ < 0.0f) {
                SolverVariable solverVariableG = this.f105839e.g(i10);
                if ((zArr == null || !zArr[solverVariableG.f105802c]) && solverVariableG != solverVariable && (((type = solverVariableG.f105809j) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && fQ < f10)) {
                    f10 = fQ;
                    solverVariable2 = solverVariableG;
                }
            }
        }
        return solverVariable2;
    }

    public void C(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f105835a;
        if (solverVariable2 != null) {
            this.f105839e.h(solverVariable2, -1.0f);
            this.f105835a.f105803d = -1;
            this.f105835a = null;
        }
        float fM = this.f105839e.m(solverVariable, true) * (-1.0f);
        this.f105835a = solverVariable;
        if (fM == 1.0f) {
            return;
        }
        this.f105836b /= fM;
        this.f105839e.j(fM);
    }

    public void D() {
        this.f105835a = null;
        this.f105839e.clear();
        this.f105836b = 0.0f;
        this.f105840f = false;
    }

    public int E() {
        return this.f105839e.n() + (this.f105835a != null ? 4 : 0) + 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String F() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.f105835a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r10.f105835a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r1)
            float r1 = r10.f105836b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = androidx.compose.runtime.changelist.a.a(r0)
            float r1 = r10.f105836b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            androidx.constraintlayout.core.b$a r5 = r10.f105839e
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9c
            androidx.constraintlayout.core.b$a r6 = r10.f105839e
            androidx.constraintlayout.core.SolverVariable r6 = r6.g(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            androidx.constraintlayout.core.b$a r7 = r10.f105839e
            float r7 = r7.q(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.F():java.lang.String");
    }

    public void G(d dVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable == null || !solverVariable.f105813n) {
            return;
        }
        float fI = this.f105839e.i(solverVariable);
        this.f105836b = (solverVariable.f105815p * fI) + this.f105836b;
        this.f105839e.m(solverVariable, z10);
        if (z10) {
            solverVariable.g(this);
        }
        this.f105839e.k(dVar.f105872n.f105844d[solverVariable.f105814o], fI, z10);
        if (d.f105856x && this.f105839e.d() == 0) {
            this.f105840f = true;
            dVar.f105859a = true;
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public void a(d dVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable == null || !solverVariable.f105806g) {
            return;
        }
        float fI = this.f105839e.i(solverVariable);
        this.f105836b = (solverVariable.f105805f * fI) + this.f105836b;
        this.f105839e.m(solverVariable, z10);
        if (z10) {
            solverVariable.g(this);
        }
        if (d.f105856x && this.f105839e.d() == 0) {
            this.f105840f = true;
            dVar.f105859a = true;
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public void b(d dVar, b bVar, boolean z10) {
        float fP = this.f105839e.p(bVar, z10);
        this.f105836b = (bVar.f105836b * fP) + this.f105836b;
        if (z10) {
            bVar.f105835a.g(this);
        }
        if (d.f105856x && this.f105835a != null && this.f105839e.d() == 0) {
            this.f105840f = true;
            dVar.f105859a = true;
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public SolverVariable c(d dVar, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // androidx.constraintlayout.core.d.a
    public void clear() {
        this.f105839e.clear();
        this.f105835a = null;
        this.f105836b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.d.a
    public void d(d dVar) {
        if (dVar.f105865g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iD = this.f105839e.d();
            for (int i10 = 0; i10 < iD; i10++) {
                SolverVariable solverVariableG = this.f105839e.g(i10);
                if (solverVariableG.f105803d != -1 || solverVariableG.f105806g || solverVariableG.f105813n) {
                    this.f105838d.add(solverVariableG);
                }
            }
            int size = this.f105838d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    SolverVariable solverVariable = this.f105838d.get(i11);
                    if (solverVariable.f105806g) {
                        a(dVar, solverVariable, true);
                    } else if (solverVariable.f105813n) {
                        G(dVar, solverVariable, true);
                    } else {
                        b(dVar, dVar.f105865g[solverVariable.f105803d], true);
                    }
                }
                this.f105838d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f105856x && this.f105835a != null && this.f105839e.d() == 0) {
            this.f105840f = true;
            dVar.f105859a = true;
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public void e(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f105835a = null;
            this.f105839e.clear();
            for (int i10 = 0; i10 < bVar.f105839e.d(); i10++) {
                this.f105839e.k(bVar.f105839e.g(i10), bVar.f105839e.q(i10), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public void f(SolverVariable solverVariable) {
        int i10 = solverVariable.f105804e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f105839e.h(solverVariable, f10);
    }

    public b g(d dVar, int i10) {
        this.f105839e.h(dVar.s(i10, "ep"), 1.0f);
        this.f105839e.h(dVar.s(i10, "em"), -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.core.d.a
    public SolverVariable getKey() {
        return this.f105835a;
    }

    public b h(SolverVariable solverVariable, int i10) {
        this.f105839e.h(solverVariable, i10);
        return this;
    }

    public boolean i(d dVar) {
        boolean z10;
        SolverVariable solverVariableJ = j(dVar);
        if (solverVariableJ == null) {
            z10 = true;
        } else {
            C(solverVariableJ);
            z10 = false;
        }
        if (this.f105839e.d() == 0) {
            this.f105840f = true;
        }
        return z10;
    }

    @Override // androidx.constraintlayout.core.d.a
    public boolean isEmpty() {
        return this.f105835a == null && this.f105836b == 0.0f && this.f105839e.d() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.constraintlayout.core.SolverVariable j(androidx.constraintlayout.core.d r15) {
        /*
            r14 = this;
            androidx.constraintlayout.core.b$a r15 = r14.f105839e
            int r15 = r15.d()
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = r0
            r5 = r1
            r7 = r5
            r4 = r2
            r6 = r4
            r8 = r6
        Lf:
            if (r4 >= r15) goto L6a
            androidx.constraintlayout.core.b$a r9 = r14.f105839e
            float r9 = r9.q(r4)
            androidx.constraintlayout.core.b$a r10 = r14.f105839e
            androidx.constraintlayout.core.SolverVariable r10 = r10.g(r4)
            androidx.constraintlayout.core.SolverVariable$Type r11 = r10.f105809j
            androidx.constraintlayout.core.SolverVariable$Type r12 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            r13 = 1
            if (r11 != r12) goto L43
            if (r0 != 0) goto L30
            int r0 = r10.f105812m
            if (r0 > r13) goto L2c
        L2a:
            r6 = r13
            goto L2d
        L2c:
            r6 = r2
        L2d:
            r5 = r9
            r0 = r10
            goto L67
        L30:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L39
            int r0 = r10.f105812m
            if (r0 > r13) goto L2c
            goto L2a
        L39:
            if (r6 != 0) goto L67
            int r11 = r10.f105812m
            if (r11 > r13) goto L67
            r5 = r9
            r0 = r10
            r6 = r13
            goto L67
        L43:
            if (r0 != 0) goto L67
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 >= 0) goto L67
            if (r3 != 0) goto L55
            int r3 = r10.f105812m
            if (r3 > r13) goto L51
        L4f:
            r8 = r13
            goto L52
        L51:
            r8 = r2
        L52:
            r7 = r9
            r3 = r10
            goto L67
        L55:
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L5e
            int r3 = r10.f105812m
            if (r3 > r13) goto L51
            goto L4f
        L5e:
            if (r8 != 0) goto L67
            int r11 = r10.f105812m
            if (r11 > r13) goto L67
            r7 = r9
            r3 = r10
            r8 = r13
        L67:
            int r4 = r4 + 1
            goto Lf
        L6a:
            if (r0 == 0) goto L6d
            return r0
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.j(androidx.constraintlayout.core.d):androidx.constraintlayout.core.SolverVariable");
    }

    public b k(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11) {
        if (solverVariable2 == solverVariable3) {
            this.f105839e.h(solverVariable, 1.0f);
            this.f105839e.h(solverVariable4, 1.0f);
            this.f105839e.h(solverVariable2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f105839e.h(solverVariable, 1.0f);
            this.f105839e.h(solverVariable2, -1.0f);
            this.f105839e.h(solverVariable3, -1.0f);
            this.f105839e.h(solverVariable4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f105836b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f105839e.h(solverVariable, -1.0f);
                this.f105839e.h(solverVariable2, 1.0f);
                this.f105836b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f105839e.h(solverVariable4, -1.0f);
                this.f105839e.h(solverVariable3, 1.0f);
                this.f105836b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f105839e.h(solverVariable, f11 * 1.0f);
            this.f105839e.h(solverVariable2, f11 * (-1.0f));
            this.f105839e.h(solverVariable3, (-1.0f) * f10);
            this.f105839e.h(solverVariable4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f105836b = (i11 * f10) + ((-i10) * f11);
                return this;
            }
        }
        return this;
    }

    public b l(SolverVariable solverVariable, int i10) {
        this.f105835a = solverVariable;
        float f10 = i10;
        solverVariable.f105805f = f10;
        this.f105836b = f10;
        this.f105840f = true;
        return this;
    }

    public b m(SolverVariable solverVariable, SolverVariable solverVariable2, float f10) {
        this.f105839e.h(solverVariable, -1.0f);
        this.f105839e.h(solverVariable2, f10);
        return this;
    }

    public b n(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        this.f105839e.h(solverVariable, -1.0f);
        this.f105839e.h(solverVariable2, 1.0f);
        this.f105839e.h(solverVariable3, f10);
        this.f105839e.h(solverVariable4, -f10);
        return this;
    }

    public b o(float f10, float f11, float f12, SolverVariable solverVariable, int i10, SolverVariable solverVariable2, int i11, SolverVariable solverVariable3, int i12, SolverVariable solverVariable4, int i13) {
        if (f11 == 0.0f || f10 == f12) {
            this.f105836b = ((-i10) - i11) + i12 + i13;
            this.f105839e.h(solverVariable, 1.0f);
            this.f105839e.h(solverVariable2, -1.0f);
            this.f105839e.h(solverVariable4, 1.0f);
            this.f105839e.h(solverVariable3, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f105836b = (i13 * f13) + (i12 * f13) + ((-i10) - i11);
        this.f105839e.h(solverVariable, 1.0f);
        this.f105839e.h(solverVariable2, -1.0f);
        this.f105839e.h(solverVariable4, f13);
        this.f105839e.h(solverVariable3, -f13);
        return this;
    }

    public b p(float f10, float f11, float f12, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f105836b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f105839e.h(solverVariable, 1.0f);
            this.f105839e.h(solverVariable2, -1.0f);
            this.f105839e.h(solverVariable4, 1.0f);
            this.f105839e.h(solverVariable3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f105839e.h(solverVariable, 1.0f);
            this.f105839e.h(solverVariable2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f105839e.h(solverVariable3, 1.0f);
            this.f105839e.h(solverVariable4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f105839e.h(solverVariable, 1.0f);
        this.f105839e.h(solverVariable2, -1.0f);
        this.f105839e.h(solverVariable4, f13);
        this.f105839e.h(solverVariable3, -f13);
        return this;
    }

    public b q(SolverVariable solverVariable, int i10) {
        if (i10 < 0) {
            this.f105836b = i10 * (-1);
            this.f105839e.h(solverVariable, 1.0f);
            return this;
        }
        this.f105836b = i10;
        this.f105839e.h(solverVariable, -1.0f);
        return this;
    }

    public b r(SolverVariable solverVariable, SolverVariable solverVariable2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f105836b = i10;
        }
        if (z10) {
            this.f105839e.h(solverVariable, 1.0f);
            this.f105839e.h(solverVariable2, -1.0f);
            return this;
        }
        this.f105839e.h(solverVariable, -1.0f);
        this.f105839e.h(solverVariable2, 1.0f);
        return this;
    }

    public b s(SolverVariable solverVariable, int i10, SolverVariable solverVariable2) {
        this.f105836b = i10;
        this.f105839e.h(solverVariable, -1.0f);
        return this;
    }

    public b t(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f105836b = i10;
        }
        if (z10) {
            this.f105839e.h(solverVariable, 1.0f);
            this.f105839e.h(solverVariable2, -1.0f);
            this.f105839e.h(solverVariable3, -1.0f);
            return this;
        }
        this.f105839e.h(solverVariable, -1.0f);
        this.f105839e.h(solverVariable2, 1.0f);
        this.f105839e.h(solverVariable3, 1.0f);
        return this;
    }

    public String toString() {
        return F();
    }

    public b u(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f105836b = i10;
        }
        if (z10) {
            this.f105839e.h(solverVariable, 1.0f);
            this.f105839e.h(solverVariable2, -1.0f);
            this.f105839e.h(solverVariable3, 1.0f);
            return this;
        }
        this.f105839e.h(solverVariable, -1.0f);
        this.f105839e.h(solverVariable2, 1.0f);
        this.f105839e.h(solverVariable3, -1.0f);
        return this;
    }

    public b v(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        this.f105839e.h(solverVariable3, 0.5f);
        this.f105839e.h(solverVariable4, 0.5f);
        this.f105839e.h(solverVariable, -0.5f);
        this.f105839e.h(solverVariable2, -0.5f);
        this.f105836b = -f10;
        return this;
    }

    public void w() {
        float f10 = this.f105836b;
        if (f10 < 0.0f) {
            this.f105836b = f10 * (-1.0f);
            this.f105839e.l();
        }
    }

    public boolean x() {
        SolverVariable solverVariable = this.f105835a;
        if (solverVariable != null) {
            return solverVariable.f105809j == SolverVariable.Type.UNRESTRICTED || this.f105836b >= 0.0f;
        }
        return false;
    }

    public boolean y(SolverVariable solverVariable) {
        return this.f105839e.f(solverVariable);
    }

    public final boolean z(SolverVariable solverVariable, d dVar) {
        return solverVariable.f105812m <= 1;
    }

    public b(c cVar) {
        this.f105839e = new androidx.constraintlayout.core.a(this, cVar);
    }
}
