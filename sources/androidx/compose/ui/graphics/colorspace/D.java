package androidx.compose.ui.graphics.colorspace;

import androidx.compose.animation.C1571b;
import e.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f100953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f100954b;

    public D(float f10, float f11) {
        this.f100953a = f10;
        this.f100954b = f11;
    }

    public static D d(D d10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = d10.f100953a;
        }
        if ((i10 & 2) != 0) {
            f11 = d10.f100954b;
        }
        d10.getClass();
        return new D(f10, f11);
    }

    public final float a() {
        return this.f100953a;
    }

    public final float b() {
        return this.f100954b;
    }

    @NotNull
    public final D c(float f10, float f11) {
        return new D(f10, f11);
    }

    public final float e() {
        return this.f100953a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return Float.compare(this.f100953a, d10.f100953a) == 0 && Float.compare(this.f100954b, d10.f100954b) == 0;
    }

    public final float f() {
        return this.f100954b;
    }

    @Y(3)
    @NotNull
    public final float[] g() {
        float f10 = this.f100953a;
        float f11 = this.f100954b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f100954b) + (Float.floatToIntBits(this.f100953a) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f100953a);
        sb2.append(", y=");
        return C1571b.a(sb2, this.f100954b, ')');
    }

    public D(float f10, float f11, float f12) {
        this(f10, f11, f12, f10 + f11 + f12);
    }

    public D(float f10, float f11, float f12, float f13) {
        this(f10 / f13, f11 / f13);
    }
}
