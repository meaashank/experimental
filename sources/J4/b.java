package J4;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f53172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f53173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f53174c = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f53175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53176e;

    public b(float f10, float f11, float[] fArr) {
        f(f10, f11, fArr);
    }

    public int a() {
        return this.f53176e;
    }

    public float[] b() {
        return this.f53174c;
    }

    public float[] c(float f10) {
        if (this.f53175d == null) {
            this.f53175d = (float[]) this.f53174c.clone();
        }
        float[] fArr = this.f53175d;
        float[] fArr2 = this.f53174c;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = f10;
        return fArr;
    }

    public float d() {
        return this.f53172a;
    }

    public float e() {
        return this.f53173b;
    }

    public void f(float f10, float f11, float[] fArr) {
        this.f53172a = f10;
        this.f53173b = f11;
        float[] fArr2 = this.f53174c;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        this.f53176e = Color.HSVToColor(fArr2);
    }

    public double g(float f10, float f11) {
        double d10 = this.f53172a - f10;
        double d11 = this.f53173b - f11;
        return (d11 * d11) + (d10 * d10);
    }
}
