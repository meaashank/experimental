package B1;

import android.view.animation.Interpolator;
import androidx.compose.ui.graphics.colorspace.C2016d;
import i.C4541d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f12292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12293b;

    public d(float[] fArr) {
        this.f12292a = fArr;
        this.f12293b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f12292a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f12293b;
        float fA = C2016d.a(iMin, f11, f10, f11);
        float[] fArr2 = this.f12292a;
        float f12 = fArr2[iMin];
        return C4541d.a(fArr2[iMin + 1], f12, fA, f12);
    }
}
