package md;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: md.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5229e implements f<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f221132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f221133b;

    public C5229e(float f10, float f11) {
        this.f221132a = f10;
        this.f221133b = f11;
    }

    public boolean a(float f10) {
        return f10 >= this.f221132a && f10 <= this.f221133b;
    }

    @Override // md.g
    public Comparable b() {
        return Float.valueOf(this.f221132a);
    }

    @NotNull
    public Float c() {
        return Float.valueOf(this.f221133b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // md.f, md.g
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    @NotNull
    public Float d() {
        return Float.valueOf(this.f221132a);
    }

    public boolean e(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C5229e)) {
            return false;
        }
        if (isEmpty() && ((C5229e) obj).isEmpty()) {
            return true;
        }
        C5229e c5229e = (C5229e) obj;
        return this.f221132a == c5229e.f221132a && this.f221133b == c5229e.f221133b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // md.f
    public /* bridge */ /* synthetic */ boolean g(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    @Override // md.g
    public Comparable h() {
        return Float.valueOf(this.f221133b);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.floatToIntBits(this.f221133b) + (Float.floatToIntBits(this.f221132a) * 31);
    }

    @Override // md.f, md.g
    public boolean isEmpty() {
        return this.f221132a > this.f221133b;
    }

    @NotNull
    public String toString() {
        return this.f221132a + ".." + this.f221133b;
    }
}
