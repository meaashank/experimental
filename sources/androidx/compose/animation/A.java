package androidx.compose.animation;

import androidx.compose.runtime.InterfaceC1924k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87016c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f87017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.animation.core.U<Float> f87018b;

    public A(float f10, @NotNull androidx.compose.animation.core.U<Float> u10) {
        this.f87017a = f10;
        this.f87018b = u10;
    }

    public static A d(A a10, float f10, androidx.compose.animation.core.U u10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = a10.f87017a;
        }
        if ((i10 & 2) != 0) {
            u10 = a10.f87018b;
        }
        a10.getClass();
        return new A(f10, u10);
    }

    public final float a() {
        return this.f87017a;
    }

    @NotNull
    public final androidx.compose.animation.core.U<Float> b() {
        return this.f87018b;
    }

    @NotNull
    public final A c(float f10, @NotNull androidx.compose.animation.core.U<Float> u10) {
        return new A(f10, u10);
    }

    public final float e() {
        return this.f87017a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return Float.compare(this.f87017a, a10.f87017a) == 0 && kotlin.jvm.internal.G.g(this.f87018b, a10.f87018b);
    }

    @NotNull
    public final androidx.compose.animation.core.U<Float> f() {
        return this.f87018b;
    }

    public int hashCode() {
        return this.f87018b.hashCode() + (Float.floatToIntBits(this.f87017a) * 31);
    }

    @NotNull
    public String toString() {
        return "Fade(alpha=" + this.f87017a + ", animationSpec=" + this.f87018b + ')';
    }
}
