package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import u0.C5636d;

/* JADX INFO: loaded from: classes.dex */
public class d extends C5636d {

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final int f106377g2 = 8;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final boolean f106378h2 = false;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final boolean f106379i2 = false;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final boolean f106380j2 = false;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static int f106381k2;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.b f106382B1;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.e f106383C1;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public int f106384D1;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public b.InterfaceC0270b f106385E1;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public boolean f106386F1;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public o0.b f106387G1;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public androidx.constraintlayout.core.d f106388H1;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public int f106389I1;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public int f106390J1;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public int f106391K1;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public int f106392L1;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public int f106393M1;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public int f106394N1;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public c[] f106395O1;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public c[] f106396P1;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public boolean f106397Q1;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public boolean f106398R1;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public boolean f106399S1;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public int f106400T1;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public int f106401U1;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public int f106402V1;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public boolean f106403W1;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public boolean f106404X1;

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public boolean f106405Y1;

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    public int f106406Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f106407a2;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f106408b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f106409c2;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f106410d2;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public HashSet<ConstraintWidget> f106411e2;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public b.a f106412f2;

    public d() {
        this.f106382B1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.f106383C1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.f106385E1 = null;
        this.f106386F1 = false;
        this.f106388H1 = new androidx.constraintlayout.core.d();
        this.f106393M1 = 0;
        this.f106394N1 = 0;
        this.f106395O1 = new c[4];
        this.f106396P1 = new c[4];
        this.f106397Q1 = false;
        this.f106398R1 = false;
        this.f106399S1 = false;
        this.f106400T1 = 0;
        this.f106401U1 = 0;
        this.f106402V1 = 257;
        this.f106403W1 = false;
        this.f106404X1 = false;
        this.f106405Y1 = false;
        this.f106406Z1 = 0;
        this.f106407a2 = null;
        this.f106408b2 = null;
        this.f106409c2 = null;
        this.f106410d2 = null;
        this.f106411e2 = new HashSet<>();
        this.f106412f2 = new b.a();
    }

