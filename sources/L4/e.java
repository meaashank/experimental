package L4;

import K4.d;
import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
public class e extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f58646d = new d.b().f58415a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f58647e = new float[3];

    @Override // L4.c
    public void d() {
        int size = this.f58634c.size();
        float width = this.f58633b.f58641g.getWidth() / 2.0f;
        b bVar = this.f58633b;
        int i10 = bVar.f58635a;
        float f10 = bVar.f58636b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = (i12 / (i10 - 1)) * f10;
            float f12 = this.f58633b.f58637c;
            int iE = e(f11, f12);
            int i13 = 0;
            while (i13 < iE) {
                double d10 = iE;
                float f13 = width;
                float f14 = f10;
                double d11 = ((3.141592653589793d / d10) * ((double) ((i12 + 1) % 2))) + ((((double) i13) * 6.283185307179586d) / d10);
                double d12 = f11;
                float fCos = f13 + ((float) (Math.cos(d11) * d12));
                float fSin = f13 + ((float) (Math.sin(d11) * d12));
                float[] fArr = this.f58647e;
                fArr[0] = (float) ((d11 * 180.0d) / 3.141592653589793d);
                fArr[1] = f11 / f14;
                fArr[2] = this.f58633b.f58640f;
                this.f58646d.setColor(Color.HSVToColor(fArr));
                this.f58646d.setAlpha(f());
                b bVar2 = this.f58633b;
                bVar2.f58641g.drawCircle(fCos, fSin, f12 - bVar2.f58638d, this.f58646d);
                if (i11 >= size) {
                    this.f58634c.add(new J4.b(fCos, fSin, this.f58647e));
                } else {
                    this.f58634c.get(i11).f(fCos, fSin, this.f58647e);
                }
                i11++;
                i13++;
                width = f13;
                f10 = f14;
            }
        }
    }
}
