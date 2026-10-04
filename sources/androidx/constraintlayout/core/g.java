package androidx.constraintlayout.core;

import C4.q;
import androidx.compose.runtime.changelist.j;
import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f105893n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final boolean f105894o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static float f105895p = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105896a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f105897b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f105898c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f105899d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f105900e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f105901f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f105902g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f105903h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f105904i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f105905j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f105906k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f105907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f105908m;

    public g(b bVar, c cVar) {
        this.f105907l = bVar;
        this.f105908m = cVar;
        clear();
    }

    public final void a(SolverVariable solverVariable, int i10) {
        int[] iArr;
        int i11 = solverVariable.f105802c % this.f105898c;
        int[] iArr2 = this.f105899d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f105900e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f105900e[i10] = -1;
    }

    public final void b(int i10, SolverVariable solverVariable, float f10) {
        this.f105901f[i10] = solverVariable.f105802c;
        this.f105902g[i10] = f10;
        this.f105903h[i10] = -1;
        this.f105904i[i10] = -1;
        solverVariable.a(this.f105907l);
        solverVariable.f105812m++;
        this.f105905j++;
    }

    public final void c() {
        for (int i10 = 0; i10 < this.f105898c; i10++) {
            if (this.f105899d[i10] != -1) {
                String string = hashCode() + " hash [" + i10 + "] => ";
                int i11 = this.f105899d[i10];
                boolean z10 = false;
                while (!z10) {
                    StringBuilder sbA = android.support.v4.media.f.a(string, q.f17581a);
                    sbA.append(this.f105901f[i11]);
                    string = sbA.toString();
                    int i12 = this.f105900e[i11];
                    if (i12 != -1) {
                        i11 = i12;
                    } else {
                        z10 = true;
                    }
                }
                System.out.println(string);
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void clear() {
        int i10 = this.f105905j;
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable solverVariableG = g(i11);
            if (solverVariableG != null) {
                solverVariableG.g(this.f105907l);
            }
        }
        for (int i12 = 0; i12 < this.f105897b; i12++) {
            this.f105901f[i12] = -1;
            this.f105900e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f105898c; i13++) {
            this.f105899d[i13] = -1;
        }
        this.f105905j = 0;
        this.f105906k = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int d() {
        return this.f105905j;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e(SolverVariable solverVariable) {
        if (this.f105905j != 0 && solverVariable != null) {
            int i10 = solverVariable.f105802c;
            int i11 = this.f105899d[i10 % this.f105898c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f105901f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f105900e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f105901f[i11] != i10);
            if (i11 != -1 && this.f105901f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean f(SolverVariable solverVariable) {
        return e(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable g(int i10) {
        int i11 = this.f105905j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f105906k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f105908m.f105844d[this.f105901f[i12]];
            }
            i12 = this.f105904i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void h(SolverVariable solverVariable, float f10) {
        float f11 = f105895p;
        if (f10 > (-f11) && f10 < f11) {
            m(solverVariable, true);
            return;
        }
        if (this.f105905j == 0) {
            b(0, solverVariable, f10);
            a(solverVariable, 0);
            this.f105906k = 0;
            return;
        }
        int iE = e(solverVariable);
        if (iE != -1) {
            this.f105902g[iE] = f10;
            return;
        }
        if (this.f105905j + 1 >= this.f105897b) {
            s();
        }
        int i10 = this.f105905j;
        int i11 = this.f105906k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f105901f[i11];
            int i15 = solverVariable.f105802c;
            if (i14 == i15) {
                this.f105902g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f105904i[i11];
            if (i11 == -1) {
                break;
            }
        }
        t(i12, solverVariable, f10);
    }

    @Override // androidx.constraintlayout.core.b.a
    public float i(SolverVariable solverVariable) {
        int iE = e(solverVariable);
        if (iE != -1) {
            return this.f105902g[iE];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void j(float f10) {
        int i10 = this.f105905j;
        int i11 = this.f105906k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f105902g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f105904i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(SolverVariable solverVariable, float f10, boolean z10) {
        float f11 = f105895p;
        if (f10 <= (-f11) || f10 >= f11) {
            int iE = e(solverVariable);
            if (iE == -1) {
                h(solverVariable, f10);
                return;
            }
            float[] fArr = this.f105902g;
            float f12 = fArr[iE] + f10;
            fArr[iE] = f12;
            float f13 = f105895p;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iE] = 0.0f;
            m(solverVariable, z10);
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void l() {
        int i10 = this.f105905j;
        int i11 = this.f105906k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f105902g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f105904i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float m(SolverVariable solverVariable, boolean z10) {
        int iE = e(solverVariable);
        if (iE == -1) {
            return 0.0f;
        }
        u(solverVariable);
        float f10 = this.f105902g[iE];
        if (this.f105906k == iE) {
            this.f105906k = this.f105904i[iE];
        }
        this.f105901f[iE] = -1;
        int[] iArr = this.f105903h;
        int i10 = iArr[iE];
        if (i10 != -1) {
            int[] iArr2 = this.f105904i;
            iArr2[i10] = iArr2[iE];
        }
        int i11 = this.f105904i[iE];
        if (i11 != -1) {
            iArr[i11] = iArr[iE];
        }
        this.f105905j--;
        solverVariable.f105812m--;
        if (z10) {
            solverVariable.g(this.f105907l);
        }
        return f10;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int n() {
        return 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void o() {
        int i10 = this.f105905j;
        System.out.print("{ ");
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable solverVariableG = g(i11);
            if (solverVariableG != null) {
                System.out.print(solverVariableG + " = " + q(i11) + q.f17581a);
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.b.a
    public float p(b bVar, boolean z10) {
        float fI = i(bVar.f105835a);
        m(bVar.f105835a, z10);
        g gVar = (g) bVar.f105839e;
        int iD = gVar.d();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iD) {
            int i12 = gVar.f105901f[i11];
            if (i12 != -1) {
                k(this.f105908m.f105844d[i12], gVar.f105902g[i11] * fI, z10);
                i10++;
            }
            i11++;
        }
        return fI;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float q(int i10) {
        int i11 = this.f105905j;
        int i12 = this.f105906k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f105902g[i12];
            }
            i12 = this.f105904i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public final int r() {
        for (int i10 = 0; i10 < this.f105897b; i10++) {
            if (this.f105901f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        int i10 = this.f105897b * 2;
        this.f105901f = Arrays.copyOf(this.f105901f, i10);
        this.f105902g = Arrays.copyOf(this.f105902g, i10);
        this.f105903h = Arrays.copyOf(this.f105903h, i10);
        this.f105904i = Arrays.copyOf(this.f105904i, i10);
        this.f105900e = Arrays.copyOf(this.f105900e, i10);
        for (int i11 = this.f105897b; i11 < i10; i11++) {
            this.f105901f[i11] = -1;
            this.f105900e[i11] = -1;
        }
        this.f105897b = i10;
    }

    public final void t(int i10, SolverVariable solverVariable, float f10) {
        int iR = r();
        b(iR, solverVariable, f10);
        if (i10 != -1) {
            this.f105903h[iR] = i10;
            int[] iArr = this.f105904i;
            iArr[iR] = iArr[i10];
            iArr[i10] = iR;
        } else {
            this.f105903h[iR] = -1;
            if (this.f105905j > 0) {
                this.f105904i[iR] = this.f105906k;
                this.f105906k = iR;
            } else {
                this.f105904i[iR] = -1;
            }
        }
        int i11 = this.f105904i[iR];
        if (i11 != -1) {
            this.f105903h[i11] = iR;
        }
        a(solverVariable, iR);
    }

    public String toString() {
        String strA;
        String strA2;
        String strA3 = hashCode() + " { ";
        int i10 = this.f105905j;
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable solverVariableG = g(i11);
            if (solverVariableG != null) {
                String str = strA3 + solverVariableG + " = " + q(i11) + q.f17581a;
                int iE = e(solverVariableG);
                String strA4 = j.a(str, "[p: ");
                if (this.f105903h[iE] != -1) {
                    StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strA4);
                    sbA.append(this.f105908m.f105844d[this.f105901f[this.f105903h[iE]]]);
                    strA = sbA.toString();
                } else {
                    strA = j.a(strA4, "none");
                }
                String strA5 = j.a(strA, ", n: ");
                if (this.f105904i[iE] != -1) {
                    StringBuilder sbA2 = androidx.compose.runtime.changelist.a.a(strA5);
                    sbA2.append(this.f105908m.f105844d[this.f105901f[this.f105904i[iE]]]);
                    strA2 = sbA2.toString();
                } else {
                    strA2 = j.a(strA5, "none");
                }
                strA3 = j.a(strA2, "]");
            }
        }
        return j.a(strA3, " }");
    }

    public final void u(SolverVariable solverVariable) {
        int[] iArr;
        int i10;
        int i11 = solverVariable.f105802c;
        int i12 = i11 % this.f105898c;
        int[] iArr2 = this.f105899d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f105901f[i13] == i11) {
            int[] iArr3 = this.f105900e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f105900e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f105901f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f105901f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }
}
