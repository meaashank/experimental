package L4;

import K4.d;
import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
public class d extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f58643d = new d.b().f58415a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f58644e = new float[3];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f58645f = 1.2f;

    @Override // L4.c
    public void d() {
        int size = this.f58634c.size();
        float f10 = 2.0f;
        float width = this.f58633b.f58641g.getWidth() / 2.0f;
        b bVar = this.f58633b;
        int i10 = bVar.f58635a;
        float f11 = bVar.f58638d;
        float f12 = bVar.f58636b;
        float f13 = bVar.f58637c;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            float f14 = i11;
            float f15 = i10;
            float f16 = (f14 / (i10 - 1)) * f12;
            float fMax = Math.max(1.5f + f11, (i11 == 0 ? 0.0f : ((f14 - (f15 / f10)) / f15) * this.f58645f * f13) + f13);
            int iMin = Math.min(e(f16, fMax), i10 * 2);
            int i13 = 0;
            while (i13 < iMin) {
                float f17 = f13;
                int i14 = i11;
                double d10 = iMin;
                float f18 = width;
                double d11 = ((3.141592653589793d / d10) * ((double) ((i14 + 1) % 2))) + ((((double) i13) * 6.283185307179586d) / d10);
                double d12 = f16;
                float fCos = f18 + ((float) (Math.cos(d11) * d12));
                float fSin = f18 + ((float) (Math.sin(d11) * d12));
                float[] fArr = this.f58644e;
                fArr[0] = (float) ((d11 * 180.0d) / 3.141592653589793d);
                fArr[1] = f16 / f12;
                fArr[2] = this.f58633b.f58640f;
                this.f58643d.setColor(Color.HSVToColor(fArr));
                this.f58643d.setAlpha(f());
                this.f58633b.f58641g.drawCircle(fCos, fSin, fMax - f11, this.f58643d);
                if (i12 >= size) {
                    this.f58634c.add(new J4.b(fCos, fSin, this.f58644e));
                } else {
                    this.f58634c.get(i12).f(fCos, fSin, this.f58644e);
                }
                i12++;
                i13++;
                i11 = i14;
                f13 = f17;
                width = f18;
            }
            i11++;
            f10 = 2.0f;
        }
    }
}
