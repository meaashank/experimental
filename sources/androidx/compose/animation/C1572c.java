package androidx.compose.animation;

import i.C4541d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1572c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1572c f87555a = new C1572c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f87556b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final float[] f87557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final float[] f87558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87559e;

    /* JADX INFO: renamed from: androidx.compose.animation.c$a */
    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f87560c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f87561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f87562b;

        public a(float f10, float f11) {
            this.f87561a = f10;
            this.f87562b = f11;
        }

        public static a d(a aVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f87561a;
            }
            if ((i10 & 2) != 0) {
                f11 = aVar.f87562b;
            }
            aVar.getClass();
            return new a(f10, f11);
        }

        public final float a() {
            return this.f87561a;
        }

        public final float b() {
            return this.f87562b;
        }

        @NotNull
        public final a c(float f10, float f11) {
            return new a(f10, f11);
        }

        public final float e() {
            return this.f87561a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f87561a, aVar.f87561a) == 0 && Float.compare(this.f87562b, aVar.f87562b) == 0;
        }

        public final float f() {
            return this.f87562b;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f87562b) + (Float.floatToIntBits(this.f87561a) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
            sb2.append(this.f87561a);
            sb2.append(", velocityCoefficient=");
            return C1571b.a(sb2, this.f87562b, ')');
        }
    }

    static {
        float[] fArr = new float[101];
        f87557c = fArr;
        float[] fArr2 = new float[101];
        f87558d = fArr2;
        Y.b(fArr, fArr2, 100);
        f87559e = 8;
    }

    public final double a(float f10, float f11) {
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) f11));
    }

    @NotNull
    public final a b(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float fJ = md.u.J(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i10 = (int) (f13 * fJ);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f87557c;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            float fA = C4541d.a(fJ, f14, f17, f16);
            f11 = f17;
            f12 = fA;
        }
        return new a(f12, f11);
    }
}
