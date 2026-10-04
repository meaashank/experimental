package md;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements r<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f221160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f221161b;

    public q(float f10, float f11) {
        this.f221160a = f10;
        this.f221161b = f11;
    }

    private final boolean e(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean a(float f10) {
        return f10 >= this.f221160a && f10 < this.f221161b;
    }

    @Override // md.r
    public Comparable b() {
        return Float.valueOf(this.f221160a);
    }

    @NotNull
    public Float c() {
        return Float.valueOf(this.f221161b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // md.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    @NotNull
    public Float d() {
        return Float.valueOf(this.f221160a);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        if (isEmpty() && ((q) obj).isEmpty()) {
            return true;
        }
        q qVar = (q) obj;
        return this.f221160a == qVar.f221160a && this.f221161b == qVar.f221161b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.floatToIntBits(this.f221161b) + (Float.floatToIntBits(this.f221160a) * 31);
    }

    @Override // md.r
    public Comparable i() {
        return Float.valueOf(this.f221161b);
    }

    @Override // md.r
    public boolean isEmpty() {
        return this.f221160a >= this.f221161b;
    }

    @NotNull
    public String toString() {
        return this.f221160a + "..<" + this.f221161b;
    }
}
