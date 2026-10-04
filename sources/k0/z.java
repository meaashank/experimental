package k0;

import androidx.compose.animation.C1571b;
import l0.InterfaceC5130a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC5130a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f214341a;

    public z(float f10) {
        this.f214341a = f10;
    }

    public static z e(z zVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = zVar.f214341a;
        }
        zVar.getClass();
        return new z(f10);
    }

    @Override // l0.InterfaceC5130a
    public float a(float f10) {
        return f10 / this.f214341a;
    }

    @Override // l0.InterfaceC5130a
    public float b(float f10) {
        return f10 * this.f214341a;
    }

    public final float c() {
        return this.f214341a;
    }

    @NotNull
    public final z d(float f10) {
        return new z(f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f214341a, ((z) obj).f214341a) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f214341a);
    }

    @NotNull
    public String toString() {
        return C1571b.a(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f214341a, ')');
    }
}
