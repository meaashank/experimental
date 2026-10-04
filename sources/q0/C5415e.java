package q0;

import androidx.compose.ui.graphics.colorspace.C2016d;
import java.util.HashMap;
import java.util.HashSet;
import p0.C5382f;
import s0.C;
import s0.C5564f;
import s0.p;

/* JADX INFO: renamed from: q0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5415e extends AbstractC5412b {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f226614L = "KeyPosition";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final float f226615M = 20.0f;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f226616N = 2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f226617O = 1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f226618P = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f226619Q = 2;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f226620A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f226621B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f226622C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f226623D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f226624E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f226625F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f226626G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f226627H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f226628I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f226629J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f226630K;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226631y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f226632z;

    public C5415e() {
        int i10 = AbstractC5412b.f226543m;
        this.f226631y = i10;
        this.f226632z = null;
        this.f226620A = i10;
        this.f226621B = 0;
        this.f226622C = Float.NaN;
        this.f226623D = Float.NaN;
        this.f226624E = Float.NaN;
        this.f226625F = Float.NaN;
        this.f226626G = Float.NaN;
        this.f226627H = Float.NaN;
        this.f226628I = 0;
        this.f226629J = Float.NaN;
        this.f226630K = Float.NaN;
        this.f226558k = 2;
    }

    public float A() {
        return this.f226630K;
    }

    public boolean B(int i10, int i11, C5564f c5564f, C5564f c5564f2, float f10, float f11) {
        x(i10, i11, c5564f.a(), c5564f.b(), c5564f2.a(), c5564f2.b());
        return Math.abs(f10 - this.f226629J) < 20.0f && Math.abs(f11 - this.f226630K) < 20.0f;
    }

    public void C(C5382f c5382f, C5564f c5564f, C5564f c5564f2, float f10, float f11, String[] strArr, float[] fArr) {
        int i10 = this.f226628I;
        if (i10 == 1) {
            E(c5564f, c5564f2, f10, f11, strArr, fArr);
        } else if (i10 != 2) {
            D(c5564f, c5564f2, f10, f11, strArr, fArr);
        } else {
            F(c5382f, c5564f, c5564f2, f10, f11, strArr, fArr);
        }
    }

    public void D(C5564f c5564f, C5564f c5564f2, float f10, float f11, String[] strArr, float[] fArr) {
        float fA = c5564f.a();
        float fB = c5564f.b();
        float fA2 = c5564f2.a() - fA;
        float fB2 = c5564f2.b() - fB;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f10 - fA) / fA2;
            strArr[1] = "percentY";
            fArr[1] = (f11 - fB) / fB2;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = (f10 - fA) / fA2;
            fArr[1] = (f11 - fB) / fB2;
        } else {
            fArr[1] = (f10 - fA) / fA2;
            fArr[0] = (f11 - fB) / fB2;
        }
    }

    public void E(C5564f c5564f, C5564f c5564f2, float f10, float f11, String[] strArr, float[] fArr) {
        float fA = c5564f.a();
        float fB = c5564f.b();
        float fA2 = c5564f2.a() - fA;
        float fB2 = c5564f2.b() - fB;
        float fHypot = (float) Math.hypot(fA2, fB2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f12 = fA2 / fHypot;
        float f13 = fB2 / fHypot;
        float f14 = f11 - fB;
        float f15 = f10 - fA;
        float fA3 = C2016d.a(f15, f13, f12 * f14, fHypot);
        float f16 = ((f13 * f14) + (f12 * f15)) / fHypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f16;
                fArr[1] = fA3;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f16;
        fArr[1] = fA3;
    }

    public void F(C5382f c5382f, C5564f c5564f, C5564f c5564f2, float f10, float f11, String[] strArr, float[] fArr) {
        c5564f.getClass();
        c5564f2.getClass();
        c5382f.getClass();
        throw null;
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f226555h = i11;
            return true;
        }
        if (i10 == 508) {
            this.f226631y = i11;
            return true;
        }
        if (i10 != 510) {
            return super.a(i10, i11);
        }
        this.f226628I = i11;
        return true;
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean b(int i10, float f10) {
        switch (i10) {
            case 503:
                this.f226622C = f10;
                return true;
            case 504:
                this.f226623D = f10;
                return true;
            case 505:
                this.f226622C = f10;
                this.f226623D = f10;
                return true;
            case 506:
                this.f226624E = f10;
                return true;
            case 507:
                this.f226625F = f10;
                return true;
            default:
                return false;
        }
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean d(int i10, String str) {
        if (i10 != 501) {
            return super.d(i10, str);
        }
        this.f226632z = str.toString();
        return true;
    }

    @Override // s0.x
    public int e(String str) {
        return C.a(str);
    }

    @Override // q0.AbstractC5412b
    /* JADX INFO: renamed from: g */
    public AbstractC5412b clone() {
        C5415e c5415e = new C5415e();
        c5415e.h(this);
        return c5415e;
    }

    @Override // q0.AbstractC5412b
    public AbstractC5412b h(AbstractC5412b abstractC5412b) {
        super.h(abstractC5412b);
        C5415e c5415e = (C5415e) abstractC5412b;
        this.f226632z = c5415e.f226632z;
        this.f226620A = c5415e.f226620A;
        this.f226621B = c5415e.f226621B;
        this.f226622C = c5415e.f226622C;
        this.f226623D = Float.NaN;
        this.f226624E = c5415e.f226624E;
        this.f226625F = c5415e.f226625F;
        this.f226626G = c5415e.f226626G;
        this.f226627H = c5415e.f226627H;
        this.f226629J = c5415e.f226629J;
        this.f226630K = c5415e.f226630K;
        return this;
    }

    public final void v(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = Float.isNaN(this.f226624E) ? 0.0f : this.f226624E;
        float f17 = Float.isNaN(this.f226627H) ? 0.0f : this.f226627H;
        float f18 = Float.isNaN(this.f226625F) ? 0.0f : this.f226625F;
        this.f226629J = (int) (((Float.isNaN(this.f226626G) ? 0.0f : this.f226626G) * f15) + (f16 * f14) + f10);
        this.f226630K = (int) ((f15 * f18) + (f14 * f17) + f11);
    }

    public final void w(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = this.f226624E;
        float f17 = (f14 * f16) + f10;
        float f18 = this.f226625F;
        this.f226629J = ((-f15) * f18) + f17;
        this.f226630K = (f14 * f18) + (f15 * f16) + f11;
    }

    public void x(int i10, int i11, float f10, float f11, float f12, float f13) {
        int i12 = this.f226628I;
        if (i12 == 1) {
            w(f10, f11, f12, f13);
        } else if (i12 != 2) {
            v(f10, f11, f12, f13);
        } else {
            y(i10, i11);
        }
    }

    public final void y(int i10, int i11) {
        float f10 = this.f226624E;
        float f11 = 0;
        this.f226629J = (i10 * f10) + f11;
        this.f226630K = (i11 * f10) + f11;
    }

    public float z() {
        return this.f226629J;
    }

    @Override // q0.AbstractC5412b
    public void f(HashMap<String, p> map) {
    }

    @Override // q0.AbstractC5412b
    public void i(HashSet<String> hashSet) {
    }
}
