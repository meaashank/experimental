package s0;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f237958g = "VelocityMatrix";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f237959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f237960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f237961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f237962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f237963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f237964f;

    public void a(float f10, float f11, int i10, int i11, float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f10 - 0.5f) * 2.0f;
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f12 + this.f237961c;
        float f17 = f13 + this.f237962d;
        float f18 = (this.f237959a * f14) + f16;
        float f19 = (this.f237960b * f15) + f17;
        float radians = (float) Math.toRadians(this.f237964f);
        float radians2 = (float) Math.toRadians(this.f237963e);
        double d10 = radians;
        double d11 = i11 * f15;
        float fSin = (((float) ((Math.sin(d10) * ((double) ((-i10) * f14))) - (Math.cos(d10) * d11))) * radians2) + f18;
        float fCos = (radians2 * ((float) ((Math.cos(d10) * ((double) (i10 * f14))) - (Math.sin(d10) * d11)))) + f19;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void b() {
        this.f237963e = 0.0f;
        this.f237962d = 0.0f;
        this.f237961c = 0.0f;
        this.f237960b = 0.0f;
        this.f237959a = 0.0f;
    }

    public void c(i iVar, float f10) {
        if (iVar != null) {
            this.f237963e = iVar.c(f10);
        }
    }

    public void d(p pVar, float f10) {
        if (pVar != null) {
            this.f237963e = pVar.c(f10);
            this.f237964f = pVar.a(f10);
        }
    }

    public void e(i iVar, i iVar2, float f10) {
        if (iVar != null) {
            this.f237959a = iVar.c(f10);
        }
        if (iVar2 != null) {
            this.f237960b = iVar2.c(f10);
        }
    }

    public void f(p pVar, p pVar2, float f10) {
        if (pVar != null) {
            this.f237959a = pVar.c(f10);
        }
        if (pVar2 != null) {
            this.f237960b = pVar2.c(f10);
        }
    }

    public void g(i iVar, i iVar2, float f10) {
        if (iVar != null) {
            this.f237961c = iVar.c(f10);
        }
        if (iVar2 != null) {
            this.f237962d = iVar2.c(f10);
        }
    }

    public void h(p pVar, p pVar2, float f10) {
        if (pVar != null) {
            this.f237961c = pVar.c(f10);
        }
        if (pVar2 != null) {
            this.f237962d = pVar2.c(f10);
        }
    }
}
