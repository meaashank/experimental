package l0;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.r;
import e.f0;
import java.util.Arrays;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@r(parameters = 0)
public final class C5132c implements InterfaceC5130a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f220904c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f220905d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final float[] f220906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final float[] f220907b;

    /* JADX INFO: renamed from: l0.c$a */
    public static final class a {
        public a() {
        }

        public final float b(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float fA;
            float fAbs = Math.abs(f10);
            float fSignum = Math.signum(f10);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fA = fArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                int i11 = i10 - 1;
                float f14 = 0.0f;
                if (i11 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return (f16 / f15) * f10;
                }
                if (i11 == -1) {
                    f11 = fArr[0];
                    f13 = fArr2[0];
                    f12 = 0.0f;
                } else {
                    f14 = fArr[i11];
                    f11 = fArr[i10];
                    f12 = fArr2[i11];
                    f13 = fArr2[i10];
                }
                fA = C5133d.f220908a.a(f12, f13, f14, f11, fAbs);
            }
            return fSignum * fA;
        }

        public a(C4969v c4969v) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C5132c(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f220906a = fArr;
        this.f220907b = fArr2;
    }

    @Override // l0.InterfaceC5130a
    public float a(float f10) {
        return f220904c.b(f10, this.f220907b, this.f220906a);
    }

    @Override // l0.InterfaceC5130a
    public float b(float f10) {
        return f220904c.b(f10, this.f220906a, this.f220907b);
    }

    @NotNull
    public final float[] c() {
        return this.f220906a;
    }

    @NotNull
    public final float[] e() {
        return this.f220907b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5132c)) {
            return false;
        }
        C5132c c5132c = (C5132c) obj;
        return Arrays.equals(this.f220906a, c5132c.f220906a) && Arrays.equals(this.f220907b, c5132c.f220907b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f220907b) + (Arrays.hashCode(this.f220906a) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f220906a);
        G.o(string, "toString(this)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f220907b);
        G.o(string2, "toString(this)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }

    @f0
    public static /* synthetic */ void d() {
    }

    @f0
    public static /* synthetic */ void f() {
    }
}
