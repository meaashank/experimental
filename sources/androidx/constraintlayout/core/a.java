package androidx.constraintlayout.core;

import C4.q;
import androidx.compose.runtime.changelist.j;
import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f105818l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f105819m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f105820n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static float f105821o = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f105823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f105824c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105822a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105825d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SolverVariable f105826e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f105827f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f105828g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f105829h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f105830i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f105831j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f105832k = false;

    public a(b bVar, c cVar) {
        this.f105823b = bVar;
        this.f105824c = cVar;
    }

    public int a() {
        return this.f105830i;
    }

    public final int b(int i10) {
        return this.f105827f[i10];
    }

    public final int c(int i10) {
        return this.f105828g[i10];
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i10 = this.f105830i;
        for (int i11 = 0; i10 != -1 && i11 < this.f105822a; i11++) {
            SolverVariable solverVariable = this.f105824c.f105844d[this.f105827f[i10]];
            if (solverVariable != null) {
                solverVariable.g(this.f105823b);
            }
            i10 = this.f105828g[i10];
        }
        this.f105830i = -1;
        this.f105831j = -1;
        this.f105832k = false;
        this.f105822a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int d() {
        return this.f105822a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e(SolverVariable solverVariable) {
        int i10 = this.f105830i;
        if (i10 == -1) {
            return -1;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f105822a; i11++) {
            if (this.f105827f[i10] == solverVariable.f105802c) {
                return i10;
            }
            i10 = this.f105828g[i10];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean f(SolverVariable solverVariable) {
        int i10 = this.f105830i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f105822a; i11++) {
            if (this.f105827f[i10] == solverVariable.f105802c) {
                return true;
            }
            i10 = this.f105828g[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable g(int i10) {
        int i11 = this.f105830i;
        for (int i12 = 0; i11 != -1 && i12 < this.f105822a; i12++) {
            if (i12 == i10) {
                return this.f105824c.f105844d[this.f105827f[i11]];
            }
            i11 = this.f105828g[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void h(SolverVariable solverVariable, float f10) {
        if (f10 == 0.0f) {
            m(solverVariable, true);
            return;
        }
        int i10 = this.f105830i;
        if (i10 == -1) {
            this.f105830i = 0;
            this.f105829h[0] = f10;
            this.f105827f[0] = solverVariable.f105802c;
            this.f105828g[0] = -1;
            solverVariable.f105812m++;
            solverVariable.a(this.f105823b);
            this.f105822a++;
            if (this.f105832k) {
                return;
            }
            int i11 = this.f105831j + 1;
            this.f105831j = i11;
            int[] iArr = this.f105827f;
            if (i11 >= iArr.length) {
                this.f105832k = true;
                this.f105831j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f105822a; i13++) {
            int i14 = this.f105827f[i10];
            int i15 = solverVariable.f105802c;
            if (i14 == i15) {
                this.f105829h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f105828g[i10];
        }
        int length = this.f105831j;
        int i16 = length + 1;
        if (this.f105832k) {
            int[] iArr2 = this.f105827f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f105827f;
        if (length >= iArr3.length && this.f105822a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f105827f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f105827f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f105825d * 2;
            this.f105825d = i18;
            this.f105832k = false;
            this.f105831j = length - 1;
            this.f105829h = Arrays.copyOf(this.f105829h, i18);
            this.f105827f = Arrays.copyOf(this.f105827f, this.f105825d);
            this.f105828g = Arrays.copyOf(this.f105828g, this.f105825d);
        }
        this.f105827f[length] = solverVariable.f105802c;
        this.f105829h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f105828g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f105828g[length] = this.f105830i;
            this.f105830i = length;
        }
        solverVariable.f105812m++;
        solverVariable.a(this.f105823b);
        int i19 = this.f105822a + 1;
        this.f105822a = i19;
        if (!this.f105832k) {
            this.f105831j++;
        }
        int[] iArr7 = this.f105827f;
        if (i19 >= iArr7.length) {
            this.f105832k = true;
        }
        if (this.f105831j >= iArr7.length) {
            this.f105832k = true;
            this.f105831j = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float i(SolverVariable solverVariable) {
        int i10 = this.f105830i;
        for (int i11 = 0; i10 != -1 && i11 < this.f105822a; i11++) {
            if (this.f105827f[i10] == solverVariable.f105802c) {
                return this.f105829h[i10];
            }
            i10 = this.f105828g[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void j(float f10) {
        int i10 = this.f105830i;
        for (int i11 = 0; i10 != -1 && i11 < this.f105822a; i11++) {
            float[] fArr = this.f105829h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f105828g[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(SolverVariable solverVariable, float f10, boolean z10) {
        float f11 = f105821o;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f105830i;
            if (i10 == -1) {
                this.f105830i = 0;
                this.f105829h[0] = f10;
                this.f105827f[0] = solverVariable.f105802c;
                this.f105828g[0] = -1;
                solverVariable.f105812m++;
                solverVariable.a(this.f105823b);
                this.f105822a++;
                if (this.f105832k) {
                    return;
                }
                int i11 = this.f105831j + 1;
                this.f105831j = i11;
                int[] iArr = this.f105827f;
                if (i11 >= iArr.length) {
                    this.f105832k = true;
                    this.f105831j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f105822a; i13++) {
                int i14 = this.f105827f[i10];
                int i15 = solverVariable.f105802c;
                if (i14 == i15) {
                    float[] fArr = this.f105829h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f105821o;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f105830i) {
                            this.f105830i = this.f105828g[i10];
                        } else {
                            int[] iArr2 = this.f105828g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            solverVariable.g(this.f105823b);
                        }
                        if (this.f105832k) {
                            this.f105831j = i10;
                        }
                        solverVariable.f105812m--;
                        this.f105822a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f105828g[i10];
            }
            int length = this.f105831j;
            int i16 = length + 1;
            if (this.f105832k) {
                int[] iArr3 = this.f105827f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f105827f;
            if (length >= iArr4.length && this.f105822a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f105827f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f105827f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f105825d * 2;
                this.f105825d = i18;
                this.f105832k = false;
                this.f105831j = length - 1;
                this.f105829h = Arrays.copyOf(this.f105829h, i18);
                this.f105827f = Arrays.copyOf(this.f105827f, this.f105825d);
                this.f105828g = Arrays.copyOf(this.f105828g, this.f105825d);
            }
            this.f105827f[length] = solverVariable.f105802c;
            this.f105829h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f105828g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f105828g[length] = this.f105830i;
                this.f105830i = length;
            }
            solverVariable.f105812m++;
            solverVariable.a(this.f105823b);
            this.f105822a++;
            if (!this.f105832k) {
                this.f105831j++;
            }
            int i19 = this.f105831j;
            int[] iArr8 = this.f105827f;
            if (i19 >= iArr8.length) {
                this.f105832k = true;
                this.f105831j = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void l() {
        int i10 = this.f105830i;
        for (int i11 = 0; i10 != -1 && i11 < this.f105822a; i11++) {
            float[] fArr = this.f105829h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f105828g[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float m(SolverVariable solverVariable, boolean z10) {
        if (this.f105826e == solverVariable) {
            this.f105826e = null;
        }
        int i10 = this.f105830i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f105822a) {
            if (this.f105827f[i10] == solverVariable.f105802c) {
                if (i10 == this.f105830i) {
                    this.f105830i = this.f105828g[i10];
                } else {
                    int[] iArr = this.f105828g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    solverVariable.g(this.f105823b);
                }
                solverVariable.f105812m--;
                this.f105822a--;
                this.f105827f[i10] = -1;
                if (this.f105832k) {
                    this.f105831j = i10;
                }
                return this.f105829h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f105828g[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int n() {
        return (this.f105827f.length * 12) + 36;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void o() {
        int i10 = this.f105822a;
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
        b.a aVar = bVar.f105839e;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            SolverVariable solverVariableG = aVar.g(i10);
            k(solverVariableG, aVar.i(solverVariableG) * fI, z10);
        }
        return fI;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float q(int i10) {
        int i11 = this.f105830i;
        for (int i12 = 0; i11 != -1 && i12 < this.f105822a; i12++) {
            if (i12 == i10) {
                return this.f105829h[i11];
            }
            i11 = this.f105828g[i11];
        }
        return 0.0f;
    }

    public SolverVariable r() {
        SolverVariable solverVariable = this.f105826e;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i10 = this.f105830i;
        SolverVariable solverVariable2 = null;
        for (int i11 = 0; i10 != -1 && i11 < this.f105822a; i11++) {
            if (this.f105829h[i10] < 0.0f) {
                SolverVariable solverVariable3 = this.f105824c.f105844d[this.f105827f[i10]];
                if (solverVariable2 == null || solverVariable2.f105804e < solverVariable3.f105804e) {
                    solverVariable2 = solverVariable3;
                }
            }
            i10 = this.f105828g[i10];
        }
        return solverVariable2;
    }

    public final float s(int i10) {
        return this.f105829h[i10];
    }

    public boolean t() {
        int i10 = this.f105830i;
        for (int i11 = 0; i10 != -1 && i11 < this.f105822a; i11++) {
            if (this.f105829h[i10] > 0.0f) {
                return true;
            }
            i10 = this.f105828g[i10];
        }
        return false;
    }

    public String toString() {
        int i10 = this.f105830i;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f105822a; i11++) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(j.a(string, " -> "));
            sbA.append(this.f105829h[i10]);
            sbA.append(" : ");
            StringBuilder sbA2 = androidx.compose.runtime.changelist.a.a(sbA.toString());
            sbA2.append(this.f105824c.f105844d[this.f105827f[i10]]);
            string = sbA2.toString();
            i10 = this.f105828g[i10];
        }
        return string;
    }
}
