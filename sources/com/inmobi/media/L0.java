package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import i.C4541d;

/* JADX INFO: loaded from: classes5.dex */
public final class L0 extends Animation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f152182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f152183d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Camera f152186g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f152180a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f152181b = 90.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f152184e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f152185f = true;

    public L0(float f10, float f11) {
        this.f152182c = f10;
        this.f152183d = f11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation t10) {
        kotlin.jvm.internal.G.p(t10, "t");
        float f11 = this.f152180a;
        float fA = C4541d.a(this.f152181b, f11, f10, f11);
        float f12 = this.f152182c;
        float f13 = this.f152183d;
        Camera camera = this.f152186g;
        Matrix matrix = t10.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.f152185f) {
                camera.translate(0.0f, 0.0f, this.f152184e * f10);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f10) * this.f152184e);
            }
            camera.rotateY(fA);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f12, -f13);
        matrix.postTranslate(f12, f13);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        this.f152186g = new Camera();
    }
}