    public static boolean R2(int i10, ConstraintWidget constraintWidget, b.InterfaceC0270b interfaceC0270b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0270b == null) {
            return false;
        }
        if (constraintWidget.l0() == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.f106294e = 0;
            aVar.f106295f = 0;
            return false;
        }
        aVar.f106290a = constraintWidget.H();
        aVar.f106291b = constraintWidget.j0();
        aVar.f106292c = constraintWidget.m0();
        aVar.f106293d = constraintWidget.D();
        aVar.f106298i = false;
        aVar.f106299j = i11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f106290a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z10 = dimensionBehaviour == dimensionBehaviour2;
        boolean z11 = aVar.f106291b == dimensionBehaviour2;
        boolean z12 = z10 && constraintWidget.f106200f0 > 0.0f;
        boolean z13 = z11 && constraintWidget.f106200f0 > 0.0f;
        if (z10 && constraintWidget.r0(0) && constraintWidget.f106233w == 0 && !z12) {
            aVar.f106290a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z11 && constraintWidget.f106235x == 0) {
                aVar.f106290a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z10 = false;
        }
        if (z11 && constraintWidget.r0(1) && constraintWidget.f106235x == 0 && !z13) {
            aVar.f106291b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z10 && constraintWidget.f106233w == 0) {
                aVar.f106291b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z11 = false;
        }
        if (constraintWidget.G0()) {
            aVar.f106290a = ConstraintWidget.DimensionBehaviour.FIXED;
            z10 = false;
        }
        if (constraintWidget.H0()) {
            aVar.f106291b = ConstraintWidget.DimensionBehaviour.FIXED;
            z11 = false;
        }
        if (z12) {
            if (constraintWidget.f106237y[0] == 4) {
                aVar.f106290a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z11) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f106291b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i13 = aVar.f106293d;
                } else {
                    aVar.f106290a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0270b.b(constraintWidget, aVar);
                    i13 = aVar.f106295f;
                }
                aVar.f106290a = dimensionBehaviour4;
                aVar.f106292c = (int) (constraintWidget.A() * i13);
            }
        }
        if (z13) {
            if (constraintWidget.f106237y[1] == 4) {
                aVar.f106291b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z10) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f106290a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i12 = aVar.f106292c;
                } else {
                    aVar.f106291b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0270b.b(constraintWidget, aVar);
                    i12 = aVar.f106294e;
                }
                aVar.f106291b = dimensionBehaviour6;
                if (constraintWidget.B() == -1) {
                    aVar.f106293d = (int) (i12 / constraintWidget.A());
                } else {
                    aVar.f106293d = (int) (constraintWidget.A() * i12);
                }
            }
        }
        interfaceC0270b.b(constraintWidget, aVar);
        constraintWidget.c2(aVar.f106294e);
        constraintWidget.y1(aVar.f106295f);
        constraintWidget.x1(aVar.f106297h);
        constraintWidget.g1(aVar.f106296g);
        aVar.f106299j = b.a.f106287k;
        return aVar.f106298i;
    }

    public void A2() {
        this.f106383C1.f(H(), j0());
    }

    public boolean B2(boolean z10) {
        return this.f106383C1.g(z10);
    }

    public boolean C2(boolean z10) {
        this.f106383C1.h(z10);
        return true;
    }

    public boolean D2(boolean z10, int i10) {
        return this.f106383C1.i(z10, i10);
    }

    public void E2(o0.b bVar) {
        this.f106387G1 = bVar;
        this.f106388H1.F(bVar);
    }

    public ArrayList<f> F2() {
        ArrayList<f> arrayList = new ArrayList<>();
        int size = this.f239336A1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f239336A1.get(i10);
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                if (fVar.m2() == 0) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    public b.InterfaceC0270b G2() {
        return this.f106385E1;
    }

    public int H2() {
        return this.f106402V1;
    }

    public androidx.constraintlayout.core.d I2() {
        return this.f106388H1;
    }

    public ArrayList<f> J2() {
        ArrayList<f> arrayList = new ArrayList<>();
        int size = this.f239336A1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f239336A1.get(i10);
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                if (fVar.m2() == 1) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    public boolean K2() {
        return false;
    }

    public void L2() {
        this.f106383C1.o();
    }

    public void M2() {
        this.f106383C1.p();
    }

    public boolean N2() {
        return this.f106405Y1;
    }

    public boolean O2() {
        return this.f106386F1;
    }

    public boolean P2() {
        return this.f106404X1;
    }

    public long Q2(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f106389I1 = i17;
        this.f106390J1 = i18;
        this.f106382B1.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
        return 0L;
    }

    @Override // u0.C5636d, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void R0() {
        this.f106388H1.Y();
        this.f106389I1 = 0;
        this.f106391K1 = 0;
        this.f106390J1 = 0;
        this.f106392L1 = 0;
        this.f106403W1 = false;
        super.R0();
    }

    public boolean S2(int i10) {
        return (this.f106402V1 & i10) == i10;
    }

    public final void T2() {
        this.f106393M1 = 0;
        this.f106394N1 = 0;
    }

    public void U2(b.InterfaceC0270b interfaceC0270b) {
        this.f106385E1 = interfaceC0270b;
        this.f106383C1.u(interfaceC0270b);
    }

    public void V2(int i10) {
        this.f106402V1 = i10;
        androidx.constraintlayout.core.d.f105854v = S2(512);
    }

    public void W2(int i10, int i11, int i12, int i13) {
        this.f106389I1 = i10;
        this.f106390J1 = i11;
        this.f106391K1 = i12;
        this.f106392L1 = i13;
    }

    public void X2(int i10) {
        this.f106384D1 = i10;
    }

    public void Y2(boolean z10) {
        this.f106386F1 = z10;
    }

    public boolean Z2(androidx.constraintlayout.core.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zS2 = S2(64);
        j2(dVar, zS2);
        int size = this.f239336A1.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f239336A1.get(i10);
            constraintWidget.j2(dVar, zS2);
            if (constraintWidget.t0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void a3() {
        this.f106382B1.e(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void b0(StringBuilder sb2) {
        sb2.append(this.f106217o + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f106196d0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f106198e0);
        sb2.append("\n");
        ArrayList<ConstraintWidget> arrayListL2 = l2();
        int size = arrayListL2.size();
        int i10 = 0;
        while (i10 < size) {
            ConstraintWidget constraintWidget = arrayListL2.get(i10);
            i10++;
            constraintWidget.b0(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String f0() {
        return "ConstraintLayout";
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void i2(boolean z10, boolean z11) {
        super.i2(z10, z11);
        int size = this.f239336A1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f239336A1.get(i10).i2(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0240 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032d A[PHI: r13 r19
      0x032d: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:150:0x02e9, B:159:0x0312, B:160:0x0314, B:162:0x031a] A[DONT_GENERATE, DONT_INLINE]
      0x032d: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:150:0x02e9, B:159:0x0312, B:160:0x0314, B:162:0x031a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0334  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // u0.C5636d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n2() {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.n2():void");
    }

    public void q2(ConstraintWidget constraintWidget, int i10) {
        if (i10 == 0) {
            s2(constraintWidget);
        } else if (i10 == 1) {
            x2(constraintWidget);
        }
    }

    public boolean r2(androidx.constraintlayout.core.d dVar) {
        d dVar2;
        androidx.constraintlayout.core.d dVar3;
        boolean zS2 = S2(64);
        g(dVar, zS2);
        int size = this.f239336A1.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f239336A1.get(i10);
            constraintWidget.G1(0, false);
            constraintWidget.G1(1, false);
            if (constraintWidget instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget2 = this.f239336A1.get(i11);
                if (constraintWidget2 instanceof a) {
                    ((a) constraintWidget2).s2();
                }
            }
        }
        this.f106411e2.clear();
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget3 = this.f239336A1.get(i12);
            if (constraintWidget3.f()) {
                if (constraintWidget3 instanceof i) {
                    this.f106411e2.add(constraintWidget3);
                } else {
                    constraintWidget3.g(dVar, zS2);
                }
            }
        }
        while (this.f106411e2.size() > 0) {
            int size2 = this.f106411e2.size();
            Iterator<ConstraintWidget> it = this.f106411e2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i iVar = (i) it.next();
                if (iVar.o2(this.f106411e2)) {
                    iVar.g(dVar, zS2);
                    this.f106411e2.remove(iVar);
                    break;
                }
            }
            if (size2 == this.f106411e2.size()) {
                Iterator<ConstraintWidget> it2 = this.f106411e2.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, zS2);
                }
                this.f106411e2.clear();
            }
        }
        if (androidx.constraintlayout.core.d.f105854v) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget4 = this.f239336A1.get(i13);
                if (!constraintWidget4.f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            dVar2 = this;
            dVar3 = dVar;
            dVar2.e(this, dVar3, hashSet, H() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget5 : hashSet) {
                g.a(this, dVar3, constraintWidget5);
                constraintWidget5.g(dVar3, zS2);
            }
        } else {
            dVar2 = this;
            dVar3 = dVar;
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget6 = dVar2.f239336A1.get(i14);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f106192b0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.D1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.Y1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.g(dVar3, zS2);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.D1(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.Y1(dimensionBehaviour2);
                    }
                } else {
                    g.a(this, dVar3, constraintWidget6);
                    if (!constraintWidget6.f()) {
                        constraintWidget6.g(dVar3, zS2);
                    }
                }
            }
        }
        if (dVar2.f106393M1 > 0) {
            b.b(this, dVar3, null, 0);
        }
        if (dVar2.f106394N1 > 0) {
            b.b(this, dVar3, null, 1);
        }
        return true;
    }

    public final void s2(ConstraintWidget constraintWidget) {
        int i10 = this.f106393M1 + 1;
        c[] cVarArr = this.f106396P1;
        if (i10 >= cVarArr.length) {
            this.f106396P1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f106396P1[this.f106393M1] = new c(constraintWidget, 0, O2());
        this.f106393M1++;
    }

    public void t2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f106410d2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f106410d2.get().f()) {
            this.f106410d2 = new WeakReference<>(constraintAnchor);
        }
    }

    public void u2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f106408b2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f106408b2.get().f()) {
            this.f106408b2 = new WeakReference<>(constraintAnchor);
        }
    }

    public final void v2(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f106388H1.i(solverVariable, this.f106388H1.u(constraintAnchor), 0, 5);
    }

    public final void w2(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f106388H1.i(this.f106388H1.u(constraintAnchor), solverVariable, 0, 5);
    }

    public final void x2(ConstraintWidget constraintWidget) {
        int i10 = this.f106394N1 + 1;
        c[] cVarArr = this.f106395O1;
        if (i10 >= cVarArr.length) {
            this.f106395O1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f106395O1[this.f106394N1] = new c(constraintWidget, 1, O2());
        this.f106394N1++;
    }

    public void y2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f106409c2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f106409c2.get().f()) {
            this.f106409c2 = new WeakReference<>(constraintAnchor);
        }
    }

    public void z2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f106407a2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f106407a2.get().f()) {
            this.f106407a2 = new WeakReference<>(constraintAnchor);
        }
    }

    public d(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.f106382B1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.f106383C1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.f106385E1 = null;
        this.f106386F1 = false;
        this.f106388H1 = new androidx.constraintlayout.core.d();
        this.f106393M1 = 0;
        this.f106394N1 = 0;
        this.f106395O1 = new c[4];
        this.f106396P1 = new c[4];
        this.f106397Q1 = false;
        this.f106398R1 = false;
        this.f106399S1 = false;
        this.f106400T1 = 0;
        this.f106401U1 = 0;
        this.f106402V1 = 257;
        this.f106403W1 = false;
        this.f106404X1 = false;
        this.f106405Y1 = false;
        this.f106406Z1 = 0;
        this.f106407a2 = null;
        this.f106408b2 = null;
        this.f106409c2 = null;
        this.f106410d2 = null;
        this.f106411e2 = new HashSet<>();
        this.f106412f2 = new b.a();
    }

    public d(int i10, int i11) {
        super(i10, i11);
        this.f106382B1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.f106383C1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.f106385E1 = null;
        this.f106386F1 = false;
        this.f106388H1 = new androidx.constraintlayout.core.d();
        this.f106393M1 = 0;
        this.f106394N1 = 0;
        this.f106395O1 = new c[4];
        this.f106396P1 = new c[4];
        this.f106397Q1 = false;
        this.f106398R1 = false;
        this.f106399S1 = false;
        this.f106400T1 = 0;
        this.f106401U1 = 0;
        this.f106402V1 = 257;
        this.f106403W1 = false;
        this.f106404X1 = false;
        this.f106405Y1 = false;
        this.f106406Z1 = 0;
        this.f106407a2 = null;
        this.f106408b2 = null;
        this.f106409c2 = null;
        this.f106410d2 = null;
        this.f106411e2 = new HashSet<>();
        this.f106412f2 = new b.a();
    }

    public d(String str, int i10, int i11) {
        super(i10, i11);
        this.f106382B1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.f106383C1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.f106385E1 = null;
        this.f106386F1 = false;
        this.f106388H1 = new androidx.constraintlayout.core.d();
        this.f106393M1 = 0;
        this.f106394N1 = 0;
        this.f106395O1 = new c[4];
        this.f106396P1 = new c[4];
        this.f106397Q1 = false;
        this.f106398R1 = false;
        this.f106399S1 = false;
        this.f106400T1 = 0;
        this.f106401U1 = 0;
        this.f106402V1 = 257;
        this.f106403W1 = false;
        this.f106404X1 = false;
        this.f106405Y1 = false;
        this.f106406Z1 = 0;
        this.f106407a2 = null;
        this.f106408b2 = null;
        this.f106409c2 = null;
        this.f106410d2 = null;
        this.f106411e2 = new HashSet<>();
        this.f106412f2 = new b.a();
        j1(str);
    }
}
