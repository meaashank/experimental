package androidx.transition;

import android.animation.TypeEvaluator;
import i.C4541d;

/* JADX INFO: renamed from: androidx.transition.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2692d implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f117836a;

    public C2692d(float[] fArr) {
        this.f117836a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f10, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f117836a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i10 = 0; i10 < fArr3.length; i10++) {
            float f11 = fArr[i10];
            fArr3[i10] = C4541d.a(fArr2[i10], f11, f10, f11);
        }
        return fArr3;
    }
}
