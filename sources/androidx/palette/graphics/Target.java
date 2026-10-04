package androidx.palette.graphics;

import androidx.annotation.NonNull;
import e.InterfaceC4348w;

/* JADX INFO: loaded from: classes2.dex */
public final class Target {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Target f115375A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Target f115376B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Target f115377C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Target f115378D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f115379e = 0.26f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f115380f = 0.45f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f115381g = 0.55f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f115382h = 0.74f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f115383i = 0.3f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f115384j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f115385k = 0.7f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f115386l = 0.3f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f115387m = 0.4f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f115388n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f115389o = 0.35f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f115390p = 0.24f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f115391q = 0.52f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f115392r = 0.24f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f115393s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f115394t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f115395u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f115396v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f115397w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f115398x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Target f115399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Target f115400z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f115401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f115402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f115403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f115404d;

    static {
        Target target = new Target();
        f115399y = target;
        m(target);
        p(target);
        Target target2 = new Target();
        f115400z = target2;
        o(target2);
        p(target2);
        Target target3 = new Target();
        f115375A = target3;
        l(target3);
        p(target3);
        Target target4 = new Target();
        f115376B = target4;
        m(target4);
        n(target4);
        Target target5 = new Target();
        f115377C = target5;
        o(target5);
        n(target5);
        Target target6 = new Target();
        f115378D = target6;
        l(target6);
        n(target6);
    }

    public Target() {
        float[] fArr = new float[3];
        this.f115401a = fArr;
        float[] fArr2 = new float[3];
        this.f115402b = fArr2;
        this.f115403c = new float[3];
        this.f115404d = true;
        r(fArr);
        r(fArr2);
        q();
    }

    public static void l(Target target) {
        float[] fArr = target.f115402b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public static void m(Target target) {
        float[] fArr = target.f115402b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void n(Target target) {
        float[] fArr = target.f115401a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void o(Target target) {
        float[] fArr = target.f115402b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    public static void p(Target target) {
        float[] fArr = target.f115401a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    public static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.f115403c[1];
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public float b() {
        return this.f115402b[2];
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public float c() {
        return this.f115401a[2];
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public float d() {
        return this.f115402b[0];
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public float e() {
        return this.f115401a[0];
    }

    public float f() {
        return this.f115403c[2];
    }

    public float g() {
        return this.f115403c[0];
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public float h() {
        return this.f115402b[1];
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public float i() {
        return this.f115401a[1];
    }

    public boolean j() {
        return this.f115404d;
    }

    public void k() {
        int length = this.f115403c.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = this.f115403c[i10];
            if (f11 > 0.0f) {
                f10 += f11;
            }
        }
        if (f10 != 0.0f) {
            int length2 = this.f115403c.length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArr = this.f115403c;
                float f12 = fArr[i11];
                if (f12 > 0.0f) {
                    fArr[i11] = f12 / f10;
                }
            }
        }
    }

    public final void q() {
        float[] fArr = this.f115403c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    public static final class Builder {
        private final Target mTarget;

        public Builder() {
            this.mTarget = new Target();
        }

        @NonNull
        public Target build() {
            return this.mTarget;
        }

        @NonNull
        public Builder setExclusive(boolean z10) {
            this.mTarget.f115404d = z10;
            return this;
        }

        @NonNull
        public Builder setLightnessWeight(@InterfaceC4348w(from = 0.0d) float f10) {
            this.mTarget.f115403c[1] = f10;
            return this;
        }

        @NonNull
        public Builder setMaximumLightness(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
            this.mTarget.f115402b[2] = f10;
            return this;
        }

        @NonNull
        public Builder setMaximumSaturation(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
            this.mTarget.f115401a[2] = f10;
            return this;
        }

        @NonNull
        public Builder setMinimumLightness(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
            this.mTarget.f115402b[0] = f10;
            return this;
        }

        @NonNull
        public Builder setMinimumSaturation(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
            this.mTarget.f115401a[0] = f10;
            return this;
        }

        @NonNull
        public Builder setPopulationWeight(@InterfaceC4348w(from = 0.0d) float f10) {
            this.mTarget.f115403c[2] = f10;
            return this;
        }

        @NonNull
        public Builder setSaturationWeight(@InterfaceC4348w(from = 0.0d) float f10) {
            this.mTarget.f115403c[0] = f10;
            return this;
        }

        @NonNull
        public Builder setTargetLightness(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
            this.mTarget.f115402b[1] = f10;
            return this;
        }

        @NonNull
        public Builder setTargetSaturation(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
            this.mTarget.f115401a[1] = f10;
            return this;
        }

        public Builder(@NonNull Target target) {
            this.mTarget = new Target(target);
        }
    }

    public Target(@NonNull Target target) {
        float[] fArr = new float[3];
        this.f115401a = fArr;
        float[] fArr2 = new float[3];
        this.f115402b = fArr2;
        float[] fArr3 = new float[3];
        this.f115403c = fArr3;
        this.f115404d = true;
        System.arraycopy(target.f115401a, 0, fArr, 0, fArr.length);
        System.arraycopy(target.f115402b, 0, fArr2, 0, fArr2.length);
        System.arraycopy(target.f115403c, 0, fArr3, 0, fArr3.length);
    }
}
