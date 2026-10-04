package q0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import p0.C5378b;
import p0.C5382f;
import s0.C5564f;
import s0.p;

/* JADX INFO: renamed from: q0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5417g extends AbstractC5412b {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f226654R = "KeyTrigger";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f226655S = "viewTransitionOnCross";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f226656T = "viewTransitionOnPositiveCross";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f226657U = "viewTransitionOnNegativeCross";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f226658V = "postLayout";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f226659W = "triggerSlack";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String f226660X = "triggerCollisionView";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f226661Y = "triggerCollisionId";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f226662Z = "triggerID";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f226663a0 = "positiveCross";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f226664b0 = "negativeCross";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f226665c0 = "triggerReceiver";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f226666d0 = "CROSS";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f226667e0 = 301;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f226668f0 = 302;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f226669g0 = 303;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f226670h0 = 304;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f226671i0 = 305;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f226672j0 = 306;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f226673k0 = 307;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f226674l0 = 308;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f226675m0 = 309;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f226676n0 = 310;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f226677o0 = 311;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f226678p0 = 312;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f226679q0 = 5;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f226680A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f226681B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f226682C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f226683D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f226684E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f226685F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f226686G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f226687H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f226688I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f226689J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f226690K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f226691L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f226692M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f226693N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f226694O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C5564f f226695P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C5564f f226696Q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226697y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f226698z = null;

    public C5417g() {
        int i10 = AbstractC5412b.f226543m;
        this.f226680A = i10;
        this.f226681B = null;
        this.f226682C = null;
        this.f226683D = i10;
        this.f226684E = i10;
        this.f226685F = 0.1f;
        this.f226686G = true;
        this.f226687H = true;
        this.f226688I = true;
        this.f226689J = Float.NaN;
        this.f226691L = false;
        this.f226692M = i10;
        this.f226693N = i10;
        this.f226694O = i10;
        this.f226695P = new C5564f();
        this.f226696Q = new C5564f();
        this.f226558k = 5;
        this.f226559l = new HashMap<>();
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean a(int i10, int i11) {
        if (i10 == 307) {
            this.f226684E = i11;
            return true;
        }
        if (i10 == 308) {
            this.f226683D = u(Integer.valueOf(i11));
            return true;
        }
        if (i10 == 311) {
            this.f226680A = i11;
            return true;
        }
        switch (i10) {
            case 301:
                this.f226694O = i11;
                return true;
            case 302:
                this.f226693N = i11;
                return true;
            case 303:
                this.f226692M = i11;
                return true;
            default:
                return super.a(i10, i11);
        }
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean b(int i10, float f10) {
        if (i10 != 305) {
            return false;
        }
        this.f226685F = f10;
        return true;
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean c(int i10, boolean z10) {
        if (i10 != 304) {
            return false;
        }
        this.f226691L = z10;
        return true;
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean d(int i10, String str) {
        if (i10 == 309) {
            this.f226682C = str;
            return true;
        }
        if (i10 == 310) {
            this.f226681B = str;
            return true;
        }
        if (i10 != 312) {
            return super.d(i10, str);
        }
        this.f226698z = str;
        return true;
    }

    @Override // s0.x
    public int e(String str) {
        str.getClass();
        switch (str) {
            case "positiveCross":
                return 309;
            case "viewTransitionOnPositiveCross":
                return 302;
            case "triggerCollisionId":
                return 307;
            case "triggerID":
                return 308;
            case "negativeCross":
                return 310;
            case "triggerCollisionView":
                return 306;
            case "viewTransitionOnNegativeCross":
                return 303;
            case "triggerSlack":
                return 305;
            case "viewTransitionOnCross":
                return 301;
            case "postLayout":
                return 304;
            case "triggerReceiver":
                return 311;
            default:
                return -1;
        }
    }

    @Override // q0.AbstractC5412b
    /* JADX INFO: renamed from: g */
    public AbstractC5412b clone() {
        C5417g c5417g = new C5417g();
        c5417g.h(this);
        return c5417g;
    }

    @Override // q0.AbstractC5412b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C5417g h(AbstractC5412b abstractC5412b) {
        super.h(abstractC5412b);
        C5417g c5417g = (C5417g) abstractC5412b;
        this.f226697y = c5417g.f226697y;
        this.f226698z = c5417g.f226698z;
        this.f226680A = c5417g.f226680A;
        this.f226681B = c5417g.f226681B;
        this.f226682C = c5417g.f226682C;
        this.f226683D = c5417g.f226683D;
        this.f226684E = c5417g.f226684E;
        this.f226685F = c5417g.f226685F;
        this.f226686G = c5417g.f226686G;
        this.f226687H = c5417g.f226687H;
        this.f226688I = c5417g.f226688I;
        this.f226689J = c5417g.f226689J;
        this.f226690K = c5417g.f226690K;
        this.f226691L = c5417g.f226691L;
        this.f226695P = c5417g.f226695P;
        this.f226696Q = c5417g.f226696Q;
        return this;
    }

    public final void x(String str, C5382f c5382f) {
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f226559l.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                C5378b c5378b = this.f226559l.get(str2);
                if (c5378b != null) {
                    c5378b.a(c5382f);
                }
            }
        }
    }

    @Override // q0.AbstractC5412b
    public void f(HashMap<String, p> map) {
    }

    @Override // q0.AbstractC5412b
    public void i(HashSet<String> hashSet) {
    }

    public void v(float f10, C5382f c5382f) {
    }
}
