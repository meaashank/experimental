package androidx.constraintlayout.core;

import androidx.compose.runtime.changelist.j;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f105783A = 7;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f105784B = 8;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static int f105785C = 1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static int f105786D = 1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static int f105787E = 1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static int f105788F = 1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static int f105789G = 1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f105790H = 9;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f105791r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f105792s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f105793t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f105794u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f105795v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f105796w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f105797x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f105798y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f105799z = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f105800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f105801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f105802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f105804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f105805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f105806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f105807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f105808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Type f105809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b[] f105810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f105811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f105812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f105813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f105814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f105815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet<b> f105816q;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105817a;

        static {
            int[] iArr = new int[Type.values().length];
            f105817a = iArr;
            try {
                iArr[Type.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105817a[Type.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105817a[Type.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105817a[Type.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105817a[Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SolverVariable(String str, Type type) {
        this.f105802c = -1;
        this.f105803d = -1;
        this.f105804e = 0;
        this.f105806g = false;
        this.f105807h = new float[9];
        this.f105808i = new float[9];
        this.f105810k = new b[16];
        this.f105811l = 0;
        this.f105812m = 0;
        this.f105813n = false;
        this.f105814o = -1;
        this.f105815p = 0.0f;
        this.f105816q = null;
        this.f105801b = str;
        this.f105809j = type;
    }

    public static String e(Type type, String str) {
        if (str != null) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(str);
            sbA.append(f105786D);
            return sbA.toString();
        }
        int i10 = a.f105817a[type.ordinal()];
        if (i10 == 1) {
            StringBuilder sb2 = new StringBuilder("U");
            int i11 = f105787E + 1;
            f105787E = i11;
            sb2.append(i11);
            return sb2.toString();
        }
        if (i10 == 2) {
            StringBuilder sb3 = new StringBuilder("C");
            int i12 = f105788F + 1;
            f105788F = i12;
            sb3.append(i12);
            return sb3.toString();
        }
        if (i10 == 3) {
            StringBuilder sb4 = new StringBuilder(t1.b.f238816R4);
            int i13 = f105785C + 1;
            f105785C = i13;
            sb4.append(i13);
            return sb4.toString();
        }
        if (i10 == 4) {
            StringBuilder sb5 = new StringBuilder("e");
            int i14 = f105786D + 1;
            f105786D = i14;
            sb5.append(i14);
            return sb5.toString();
        }
        if (i10 != 5) {
            throw new AssertionError(type.name());
        }
        StringBuilder sb6 = new StringBuilder(t1.b.f238870X4);
        int i15 = f105789G + 1;
        f105789G = i15;
        sb6.append(i15);
        return sb6.toString();
    }

    public static void f() {
        f105786D++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f105811l;
            if (i10 >= i11) {
                b[] bVarArr = this.f105810k;
                if (i11 >= bVarArr.length) {
                    this.f105810k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f105810k;
                int i12 = this.f105811l;
                bVarArr2[i12] = bVar;
                this.f105811l = i12 + 1;
                return;
            }
            if (this.f105810k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public void b() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f105807h[i10] = 0.0f;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(SolverVariable solverVariable) {
        return this.f105802c - solverVariable.f105802c;
    }

    public String d() {
        return this.f105801b;
    }

    public final void g(b bVar) {
        int i10 = this.f105811l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f105810k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f105810k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f105811l--;
                return;
            }
            i11++;
        }
    }

    public void h() {
        this.f105801b = null;
        this.f105809j = Type.UNKNOWN;
        this.f105804e = 0;
        this.f105802c = -1;
        this.f105803d = -1;
        this.f105805f = 0.0f;
        this.f105806g = false;
        this.f105813n = false;
        this.f105814o = -1;
        this.f105815p = 0.0f;
        int i10 = this.f105811l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f105810k[i11] = null;
        }
        this.f105811l = 0;
        this.f105812m = 0;
        this.f105800a = false;
        Arrays.fill(this.f105808i, 0.0f);
    }

    public void i(d dVar, float f10) {
        this.f105805f = f10;
        this.f105806g = true;
        this.f105813n = false;
        this.f105814o = -1;
        this.f105815p = 0.0f;
        int i10 = this.f105811l;
        this.f105803d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f105810k[i11].a(dVar, this, false);
        }
        this.f105811l = 0;
    }

    public void j(String str) {
        this.f105801b = str;
    }

    public void k(d dVar, SolverVariable solverVariable, float f10) {
        this.f105813n = true;
        this.f105814o = solverVariable.f105802c;
        this.f105815p = f10;
        int i10 = this.f105811l;
        this.f105803d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f105810k[i11].G(dVar, this, false);
        }
        this.f105811l = 0;
        dVar.z();
    }

    public void l(Type type, String str) {
        this.f105809j = type;
    }

    public String m() {
        String strA = this + "[";
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (i10 < this.f105807h.length) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strA);
            sbA.append(this.f105807h[i10]);
            String string = sbA.toString();
            float[] fArr = this.f105807h;
            float f10 = fArr[i10];
            if (f10 > 0.0f) {
                z10 = false;
            } else if (f10 < 0.0f) {
                z10 = true;
            }
            if (f10 != 0.0f) {
                z11 = false;
            }
            strA = i10 < fArr.length - 1 ? j.a(string, U6.j.f68738d) : j.a(string, "] ");
            i10++;
        }
        if (z10) {
            strA = j.a(strA, " (-)");
        }
        return z11 ? j.a(strA, " (*)") : strA;
    }

    public final void n(d dVar, b bVar) {
        int i10 = this.f105811l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f105810k[i11].b(dVar, bVar, false);
        }
        this.f105811l = 0;
    }

    public String toString() {
        if (this.f105801b != null) {
            return "" + this.f105801b;
        }
        return "" + this.f105802c;
    }

    public SolverVariable(Type type, String str) {
        this.f105802c = -1;
        this.f105803d = -1;
        this.f105804e = 0;
        this.f105806g = false;
        this.f105807h = new float[9];
        this.f105808i = new float[9];
        this.f105810k = new b[16];
        this.f105811l = 0;
        this.f105812m = 0;
        this.f105813n = false;
        this.f105814o = -1;
        this.f105815p = 0.0f;
        this.f105816q = null;
        this.f105809j = type;
    }
}
