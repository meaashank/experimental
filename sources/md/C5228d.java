package md;

import androidx.compose.animation.core.C1618x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: md.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5228d implements f<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f221130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f221131b;

    public C5228d(double d10, double d11) {
        this.f221130a = d10;
        this.f221131b = d11;
    }

    public boolean a(double d10) {
        return d10 >= this.f221130a && d10 <= this.f221131b;
    }

    @Override // md.g
    public Comparable b() {
        return Double.valueOf(this.f221130a);
    }

    @NotNull
    public Double c() {
        return Double.valueOf(this.f221131b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // md.f, md.g
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    @NotNull
    public Double d() {
        return Double.valueOf(this.f221130a);
    }

    public boolean e(double d10, double d11) {
        return d10 <= d11;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C5228d)) {
            return false;
        }
        if (isEmpty() && ((C5228d) obj).isEmpty()) {
            return true;
        }
        C5228d c5228d = (C5228d) obj;
        return this.f221130a == c5228d.f221130a && this.f221131b == c5228d.f221131b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // md.f
    public /* bridge */ /* synthetic */ boolean g(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    @Override // md.g
    public Comparable h() {
        return Double.valueOf(this.f221131b);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return C1618x.a(this.f221131b) + (C1618x.a(this.f221130a) * 31);
    }

    @Override // md.f, md.g
    public boolean isEmpty() {
        return this.f221130a > this.f221131b;
    }

    @NotNull
    public String toString() {
        return this.f221130a + ".." + this.f221131b;
    }
}
